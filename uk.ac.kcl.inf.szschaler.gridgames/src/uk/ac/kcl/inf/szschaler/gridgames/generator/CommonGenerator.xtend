package uk.ac.kcl.inf.szschaler.gridgames.generator

import uk.ac.kcl.inf.szschaler.gridgames.gridGame.AlwaysExpression
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.CellSpecification
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.CellVarSpec
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.ContextExpression
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.CountExpression
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.EmptyExpression
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.FieldSpecification
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.FilterExpression
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.GridGame
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.NotEmptyExpression
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.StateFilterExpression

/**
 * Common generator bits.
 */
class CommonGenerator {
	protected ModelPreprocessor mpp
	protected val GridGame gg

	new(ModelPreprocessor mpp) {
		this.mpp = mpp
		gg = mpp.gridGame
	}

	def generateViewPackage() '''«gg.name».view'''

	def generateViewPackageFolder() '''«gg.name»/view'''

	def generateModelPackage() '''«gg.name».model'''

	def generateModelPackageFolder() '''«gg.name»/model'''

	def generateCellPackage() '''«generateModelPackage()».cells'''

	def generateCellPackageFolder() '''«generateModelPackageFolder()»/cells'''

	def generateFrameClassName() '''«gg.name.toFirstUpper»Frame'''

	def generateFieldClassName() '''«gg.name.toFirstUpper»Field'''

	def generateFieldClassFileName() '''«generateModelPackageFolder»/«generateFieldClassName()».java'''

	def generateCellClassFileName() '''«generateCellPackageFolder»/Cell.java'''

	def generateFactoryClassFileName() '''«generateCellPackageFolder»/CellFactory.java'''

	def generateCellClassName(CellSpecification c) { generateCellClassName(c.name) }

	def generateCellClassName(String c) '''«c.toFirstUpper»Cell'''

	def generateCellClassFileName(CellSpecification c) '''«generateCellPackageFolder»/«c.generateCellClassName».java'''

	def generateFrameClassFileName() '''«generateViewPackageFolder»/«generateFrameClassName()».java'''

	def generateCellFactoryMethodName(CellSpecification c) '''create«c.name.toFirstUpper»Field'''

	def generateFieldInitialiserName(FieldSpecification f) '''initialise«f.name.toFirstUpper»Field'''
	
	def generateVariableName(CellVarSpec v) '''«v.name.toFirstLower»Variable'''
	
	def dispatch CharSequence generateFor(ContextExpression ce) '''context.«ce.sub_exp.join(".", [se | se.generateFor])»'''
	
	def dispatch CharSequence generateFor(FilterExpression fe) '''«fe.generateMethodName»()'''
	
	def CharSequence generateMethodName (FilterExpression fe) '''filter«fe.cell_type.join("Or", [ct | ct.name.toFirstUpper])»'''
	
	def dispatch CharSequence generateFor(StateFilterExpression sfe) '''«sfe.generateMethodName»()'''
	
	def CharSequence generateMethodName (StateFilterExpression sfe) '''inState«sfe.cell_state.join ("Or", [cs | cs.name.toFirstUpper])»'''

	def dispatch CharSequence generateFor(CountExpression ce) '''size()«if (ce.op !== null) {'''«ce.op» «ce.cmpVal»'''}»'''

	def dispatch CharSequence generateFor(NotEmptyExpression nee) '''notEmpty()'''

	def dispatch CharSequence generateFor(EmptyExpression ee) '''empty()'''

	def dispatch CharSequence generateFor(AlwaysExpression ae) '''always()'''
}

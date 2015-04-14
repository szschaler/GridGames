package uk.ac.kcl.inf.zschaler.gridgames.generator

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame

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
}
package uk.ac.kcl.inf.zschaler.gridgames.generator

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification

/**
 * Common generator bits.
 */
class CommonGenerator {
	protected val GridGame gg;

	new(GridGame gg) {
		this.gg = gg
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

	def generateCellClassName(CellSpecification c) {generateCellClassName(c.name)}
	def generateCellClassName(String c) '''«c.toFirstUpper»Cell'''

	def generateCellClassFileName(CellSpecification c) '''«generateCellPackageFolder»/«c.generateCellClassName».java'''

	def generateFrameClassFileName() '''«generateViewPackageFolder»/«generateFrameClassName()».java'''
	
	def generateCellFactoryMethodName (String cellName) '''create«cellName.toFirstUpper»Field'''
	
	def generateFieldInitialiserName (FieldSpecification f) '''initialise«f.name.toFirstUpper»Field'''
}
package uk.ac.kcl.inf.zschaler.gridgames.generator

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame
import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification

/**
 * Generates all stuff to do with handling cells.
 */
class CellGenerator extends CommonGenerator {

	new(GridGame gg) {
		super(gg)
	}

	/**
	 * Basic generation routine.
	 */
	def generate(IFileSystemAccess fsa) {
		fsa.generateFile('''«generateCellClassFileName()»''', generateCellClass())
		gg.cells.forEach[c | fsa.generateFile('''«generateCellClassFileName(c)»''', generateCellClass(c))]
	}

	/**
	 * Generate the basic cell class. 
	 */
	def generateCellClass() '''
		package «generateCellPackage»;
		
		public abstract class Cell {
			
		}
	'''
	
	/**
	 * Generate code for the specified cell specification
	 */
	def generateCellClass(CellSpecification c) '''
		package «generateCellPackage»;
		
		public abstract class «c.name.toFirstUpper»Cell extends Cell {
			
		}
	'''
}
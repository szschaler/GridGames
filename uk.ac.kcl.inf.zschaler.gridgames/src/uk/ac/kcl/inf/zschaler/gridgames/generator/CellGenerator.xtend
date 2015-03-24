package uk.ac.kcl.inf.zschaler.gridgames.generator

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame
import org.eclipse.xtext.generator.IFileSystemAccess

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
	}

	def generateCellClass() '''
		package «generateCellPackage»;
		
		public class Cell {
			
		}
	'''
}
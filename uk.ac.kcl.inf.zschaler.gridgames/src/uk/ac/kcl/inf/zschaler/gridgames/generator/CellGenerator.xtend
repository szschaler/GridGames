package uk.ac.kcl.inf.zschaler.gridgames.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame

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
		gg.cells.forEach[c|fsa.generateFile('''«generateCellClassFileName(c)»''', generateCellClass(c))]
		fsa.generateFile('''«generateFactoryClassFileName»''', generateFactory)
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
		
		public class «c.generateCellClassName» extends Cell {
			
		}
	'''
	
	def generateFactory() '''
		package «generateCellPackage»;
			
		public class CellFactory {
			«gg.cells.join (" ", [c | c.generateFactoryMethod])»
		}
	'''
	
	def generateFactoryMethod (CellSpecification cs) '''
		public Cell «cs.name.generateCellFactoryMethodName»() {
			return new «cs.generateCellClassName»();
		}
	'''
}
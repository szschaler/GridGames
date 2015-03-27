package uk.ac.kcl.inf.zschaler.gridgames.generator

import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec
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

		gg.cells.forEach [ c |
			c.normalizeDisplayAnnotation
			fsa.generateFile('''«generateCellClassFileName(c)»''', generateCellClass(c))
		]

		fsa.generateFile('''«generateFactoryClassFileName»''', generateFactory)
	}

	/**
	 * Normalize display annotations for this cell specification. If there are no states, 
	 * but a display annotation, create an artifical default state moving the display annotation 
	 * over.
	 * 
	 * TODO Eventually might want to enable sharing of display annotations between a number of states.
	 */
	def void normalizeDisplayAnnotation(CellSpecification c) {
		if ((c.members.filter(CellStateSpec).empty) && 
			(!c.members.filter(CellDisplaySpec).empty)) {
			// Create a new state spec and move the display spec over
			var stateSpec = gg.eClass.EPackage.EFactoryInstance.create(gg.eClass.EPackage.EClassifiers.findFirst[ec | ec.name.equals ("CellStateSpec")] as EClass) as CellStateSpec
			var dummyState = gg.eClass.EPackage.EFactoryInstance.create(gg.eClass.EPackage.EClassifiers.findFirst[ec | ec.name.equals ("CellState")] as EClass) as CellState
			stateSpec.states.add(dummyState)
			c.members.add (stateSpec)
			dummyState.display = c.members.filter(CellDisplaySpec).findFirst[true]
			stateSpec.start = dummyState
		}
	}

	/**
	 * Generate the basic cell class. 
	 */
	def generateCellClass() '''
		package «generateCellPackage»;
		
		import javax.swing.JButton;
		import javax.swing.JLabel;
		
		import java.awt.Component;
		
		public abstract class Cell {
			public abstract Component formatUIRepresentation(JButton jb, JLabel jl);
			
			«gg.cells.join(" ", [c | '''public boolean is«c.name.toFirstUpper»() { return false; }'''])»
		}
	'''

	/**
	 * Generate code for the specified cell specification
	 */
	def generateCellClass(
		CellSpecification c
	) '''
		package «generateCellPackage»;
		
		import javax.swing.JButton;
		import javax.swing.JLabel;
		
		import java.awt.Component;
		
		public class «c.generateCellClassName» extends Cell {
			«c.members.filter(CellVarSpec).join(" ", [v | '''private «v.type» «v.generateVariableName»;'''])»
			
			public «c.generateCellClassName»(«c.members.filter(CellVarSpec).join(", ", [v | '''«v.type» «v.name.toFirstLower»'''])») {
				«c.members.filter(CellVarSpec).join("; ", [v | '''«v.generateVariableName» = «v.name.toFirstLower»;'''])»
			}
			
			@Override
			public Component formatUIRepresentation(JButton jb, JLabel jl) {
				«if (c.members.exists[m | m instanceof CellDisplaySpec]) {
					val d = c.members.findFirst[m | m instanceof CellDisplaySpec] as CellDisplaySpec
					if (d.display_type.equals ("button")) {
						'''
						jb.setText («d.generateTextCalculation»);
						return jb;
						'''
					} else {
						'''
						jl.setText («d.generateTextCalculation»);
						return jl;
						'''
					}
				} else {
					'''return jb;'''
				}»
			}
			
			@Override
			public boolean is«c.name.toFirstUpper»() {
				return true;
			}
		}
	'''

	def generateVariableName(CellVarSpec v) '''«v.name.toFirstLower»Variable'''

	def generateTextCalculation(CellDisplaySpec cds) {
		if (cds.text != null) '''"«cds.text»"''' else '''"" + «cds.^var.generateVariableName»'''
	}

	def generateFactory() '''
		package «generateCellPackage»;
			
		public class CellFactory {
			«gg.cells.join (" ", [c | c.generateFactoryMethod])»
		}
	'''

	def generateFactoryMethod(
		CellSpecification cs
	) '''
		public Cell «cs.generateCellFactoryMethodName»(«cs.members.filter(CellVarSpec).join(", ", [v | '''«v.type» «v.name»'''])») {
			return new «cs.generateCellClassName»(«cs.members.filter(CellVarSpec).join(", ", [v | v.name])»);
		}
	'''
}
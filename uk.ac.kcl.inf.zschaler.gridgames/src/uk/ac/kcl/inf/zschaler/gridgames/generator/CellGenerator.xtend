package uk.ac.kcl.inf.zschaler.gridgames.generator

import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalCellStateSpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateParamSpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StringValue
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.IntValue
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarRefValue

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
		if ((c.cellStates.empty) && (!c.members.filter(CellDisplaySpec).empty)) {
			// Create a new state spec and move the display spec over
			// TODO: There must be a simpler way of doing this
			var stateSpec = gg.eClass.EPackage.EFactoryInstance.create(gg.eClass.EPackage.EClassifiers.findFirst [ec |
				ec.name.equals("LocalCellStateSpec")
			] as EClass) as LocalCellStateSpec
			var dummyState = gg.eClass.EPackage.EFactoryInstance.create(gg.eClass.EPackage.EClassifiers.findFirst [ec |
				ec.name.equals("CellState")
			] as EClass) as CellState
			dummyState.name = "default";
			stateSpec.states.add(dummyState)
			c.members.add(stateSpec)
			dummyState.display = c.members.filter(CellDisplaySpec).findFirst[true]
			stateSpec.start = dummyState
		}
	}

	def getCellStates(CellSpecification c) {
		c.members.filter(CellStateSpec).map[css | css.allStates].flatten
	}
	
	def dispatch List<Pair<? extends Map<String, Value>, CellState>> getAllStates (LocalCellStateSpec lcss) {
		val symbols = Collections.emptyMap;
		lcss.states.map[s | new Pair(symbols, s)]
	}
	
	def dispatch List<Pair<? extends Map<String, Value>, CellState>> getAllStates (CellStateSpecReference cssr) {
		val symbols = new HashMap<String, Value>()
		// Put params into symbol table
		val iter = cssr.params.iterator
		cssr.stateSpec.params.forEach[p | 
			// TODO Should do a type check here
			symbols.put(p.name, iter.next)
		]
		cssr.stateSpec.states.map[s | new Pair(symbols, s)]
	}

	def getStartState(CellSpecification c) {
		c.members.filter(CellStateSpec).map[css | css.startState].findFirst[true]
	}
	
	def dispatch getStartState (LocalCellStateSpec lcss) {
		lcss.start
	}
	
	def dispatch getStartState (CellStateSpecReference cssr) {
		cssr.stateSpec.start
	}
	
	/**
	 * Generate the basic cell class. 
	 */
	def generateCellClass() '''
		package «generateCellPackage»;
		
		import javax.swing.JButton;
		import javax.swing.JLabel;
		
		import java.awt.Component;
		
		import «generateModelPackage».«generateFieldClassName»;
		
		public abstract class Cell {
			protected abstract class CellState {
				public abstract Component formatUIRepresentation(JButton jb, JLabel jl);
				public void handleMouseClick (boolean isLeft, int row, int col, «generateFieldClassName()» field) { }
			} 
			
			protected CellState currentState;
			
			public Component formatUIRepresentation(JButton jb, JLabel jl) {
				if (currentState != null) {
					return currentState.formatUIRepresentation(jb, jl);
				}
				else {
					return jb;
				}
			}
		
			public void handleMouseClick (boolean isLeft, int row, int col, «generateFieldClassName()» field) {
			currentState.handleMouseClick(isLeft, row, col, field);
			}
			
			«gg.cells.join(" ", [c | '''public boolean is«c.name.toFirstUpper»() { return false; }'''])»
		}
	'''

	/**
	 * Generate code for the specified cell specification
	 */
	def generateCellClass (CellSpecification c) '''
		package «generateCellPackage»;
		
		import javax.swing.JButton;
		import javax.swing.JLabel;
		
		import java.awt.Component;
		
		import «generateModelPackage».«generateFieldClassName»;
		
		public class «c.generateCellClassName» extends Cell {
			«c.members.filter(CellVarSpec).join(" ", [v | '''private «v.type» «v.generateVariableName»;'''])»
			
			public «c.generateCellClassName»(«c.members.filter(CellVarSpec).join(", ", [v | '''«v.type» «v.name.toFirstLower»'''])») {
				currentState = new «c.startState.name.toFirstUpper»CellState();
				
				«c.members.filter(CellVarSpec).join("; ", [v | '''«v.generateVariableName» = «v.name.toFirstLower»;'''])»
			}
			
			«c.cellStates.join (" ", [stateWithSymbols | stateWithSymbols.value.generateStateSpec (stateWithSymbols.key)])»
			
			@Override
			public boolean is«c.name.toFirstUpper»() {
				return true;
			}
		}
	'''

	def generateStateSpec(CellState cs, Map<String, Value> symbolTable) '''
		private class «cs.name.toFirstUpper»CellState extends CellState {
			@Override
			public Component formatUIRepresentation(JButton jb, JLabel jl) {
				«if (cs.display.display_type.equals ("button")) {
					'''
					jb.setText («cs.display.generateTextCalculation (symbolTable)»);
					return jb;
					'''
				 } else {
				 	'''
					jl.setText («cs.display.generateTextCalculation (symbolTable)»);
					return jl;
					'''
				}»
			}
			«if (!cs.transitions.empty) {
				'''
				
				public void handleMouseClick (boolean isLeft, int row, int col, «generateFieldClassName()» field) {
					«cs.transitions.join (" ", [t | '''
					if («if (t.trigger.equals("mouse-left")) {'''isLeft'''} else {'''!isLeft'''}») {
						currentState = new «t.target.name.toFirstUpper»CellState();
						field.fireTableCellUpdated(row, col);
					}
					'''])»
				}
				'''
			}»
		}
	'''

	def generateVariableName(CellVarSpec v) '''«v.name.toFirstLower»Variable'''

	def generateTextCalculation(CellDisplaySpec cds, Map<String, Value> symbolTable) {
		if (cds.text != null) '''"«cds.text»"''' else '''"" + «cds.^var.generateAccessCode (symbolTable)»'''
	}

	def dispatch CharSequence generateAccessCode (CellVarSpec cvs, Map<String, Value> symbolTable) {
		cvs.generateVariableName
	}

	def dispatch CharSequence generateAccessCode (StateParamSpec sps, Map<String, Value> symbolTable) {
		symbolTable.get (sps.name).generateAccessCode(symbolTable)
	}

	def dispatch CharSequence generateAccessCode (StringValue v, Map<String, Value> symbolTable) '''"«v.value»"'''
	def dispatch CharSequence generateAccessCode (IntValue v, Map<String, Value> symbolTable) '''«v.value»'''
	def dispatch CharSequence generateAccessCode (VarRefValue v, Map<String, Value> symbolTable) {
		v.ref.generateAccessCode (symbolTable)
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
package uk.ac.kcl.inf.zschaler.gridgames.generator

import java.util.Map
import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.IntValue
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ParamSpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StringValue
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarRefValue

/**
 * Generates all stuff to do with handling cells.
 */
class CellGenerator extends CommonGenerator {

	new(ModelPreprocessor mpp) {
		super(mpp)
	}

	/**
	 * Basic generation routine.
	 */
	def generate(IFileSystemAccess fsa) {
		fsa.generateFile('''«generateCellClassFileName()»''', generateCellClass())

		gg.cells.forEach [ c |
			fsa.generateFile('''«generateCellClassFileName(c)»''', generateCellClass(c))
		]

		fsa.generateFile('''«generateFactoryClassFileName»''', generateFactory)
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
			public abstract class CellState {
				public abstract Component formatUIRepresentation(JButton jb, JLabel jl);
				public void handleMouseClick (boolean isLeft, int row, int col, «generateFieldClassName()» field) { }
				public abstract int getStateID();
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
			
			public CellState getState() {
				return currentState;
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
				currentState = new «mpp.getStartState(c).name.toFirstUpper»CellState();
				
				«c.members.filter(CellVarSpec).join("; ", [v | '''«v.generateVariableName» = «v.name.toFirstLower»;'''])»
			}
			
			«mpp.getCellStates(c).join (" ", [stateWithIDAndSymbols | stateWithIDAndSymbols.key.generateStateSpec (stateWithIDAndSymbols.value)])»
			
			@Override
			public boolean is«c.name.toFirstUpper»() {
				return true;
			}
		}
	'''

	def generateStateSpec(CellState cs, Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) '''
		private class «cs.name.toFirstUpper»CellState extends CellState {
			@Override
			public Component formatUIRepresentation(JButton jb, JLabel jl) {
				«if (cs.display.display_type.equals ("button")) {
					'''
					jb.setText («cs.display.generateTextCalculation (idAndSymbolTable)»);
					return jb;
					'''
				 } else {
				 	'''
					jl.setText («cs.display.generateTextCalculation (idAndSymbolTable)»);
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
			
			@Override
			public int getStateID() {
				return «idAndSymbolTable.key»;
			}
		}
	'''

	def generateTextCalculation(CellDisplaySpec cds, Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) {
		if (cds.text != null) '''"«cds.text»"''' else '''"" + «cds.^var.generateAccessCode (idAndSymbolTable)»'''
	}

	def dispatch CharSequence generateAccessCode (CellVarSpec cvs, Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) {
		cvs.generateVariableName
	}

	def dispatch CharSequence generateAccessCode (ParamSpec sps, Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) {
		idAndSymbolTable.value.get (sps.name).generateAccessCode(idAndSymbolTable)
	}

	def dispatch CharSequence generateAccessCode (StringValue v, Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) '''"«v.value»"'''
	def dispatch CharSequence generateAccessCode (IntValue v, Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) '''«v.value»'''
	def dispatch CharSequence generateAccessCode (VarRefValue v, Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) {
		v.ref.generateAccessCode (idAndSymbolTable)
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
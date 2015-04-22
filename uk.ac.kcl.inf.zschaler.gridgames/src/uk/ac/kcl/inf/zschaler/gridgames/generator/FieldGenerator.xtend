package uk.ac.kcl.inf.zschaler.gridgames.generator

import java.util.Map
import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultInitialisation
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.IntValue
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.NotEmptyExpression
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ParamSpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StringValue
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarRefValue
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression

/**
 * Generates the field class.
 */
class FieldGenerator extends CommonGenerator {

	var CellContextGenerator ccg

	new(ModelPreprocessor mpp) {
		super(mpp)
		
		ccg = new CellContextGenerator (mpp)
	}

	def generate(IFileSystemAccess fsa) {
		fsa.generateFile('''«generateFieldClassFileName()»''', generateFieldModel());
	}

	def generateFieldModel() '''
	package «generateModelPackage()»;
	
	import javax.swing.table.AbstractTableModel;
		
	import «generateCellPackage».Cell;
	import «generateCellPackage».CellFactory;
	«generateImports»
	
	
	public class «generateFieldClassName()» extends AbstractTableModel {
		private int width, height;
		private Cell[][] field;
		private CellFactory cellFactory;
		
		/**
		 * Create a new field of the dimensions indicated.
		 * 
		    * @param width
		    * @param height
		    * @param cellFactory
		 */
		public «generateFieldClassName()»(CellFactory cellFactory) {
			super();
			this.cellFactory = cellFactory;
			«generateFieldInitialisation()»
			
			«if (!mpp.allStatesWithContextTriggers.empty) {
				'''
				addTableModelListener(new TableModelListener() {
					@Override
					public void tableChanged(TableModelEvent e) {
						if ((e.getFirstRow() != TableModelEvent.HEADER_ROW) && (e.getType() == TableModelEvent.UPDATE)) {
							// React to updates to a given cell by checking whether any context triggers need activating
							int firstRow = e.getFirstRow();
							int lastRow = e.getLastRow();
							int col = e.getColumn();

							for (int row = firstRow; row <= lastRow; row++) {
								if (col != TableModelEvent.ALL_COLUMNS) {
									handleStateChange (row, col);
								} else {
									for (col = 0; col < «generateFieldClassName()».this.getColumnCount(); col++) {
										handleStateChange (row, col);
									}
								}
							}
						}
					}
					
					private void handleStateChange (int row, int col) {
						«/* TODO Figure out how to deal with recursion (esp. where multiple sequential states have context triggers */»
						«val states = mpp.allStatesWithContextTriggers»
						«if (!states.empty) {
							'''
							for (CellContext.ContextElement ce : getContextAt(col, row)) {
								CellContext context = ce.getContextHere(); 
								switch (ce.getCell().getState().getStateID()) {
									«states.join (" ", [cpp | 
										'''case «cpp.value.value.key»:
											«cpp.value.key.transitions.filter[t | t.trigger instanceof ContextTrigger]
										                                             .join ("\n", [t | t.generateCodeForContextTrigger (cpp.key, cpp.value.value.value)])»
										   	break;'''])»
								}
							}
							'''
						}»
					}
				});
				'''
			}»
		}
		
		«gg.fields.join (" ", [f | generateFieldInitialiserFor(f)])»
		
		«ccg.generateCellContext»
		
		@Override
		public int getColumnCount() {
			return width;
		}
		
		@Override
		public int getRowCount() {
			return height;
		}
		
		@Override
		public Cell getValueAt(int row, int col) {
			if ((row >= 0) && (col >= 0) && (row < height) && (col < width)) {
				return field[col][row];
			} else {
				return null;
			}
		}
		
		@Override
		public Class<?> getColumnClass(int columnIndex) {
			return Cell.class;
		}
		
		@Override
		public void setValueAt(Object value, int row, int col) {
			field[col][row] = (Cell) value;
			fireTableCellUpdated(row, col);
		}
		
		public void handleClickAt (int row, int col, boolean isLeft) {
			getValueAt (row, col).handleMouseClick (isLeft, row, col, this);
		}
	}'''
	
	/**
	 * Generate implementation code for reaction to context trigger. Can assume t has a context trigger. 
	 * In the surrounding code, variable 'c' will refer to the currently checked cell.
	 * The generated code should start with an if-statement checking the trigger condition.
	 * 
	 * @param t the transition for which to generate code
	 * @param cs the cell containing the transition
	 * @param symbols symbols to resolve
	 */
	def CharSequence generateCodeForContextTrigger(TransitionSpec t, CellSpecification cs, Map<String, Value> symbols) {
		val trigger = t.trigger as ContextTrigger
		'''
		if («trigger.exp.generateFor») {
			ce.getCell().setState (
				((«cs.generateCellClassName») ce.getCell()).new «t.target.name.toFirstUpper»CellState(),
				ce.getRow(), ce.getCol(), 
				«generateFieldClassName».this);
		}
		'''
	}

	def generateImports() {
		val imports = gg.fields.map[f|mpp.allInitialisations(f).map[i|i.value.getImportsRequired(i.key)]].flatten.toSet

		ccg.addImports (imports)

		if (!mpp.allStatesWithContextTriggers.empty) { 
			imports.add("javax.swing.event.TableModelEvent")
			imports.add("javax.swing.event.TableModelListener")
			mpp.allStatesWithContextTriggers.forEach[p | 
				imports.add('''«generateCellPackage».«p.key.generateCellClassName»'''.toString)
			]
		}
		imports.filter[imp|!imp.equals("")].join("\n", [imp|'''import «imp»;'''])
	}

	def dispatch getImportsRequired(RandomInitialisation ri, Map<String, Value> symbols) {
		"java.util.Random"
	}

	def dispatch getImportsRequired(FieldInitialisation di, Map<String, Value> symbols) {
		""
	}

	def generateFieldInitialiserFor(FieldSpecification f) '''
		public final void «f.generateFieldInitialiserName»() {
			width = «f.width»;
			height = «f.height»;
			field = new Cell[width][height];
			«mpp.allInitialisations(f).join(" ", [i | i.value.generateInitCode(i.key)])»
			
			fireTableStructureChanged();
		}
	'''

	def dispatch generateInitCode(DefaultInitialisation dfi, Map<String, Value> symbols) '''
		// Fill the rest of the field with «dfi.cell.name» cells
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (field[x][y] == null) {
					field[x][y] = cellFactory.«dfi.cell.generateCellFactoryMethodName»();
				}
			}
		}
	'''

	def dispatch generateInitCode(RandomInitialisation rfi, Map<String, Value> symbols) '''
		// Randomly allocate «rfi.cell.name» cells
		{
			Random r = new Random();
		
			for (int i = 0; i < «rfi.getCountValue (symbols)»; i++) {
			boolean fSet = false;
			do {
				int x = r.nextInt(width);
				int y = r.nextInt(height);
		
					if (field[x][y] == null) {
			field[x][y] = cellFactory.«rfi.cell.generateCellFactoryMethodName»();
		
						fSet = true;
					}
				} while (!fSet);
			}
		}
	'''

	def getCountValue(RandomInitialisation rfi, Map<String, Value> symbols) {
		if (rfi.^var != null) {
			rfi.^var.generateAccessCode(symbols)
		} else {
			rfi.count
		}
	}

	def dispatch CharSequence generateAccessCode(CellVarSpec cvs, Map<String, Value> symbols) {
		cvs.generateVariableName
	}

	def dispatch CharSequence generateAccessCode(ParamSpec sps, Map<String, Value> symbols) {
		symbols.get(sps.name).generateAccessCode(symbols)
	}

	def dispatch CharSequence generateAccessCode(StringValue v, Map<String, Value> symbols) '''"«v.value»"'''

	def dispatch CharSequence generateAccessCode(IntValue v, Map<String, Value> symbols) '''«v.value»'''

	def dispatch CharSequence generateAccessCode(VarRefValue v, Map<String, Value> symbols) {
		v.ref.generateAccessCode(symbols)
	}

	def dispatch generateInitCode(ContextInitialisation ci, Map<String, Value> symbols) '''
		// Fill in «ci.cell.name» cells where appropriate because of context
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (field[x][y] == null) {
					CellContext context = getContextAt (x, y);
					if («ci.generateContextCheck») {
						field[x][y] = cellFactory.«ci.cell.generateCellFactoryMethodName»(«ci.generateValue»);
					}
				}
			}
		}
	'''

	def generateContextCheck(ContextInitialisation ci) {
		ci.check.generateFor
	}

	def generateValue(ContextInitialisation ci) {
		ci.exp.generateFor
	}

	def generateFieldInitialisation() {
		gg.options.filter(StartFieldDeclaration).join(" ", [o|'''initialise«o.field.name.toFirstUpper»Field();'''])

	}

	def dispatch CharSequence generateFor(ContextExpression ce) '''
		context.«ce.sub_exp.join(".", [se | se.generateFor])»
	'''

	def dispatch CharSequence generateFor(FilterExpression fe) '''filter«fe.cell_type.name.toFirstUpper»()'''
	
	def dispatch CharSequence generateFor(StateFilterExpression sfe) '''inState«sfe.cell_state.name.toFirstUpper»()'''

	def dispatch CharSequence generateFor(CountExpression ce) '''size()«if (ce.op != null) {'''«ce.op» «ce.cmpVal»'''}»'''

	def dispatch CharSequence generateFor(NotEmptyExpression nee) '''notEmpty()'''
}
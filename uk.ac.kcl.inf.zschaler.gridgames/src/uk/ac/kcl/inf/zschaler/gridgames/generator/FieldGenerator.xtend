package uk.ac.kcl.inf.zschaler.gridgames.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultInitialisation
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.NotEmptyExpression
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration

/**
 * Generates the field class.
 */
class FieldGenerator extends CommonGenerator {

	new(ModelPreprocessor mpp) {
		super(mpp)
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
		}
		
		«gg.fields.join (" ", [f | generateFieldInitialiserFor(f)])»
		
		«if (gg.fields.exists[f | f.field_initialisation.initialisations.exists[i | i instanceof ContextInitialisation]]) {
			// Generate helper functions for context initialisation
			'''
			private CellContext getContextAt (int x, int y) {
				return new CellContext(x, y);
			}

			private class CellContext {
				private ArrayList<Cell> al = new ArrayList<> (8);
				
				public CellContext (int x, int y) {
					for (int dx = -1; dx <= 1; dx ++) {
						for (int dy = -1; dy <= 1; dy++) {
							if (((dx != 0) || (dy != 0)) && 
							    ((x + dx >= 0) && (x + dx < width)) &&
							    ((y + dy >= 0) && (y + dy < height)) &&
							    (field[x + dx][y + dy] != null)) {
								al.add (field[x + dx][y + dy]);
							}
						}
					}
				}
				
				«// Slightly annoyingly have to convert the CharSequences into Strings here to make 
				 //sure the equality check in toSet works
				gg.contextExpInvocations.map[e | e.generateImplementation.toString].toSet.join(" ")»
			}
			'''
		}»
		
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
	
	def dispatch generateImplementation(FilterExpression fe) '''
		public CellContext filter«fe.cell_type.name.toFirstUpper»() {
			ArrayList<Cell> newAL = new ArrayList<>();
			
			for (Cell c : al) {
				if (c.is«fe.cell_type.name.toFirstUpper»()) {
					newAL.add (c);
				}
			}
			
			al = newAL;
			return this;
		}
	'''
	
	def dispatch generateImplementation(NotEmptyExpression nee) '''
		public boolean notEmpty() {
			return al.size() > 0;
		}
	'''
	
	def dispatch generateImplementation(CountExpression ce) '''
		public int size() {
			return al.size();
		}
	'''
	
	def getContextExpInvocations(GridGame gg) {
		gg.fields.map[f | 
			f.field_initialisation.initialisations.filter(ContextInitialisation).map[ci | 
				var checkExps = ci.check.sub_exp
				var valExps = ci.exp.sub_exp
				checkExps.toList.addAll (valExps)
				checkExps].flatten]
		  .flatten
	}

	def generateImports() {
		val imports = gg.fields.map[f|f.field_initialisation.initialisations.map[getImportsRequired]].flatten.toSet
		
		if (gg.fields.exists[f | f.field_initialisation.initialisations.exists[i | i instanceof ContextInitialisation]]) {
			imports.add("java.util.List")
			imports.add("java.util.ArrayList")			
		}
		
		imports.filter[imp | !imp.equals("")].join("\n", [ imp | '''import «imp»;'''])
	}

	def dispatch getImportsRequired(RandomInitialisation ri) {
		"java.util.Random"
	}

	def dispatch getImportsRequired(FieldInitialisation di) {
		""
	}
	
	def generateFieldInitialiserFor(FieldSpecification f) '''
		public final void «f.generateFieldInitialiserName»() {
			width = «f.width»;
			height = «f.height»;
			field = new Cell[width][height];
			«f.field_initialisation.initialisations.join(" ", [i | i.generateInitCode()])»
			
			fireTableStructureChanged();
		}
	'''

	def dispatch generateInitCode(DefaultInitialisation dfi) '''
		// Fill the rest of the field with «dfi.cell» cells
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (field[x][y] == null) {
					field[x][y] = cellFactory.«dfi.cell.generateCellFactoryMethodName»();
				}
			}
		}
	'''

	def dispatch generateInitCode(RandomInitialisation rfi) '''
		// Randomly allocate «rfi.cell» cells
		{
			Random r = new Random();
		
			for (int i = 0; i < «rfi.count»; i++) {
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

	def dispatch generateInitCode(ContextInitialisation ci) '''
	  // Fill in «ci.cell» cells where appropriate because of context
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
	
	def generateValue (ContextInitialisation ci) {
		ci.exp.generateFor
	}
	
	def generateFieldInitialisation() {
		gg.options.filter(StartFieldDeclaration).join(" ", [o|'''initialise«o.field.name.toFirstUpper»Field();'''])

	}
	
	def dispatch CharSequence generateFor (ContextExpression ce) '''
		context.«ce.sub_exp.join(".", [se | se.generateFor])»
	'''
	
	def dispatch CharSequence generateFor (FilterExpression fe) '''filter«fe.cell_type.name.toFirstUpper»()'''
	
	def dispatch CharSequence generateFor (CountExpression ce) '''size()'''
	
	def dispatch CharSequence generateFor (NotEmptyExpression nee)'''notEmpty()'''
}
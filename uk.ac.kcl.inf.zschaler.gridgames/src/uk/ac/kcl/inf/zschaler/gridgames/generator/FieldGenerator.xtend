package uk.ac.kcl.inf.zschaler.gridgames.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultInitialisation
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration

/**
 * Generates the field class.
 */
class FieldGenerator extends CommonGenerator {

	new(GridGame gg) {
		super(gg)
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
		
	}'''

	def generateImports() {
		gg.fields.map[f|f.field_initialisation.initialisations.map[getImportsRequired]]
			.flatten.toSet.filter[imp | !imp.equals("")]
			.join("\n", [ imp | '''import «imp»;'''])
	}

	def dispatch getImportsRequired(RandomInitialisation ri) {
		"java.util.Random"
	}

	def dispatch getImportsRequired(DefaultInitialisation di) {
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

	def generateFieldInitialisation() {
		gg.options.filter(StartFieldDeclaration).join(" ", [o|'''initialise«o.field_name.toFirstUpper»Field();'''])

	}

}
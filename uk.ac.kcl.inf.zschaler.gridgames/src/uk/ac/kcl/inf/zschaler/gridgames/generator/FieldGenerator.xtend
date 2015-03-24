package uk.ac.kcl.inf.zschaler.gridgames.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame

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
		public «generateFieldClassName()»(int width, int height, CellFactory cellFactory) {
			super();
			this.width = width;
			this.height = height;
			this.cellFactory = cellFactory;
			field = new Cell[width][height];
			initField();
		}
		
		private void initField() {
			«generateFieldInitialisation(gg)»
		}
		
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

	def generateFieldInitialisation(GridGame game) '''
		throw new UnsupportedOperationException("TODO: auto-generated method stub");
	'''

}
package GameOfLife.model;

import javax.swing.table.AbstractTableModel;
	
import GameOfLife.model.cells.Cell;
import GameOfLife.model.cells.CellFactory;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import GameOfLife.model.cells.CellCell;


public class GameOfLifeField extends AbstractTableModel {
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
	public GameOfLifeField(CellFactory cellFactory) {
		super();
		this.cellFactory = cellFactory;
		initialiseDfltField();
		
	}
	
	public final void initialiseDfltField() {
		width = 20;
		height = 20;
		field = new Cell[width][height];
		// Fill the rest of the field with Cell cells
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (field[x][y] == null) {
					field[x][y] = cellFactory.createCellField();
				}
			}
		}
		
		fireTableStructureChanged();
	}
	
	private CellContext getContextAt (int x, int y) {
		return new CellContext(x, y);
	}
	
	public class CellContext implements Iterable<CellContext.ContextElement> {
		public class ContextElement {
			private Cell cell;
			private int dx, dy;
			
			public ContextElement (int dx, int dy, Cell cell) {
				this.dx = dx; this.dy = dy;
				this.cell = cell;
			}
			
			public Cell getCell() {
				return cell;
			}
			
			public CellContext getContextHere() {
				return getContextAt (x + dx, y + dy);
			}
			
			public int getRow() {
				return y + dy;
			}
			
			public int getCol() {
				return x + dx;
			}
		}
		
		private ArrayList<ContextElement> al = new ArrayList<> (8);
		private int x, y; 
		
		public CellContext (int x, int y) {
			this.x = x; this.y = y;
			
			for (int dx = -1; dx <= 1; dx ++) {
				for (int dy = -1; dy <= 1; dy++) {
					if (((dx != 0) || (dy != 0)) && 
					    ((x + dx >= 0) && (x + dx < width)) &&
					    ((y + dy >= 0) && (y + dy < height)) &&
					    (field[x + dx][y + dy] != null)) {
						al.add (new ContextElement (dx, dy, field[x + dx][y + dy]));
					}
				}
			}
		}
		
		public Iterator<ContextElement> iterator() {
			return al.iterator();
		}
		
		public CellContext inStateAlive() {
			ArrayList<ContextElement> newAL = new ArrayList<>();
			
			for (ContextElement c : al) {
				switch (c.getCell().getState().getStateID()) {
					case 1: 
						newAL.add (c);
				}
			}
			
			al = newAL;
			return this;
		}
		 public int size() {
			return al.size();
		}
	}
	
	private class GenerationUpdater extends Thread {
		private boolean doRun = false;
		private long sleepTime = 1000;
		
		public GenerationUpdater() {
			start();
		}
		
		public void run() {
			try {
				while (true) {
					if (doRun) {
						// Compute a new generation
						Cell[][] newGeneration = new Cell[width][height];
						
						for (int x = 0; x < width; x++) {
							for (int y = 0; y < height; y++) {
								CellContext context = getContextAt(x, y);
								
								newGeneration[x][y] = field[x][y].computeNewGeneration (context);
							}
						}
						
						// Set the new generation
						field = newGeneration;
						fireTableDataChanged();
					}
					
					sleep(sleepTime);
				}
			}
			catch (InterruptedException ie) { }
		}
		
		public void doStart() {
			doRun = true;
		}
		
		public void doStop() {
			doRun = false;
		}
	}
	
	private GenerationUpdater updater = new GenerationUpdater();
	
	public void startGenerationComputation() {
		updater.doStart();
	}
	
	public void stopGenerationComputation() {
		updater.doStop();
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
	
	public void handleClickAt (int row, int col, boolean isLeft) {
		getValueAt (row, col).handleMouseClick (isLeft, row, col, this);
	}
}
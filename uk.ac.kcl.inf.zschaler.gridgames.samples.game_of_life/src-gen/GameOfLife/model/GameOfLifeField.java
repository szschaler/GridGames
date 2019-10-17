package GameOfLife.model;

import javax.swing.table.AbstractTableModel;
	
import GameOfLife.model.cells.Cell;
import GameOfLife.model.cells.CellFactory;
import java.util.ArrayList;
import java.util.List;
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
		return new LocalCellContext(x, y);
	}
	
	public CellContext getGlobalContext() {
		return new GlobalCellContext();
	}
	
	public interface CellContext extends Iterable<CellContext.ContextElement> {
		public interface ContextElement {
			public Cell getCell();
			public CellContext getContextHere();
			public int getRow();
			public int getCol();
		}
		
		/*
		 * Not ideal, should really be defined in AbstractCellContext, but Java won't let me do that...
		 */
		public interface ContextCreationStrategy {
			public List<ContextElement> getContextElements(CellContext context);
		}
		
		public CellContext inStateAlive();
		public int size();
		public boolean empty();
	}
	
	public abstract class AbstractCellContext implements CellContext {
		private List<CellContext.ContextElement> al;
		
		public AbstractCellContext (ContextCreationStrategy ccs) {
			this.al = ccs.getContextElements(this);
		}
		
		public Iterator<CellContext.ContextElement> iterator() {
			return al.iterator();
		}
		
		@Override
		public CellContext inStateAlive() {
			ArrayList<CellContext.ContextElement> newAL = new ArrayList<>();
			
			for (CellContext.ContextElement c : al) {
				switch (c.getCell().getState().getStateID()) {
					case 1: 
						newAL.add (c);
				}
			}
			
			al = newAL;
			return this;
		}
		 @Override
		public int size() {
			return al.size();
		}
		 @Override
		public boolean empty() {
			return al.size() == 0;
		}
	}
	
	public class LocalCellContext extends AbstractCellContext {
		public class ContextElement implements CellContext.ContextElement {
			private Cell cell;
			private int x, y;
			
			public ContextElement (int x, int y, Cell cell) {
				this.x = x; this.y = y;
				this.cell = cell;
			}
			
			@Override
			public Cell getCell() {
				return cell;
			}
			
			@Override
			public CellContext getContextHere() {
				return getContextAt (x, y);
			}
			
			@Override
			public int getRow() {
				return y;
			}
			
			@Override
			public int getCol() {
				return x;
			}
		}
		
		public LocalCellContext (final int x, final int y) {
			super (new ContextCreationStrategy() {
				
				@Override
				public List<CellContext.ContextElement> getContextElements(CellContext context) {
					ArrayList<CellContext.ContextElement> al = new ArrayList<>(8);
					
					for (int dx = -1; dx <= 1; dx ++) {
						for (int dy = -1; dy <= 1; dy++) {
							if (((dx != 0) || (dy != 0)) && 
							    ((x + dx >= 0) && (x + dx < width)) &&
							    ((y + dy >= 0) && (y + dy < height)) &&
							    (field[x + dx][y + dy] != null)) {
								al.add (((LocalCellContext) context).new ContextElement (x + dx, y + dy, field[x + dx][y + dy]));
							}
						}
					}
					
					return al;
				}
			});
		}
	}
	
	public class GlobalCellContext extends AbstractCellContext {
		public class ContextElement implements CellContext.ContextElement {
			private Cell cell;
			private int x, y;
			
			public ContextElement (int x, int y, Cell cell) {
				this.x = x; this.y = y;
				this.cell = cell;
			}
			
			@Override
			public Cell getCell() {
				return cell;
			}
			
			@Override
			public CellContext getContextHere() {
				return getContextAt (x, y);
			}
			
			@Override
			public int getRow() {
				return y;
			}
			
			@Override
			public int getCol() {
				return x;
			}
		}
		
		public GlobalCellContext() {
			super (new ContextCreationStrategy() {
				
				@Override
				public List<CellContext.ContextElement> getContextElements(CellContext context) {
					ArrayList<CellContext.ContextElement> al = new ArrayList<>(width * height);
					
					for (int x = 0; x < width; x ++) {
						for (int y = 0; y < height; y++) {
							al.add (((GlobalCellContext) context).new ContextElement (x, y, field[x][y]));
						}
					}
					
					return al;
				}
			});
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
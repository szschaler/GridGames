package minesweeper.model;

import javax.swing.table.AbstractTableModel;
	
import minesweeper.model.cells.Cell;
import minesweeper.model.cells.CellFactory;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import minesweeper.model.cells.BorderingMineCell;
import minesweeper.model.cells.MineCell;
import minesweeper.model.cells.EmptyCell;


public class MinesweeperField extends AbstractTableModel {
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
	public MinesweeperField(CellFactory cellFactory) {
		super();
		this.cellFactory = cellFactory;
		initialiseEasyField();
		
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
								for (col = 0; col < MinesweeperField.this.getColumnCount(); col++) {
									handleStateChange (row, col);
								}
							}
						}
					}
				}
				
				private void handleStateChange (int row, int col) {
					
					for (CellContext.ContextElement ce : getContextAt(col, row)) {
						CellContext context = ce.getContextHere(); 
						ce.getCell().setState (ce.getCell().getState().getContextBasedFollowState (ce.getContextHere()), ce.getRow(), ce.getCol(), MinesweeperField.this);
						/*
						switch (ce.getCell().getState().getStateID()) {
							case 3:
																	if (context.filterEmpty().inStateDiscovered().notEmpty()) {
																		ce.getCell().setState (
																			((BorderingMineCell) ce.getCell()).new DiscoveredCellState(),
																			ce.getRow(), ce.getCol(), 
																			MinesweeperField.this);
																	}
																   	break; case 6:
																	if (context.filterEmpty().inStateDiscovered().notEmpty()) {
																		ce.getCell().setState (
																			((MineCell) ce.getCell()).new DiscoveredCellState(),
																			ce.getRow(), ce.getCol(), 
																			MinesweeperField.this);
																	}
																   	break; case 0:
																	if (context.filterEmpty().inStateDiscovered().notEmpty()) {
																		ce.getCell().setState (
																			((EmptyCell) ce.getCell()).new DiscoveredCellState(),
																			ce.getRow(), ce.getCol(), 
																			MinesweeperField.this);
																	}
																   	break;
						}*/
					}
				}
			});
	}
	
	public final void initialiseEasyField() {
		width = 10;
		height = 10;
		field = new Cell[width][height];
		// Randomly allocate mine cells
		{
			Random r = new Random();
		
			for (int i = 0; i < 10; i++) {
			boolean fSet = false;
			do {
				int x = r.nextInt(width);
				int y = r.nextInt(height);
		
					if (field[x][y] == null) {
			field[x][y] = cellFactory.createMineField();
		
						fSet = true;
					}
				} while (!fSet);
			}
		}
		 // Fill in borderingMine cells where appropriate because of context
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (field[x][y] == null) {
					CellContext context = getContextAt (x, y);
					if (context.filterMine().notEmpty()) {
						field[x][y] = cellFactory.createBorderingMineField(context.filterMine().size());
					}
				}
			}
		}
		 // Fill the rest of the field with empty cells
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (field[x][y] == null) {
					field[x][y] = cellFactory.createEmptyField();
				}
			}
		}
		
		fireTableStructureChanged();
	}
	 public final void initialiseMediumField() {
		width = 20;
		height = 20;
		field = new Cell[width][height];
		// Randomly allocate mine cells
		{
			Random r = new Random();
		
			for (int i = 0; i < 15; i++) {
			boolean fSet = false;
			do {
				int x = r.nextInt(width);
				int y = r.nextInt(height);
		
					if (field[x][y] == null) {
			field[x][y] = cellFactory.createMineField();
		
						fSet = true;
					}
				} while (!fSet);
			}
		}
		 // Fill in borderingMine cells where appropriate because of context
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (field[x][y] == null) {
					CellContext context = getContextAt (x, y);
					if (context.filterMine().notEmpty()) {
						field[x][y] = cellFactory.createBorderingMineField(context.filterMine().size());
					}
				}
			}
		}
		 // Fill the rest of the field with empty cells
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (field[x][y] == null) {
					field[x][y] = cellFactory.createEmptyField();
				}
			}
		}
		
		fireTableStructureChanged();
	}
	 public final void initialiseHardField() {
		width = 30;
		height = 30;
		field = new Cell[width][height];
		// Randomly allocate mine cells
		{
			Random r = new Random();
		
			for (int i = 0; i < 30; i++) {
			boolean fSet = false;
			do {
				int x = r.nextInt(width);
				int y = r.nextInt(height);
		
					if (field[x][y] == null) {
			field[x][y] = cellFactory.createMineField();
		
						fSet = true;
					}
				} while (!fSet);
			}
		}
		 // Fill in borderingMine cells where appropriate because of context
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (field[x][y] == null) {
					CellContext context = getContextAt (x, y);
					if (context.filterMine().notEmpty()) {
						field[x][y] = cellFactory.createBorderingMineField(context.filterMine().size());
					}
				}
			}
		}
		 // Fill the rest of the field with empty cells
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (field[x][y] == null) {
					field[x][y] = cellFactory.createEmptyField();
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
		
		public CellContext filterMine() {
			ArrayList<ContextElement> newAL = new ArrayList<>();
			
			for (ContextElement c : al) {
				if (c.getCell().isMine()) {
					newAL.add (c);
				}
			}
			
			al = newAL;
			return this;
		}
		 public boolean notEmpty() {
			return al.size() > 0;
		}
		 public int size() {
			return al.size();
		}
		 public CellContext filterEmpty() {
			ArrayList<ContextElement> newAL = new ArrayList<>();
			
			for (ContextElement c : al) {
				if (c.getCell().isEmpty()) {
					newAL.add (c);
				}
			}
			
			al = newAL;
			return this;
		}
		 public CellContext inStateDiscovered() {
			ArrayList<ContextElement> newAL = new ArrayList<>();
			
			for (ContextElement c : al) {
				switch (c.getCell().getState().getStateID()) {
					case 5: 
					case 8: 
					case 2: 
						newAL.add (c);
				}
			}
			
			al = newAL;
			return this;
		}
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
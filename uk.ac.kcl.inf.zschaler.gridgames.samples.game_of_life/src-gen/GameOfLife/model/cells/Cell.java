package GameOfLife.model.cells;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Component;

import GameOfLife.model.GameOfLifeField;

public abstract class Cell {
	public static abstract class CellState {
		public abstract Component formatUIRepresentation(Cell cOwner, JButton jb, JLabel jl);
		public abstract int getStateID();
		public CellState getMouseBasedFollowState (boolean isLeft) { return this; }
		public abstract CellState getContextBasedFollowState (GameOfLifeField.CellContext context);
	} 
	
	protected CellState currentState;
	
	public Component formatUIRepresentation(JButton jb, JLabel jl) {
		if (currentState != null) {
			return currentState.formatUIRepresentation(this, jb, jl);
		}
		else {
			return jb;
		}
	}

	public void handleMouseClick (boolean isLeft, int row, int col, GameOfLifeField field) {
		setState (currentState.getMouseBasedFollowState (isLeft), row, col, field);
		
	}
	
	public CellState getState() {
		return currentState;
	}
	
	/**
	 * Change the state of this cell to the given one. Assume the cell is positioned at the given 
	 * coordinates in the given field and issue an update event for that field.
	 */
	public void setState (CellState csNewState, int row, int col, GameOfLifeField field) {
		if (currentState != csNewState) {
			currentState = csNewState;
			if (field != null) {
				field.fireTableCellUpdated(row, col);
			}
		}
	}
	
	public boolean isCell() { return false; }
	
	public abstract Cell computeNewGeneration(GameOfLifeField.CellContext context);
}

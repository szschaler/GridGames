package GameOfLife.model.cells;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Color;

import GameOfLife.model.GameOfLifeField;

public class CellCell extends Cell {
	
	public CellCell() {
		setState (new DeadCellState(), 0, 0, null);
		
	}
	
	public static class DeadCellState extends CellState {
		@Override
		public Component formatUIRepresentation(Cell cOwner, JButton jb, JLabel jl) {
			jl.setOpaque (false);
			jl.setText ("");
			return jl;
		}
		public CellState getMouseBasedFollowState (boolean isLeft) {
			if (isLeft) {
				return new AliveCellState();
			}
			return super.getMouseBasedFollowState (isLeft);
		}
		
		@Override
		public int getStateID() {
			return 0;
		}
	
		public CellState getContextBasedFollowState (GameOfLifeField.CellContext context) {
			if (context.inStateAlive().size()== 3) {
				return new AliveCellState();
			}
			return this;
		}
	}
	 public static class AliveCellState extends CellState {
		@Override
		public Component formatUIRepresentation(Cell cOwner, JButton jb, JLabel jl) {
			jl.setOpaque (true);
			jl.setBackground (Color.black);
			return jl;
		}
		public CellState getMouseBasedFollowState (boolean isLeft) {
			if (isLeft) {
				return new DeadCellState();
			}
			return super.getMouseBasedFollowState (isLeft);
		}
		
		@Override
		public int getStateID() {
			return 1;
		}
	
		public CellState getContextBasedFollowState (GameOfLifeField.CellContext context) {
			if (context.inStateAlive().size()< 2) {
				return new DeadCellState();
			}
			
			if (context.inStateAlive().size()> 3) {
				return new DeadCellState();
			}
			return this;
		}
	}
	
	@Override
	public boolean isCell() {
		return true;
	}
	
	private CellCell (CellState startAt) {
		currentState = startAt;
	}
	
	@Override
	public Cell computeNewGeneration(GameOfLifeField.CellContext context) {
		return new CellCell (currentState.getContextBasedFollowState (context));
	}
}

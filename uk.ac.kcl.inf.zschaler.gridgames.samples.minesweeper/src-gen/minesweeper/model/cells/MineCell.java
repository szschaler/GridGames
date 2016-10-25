package minesweeper.model.cells;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Color;

import minesweeper.model.MinesweeperField;

public class MineCell extends Cell {
	
	public MineCell() {
		setState (new HiddenCellState(), 0, 0, null);
		
	}
	
	public static class HiddenCellState extends CellState {
		@Override
		public Component formatUIRepresentation(Cell cOwner, JButton jb, JLabel jl) {
			jb.setBackground (new Color(0xdfdfdf));
			jb.setText ("");
			return jb;
		}
		public CellState getMouseBasedFollowState (boolean isLeft) {
			if (isLeft) {
				return new DiscoveredCellState();
			}
			 if (!isLeft) {
				return new FlaggedCellState();
			}
			return super.getMouseBasedFollowState (isLeft);
		}
		
		@Override
		public int getStateID() {
			return 6;
		}
	
		public CellState getContextBasedFollowState (MinesweeperField.CellContext context) {
			if (context.filter_empty().inStateDiscovered().notEmpty()) {
				return new DiscoveredCellState();
			}
			return this;
		}
	}
	 public static class FlaggedCellState extends CellState {
		@Override
		public Component formatUIRepresentation(Cell cOwner, JButton jb, JLabel jl) {
			jb.setBackground (new Color(0xdfdfdf));
			jb.setText ("F");
			return jb;
		}
		public CellState getMouseBasedFollowState (boolean isLeft) {
			if (isLeft) {
				return new DiscoveredCellState();
			}
			 if (!isLeft) {
				return new HiddenCellState();
			}
			return super.getMouseBasedFollowState (isLeft);
		}
		
		@Override
		public int getStateID() {
			return 7;
		}
	
		public CellState getContextBasedFollowState (MinesweeperField.CellContext context) {
			return this;
		}
	}
	 public static class DiscoveredCellState extends CellState {
		@Override
		public Component formatUIRepresentation(Cell cOwner, JButton jb, JLabel jl) {
			jl.setOpaque (false);
			jl.setText ("" + "M");
			return jl;
		}
		
		@Override
		public int getStateID() {
			return 8;
		}
	
		public CellState getContextBasedFollowState (MinesweeperField.CellContext context) {
			return this;
		}
	}
	
	@Override
	public boolean isMine() {
		return true;
	}
	
}

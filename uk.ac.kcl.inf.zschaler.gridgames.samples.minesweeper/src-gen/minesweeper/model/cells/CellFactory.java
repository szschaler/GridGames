package minesweeper.model.cells;
	
public class CellFactory {
	public Cell createEmptyField() {
		return new EmptyCell();
	}
	 public Cell createBorderingMineField(int number) {
		return new BorderingMineCell(number);
	}
	 public Cell createMineField() {
		return new MineCell();
	}
}

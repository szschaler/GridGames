package minesweeper.model.cells;
	
public class CellFactory {
	public Cell create_emptyField() {
		return new _emptyCell();
	}
	 public Cell createBorderingMineField(int number) {
		return new BorderingMineCell(number);
	}
	 public Cell createMineField() {
		return new MineCell();
	}
}

package GameOfLife.model.cells;
	
public class CellFactory {
	public Cell createCellField() {
		return new CellCell();
	}
}

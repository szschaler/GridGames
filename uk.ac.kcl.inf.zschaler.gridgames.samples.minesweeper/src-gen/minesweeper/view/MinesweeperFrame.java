package minesweeper.view;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.AbstractAction;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;

import javax.swing.table.TableCellRenderer;

import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Point;

import java.util.Enumeration;

import minesweeper.model.MinesweeperField;

import minesweeper.model.cells.CellFactory;
import minesweeper.model.cells.Cell;

public class MinesweeperFrame extends JFrame {
	private static class CellRenderer implements TableCellRenderer {
		private final JButton jb = new JButton();
		private final JLabel  jl = new JLabel();
		
		public CellRenderer() {
			// Ensure labels are shown even for relatively small-sized buttons
			jb.setMargin(new Insets(0, 0, 0, 0));
		}
		
		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
			if (value != null) {
				jb.getModel().setPressed(isSelected);
				return ((Cell) value).formatUIRepresentation(jb, jl);
			} else {
				jl.setText(" ");
				return jl;
			}
		}
	}
	
	private MinesweeperField field;
	private JTable jtDisplay;
	private static final int cellSize = 20;
	private boolean handlingInput = true;

	public MinesweeperFrame (CellFactory cellFactory) {
		super("Minesweeper");

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		field = new MinesweeperField (cellFactory);
		initWidgets();
	}

	private void initWidgets() {
		setLayout(new FlowLayout());
		setResizable(false);

		field.addTableModelListener(new TableModelListener() {
			@Override
			public void tableChanged(TableModelEvent e) {
				if (e.getFirstRow() == TableModelEvent.HEADER_ROW) {
					relayoutTable();
				} else if (e.getType() == TableModelEvent.UPDATE) {
					// React to updates to a given cell
					int firstRow = e.getFirstRow();
					int lastRow = e.getLastRow();
					// Fixing a stupid bug in abstract table model
					if (lastRow > field.getRowCount()) {
						lastRow = field.getRowCount();
					}
					
					int col = e.getColumn();

					for (int row = firstRow; row <= lastRow; row++) {
						if (col != TableModelEvent.ALL_COLUMNS) {
							handleStateChange (field.getValueAt(row, col));
						} else {
							for (col = 0; col < field.getColumnCount(); col++) {
								handleStateChange (field.getValueAt(row, col));								
							}
						}
					}
				}
			}
		});
		jtDisplay = new JTable(field);
		
		jtDisplay.setDefaultRenderer(Cell.class, new CellRenderer());

		jtDisplay.setRowHeight(cellSize);
		jtDisplay.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		jtDisplay.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jtDisplay.setCellSelectionEnabled(true);
		
		jtDisplay.addMouseListener (new MouseAdapter() {
			@Override
			public void mouseReleased (MouseEvent e) {
				if (!handlingInput) return;
				
				Point p = e.getPoint();
				int row = jtDisplay.rowAtPoint(p);
				int col = jtDisplay.columnAtPoint(p);
				
				field.handleClickAt (row, col, SwingUtilities.isLeftMouseButton(e));
			}
		});

		add(jtDisplay);
		
		JMenuBar jmb = new JMenuBar();
		setJMenuBar(jmb);
		
		JMenu jmFile = new JMenu("File");
		jmb.add(jmFile);
		
		jmFile.add(new JMenuItem(new AbstractAction("Easy") {
			@Override
			public void actionPerformed(ActionEvent e) {
				field.initialiseEasyField();
				handlingInput = true;
			}
		}));
		 jmFile.add(new JMenuItem(new AbstractAction("Medium") {
			@Override
			public void actionPerformed(ActionEvent e) {
				field.initialiseMediumField();
				handlingInput = true;
			}
		}));
		 jmFile.add(new JMenuItem(new AbstractAction("Hard") {
			@Override
			public void actionPerformed(ActionEvent e) {
				field.initialiseHardField();
				handlingInput = true;
			}
		}));
		
		
		jmFile.add(new JMenuItem(new AbstractAction("Exit") {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}));
		
		relayoutTable();
	}
	
	private void relayoutTable() {
		Enumeration<TableColumn> eCols = jtDisplay.getColumnModel().getColumns();
		while (eCols.hasMoreElements()) {
			TableColumn tc = eCols.nextElement();
			tc.setWidth(cellSize);
			tc.setPreferredWidth(cellSize);
			tc.setMaxWidth(cellSize);
			tc.setMinWidth(cellSize);
		}
		
		pack();
	}
	
	private void handleStateChange (Cell c) {
		switch (c.getState().getStateID()) {
			case 8:
												handlingInput = false;
												JOptionPane.showMessageDialog(MinesweeperFrame.this, "KA-BOOM!");
												break; case 5:
												break; case 2:
												break;
		}
	}
	
	public static void main(String[] args) {
		new MinesweeperFrame(new CellFactory()).setVisible(true);
	}
}

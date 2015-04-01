package uk.ac.kcl.inf.zschaler.gridgames.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.AllowRestartMenu

class FrameGenerator extends CommonGenerator {
	new(ModelPreprocessor mpp) {
		super(mpp)
	}

	def generate(IFileSystemAccess fsa) {
		fsa.generateFile('''«generateFrameClassFileName()»''', generateFrame());
	}

	def generateFrame() '''
		package «generateViewPackage»;
		
		import javax.swing.JFrame;
		import javax.swing.JTable;
		import javax.swing.ListSelectionModel;
		import javax.swing.event.TableModelEvent;
		import javax.swing.event.TableModelListener;
		import javax.swing.table.TableColumn;
		import javax.swing.JMenu;
		import javax.swing.JMenuBar;
		import javax.swing.JMenuItem;
		import javax.swing.AbstractAction;
		import javax.swing.JLabel;
		import javax.swing.JButton;
		import javax.swing.SwingUtilities;

		import javax.swing.table.TableCellRenderer;
		
		import java.awt.event.ActionEvent;
		import java.awt.FlowLayout;
		import java.awt.Component;
		import java.awt.Insets;
		import java.awt.event.MouseAdapter;
		import java.awt.event.MouseEvent;
		import java.awt.Point;
		
		import java.util.Enumeration;

		import «generateModelPackage».«generateFieldClassName»;
		
		import «generateCellPackage».CellFactory;
		import «generateCellPackage».Cell;
		
		public class «generateFrameClassName» extends JFrame {
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
			
			private «generateFieldClassName» field;
			private JTable jtDisplay;
			private static final int cellSize = 20;
		
			public «generateFrameClassName» (CellFactory cellFactory) {
				super("«gg.name.toFirstUpper»");
		
				setDefaultCloseOperation(EXIT_ON_CLOSE);
		
				field = new «generateFieldClassName» (cellFactory);
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
				
				«if (gg.options.exists[o | o instanceof AllowRestartMenu]) {
					gg.fields.join(" ", [f | '''
					jmFile.add(new JMenuItem(new AbstractAction("«f.name.toFirstUpper»") {
						@Override
						public void actionPerformed(ActionEvent e) {
							field.«f.generateFieldInitialiserName»();
						}
					}));
					'''])
				}»
				
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
			
			public static void main(String[] args) {
				new «generateFrameClassName»(new CellFactory()).setVisible(true);
			}
		}
	'''
}

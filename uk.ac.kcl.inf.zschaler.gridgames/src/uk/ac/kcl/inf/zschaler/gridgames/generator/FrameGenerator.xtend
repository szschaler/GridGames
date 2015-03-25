package uk.ac.kcl.inf.zschaler.gridgames.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.AllowRestartMenu
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame

class FrameGenerator extends CommonGenerator {
	new(GridGame gg) {
		super(gg)
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
		
		import java.awt.event.ActionEvent;
		import java.awt.FlowLayout;
		
		import java.util.Enumeration;
		
		import «generateModelPackage».«generateFieldClassName»;
		
		import «generateCellPackage».CellFactory;
		
		public class «generateFrameClassName» extends JFrame {
		
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
				
				//jtDisplay.setDefaultRenderer(Cell.class, new MineCellRenderer());
		
				jtDisplay.setRowHeight(cellSize);
				jtDisplay.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				jtDisplay.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				jtDisplay.setCellSelectionEnabled(true);
		
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

package uk.ac.kcl.inf.zschaler.gridgames.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame


class FrameGenerator extends CommonGenerator {
	new (GridGame gg) {
		super (gg)
	}
	
	def generate(IFileSystemAccess fsa) {
		fsa.generateFile('''«generateFrameClassFileName()»''', generateFrame());
	}
	
	def generateFrame() '''
	package «generateViewPackage»;
	
	import javax.swing.JFrame;
	import javax.swing.JTable;
	import javax.swing.ListSelectionModel;

	import java.awt.FlowLayout;

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

			jtDisplay = new JTable(field);
			//jtDisplay.setDefaultRenderer(Cell.class, new MineCellRenderer());

			jtDisplay.setRowHeight(cellSize);
			jtDisplay.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			jtDisplay.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			jtDisplay.setCellSelectionEnabled(true);

			add(jtDisplay);
		}

	}
	'''
}
package uk.ac.kcl.inf.zschaler.gridgames.generator;

import java.util.Arrays;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.zschaler.gridgames.generator.CommonGenerator;
import uk.ac.kcl.inf.zschaler.gridgames.generator.ModelPreprocessor;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.AllowRestartMenu;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.BehaviourReference;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateBehaviour;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.DirectBehaviour;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.EndGameBehaviour;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalAction;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.NoOpBehaviour;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.OptionSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value;

@SuppressWarnings("all")
public class FrameGenerator extends CommonGenerator {
  public FrameGenerator(final ModelPreprocessor mpp) {
    super(mpp);
  }
  
  public void generate(final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateFrameClassFileName = this.generateFrameClassFileName();
    _builder.append(_generateFrameClassFileName);
    fsa.generateFile(_builder.toString(), this.generateFrame());
  }
  
  public CharSequence generateFrame() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateViewPackage = this.generateViewPackage();
    _builder.append(_generateViewPackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javax.swing.JFrame;");
    _builder.newLine();
    _builder.append("import javax.swing.JTable;");
    _builder.newLine();
    _builder.append("import javax.swing.ListSelectionModel;");
    _builder.newLine();
    _builder.append("import javax.swing.event.TableModelEvent;");
    _builder.newLine();
    _builder.append("import javax.swing.event.TableModelListener;");
    _builder.newLine();
    _builder.append("import javax.swing.table.TableColumn;");
    _builder.newLine();
    _builder.append("import javax.swing.JMenu;");
    _builder.newLine();
    _builder.append("import javax.swing.JMenuBar;");
    _builder.newLine();
    _builder.append("import javax.swing.JMenuItem;");
    _builder.newLine();
    _builder.append("import javax.swing.JSeparator;");
    _builder.newLine();
    _builder.append("import javax.swing.AbstractAction;");
    _builder.newLine();
    _builder.append("import javax.swing.JLabel;");
    _builder.newLine();
    _builder.append("import javax.swing.JButton;");
    _builder.newLine();
    _builder.append("import javax.swing.SwingUtilities;");
    _builder.newLine();
    _builder.append("import javax.swing.JOptionPane;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.swing.table.TableCellRenderer;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.awt.event.ActionEvent;");
    _builder.newLine();
    _builder.append("import java.awt.FlowLayout;");
    _builder.newLine();
    _builder.append("import java.awt.Component;");
    _builder.newLine();
    _builder.append("import java.awt.Insets;");
    _builder.newLine();
    _builder.append("import java.awt.event.MouseAdapter;");
    _builder.newLine();
    _builder.append("import java.awt.event.MouseEvent;");
    _builder.newLine();
    _builder.append("import java.awt.Point;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.Enumeration;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    CharSequence _generateModelPackage = this.generateModelPackage();
    _builder.append(_generateModelPackage);
    _builder.append(".");
    CharSequence _generateFieldClassName = this.generateFieldClassName();
    _builder.append(_generateFieldClassName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    CharSequence _generateCellPackage = this.generateCellPackage();
    _builder.append(_generateCellPackage);
    _builder.append(".CellFactory;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    CharSequence _generateCellPackage_1 = this.generateCellPackage();
    _builder.append(_generateCellPackage_1);
    _builder.append(".Cell;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    CharSequence _generateFrameClassName = this.generateFrameClassName();
    _builder.append(_generateFrameClassName);
    _builder.append(" extends JFrame {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private static class CellRenderer implements TableCellRenderer {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private final JButton jb = new JButton();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private final JLabel  jl = new JLabel();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public CellRenderer() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// Ensure labels are shown even for relatively small-sized buttons");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("jb.setMargin(new Insets(0, 0, 0, 0));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (value != null) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("jb.getModel().setPressed(isSelected);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return ((Cell) value).formatUIRepresentation(jb, jl);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("jl.setText(\" \");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return jl;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    CharSequence _generateFieldClassName_1 = this.generateFieldClassName();
    _builder.append(_generateFieldClassName_1, "\t");
    _builder.append(" field;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private JTable jtDisplay;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final int cellSize = 20;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private boolean handlingInput = true;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    CharSequence _generateFrameClassName_1 = this.generateFrameClassName();
    _builder.append(_generateFrameClassName_1, "\t");
    _builder.append(" (CellFactory cellFactory) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(\"");
    String _firstUpper = StringExtensions.toFirstUpper(this.gg.getName());
    _builder.append(_firstUpper, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setDefaultCloseOperation(EXIT_ON_CLOSE);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("field = new ");
    CharSequence _generateFieldClassName_2 = this.generateFieldClassName();
    _builder.append(_generateFieldClassName_2, "\t\t");
    _builder.append(" (cellFactory);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("initWidgets();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void initWidgets() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setLayout(new FlowLayout());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setResizable(false);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("field.addTableModelListener(new TableModelListener() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void tableChanged(TableModelEvent e) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if (e.getFirstRow() == TableModelEvent.HEADER_ROW) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("relayoutTable();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("} else if (e.getType() == TableModelEvent.UPDATE) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("// React to updates to a given cell");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("int firstRow = e.getFirstRow();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("int lastRow = e.getLastRow();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("// Fixing a stupid bug in abstract table model");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("if (lastRow > field.getRowCount()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("lastRow = field.getRowCount();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("int col = e.getColumn();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("for (int row = firstRow; row <= lastRow; row++) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (col != TableModelEvent.ALL_COLUMNS) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("handleStateChange (field.getValueAt(row, col), (row == firstRow));");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (col = 0; col < field.getColumnCount(); col++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("handleStateChange (field.getValueAt(row, col), ((row == firstRow) && (col == 0)));\t\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("jtDisplay = new JTable(field);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("jtDisplay.setDefaultRenderer(Cell.class, new CellRenderer());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("jtDisplay.setRowHeight(cellSize);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("jtDisplay.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("jtDisplay.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("jtDisplay.setCellSelectionEnabled(true);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("jtDisplay.addMouseListener (new MouseAdapter() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void mouseReleased (MouseEvent e) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("if (!handlingInput) return;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("Point p = e.getPoint();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("int row = jtDisplay.rowAtPoint(p);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("int col = jtDisplay.columnAtPoint(p);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("field.handleClickAt (row, col, SwingUtilities.isLeftMouseButton(e));");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("add(jtDisplay);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JMenuBar jmb = new JMenuBar();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setJMenuBar(jmb);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JMenu jmFile = new JMenu(\"File\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("jmb.add(jmFile);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    String _xifexpression = null;
    final Function1<OptionSpecification, Boolean> _function = new Function1<OptionSpecification, Boolean>() {
      @Override
      public Boolean apply(final OptionSpecification o) {
        return Boolean.valueOf((o instanceof AllowRestartMenu));
      }
    };
    boolean _exists = IterableExtensions.<OptionSpecification>exists(this.gg.getOptions(), _function);
    if (_exists) {
      final Function1<FieldSpecification, CharSequence> _function_1 = new Function1<FieldSpecification, CharSequence>() {
        @Override
        public CharSequence apply(final FieldSpecification f) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("jmFile.add(new JMenuItem(new AbstractAction(\"");
          String _firstUpper = StringExtensions.toFirstUpper(f.getName());
          _builder.append(_firstUpper);
          _builder.append("\") {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void actionPerformed(ActionEvent e) {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("field.");
          CharSequence _generateFieldInitialiserName = FrameGenerator.this.generateFieldInitialiserName(f);
          _builder.append(_generateFieldInitialiserName, "\t\t");
          _builder.append("();");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("handlingInput = true;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("}));");
          _builder.newLine();
          return _builder.toString();
        }
      };
      _xifexpression = IterableExtensions.<FieldSpecification>join(this.gg.getFields(), " ", _function_1);
    }
    _builder.append(_xifexpression, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _xifexpression_1 = null;
    boolean _doGenerateGenerationalContexts = this.mpp.doGenerateGenerationalContexts();
    if (_doGenerateGenerationalContexts) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("jmFile.add (new JSeparator());");
      _builder_1.newLine();
      _builder_1.append("jmFile.add(new JMenuItem(new AbstractAction(\"Start\") {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("@Override");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void actionPerformed(ActionEvent e) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("field.startGenerationComputation();");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}));");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("jmFile.add(new JMenuItem(new AbstractAction(\"Stop\") {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("@Override");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void actionPerformed(ActionEvent e) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("field.stopGenerationComputation();");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}));");
      _builder_1.newLine();
      _builder_1.append("jmFile.add (new JSeparator());");
      _builder_1.newLine();
      _xifexpression_1 = _builder_1;
    }
    _builder.append(_xifexpression_1, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("jmFile.add(new JMenuItem(new AbstractAction(\"Exit\") {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void actionPerformed(ActionEvent e) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("System.exit(0);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("relayoutTable();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void relayoutTable() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Enumeration<TableColumn> eCols = jtDisplay.getColumnModel().getColumns();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while (eCols.hasMoreElements()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("TableColumn tc = eCols.nextElement();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("tc.setWidth(cellSize);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("tc.setPreferredWidth(cellSize);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("tc.setMaxWidth(cellSize);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("tc.setMinWidth(cellSize);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("pack();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void handleStateChange (Cell c, boolean firstNotification) {");
    _builder.newLine();
    _builder.append("\t\t");
    final Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> states = this.mpp.getAllStatesWithEnterActions();
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    CharSequence _xifexpression_2 = null;
    boolean _isEmpty = IterableExtensions.isEmpty(states);
    boolean _not = (!_isEmpty);
    if (_not) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("switch (c.getState().getStateID()) {");
      _builder_2.newLine();
      _builder_2.append("\t");
      final Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, CharSequence> _function_2 = new Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, CharSequence>() {
        @Override
        public CharSequence apply(final Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> cpp) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("case ");
          Integer _key = cpp.getValue().getKey();
          _builder.append(_key);
          _builder.append(":");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t\t\t\t\t");
          final Function1<CellStateBehaviour, CharSequence> _function = new Function1<CellStateBehaviour, CharSequence>() {
            @Override
            public CharSequence apply(final CellStateBehaviour oe) {
              return FrameGenerator.this.generateCodeFor(oe, cpp.getValue().getValue());
            }
          };
          String _join = IterableExtensions.<CellStateBehaviour>join(cpp.getKey().getOnEnter(), " ", _function);
          _builder.append(_join, "\t\t\t\t\t\t\t\t\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t\t\t\t\t");
          _builder.append("break;");
          return _builder.toString();
        }
      };
      String _join = IterableExtensions.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>join(states, " ", _function_2);
      _builder_2.append(_join, "\t");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("}");
      _builder_2.newLine();
      _xifexpression_2 = _builder_2;
    }
    _builder.append(_xifexpression_2, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    CharSequence _generateGlobalActionsCode = this.generateGlobalActionsCode();
    _builder.append(_generateGlobalActionsCode, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("new ");
    CharSequence _generateFrameClassName_2 = this.generateFrameClassName();
    _builder.append(_generateFrameClassName_2, "\t\t");
    _builder.append("(new CellFactory()).setVisible(true);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateGlobalActionsCode() {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = this.gg.getGlobalActions().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("if (firstNotification) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("final ");
        CharSequence _generateFieldClassName = this.generateFieldClassName();
        _builder.append(_generateFieldClassName, "\t");
        _builder.append(".CellContext context = field.getGlobalContext();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        final Function1<GlobalAction, CharSequence> _function = new Function1<GlobalAction, CharSequence>() {
          @Override
          public CharSequence apply(final GlobalAction ga) {
            return FrameGenerator.this.generateCodeFor(ga);
          }
        };
        String _join = IterableExtensions.<GlobalAction>join(this.gg.getGlobalActions(), "\n", _function);
        _builder.append(_join, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateCodeFor(final GlobalAction ga) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (");
    CharSequence _generateFor = this.generateFor(ga.getTrigger());
    _builder.append(_generateFor);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateCodeFor = this.generateCodeFor(ga.getBehaviour(), null);
    _builder.append(_generateCodeFor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateCodeFor(final EndGameBehaviour egb, final Map<String, Value> symbols) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _doGenerateGenerationalContexts = this.mpp.doGenerateGenerationalContexts();
      boolean _not = (!_doGenerateGenerationalContexts);
      if (_not) {
        _builder.append("handlingInput = false;");
        _builder.newLine();
      } else {
        _builder.append("field.stopGenerationComputation();");
        _builder.newLine();
      }
    }
    _builder.append("JOptionPane.showMessageDialog(");
    CharSequence _generateFrameClassName = this.generateFrameClassName();
    _builder.append(_generateFrameClassName);
    _builder.append(".this, \"");
    String _message = egb.getMessage();
    _builder.append(_message);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateCodeFor(final NoOpBehaviour nop, final Map<String, Value> symbols) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generateCodeFor(final BehaviourReference br, final Map<String, Value> symbols) {
    Value _get = symbols.get(br.getRef().getName());
    return this.generateCodeFor(((DirectBehaviour) _get), symbols);
  }
  
  public CharSequence generateCodeFor(final CellStateBehaviour egb, final Map<String, Value> symbols) {
    if (egb instanceof EndGameBehaviour) {
      return _generateCodeFor((EndGameBehaviour)egb, symbols);
    } else if (egb instanceof NoOpBehaviour) {
      return _generateCodeFor((NoOpBehaviour)egb, symbols);
    } else if (egb instanceof BehaviourReference) {
      return _generateCodeFor((BehaviourReference)egb, symbols);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(egb, symbols).toString());
    }
  }
}

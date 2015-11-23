package uk.ac.kcl.inf.zschaler.gridgames.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.zschaler.gridgames.generator.CellContextGenerator;
import uk.ac.kcl.inf.zschaler.gridgames.generator.CommonGenerator;
import uk.ac.kcl.inf.zschaler.gridgames.generator.ModelPreprocessor;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.IntValue;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.OptionSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ParamSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StringValue;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionTriggerSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarRefValue;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarSpec;

/**
 * Generates the field class.
 */
@SuppressWarnings("all")
public class FieldGenerator extends CommonGenerator {
  private CellContextGenerator ccg;
  
  public FieldGenerator(final ModelPreprocessor mpp) {
    super(mpp);
    CellContextGenerator _cellContextGenerator = new CellContextGenerator(mpp);
    this.ccg = _cellContextGenerator;
  }
  
  public void generate(final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateFieldClassFileName = this.generateFieldClassFileName();
    _builder.append(_generateFieldClassFileName, "");
    CharSequence _generateFieldModel = this.generateFieldModel();
    fsa.generateFile(_builder.toString(), _generateFieldModel);
  }
  
  public CharSequence generateFieldModel() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateModelPackage = this.generateModelPackage();
    _builder.append(_generateModelPackage, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javax.swing.table.AbstractTableModel;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("import ");
    CharSequence _generateCellPackage = this.generateCellPackage();
    _builder.append(_generateCellPackage, "");
    _builder.append(".Cell;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    CharSequence _generateCellPackage_1 = this.generateCellPackage();
    _builder.append(_generateCellPackage_1, "");
    _builder.append(".CellFactory;");
    _builder.newLineIfNotEmpty();
    String _generateImports = this.generateImports();
    _builder.append(_generateImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    CharSequence _generateFieldClassName = this.generateFieldClassName();
    _builder.append(_generateFieldClassName, "");
    _builder.append(" extends AbstractTableModel {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private int width, height;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Cell[][] field;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private CellFactory cellFactory;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Create a new field of the dimensions indicated.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("* @param width");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("* @param height");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("* @param cellFactory");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    CharSequence _generateFieldClassName_1 = this.generateFieldClassName();
    _builder.append(_generateFieldClassName_1, "\t");
    _builder.append("(CellFactory cellFactory) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.cellFactory = cellFactory;");
    _builder.newLine();
    _builder.append("\t\t");
    String _generateFieldInitialisation = this.generateFieldInitialisation();
    _builder.append(_generateFieldInitialisation, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _generateIncrementalContextTriggerListener = this.generateIncrementalContextTriggerListener();
    _builder.append(_generateIncrementalContextTriggerListener, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    EList<FieldSpecification> _fields = this.gg.getFields();
    final Function1<FieldSpecification, CharSequence> _function = new Function1<FieldSpecification, CharSequence>() {
      @Override
      public CharSequence apply(final FieldSpecification f) {
        return FieldGenerator.this.generateFieldInitialiserFor(f);
      }
    };
    String _join = IterableExtensions.<FieldSpecification>join(_fields, " ", _function);
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateCellContext = this.ccg.generateCellContext();
    _builder.append(_generateCellContext, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generateGenerationalContextTriggers = this.generateGenerationalContextTriggers();
    _builder.append(_generateGenerationalContextTriggers, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int getColumnCount() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return width;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int getRowCount() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return height;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Cell getValueAt(int row, int col) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if ((row >= 0) && (col >= 0) && (row < height) && (col < width)) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return field[col][row];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return null;");
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
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Class<?> getColumnClass(int columnIndex) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return Cell.class;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void setValueAt(Object value, int row, int col) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("field[col][row] = (Cell) value;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fireTableCellUpdated(row, col);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void handleClickAt (int row, int col, boolean isLeft) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("getValueAt (row, col).handleMouseClick (isLeft, row, col, this);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    return _builder;
  }
  
  public CharSequence generateGenerationalContextTriggers() {
    CharSequence _xifexpression = null;
    boolean _and = false;
    boolean _doGenerateGenerationalContexts = this.mpp.doGenerateGenerationalContexts();
    if (!_doGenerateGenerationalContexts) {
      _and = false;
    } else {
      Iterable<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> _allStatesWithContextTriggers = this.mpp.getAllStatesWithContextTriggers();
      boolean _isEmpty = IterableExtensions.isEmpty(_allStatesWithContextTriggers);
      boolean _not = (!_isEmpty);
      _and = _not;
    }
    if (_and) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("private class GenerationUpdater extends Thread {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private boolean doRun = false;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private long sleepTime = 1000;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public GenerationUpdater() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("start();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void run() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("try {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("while (true) {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("if (doRun) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("// Compute a new generation");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("Cell[][] newGeneration = new Cell[width][height];");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("for (int x = 0; x < width; x++) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("for (int y = 0; y < height; y++) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.append("CellContext context = getContextAt(x, y);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.append("newGeneration[x][y] = field[x][y].computeNewGeneration (context);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("// Set the new generation");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("field = newGeneration;");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("fireTableDataChanged();");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("sleep(sleepTime);");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("catch (InterruptedException ie) { }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void doStart() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("doRun = true;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void doStop() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("doRun = false;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("private GenerationUpdater updater = new GenerationUpdater();");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public void startGenerationComputation() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("updater.doStart();");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public void stopGenerationComputation() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("updater.doStop();");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public CharSequence generateIncrementalContextTriggerListener() {
    CharSequence _xifexpression = null;
    boolean _and = false;
    boolean _doGenerateGenerationalContexts = this.mpp.doGenerateGenerationalContexts();
    boolean _not = (!_doGenerateGenerationalContexts);
    if (!_not) {
      _and = false;
    } else {
      Iterable<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> _allStatesWithContextTriggers = this.mpp.getAllStatesWithContextTriggers();
      boolean _isEmpty = IterableExtensions.isEmpty(_allStatesWithContextTriggers);
      boolean _not_1 = (!_isEmpty);
      _and = _not_1;
    }
    if (_and) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t");
      _builder.append("addTableModelListener(new TableModelListener() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("public void tableChanged(TableModelEvent e) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if ((e.getFirstRow() != TableModelEvent.HEADER_ROW) && (e.getType() == TableModelEvent.UPDATE)) {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("// React to updates to a given cell by checking whether any context triggers need activating");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int firstRow = e.getFirstRow();");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int lastRow = e.getLastRow();");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("int col = e.getColumn();");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("for (int row = firstRow; row <= lastRow; row++) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("if (col != TableModelEvent.ALL_COLUMNS) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("handleStateChange (row, col);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("} else {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("for (col = 0; col < ");
      CharSequence _generateFieldClassName = this.generateFieldClassName();
      _builder.append(_generateFieldClassName, "\t\t\t\t\t\t");
      _builder.append(".this.getColumnCount(); col++) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.append("handleStateChange (row, col);");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
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
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("private void handleStateChange (int row, int col) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      final Iterable<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> states = this.mpp.getAllStatesWithContextTriggers();
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      CharSequence _xifexpression_1 = null;
      boolean _isEmpty_1 = IterableExtensions.isEmpty(states);
      boolean _not_2 = (!_isEmpty_1);
      if (_not_2) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("for (CellContext.ContextElement ce : getContextAt(col, row)) {");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("CellContext context = ce.getContextHere(); ");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("ce.getCell().setState (ce.getCell().getState().getContextBasedFollowState (ce.getContextHere()), ce.getRow(), ce.getCol(), ");
        CharSequence _generateFieldClassName_1 = this.generateFieldClassName();
        _builder_1.append(_generateFieldClassName_1, "\t");
        _builder_1.append(".this);");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("/*");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("switch (ce.getCell().getState().getStateID()) {");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        final Function1<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>, CharSequence> _function = new Function1<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>, CharSequence>() {
          @Override
          public CharSequence apply(final Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> cpp) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("case ");
            Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> _value = cpp.getValue();
            Pair<Integer, ? extends Map<String, Value>> _value_1 = _value.getValue();
            Integer _key = _value_1.getKey();
            _builder.append(_key, "");
            _builder.append(":");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t\t\t\t\t");
            Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> _value_2 = cpp.getValue();
            CellState _key_1 = _value_2.getKey();
            EList<TransitionSpec> _transitions = _key_1.getTransitions();
            final Function1<TransitionSpec, Boolean> _function = new Function1<TransitionSpec, Boolean>() {
              @Override
              public Boolean apply(final TransitionSpec t) {
                TransitionTriggerSpec _trigger = t.getTrigger();
                return Boolean.valueOf((_trigger instanceof ContextTrigger));
              }
            };
            Iterable<TransitionSpec> _filter = IterableExtensions.<TransitionSpec>filter(_transitions, _function);
            final Function1<TransitionSpec, CharSequence> _function_1 = new Function1<TransitionSpec, CharSequence>() {
              @Override
              public CharSequence apply(final TransitionSpec t) {
                CellSpecification _key = cpp.getKey();
                Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> _value = cpp.getValue();
                Pair<Integer, ? extends Map<String, Value>> _value_1 = _value.getValue();
                Map<String, Value> _value_2 = _value_1.getValue();
                return FieldGenerator.this.generateCodeForContextTrigger(t, _key, _value_2);
              }
            };
            String _join = IterableExtensions.<TransitionSpec>join(_filter, "\n", _function_1);
            _builder.append(_join, "\t\t\t\t\t\t\t\t\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t\t\t\t   \t");
            _builder.append("break;");
            return _builder.toString();
          }
        };
        String _join = IterableExtensions.<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>join(states, " ", _function);
        _builder_1.append(_join, "\t\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("}*/");
        _builder_1.newLine();
        _builder_1.append("}");
        _builder_1.newLine();
        _xifexpression_1 = _builder_1;
      }
      _builder.append(_xifexpression_1, "\t\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("});");
      _builder.newLine();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  /**
   * Generate implementation code for reaction to context trigger. Can assume t has a context trigger.
   * In the surrounding code, variable 'ce.getCell()' will refer to the currently checked cell.
   * The generated code should start with an if-statement checking the trigger condition.
   * 
   * @param t the transition for which to generate code
   * @param cs the cell containing the transition
   * @param symbols symbols to resolve
   */
  public CharSequence generateCodeForContextTrigger(final TransitionSpec t, final CellSpecification cs, final Map<String, Value> symbols) {
    CharSequence _xblockexpression = null;
    {
      TransitionTriggerSpec _trigger = t.getTrigger();
      final ContextTrigger trigger = ((ContextTrigger) _trigger);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if (");
      ContextExpression _exp = trigger.getExp();
      CharSequence _generateFor = this.generateFor(_exp);
      _builder.append(_generateFor, "");
      _builder.append(") {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("ce.getCell().setState (");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("((");
      CharSequence _generateCellClassName = this.generateCellClassName(cs);
      _builder.append(_generateCellClassName, "\t\t");
      _builder.append(") ce.getCell()).new ");
      CellState _target = t.getTarget();
      String _name = _target.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      _builder.append(_firstUpper, "\t\t");
      _builder.append("CellState(),");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("ce.getRow(), ce.getCol(), ");
      _builder.newLine();
      _builder.append("\t\t");
      CharSequence _generateFieldClassName = this.generateFieldClassName();
      _builder.append(_generateFieldClassName, "\t\t");
      _builder.append(".this);");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public String generateImports() {
    String _xblockexpression = null;
    {
      EList<FieldSpecification> _fields = this.gg.getFields();
      final Function1<FieldSpecification, List<String>> _function = new Function1<FieldSpecification, List<String>>() {
        @Override
        public List<String> apply(final FieldSpecification f) {
          List<Pair<Map<String, Value>, FieldInitialisation>> _allInitialisations = FieldGenerator.this.mpp.allInitialisations(f);
          final Function1<Pair<Map<String, Value>, FieldInitialisation>, String> _function = new Function1<Pair<Map<String, Value>, FieldInitialisation>, String>() {
            @Override
            public String apply(final Pair<Map<String, Value>, FieldInitialisation> i) {
              FieldInitialisation _value = i.getValue();
              Map<String, Value> _key = i.getKey();
              return FieldGenerator.this.getImportsRequired(_value, _key);
            }
          };
          return ListExtensions.<Pair<Map<String, Value>, FieldInitialisation>, String>map(_allInitialisations, _function);
        }
      };
      List<List<String>> _map = ListExtensions.<FieldSpecification, List<String>>map(_fields, _function);
      Iterable<String> _flatten = Iterables.<String>concat(_map);
      final Set<String> imports = IterableExtensions.<String>toSet(_flatten);
      this.ccg.addImports(imports);
      Iterable<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> _allStatesWithContextTriggers = this.mpp.getAllStatesWithContextTriggers();
      boolean _isEmpty = IterableExtensions.isEmpty(_allStatesWithContextTriggers);
      boolean _not = (!_isEmpty);
      if (_not) {
        imports.add("javax.swing.event.TableModelEvent");
        imports.add("javax.swing.event.TableModelListener");
        Iterable<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> _allStatesWithContextTriggers_1 = this.mpp.getAllStatesWithContextTriggers();
        final Consumer<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> _function_1 = new Consumer<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>() {
          @Override
          public void accept(final Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> p) {
            StringConcatenation _builder = new StringConcatenation();
            CharSequence _generateCellPackage = FieldGenerator.this.generateCellPackage();
            _builder.append(_generateCellPackage, "");
            _builder.append(".");
            CellSpecification _key = p.getKey();
            CharSequence _generateCellClassName = FieldGenerator.this.generateCellClassName(_key);
            _builder.append(_generateCellClassName, "");
            String _string = _builder.toString();
            imports.add(_string);
          }
        };
        _allStatesWithContextTriggers_1.forEach(_function_1);
      }
      final Function1<String, Boolean> _function_2 = new Function1<String, Boolean>() {
        @Override
        public Boolean apply(final String imp) {
          boolean _equals = imp.equals("");
          return Boolean.valueOf((!_equals));
        }
      };
      Iterable<String> _filter = IterableExtensions.<String>filter(imports, _function_2);
      final Function1<String, CharSequence> _function_3 = new Function1<String, CharSequence>() {
        @Override
        public CharSequence apply(final String imp) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("import ");
          _builder.append(imp, "");
          _builder.append(";");
          return _builder.toString();
        }
      };
      _xblockexpression = IterableExtensions.<String>join(_filter, "\n", _function_3);
    }
    return _xblockexpression;
  }
  
  protected String _getImportsRequired(final RandomInitialisation ri, final Map<String, Value> symbols) {
    return "java.util.Random";
  }
  
  protected String _getImportsRequired(final FieldInitialisation di, final Map<String, Value> symbols) {
    return "";
  }
  
  public CharSequence generateFieldInitialiserFor(final FieldSpecification f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public final void ");
    CharSequence _generateFieldInitialiserName = this.generateFieldInitialiserName(f);
    _builder.append(_generateFieldInitialiserName, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("width = ");
    int _width = f.getWidth();
    _builder.append(_width, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("height = ");
    int _height = f.getHeight();
    _builder.append(_height, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("field = new Cell[width][height];");
    _builder.newLine();
    _builder.append("\t");
    List<Pair<Map<String, Value>, FieldInitialisation>> _allInitialisations = this.mpp.allInitialisations(f);
    final Function1<Pair<Map<String, Value>, FieldInitialisation>, CharSequence> _function = new Function1<Pair<Map<String, Value>, FieldInitialisation>, CharSequence>() {
      @Override
      public CharSequence apply(final Pair<Map<String, Value>, FieldInitialisation> i) {
        FieldInitialisation _value = i.getValue();
        Map<String, Value> _key = i.getKey();
        return FieldGenerator.this.generateInitCode(_value, _key);
      }
    };
    String _join = IterableExtensions.<Pair<Map<String, Value>, FieldInitialisation>>join(_allInitialisations, " ", _function);
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fireTableStructureChanged();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateInitCode(final DefaultInitialisation dfi, final Map<String, Value> symbols) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Fill the rest of the field with ");
    CellSpecification _cell = dfi.getCell();
    String _name = _cell.getName();
    _builder.append(_name, "");
    _builder.append(" cells");
    _builder.newLineIfNotEmpty();
    _builder.append("for (int x = 0; x < width; x++) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (int y = 0; y < height; y++) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (field[x][y] == null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("field[x][y] = cellFactory.");
    CellSpecification _cell_1 = dfi.getCell();
    CharSequence _generateCellFactoryMethodName = this.generateCellFactoryMethodName(_cell_1);
    _builder.append(_generateCellFactoryMethodName, "\t\t\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateInitCode(final RandomInitialisation rfi, final Map<String, Value> symbols) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Randomly allocate ");
    CellSpecification _cell = rfi.getCell();
    String _name = _cell.getName();
    _builder.append(_name, "");
    _builder.append(" cells");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Random r = new Random();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (int i = 0; i < ");
    Object _countValue = this.getCountValue(rfi, symbols);
    _builder.append(_countValue, "\t");
    _builder.append("; i++) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("boolean fSet = false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("do {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int x = r.nextInt(width);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int y = r.nextInt(height);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (field[x][y] == null) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("field[x][y] = cellFactory.");
    CellSpecification _cell_1 = rfi.getCell();
    CharSequence _generateCellFactoryMethodName = this.generateCellFactoryMethodName(_cell_1);
    _builder.append(_generateCellFactoryMethodName, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("fSet = true;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} while (!fSet);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public Object getCountValue(final RandomInitialisation rfi, final Map<String, Value> symbols) {
    Object _xifexpression = null;
    VarSpec _var = rfi.getVar();
    boolean _notEquals = (!Objects.equal(_var, null));
    if (_notEquals) {
      VarSpec _var_1 = rfi.getVar();
      _xifexpression = this.generateAccessCode(_var_1, symbols);
    } else {
      _xifexpression = Integer.valueOf(rfi.getCount());
    }
    return _xifexpression;
  }
  
  protected CharSequence _generateAccessCode(final CellVarSpec cvs, final Map<String, Value> symbols) {
    return this.generateVariableName(cvs);
  }
  
  protected CharSequence _generateAccessCode(final ParamSpec sps, final Map<String, Value> symbols) {
    String _name = sps.getName();
    Value _get = symbols.get(_name);
    return this.generateAccessCode(_get, symbols);
  }
  
  protected CharSequence _generateAccessCode(final StringValue v, final Map<String, Value> symbols) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _value = v.getValue();
    _builder.append(_value, "");
    _builder.append("\"");
    return _builder;
  }
  
  protected CharSequence _generateAccessCode(final IntValue v, final Map<String, Value> symbols) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = v.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected CharSequence _generateAccessCode(final VarRefValue v, final Map<String, Value> symbols) {
    CellVarSpec _ref = v.getRef();
    return this.generateAccessCode(_ref, symbols);
  }
  
  protected CharSequence _generateInitCode(final ContextInitialisation ci, final Map<String, Value> symbols) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Fill in ");
    CellSpecification _cell = ci.getCell();
    String _name = _cell.getName();
    _builder.append(_name, "");
    _builder.append(" cells where appropriate because of context");
    _builder.newLineIfNotEmpty();
    _builder.append("for (int x = 0; x < width; x++) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (int y = 0; y < height; y++) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (field[x][y] == null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("CellContext context = getContextAt (x, y);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (");
    CharSequence _generateContextCheck = this.generateContextCheck(ci);
    _builder.append(_generateContextCheck, "\t\t\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("field[x][y] = cellFactory.");
    CellSpecification _cell_1 = ci.getCell();
    CharSequence _generateCellFactoryMethodName = this.generateCellFactoryMethodName(_cell_1);
    _builder.append(_generateCellFactoryMethodName, "\t\t\t\t");
    _builder.append("(");
    CharSequence _generateValue = this.generateValue(ci);
    _builder.append(_generateValue, "\t\t\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateContextCheck(final ContextInitialisation ci) {
    ContextExpression _check = ci.getCheck();
    return this.generateFor(_check);
  }
  
  public CharSequence generateValue(final ContextInitialisation ci) {
    ContextExpression _exp = ci.getExp();
    return this.generateFor(_exp);
  }
  
  public String generateFieldInitialisation() {
    EList<OptionSpecification> _options = this.gg.getOptions();
    Iterable<StartFieldDeclaration> _filter = Iterables.<StartFieldDeclaration>filter(_options, StartFieldDeclaration.class);
    final Function1<StartFieldDeclaration, CharSequence> _function = new Function1<StartFieldDeclaration, CharSequence>() {
      @Override
      public CharSequence apply(final StartFieldDeclaration o) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("initialise");
        FieldSpecification _field = o.getField();
        String _name = _field.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "");
        _builder.append("Field();");
        return _builder.toString();
      }
    };
    return IterableExtensions.<StartFieldDeclaration>join(_filter, " ", _function);
  }
  
  public String getImportsRequired(final FieldInitialisation ri, final Map<String, Value> symbols) {
    if (ri instanceof RandomInitialisation) {
      return _getImportsRequired((RandomInitialisation)ri, symbols);
    } else if (ri != null) {
      return _getImportsRequired(ri, symbols);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ri, symbols).toString());
    }
  }
  
  public CharSequence generateInitCode(final FieldInitialisation ci, final Map<String, Value> symbols) {
    if (ci instanceof ContextInitialisation) {
      return _generateInitCode((ContextInitialisation)ci, symbols);
    } else if (ci instanceof DefaultInitialisation) {
      return _generateInitCode((DefaultInitialisation)ci, symbols);
    } else if (ci instanceof RandomInitialisation) {
      return _generateInitCode((RandomInitialisation)ci, symbols);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ci, symbols).toString());
    }
  }
  
  public CharSequence generateAccessCode(final EObject cvs, final Map<String, Value> symbols) {
    if (cvs instanceof CellVarSpec) {
      return _generateAccessCode((CellVarSpec)cvs, symbols);
    } else if (cvs instanceof IntValue) {
      return _generateAccessCode((IntValue)cvs, symbols);
    } else if (cvs instanceof ParamSpec) {
      return _generateAccessCode((ParamSpec)cvs, symbols);
    } else if (cvs instanceof StringValue) {
      return _generateAccessCode((StringValue)cvs, symbols);
    } else if (cvs instanceof VarRefValue) {
      return _generateAccessCode((VarRefValue)cvs, symbols);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cvs, symbols).toString());
    }
  }
}

package uk.ac.kcl.inf.zschaler.gridgames.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.zschaler.gridgames.generator.CommonGenerator;
import uk.ac.kcl.inf.zschaler.gridgames.generator.ModelPreprocessor;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellMember;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.IntValue;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.MouseTrigger;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ParamSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StringValue;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionTriggerSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarRefValue;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarSpec;

/**
 * Generates all stuff to do with handling cells.
 */
@SuppressWarnings("all")
public class CellGenerator extends CommonGenerator {
  public CellGenerator(final ModelPreprocessor mpp) {
    super(mpp);
  }
  
  /**
   * Basic generation routine.
   */
  public void generate(final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateCellClassFileName = this.generateCellClassFileName();
    _builder.append(_generateCellClassFileName, "");
    CharSequence _generateCellClass = this.generateCellClass();
    fsa.generateFile(_builder.toString(), _generateCellClass);
    EList<CellSpecification> _cells = this.gg.getCells();
    final Procedure1<CellSpecification> _function = new Procedure1<CellSpecification>() {
      @Override
      public void apply(final CellSpecification c) {
        StringConcatenation _builder = new StringConcatenation();
        CharSequence _generateCellClassFileName = CellGenerator.this.generateCellClassFileName(c);
        _builder.append(_generateCellClassFileName, "");
        CharSequence _generateCellClass = CellGenerator.this.generateCellClass(c);
        fsa.generateFile(_builder.toString(), _generateCellClass);
      }
    };
    IterableExtensions.<CellSpecification>forEach(_cells, _function);
    StringConcatenation _builder_1 = new StringConcatenation();
    CharSequence _generateFactoryClassFileName = this.generateFactoryClassFileName();
    _builder_1.append(_generateFactoryClassFileName, "");
    CharSequence _generateFactory = this.generateFactory();
    fsa.generateFile(_builder_1.toString(), _generateFactory);
  }
  
  /**
   * Generate the basic cell class.
   */
  public CharSequence generateCellClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateCellPackage = this.generateCellPackage();
    _builder.append(_generateCellPackage, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javax.swing.JButton;");
    _builder.newLine();
    _builder.append("import javax.swing.JLabel;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.awt.Component;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    CharSequence _generateModelPackage = this.generateModelPackage();
    _builder.append(_generateModelPackage, "");
    _builder.append(".");
    CharSequence _generateFieldClassName = this.generateFieldClassName();
    _builder.append(_generateFieldClassName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public abstract class Cell {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public abstract class CellState {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public abstract Component formatUIRepresentation(JButton jb, JLabel jl);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public void handleMouseClick (boolean isLeft, int row, int col, ");
    CharSequence _generateFieldClassName_1 = this.generateFieldClassName();
    _builder.append(_generateFieldClassName_1, "\t\t");
    _builder.append(" field) { }");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("public abstract int getStateID();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private CellState currentState;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Component formatUIRepresentation(JButton jb, JLabel jl) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (currentState != null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return currentState.formatUIRepresentation(jb, jl);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return jb;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void handleMouseClick (boolean isLeft, int row, int col, ");
    CharSequence _generateFieldClassName_2 = this.generateFieldClassName();
    _builder.append(_generateFieldClassName_2, "\t");
    _builder.append(" field) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("currentState.handleMouseClick(isLeft, row, col, field);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public CellState getState() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return currentState;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Change the state of this cell to the given one. Assume the cell is positioned at the given ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* coordinates in the given field and issue an update event for that field.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void setState (CellState csNewState, int row, int col, ");
    CharSequence _generateFieldClassName_3 = this.generateFieldClassName();
    _builder.append(_generateFieldClassName_3, "\t");
    _builder.append(" field) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("currentState = csNewState;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (field != null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("field.fireTableCellUpdated(row, col);");
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
    EList<CellSpecification> _cells = this.gg.getCells();
    final Function1<CellSpecification, CharSequence> _function = new Function1<CellSpecification, CharSequence>() {
      @Override
      public CharSequence apply(final CellSpecification c) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("public boolean is");
        String _name = c.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "");
        _builder.append("() { return false; }");
        return _builder.toString();
      }
    };
    String _join = IterableExtensions.<CellSpecification>join(_cells, " ", _function);
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generate code for the specified cell specification
   */
  public CharSequence generateCellClass(final CellSpecification c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateCellPackage = this.generateCellPackage();
    _builder.append(_generateCellPackage, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javax.swing.JButton;");
    _builder.newLine();
    _builder.append("import javax.swing.JLabel;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.awt.Component;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    CharSequence _generateModelPackage = this.generateModelPackage();
    _builder.append(_generateModelPackage, "");
    _builder.append(".");
    CharSequence _generateFieldClassName = this.generateFieldClassName();
    _builder.append(_generateFieldClassName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    CharSequence _generateCellClassName = this.generateCellClassName(c);
    _builder.append(_generateCellClassName, "");
    _builder.append(" extends Cell {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<CellMember> _members = c.getMembers();
    Iterable<CellVarSpec> _filter = Iterables.<CellVarSpec>filter(_members, CellVarSpec.class);
    final Function1<CellVarSpec, CharSequence> _function = new Function1<CellVarSpec, CharSequence>() {
      @Override
      public CharSequence apply(final CellVarSpec v) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("private ");
        String _type = v.getType();
        _builder.append(_type, "");
        _builder.append(" ");
        CharSequence _generateVariableName = CellGenerator.this.generateVariableName(v);
        _builder.append(_generateVariableName, "");
        _builder.append(";");
        return _builder.toString();
      }
    };
    String _join = IterableExtensions.<CellVarSpec>join(_filter, " ", _function);
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    CharSequence _generateCellClassName_1 = this.generateCellClassName(c);
    _builder.append(_generateCellClassName_1, "\t");
    _builder.append("(");
    EList<CellMember> _members_1 = c.getMembers();
    Iterable<CellVarSpec> _filter_1 = Iterables.<CellVarSpec>filter(_members_1, CellVarSpec.class);
    final Function1<CellVarSpec, CharSequence> _function_1 = new Function1<CellVarSpec, CharSequence>() {
      @Override
      public CharSequence apply(final CellVarSpec v) {
        StringConcatenation _builder = new StringConcatenation();
        String _type = v.getType();
        _builder.append(_type, "");
        _builder.append(" ");
        String _name = v.getName();
        String _firstLower = StringExtensions.toFirstLower(_name);
        _builder.append(_firstLower, "");
        return _builder.toString();
      }
    };
    String _join_1 = IterableExtensions.<CellVarSpec>join(_filter_1, ", ", _function_1);
    _builder.append(_join_1, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("setState (new ");
    CellState _startState = this.mpp.getStartState(c);
    String _name = _startState.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "\t\t");
    _builder.append("CellState(), 0, 0, null);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    EList<CellMember> _members_2 = c.getMembers();
    Iterable<CellVarSpec> _filter_2 = Iterables.<CellVarSpec>filter(_members_2, CellVarSpec.class);
    final Function1<CellVarSpec, CharSequence> _function_2 = new Function1<CellVarSpec, CharSequence>() {
      @Override
      public CharSequence apply(final CellVarSpec v) {
        StringConcatenation _builder = new StringConcatenation();
        CharSequence _generateVariableName = CellGenerator.this.generateVariableName(v);
        _builder.append(_generateVariableName, "");
        _builder.append(" = ");
        String _name = v.getName();
        String _firstLower = StringExtensions.toFirstLower(_name);
        _builder.append(_firstLower, "");
        _builder.append(";");
        return _builder.toString();
      }
    };
    String _join_2 = IterableExtensions.<CellVarSpec>join(_filter_2, "; ", _function_2);
    _builder.append(_join_2, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> _cellStates = this.mpp.getCellStates(c);
    final Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, CharSequence> _function_3 = new Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, CharSequence>() {
      @Override
      public CharSequence apply(final Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> stateWithIDAndSymbols) {
        CellState _key = stateWithIDAndSymbols.getKey();
        Pair<Integer, ? extends Map<String, Value>> _value = stateWithIDAndSymbols.getValue();
        return CellGenerator.this.generateStateSpec(_key, _value);
      }
    };
    String _join_3 = IterableExtensions.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>join(_cellStates, " ", _function_3);
    _builder.append(_join_3, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean is");
    String _name_1 = c.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateStateSpec(final CellState cs, final Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = cs.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("CellState extends CellState {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Component formatUIRepresentation(JButton jb, JLabel jl) {");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _xifexpression = null;
    CellDisplaySpec _display = cs.getDisplay();
    String _display_type = _display.getDisplay_type();
    boolean _equals = _display_type.equals("button");
    if (_equals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("jb.setText (");
      CellDisplaySpec _display_1 = cs.getDisplay();
      CharSequence _generateTextCalculation = this.generateTextCalculation(_display_1, idAndSymbolTable);
      _builder_1.append(_generateTextCalculation, "");
      _builder_1.append(");");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("return jb;");
      _builder_1.newLine();
      _xifexpression = _builder_1;
    } else {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("jl.setText (");
      CellDisplaySpec _display_2 = cs.getDisplay();
      CharSequence _generateTextCalculation_1 = this.generateTextCalculation(_display_2, idAndSymbolTable);
      _builder_2.append(_generateTextCalculation_1, "");
      _builder_2.append(");");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("return jl;");
      _builder_2.newLine();
      _xifexpression = _builder_2;
    }
    _builder.append(_xifexpression, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _xifexpression_1 = null;
    EList<TransitionSpec> _transitions = cs.getTransitions();
    boolean _isEmpty = _transitions.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.newLine();
      _builder_3.append("public void handleMouseClick (boolean isLeft, int row, int col, ");
      CharSequence _generateFieldClassName = this.generateFieldClassName();
      _builder_3.append(_generateFieldClassName, "");
      _builder_3.append(" field) {");
      _builder_3.newLineIfNotEmpty();
      _builder_3.append("\t");
      EList<TransitionSpec> _transitions_1 = cs.getTransitions();
      final Function1<TransitionSpec, Boolean> _function = new Function1<TransitionSpec, Boolean>() {
        @Override
        public Boolean apply(final TransitionSpec t) {
          TransitionTriggerSpec _trigger = t.getTrigger();
          return Boolean.valueOf((_trigger instanceof MouseTrigger));
        }
      };
      Iterable<TransitionSpec> _filter = IterableExtensions.<TransitionSpec>filter(_transitions_1, _function);
      final Function1<TransitionSpec, CharSequence> _function_1 = new Function1<TransitionSpec, CharSequence>() {
        @Override
        public CharSequence apply(final TransitionSpec t) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("if (");
          CharSequence _xifexpression = null;
          TransitionTriggerSpec _trigger = t.getTrigger();
          boolean _isLeft = ((MouseTrigger) _trigger).isLeft();
          if (_isLeft) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("isLeft");
            _xifexpression = _builder_1;
          } else {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("!isLeft");
            _xifexpression = _builder_2;
          }
          _builder.append(_xifexpression, "");
          _builder.append(") {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("setState (new ");
          CellState _target = t.getTarget();
          String _name = _target.getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name);
          _builder.append(_firstUpper, "\t");
          _builder.append("CellState(), row, col, field);");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          return _builder.toString();
        }
      };
      String _join = IterableExtensions.<TransitionSpec>join(_filter, " ", _function_1);
      _builder_3.append(_join, "\t");
      _builder_3.newLineIfNotEmpty();
      _builder_3.append("}");
      _builder_3.newLine();
      _xifexpression_1 = _builder_3;
    }
    _builder.append(_xifexpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int getStateID() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ");
    Integer _key = idAndSymbolTable.getKey();
    _builder.append(_key, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateTextCalculation(final CellDisplaySpec cds, final Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) {
    CharSequence _xifexpression = null;
    String _text = cds.getText();
    boolean _notEquals = (!Objects.equal(_text, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"");
      String _text_1 = cds.getText();
      _builder.append(_text_1, "");
      _builder.append("\"");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\"\" + ");
      VarSpec _var = cds.getVar();
      CharSequence _generateAccessCode = this.generateAccessCode(_var, idAndSymbolTable);
      _builder_1.append(_generateAccessCode, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _generateAccessCode(final CellVarSpec cvs, final Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) {
    return this.generateVariableName(cvs);
  }
  
  protected CharSequence _generateAccessCode(final ParamSpec sps, final Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) {
    Map<String, Value> _value = idAndSymbolTable.getValue();
    String _name = sps.getName();
    Value _get = _value.get(_name);
    return this.generateAccessCode(_get, idAndSymbolTable);
  }
  
  protected CharSequence _generateAccessCode(final StringValue v, final Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _value = v.getValue();
    _builder.append(_value, "");
    _builder.append("\"");
    return _builder;
  }
  
  protected CharSequence _generateAccessCode(final IntValue v, final Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = v.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected CharSequence _generateAccessCode(final VarRefValue v, final Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) {
    CellVarSpec _ref = v.getRef();
    return this.generateAccessCode(_ref, idAndSymbolTable);
  }
  
  public CharSequence generateFactory() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateCellPackage = this.generateCellPackage();
    _builder.append(_generateCellPackage, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public class CellFactory {");
    _builder.newLine();
    _builder.append("\t");
    EList<CellSpecification> _cells = this.gg.getCells();
    final Function1<CellSpecification, CharSequence> _function = new Function1<CellSpecification, CharSequence>() {
      @Override
      public CharSequence apply(final CellSpecification c) {
        return CellGenerator.this.generateFactoryMethod(c);
      }
    };
    String _join = IterableExtensions.<CellSpecification>join(_cells, " ", _function);
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateFactoryMethod(final CellSpecification cs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public Cell ");
    CharSequence _generateCellFactoryMethodName = this.generateCellFactoryMethodName(cs);
    _builder.append(_generateCellFactoryMethodName, "");
    _builder.append("(");
    EList<CellMember> _members = cs.getMembers();
    Iterable<CellVarSpec> _filter = Iterables.<CellVarSpec>filter(_members, CellVarSpec.class);
    final Function1<CellVarSpec, CharSequence> _function = new Function1<CellVarSpec, CharSequence>() {
      @Override
      public CharSequence apply(final CellVarSpec v) {
        StringConcatenation _builder = new StringConcatenation();
        String _type = v.getType();
        _builder.append(_type, "");
        _builder.append(" ");
        String _name = v.getName();
        _builder.append(_name, "");
        return _builder.toString();
      }
    };
    String _join = IterableExtensions.<CellVarSpec>join(_filter, ", ", _function);
    _builder.append(_join, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return new ");
    CharSequence _generateCellClassName = this.generateCellClassName(cs);
    _builder.append(_generateCellClassName, "\t");
    _builder.append("(");
    EList<CellMember> _members_1 = cs.getMembers();
    Iterable<CellVarSpec> _filter_1 = Iterables.<CellVarSpec>filter(_members_1, CellVarSpec.class);
    final Function1<CellVarSpec, CharSequence> _function_1 = new Function1<CellVarSpec, CharSequence>() {
      @Override
      public CharSequence apply(final CellVarSpec v) {
        return v.getName();
      }
    };
    String _join_1 = IterableExtensions.<CellVarSpec>join(_filter_1, ", ", _function_1);
    _builder.append(_join_1, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateAccessCode(final EObject cvs, final Pair<Integer, ? extends Map<String, Value>> idAndSymbolTable) {
    if (cvs instanceof CellVarSpec) {
      return _generateAccessCode((CellVarSpec)cvs, idAndSymbolTable);
    } else if (cvs instanceof IntValue) {
      return _generateAccessCode((IntValue)cvs, idAndSymbolTable);
    } else if (cvs instanceof ParamSpec) {
      return _generateAccessCode((ParamSpec)cvs, idAndSymbolTable);
    } else if (cvs instanceof StringValue) {
      return _generateAccessCode((StringValue)cvs, idAndSymbolTable);
    } else if (cvs instanceof VarRefValue) {
      return _generateAccessCode((VarRefValue)cvs, idAndSymbolTable);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cvs, idAndSymbolTable).toString());
    }
  }
}

package uk.ac.kcl.inf.zschaler.gridgames.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.zschaler.gridgames.generator.CommonGenerator;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellMember;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec;

/**
 * Generates all stuff to do with handling cells.
 */
@SuppressWarnings("all")
public class CellGenerator extends CommonGenerator {
  public CellGenerator(final GridGame gg) {
    super(gg);
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
        CellGenerator.this.normalizeDisplayAnnotation(c);
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
   * Normalize display annotations for this cell specification. If there are no states,
   * but a display annotation, create an artifical default state moving the display annotation
   * over.
   * 
   * TODO Eventually might want to enable sharing of display annotations between a number of states.
   */
  public void normalizeDisplayAnnotation(final CellSpecification c) {
    boolean _and = false;
    EList<CellMember> _members = c.getMembers();
    Iterable<CellStateSpec> _filter = Iterables.<CellStateSpec>filter(_members, CellStateSpec.class);
    boolean _isEmpty = IterableExtensions.isEmpty(_filter);
    if (!_isEmpty) {
      _and = false;
    } else {
      EList<CellMember> _members_1 = c.getMembers();
      Iterable<CellDisplaySpec> _filter_1 = Iterables.<CellDisplaySpec>filter(_members_1, CellDisplaySpec.class);
      boolean _isEmpty_1 = IterableExtensions.isEmpty(_filter_1);
      boolean _not = (!_isEmpty_1);
      _and = _not;
    }
    if (_and) {
      EClass _eClass = this.gg.eClass();
      EPackage _ePackage = _eClass.getEPackage();
      EFactory _eFactoryInstance = _ePackage.getEFactoryInstance();
      EClass _eClass_1 = this.gg.eClass();
      EPackage _ePackage_1 = _eClass_1.getEPackage();
      EList<EClassifier> _eClassifiers = _ePackage_1.getEClassifiers();
      final Function1<EClassifier, Boolean> _function = new Function1<EClassifier, Boolean>() {
        @Override
        public Boolean apply(final EClassifier ec) {
          String _name = ec.getName();
          return Boolean.valueOf(_name.equals("CellStateSpec"));
        }
      };
      EClassifier _findFirst = IterableExtensions.<EClassifier>findFirst(_eClassifiers, _function);
      EObject _create = _eFactoryInstance.create(((EClass) _findFirst));
      CellStateSpec stateSpec = ((CellStateSpec) _create);
      EClass _eClass_2 = this.gg.eClass();
      EPackage _ePackage_2 = _eClass_2.getEPackage();
      EFactory _eFactoryInstance_1 = _ePackage_2.getEFactoryInstance();
      EClass _eClass_3 = this.gg.eClass();
      EPackage _ePackage_3 = _eClass_3.getEPackage();
      EList<EClassifier> _eClassifiers_1 = _ePackage_3.getEClassifiers();
      final Function1<EClassifier, Boolean> _function_1 = new Function1<EClassifier, Boolean>() {
        @Override
        public Boolean apply(final EClassifier ec) {
          String _name = ec.getName();
          return Boolean.valueOf(_name.equals("CellState"));
        }
      };
      EClassifier _findFirst_1 = IterableExtensions.<EClassifier>findFirst(_eClassifiers_1, _function_1);
      EObject _create_1 = _eFactoryInstance_1.create(((EClass) _findFirst_1));
      CellState dummyState = ((CellState) _create_1);
      dummyState.setName("default");
      EList<CellState> _states = stateSpec.getStates();
      _states.add(dummyState);
      EList<CellMember> _members_2 = c.getMembers();
      _members_2.add(stateSpec);
      EList<CellMember> _members_3 = c.getMembers();
      Iterable<CellDisplaySpec> _filter_2 = Iterables.<CellDisplaySpec>filter(_members_3, CellDisplaySpec.class);
      final Function1<CellDisplaySpec, Boolean> _function_2 = new Function1<CellDisplaySpec, Boolean>() {
        @Override
        public Boolean apply(final CellDisplaySpec it) {
          return Boolean.valueOf(true);
        }
      };
      CellDisplaySpec _findFirst_2 = IterableExtensions.<CellDisplaySpec>findFirst(_filter_2, _function_2);
      dummyState.setDisplay(_findFirst_2);
      stateSpec.setStart(dummyState);
    }
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
    _builder.append("protected abstract class CellState {");
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
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected CellState currentState;");
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
    _builder.append("currentState = new ");
    EList<CellMember> _members_2 = c.getMembers();
    Iterable<CellStateSpec> _filter_2 = Iterables.<CellStateSpec>filter(_members_2, CellStateSpec.class);
    final Function1<CellStateSpec, Boolean> _function_2 = new Function1<CellStateSpec, Boolean>() {
      @Override
      public Boolean apply(final CellStateSpec it) {
        return Boolean.valueOf(true);
      }
    };
    CellStateSpec _findFirst = IterableExtensions.<CellStateSpec>findFirst(_filter_2, _function_2);
    CellState _start = _findFirst.getStart();
    String _name = _start.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "\t\t");
    _builder.append("CellState();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    EList<CellMember> _members_3 = c.getMembers();
    Iterable<CellVarSpec> _filter_3 = Iterables.<CellVarSpec>filter(_members_3, CellVarSpec.class);
    final Function1<CellVarSpec, CharSequence> _function_3 = new Function1<CellVarSpec, CharSequence>() {
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
    String _join_2 = IterableExtensions.<CellVarSpec>join(_filter_3, "; ", _function_3);
    _builder.append(_join_2, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    EList<CellMember> _members_4 = c.getMembers();
    Iterable<CellStateSpec> _filter_4 = Iterables.<CellStateSpec>filter(_members_4, CellStateSpec.class);
    final Function1<CellStateSpec, CharSequence> _function_4 = new Function1<CellStateSpec, CharSequence>() {
      @Override
      public CharSequence apply(final CellStateSpec css) {
        return CellGenerator.this.generateStateSpec(css);
      }
    };
    String _join_3 = IterableExtensions.<CellStateSpec>join(_filter_4, " ", _function_4);
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
  
  public CharSequence generateStateSpec(final CellStateSpec css) {
    EList<CellState> _states = css.getStates();
    final Function1<CellState, CharSequence> _function = new Function1<CellState, CharSequence>() {
      @Override
      public CharSequence apply(final CellState s) {
        return CellGenerator.this.generateStateSpec(s);
      }
    };
    return IterableExtensions.<CellState>join(_states, " ", _function);
  }
  
  public CharSequence generateStateSpec(final CellState cs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private class ");
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
      CharSequence _generateTextCalculation = this.generateTextCalculation(_display_1);
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
      CharSequence _generateTextCalculation_1 = this.generateTextCalculation(_display_2);
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
      final Function1<TransitionSpec, CharSequence> _function = new Function1<TransitionSpec, CharSequence>() {
        @Override
        public CharSequence apply(final TransitionSpec t) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("if (");
          CharSequence _xifexpression = null;
          String _trigger = t.getTrigger();
          boolean _equals = _trigger.equals("mouse-left");
          if (_equals) {
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
          _builder.append("currentState = new ");
          CellState _target = t.getTarget();
          String _name = _target.getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name);
          _builder.append(_firstUpper, "\t");
          _builder.append("CellState();");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("field.fireTableCellUpdated(row, col);");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          return _builder.toString();
        }
      };
      String _join = IterableExtensions.<TransitionSpec>join(_transitions_1, " ", _function);
      _builder_3.append(_join, "\t");
      _builder_3.newLineIfNotEmpty();
      _builder_3.append("}");
      _builder_3.newLine();
      _xifexpression_1 = _builder_3;
    }
    _builder.append(_xifexpression_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateVariableName(final CellVarSpec v) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = v.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "");
    _builder.append("Variable");
    return _builder;
  }
  
  public CharSequence generateTextCalculation(final CellDisplaySpec cds) {
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
      CellVarSpec _var = cds.getVar();
      CharSequence _generateVariableName = this.generateVariableName(_var);
      _builder_1.append(_generateVariableName, "");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
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
}

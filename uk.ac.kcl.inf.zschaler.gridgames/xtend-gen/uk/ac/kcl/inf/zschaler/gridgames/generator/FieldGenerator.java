package uk.ac.kcl.inf.zschaler.gridgames.generator;

import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.zschaler.gridgames.generator.CommonGenerator;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.AtomicExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisations;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.NotEmptyExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.OptionSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration;

/**
 * Generates the field class.
 */
@SuppressWarnings("all")
public class FieldGenerator extends CommonGenerator {
  public FieldGenerator(final GridGame gg) {
    super(gg);
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
    CharSequence _xifexpression = null;
    EList<FieldSpecification> _fields_1 = this.gg.getFields();
    final Function1<FieldSpecification, Boolean> _function_1 = new Function1<FieldSpecification, Boolean>() {
      @Override
      public Boolean apply(final FieldSpecification f) {
        FieldInitialisations _field_initialisation = f.getField_initialisation();
        EList<FieldInitialisation> _initialisations = _field_initialisation.getInitialisations();
        final Function1<FieldInitialisation, Boolean> _function = new Function1<FieldInitialisation, Boolean>() {
          @Override
          public Boolean apply(final FieldInitialisation i) {
            return Boolean.valueOf((i instanceof ContextInitialisation));
          }
        };
        return Boolean.valueOf(IterableExtensions.<FieldInitialisation>exists(_initialisations, _function));
      }
    };
    boolean _exists = IterableExtensions.<FieldSpecification>exists(_fields_1, _function_1);
    if (_exists) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("private CellContext getContextAt (int x, int y) {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("return new CellContext(field, x, y);");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("private static class CellContext {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private ArrayList<Cell> al = new ArrayList<> (8);");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public CellContext (Cell[][] field, int x, int y) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("for (int dx = -1; dx <= 1; dx ++) {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("for (int dy = -1; dy <= 1; dy++) {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("if ((dx != 0) || (dy != 0)) {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("al.add (field[x][y]);");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      Iterable<AtomicExpression> _contextExpInvocations = this.getContextExpInvocations(this.gg);
      final Function1<AtomicExpression, String> _function_2 = new Function1<AtomicExpression, String>() {
        @Override
        public String apply(final AtomicExpression e) {
          CharSequence _generateImplementation = FieldGenerator.this.generateImplementation(e);
          return _generateImplementation.toString();
        }
      };
      Iterable<String> _map = IterableExtensions.<AtomicExpression, String>map(_contextExpInvocations, _function_2);
      Set<String> _set = IterableExtensions.<String>toSet(_map);
      String _join_1 = IterableExtensions.join(_set, " ");
      _builder_1.append(_join_1, "\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("}");
      _builder_1.newLine();
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression, "\t");
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
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _generateImplementation(final FilterExpression fe) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public CellContext filter");
    String _cell_type = fe.getCell_type();
    String _firstUpper = StringExtensions.toFirstUpper(_cell_type);
    _builder.append(_firstUpper, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<Cell> newAL = new ArrayList<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (Cell c : al) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (c instanceof ");
    String _cell_type_1 = fe.getCell_type();
    CharSequence _generateCellClassName = this.generateCellClassName(_cell_type_1);
    _builder.append(_generateCellClassName, "\t\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("newAL.add (c);");
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
    _builder.append("al = newAL;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return this;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateImplementation(final NotEmptyExpression nee) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public boolean notEmpty() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return al.size() > 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateImplementation(final CountExpression ce) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public int size() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return al.size();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public Iterable<AtomicExpression> getContextExpInvocations(final GridGame gg) {
    EList<FieldSpecification> _fields = gg.getFields();
    final Function1<FieldSpecification, Iterable<AtomicExpression>> _function = new Function1<FieldSpecification, Iterable<AtomicExpression>>() {
      @Override
      public Iterable<AtomicExpression> apply(final FieldSpecification f) {
        FieldInitialisations _field_initialisation = f.getField_initialisation();
        EList<FieldInitialisation> _initialisations = _field_initialisation.getInitialisations();
        Iterable<ContextInitialisation> _filter = Iterables.<ContextInitialisation>filter(_initialisations, ContextInitialisation.class);
        final Function1<ContextInitialisation, EList<AtomicExpression>> _function = new Function1<ContextInitialisation, EList<AtomicExpression>>() {
          @Override
          public EList<AtomicExpression> apply(final ContextInitialisation ci) {
            EList<AtomicExpression> _xblockexpression = null;
            {
              ContextExpression _check = ci.getCheck();
              EList<AtomicExpression> checkExps = _check.getSub_exp();
              ContextExpression _exp = ci.getExp();
              EList<AtomicExpression> valExps = _exp.getSub_exp();
              List<AtomicExpression> _list = IterableExtensions.<AtomicExpression>toList(checkExps);
              _list.addAll(valExps);
              _xblockexpression = checkExps;
            }
            return _xblockexpression;
          }
        };
        Iterable<EList<AtomicExpression>> _map = IterableExtensions.<ContextInitialisation, EList<AtomicExpression>>map(_filter, _function);
        return Iterables.<AtomicExpression>concat(_map);
      }
    };
    List<Iterable<AtomicExpression>> _map = ListExtensions.<FieldSpecification, Iterable<AtomicExpression>>map(_fields, _function);
    return Iterables.<AtomicExpression>concat(_map);
  }
  
  public String generateImports() {
    String _xblockexpression = null;
    {
      EList<FieldSpecification> _fields = this.gg.getFields();
      final Function1<FieldSpecification, List<String>> _function = new Function1<FieldSpecification, List<String>>() {
        @Override
        public List<String> apply(final FieldSpecification f) {
          FieldInitialisations _field_initialisation = f.getField_initialisation();
          EList<FieldInitialisation> _initialisations = _field_initialisation.getInitialisations();
          final Function1<FieldInitialisation, String> _function = new Function1<FieldInitialisation, String>() {
            @Override
            public String apply(final FieldInitialisation it) {
              return FieldGenerator.this.getImportsRequired(it);
            }
          };
          return ListExtensions.<FieldInitialisation, String>map(_initialisations, _function);
        }
      };
      List<List<String>> _map = ListExtensions.<FieldSpecification, List<String>>map(_fields, _function);
      Iterable<String> _flatten = Iterables.<String>concat(_map);
      Set<String> imports = IterableExtensions.<String>toSet(_flatten);
      EList<FieldSpecification> _fields_1 = this.gg.getFields();
      final Function1<FieldSpecification, Boolean> _function_1 = new Function1<FieldSpecification, Boolean>() {
        @Override
        public Boolean apply(final FieldSpecification f) {
          FieldInitialisations _field_initialisation = f.getField_initialisation();
          EList<FieldInitialisation> _initialisations = _field_initialisation.getInitialisations();
          final Function1<FieldInitialisation, Boolean> _function = new Function1<FieldInitialisation, Boolean>() {
            @Override
            public Boolean apply(final FieldInitialisation i) {
              return Boolean.valueOf((i instanceof ContextInitialisation));
            }
          };
          return Boolean.valueOf(IterableExtensions.<FieldInitialisation>exists(_initialisations, _function));
        }
      };
      boolean _exists = IterableExtensions.<FieldSpecification>exists(_fields_1, _function_1);
      if (_exists) {
        imports.add("java.util.List");
        imports.add("java.util.ArrayList");
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
  
  protected String _getImportsRequired(final RandomInitialisation ri) {
    return "java.util.Random";
  }
  
  protected String _getImportsRequired(final FieldInitialisation di) {
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
    FieldInitialisations _field_initialisation = f.getField_initialisation();
    EList<FieldInitialisation> _initialisations = _field_initialisation.getInitialisations();
    final Function1<FieldInitialisation, CharSequence> _function = new Function1<FieldInitialisation, CharSequence>() {
      @Override
      public CharSequence apply(final FieldInitialisation i) {
        return FieldGenerator.this.generateInitCode(i);
      }
    };
    String _join = IterableExtensions.<FieldInitialisation>join(_initialisations, " ", _function);
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
  
  protected CharSequence _generateInitCode(final DefaultInitialisation dfi) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Fill the rest of the field with ");
    String _cell = dfi.getCell();
    _builder.append(_cell, "");
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
    String _cell_1 = dfi.getCell();
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
  
  protected CharSequence _generateInitCode(final RandomInitialisation rfi) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Randomly allocate ");
    String _cell = rfi.getCell();
    _builder.append(_cell, "");
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
    int _count = rfi.getCount();
    _builder.append(_count, "\t");
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
    String _cell_1 = rfi.getCell();
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
  
  protected CharSequence _generateInitCode(final ContextInitialisation ci) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Fill in ");
    String _cell = ci.getCell();
    _builder.append(_cell, "");
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
    String _cell_1 = ci.getCell();
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
        String _field_name = o.getField_name();
        String _firstUpper = StringExtensions.toFirstUpper(_field_name);
        _builder.append(_firstUpper, "");
        _builder.append("Field();");
        return _builder.toString();
      }
    };
    return IterableExtensions.<StartFieldDeclaration>join(_filter, " ", _function);
  }
  
  protected CharSequence _generateFor(final ContextExpression ce) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("context.");
    EList<AtomicExpression> _sub_exp = ce.getSub_exp();
    final Function1<AtomicExpression, CharSequence> _function = new Function1<AtomicExpression, CharSequence>() {
      @Override
      public CharSequence apply(final AtomicExpression se) {
        return FieldGenerator.this.generateFor(se);
      }
    };
    String _join = IterableExtensions.<AtomicExpression>join(_sub_exp, ".", _function);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateFor(final FilterExpression fe) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("filter");
    String _cell_type = fe.getCell_type();
    String _firstUpper = StringExtensions.toFirstUpper(_cell_type);
    _builder.append(_firstUpper, "");
    _builder.append("()");
    return _builder;
  }
  
  protected CharSequence _generateFor(final CountExpression ce) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("size()");
    return _builder;
  }
  
  protected CharSequence _generateFor(final NotEmptyExpression nee) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("notEmpty()");
    return _builder;
  }
  
  public CharSequence generateImplementation(final AtomicExpression ce) {
    if (ce instanceof CountExpression) {
      return _generateImplementation((CountExpression)ce);
    } else if (ce instanceof FilterExpression) {
      return _generateImplementation((FilterExpression)ce);
    } else if (ce instanceof NotEmptyExpression) {
      return _generateImplementation((NotEmptyExpression)ce);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ce).toString());
    }
  }
  
  public String getImportsRequired(final FieldInitialisation ri) {
    if (ri instanceof RandomInitialisation) {
      return _getImportsRequired((RandomInitialisation)ri);
    } else if (ri != null) {
      return _getImportsRequired(ri);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ri).toString());
    }
  }
  
  public CharSequence generateInitCode(final FieldInitialisation ci) {
    if (ci instanceof ContextInitialisation) {
      return _generateInitCode((ContextInitialisation)ci);
    } else if (ci instanceof DefaultInitialisation) {
      return _generateInitCode((DefaultInitialisation)ci);
    } else if (ci instanceof RandomInitialisation) {
      return _generateInitCode((RandomInitialisation)ci);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ci).toString());
    }
  }
  
  public CharSequence generateFor(final EObject ce) {
    if (ce instanceof CountExpression) {
      return _generateFor((CountExpression)ce);
    } else if (ce instanceof FilterExpression) {
      return _generateFor((FilterExpression)ce);
    } else if (ce instanceof NotEmptyExpression) {
      return _generateFor((NotEmptyExpression)ce);
    } else if (ce instanceof ContextExpression) {
      return _generateFor((ContextExpression)ce);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ce).toString());
    }
  }
}

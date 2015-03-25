package uk.ac.kcl.inf.zschaler.gridgames.generator;

import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.zschaler.gridgames.generator.CommonGenerator;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisations;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame;
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
    _builder.newLine();
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
  
  public String generateImports() {
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
    Set<String> _set = IterableExtensions.<String>toSet(_flatten);
    final Function1<String, Boolean> _function_1 = new Function1<String, Boolean>() {
      @Override
      public Boolean apply(final String imp) {
        boolean _equals = imp.equals("");
        return Boolean.valueOf((!_equals));
      }
    };
    Iterable<String> _filter = IterableExtensions.<String>filter(_set, _function_1);
    final Function1<String, CharSequence> _function_2 = new Function1<String, CharSequence>() {
      @Override
      public CharSequence apply(final String imp) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("import ");
        _builder.append(imp, "");
        _builder.append(";");
        return _builder.toString();
      }
    };
    return IterableExtensions.<String>join(_filter, "\n", _function_2);
  }
  
  protected String _getImportsRequired(final RandomInitialisation ri) {
    return "java.util.Random";
  }
  
  protected String _getImportsRequired(final DefaultInitialisation di) {
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
  
  public String getImportsRequired(final FieldInitialisation di) {
    if (di instanceof DefaultInitialisation) {
      return _getImportsRequired((DefaultInitialisation)di);
    } else if (di instanceof RandomInitialisation) {
      return _getImportsRequired((RandomInitialisation)di);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(di).toString());
    }
  }
  
  public CharSequence generateInitCode(final FieldInitialisation dfi) {
    if (dfi instanceof DefaultInitialisation) {
      return _generateInitCode((DefaultInitialisation)dfi);
    } else if (dfi instanceof RandomInitialisation) {
      return _generateInitCode((RandomInitialisation)dfi);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(dfi).toString());
    }
  }
}

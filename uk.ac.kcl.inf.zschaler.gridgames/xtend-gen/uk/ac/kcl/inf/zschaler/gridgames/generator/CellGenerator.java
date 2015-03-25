package uk.ac.kcl.inf.zschaler.gridgames.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import uk.ac.kcl.inf.zschaler.gridgames.generator.CommonGenerator;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame;

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
    _builder.append("public abstract class Cell {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public abstract Component formatUIRepresentation(JButton jb, JLabel jl);");
    _builder.newLine();
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
    _builder.append("public class ");
    CharSequence _generateCellClassName = this.generateCellClassName(c);
    _builder.append(_generateCellClassName, "");
    _builder.append(" extends Cell {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Component formatUIRepresentation(JButton jb, JLabel jl) {");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _xifexpression = null;
    String _display_type = c.getDisplay_type();
    boolean _notEquals = (!Objects.equal(_display_type, null));
    if (_notEquals) {
      CharSequence _xifexpression_1 = null;
      String _display_type_1 = c.getDisplay_type();
      boolean _equals = _display_type_1.equals("button");
      if (_equals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("jb.setText (\"");
        String _text = c.getText();
        _builder_1.append(_text, "");
        _builder_1.append("\");");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("return jb;");
        _builder_1.newLine();
        _xifexpression_1 = _builder_1;
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("jl.setText (\"");
        String _text_1 = c.getText();
        _builder_2.append(_text_1, "");
        _builder_2.append("\");");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("return jl;");
        _builder_2.newLine();
        _xifexpression_1 = _builder_2;
      }
      _xifexpression = _xifexpression_1;
    } else {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("return jb;");
      _xifexpression = _builder_3;
    }
    _builder.append(_xifexpression, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
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
    String _name = cs.getName();
    CharSequence _generateCellFactoryMethodName = this.generateCellFactoryMethodName(_name);
    _builder.append(_generateCellFactoryMethodName, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return new ");
    CharSequence _generateCellClassName = this.generateCellClassName(cs);
    _builder.append(_generateCellClassName, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}

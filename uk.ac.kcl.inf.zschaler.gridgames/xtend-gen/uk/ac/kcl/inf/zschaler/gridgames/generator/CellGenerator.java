package uk.ac.kcl.inf.zschaler.gridgames.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import uk.ac.kcl.inf.zschaler.gridgames.generator.CommonGenerator;
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
  }
  
  public CharSequence generateCellClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateCellPackage = this.generateCellPackage();
    _builder.append(_generateCellPackage, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class Cell {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}

package uk.ac.kcl.inf.zschaler.gridgames.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GameSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame;

/**
 * Common generator bits.
 */
@SuppressWarnings("all")
public class CommonGenerator {
  protected final GridGame gg;
  
  public CommonGenerator(final GridGame gg) {
    this.gg = gg;
  }
  
  public CharSequence generateModelPackage() {
    StringConcatenation _builder = new StringConcatenation();
    GameSpecification _game = this.gg.getGame();
    String _name = _game.getName();
    _builder.append(_name, "");
    _builder.append(".model");
    return _builder;
  }
  
  public CharSequence generateModelPackageFolder() {
    StringConcatenation _builder = new StringConcatenation();
    GameSpecification _game = this.gg.getGame();
    String _name = _game.getName();
    _builder.append(_name, "");
    _builder.append("/model");
    return _builder;
  }
  
  public CharSequence generateCellPackage() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateModelPackage = this.generateModelPackage();
    _builder.append(_generateModelPackage, "");
    _builder.append(".cells");
    return _builder;
  }
  
  public CharSequence generateCellPackageFolder() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateModelPackageFolder = this.generateModelPackageFolder();
    _builder.append(_generateModelPackageFolder, "");
    _builder.append("/cells");
    return _builder;
  }
  
  public CharSequence generateFieldClassName() {
    StringConcatenation _builder = new StringConcatenation();
    GameSpecification _game = this.gg.getGame();
    String _name = _game.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("Field");
    return _builder;
  }
  
  public CharSequence generateFieldClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateModelPackageFolder = this.generateModelPackageFolder();
    _builder.append(_generateModelPackageFolder, "");
    _builder.append("/");
    CharSequence _generateFieldClassName = this.generateFieldClassName();
    _builder.append(_generateFieldClassName, "");
    _builder.append(".java");
    return _builder;
  }
}

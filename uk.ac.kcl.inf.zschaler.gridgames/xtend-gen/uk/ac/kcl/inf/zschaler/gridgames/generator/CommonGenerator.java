package uk.ac.kcl.inf.zschaler.gridgames.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.zschaler.gridgames.generator.ModelPreprocessor;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.AtomicExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.NotEmptyExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression;

/**
 * Common generator bits.
 */
@SuppressWarnings("all")
public class CommonGenerator {
  protected ModelPreprocessor mpp;
  
  protected final GridGame gg;
  
  public CommonGenerator(final ModelPreprocessor mpp) {
    this.mpp = mpp;
    GridGame _gridGame = mpp.getGridGame();
    this.gg = _gridGame;
  }
  
  public CharSequence generateViewPackage() {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this.gg.getName();
    _builder.append(_name, "");
    _builder.append(".view");
    return _builder;
  }
  
  public CharSequence generateViewPackageFolder() {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this.gg.getName();
    _builder.append(_name, "");
    _builder.append("/view");
    return _builder;
  }
  
  public CharSequence generateModelPackage() {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this.gg.getName();
    _builder.append(_name, "");
    _builder.append(".model");
    return _builder;
  }
  
  public CharSequence generateModelPackageFolder() {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this.gg.getName();
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
  
  public CharSequence generateFrameClassName() {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this.gg.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("Frame");
    return _builder;
  }
  
  public CharSequence generateFieldClassName() {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this.gg.getName();
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
  
  public CharSequence generateCellClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateCellPackageFolder = this.generateCellPackageFolder();
    _builder.append(_generateCellPackageFolder, "");
    _builder.append("/Cell.java");
    return _builder;
  }
  
  public CharSequence generateFactoryClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateCellPackageFolder = this.generateCellPackageFolder();
    _builder.append(_generateCellPackageFolder, "");
    _builder.append("/CellFactory.java");
    return _builder;
  }
  
  public CharSequence generateCellClassName(final CellSpecification c) {
    String _name = c.getName();
    return this.generateCellClassName(_name);
  }
  
  public CharSequence generateCellClassName(final String c) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(c);
    _builder.append(_firstUpper, "");
    _builder.append("Cell");
    return _builder;
  }
  
  public CharSequence generateCellClassFileName(final CellSpecification c) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateCellPackageFolder = this.generateCellPackageFolder();
    _builder.append(_generateCellPackageFolder, "");
    _builder.append("/");
    CharSequence _generateCellClassName = this.generateCellClassName(c);
    _builder.append(_generateCellClassName, "");
    _builder.append(".java");
    return _builder;
  }
  
  public CharSequence generateFrameClassFileName() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateViewPackageFolder = this.generateViewPackageFolder();
    _builder.append(_generateViewPackageFolder, "");
    _builder.append("/");
    CharSequence _generateFrameClassName = this.generateFrameClassName();
    _builder.append(_generateFrameClassName, "");
    _builder.append(".java");
    return _builder;
  }
  
  public CharSequence generateCellFactoryMethodName(final CellSpecification c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("create");
    String _name = c.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("Field");
    return _builder;
  }
  
  public CharSequence generateFieldInitialiserName(final FieldSpecification f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("initialise");
    String _name = f.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("Field");
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
  
  protected CharSequence _generateFor(final ContextExpression ce) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("context.");
    EList<AtomicExpression> _sub_exp = ce.getSub_exp();
    final Function1<AtomicExpression, CharSequence> _function = new Function1<AtomicExpression, CharSequence>() {
      @Override
      public CharSequence apply(final AtomicExpression se) {
        return CommonGenerator.this.generateFor(se);
      }
    };
    String _join = IterableExtensions.<AtomicExpression>join(_sub_exp, ".", _function);
    _builder.append(_join, "");
    return _builder;
  }
  
  protected CharSequence _generateFor(final FilterExpression fe) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("filter");
    CellSpecification _cell_type = fe.getCell_type();
    String _name = _cell_type.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("()");
    return _builder;
  }
  
  protected CharSequence _generateFor(final StateFilterExpression sfe) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("inState");
    CellState _cell_state = sfe.getCell_state();
    String _name = _cell_state.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("()");
    return _builder;
  }
  
  protected CharSequence _generateFor(final CountExpression ce) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("size()");
    CharSequence _xifexpression = null;
    String _op = ce.getOp();
    boolean _notEquals = (!Objects.equal(_op, null));
    if (_notEquals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      String _op_1 = ce.getOp();
      _builder_1.append(_op_1, "");
      _builder_1.append(" ");
      int _cmpVal = ce.getCmpVal();
      _builder_1.append(_cmpVal, "");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  protected CharSequence _generateFor(final NotEmptyExpression nee) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("notEmpty()");
    return _builder;
  }
  
  public CharSequence generateFor(final EObject ce) {
    if (ce instanceof CountExpression) {
      return _generateFor((CountExpression)ce);
    } else if (ce instanceof FilterExpression) {
      return _generateFor((FilterExpression)ce);
    } else if (ce instanceof NotEmptyExpression) {
      return _generateFor((NotEmptyExpression)ce);
    } else if (ce instanceof StateFilterExpression) {
      return _generateFor((StateFilterExpression)ce);
    } else if (ce instanceof ContextExpression) {
      return _generateFor((ContextExpression)ce);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ce).toString());
    }
  }
}

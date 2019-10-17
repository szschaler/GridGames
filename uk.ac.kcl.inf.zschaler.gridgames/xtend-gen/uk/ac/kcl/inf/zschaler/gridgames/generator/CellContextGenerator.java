package uk.ac.kcl.inf.zschaler.gridgames.generator;

import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.zschaler.gridgames.generator.CommonGenerator;
import uk.ac.kcl.inf.zschaler.gridgames.generator.ModelPreprocessor;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.AtomicExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.EmptyExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalAction;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.NotEmptyExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionTriggerSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value;

@SuppressWarnings("all")
public class CellContextGenerator extends CommonGenerator {
  public CellContextGenerator(final ModelPreprocessor mpp) {
    super(mpp);
  }
  
  public CharSequence generateCellContext() {
    CharSequence _xifexpression = null;
    boolean _needContextGeneration = this.needContextGeneration();
    if (_needContextGeneration) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("private CellContext getContextAt (int x, int y) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return new LocalCellContext(x, y);");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public CellContext getGlobalContext() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return new GlobalCellContext();");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      CharSequence _generateCellContextIntf = this.generateCellContextIntf();
      _builder.append(_generateCellContextIntf);
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _generateAbstractCellContext = this.generateAbstractCellContext();
      _builder.append(_generateAbstractCellContext);
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _generateLocalCellContext = this.generateLocalCellContext();
      _builder.append(_generateLocalCellContext);
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _generateGlobalCellContext = this.generateGlobalCellContext();
      _builder.append(_generateGlobalCellContext);
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public CharSequence generateCellContextIntf() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public interface CellContext extends Iterable<CellContext.ContextElement> {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public interface ContextElement {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Cell getCell();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public CellContext getContextHere();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public int getRow();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public int getCol();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Not ideal, should really be defined in AbstractCellContext, but Java won\'t let me do that...");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public interface ContextCreationStrategy {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public List<ContextElement> getContextElements(CellContext context);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    final Function1<AtomicExpression, String> _function = new Function1<AtomicExpression, String>() {
      @Override
      public String apply(final AtomicExpression e) {
        return CellContextGenerator.this.generateSignature(e).toString();
      }
    };
    String _join = IterableExtensions.join(IterableExtensions.<String>toSet(ListExtensions.<AtomicExpression, String>map(this.getContextExpInvocations(this.gg), _function)), "\n");
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateAbstractCellContext() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public abstract class AbstractCellContext implements CellContext {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<CellContext.ContextElement> al;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public AbstractCellContext (ContextCreationStrategy ccs) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.al = ccs.getContextElements(this);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Iterator<CellContext.ContextElement> iterator() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return al.iterator();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    final Function1<AtomicExpression, String> _function = new Function1<AtomicExpression, String>() {
      @Override
      public String apply(final AtomicExpression e) {
        return CellContextGenerator.this.generateImplementation(e).toString();
      }
    };
    String _join = IterableExtensions.join(IterableExtensions.<String>toSet(ListExtensions.<AtomicExpression, String>map(this.getContextExpInvocations(this.gg), _function)), " ");
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateLocalCellContext() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class LocalCellContext extends AbstractCellContext {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class ContextElement implements CellContext.ContextElement {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private Cell cell;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private int x, y;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ContextElement (int x, int y, Cell cell) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.x = x; this.y = y;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.cell = cell;");
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
    _builder.append("public Cell getCell() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return cell;");
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
    _builder.append("public CellContext getContextHere() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return getContextAt (x, y);");
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
    _builder.append("public int getRow() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return y;");
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
    _builder.append("public int getCol() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return x;");
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
    _builder.append("public LocalCellContext (final int x, final int y) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super (new ContextCreationStrategy() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public List<CellContext.ContextElement> getContextElements(CellContext context) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("ArrayList<CellContext.ContextElement> al = new ArrayList<>(8);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("for (int dx = -1; dx <= 1; dx ++) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("for (int dy = -1; dy <= 1; dy++) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("if (((dx != 0) || (dy != 0)) && ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t    ");
    _builder.append("((x + dx >= 0) && (x + dx < width)) &&");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t    ");
    _builder.append("((y + dy >= 0) && (y + dy < height)) &&");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t    ");
    _builder.append("(field[x + dx][y + dy] != null)) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("al.add (((LocalCellContext) context).new ContextElement (x + dx, y + dy, field[x + dx][y + dy]));");
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
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return al;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateGlobalCellContext() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class GlobalCellContext extends AbstractCellContext {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class ContextElement implements CellContext.ContextElement {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private Cell cell;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private int x, y;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ContextElement (int x, int y, Cell cell) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.x = x; this.y = y;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.cell = cell;");
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
    _builder.append("public Cell getCell() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return cell;");
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
    _builder.append("public CellContext getContextHere() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return getContextAt (x, y);");
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
    _builder.append("public int getRow() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return y;");
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
    _builder.append("public int getCol() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return x;");
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
    _builder.append("public GlobalCellContext() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super (new ContextCreationStrategy() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public List<CellContext.ContextElement> getContextElements(CellContext context) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("ArrayList<CellContext.ContextElement> al = new ArrayList<>(width * height);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("for (int x = 0; x < width; x ++) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("for (int y = 0; y < height; y++) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("al.add (((GlobalCellContext) context).new ContextElement (x, y, field[x][y]));");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return al;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private boolean needContextGeneration() {
    return ((IterableExtensions.<FieldSpecification>exists(this.gg.getFields(), new Function1<FieldSpecification, Boolean>() {
      @Override
      public Boolean apply(final FieldSpecification f) {
        final Function1<Pair<Map<String, Value>, FieldInitialisation>, Boolean> _function = new Function1<Pair<Map<String, Value>, FieldInitialisation>, Boolean>() {
          @Override
          public Boolean apply(final Pair<Map<String, Value>, FieldInitialisation> i) {
            FieldInitialisation _value = i.getValue();
            return Boolean.valueOf((_value instanceof ContextInitialisation));
          }
        };
        return Boolean.valueOf(IterableExtensions.<Pair<Map<String, Value>, FieldInitialisation>>exists(CellContextGenerator.this.mpp.allInitialisations(f), _function));
      }
    }) || (!IterableExtensions.isEmpty(this.mpp.getAllStatesWithContextTriggers()))) || (!this.gg.getGlobalActions().isEmpty()));
  }
  
  public List<AtomicExpression> getContextExpInvocations(final GridGame gg) {
    List<AtomicExpression> _xblockexpression = null;
    {
      final Function1<FieldSpecification, Iterable<AtomicExpression>> _function = new Function1<FieldSpecification, Iterable<AtomicExpression>>() {
        @Override
        public Iterable<AtomicExpression> apply(final FieldSpecification f) {
          final Function1<Pair<Map<String, Value>, FieldInitialisation>, Boolean> _function = new Function1<Pair<Map<String, Value>, FieldInitialisation>, Boolean>() {
            @Override
            public Boolean apply(final Pair<Map<String, Value>, FieldInitialisation> p) {
              FieldInitialisation _value = p.getValue();
              return Boolean.valueOf((_value instanceof ContextInitialisation));
            }
          };
          final Function1<Pair<Map<String, Value>, FieldInitialisation>, EList<AtomicExpression>> _function_1 = new Function1<Pair<Map<String, Value>, FieldInitialisation>, EList<AtomicExpression>>() {
            @Override
            public EList<AtomicExpression> apply(final Pair<Map<String, Value>, FieldInitialisation> cip) {
              EList<AtomicExpression> _xblockexpression = null;
              {
                FieldInitialisation _value = cip.getValue();
                final ContextInitialisation ci = ((ContextInitialisation) _value);
                EList<AtomicExpression> checkExps = ci.getCheck().getSub_exp();
                EList<AtomicExpression> valExps = ci.getExp().getSub_exp();
                IterableExtensions.<AtomicExpression>toList(checkExps).addAll(valExps);
                _xblockexpression = checkExps;
              }
              return _xblockexpression;
            }
          };
          return Iterables.<AtomicExpression>concat(IterableExtensions.<Pair<Map<String, Value>, FieldInitialisation>, EList<AtomicExpression>>map(IterableExtensions.<Pair<Map<String, Value>, FieldInitialisation>>filter(CellContextGenerator.this.mpp.allInitialisations(f), _function), _function_1));
        }
      };
      List<AtomicExpression> contextExpInvs = IterableExtensions.<AtomicExpression>toList(Iterables.<AtomicExpression>concat(ListExtensions.<FieldSpecification, Iterable<AtomicExpression>>map(gg.getFields(), _function)));
      final Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Iterable<AtomicExpression>> _function_1 = new Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Iterable<AtomicExpression>>() {
        @Override
        public Iterable<AtomicExpression> apply(final Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> csp) {
          final Function1<TransitionSpec, Boolean> _function = new Function1<TransitionSpec, Boolean>() {
            @Override
            public Boolean apply(final TransitionSpec t) {
              TransitionTriggerSpec _trigger = t.getTrigger();
              return Boolean.valueOf((_trigger instanceof ContextTrigger));
            }
          };
          final Function1<TransitionSpec, EList<AtomicExpression>> _function_1 = new Function1<TransitionSpec, EList<AtomicExpression>>() {
            @Override
            public EList<AtomicExpression> apply(final TransitionSpec t) {
              TransitionTriggerSpec _trigger = t.getTrigger();
              return ((ContextTrigger) _trigger).getExp().getSub_exp();
            }
          };
          return Iterables.<AtomicExpression>concat(IterableExtensions.<TransitionSpec, EList<AtomicExpression>>map(IterableExtensions.<TransitionSpec>filter(csp.getKey().getTransitions(), _function), _function_1));
        }
      };
      Iterables.<AtomicExpression>addAll(contextExpInvs, Iterables.<AtomicExpression>concat(IterableExtensions.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Iterable<AtomicExpression>>map(this.mpp.getAllCellStates(), _function_1)));
      final Function1<GlobalAction, EList<AtomicExpression>> _function_2 = new Function1<GlobalAction, EList<AtomicExpression>>() {
        @Override
        public EList<AtomicExpression> apply(final GlobalAction ga) {
          return ga.getTrigger().getSub_exp();
        }
      };
      Iterables.<AtomicExpression>addAll(contextExpInvs, Iterables.<AtomicExpression>concat(ListExtensions.<GlobalAction, EList<AtomicExpression>>map(gg.getGlobalActions(), _function_2)));
      _xblockexpression = contextExpInvs;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateImplementation(final FilterExpression fe) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public CellContext ");
    CharSequence _generateMethodName = this.generateMethodName(fe);
    _builder.append(_generateMethodName);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<CellContext.ContextElement> newAL = new ArrayList<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (CellContext.ContextElement c : al) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (");
    final Function1<CellSpecification, CharSequence> _function = new Function1<CellSpecification, CharSequence>() {
      @Override
      public CharSequence apply(final CellSpecification ct) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(c.getCell().is");
        String _firstUpper = StringExtensions.toFirstUpper(ct.getName());
        _builder.append(_firstUpper);
        _builder.append("())");
        return _builder.toString();
      }
    };
    String _join = IterableExtensions.<CellSpecification>join(fe.getCell_type(), "||", _function);
    _builder.append(_join, "\t\t");
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
  
  protected CharSequence _generateImplementation(final StateFilterExpression sfe) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public CellContext ");
    CharSequence _generateMethodName = this.generateMethodName(sfe);
    _builder.append(_generateMethodName);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<CellContext.ContextElement> newAL = new ArrayList<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (CellContext.ContextElement c : al) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("switch (c.getCell().getState().getStateID()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    final Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Boolean> _function = new Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Boolean>() {
      @Override
      public Boolean apply(final Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> cpp) {
        return Boolean.valueOf(sfe.getCell_state().contains(cpp.getKey()));
      }
    };
    final Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, CharSequence> _function_1 = new Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, CharSequence>() {
      @Override
      public CharSequence apply(final Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> cpp) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("case ");
        Integer _key = cpp.getValue().getKey();
        _builder.append(_key);
        _builder.append(": ");
        return _builder.toString();
      }
    };
    String _join = IterableExtensions.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>join(IterableExtensions.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>filter(this.mpp.getAllCellStates(), _function), "\n", _function_1);
    _builder.append(_join, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
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
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public boolean notEmpty() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return al.size() > 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateImplementation(final EmptyExpression nee) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public boolean empty() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return al.size() == 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateImplementation(final CountExpression ce) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public int size() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return al.size();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateSignature(final FilterExpression fe) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public CellContext ");
    CharSequence _generateMethodName = this.generateMethodName(fe);
    _builder.append(_generateMethodName);
    _builder.append("();");
    return _builder;
  }
  
  protected CharSequence _generateSignature(final StateFilterExpression sfe) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public CellContext ");
    CharSequence _generateMethodName = this.generateMethodName(sfe);
    _builder.append(_generateMethodName);
    _builder.append("();");
    return _builder;
  }
  
  protected CharSequence _generateSignature(final NotEmptyExpression nee) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public boolean notEmpty();");
    return _builder;
  }
  
  protected CharSequence _generateSignature(final EmptyExpression nee) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public boolean empty();");
    return _builder;
  }
  
  protected CharSequence _generateSignature(final CountExpression ce) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public int size();");
    return _builder;
  }
  
  /**
   * Add required imports to the set given
   */
  public boolean addImports(final Set<String> imports) {
    boolean _xifexpression = false;
    boolean _needContextGeneration = this.needContextGeneration();
    if (_needContextGeneration) {
      boolean _xblockexpression = false;
      {
        imports.add("java.util.ArrayList");
        imports.add("java.util.List");
        _xblockexpression = imports.add("java.util.Iterator");
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public CharSequence generateImplementation(final AtomicExpression ce) {
    if (ce instanceof CountExpression) {
      return _generateImplementation((CountExpression)ce);
    } else if (ce instanceof EmptyExpression) {
      return _generateImplementation((EmptyExpression)ce);
    } else if (ce instanceof FilterExpression) {
      return _generateImplementation((FilterExpression)ce);
    } else if (ce instanceof NotEmptyExpression) {
      return _generateImplementation((NotEmptyExpression)ce);
    } else if (ce instanceof StateFilterExpression) {
      return _generateImplementation((StateFilterExpression)ce);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ce).toString());
    }
  }
  
  public CharSequence generateSignature(final AtomicExpression ce) {
    if (ce instanceof CountExpression) {
      return _generateSignature((CountExpression)ce);
    } else if (ce instanceof EmptyExpression) {
      return _generateSignature((EmptyExpression)ce);
    } else if (ce instanceof FilterExpression) {
      return _generateSignature((FilterExpression)ce);
    } else if (ce instanceof NotEmptyExpression) {
      return _generateSignature((NotEmptyExpression)ce);
    } else if (ce instanceof StateFilterExpression) {
      return _generateSignature((StateFilterExpression)ce);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ce).toString());
    }
  }
}

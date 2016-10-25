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
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.EmptyExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression;
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
      _builder.append("return new CellContext(x, y);");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class CellContext implements Iterable<CellContext.ContextElement> {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public class ContextElement {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("private Cell cell;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("private int dx, dy;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("public ContextElement (int dx, int dy, Cell cell) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("this.dx = dx; this.dy = dy;");
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
      _builder.append("public CellContext getContextHere() {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("return getContextAt (x + dx, y + dy);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("public int getRow() {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("return y + dy;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("public int getCol() {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("return x + dx;");
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
      _builder.append("private ArrayList<ContextElement> al = new ArrayList<> (8);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private int x, y; ");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public CellContext (int x, int y) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("this.x = x; this.y = y;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("for (int dx = -1; dx <= 1; dx ++) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("for (int dy = -1; dy <= 1; dy++) {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("if (((dx != 0) || (dy != 0)) && ");
      _builder.newLine();
      _builder.append("\t\t\t\t    ");
      _builder.append("((x + dx >= 0) && (x + dx < width)) &&");
      _builder.newLine();
      _builder.append("\t\t\t\t    ");
      _builder.append("((y + dy >= 0) && (y + dy < height)) &&");
      _builder.newLine();
      _builder.append("\t\t\t\t    ");
      _builder.append("(field[x + dx][y + dy] != null)) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("al.add (new ContextElement (dx, dy, field[x + dx][y + dy]));");
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
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public Iterator<ContextElement> iterator() {");
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
      List<AtomicExpression> _contextExpInvocations = this.getContextExpInvocations(this.gg);
      final Function1<AtomicExpression, String> _function = new Function1<AtomicExpression, String>() {
        @Override
        public String apply(final AtomicExpression e) {
          CharSequence _generateImplementation = CellContextGenerator.this.generateImplementation(e);
          return _generateImplementation.toString();
        }
      };
      List<String> _map = ListExtensions.<AtomicExpression, String>map(_contextExpInvocations, _function);
      Set<String> _set = IterableExtensions.<String>toSet(_map);
      String _join = IterableExtensions.join(_set, " ");
      _builder.append(_join, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  private boolean needContextGeneration() {
    boolean _or = false;
    EList<FieldSpecification> _fields = this.gg.getFields();
    final Function1<FieldSpecification, Boolean> _function = new Function1<FieldSpecification, Boolean>() {
      @Override
      public Boolean apply(final FieldSpecification f) {
        List<Pair<Map<String, Value>, FieldInitialisation>> _allInitialisations = CellContextGenerator.this.mpp.allInitialisations(f);
        final Function1<Pair<Map<String, Value>, FieldInitialisation>, Boolean> _function = new Function1<Pair<Map<String, Value>, FieldInitialisation>, Boolean>() {
          @Override
          public Boolean apply(final Pair<Map<String, Value>, FieldInitialisation> i) {
            FieldInitialisation _value = i.getValue();
            return Boolean.valueOf((_value instanceof ContextInitialisation));
          }
        };
        return Boolean.valueOf(IterableExtensions.<Pair<Map<String, Value>, FieldInitialisation>>exists(_allInitialisations, _function));
      }
    };
    boolean _exists = IterableExtensions.<FieldSpecification>exists(_fields, _function);
    if (_exists) {
      _or = true;
    } else {
      Iterable<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> _allStatesWithContextTriggers = this.mpp.getAllStatesWithContextTriggers();
      boolean _isEmpty = IterableExtensions.isEmpty(_allStatesWithContextTriggers);
      boolean _not = (!_isEmpty);
      _or = _not;
    }
    return _or;
  }
  
  public List<AtomicExpression> getContextExpInvocations(final GridGame gg) {
    List<AtomicExpression> _xblockexpression = null;
    {
      EList<FieldSpecification> _fields = gg.getFields();
      final Function1<FieldSpecification, Iterable<AtomicExpression>> _function = new Function1<FieldSpecification, Iterable<AtomicExpression>>() {
        @Override
        public Iterable<AtomicExpression> apply(final FieldSpecification f) {
          List<Pair<Map<String, Value>, FieldInitialisation>> _allInitialisations = CellContextGenerator.this.mpp.allInitialisations(f);
          final Function1<Pair<Map<String, Value>, FieldInitialisation>, Boolean> _function = new Function1<Pair<Map<String, Value>, FieldInitialisation>, Boolean>() {
            @Override
            public Boolean apply(final Pair<Map<String, Value>, FieldInitialisation> p) {
              FieldInitialisation _value = p.getValue();
              return Boolean.valueOf((_value instanceof ContextInitialisation));
            }
          };
          Iterable<Pair<Map<String, Value>, FieldInitialisation>> _filter = IterableExtensions.<Pair<Map<String, Value>, FieldInitialisation>>filter(_allInitialisations, _function);
          final Function1<Pair<Map<String, Value>, FieldInitialisation>, EList<AtomicExpression>> _function_1 = new Function1<Pair<Map<String, Value>, FieldInitialisation>, EList<AtomicExpression>>() {
            @Override
            public EList<AtomicExpression> apply(final Pair<Map<String, Value>, FieldInitialisation> cip) {
              EList<AtomicExpression> _xblockexpression = null;
              {
                FieldInitialisation _value = cip.getValue();
                final ContextInitialisation ci = ((ContextInitialisation) _value);
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
          Iterable<EList<AtomicExpression>> _map = IterableExtensions.<Pair<Map<String, Value>, FieldInitialisation>, EList<AtomicExpression>>map(_filter, _function_1);
          return Iterables.<AtomicExpression>concat(_map);
        }
      };
      List<Iterable<AtomicExpression>> _map = ListExtensions.<FieldSpecification, Iterable<AtomicExpression>>map(_fields, _function);
      Iterable<AtomicExpression> _flatten = Iterables.<AtomicExpression>concat(_map);
      List<AtomicExpression> contextExpInvs = IterableExtensions.<AtomicExpression>toList(_flatten);
      Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> _allCellStates = this.mpp.getAllCellStates();
      final Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Iterable<AtomicExpression>> _function_1 = new Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Iterable<AtomicExpression>>() {
        @Override
        public Iterable<AtomicExpression> apply(final Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> csp) {
          CellState _key = csp.getKey();
          EList<TransitionSpec> _transitions = _key.getTransitions();
          final Function1<TransitionSpec, Boolean> _function = new Function1<TransitionSpec, Boolean>() {
            @Override
            public Boolean apply(final TransitionSpec t) {
              TransitionTriggerSpec _trigger = t.getTrigger();
              return Boolean.valueOf((_trigger instanceof ContextTrigger));
            }
          };
          Iterable<TransitionSpec> _filter = IterableExtensions.<TransitionSpec>filter(_transitions, _function);
          final Function1<TransitionSpec, EList<AtomicExpression>> _function_1 = new Function1<TransitionSpec, EList<AtomicExpression>>() {
            @Override
            public EList<AtomicExpression> apply(final TransitionSpec t) {
              TransitionTriggerSpec _trigger = t.getTrigger();
              ContextExpression _exp = ((ContextTrigger) _trigger).getExp();
              return _exp.getSub_exp();
            }
          };
          Iterable<EList<AtomicExpression>> _map = IterableExtensions.<TransitionSpec, EList<AtomicExpression>>map(_filter, _function_1);
          return Iterables.<AtomicExpression>concat(_map);
        }
      };
      Iterable<Iterable<AtomicExpression>> _map_1 = IterableExtensions.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Iterable<AtomicExpression>>map(_allCellStates, _function_1);
      Iterable<AtomicExpression> _flatten_1 = Iterables.<AtomicExpression>concat(_map_1);
      Iterables.<AtomicExpression>addAll(contextExpInvs, _flatten_1);
      _xblockexpression = contextExpInvs;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateImplementation(final FilterExpression fe) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public CellContext ");
    CharSequence _generateMethodName = this.generateMethodName(fe);
    _builder.append(_generateMethodName, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<ContextElement> newAL = new ArrayList<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (ContextElement c : al) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (");
    EList<CellSpecification> _cell_type = fe.getCell_type();
    final Function1<CellSpecification, CharSequence> _function = new Function1<CellSpecification, CharSequence>() {
      @Override
      public CharSequence apply(final CellSpecification ct) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(c.getCell().is");
        String _name = ct.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "");
        _builder.append("())");
        return _builder.toString();
      }
    };
    String _join = IterableExtensions.<CellSpecification>join(_cell_type, "||", _function);
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
    _builder.append("public CellContext ");
    CharSequence _generateMethodName = this.generateMethodName(sfe);
    _builder.append(_generateMethodName, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<ContextElement> newAL = new ArrayList<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (ContextElement c : al) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("switch (c.getCell().getState().getStateID()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> _allCellStates = this.mpp.getAllCellStates();
    final Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Boolean> _function = new Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Boolean>() {
      @Override
      public Boolean apply(final Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> cpp) {
        EList<CellState> _cell_state = sfe.getCell_state();
        CellState _key = cpp.getKey();
        return Boolean.valueOf(_cell_state.contains(_key));
      }
    };
    Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> _filter = IterableExtensions.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>filter(_allCellStates, _function);
    final Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, CharSequence> _function_1 = new Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, CharSequence>() {
      @Override
      public CharSequence apply(final Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> cpp) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("case ");
        Pair<Integer, ? extends Map<String, Value>> _value = cpp.getValue();
        Integer _key = _value.getKey();
        _builder.append(_key, "");
        _builder.append(": ");
        return _builder.toString();
      }
    };
    String _join = IterableExtensions.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>join(_filter, "\n", _function_1);
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
    _builder.append("public int size() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return al.size();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
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
}

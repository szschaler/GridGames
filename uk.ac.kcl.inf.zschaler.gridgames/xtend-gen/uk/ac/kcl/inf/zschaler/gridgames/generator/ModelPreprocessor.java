package uk.ac.kcl.inf.zschaler.gridgames.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisations;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisationsRef;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GenerationalContexts;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalCellStateSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalFieldInitialisations;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.OptionSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ParamSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionTriggerSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value;

/**
 * Preprocesses the model, normalising structures and computing helper data such as unique cell state IDs.
 */
@SuppressWarnings("all")
public class ModelPreprocessor {
  private final Resource resource;
  
  private final GridGame gg;
  
  private final Map<CellSpecification, List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> cellStateRegistry = new HashMap<CellSpecification, List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>();
  
  private int currentStateID = 0;
  
  public ModelPreprocessor(final Resource resource) {
    this.resource = resource;
    this.gg = IteratorExtensions.<GridGame>head(Iterators.<GridGame>filter(resource.getAllContents(), GridGame.class));
    this.preprocess();
  }
  
  private void preprocess() {
    final Consumer<CellSpecification> _function = new Consumer<CellSpecification>() {
      @Override
      public void accept(final CellSpecification c) {
        ModelPreprocessor.this.normalizeDisplayAnnotation(c);
        final Consumer<Pair<? extends Map<String, Value>, CellState>> _function = new Consumer<Pair<? extends Map<String, Value>, CellState>>() {
          @Override
          public void accept(final Pair<? extends Map<String, Value>, CellState> cs) {
            ModelPreprocessor.this.createUniqueID(cs, c);
          }
        };
        ModelPreprocessor.this.extractCellStates(c).forEach(_function);
      }
    };
    this.gg.getCells().forEach(_function);
  }
  
  public GridGame getGridGame() {
    return this.gg;
  }
  
  /**
   * Creates a unique ID for the combination of cell and cell state, also enabling future clients to access the symbol table through this.
   */
  private boolean createUniqueID(final Pair<? extends Map<String, Value>, CellState> stateDef, final CellSpecification c) {
    boolean _xblockexpression = false;
    {
      List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> states = this.cellStateRegistry.get(c);
      boolean _equals = Objects.equal(states, null);
      if (_equals) {
        LinkedList<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> _linkedList = new LinkedList<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>();
        states = _linkedList;
        this.cellStateRegistry.put(c, states);
      }
      CellState _value = stateDef.getValue();
      int _plusPlus = this.currentStateID++;
      Map<String, Value> _key = stateDef.getKey();
      Pair<Integer, Map<String, Value>> _pair = new Pair<Integer, Map<String, Value>>(Integer.valueOf(_plusPlus), _key);
      Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> _pair_1 = new Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>(_value, _pair);
      _xblockexpression = states.add(_pair_1);
    }
    return _xblockexpression;
  }
  
  /**
   * Normalize display annotations for this cell specification. If there are no states,
   * but a display annotation, create an artifical default state moving the display annotation
   * over.
   * 
   * TODO Eventually might want to enable sharing of display annotations between a number of states.
   */
  private void normalizeDisplayAnnotation(final CellSpecification c) {
    if ((IterableExtensions.isEmpty(Iterables.<CellStateSpec>filter(c.getMembers(), CellStateSpec.class)) && (!IterableExtensions.isEmpty(Iterables.<CellDisplaySpec>filter(c.getMembers(), CellDisplaySpec.class))))) {
      final Function1<EClassifier, Boolean> _function = new Function1<EClassifier, Boolean>() {
        @Override
        public Boolean apply(final EClassifier ec) {
          return Boolean.valueOf(ec.getName().equals("LocalCellStateSpec"));
        }
      };
      EClassifier _findFirst = IterableExtensions.<EClassifier>findFirst(this.gg.eClass().getEPackage().getEClassifiers(), _function);
      EObject _create = this.gg.eClass().getEPackage().getEFactoryInstance().create(((EClass) _findFirst));
      LocalCellStateSpec stateSpec = ((LocalCellStateSpec) _create);
      final Function1<EClassifier, Boolean> _function_1 = new Function1<EClassifier, Boolean>() {
        @Override
        public Boolean apply(final EClassifier ec) {
          return Boolean.valueOf(ec.getName().equals("CellState"));
        }
      };
      EClassifier _findFirst_1 = IterableExtensions.<EClassifier>findFirst(this.gg.eClass().getEPackage().getEClassifiers(), _function_1);
      EObject _create_1 = this.gg.eClass().getEPackage().getEFactoryInstance().create(((EClass) _findFirst_1));
      CellState dummyState = ((CellState) _create_1);
      dummyState.setName("default");
      stateSpec.getStates().add(dummyState);
      c.getMembers().add(stateSpec);
      final Function1<CellDisplaySpec, Boolean> _function_2 = new Function1<CellDisplaySpec, Boolean>() {
        @Override
        public Boolean apply(final CellDisplaySpec it) {
          return Boolean.valueOf(true);
        }
      };
      dummyState.setDisplay(IterableExtensions.<CellDisplaySpec>findFirst(Iterables.<CellDisplaySpec>filter(c.getMembers(), CellDisplaySpec.class), _function_2));
      stateSpec.setStart(dummyState);
    }
  }
  
  /**
   * Analyse cell state definition and extract a list of cell-state symbol-table mappings for the given cell specification
   */
  private Iterable<Pair<? extends Map<String, Value>, CellState>> extractCellStates(final CellSpecification c) {
    final Function1<CellStateSpec, List<Pair<? extends Map<String, Value>, CellState>>> _function = new Function1<CellStateSpec, List<Pair<? extends Map<String, Value>, CellState>>>() {
      @Override
      public List<Pair<? extends Map<String, Value>, CellState>> apply(final CellStateSpec css) {
        return ModelPreprocessor.this.getAllStates(css);
      }
    };
    return Iterables.<Pair<? extends Map<String, Value>, CellState>>concat(IterableExtensions.<CellStateSpec, List<Pair<? extends Map<String, Value>, CellState>>>map(Iterables.<CellStateSpec>filter(c.getMembers(), CellStateSpec.class), _function));
  }
  
  private List<Pair<? extends Map<String, Value>, CellState>> _getAllStates(final LocalCellStateSpec lcss) {
    List<Pair<? extends Map<String, Value>, CellState>> _xblockexpression = null;
    {
      final Map<String, Value> symbols = Collections.<String, Value>emptyMap();
      final Function1<CellState, Pair<? extends Map<String, Value>, CellState>> _function = new Function1<CellState, Pair<? extends Map<String, Value>, CellState>>() {
        @Override
        public Pair<? extends Map<String, Value>, CellState> apply(final CellState s) {
          return new Pair<Map<String, Value>, CellState>(symbols, s);
        }
      };
      _xblockexpression = ListExtensions.<CellState, Pair<? extends Map<String, Value>, CellState>>map(lcss.getStates(), _function);
    }
    return _xblockexpression;
  }
  
  private List<Pair<? extends Map<String, Value>, CellState>> _getAllStates(final CellStateSpecReference cssr) {
    List<Pair<? extends Map<String, Value>, CellState>> _xblockexpression = null;
    {
      final HashMap<String, Value> symbols = new HashMap<String, Value>();
      final Iterator<Value> iter = cssr.getParams().iterator();
      final Consumer<ParamSpec> _function = new Consumer<ParamSpec>() {
        @Override
        public void accept(final ParamSpec p) {
          symbols.put(p.getName(), iter.next());
        }
      };
      cssr.getStateSpec().getParams().forEach(_function);
      final Function1<CellState, Pair<? extends Map<String, Value>, CellState>> _function_1 = new Function1<CellState, Pair<? extends Map<String, Value>, CellState>>() {
        @Override
        public Pair<? extends Map<String, Value>, CellState> apply(final CellState s) {
          return new Pair<HashMap<String, Value>, CellState>(symbols, s);
        }
      };
      _xblockexpression = ListExtensions.<CellState, Pair<? extends Map<String, Value>, CellState>>map(cssr.getStateSpec().getStates(), _function_1);
    }
    return _xblockexpression;
  }
  
  public CellState _getStartState(final CellSpecification c) {
    final Function1<CellStateSpec, CellState> _function = new Function1<CellStateSpec, CellState>() {
      @Override
      public CellState apply(final CellStateSpec css) {
        return ModelPreprocessor.this.getStartState(css);
      }
    };
    final Function1<CellState, Boolean> _function_1 = new Function1<CellState, Boolean>() {
      @Override
      public Boolean apply(final CellState it) {
        return Boolean.valueOf(true);
      }
    };
    return IterableExtensions.<CellState>findFirst(IterableExtensions.<CellStateSpec, CellState>map(Iterables.<CellStateSpec>filter(c.getMembers(), CellStateSpec.class), _function), _function_1);
  }
  
  public CellState _getStartState(final LocalCellStateSpec lcss) {
    return lcss.getStart();
  }
  
  public CellState _getStartState(final CellStateSpecReference cssr) {
    return cssr.getStateSpec().getStart();
  }
  
  public Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> getCellStates(final CellSpecification c) {
    return this.cellStateRegistry.get(c);
  }
  
  public Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> getAllCellStates() {
    return Iterables.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>concat(this.cellStateRegistry.values());
  }
  
  /**
   * Find all states with an onEnter action.
   * 
   * TODO Eventually need to take into account parametrisation of behaviours.
   */
  public Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> getAllStatesWithEnterActions() {
    final Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Boolean> _function = new Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Boolean>() {
      @Override
      public Boolean apply(final Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> cpp) {
        boolean _isEmpty = cpp.getKey().getOnEnter().isEmpty();
        return Boolean.valueOf((!_isEmpty));
      }
    };
    return IterableExtensions.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>filter(Iterables.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>concat(this.cellStateRegistry.values()), _function);
  }
  
  /**
   * Find all states with a transition triggered by context changes
   */
  public Iterable<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> getAllStatesWithContextTriggers() {
    final Function1<Map.Entry<CellSpecification, List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>, List<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>> _function = new Function1<Map.Entry<CellSpecification, List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>, List<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>>() {
      @Override
      public List<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> apply(final Map.Entry<CellSpecification, List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> pp) {
        final Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> _function = new Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>() {
          @Override
          public Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> apply(final Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> p) {
            CellSpecification _key = pp.getKey();
            return new Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>(_key, p);
          }
        };
        return ListExtensions.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>map(pp.getValue(), _function);
      }
    };
    final Function1<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>, Boolean> _function_1 = new Function1<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>, Boolean>() {
      @Override
      public Boolean apply(final Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> p) {
        final Function1<TransitionSpec, Boolean> _function = new Function1<TransitionSpec, Boolean>() {
          @Override
          public Boolean apply(final TransitionSpec t) {
            TransitionTriggerSpec _trigger = t.getTrigger();
            return Boolean.valueOf((_trigger instanceof ContextTrigger));
          }
        };
        return Boolean.valueOf(IterableExtensions.<TransitionSpec>exists(p.getValue().getKey().getTransitions(), _function));
      }
    };
    return IterableExtensions.<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>filter(Iterables.<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>concat(IterableExtensions.<Map.Entry<CellSpecification, List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>, List<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>>map(this.cellStateRegistry.entrySet(), _function)), _function_1);
  }
  
  private Map<FieldSpecification, List<Pair<Map<String, Value>, FieldInitialisation>>> fieldInitialisations;
  
  public List<Pair<Map<String, Value>, FieldInitialisation>> allInitialisations(final FieldSpecification fs) {
    List<Pair<Map<String, Value>, FieldInitialisation>> _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.fieldInitialisations, null);
      if (_equals) {
        this.initialiseFieldInitialisations();
      }
      _xblockexpression = this.fieldInitialisations.get(fs);
    }
    return _xblockexpression;
  }
  
  private void initialiseFieldInitialisations() {
    HashMap<FieldSpecification, List<Pair<Map<String, Value>, FieldInitialisation>>> _hashMap = new HashMap<FieldSpecification, List<Pair<Map<String, Value>, FieldInitialisation>>>();
    this.fieldInitialisations = _hashMap;
    final Consumer<FieldSpecification> _function = new Consumer<FieldSpecification>() {
      @Override
      public void accept(final FieldSpecification f) {
        ModelPreprocessor.this.fieldInitialisations.put(f, ModelPreprocessor.this.getAllInitialisations(f.getField_initialisation()));
      }
    };
    this.gg.getFields().forEach(_function);
  }
  
  private List<Pair<Map<String, Value>, FieldInitialisation>> _getAllInitialisations(final LocalFieldInitialisations lfi) {
    List<Pair<Map<String, Value>, FieldInitialisation>> _xblockexpression = null;
    {
      final Map<String, Value> symbols = Collections.<String, Value>emptyMap();
      final Function1<FieldInitialisation, Pair<Map<String, Value>, FieldInitialisation>> _function = new Function1<FieldInitialisation, Pair<Map<String, Value>, FieldInitialisation>>() {
        @Override
        public Pair<Map<String, Value>, FieldInitialisation> apply(final FieldInitialisation i) {
          return new Pair<Map<String, Value>, FieldInitialisation>(symbols, i);
        }
      };
      _xblockexpression = ListExtensions.<FieldInitialisation, Pair<Map<String, Value>, FieldInitialisation>>map(lfi.getInitialisations(), _function);
    }
    return _xblockexpression;
  }
  
  private List<Pair<Map<String, Value>, FieldInitialisation>> _getAllInitialisations(final FieldInitialisationsRef fir) {
    List<Pair<Map<String, Value>, FieldInitialisation>> _xblockexpression = null;
    {
      final Map<String, Value> symbols = new HashMap<String, Value>();
      final Procedure2<ParamSpec, Integer> _function = new Procedure2<ParamSpec, Integer>() {
        @Override
        public void apply(final ParamSpec p, final Integer idx) {
          symbols.put(p.getName(), fir.getParams().get((idx).intValue()));
        }
      };
      IterableExtensions.<ParamSpec>forEach(fir.getRef().getParams(), _function);
      final Function1<FieldInitialisation, Pair<Map<String, Value>, FieldInitialisation>> _function_1 = new Function1<FieldInitialisation, Pair<Map<String, Value>, FieldInitialisation>>() {
        @Override
        public Pair<Map<String, Value>, FieldInitialisation> apply(final FieldInitialisation i) {
          return new Pair<Map<String, Value>, FieldInitialisation>(symbols, i);
        }
      };
      _xblockexpression = ListExtensions.<FieldInitialisation, Pair<Map<String, Value>, FieldInitialisation>>map(fir.getRef().getInitialisations(), _function_1);
    }
    return _xblockexpression;
  }
  
  /**
   * Return true if generational context updates should be generated rather than incremental, reactive ones
   */
  public boolean doGenerateGenerationalContexts() {
    final Function1<OptionSpecification, Boolean> _function = new Function1<OptionSpecification, Boolean>() {
      @Override
      public Boolean apply(final OptionSpecification o) {
        return Boolean.valueOf((o instanceof GenerationalContexts));
      }
    };
    return IterableExtensions.<OptionSpecification>exists(this.gg.getOptions(), _function);
  }
  
  private List<Pair<? extends Map<String, Value>, CellState>> getAllStates(final CellStateSpec cssr) {
    if (cssr instanceof CellStateSpecReference) {
      return _getAllStates((CellStateSpecReference)cssr);
    } else if (cssr instanceof LocalCellStateSpec) {
      return _getAllStates((LocalCellStateSpec)cssr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cssr).toString());
    }
  }
  
  public CellState getStartState(final EObject cssr) {
    if (cssr instanceof CellStateSpecReference) {
      return _getStartState((CellStateSpecReference)cssr);
    } else if (cssr instanceof LocalCellStateSpec) {
      return _getStartState((LocalCellStateSpec)cssr);
    } else if (cssr instanceof CellSpecification) {
      return _getStartState((CellSpecification)cssr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cssr).toString());
    }
  }
  
  private List<Pair<Map<String, Value>, FieldInitialisation>> getAllInitialisations(final FieldInitialisations fir) {
    if (fir instanceof FieldInitialisationsRef) {
      return _getAllInitialisations((FieldInitialisationsRef)fir);
    } else if (fir instanceof LocalFieldInitialisations) {
      return _getAllInitialisations((LocalFieldInitialisations)fir);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(fir).toString());
    }
  }
}

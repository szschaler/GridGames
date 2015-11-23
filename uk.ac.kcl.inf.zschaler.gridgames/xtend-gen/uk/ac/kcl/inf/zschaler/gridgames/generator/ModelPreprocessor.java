package uk.ac.kcl.inf.zschaler.gridgames.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellMember;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateBehaviour;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisations;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisationsRef;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GenerationalContexts;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation;
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
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<GridGame> _filter = Iterators.<GridGame>filter(_allContents, GridGame.class);
    GridGame _head = IteratorExtensions.<GridGame>head(_filter);
    this.gg = _head;
    this.preprocess();
  }
  
  private void preprocess() {
    EList<CellSpecification> _cells = this.gg.getCells();
    final Consumer<CellSpecification> _function = new Consumer<CellSpecification>() {
      @Override
      public void accept(final CellSpecification c) {
        ModelPreprocessor.this.normalizeDisplayAnnotation(c);
        Iterable<Pair<? extends Map<String, Value>, CellState>> _extractCellStates = ModelPreprocessor.this.extractCellStates(c);
        final Consumer<Pair<? extends Map<String, Value>, CellState>> _function = new Consumer<Pair<? extends Map<String, Value>, CellState>>() {
          @Override
          public void accept(final Pair<? extends Map<String, Value>, CellState> cs) {
            ModelPreprocessor.this.createUniqueID(cs, c);
          }
        };
        _extractCellStates.forEach(_function);
      }
    };
    _cells.forEach(_function);
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
          return Boolean.valueOf(_name.equals("LocalCellStateSpec"));
        }
      };
      EClassifier _findFirst = IterableExtensions.<EClassifier>findFirst(_eClassifiers, _function);
      EObject _create = _eFactoryInstance.create(((EClass) _findFirst));
      LocalCellStateSpec stateSpec = ((LocalCellStateSpec) _create);
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
   * Analyse cell state definition and extract a list of cell-state symbol-table mappings for the given cell specification
   */
  private Iterable<Pair<? extends Map<String, Value>, CellState>> extractCellStates(final CellSpecification c) {
    EList<CellMember> _members = c.getMembers();
    Iterable<CellStateSpec> _filter = Iterables.<CellStateSpec>filter(_members, CellStateSpec.class);
    final Function1<CellStateSpec, List<Pair<? extends Map<String, Value>, CellState>>> _function = new Function1<CellStateSpec, List<Pair<? extends Map<String, Value>, CellState>>>() {
      @Override
      public List<Pair<? extends Map<String, Value>, CellState>> apply(final CellStateSpec css) {
        return ModelPreprocessor.this.getAllStates(css);
      }
    };
    Iterable<List<Pair<? extends Map<String, Value>, CellState>>> _map = IterableExtensions.<CellStateSpec, List<Pair<? extends Map<String, Value>, CellState>>>map(_filter, _function);
    return Iterables.<Pair<? extends Map<String, Value>, CellState>>concat(_map);
  }
  
  private List<Pair<? extends Map<String, Value>, CellState>> _getAllStates(final LocalCellStateSpec lcss) {
    List<Pair<? extends Map<String, Value>, CellState>> _xblockexpression = null;
    {
      final Map<String, Value> symbols = Collections.<String, Value>emptyMap();
      EList<CellState> _states = lcss.getStates();
      final Function1<CellState, Pair<? extends Map<String, Value>, CellState>> _function = new Function1<CellState, Pair<? extends Map<String, Value>, CellState>>() {
        @Override
        public Pair<? extends Map<String, Value>, CellState> apply(final CellState s) {
          return new Pair<Map<String, Value>, CellState>(symbols, s);
        }
      };
      _xblockexpression = ListExtensions.<CellState, Pair<? extends Map<String, Value>, CellState>>map(_states, _function);
    }
    return _xblockexpression;
  }
  
  private List<Pair<? extends Map<String, Value>, CellState>> _getAllStates(final CellStateSpecReference cssr) {
    List<Pair<? extends Map<String, Value>, CellState>> _xblockexpression = null;
    {
      final HashMap<String, Value> symbols = new HashMap<String, Value>();
      EList<Value> _params = cssr.getParams();
      final Iterator<Value> iter = _params.iterator();
      GlobalCellStateSpec _stateSpec = cssr.getStateSpec();
      EList<ParamSpec> _params_1 = _stateSpec.getParams();
      final Consumer<ParamSpec> _function = new Consumer<ParamSpec>() {
        @Override
        public void accept(final ParamSpec p) {
          String _name = p.getName();
          Value _next = iter.next();
          symbols.put(_name, _next);
        }
      };
      _params_1.forEach(_function);
      GlobalCellStateSpec _stateSpec_1 = cssr.getStateSpec();
      EList<CellState> _states = _stateSpec_1.getStates();
      final Function1<CellState, Pair<? extends Map<String, Value>, CellState>> _function_1 = new Function1<CellState, Pair<? extends Map<String, Value>, CellState>>() {
        @Override
        public Pair<? extends Map<String, Value>, CellState> apply(final CellState s) {
          return new Pair<HashMap<String, Value>, CellState>(symbols, s);
        }
      };
      _xblockexpression = ListExtensions.<CellState, Pair<? extends Map<String, Value>, CellState>>map(_states, _function_1);
    }
    return _xblockexpression;
  }
  
  public CellState _getStartState(final CellSpecification c) {
    EList<CellMember> _members = c.getMembers();
    Iterable<CellStateSpec> _filter = Iterables.<CellStateSpec>filter(_members, CellStateSpec.class);
    final Function1<CellStateSpec, CellState> _function = new Function1<CellStateSpec, CellState>() {
      @Override
      public CellState apply(final CellStateSpec css) {
        return ModelPreprocessor.this.getStartState(css);
      }
    };
    Iterable<CellState> _map = IterableExtensions.<CellStateSpec, CellState>map(_filter, _function);
    final Function1<CellState, Boolean> _function_1 = new Function1<CellState, Boolean>() {
      @Override
      public Boolean apply(final CellState it) {
        return Boolean.valueOf(true);
      }
    };
    return IterableExtensions.<CellState>findFirst(_map, _function_1);
  }
  
  public CellState _getStartState(final LocalCellStateSpec lcss) {
    return lcss.getStart();
  }
  
  public CellState _getStartState(final CellStateSpecReference cssr) {
    GlobalCellStateSpec _stateSpec = cssr.getStateSpec();
    return _stateSpec.getStart();
  }
  
  public Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> getCellStates(final CellSpecification c) {
    return this.cellStateRegistry.get(c);
  }
  
  public Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> getAllCellStates() {
    Collection<List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> _values = this.cellStateRegistry.values();
    return Iterables.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>concat(_values);
  }
  
  /**
   * Find all states with an onEnter action.
   * 
   * TODO Eventually need to take into account parametrisation of behaviours.
   */
  public Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> getAllStatesWithEnterActions() {
    Collection<List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> _values = this.cellStateRegistry.values();
    Iterable<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> _flatten = Iterables.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>concat(_values);
    final Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Boolean> _function = new Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Boolean>() {
      @Override
      public Boolean apply(final Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> cpp) {
        CellState _key = cpp.getKey();
        EList<CellStateBehaviour> _onEnter = _key.getOnEnter();
        boolean _isEmpty = _onEnter.isEmpty();
        return Boolean.valueOf((!_isEmpty));
      }
    };
    return IterableExtensions.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>filter(_flatten, _function);
  }
  
  /**
   * Find all states with a transition triggered by context changes
   */
  public Iterable<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> getAllStatesWithContextTriggers() {
    Set<Map.Entry<CellSpecification, List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>> _entrySet = this.cellStateRegistry.entrySet();
    final Function1<Map.Entry<CellSpecification, List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>, List<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>> _function = new Function1<Map.Entry<CellSpecification, List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>, List<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>>() {
      @Override
      public List<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> apply(final Map.Entry<CellSpecification, List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> pp) {
        List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> _value = pp.getValue();
        final Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> _function = new Function1<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>() {
          @Override
          public Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> apply(final Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> p) {
            CellSpecification _key = pp.getKey();
            return new Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>(_key, p);
          }
        };
        return ListExtensions.<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>, Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>map(_value, _function);
      }
    };
    Iterable<List<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>> _map = IterableExtensions.<Map.Entry<CellSpecification, List<Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>, List<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>>map(_entrySet, _function);
    Iterable<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>> _flatten = Iterables.<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>concat(_map);
    final Function1<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>, Boolean> _function_1 = new Function1<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>, Boolean>() {
      @Override
      public Boolean apply(final Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>> p) {
        Pair<CellState, Pair<Integer, ? extends Map<String, Value>>> _value = p.getValue();
        CellState _key = _value.getKey();
        EList<TransitionSpec> _transitions = _key.getTransitions();
        final Function1<TransitionSpec, Boolean> _function = new Function1<TransitionSpec, Boolean>() {
          @Override
          public Boolean apply(final TransitionSpec t) {
            TransitionTriggerSpec _trigger = t.getTrigger();
            return Boolean.valueOf((_trigger instanceof ContextTrigger));
          }
        };
        return Boolean.valueOf(IterableExtensions.<TransitionSpec>exists(_transitions, _function));
      }
    };
    return IterableExtensions.<Pair<CellSpecification, Pair<CellState, Pair<Integer, ? extends Map<String, Value>>>>>filter(_flatten, _function_1);
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
    EList<FieldSpecification> _fields = this.gg.getFields();
    final Consumer<FieldSpecification> _function = new Consumer<FieldSpecification>() {
      @Override
      public void accept(final FieldSpecification f) {
        FieldInitialisations _field_initialisation = f.getField_initialisation();
        List<Pair<Map<String, Value>, FieldInitialisation>> _allInitialisations = ModelPreprocessor.this.getAllInitialisations(_field_initialisation);
        ModelPreprocessor.this.fieldInitialisations.put(f, _allInitialisations);
      }
    };
    _fields.forEach(_function);
  }
  
  private List<Pair<Map<String, Value>, FieldInitialisation>> _getAllInitialisations(final LocalFieldInitialisations lfi) {
    List<Pair<Map<String, Value>, FieldInitialisation>> _xblockexpression = null;
    {
      final Map<String, Value> symbols = Collections.<String, Value>emptyMap();
      EList<FieldInitialisation> _initialisations = lfi.getInitialisations();
      final Function1<FieldInitialisation, Pair<Map<String, Value>, FieldInitialisation>> _function = new Function1<FieldInitialisation, Pair<Map<String, Value>, FieldInitialisation>>() {
        @Override
        public Pair<Map<String, Value>, FieldInitialisation> apply(final FieldInitialisation i) {
          return new Pair<Map<String, Value>, FieldInitialisation>(symbols, i);
        }
      };
      _xblockexpression = ListExtensions.<FieldInitialisation, Pair<Map<String, Value>, FieldInitialisation>>map(_initialisations, _function);
    }
    return _xblockexpression;
  }
  
  private List<Pair<Map<String, Value>, FieldInitialisation>> _getAllInitialisations(final FieldInitialisationsRef fir) {
    List<Pair<Map<String, Value>, FieldInitialisation>> _xblockexpression = null;
    {
      final Map<String, Value> symbols = new HashMap<String, Value>();
      GlobalFieldInitialisation _ref = fir.getRef();
      EList<ParamSpec> _params = _ref.getParams();
      final Procedure2<ParamSpec, Integer> _function = new Procedure2<ParamSpec, Integer>() {
        @Override
        public void apply(final ParamSpec p, final Integer idx) {
          String _name = p.getName();
          EList<Value> _params = fir.getParams();
          Value _get = _params.get((idx).intValue());
          symbols.put(_name, _get);
        }
      };
      IterableExtensions.<ParamSpec>forEach(_params, _function);
      GlobalFieldInitialisation _ref_1 = fir.getRef();
      EList<FieldInitialisation> _initialisations = _ref_1.getInitialisations();
      final Function1<FieldInitialisation, Pair<Map<String, Value>, FieldInitialisation>> _function_1 = new Function1<FieldInitialisation, Pair<Map<String, Value>, FieldInitialisation>>() {
        @Override
        public Pair<Map<String, Value>, FieldInitialisation> apply(final FieldInitialisation i) {
          return new Pair<Map<String, Value>, FieldInitialisation>(symbols, i);
        }
      };
      _xblockexpression = ListExtensions.<FieldInitialisation, Pair<Map<String, Value>, FieldInitialisation>>map(_initialisations, _function_1);
    }
    return _xblockexpression;
  }
  
  /**
   * Return true if generational context updates should be generated rather than incremental, reactive ones
   */
  public boolean doGenerateGenerationalContexts() {
    EList<OptionSpecification> _options = this.gg.getOptions();
    final Function1<OptionSpecification, Boolean> _function = new Function1<OptionSpecification, Boolean>() {
      @Override
      public Boolean apply(final OptionSpecification o) {
        return Boolean.valueOf((o instanceof GenerationalContexts));
      }
    };
    return IterableExtensions.<OptionSpecification>exists(_options, _function);
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

/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GridGameFactoryImpl extends EFactoryImpl implements GridGameFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GridGameFactory init()
  {
    try
    {
      GridGameFactory theGridGameFactory = (GridGameFactory)EPackage.Registry.INSTANCE.getEFactory(GridGamePackage.eNS_URI);
      if (theGridGameFactory != null)
      {
        return theGridGameFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GridGameFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GridGameFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GridGamePackage.GRID_GAME: return createGridGame();
      case GridGamePackage.CELL_SPECIFICATION: return createCellSpecification();
      case GridGamePackage.CELL_MEMBER: return createCellMember();
      case GridGamePackage.CELL_DISPLAY_SPEC: return createCellDisplaySpec();
      case GridGamePackage.VAR_SPEC: return createVarSpec();
      case GridGamePackage.CELL_VAR_SPEC: return createCellVarSpec();
      case GridGamePackage.GLOBAL_CELL_STATE_SPEC: return createGlobalCellStateSpec();
      case GridGamePackage.PARAM_SPEC: return createParamSpec();
      case GridGamePackage.CELL_STATE_SPEC: return createCellStateSpec();
      case GridGamePackage.LOCAL_CELL_STATE_SPEC: return createLocalCellStateSpec();
      case GridGamePackage.CELL_STATE_SPEC_REFERENCE: return createCellStateSpecReference();
      case GridGamePackage.VALUE: return createValue();
      case GridGamePackage.STRING_VALUE: return createStringValue();
      case GridGamePackage.INT_VALUE: return createIntValue();
      case GridGamePackage.VAR_REF_VALUE: return createVarRefValue();
      case GridGamePackage.CELL_STATE: return createCellState();
      case GridGamePackage.TRANSITION_SPEC: return createTransitionSpec();
      case GridGamePackage.CELL_STATE_BEHAVIOUR: return createCellStateBehaviour();
      case GridGamePackage.BEHAVIOUR_REFERENCE: return createBehaviourReference();
      case GridGamePackage.DIRECT_BEHAVIOUR: return createDirectBehaviour();
      case GridGamePackage.END_GAME_BEHAVIOUR: return createEndGameBehaviour();
      case GridGamePackage.FIELD_SPECIFICATION: return createFieldSpecification();
      case GridGamePackage.OPTION_SPECIFICATION: return createOptionSpecification();
      case GridGamePackage.ALLOW_RESTART_MENU: return createAllowRestartMenu();
      case GridGamePackage.START_FIELD_DECLARATION: return createStartFieldDeclaration();
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION: return createGlobalFieldInitialisation();
      case GridGamePackage.FIELD_INITIALISATIONS: return createFieldInitialisations();
      case GridGamePackage.FIELD_INITIALISATION: return createFieldInitialisation();
      case GridGamePackage.DEFAULT_INITIALISATION: return createDefaultInitialisation();
      case GridGamePackage.RANDOM_INITIALISATION: return createRandomInitialisation();
      case GridGamePackage.CONTEXT_INITIALISATION: return createContextInitialisation();
      case GridGamePackage.CONTEXT_EXPRESSION: return createContextExpression();
      case GridGamePackage.ATOMIC_EXPRESSION: return createAtomicExpression();
      case GridGamePackage.FILTER_EXPRESSION: return createFilterExpression();
      case GridGamePackage.COUNT_EXPRESSION: return createCountExpression();
      case GridGamePackage.NOT_EMPTY_EXPRESSION: return createNotEmptyExpression();
      case GridGamePackage.NO_OP_BEHAVIOUR: return createNoOpBehaviour();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GridGame createGridGame()
  {
    GridGameImpl gridGame = new GridGameImpl();
    return gridGame;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellSpecification createCellSpecification()
  {
    CellSpecificationImpl cellSpecification = new CellSpecificationImpl();
    return cellSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellMember createCellMember()
  {
    CellMemberImpl cellMember = new CellMemberImpl();
    return cellMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellDisplaySpec createCellDisplaySpec()
  {
    CellDisplaySpecImpl cellDisplaySpec = new CellDisplaySpecImpl();
    return cellDisplaySpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarSpec createVarSpec()
  {
    VarSpecImpl varSpec = new VarSpecImpl();
    return varSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellVarSpec createCellVarSpec()
  {
    CellVarSpecImpl cellVarSpec = new CellVarSpecImpl();
    return cellVarSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalCellStateSpec createGlobalCellStateSpec()
  {
    GlobalCellStateSpecImpl globalCellStateSpec = new GlobalCellStateSpecImpl();
    return globalCellStateSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamSpec createParamSpec()
  {
    ParamSpecImpl paramSpec = new ParamSpecImpl();
    return paramSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellStateSpec createCellStateSpec()
  {
    CellStateSpecImpl cellStateSpec = new CellStateSpecImpl();
    return cellStateSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalCellStateSpec createLocalCellStateSpec()
  {
    LocalCellStateSpecImpl localCellStateSpec = new LocalCellStateSpecImpl();
    return localCellStateSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellStateSpecReference createCellStateSpecReference()
  {
    CellStateSpecReferenceImpl cellStateSpecReference = new CellStateSpecReferenceImpl();
    return cellStateSpecReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarRefValue createVarRefValue()
  {
    VarRefValueImpl varRefValue = new VarRefValueImpl();
    return varRefValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellState createCellState()
  {
    CellStateImpl cellState = new CellStateImpl();
    return cellState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionSpec createTransitionSpec()
  {
    TransitionSpecImpl transitionSpec = new TransitionSpecImpl();
    return transitionSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellStateBehaviour createCellStateBehaviour()
  {
    CellStateBehaviourImpl cellStateBehaviour = new CellStateBehaviourImpl();
    return cellStateBehaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviourReference createBehaviourReference()
  {
    BehaviourReferenceImpl behaviourReference = new BehaviourReferenceImpl();
    return behaviourReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectBehaviour createDirectBehaviour()
  {
    DirectBehaviourImpl directBehaviour = new DirectBehaviourImpl();
    return directBehaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndGameBehaviour createEndGameBehaviour()
  {
    EndGameBehaviourImpl endGameBehaviour = new EndGameBehaviourImpl();
    return endGameBehaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldSpecification createFieldSpecification()
  {
    FieldSpecificationImpl fieldSpecification = new FieldSpecificationImpl();
    return fieldSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionSpecification createOptionSpecification()
  {
    OptionSpecificationImpl optionSpecification = new OptionSpecificationImpl();
    return optionSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllowRestartMenu createAllowRestartMenu()
  {
    AllowRestartMenuImpl allowRestartMenu = new AllowRestartMenuImpl();
    return allowRestartMenu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartFieldDeclaration createStartFieldDeclaration()
  {
    StartFieldDeclarationImpl startFieldDeclaration = new StartFieldDeclarationImpl();
    return startFieldDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalFieldInitialisation createGlobalFieldInitialisation()
  {
    GlobalFieldInitialisationImpl globalFieldInitialisation = new GlobalFieldInitialisationImpl();
    return globalFieldInitialisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldInitialisations createFieldInitialisations()
  {
    FieldInitialisationsImpl fieldInitialisations = new FieldInitialisationsImpl();
    return fieldInitialisations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldInitialisation createFieldInitialisation()
  {
    FieldInitialisationImpl fieldInitialisation = new FieldInitialisationImpl();
    return fieldInitialisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultInitialisation createDefaultInitialisation()
  {
    DefaultInitialisationImpl defaultInitialisation = new DefaultInitialisationImpl();
    return defaultInitialisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RandomInitialisation createRandomInitialisation()
  {
    RandomInitialisationImpl randomInitialisation = new RandomInitialisationImpl();
    return randomInitialisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextInitialisation createContextInitialisation()
  {
    ContextInitialisationImpl contextInitialisation = new ContextInitialisationImpl();
    return contextInitialisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextExpression createContextExpression()
  {
    ContextExpressionImpl contextExpression = new ContextExpressionImpl();
    return contextExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicExpression createAtomicExpression()
  {
    AtomicExpressionImpl atomicExpression = new AtomicExpressionImpl();
    return atomicExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterExpression createFilterExpression()
  {
    FilterExpressionImpl filterExpression = new FilterExpressionImpl();
    return filterExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CountExpression createCountExpression()
  {
    CountExpressionImpl countExpression = new CountExpressionImpl();
    return countExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotEmptyExpression createNotEmptyExpression()
  {
    NotEmptyExpressionImpl notEmptyExpression = new NotEmptyExpressionImpl();
    return notEmptyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoOpBehaviour createNoOpBehaviour()
  {
    NoOpBehaviourImpl noOpBehaviour = new NoOpBehaviourImpl();
    return noOpBehaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GridGamePackage getGridGamePackage()
  {
    return (GridGamePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GridGamePackage getPackage()
  {
    return GridGamePackage.eINSTANCE;
  }

} //GridGameFactoryImpl

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
      case GridGamePackage.CELL_VAR_SPEC: return createCellVarSpec();
      case GridGamePackage.CELL_STATE_SPEC: return createCellStateSpec();
      case GridGamePackage.CELL_STATE: return createCellState();
      case GridGamePackage.FIELD_SPECIFICATION: return createFieldSpecification();
      case GridGamePackage.OPTION_SPECIFICATION: return createOptionSpecification();
      case GridGamePackage.ALLOW_RESTART_MENU: return createAllowRestartMenu();
      case GridGamePackage.START_FIELD_DECLARATION: return createStartFieldDeclaration();
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

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
      case GridGamePackage.FIELD_SPECIFICATION: return createFieldSpecification();
      case GridGamePackage.OPTION_SPECIFICATION: return createOptionSpecification();
      case GridGamePackage.ALLOW_RESTART_MENU: return createAllowRestartMenu();
      case GridGamePackage.START_FIELD_DECLARATION: return createStartFieldDeclaration();
      case GridGamePackage.FIELD_INITIALISATIONS: return createFieldInitialisations();
      case GridGamePackage.FIELD_INITIALISATION: return createFieldInitialisation();
      case GridGamePackage.DEFAULT_INITIALISATION: return createDefaultInitialisation();
      case GridGamePackage.RANDOM_INITIALISATION: return createRandomInitialisation();
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

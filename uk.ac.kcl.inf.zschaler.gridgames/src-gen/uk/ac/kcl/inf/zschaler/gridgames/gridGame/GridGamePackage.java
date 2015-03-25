/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGameFactory
 * @model kind="package"
 * @generated
 */
public interface GridGamePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gridGame";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.inf.kcl.ac.uk/zschaler/gridgames/GridGame";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gridGame";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GridGamePackage eINSTANCE = uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl <em>Grid Game</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getGridGame()
   * @generated
   */
  int GRID_GAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME__NAME = 0;

  /**
   * The feature id for the '<em><b>Cells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME__CELLS = 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME__FIELDS = 2;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME__OPTIONS = 3;

  /**
   * The number of structural features of the '<em>Grid Game</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellSpecificationImpl <em>Cell Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellSpecificationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellSpecification()
   * @generated
   */
  int CELL_SPECIFICATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_SPECIFICATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Cell Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_SPECIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldSpecificationImpl <em>Field Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldSpecificationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFieldSpecification()
   * @generated
   */
  int FIELD_SPECIFICATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_SPECIFICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_SPECIFICATION__WIDTH = 1;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_SPECIFICATION__HEIGHT = 2;

  /**
   * The feature id for the '<em><b>Field initialisation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_SPECIFICATION__FIELD_INITIALISATION = 3;

  /**
   * The number of structural features of the '<em>Field Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_SPECIFICATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.OptionSpecificationImpl <em>Option Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.OptionSpecificationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getOptionSpecification()
   * @generated
   */
  int OPTION_SPECIFICATION = 3;

  /**
   * The number of structural features of the '<em>Option Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_SPECIFICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.AllowRestartMenuImpl <em>Allow Restart Menu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.AllowRestartMenuImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getAllowRestartMenu()
   * @generated
   */
  int ALLOW_RESTART_MENU = 4;

  /**
   * The number of structural features of the '<em>Allow Restart Menu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOW_RESTART_MENU_FEATURE_COUNT = OPTION_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StartFieldDeclarationImpl <em>Start Field Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StartFieldDeclarationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getStartFieldDeclaration()
   * @generated
   */
  int START_FIELD_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Field name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FIELD_DECLARATION__FIELD_NAME = OPTION_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Start Field Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FIELD_DECLARATION_FEATURE_COUNT = OPTION_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationsImpl <em>Field Initialisations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationsImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFieldInitialisations()
   * @generated
   */
  int FIELD_INITIALISATIONS = 6;

  /**
   * The feature id for the '<em><b>Initialisations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_INITIALISATIONS__INITIALISATIONS = 0;

  /**
   * The number of structural features of the '<em>Field Initialisations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_INITIALISATIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationImpl <em>Field Initialisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFieldInitialisation()
   * @generated
   */
  int FIELD_INITIALISATION = 7;

  /**
   * The feature id for the '<em><b>Cell</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_INITIALISATION__CELL = 0;

  /**
   * The number of structural features of the '<em>Field Initialisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_INITIALISATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.DefaultFieldInitialisationImpl <em>Default Field Initialisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.DefaultFieldInitialisationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getDefaultFieldInitialisation()
   * @generated
   */
  int DEFAULT_FIELD_INITIALISATION = 8;

  /**
   * The feature id for the '<em><b>Cell</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_FIELD_INITIALISATION__CELL = FIELD_INITIALISATION__CELL;

  /**
   * The number of structural features of the '<em>Default Field Initialisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_FIELD_INITIALISATION_FEATURE_COUNT = FIELD_INITIALISATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.RandomInitialisationImpl <em>Random Initialisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.RandomInitialisationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getRandomInitialisation()
   * @generated
   */
  int RANDOM_INITIALISATION = 9;

  /**
   * The feature id for the '<em><b>Cell</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_INITIALISATION__CELL = FIELD_INITIALISATION__CELL;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_INITIALISATION__COUNT = FIELD_INITIALISATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Random Initialisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_INITIALISATION_FEATURE_COUNT = FIELD_INITIALISATION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame <em>Grid Game</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grid Game</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame
   * @generated
   */
  EClass getGridGame();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getName()
   * @see #getGridGame()
   * @generated
   */
  EAttribute getGridGame_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getCells <em>Cells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cells</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getCells()
   * @see #getGridGame()
   * @generated
   */
  EReference getGridGame_Cells();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getFields()
   * @see #getGridGame()
   * @generated
   */
  EReference getGridGame_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getOptions()
   * @see #getGridGame()
   * @generated
   */
  EReference getGridGame_Options();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification <em>Cell Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell Specification</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification
   * @generated
   */
  EClass getCellSpecification();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification#getName()
   * @see #getCellSpecification()
   * @generated
   */
  EAttribute getCellSpecification_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification <em>Field Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Specification</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification
   * @generated
   */
  EClass getFieldSpecification();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getName()
   * @see #getFieldSpecification()
   * @generated
   */
  EAttribute getFieldSpecification_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getWidth()
   * @see #getFieldSpecification()
   * @generated
   */
  EAttribute getFieldSpecification_Width();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getHeight()
   * @see #getFieldSpecification()
   * @generated
   */
  EAttribute getFieldSpecification_Height();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getField_initialisation <em>Field initialisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field initialisation</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getField_initialisation()
   * @see #getFieldSpecification()
   * @generated
   */
  EReference getFieldSpecification_Field_initialisation();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.OptionSpecification <em>Option Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option Specification</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.OptionSpecification
   * @generated
   */
  EClass getOptionSpecification();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.AllowRestartMenu <em>Allow Restart Menu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allow Restart Menu</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.AllowRestartMenu
   * @generated
   */
  EClass getAllowRestartMenu();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration <em>Start Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start Field Declaration</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration
   * @generated
   */
  EClass getStartFieldDeclaration();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration#getField_name <em>Field name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field name</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration#getField_name()
   * @see #getStartFieldDeclaration()
   * @generated
   */
  EAttribute getStartFieldDeclaration_Field_name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisations <em>Field Initialisations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Initialisations</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisations
   * @generated
   */
  EClass getFieldInitialisations();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisations#getInitialisations <em>Initialisations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initialisations</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisations#getInitialisations()
   * @see #getFieldInitialisations()
   * @generated
   */
  EReference getFieldInitialisations_Initialisations();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation <em>Field Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Initialisation</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation
   * @generated
   */
  EClass getFieldInitialisation();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation#getCell <em>Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cell</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation#getCell()
   * @see #getFieldInitialisation()
   * @generated
   */
  EAttribute getFieldInitialisation_Cell();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultFieldInitialisation <em>Default Field Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Field Initialisation</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultFieldInitialisation
   * @generated
   */
  EClass getDefaultFieldInitialisation();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation <em>Random Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Random Initialisation</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation
   * @generated
   */
  EClass getRandomInitialisation();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation#getCount()
   * @see #getRandomInitialisation()
   * @generated
   */
  EAttribute getRandomInitialisation_Count();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GridGameFactory getGridGameFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl <em>Grid Game</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getGridGame()
     * @generated
     */
    EClass GRID_GAME = eINSTANCE.getGridGame();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRID_GAME__NAME = eINSTANCE.getGridGame_Name();

    /**
     * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRID_GAME__CELLS = eINSTANCE.getGridGame_Cells();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRID_GAME__FIELDS = eINSTANCE.getGridGame_Fields();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRID_GAME__OPTIONS = eINSTANCE.getGridGame_Options();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellSpecificationImpl <em>Cell Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellSpecificationImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellSpecification()
     * @generated
     */
    EClass CELL_SPECIFICATION = eINSTANCE.getCellSpecification();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL_SPECIFICATION__NAME = eINSTANCE.getCellSpecification_Name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldSpecificationImpl <em>Field Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldSpecificationImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFieldSpecification()
     * @generated
     */
    EClass FIELD_SPECIFICATION = eINSTANCE.getFieldSpecification();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_SPECIFICATION__NAME = eINSTANCE.getFieldSpecification_Name();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_SPECIFICATION__WIDTH = eINSTANCE.getFieldSpecification_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_SPECIFICATION__HEIGHT = eINSTANCE.getFieldSpecification_Height();

    /**
     * The meta object literal for the '<em><b>Field initialisation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_SPECIFICATION__FIELD_INITIALISATION = eINSTANCE.getFieldSpecification_Field_initialisation();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.OptionSpecificationImpl <em>Option Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.OptionSpecificationImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getOptionSpecification()
     * @generated
     */
    EClass OPTION_SPECIFICATION = eINSTANCE.getOptionSpecification();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.AllowRestartMenuImpl <em>Allow Restart Menu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.AllowRestartMenuImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getAllowRestartMenu()
     * @generated
     */
    EClass ALLOW_RESTART_MENU = eINSTANCE.getAllowRestartMenu();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StartFieldDeclarationImpl <em>Start Field Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StartFieldDeclarationImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getStartFieldDeclaration()
     * @generated
     */
    EClass START_FIELD_DECLARATION = eINSTANCE.getStartFieldDeclaration();

    /**
     * The meta object literal for the '<em><b>Field name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute START_FIELD_DECLARATION__FIELD_NAME = eINSTANCE.getStartFieldDeclaration_Field_name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationsImpl <em>Field Initialisations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationsImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFieldInitialisations()
     * @generated
     */
    EClass FIELD_INITIALISATIONS = eINSTANCE.getFieldInitialisations();

    /**
     * The meta object literal for the '<em><b>Initialisations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_INITIALISATIONS__INITIALISATIONS = eINSTANCE.getFieldInitialisations_Initialisations();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationImpl <em>Field Initialisation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFieldInitialisation()
     * @generated
     */
    EClass FIELD_INITIALISATION = eINSTANCE.getFieldInitialisation();

    /**
     * The meta object literal for the '<em><b>Cell</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_INITIALISATION__CELL = eINSTANCE.getFieldInitialisation_Cell();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.DefaultFieldInitialisationImpl <em>Default Field Initialisation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.DefaultFieldInitialisationImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getDefaultFieldInitialisation()
     * @generated
     */
    EClass DEFAULT_FIELD_INITIALISATION = eINSTANCE.getDefaultFieldInitialisation();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.RandomInitialisationImpl <em>Random Initialisation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.RandomInitialisationImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getRandomInitialisation()
     * @generated
     */
    EClass RANDOM_INITIALISATION = eINSTANCE.getRandomInitialisation();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RANDOM_INITIALISATION__COUNT = eINSTANCE.getRandomInitialisation_Count();

  }

} //GridGamePackage

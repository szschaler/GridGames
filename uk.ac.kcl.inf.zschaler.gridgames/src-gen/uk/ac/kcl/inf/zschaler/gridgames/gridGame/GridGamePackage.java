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
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME__STATES = 1;

  /**
   * The feature id for the '<em><b>Cells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME__CELLS = 2;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME__FIELDS = 3;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME__OPTIONS = 4;

  /**
   * The number of structural features of the '<em>Grid Game</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME_FEATURE_COUNT = 5;

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
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_SPECIFICATION__MEMBERS = 1;

  /**
   * The number of structural features of the '<em>Cell Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_SPECIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellMemberImpl <em>Cell Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellMemberImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellMember()
   * @generated
   */
  int CELL_MEMBER = 2;

  /**
   * The number of structural features of the '<em>Cell Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellDisplaySpecImpl <em>Cell Display Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellDisplaySpecImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellDisplaySpec()
   * @generated
   */
  int CELL_DISPLAY_SPEC = 3;

  /**
   * The feature id for the '<em><b>Display type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_DISPLAY_SPEC__DISPLAY_TYPE = CELL_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_DISPLAY_SPEC__TEXT = CELL_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_DISPLAY_SPEC__VAR = CELL_MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Cell Display Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_DISPLAY_SPEC_FEATURE_COUNT = CELL_MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellVarSpecImpl <em>Cell Var Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellVarSpecImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellVarSpec()
   * @generated
   */
  int CELL_VAR_SPEC = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_VAR_SPEC__TYPE = CELL_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_VAR_SPEC__NAME = CELL_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cell Var Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_VAR_SPEC_FEATURE_COUNT = CELL_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalCellStateSpecImpl <em>Global Cell State Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalCellStateSpecImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getGlobalCellStateSpec()
   * @generated
   */
  int GLOBAL_CELL_STATE_SPEC = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_CELL_STATE_SPEC__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_CELL_STATE_SPEC__PARAMS = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_CELL_STATE_SPEC__STATES = 2;

  /**
   * The feature id for the '<em><b>Start</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_CELL_STATE_SPEC__START = 3;

  /**
   * The number of structural features of the '<em>Global Cell State Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_CELL_STATE_SPEC_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StateParamSpecImpl <em>State Param Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StateParamSpecImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getStateParamSpec()
   * @generated
   */
  int STATE_PARAM_SPEC = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_PARAM_SPEC__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_PARAM_SPEC__NAME = 1;

  /**
   * The number of structural features of the '<em>State Param Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_PARAM_SPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateSpecImpl <em>Cell State Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateSpecImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellStateSpec()
   * @generated
   */
  int CELL_STATE_SPEC = 7;

  /**
   * The number of structural features of the '<em>Cell State Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_STATE_SPEC_FEATURE_COUNT = CELL_MEMBER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.LocalCellStateSpecImpl <em>Local Cell State Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.LocalCellStateSpecImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getLocalCellStateSpec()
   * @generated
   */
  int LOCAL_CELL_STATE_SPEC = 8;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_CELL_STATE_SPEC__STATES = CELL_STATE_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Start</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_CELL_STATE_SPEC__START = CELL_STATE_SPEC_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Cell State Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_CELL_STATE_SPEC_FEATURE_COUNT = CELL_STATE_SPEC_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateSpecReferenceImpl <em>Cell State Spec Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateSpecReferenceImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellStateSpecReference()
   * @generated
   */
  int CELL_STATE_SPEC_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>State Spec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_STATE_SPEC_REFERENCE__STATE_SPEC = CELL_STATE_SPEC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Cell State Spec Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_STATE_SPEC_REFERENCE_FEATURE_COUNT = CELL_STATE_SPEC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateImpl <em>Cell State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellState()
   * @generated
   */
  int CELL_STATE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_STATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Display</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_STATE__DISPLAY = 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_STATE__TRANSITIONS = 2;

  /**
   * The number of structural features of the '<em>Cell State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_STATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.TransitionSpecImpl <em>Transition Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.TransitionSpecImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getTransitionSpec()
   * @generated
   */
  int TRANSITION_SPEC = 11;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_SPEC__TRIGGER = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_SPEC__TARGET = 1;

  /**
   * The number of structural features of the '<em>Transition Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_SPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldSpecificationImpl <em>Field Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldSpecificationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFieldSpecification()
   * @generated
   */
  int FIELD_SPECIFICATION = 12;

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
  int OPTION_SPECIFICATION = 13;

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
  int ALLOW_RESTART_MENU = 14;

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
  int START_FIELD_DECLARATION = 15;

  /**
   * The feature id for the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FIELD_DECLARATION__FIELD = OPTION_SPECIFICATION_FEATURE_COUNT + 0;

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
  int FIELD_INITIALISATIONS = 16;

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
  int FIELD_INITIALISATION = 17;

  /**
   * The feature id for the '<em><b>Cell</b></em>' reference.
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
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.DefaultInitialisationImpl <em>Default Initialisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.DefaultInitialisationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getDefaultInitialisation()
   * @generated
   */
  int DEFAULT_INITIALISATION = 18;

  /**
   * The feature id for the '<em><b>Cell</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_INITIALISATION__CELL = FIELD_INITIALISATION__CELL;

  /**
   * The number of structural features of the '<em>Default Initialisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_INITIALISATION_FEATURE_COUNT = FIELD_INITIALISATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.RandomInitialisationImpl <em>Random Initialisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.RandomInitialisationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getRandomInitialisation()
   * @generated
   */
  int RANDOM_INITIALISATION = 19;

  /**
   * The feature id for the '<em><b>Cell</b></em>' reference.
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
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextInitialisationImpl <em>Context Initialisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextInitialisationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getContextInitialisation()
   * @generated
   */
  int CONTEXT_INITIALISATION = 20;

  /**
   * The feature id for the '<em><b>Cell</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_INITIALISATION__CELL = FIELD_INITIALISATION__CELL;

  /**
   * The feature id for the '<em><b>Check</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_INITIALISATION__CHECK = FIELD_INITIALISATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_INITIALISATION__EXP = FIELD_INITIALISATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Context Initialisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_INITIALISATION_FEATURE_COUNT = FIELD_INITIALISATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextExpressionImpl <em>Context Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextExpressionImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getContextExpression()
   * @generated
   */
  int CONTEXT_EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Sub exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_EXPRESSION__SUB_EXP = 0;

  /**
   * The number of structural features of the '<em>Context Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.AtomicExpressionImpl <em>Atomic Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.AtomicExpressionImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getAtomicExpression()
   * @generated
   */
  int ATOMIC_EXPRESSION = 22;

  /**
   * The number of structural features of the '<em>Atomic Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FilterExpressionImpl <em>Filter Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FilterExpressionImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFilterExpression()
   * @generated
   */
  int FILTER_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Cell type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_EXPRESSION__CELL_TYPE = ATOMIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Filter Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_EXPRESSION_FEATURE_COUNT = ATOMIC_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CountExpressionImpl <em>Count Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CountExpressionImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCountExpression()
   * @generated
   */
  int COUNT_EXPRESSION = 24;

  /**
   * The number of structural features of the '<em>Count Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_EXPRESSION_FEATURE_COUNT = ATOMIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.NotEmptyExpressionImpl <em>Not Empty Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.NotEmptyExpressionImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getNotEmptyExpression()
   * @generated
   */
  int NOT_EMPTY_EXPRESSION = 25;

  /**
   * The number of structural features of the '<em>Not Empty Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EMPTY_EXPRESSION_FEATURE_COUNT = ATOMIC_EXPRESSION_FEATURE_COUNT + 0;


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
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getStates()
   * @see #getGridGame()
   * @generated
   */
  EReference getGridGame_States();

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
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification#getMembers()
   * @see #getCellSpecification()
   * @generated
   */
  EReference getCellSpecification_Members();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellMember <em>Cell Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell Member</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellMember
   * @generated
   */
  EClass getCellMember();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec <em>Cell Display Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell Display Spec</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec
   * @generated
   */
  EClass getCellDisplaySpec();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec#getDisplay_type <em>Display type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display type</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec#getDisplay_type()
   * @see #getCellDisplaySpec()
   * @generated
   */
  EAttribute getCellDisplaySpec_Display_type();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec#getText()
   * @see #getCellDisplaySpec()
   * @generated
   */
  EAttribute getCellDisplaySpec_Text();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec#getVar()
   * @see #getCellDisplaySpec()
   * @generated
   */
  EReference getCellDisplaySpec_Var();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec <em>Cell Var Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell Var Spec</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec
   * @generated
   */
  EClass getCellVarSpec();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec#getType()
   * @see #getCellVarSpec()
   * @generated
   */
  EAttribute getCellVarSpec_Type();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec#getName()
   * @see #getCellVarSpec()
   * @generated
   */
  EAttribute getCellVarSpec_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec <em>Global Cell State Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Cell State Spec</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec
   * @generated
   */
  EClass getGlobalCellStateSpec();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec#getName()
   * @see #getGlobalCellStateSpec()
   * @generated
   */
  EAttribute getGlobalCellStateSpec_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec#getParams()
   * @see #getGlobalCellStateSpec()
   * @generated
   */
  EReference getGlobalCellStateSpec_Params();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec#getStates()
   * @see #getGlobalCellStateSpec()
   * @generated
   */
  EReference getGlobalCellStateSpec_States();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Start</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec#getStart()
   * @see #getGlobalCellStateSpec()
   * @generated
   */
  EReference getGlobalCellStateSpec_Start();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateParamSpec <em>State Param Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Param Spec</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateParamSpec
   * @generated
   */
  EClass getStateParamSpec();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateParamSpec#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateParamSpec#getType()
   * @see #getStateParamSpec()
   * @generated
   */
  EAttribute getStateParamSpec_Type();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateParamSpec#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateParamSpec#getName()
   * @see #getStateParamSpec()
   * @generated
   */
  EAttribute getStateParamSpec_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpec <em>Cell State Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell State Spec</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpec
   * @generated
   */
  EClass getCellStateSpec();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalCellStateSpec <em>Local Cell State Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Cell State Spec</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalCellStateSpec
   * @generated
   */
  EClass getLocalCellStateSpec();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalCellStateSpec#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalCellStateSpec#getStates()
   * @see #getLocalCellStateSpec()
   * @generated
   */
  EReference getLocalCellStateSpec_States();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalCellStateSpec#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Start</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalCellStateSpec#getStart()
   * @see #getLocalCellStateSpec()
   * @generated
   */
  EReference getLocalCellStateSpec_Start();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference <em>Cell State Spec Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell State Spec Reference</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference
   * @generated
   */
  EClass getCellStateSpecReference();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference#getStateSpec <em>State Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State Spec</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference#getStateSpec()
   * @see #getCellStateSpecReference()
   * @generated
   */
  EReference getCellStateSpecReference_StateSpec();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState <em>Cell State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell State</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState
   * @generated
   */
  EClass getCellState();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getName()
   * @see #getCellState()
   * @generated
   */
  EAttribute getCellState_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getDisplay <em>Display</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Display</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getDisplay()
   * @see #getCellState()
   * @generated
   */
  EReference getCellState_Display();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getTransitions()
   * @see #getCellState()
   * @generated
   */
  EReference getCellState_Transitions();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec <em>Transition Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Spec</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec
   * @generated
   */
  EClass getTransitionSpec();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Trigger</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec#getTrigger()
   * @see #getTransitionSpec()
   * @generated
   */
  EAttribute getTransitionSpec_Trigger();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec#getTarget()
   * @see #getTransitionSpec()
   * @generated
   */
  EReference getTransitionSpec_Target();

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
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Field</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration#getField()
   * @see #getStartFieldDeclaration()
   * @generated
   */
  EReference getStartFieldDeclaration_Field();

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
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation#getCell <em>Cell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Cell</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation#getCell()
   * @see #getFieldInitialisation()
   * @generated
   */
  EReference getFieldInitialisation_Cell();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultInitialisation <em>Default Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Initialisation</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultInitialisation
   * @generated
   */
  EClass getDefaultInitialisation();

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
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation <em>Context Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Initialisation</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation
   * @generated
   */
  EClass getContextInitialisation();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation#getCheck <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Check</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation#getCheck()
   * @see #getContextInitialisation()
   * @generated
   */
  EReference getContextInitialisation_Check();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation#getExp()
   * @see #getContextInitialisation()
   * @generated
   */
  EReference getContextInitialisation_Exp();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression <em>Context Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Expression</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression
   * @generated
   */
  EClass getContextExpression();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression#getSub_exp <em>Sub exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub exp</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression#getSub_exp()
   * @see #getContextExpression()
   * @generated
   */
  EReference getContextExpression_Sub_exp();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.AtomicExpression <em>Atomic Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Expression</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.AtomicExpression
   * @generated
   */
  EClass getAtomicExpression();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression <em>Filter Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Expression</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression
   * @generated
   */
  EClass getFilterExpression();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression#getCell_type <em>Cell type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Cell type</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression#getCell_type()
   * @see #getFilterExpression()
   * @generated
   */
  EReference getFilterExpression_Cell_type();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression <em>Count Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Count Expression</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression
   * @generated
   */
  EClass getCountExpression();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.NotEmptyExpression <em>Not Empty Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Empty Expression</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.NotEmptyExpression
   * @generated
   */
  EClass getNotEmptyExpression();

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
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRID_GAME__STATES = eINSTANCE.getGridGame_States();

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
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_SPECIFICATION__MEMBERS = eINSTANCE.getCellSpecification_Members();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellMemberImpl <em>Cell Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellMemberImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellMember()
     * @generated
     */
    EClass CELL_MEMBER = eINSTANCE.getCellMember();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellDisplaySpecImpl <em>Cell Display Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellDisplaySpecImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellDisplaySpec()
     * @generated
     */
    EClass CELL_DISPLAY_SPEC = eINSTANCE.getCellDisplaySpec();

    /**
     * The meta object literal for the '<em><b>Display type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL_DISPLAY_SPEC__DISPLAY_TYPE = eINSTANCE.getCellDisplaySpec_Display_type();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL_DISPLAY_SPEC__TEXT = eINSTANCE.getCellDisplaySpec_Text();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_DISPLAY_SPEC__VAR = eINSTANCE.getCellDisplaySpec_Var();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellVarSpecImpl <em>Cell Var Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellVarSpecImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellVarSpec()
     * @generated
     */
    EClass CELL_VAR_SPEC = eINSTANCE.getCellVarSpec();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL_VAR_SPEC__TYPE = eINSTANCE.getCellVarSpec_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL_VAR_SPEC__NAME = eINSTANCE.getCellVarSpec_Name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalCellStateSpecImpl <em>Global Cell State Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalCellStateSpecImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getGlobalCellStateSpec()
     * @generated
     */
    EClass GLOBAL_CELL_STATE_SPEC = eINSTANCE.getGlobalCellStateSpec();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_CELL_STATE_SPEC__NAME = eINSTANCE.getGlobalCellStateSpec_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_CELL_STATE_SPEC__PARAMS = eINSTANCE.getGlobalCellStateSpec_Params();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_CELL_STATE_SPEC__STATES = eINSTANCE.getGlobalCellStateSpec_States();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_CELL_STATE_SPEC__START = eINSTANCE.getGlobalCellStateSpec_Start();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StateParamSpecImpl <em>State Param Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StateParamSpecImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getStateParamSpec()
     * @generated
     */
    EClass STATE_PARAM_SPEC = eINSTANCE.getStateParamSpec();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_PARAM_SPEC__TYPE = eINSTANCE.getStateParamSpec_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_PARAM_SPEC__NAME = eINSTANCE.getStateParamSpec_Name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateSpecImpl <em>Cell State Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateSpecImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellStateSpec()
     * @generated
     */
    EClass CELL_STATE_SPEC = eINSTANCE.getCellStateSpec();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.LocalCellStateSpecImpl <em>Local Cell State Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.LocalCellStateSpecImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getLocalCellStateSpec()
     * @generated
     */
    EClass LOCAL_CELL_STATE_SPEC = eINSTANCE.getLocalCellStateSpec();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_CELL_STATE_SPEC__STATES = eINSTANCE.getLocalCellStateSpec_States();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_CELL_STATE_SPEC__START = eINSTANCE.getLocalCellStateSpec_Start();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateSpecReferenceImpl <em>Cell State Spec Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateSpecReferenceImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellStateSpecReference()
     * @generated
     */
    EClass CELL_STATE_SPEC_REFERENCE = eINSTANCE.getCellStateSpecReference();

    /**
     * The meta object literal for the '<em><b>State Spec</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_STATE_SPEC_REFERENCE__STATE_SPEC = eINSTANCE.getCellStateSpecReference_StateSpec();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateImpl <em>Cell State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellState()
     * @generated
     */
    EClass CELL_STATE = eINSTANCE.getCellState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL_STATE__NAME = eINSTANCE.getCellState_Name();

    /**
     * The meta object literal for the '<em><b>Display</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_STATE__DISPLAY = eINSTANCE.getCellState_Display();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_STATE__TRANSITIONS = eINSTANCE.getCellState_Transitions();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.TransitionSpecImpl <em>Transition Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.TransitionSpecImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getTransitionSpec()
     * @generated
     */
    EClass TRANSITION_SPEC = eINSTANCE.getTransitionSpec();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_SPEC__TRIGGER = eINSTANCE.getTransitionSpec_Trigger();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_SPEC__TARGET = eINSTANCE.getTransitionSpec_Target();

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
     * The meta object literal for the '<em><b>Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START_FIELD_DECLARATION__FIELD = eINSTANCE.getStartFieldDeclaration_Field();

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
     * The meta object literal for the '<em><b>Cell</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_INITIALISATION__CELL = eINSTANCE.getFieldInitialisation_Cell();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.DefaultInitialisationImpl <em>Default Initialisation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.DefaultInitialisationImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getDefaultInitialisation()
     * @generated
     */
    EClass DEFAULT_INITIALISATION = eINSTANCE.getDefaultInitialisation();

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

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextInitialisationImpl <em>Context Initialisation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextInitialisationImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getContextInitialisation()
     * @generated
     */
    EClass CONTEXT_INITIALISATION = eINSTANCE.getContextInitialisation();

    /**
     * The meta object literal for the '<em><b>Check</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_INITIALISATION__CHECK = eINSTANCE.getContextInitialisation_Check();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_INITIALISATION__EXP = eINSTANCE.getContextInitialisation_Exp();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextExpressionImpl <em>Context Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextExpressionImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getContextExpression()
     * @generated
     */
    EClass CONTEXT_EXPRESSION = eINSTANCE.getContextExpression();

    /**
     * The meta object literal for the '<em><b>Sub exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_EXPRESSION__SUB_EXP = eINSTANCE.getContextExpression_Sub_exp();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.AtomicExpressionImpl <em>Atomic Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.AtomicExpressionImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getAtomicExpression()
     * @generated
     */
    EClass ATOMIC_EXPRESSION = eINSTANCE.getAtomicExpression();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FilterExpressionImpl <em>Filter Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FilterExpressionImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFilterExpression()
     * @generated
     */
    EClass FILTER_EXPRESSION = eINSTANCE.getFilterExpression();

    /**
     * The meta object literal for the '<em><b>Cell type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_EXPRESSION__CELL_TYPE = eINSTANCE.getFilterExpression_Cell_type();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CountExpressionImpl <em>Count Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CountExpressionImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCountExpression()
     * @generated
     */
    EClass COUNT_EXPRESSION = eINSTANCE.getCountExpression();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.NotEmptyExpressionImpl <em>Not Empty Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.NotEmptyExpressionImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getNotEmptyExpression()
     * @generated
     */
    EClass NOT_EMPTY_EXPRESSION = eINSTANCE.getNotEmptyExpression();

  }

} //GridGamePackage

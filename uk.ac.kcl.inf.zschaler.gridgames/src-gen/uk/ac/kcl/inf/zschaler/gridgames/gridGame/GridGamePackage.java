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
   * The feature id for the '<em><b>Global Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME__GLOBAL_ACTIONS = 3;

  /**
   * The feature id for the '<em><b>Inits</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME__INITS = 4;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME__FIELDS = 5;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME__OPTIONS = 6;

  /**
   * The number of structural features of the '<em>Grid Game</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRID_GAME_FEATURE_COUNT = 7;

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
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_DISPLAY_SPEC__COLOR = CELL_MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Cell Display Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_DISPLAY_SPEC_FEATURE_COUNT = CELL_MEMBER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.VarSpecImpl <em>Var Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.VarSpecImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getVarSpec()
   * @generated
   */
  int VAR_SPEC = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_SPEC__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_SPEC__NAME = 1;

  /**
   * The number of structural features of the '<em>Var Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_SPEC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellVarSpecImpl <em>Cell Var Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellVarSpecImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellVarSpec()
   * @generated
   */
  int CELL_VAR_SPEC = 5;

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
  int GLOBAL_CELL_STATE_SPEC = 6;

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
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ParamSpecImpl <em>Param Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ParamSpecImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getParamSpec()
   * @generated
   */
  int PARAM_SPEC = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_SPEC__TYPE = VAR_SPEC__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_SPEC__NAME = VAR_SPEC__NAME;

  /**
   * The number of structural features of the '<em>Param Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_SPEC_FEATURE_COUNT = VAR_SPEC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateSpecImpl <em>Cell State Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateSpecImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellStateSpec()
   * @generated
   */
  int CELL_STATE_SPEC = 8;

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
  int LOCAL_CELL_STATE_SPEC = 9;

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
  int CELL_STATE_SPEC_REFERENCE = 10;

  /**
   * The feature id for the '<em><b>State Spec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_STATE_SPEC_REFERENCE__STATE_SPEC = CELL_STATE_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_STATE_SPEC_REFERENCE__PARAMS = CELL_STATE_SPEC_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cell State Spec Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_STATE_SPEC_REFERENCE_FEATURE_COUNT = CELL_STATE_SPEC_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ValueImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getValue()
   * @generated
   */
  int VALUE = 11;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StringValueImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.IntValueImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.VarRefValueImpl <em>Var Ref Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.VarRefValueImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getVarRefValue()
   * @generated
   */
  int VAR_REF_VALUE = 14;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF_VALUE__REF = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var Ref Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateImpl <em>Cell State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellState()
   * @generated
   */
  int CELL_STATE = 15;

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
   * The feature id for the '<em><b>On Enter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_STATE__ON_ENTER = 3;

  /**
   * The number of structural features of the '<em>Cell State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_STATE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.TransitionSpecImpl <em>Transition Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.TransitionSpecImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getTransitionSpec()
   * @generated
   */
  int TRANSITION_SPEC = 16;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
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
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.TransitionTriggerSpecImpl <em>Transition Trigger Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.TransitionTriggerSpecImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getTransitionTriggerSpec()
   * @generated
   */
  int TRANSITION_TRIGGER_SPEC = 17;

  /**
   * The number of structural features of the '<em>Transition Trigger Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TRIGGER_SPEC_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.MouseTriggerImpl <em>Mouse Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.MouseTriggerImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getMouseTrigger()
   * @generated
   */
  int MOUSE_TRIGGER = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUSE_TRIGGER__LEFT = TRANSITION_TRIGGER_SPEC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mouse Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOUSE_TRIGGER_FEATURE_COUNT = TRANSITION_TRIGGER_SPEC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextTriggerImpl <em>Context Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextTriggerImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getContextTrigger()
   * @generated
   */
  int CONTEXT_TRIGGER = 19;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_TRIGGER__EXP = TRANSITION_TRIGGER_SPEC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Context Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_TRIGGER_FEATURE_COUNT = TRANSITION_TRIGGER_SPEC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateBehaviourImpl <em>Cell State Behaviour</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateBehaviourImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellStateBehaviour()
   * @generated
   */
  int CELL_STATE_BEHAVIOUR = 20;

  /**
   * The number of structural features of the '<em>Cell State Behaviour</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_STATE_BEHAVIOUR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.BehaviourReferenceImpl <em>Behaviour Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.BehaviourReferenceImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getBehaviourReference()
   * @generated
   */
  int BEHAVIOUR_REFERENCE = 21;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR_REFERENCE__REF = CELL_STATE_BEHAVIOUR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Behaviour Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOUR_REFERENCE_FEATURE_COUNT = CELL_STATE_BEHAVIOUR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.DirectBehaviourImpl <em>Direct Behaviour</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.DirectBehaviourImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getDirectBehaviour()
   * @generated
   */
  int DIRECT_BEHAVIOUR = 22;

  /**
   * The number of structural features of the '<em>Direct Behaviour</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_BEHAVIOUR_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.EndGameBehaviourImpl <em>End Game Behaviour</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.EndGameBehaviourImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getEndGameBehaviour()
   * @generated
   */
  int END_GAME_BEHAVIOUR = 23;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_GAME_BEHAVIOUR__MESSAGE = DIRECT_BEHAVIOUR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>End Game Behaviour</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_GAME_BEHAVIOUR_FEATURE_COUNT = DIRECT_BEHAVIOUR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalActionImpl <em>Global Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalActionImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getGlobalAction()
   * @generated
   */
  int GLOBAL_ACTION = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_ACTION__TRIGGER = 1;

  /**
   * The feature id for the '<em><b>Behaviour</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_ACTION__BEHAVIOUR = 2;

  /**
   * The number of structural features of the '<em>Global Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_ACTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldSpecificationImpl <em>Field Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldSpecificationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFieldSpecification()
   * @generated
   */
  int FIELD_SPECIFICATION = 25;

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
  int OPTION_SPECIFICATION = 26;

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
  int ALLOW_RESTART_MENU = 27;

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
  int START_FIELD_DECLARATION = 28;

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
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GenerationalContextsImpl <em>Generational Contexts</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GenerationalContextsImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getGenerationalContexts()
   * @generated
   */
  int GENERATIONAL_CONTEXTS = 29;

  /**
   * The number of structural features of the '<em>Generational Contexts</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATIONAL_CONTEXTS_FEATURE_COUNT = OPTION_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalFieldInitialisationImpl <em>Global Field Initialisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalFieldInitialisationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getGlobalFieldInitialisation()
   * @generated
   */
  int GLOBAL_FIELD_INITIALISATION = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_FIELD_INITIALISATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_FIELD_INITIALISATION__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Initialisations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_FIELD_INITIALISATION__INITIALISATIONS = 2;

  /**
   * The number of structural features of the '<em>Global Field Initialisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_FIELD_INITIALISATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationsImpl <em>Field Initialisations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationsImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFieldInitialisations()
   * @generated
   */
  int FIELD_INITIALISATIONS = 31;

  /**
   * The number of structural features of the '<em>Field Initialisations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_INITIALISATIONS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationsRefImpl <em>Field Initialisations Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationsRefImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFieldInitialisationsRef()
   * @generated
   */
  int FIELD_INITIALISATIONS_REF = 32;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_INITIALISATIONS_REF__REF = FIELD_INITIALISATIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_INITIALISATIONS_REF__PARAMS = FIELD_INITIALISATIONS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Field Initialisations Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_INITIALISATIONS_REF_FEATURE_COUNT = FIELD_INITIALISATIONS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.LocalFieldInitialisationsImpl <em>Local Field Initialisations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.LocalFieldInitialisationsImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getLocalFieldInitialisations()
   * @generated
   */
  int LOCAL_FIELD_INITIALISATIONS = 33;

  /**
   * The feature id for the '<em><b>Initialisations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_FIELD_INITIALISATIONS__INITIALISATIONS = FIELD_INITIALISATIONS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Field Initialisations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_FIELD_INITIALISATIONS_FEATURE_COUNT = FIELD_INITIALISATIONS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationImpl <em>Field Initialisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFieldInitialisation()
   * @generated
   */
  int FIELD_INITIALISATION = 34;

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
  int DEFAULT_INITIALISATION = 35;

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
  int RANDOM_INITIALISATION = 36;

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
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_INITIALISATION__VAR = FIELD_INITIALISATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Random Initialisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_INITIALISATION_FEATURE_COUNT = FIELD_INITIALISATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextInitialisationImpl <em>Context Initialisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextInitialisationImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getContextInitialisation()
   * @generated
   */
  int CONTEXT_INITIALISATION = 37;

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
  int CONTEXT_EXPRESSION = 38;

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
  int ATOMIC_EXPRESSION = 39;

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
  int FILTER_EXPRESSION = 40;

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
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StateFilterExpressionImpl <em>State Filter Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StateFilterExpressionImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getStateFilterExpression()
   * @generated
   */
  int STATE_FILTER_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Cell state</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FILTER_EXPRESSION__CELL_STATE = ATOMIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>State Filter Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FILTER_EXPRESSION_FEATURE_COUNT = ATOMIC_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CountExpressionImpl <em>Count Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CountExpressionImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCountExpression()
   * @generated
   */
  int COUNT_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_EXPRESSION__OP = ATOMIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cmp Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_EXPRESSION__CMP_VAL = ATOMIC_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Count Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_EXPRESSION_FEATURE_COUNT = ATOMIC_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.NotEmptyExpressionImpl <em>Not Empty Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.NotEmptyExpressionImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getNotEmptyExpression()
   * @generated
   */
  int NOT_EMPTY_EXPRESSION = 43;

  /**
   * The number of structural features of the '<em>Not Empty Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EMPTY_EXPRESSION_FEATURE_COUNT = ATOMIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.EmptyExpressionImpl <em>Empty Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.EmptyExpressionImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getEmptyExpression()
   * @generated
   */
  int EMPTY_EXPRESSION = 44;

  /**
   * The number of structural features of the '<em>Empty Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_EXPRESSION_FEATURE_COUNT = ATOMIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.NoOpBehaviourImpl <em>No Op Behaviour</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.NoOpBehaviourImpl
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getNoOpBehaviour()
   * @generated
   */
  int NO_OP_BEHAVIOUR = 45;

  /**
   * The number of structural features of the '<em>No Op Behaviour</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_OP_BEHAVIOUR_FEATURE_COUNT = DIRECT_BEHAVIOUR_FEATURE_COUNT + 0;


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
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getGlobalActions <em>Global Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Global Actions</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getGlobalActions()
   * @see #getGridGame()
   * @generated
   */
  EReference getGridGame_GlobalActions();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getInits <em>Inits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inits</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getInits()
   * @see #getGridGame()
   * @generated
   */
  EReference getGridGame_Inits();

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
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec#getColor()
   * @see #getCellDisplaySpec()
   * @generated
   */
  EAttribute getCellDisplaySpec_Color();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarSpec <em>Var Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Spec</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarSpec
   * @generated
   */
  EClass getVarSpec();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarSpec#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarSpec#getType()
   * @see #getVarSpec()
   * @generated
   */
  EAttribute getVarSpec_Type();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarSpec#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarSpec#getName()
   * @see #getVarSpec()
   * @generated
   */
  EAttribute getVarSpec_Name();

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
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ParamSpec <em>Param Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Spec</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.ParamSpec
   * @generated
   */
  EClass getParamSpec();

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
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference#getParams()
   * @see #getCellStateSpecReference()
   * @generated
   */
  EReference getCellStateSpecReference_Params();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarRefValue <em>Var Ref Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Ref Value</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarRefValue
   * @generated
   */
  EClass getVarRefValue();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarRefValue#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarRefValue#getRef()
   * @see #getVarRefValue()
   * @generated
   */
  EReference getVarRefValue_Ref();

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
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getOnEnter <em>On Enter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>On Enter</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getOnEnter()
   * @see #getCellState()
   * @generated
   */
  EReference getCellState_OnEnter();

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
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec#getTrigger()
   * @see #getTransitionSpec()
   * @generated
   */
  EReference getTransitionSpec_Trigger();

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
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionTriggerSpec <em>Transition Trigger Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Trigger Spec</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionTriggerSpec
   * @generated
   */
  EClass getTransitionTriggerSpec();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.MouseTrigger <em>Mouse Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mouse Trigger</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.MouseTrigger
   * @generated
   */
  EClass getMouseTrigger();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.MouseTrigger#isLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.MouseTrigger#isLeft()
   * @see #getMouseTrigger()
   * @generated
   */
  EAttribute getMouseTrigger_Left();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger <em>Context Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Trigger</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger
   * @generated
   */
  EClass getContextTrigger();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger#getExp()
   * @see #getContextTrigger()
   * @generated
   */
  EReference getContextTrigger_Exp();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateBehaviour <em>Cell State Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell State Behaviour</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateBehaviour
   * @generated
   */
  EClass getCellStateBehaviour();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.BehaviourReference <em>Behaviour Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behaviour Reference</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.BehaviourReference
   * @generated
   */
  EClass getBehaviourReference();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.BehaviourReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.BehaviourReference#getRef()
   * @see #getBehaviourReference()
   * @generated
   */
  EReference getBehaviourReference_Ref();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.DirectBehaviour <em>Direct Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Behaviour</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.DirectBehaviour
   * @generated
   */
  EClass getDirectBehaviour();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.EndGameBehaviour <em>End Game Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End Game Behaviour</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.EndGameBehaviour
   * @generated
   */
  EClass getEndGameBehaviour();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.EndGameBehaviour#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.EndGameBehaviour#getMessage()
   * @see #getEndGameBehaviour()
   * @generated
   */
  EAttribute getEndGameBehaviour_Message();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalAction <em>Global Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Action</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalAction
   * @generated
   */
  EClass getGlobalAction();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalAction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalAction#getName()
   * @see #getGlobalAction()
   * @generated
   */
  EAttribute getGlobalAction_Name();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalAction#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalAction#getTrigger()
   * @see #getGlobalAction()
   * @generated
   */
  EReference getGlobalAction_Trigger();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalAction#getBehaviour <em>Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Behaviour</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalAction#getBehaviour()
   * @see #getGlobalAction()
   * @generated
   */
  EReference getGlobalAction_Behaviour();

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
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GenerationalContexts <em>Generational Contexts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generational Contexts</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GenerationalContexts
   * @generated
   */
  EClass getGenerationalContexts();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation <em>Global Field Initialisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Field Initialisation</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation
   * @generated
   */
  EClass getGlobalFieldInitialisation();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation#getName()
   * @see #getGlobalFieldInitialisation()
   * @generated
   */
  EAttribute getGlobalFieldInitialisation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation#getParams()
   * @see #getGlobalFieldInitialisation()
   * @generated
   */
  EReference getGlobalFieldInitialisation_Params();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation#getInitialisations <em>Initialisations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initialisations</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation#getInitialisations()
   * @see #getGlobalFieldInitialisation()
   * @generated
   */
  EReference getGlobalFieldInitialisation_Initialisations();

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
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisationsRef <em>Field Initialisations Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Initialisations Ref</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisationsRef
   * @generated
   */
  EClass getFieldInitialisationsRef();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisationsRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisationsRef#getRef()
   * @see #getFieldInitialisationsRef()
   * @generated
   */
  EReference getFieldInitialisationsRef_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisationsRef#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisationsRef#getParams()
   * @see #getFieldInitialisationsRef()
   * @generated
   */
  EReference getFieldInitialisationsRef_Params();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalFieldInitialisations <em>Local Field Initialisations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Field Initialisations</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalFieldInitialisations
   * @generated
   */
  EClass getLocalFieldInitialisations();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalFieldInitialisations#getInitialisations <em>Initialisations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initialisations</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalFieldInitialisations#getInitialisations()
   * @see #getLocalFieldInitialisations()
   * @generated
   */
  EReference getLocalFieldInitialisations_Initialisations();

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
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation#getVar()
   * @see #getRandomInitialisation()
   * @generated
   */
  EReference getRandomInitialisation_Var();

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
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression <em>State Filter Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Filter Expression</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression
   * @generated
   */
  EClass getStateFilterExpression();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression#getCell_state <em>Cell state</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Cell state</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression#getCell_state()
   * @see #getStateFilterExpression()
   * @generated
   */
  EReference getStateFilterExpression_Cell_state();

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
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression#getOp()
   * @see #getCountExpression()
   * @generated
   */
  EAttribute getCountExpression_Op();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression#getCmpVal <em>Cmp Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cmp Val</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression#getCmpVal()
   * @see #getCountExpression()
   * @generated
   */
  EAttribute getCountExpression_CmpVal();

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
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.EmptyExpression <em>Empty Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Expression</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.EmptyExpression
   * @generated
   */
  EClass getEmptyExpression();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.NoOpBehaviour <em>No Op Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Op Behaviour</em>'.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.NoOpBehaviour
   * @generated
   */
  EClass getNoOpBehaviour();

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
     * The meta object literal for the '<em><b>Global Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRID_GAME__GLOBAL_ACTIONS = eINSTANCE.getGridGame_GlobalActions();

    /**
     * The meta object literal for the '<em><b>Inits</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRID_GAME__INITS = eINSTANCE.getGridGame_Inits();

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
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL_DISPLAY_SPEC__COLOR = eINSTANCE.getCellDisplaySpec_Color();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.VarSpecImpl <em>Var Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.VarSpecImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getVarSpec()
     * @generated
     */
    EClass VAR_SPEC = eINSTANCE.getVarSpec();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_SPEC__TYPE = eINSTANCE.getVarSpec_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_SPEC__NAME = eINSTANCE.getVarSpec_Name();

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
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ParamSpecImpl <em>Param Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ParamSpecImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getParamSpec()
     * @generated
     */
    EClass PARAM_SPEC = eINSTANCE.getParamSpec();

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
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_STATE_SPEC_REFERENCE__PARAMS = eINSTANCE.getCellStateSpecReference_Params();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ValueImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StringValueImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.IntValueImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getIntValue()
     * @generated
     */
    EClass INT_VALUE = eINSTANCE.getIntValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.VarRefValueImpl <em>Var Ref Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.VarRefValueImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getVarRefValue()
     * @generated
     */
    EClass VAR_REF_VALUE = eINSTANCE.getVarRefValue();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_REF_VALUE__REF = eINSTANCE.getVarRefValue_Ref();

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
     * The meta object literal for the '<em><b>On Enter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_STATE__ON_ENTER = eINSTANCE.getCellState_OnEnter();

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
     * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_SPEC__TRIGGER = eINSTANCE.getTransitionSpec_Trigger();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_SPEC__TARGET = eINSTANCE.getTransitionSpec_Target();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.TransitionTriggerSpecImpl <em>Transition Trigger Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.TransitionTriggerSpecImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getTransitionTriggerSpec()
     * @generated
     */
    EClass TRANSITION_TRIGGER_SPEC = eINSTANCE.getTransitionTriggerSpec();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.MouseTriggerImpl <em>Mouse Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.MouseTriggerImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getMouseTrigger()
     * @generated
     */
    EClass MOUSE_TRIGGER = eINSTANCE.getMouseTrigger();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOUSE_TRIGGER__LEFT = eINSTANCE.getMouseTrigger_Left();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextTriggerImpl <em>Context Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextTriggerImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getContextTrigger()
     * @generated
     */
    EClass CONTEXT_TRIGGER = eINSTANCE.getContextTrigger();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_TRIGGER__EXP = eINSTANCE.getContextTrigger_Exp();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateBehaviourImpl <em>Cell State Behaviour</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateBehaviourImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getCellStateBehaviour()
     * @generated
     */
    EClass CELL_STATE_BEHAVIOUR = eINSTANCE.getCellStateBehaviour();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.BehaviourReferenceImpl <em>Behaviour Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.BehaviourReferenceImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getBehaviourReference()
     * @generated
     */
    EClass BEHAVIOUR_REFERENCE = eINSTANCE.getBehaviourReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOUR_REFERENCE__REF = eINSTANCE.getBehaviourReference_Ref();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.DirectBehaviourImpl <em>Direct Behaviour</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.DirectBehaviourImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getDirectBehaviour()
     * @generated
     */
    EClass DIRECT_BEHAVIOUR = eINSTANCE.getDirectBehaviour();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.EndGameBehaviourImpl <em>End Game Behaviour</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.EndGameBehaviourImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getEndGameBehaviour()
     * @generated
     */
    EClass END_GAME_BEHAVIOUR = eINSTANCE.getEndGameBehaviour();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute END_GAME_BEHAVIOUR__MESSAGE = eINSTANCE.getEndGameBehaviour_Message();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalActionImpl <em>Global Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalActionImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getGlobalAction()
     * @generated
     */
    EClass GLOBAL_ACTION = eINSTANCE.getGlobalAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_ACTION__NAME = eINSTANCE.getGlobalAction_Name();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_ACTION__TRIGGER = eINSTANCE.getGlobalAction_Trigger();

    /**
     * The meta object literal for the '<em><b>Behaviour</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_ACTION__BEHAVIOUR = eINSTANCE.getGlobalAction_Behaviour();

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
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GenerationalContextsImpl <em>Generational Contexts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GenerationalContextsImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getGenerationalContexts()
     * @generated
     */
    EClass GENERATIONAL_CONTEXTS = eINSTANCE.getGenerationalContexts();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalFieldInitialisationImpl <em>Global Field Initialisation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalFieldInitialisationImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getGlobalFieldInitialisation()
     * @generated
     */
    EClass GLOBAL_FIELD_INITIALISATION = eINSTANCE.getGlobalFieldInitialisation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_FIELD_INITIALISATION__NAME = eINSTANCE.getGlobalFieldInitialisation_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_FIELD_INITIALISATION__PARAMS = eINSTANCE.getGlobalFieldInitialisation_Params();

    /**
     * The meta object literal for the '<em><b>Initialisations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_FIELD_INITIALISATION__INITIALISATIONS = eINSTANCE.getGlobalFieldInitialisation_Initialisations();

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
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationsRefImpl <em>Field Initialisations Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationsRefImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getFieldInitialisationsRef()
     * @generated
     */
    EClass FIELD_INITIALISATIONS_REF = eINSTANCE.getFieldInitialisationsRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_INITIALISATIONS_REF__REF = eINSTANCE.getFieldInitialisationsRef_Ref();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_INITIALISATIONS_REF__PARAMS = eINSTANCE.getFieldInitialisationsRef_Params();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.LocalFieldInitialisationsImpl <em>Local Field Initialisations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.LocalFieldInitialisationsImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getLocalFieldInitialisations()
     * @generated
     */
    EClass LOCAL_FIELD_INITIALISATIONS = eINSTANCE.getLocalFieldInitialisations();

    /**
     * The meta object literal for the '<em><b>Initialisations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_FIELD_INITIALISATIONS__INITIALISATIONS = eINSTANCE.getLocalFieldInitialisations_Initialisations();

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
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANDOM_INITIALISATION__VAR = eINSTANCE.getRandomInitialisation_Var();

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
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StateFilterExpressionImpl <em>State Filter Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StateFilterExpressionImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getStateFilterExpression()
     * @generated
     */
    EClass STATE_FILTER_EXPRESSION = eINSTANCE.getStateFilterExpression();

    /**
     * The meta object literal for the '<em><b>Cell state</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_FILTER_EXPRESSION__CELL_STATE = eINSTANCE.getStateFilterExpression_Cell_state();

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
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COUNT_EXPRESSION__OP = eINSTANCE.getCountExpression_Op();

    /**
     * The meta object literal for the '<em><b>Cmp Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COUNT_EXPRESSION__CMP_VAL = eINSTANCE.getCountExpression_CmpVal();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.NotEmptyExpressionImpl <em>Not Empty Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.NotEmptyExpressionImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getNotEmptyExpression()
     * @generated
     */
    EClass NOT_EMPTY_EXPRESSION = eINSTANCE.getNotEmptyExpression();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.EmptyExpressionImpl <em>Empty Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.EmptyExpressionImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getEmptyExpression()
     * @generated
     */
    EClass EMPTY_EXPRESSION = eINSTANCE.getEmptyExpression();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.NoOpBehaviourImpl <em>No Op Behaviour</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.NoOpBehaviourImpl
     * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGamePackageImpl#getNoOpBehaviour()
     * @generated
     */
    EClass NO_OP_BEHAVIOUR = eINSTANCE.getNoOpBehaviour();

  }

} //GridGamePackage

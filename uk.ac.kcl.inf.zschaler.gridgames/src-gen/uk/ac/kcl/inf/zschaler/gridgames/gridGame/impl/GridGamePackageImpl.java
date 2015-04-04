/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.AllowRestartMenu;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.AtomicExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellMember;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateBehaviour;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.EndGameBehaviour;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisations;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGameFactory;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.IntValue;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalCellStateSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.NoOpBehaviour;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.NotEmptyExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.OptionSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateParamSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StringValue;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarRefValue;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GridGamePackageImpl extends EPackageImpl implements GridGamePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gridGameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellDisplaySpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellVarSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalCellStateSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateParamSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellStateSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localCellStateSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellStateSpecReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varRefValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellStateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cellStateBehaviourEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endGameBehaviourEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass allowRestartMenuEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startFieldDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldInitialisationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldInitialisationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultInitialisationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass randomInitialisationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextInitialisationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass countExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notEmptyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noOpBehaviourEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GridGamePackageImpl()
  {
    super(eNS_URI, GridGameFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GridGamePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GridGamePackage init()
  {
    if (isInited) return (GridGamePackage)EPackage.Registry.INSTANCE.getEPackage(GridGamePackage.eNS_URI);

    // Obtain or create and register package
    GridGamePackageImpl theGridGamePackage = (GridGamePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GridGamePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GridGamePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGridGamePackage.createPackageContents();

    // Initialize created meta-data
    theGridGamePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGridGamePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GridGamePackage.eNS_URI, theGridGamePackage);
    return theGridGamePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGridGame()
  {
    return gridGameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGridGame_Name()
  {
    return (EAttribute)gridGameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGridGame_States()
  {
    return (EReference)gridGameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGridGame_Cells()
  {
    return (EReference)gridGameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGridGame_Fields()
  {
    return (EReference)gridGameEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGridGame_Options()
  {
    return (EReference)gridGameEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellSpecification()
  {
    return cellSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCellSpecification_Name()
  {
    return (EAttribute)cellSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCellSpecification_Members()
  {
    return (EReference)cellSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellMember()
  {
    return cellMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellDisplaySpec()
  {
    return cellDisplaySpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCellDisplaySpec_Display_type()
  {
    return (EAttribute)cellDisplaySpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCellDisplaySpec_Text()
  {
    return (EAttribute)cellDisplaySpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCellDisplaySpec_Var()
  {
    return (EReference)cellDisplaySpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarSpec()
  {
    return varSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVarSpec_Type()
  {
    return (EAttribute)varSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVarSpec_Name()
  {
    return (EAttribute)varSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellVarSpec()
  {
    return cellVarSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobalCellStateSpec()
  {
    return globalCellStateSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGlobalCellStateSpec_Name()
  {
    return (EAttribute)globalCellStateSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalCellStateSpec_Params()
  {
    return (EReference)globalCellStateSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalCellStateSpec_States()
  {
    return (EReference)globalCellStateSpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalCellStateSpec_Start()
  {
    return (EReference)globalCellStateSpecEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateParamSpec()
  {
    return stateParamSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellStateSpec()
  {
    return cellStateSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalCellStateSpec()
  {
    return localCellStateSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalCellStateSpec_States()
  {
    return (EReference)localCellStateSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalCellStateSpec_Start()
  {
    return (EReference)localCellStateSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellStateSpecReference()
  {
    return cellStateSpecReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCellStateSpecReference_StateSpec()
  {
    return (EReference)cellStateSpecReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCellStateSpecReference_Params()
  {
    return (EReference)cellStateSpecReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringValue()
  {
    return stringValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringValue_Value()
  {
    return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntValue()
  {
    return intValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntValue_Value()
  {
    return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarRefValue()
  {
    return varRefValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarRefValue_Ref()
  {
    return (EReference)varRefValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellState()
  {
    return cellStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCellState_Name()
  {
    return (EAttribute)cellStateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCellState_Display()
  {
    return (EReference)cellStateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCellState_Transitions()
  {
    return (EReference)cellStateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCellState_OnEnter()
  {
    return (EReference)cellStateEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionSpec()
  {
    return transitionSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionSpec_Trigger()
  {
    return (EAttribute)transitionSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionSpec_Target()
  {
    return (EReference)transitionSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCellStateBehaviour()
  {
    return cellStateBehaviourEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEndGameBehaviour()
  {
    return endGameBehaviourEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEndGameBehaviour_Message()
  {
    return (EAttribute)endGameBehaviourEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldSpecification()
  {
    return fieldSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldSpecification_Name()
  {
    return (EAttribute)fieldSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldSpecification_Width()
  {
    return (EAttribute)fieldSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldSpecification_Height()
  {
    return (EAttribute)fieldSpecificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldSpecification_Field_initialisation()
  {
    return (EReference)fieldSpecificationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionSpecification()
  {
    return optionSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAllowRestartMenu()
  {
    return allowRestartMenuEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStartFieldDeclaration()
  {
    return startFieldDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStartFieldDeclaration_Field()
  {
    return (EReference)startFieldDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldInitialisations()
  {
    return fieldInitialisationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldInitialisations_Initialisations()
  {
    return (EReference)fieldInitialisationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldInitialisation()
  {
    return fieldInitialisationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldInitialisation_Cell()
  {
    return (EReference)fieldInitialisationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultInitialisation()
  {
    return defaultInitialisationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRandomInitialisation()
  {
    return randomInitialisationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRandomInitialisation_Count()
  {
    return (EAttribute)randomInitialisationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextInitialisation()
  {
    return contextInitialisationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextInitialisation_Check()
  {
    return (EReference)contextInitialisationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextInitialisation_Exp()
  {
    return (EReference)contextInitialisationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextExpression()
  {
    return contextExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextExpression_Sub_exp()
  {
    return (EReference)contextExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicExpression()
  {
    return atomicExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterExpression()
  {
    return filterExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterExpression_Cell_type()
  {
    return (EReference)filterExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCountExpression()
  {
    return countExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotEmptyExpression()
  {
    return notEmptyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoOpBehaviour()
  {
    return noOpBehaviourEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GridGameFactory getGridGameFactory()
  {
    return (GridGameFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    gridGameEClass = createEClass(GRID_GAME);
    createEAttribute(gridGameEClass, GRID_GAME__NAME);
    createEReference(gridGameEClass, GRID_GAME__STATES);
    createEReference(gridGameEClass, GRID_GAME__CELLS);
    createEReference(gridGameEClass, GRID_GAME__FIELDS);
    createEReference(gridGameEClass, GRID_GAME__OPTIONS);

    cellSpecificationEClass = createEClass(CELL_SPECIFICATION);
    createEAttribute(cellSpecificationEClass, CELL_SPECIFICATION__NAME);
    createEReference(cellSpecificationEClass, CELL_SPECIFICATION__MEMBERS);

    cellMemberEClass = createEClass(CELL_MEMBER);

    cellDisplaySpecEClass = createEClass(CELL_DISPLAY_SPEC);
    createEAttribute(cellDisplaySpecEClass, CELL_DISPLAY_SPEC__DISPLAY_TYPE);
    createEAttribute(cellDisplaySpecEClass, CELL_DISPLAY_SPEC__TEXT);
    createEReference(cellDisplaySpecEClass, CELL_DISPLAY_SPEC__VAR);

    varSpecEClass = createEClass(VAR_SPEC);
    createEAttribute(varSpecEClass, VAR_SPEC__TYPE);
    createEAttribute(varSpecEClass, VAR_SPEC__NAME);

    cellVarSpecEClass = createEClass(CELL_VAR_SPEC);

    globalCellStateSpecEClass = createEClass(GLOBAL_CELL_STATE_SPEC);
    createEAttribute(globalCellStateSpecEClass, GLOBAL_CELL_STATE_SPEC__NAME);
    createEReference(globalCellStateSpecEClass, GLOBAL_CELL_STATE_SPEC__PARAMS);
    createEReference(globalCellStateSpecEClass, GLOBAL_CELL_STATE_SPEC__STATES);
    createEReference(globalCellStateSpecEClass, GLOBAL_CELL_STATE_SPEC__START);

    stateParamSpecEClass = createEClass(STATE_PARAM_SPEC);

    cellStateSpecEClass = createEClass(CELL_STATE_SPEC);

    localCellStateSpecEClass = createEClass(LOCAL_CELL_STATE_SPEC);
    createEReference(localCellStateSpecEClass, LOCAL_CELL_STATE_SPEC__STATES);
    createEReference(localCellStateSpecEClass, LOCAL_CELL_STATE_SPEC__START);

    cellStateSpecReferenceEClass = createEClass(CELL_STATE_SPEC_REFERENCE);
    createEReference(cellStateSpecReferenceEClass, CELL_STATE_SPEC_REFERENCE__STATE_SPEC);
    createEReference(cellStateSpecReferenceEClass, CELL_STATE_SPEC_REFERENCE__PARAMS);

    valueEClass = createEClass(VALUE);

    stringValueEClass = createEClass(STRING_VALUE);
    createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

    intValueEClass = createEClass(INT_VALUE);
    createEAttribute(intValueEClass, INT_VALUE__VALUE);

    varRefValueEClass = createEClass(VAR_REF_VALUE);
    createEReference(varRefValueEClass, VAR_REF_VALUE__REF);

    cellStateEClass = createEClass(CELL_STATE);
    createEAttribute(cellStateEClass, CELL_STATE__NAME);
    createEReference(cellStateEClass, CELL_STATE__DISPLAY);
    createEReference(cellStateEClass, CELL_STATE__TRANSITIONS);
    createEReference(cellStateEClass, CELL_STATE__ON_ENTER);

    transitionSpecEClass = createEClass(TRANSITION_SPEC);
    createEAttribute(transitionSpecEClass, TRANSITION_SPEC__TRIGGER);
    createEReference(transitionSpecEClass, TRANSITION_SPEC__TARGET);

    cellStateBehaviourEClass = createEClass(CELL_STATE_BEHAVIOUR);

    endGameBehaviourEClass = createEClass(END_GAME_BEHAVIOUR);
    createEAttribute(endGameBehaviourEClass, END_GAME_BEHAVIOUR__MESSAGE);

    fieldSpecificationEClass = createEClass(FIELD_SPECIFICATION);
    createEAttribute(fieldSpecificationEClass, FIELD_SPECIFICATION__NAME);
    createEAttribute(fieldSpecificationEClass, FIELD_SPECIFICATION__WIDTH);
    createEAttribute(fieldSpecificationEClass, FIELD_SPECIFICATION__HEIGHT);
    createEReference(fieldSpecificationEClass, FIELD_SPECIFICATION__FIELD_INITIALISATION);

    optionSpecificationEClass = createEClass(OPTION_SPECIFICATION);

    allowRestartMenuEClass = createEClass(ALLOW_RESTART_MENU);

    startFieldDeclarationEClass = createEClass(START_FIELD_DECLARATION);
    createEReference(startFieldDeclarationEClass, START_FIELD_DECLARATION__FIELD);

    fieldInitialisationsEClass = createEClass(FIELD_INITIALISATIONS);
    createEReference(fieldInitialisationsEClass, FIELD_INITIALISATIONS__INITIALISATIONS);

    fieldInitialisationEClass = createEClass(FIELD_INITIALISATION);
    createEReference(fieldInitialisationEClass, FIELD_INITIALISATION__CELL);

    defaultInitialisationEClass = createEClass(DEFAULT_INITIALISATION);

    randomInitialisationEClass = createEClass(RANDOM_INITIALISATION);
    createEAttribute(randomInitialisationEClass, RANDOM_INITIALISATION__COUNT);

    contextInitialisationEClass = createEClass(CONTEXT_INITIALISATION);
    createEReference(contextInitialisationEClass, CONTEXT_INITIALISATION__CHECK);
    createEReference(contextInitialisationEClass, CONTEXT_INITIALISATION__EXP);

    contextExpressionEClass = createEClass(CONTEXT_EXPRESSION);
    createEReference(contextExpressionEClass, CONTEXT_EXPRESSION__SUB_EXP);

    atomicExpressionEClass = createEClass(ATOMIC_EXPRESSION);

    filterExpressionEClass = createEClass(FILTER_EXPRESSION);
    createEReference(filterExpressionEClass, FILTER_EXPRESSION__CELL_TYPE);

    countExpressionEClass = createEClass(COUNT_EXPRESSION);

    notEmptyExpressionEClass = createEClass(NOT_EMPTY_EXPRESSION);

    noOpBehaviourEClass = createEClass(NO_OP_BEHAVIOUR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    cellDisplaySpecEClass.getESuperTypes().add(this.getCellMember());
    cellVarSpecEClass.getESuperTypes().add(this.getCellMember());
    cellVarSpecEClass.getESuperTypes().add(this.getVarSpec());
    stateParamSpecEClass.getESuperTypes().add(this.getVarSpec());
    cellStateSpecEClass.getESuperTypes().add(this.getCellMember());
    localCellStateSpecEClass.getESuperTypes().add(this.getCellStateSpec());
    cellStateSpecReferenceEClass.getESuperTypes().add(this.getCellStateSpec());
    stringValueEClass.getESuperTypes().add(this.getValue());
    intValueEClass.getESuperTypes().add(this.getValue());
    varRefValueEClass.getESuperTypes().add(this.getValue());
    endGameBehaviourEClass.getESuperTypes().add(this.getCellStateBehaviour());
    allowRestartMenuEClass.getESuperTypes().add(this.getOptionSpecification());
    startFieldDeclarationEClass.getESuperTypes().add(this.getOptionSpecification());
    defaultInitialisationEClass.getESuperTypes().add(this.getFieldInitialisation());
    randomInitialisationEClass.getESuperTypes().add(this.getFieldInitialisation());
    contextInitialisationEClass.getESuperTypes().add(this.getFieldInitialisation());
    filterExpressionEClass.getESuperTypes().add(this.getAtomicExpression());
    countExpressionEClass.getESuperTypes().add(this.getAtomicExpression());
    notEmptyExpressionEClass.getESuperTypes().add(this.getAtomicExpression());
    noOpBehaviourEClass.getESuperTypes().add(this.getCellStateBehaviour());

    // Initialize classes and features; add operations and parameters
    initEClass(gridGameEClass, GridGame.class, "GridGame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGridGame_Name(), ecorePackage.getEString(), "name", null, 0, 1, GridGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGridGame_States(), this.getGlobalCellStateSpec(), null, "states", null, 0, -1, GridGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGridGame_Cells(), this.getCellSpecification(), null, "cells", null, 0, -1, GridGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGridGame_Fields(), this.getFieldSpecification(), null, "fields", null, 0, -1, GridGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGridGame_Options(), this.getOptionSpecification(), null, "options", null, 0, -1, GridGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellSpecificationEClass, CellSpecification.class, "CellSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCellSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, CellSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCellSpecification_Members(), this.getCellMember(), null, "members", null, 0, -1, CellSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellMemberEClass, CellMember.class, "CellMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cellDisplaySpecEClass, CellDisplaySpec.class, "CellDisplaySpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCellDisplaySpec_Display_type(), ecorePackage.getEString(), "display_type", null, 0, 1, CellDisplaySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCellDisplaySpec_Text(), ecorePackage.getEString(), "text", null, 0, 1, CellDisplaySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCellDisplaySpec_Var(), this.getVarSpec(), null, "var", null, 0, 1, CellDisplaySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varSpecEClass, VarSpec.class, "VarSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVarSpec_Type(), ecorePackage.getEString(), "type", null, 0, 1, VarSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVarSpec_Name(), ecorePackage.getEString(), "name", null, 0, 1, VarSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellVarSpecEClass, CellVarSpec.class, "CellVarSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(globalCellStateSpecEClass, GlobalCellStateSpec.class, "GlobalCellStateSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGlobalCellStateSpec_Name(), ecorePackage.getEString(), "name", null, 0, 1, GlobalCellStateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobalCellStateSpec_Params(), this.getStateParamSpec(), null, "params", null, 0, -1, GlobalCellStateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobalCellStateSpec_States(), this.getCellState(), null, "states", null, 0, -1, GlobalCellStateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGlobalCellStateSpec_Start(), this.getCellState(), null, "start", null, 0, 1, GlobalCellStateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateParamSpecEClass, StateParamSpec.class, "StateParamSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cellStateSpecEClass, CellStateSpec.class, "CellStateSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localCellStateSpecEClass, LocalCellStateSpec.class, "LocalCellStateSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalCellStateSpec_States(), this.getCellState(), null, "states", null, 0, -1, LocalCellStateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalCellStateSpec_Start(), this.getCellState(), null, "start", null, 0, 1, LocalCellStateSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellStateSpecReferenceEClass, CellStateSpecReference.class, "CellStateSpecReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCellStateSpecReference_StateSpec(), this.getGlobalCellStateSpec(), null, "stateSpec", null, 0, 1, CellStateSpecReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCellStateSpecReference_Params(), this.getValue(), null, "params", null, 0, -1, CellStateSpecReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varRefValueEClass, VarRefValue.class, "VarRefValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVarRefValue_Ref(), this.getCellVarSpec(), null, "ref", null, 0, 1, VarRefValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellStateEClass, CellState.class, "CellState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCellState_Name(), ecorePackage.getEString(), "name", null, 0, 1, CellState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCellState_Display(), this.getCellDisplaySpec(), null, "display", null, 0, 1, CellState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCellState_Transitions(), this.getTransitionSpec(), null, "transitions", null, 0, -1, CellState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCellState_OnEnter(), this.getCellStateBehaviour(), null, "onEnter", null, 0, -1, CellState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionSpecEClass, TransitionSpec.class, "TransitionSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionSpec_Trigger(), ecorePackage.getEString(), "trigger", null, 0, 1, TransitionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionSpec_Target(), this.getCellState(), null, "target", null, 0, 1, TransitionSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cellStateBehaviourEClass, CellStateBehaviour.class, "CellStateBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(endGameBehaviourEClass, EndGameBehaviour.class, "EndGameBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEndGameBehaviour_Message(), ecorePackage.getEString(), "message", null, 0, 1, EndGameBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldSpecificationEClass, FieldSpecification.class, "FieldSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFieldSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, FieldSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldSpecification_Width(), ecorePackage.getEInt(), "width", null, 0, 1, FieldSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldSpecification_Height(), ecorePackage.getEInt(), "height", null, 0, 1, FieldSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldSpecification_Field_initialisation(), this.getFieldInitialisations(), null, "field_initialisation", null, 0, 1, FieldSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionSpecificationEClass, OptionSpecification.class, "OptionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(allowRestartMenuEClass, AllowRestartMenu.class, "AllowRestartMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(startFieldDeclarationEClass, StartFieldDeclaration.class, "StartFieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStartFieldDeclaration_Field(), this.getFieldSpecification(), null, "field", null, 0, 1, StartFieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldInitialisationsEClass, FieldInitialisations.class, "FieldInitialisations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFieldInitialisations_Initialisations(), this.getFieldInitialisation(), null, "initialisations", null, 0, -1, FieldInitialisations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldInitialisationEClass, FieldInitialisation.class, "FieldInitialisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFieldInitialisation_Cell(), this.getCellSpecification(), null, "cell", null, 0, 1, FieldInitialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultInitialisationEClass, DefaultInitialisation.class, "DefaultInitialisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(randomInitialisationEClass, RandomInitialisation.class, "RandomInitialisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRandomInitialisation_Count(), ecorePackage.getEInt(), "count", null, 0, 1, RandomInitialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextInitialisationEClass, ContextInitialisation.class, "ContextInitialisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContextInitialisation_Check(), this.getContextExpression(), null, "check", null, 0, 1, ContextInitialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContextInitialisation_Exp(), this.getContextExpression(), null, "exp", null, 0, 1, ContextInitialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextExpressionEClass, ContextExpression.class, "ContextExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContextExpression_Sub_exp(), this.getAtomicExpression(), null, "sub_exp", null, 0, -1, ContextExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicExpressionEClass, AtomicExpression.class, "AtomicExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(filterExpressionEClass, FilterExpression.class, "FilterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterExpression_Cell_type(), this.getCellSpecification(), null, "cell_type", null, 0, 1, FilterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(countExpressionEClass, CountExpression.class, "CountExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(notEmptyExpressionEClass, NotEmptyExpression.class, "NotEmptyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(noOpBehaviourEClass, NoOpBehaviour.class, "NoOpBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //GridGamePackageImpl

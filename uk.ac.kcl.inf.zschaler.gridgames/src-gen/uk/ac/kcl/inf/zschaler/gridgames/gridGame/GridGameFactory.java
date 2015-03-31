/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage
 * @generated
 */
public interface GridGameFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GridGameFactory eINSTANCE = uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Grid Game</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grid Game</em>'.
   * @generated
   */
  GridGame createGridGame();

  /**
   * Returns a new object of class '<em>Cell Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell Specification</em>'.
   * @generated
   */
  CellSpecification createCellSpecification();

  /**
   * Returns a new object of class '<em>Cell Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell Member</em>'.
   * @generated
   */
  CellMember createCellMember();

  /**
   * Returns a new object of class '<em>Cell Display Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell Display Spec</em>'.
   * @generated
   */
  CellDisplaySpec createCellDisplaySpec();

  /**
   * Returns a new object of class '<em>Var Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Spec</em>'.
   * @generated
   */
  VarSpec createVarSpec();

  /**
   * Returns a new object of class '<em>Cell Var Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell Var Spec</em>'.
   * @generated
   */
  CellVarSpec createCellVarSpec();

  /**
   * Returns a new object of class '<em>Global Cell State Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Cell State Spec</em>'.
   * @generated
   */
  GlobalCellStateSpec createGlobalCellStateSpec();

  /**
   * Returns a new object of class '<em>State Param Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Param Spec</em>'.
   * @generated
   */
  StateParamSpec createStateParamSpec();

  /**
   * Returns a new object of class '<em>Cell State Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell State Spec</em>'.
   * @generated
   */
  CellStateSpec createCellStateSpec();

  /**
   * Returns a new object of class '<em>Local Cell State Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Cell State Spec</em>'.
   * @generated
   */
  LocalCellStateSpec createLocalCellStateSpec();

  /**
   * Returns a new object of class '<em>Cell State Spec Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell State Spec Reference</em>'.
   * @generated
   */
  CellStateSpecReference createCellStateSpecReference();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns a new object of class '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Value</em>'.
   * @generated
   */
  IntValue createIntValue();

  /**
   * Returns a new object of class '<em>Var Ref Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Ref Value</em>'.
   * @generated
   */
  VarRefValue createVarRefValue();

  /**
   * Returns a new object of class '<em>Cell State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell State</em>'.
   * @generated
   */
  CellState createCellState();

  /**
   * Returns a new object of class '<em>Transition Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Spec</em>'.
   * @generated
   */
  TransitionSpec createTransitionSpec();

  /**
   * Returns a new object of class '<em>Cell State Behaviour</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell State Behaviour</em>'.
   * @generated
   */
  CellStateBehaviour createCellStateBehaviour();

  /**
   * Returns a new object of class '<em>End Game Behaviour</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>End Game Behaviour</em>'.
   * @generated
   */
  EndGameBehaviour createEndGameBehaviour();

  /**
   * Returns a new object of class '<em>Field Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Specification</em>'.
   * @generated
   */
  FieldSpecification createFieldSpecification();

  /**
   * Returns a new object of class '<em>Option Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option Specification</em>'.
   * @generated
   */
  OptionSpecification createOptionSpecification();

  /**
   * Returns a new object of class '<em>Allow Restart Menu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Allow Restart Menu</em>'.
   * @generated
   */
  AllowRestartMenu createAllowRestartMenu();

  /**
   * Returns a new object of class '<em>Start Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Field Declaration</em>'.
   * @generated
   */
  StartFieldDeclaration createStartFieldDeclaration();

  /**
   * Returns a new object of class '<em>Field Initialisations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Initialisations</em>'.
   * @generated
   */
  FieldInitialisations createFieldInitialisations();

  /**
   * Returns a new object of class '<em>Field Initialisation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Initialisation</em>'.
   * @generated
   */
  FieldInitialisation createFieldInitialisation();

  /**
   * Returns a new object of class '<em>Default Initialisation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Initialisation</em>'.
   * @generated
   */
  DefaultInitialisation createDefaultInitialisation();

  /**
   * Returns a new object of class '<em>Random Initialisation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Random Initialisation</em>'.
   * @generated
   */
  RandomInitialisation createRandomInitialisation();

  /**
   * Returns a new object of class '<em>Context Initialisation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Initialisation</em>'.
   * @generated
   */
  ContextInitialisation createContextInitialisation();

  /**
   * Returns a new object of class '<em>Context Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Expression</em>'.
   * @generated
   */
  ContextExpression createContextExpression();

  /**
   * Returns a new object of class '<em>Atomic Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Expression</em>'.
   * @generated
   */
  AtomicExpression createAtomicExpression();

  /**
   * Returns a new object of class '<em>Filter Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Expression</em>'.
   * @generated
   */
  FilterExpression createFilterExpression();

  /**
   * Returns a new object of class '<em>Count Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Count Expression</em>'.
   * @generated
   */
  CountExpression createCountExpression();

  /**
   * Returns a new object of class '<em>Not Empty Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Empty Expression</em>'.
   * @generated
   */
  NotEmptyExpression createNotEmptyExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GridGamePackage getGridGamePackage();

} //GridGameFactory

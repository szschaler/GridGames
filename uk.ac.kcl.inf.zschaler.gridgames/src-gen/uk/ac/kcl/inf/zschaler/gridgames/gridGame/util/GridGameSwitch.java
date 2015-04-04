/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage
 * @generated
 */
public class GridGameSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GridGamePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GridGameSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GridGamePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GridGamePackage.GRID_GAME:
      {
        GridGame gridGame = (GridGame)theEObject;
        T result = caseGridGame(gridGame);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.CELL_SPECIFICATION:
      {
        CellSpecification cellSpecification = (CellSpecification)theEObject;
        T result = caseCellSpecification(cellSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.CELL_MEMBER:
      {
        CellMember cellMember = (CellMember)theEObject;
        T result = caseCellMember(cellMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.CELL_DISPLAY_SPEC:
      {
        CellDisplaySpec cellDisplaySpec = (CellDisplaySpec)theEObject;
        T result = caseCellDisplaySpec(cellDisplaySpec);
        if (result == null) result = caseCellMember(cellDisplaySpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.VAR_SPEC:
      {
        VarSpec varSpec = (VarSpec)theEObject;
        T result = caseVarSpec(varSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.CELL_VAR_SPEC:
      {
        CellVarSpec cellVarSpec = (CellVarSpec)theEObject;
        T result = caseCellVarSpec(cellVarSpec);
        if (result == null) result = caseCellMember(cellVarSpec);
        if (result == null) result = caseVarSpec(cellVarSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.GLOBAL_CELL_STATE_SPEC:
      {
        GlobalCellStateSpec globalCellStateSpec = (GlobalCellStateSpec)theEObject;
        T result = caseGlobalCellStateSpec(globalCellStateSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.STATE_PARAM_SPEC:
      {
        StateParamSpec stateParamSpec = (StateParamSpec)theEObject;
        T result = caseStateParamSpec(stateParamSpec);
        if (result == null) result = caseVarSpec(stateParamSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.CELL_STATE_SPEC:
      {
        CellStateSpec cellStateSpec = (CellStateSpec)theEObject;
        T result = caseCellStateSpec(cellStateSpec);
        if (result == null) result = caseCellMember(cellStateSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.LOCAL_CELL_STATE_SPEC:
      {
        LocalCellStateSpec localCellStateSpec = (LocalCellStateSpec)theEObject;
        T result = caseLocalCellStateSpec(localCellStateSpec);
        if (result == null) result = caseCellStateSpec(localCellStateSpec);
        if (result == null) result = caseCellMember(localCellStateSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.CELL_STATE_SPEC_REFERENCE:
      {
        CellStateSpecReference cellStateSpecReference = (CellStateSpecReference)theEObject;
        T result = caseCellStateSpecReference(cellStateSpecReference);
        if (result == null) result = caseCellStateSpec(cellStateSpecReference);
        if (result == null) result = caseCellMember(cellStateSpecReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseValue(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.INT_VALUE:
      {
        IntValue intValue = (IntValue)theEObject;
        T result = caseIntValue(intValue);
        if (result == null) result = caseValue(intValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.VAR_REF_VALUE:
      {
        VarRefValue varRefValue = (VarRefValue)theEObject;
        T result = caseVarRefValue(varRefValue);
        if (result == null) result = caseValue(varRefValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.CELL_STATE:
      {
        CellState cellState = (CellState)theEObject;
        T result = caseCellState(cellState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.TRANSITION_SPEC:
      {
        TransitionSpec transitionSpec = (TransitionSpec)theEObject;
        T result = caseTransitionSpec(transitionSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.CELL_STATE_BEHAVIOUR:
      {
        CellStateBehaviour cellStateBehaviour = (CellStateBehaviour)theEObject;
        T result = caseCellStateBehaviour(cellStateBehaviour);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.END_GAME_BEHAVIOUR:
      {
        EndGameBehaviour endGameBehaviour = (EndGameBehaviour)theEObject;
        T result = caseEndGameBehaviour(endGameBehaviour);
        if (result == null) result = caseCellStateBehaviour(endGameBehaviour);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.FIELD_SPECIFICATION:
      {
        FieldSpecification fieldSpecification = (FieldSpecification)theEObject;
        T result = caseFieldSpecification(fieldSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.OPTION_SPECIFICATION:
      {
        OptionSpecification optionSpecification = (OptionSpecification)theEObject;
        T result = caseOptionSpecification(optionSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.ALLOW_RESTART_MENU:
      {
        AllowRestartMenu allowRestartMenu = (AllowRestartMenu)theEObject;
        T result = caseAllowRestartMenu(allowRestartMenu);
        if (result == null) result = caseOptionSpecification(allowRestartMenu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.START_FIELD_DECLARATION:
      {
        StartFieldDeclaration startFieldDeclaration = (StartFieldDeclaration)theEObject;
        T result = caseStartFieldDeclaration(startFieldDeclaration);
        if (result == null) result = caseOptionSpecification(startFieldDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.FIELD_INITIALISATIONS:
      {
        FieldInitialisations fieldInitialisations = (FieldInitialisations)theEObject;
        T result = caseFieldInitialisations(fieldInitialisations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.FIELD_INITIALISATION:
      {
        FieldInitialisation fieldInitialisation = (FieldInitialisation)theEObject;
        T result = caseFieldInitialisation(fieldInitialisation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.DEFAULT_INITIALISATION:
      {
        DefaultInitialisation defaultInitialisation = (DefaultInitialisation)theEObject;
        T result = caseDefaultInitialisation(defaultInitialisation);
        if (result == null) result = caseFieldInitialisation(defaultInitialisation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.RANDOM_INITIALISATION:
      {
        RandomInitialisation randomInitialisation = (RandomInitialisation)theEObject;
        T result = caseRandomInitialisation(randomInitialisation);
        if (result == null) result = caseFieldInitialisation(randomInitialisation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.CONTEXT_INITIALISATION:
      {
        ContextInitialisation contextInitialisation = (ContextInitialisation)theEObject;
        T result = caseContextInitialisation(contextInitialisation);
        if (result == null) result = caseFieldInitialisation(contextInitialisation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.CONTEXT_EXPRESSION:
      {
        ContextExpression contextExpression = (ContextExpression)theEObject;
        T result = caseContextExpression(contextExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.ATOMIC_EXPRESSION:
      {
        AtomicExpression atomicExpression = (AtomicExpression)theEObject;
        T result = caseAtomicExpression(atomicExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.FILTER_EXPRESSION:
      {
        FilterExpression filterExpression = (FilterExpression)theEObject;
        T result = caseFilterExpression(filterExpression);
        if (result == null) result = caseAtomicExpression(filterExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.COUNT_EXPRESSION:
      {
        CountExpression countExpression = (CountExpression)theEObject;
        T result = caseCountExpression(countExpression);
        if (result == null) result = caseAtomicExpression(countExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.NOT_EMPTY_EXPRESSION:
      {
        NotEmptyExpression notEmptyExpression = (NotEmptyExpression)theEObject;
        T result = caseNotEmptyExpression(notEmptyExpression);
        if (result == null) result = caseAtomicExpression(notEmptyExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GridGamePackage.NO_OP_BEHAVIOUR:
      {
        NoOpBehaviour noOpBehaviour = (NoOpBehaviour)theEObject;
        T result = caseNoOpBehaviour(noOpBehaviour);
        if (result == null) result = caseCellStateBehaviour(noOpBehaviour);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grid Game</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grid Game</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGridGame(GridGame object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellSpecification(CellSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellMember(CellMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Display Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Display Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellDisplaySpec(CellDisplaySpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarSpec(VarSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell Var Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell Var Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellVarSpec(CellVarSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Cell State Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Cell State Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalCellStateSpec(GlobalCellStateSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Param Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Param Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateParamSpec(StateParamSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell State Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell State Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellStateSpec(CellStateSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Cell State Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Cell State Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalCellStateSpec(LocalCellStateSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell State Spec Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell State Spec Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellStateSpecReference(CellStateSpecReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntValue(IntValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Ref Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Ref Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarRefValue(VarRefValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellState(CellState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionSpec(TransitionSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cell State Behaviour</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cell State Behaviour</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCellStateBehaviour(CellStateBehaviour object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End Game Behaviour</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End Game Behaviour</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndGameBehaviour(EndGameBehaviour object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldSpecification(FieldSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionSpecification(OptionSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Allow Restart Menu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Allow Restart Menu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllowRestartMenu(AllowRestartMenu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start Field Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartFieldDeclaration(StartFieldDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Initialisations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Initialisations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldInitialisations(FieldInitialisations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Initialisation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Initialisation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldInitialisation(FieldInitialisation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Initialisation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Initialisation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultInitialisation(DefaultInitialisation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Random Initialisation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Random Initialisation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRandomInitialisation(RandomInitialisation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Initialisation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Initialisation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextInitialisation(ContextInitialisation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextExpression(ContextExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicExpression(AtomicExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterExpression(FilterExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Count Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Count Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCountExpression(CountExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Empty Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Empty Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotEmptyExpression(NotEmptyExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>No Op Behaviour</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>No Op Behaviour</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoOpBehaviour(NoOpBehaviour object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GridGameSwitch

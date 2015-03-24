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
      case GridGamePackage.FIELD_SPECIFICATION:
      {
        FieldSpecification fieldSpecification = (FieldSpecification)theEObject;
        T result = caseFieldSpecification(fieldSpecification);
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
      case GridGamePackage.GAME_SPECIFICATION:
      {
        GameSpecification gameSpecification = (GameSpecification)theEObject;
        T result = caseGameSpecification(gameSpecification);
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
   * Returns the result of interpreting the object as an instance of '<em>Game Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Game Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGameSpecification(GameSpecification object)
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
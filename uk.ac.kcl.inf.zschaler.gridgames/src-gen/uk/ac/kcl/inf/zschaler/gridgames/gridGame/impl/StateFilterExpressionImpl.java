/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.StateFilterExpressionImpl#getCell_state <em>Cell state</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateFilterExpressionImpl extends AtomicExpressionImpl implements StateFilterExpression
{
  /**
   * The cached value of the '{@link #getCell_state() <em>Cell state</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCell_state()
   * @generated
   * @ordered
   */
  protected CellState cell_state;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateFilterExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GridGamePackage.Literals.STATE_FILTER_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellState getCell_state()
  {
    if (cell_state != null && cell_state.eIsProxy())
    {
      InternalEObject oldCell_state = (InternalEObject)cell_state;
      cell_state = (CellState)eResolveProxy(oldCell_state);
      if (cell_state != oldCell_state)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridGamePackage.STATE_FILTER_EXPRESSION__CELL_STATE, oldCell_state, cell_state));
      }
    }
    return cell_state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellState basicGetCell_state()
  {
    return cell_state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCell_state(CellState newCell_state)
  {
    CellState oldCell_state = cell_state;
    cell_state = newCell_state;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.STATE_FILTER_EXPRESSION__CELL_STATE, oldCell_state, cell_state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GridGamePackage.STATE_FILTER_EXPRESSION__CELL_STATE:
        if (resolve) return getCell_state();
        return basicGetCell_state();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GridGamePackage.STATE_FILTER_EXPRESSION__CELL_STATE:
        setCell_state((CellState)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GridGamePackage.STATE_FILTER_EXPRESSION__CELL_STATE:
        setCell_state((CellState)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GridGamePackage.STATE_FILTER_EXPRESSION__CELL_STATE:
        return cell_state != null;
    }
    return super.eIsSet(featureID);
  }

} //StateFilterExpressionImpl

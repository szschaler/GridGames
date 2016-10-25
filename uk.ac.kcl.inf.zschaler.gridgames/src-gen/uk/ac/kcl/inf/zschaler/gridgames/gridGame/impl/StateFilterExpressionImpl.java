/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
   * The cached value of the '{@link #getCell_state() <em>Cell state</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCell_state()
   * @generated
   * @ordered
   */
  protected EList<CellState> cell_state;

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
  public EList<CellState> getCell_state()
  {
    if (cell_state == null)
    {
      cell_state = new EObjectResolvingEList<CellState>(CellState.class, this, GridGamePackage.STATE_FILTER_EXPRESSION__CELL_STATE);
    }
    return cell_state;
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
        return getCell_state();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GridGamePackage.STATE_FILTER_EXPRESSION__CELL_STATE:
        getCell_state().clear();
        getCell_state().addAll((Collection<? extends CellState>)newValue);
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
        getCell_state().clear();
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
        return cell_state != null && !cell_state.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StateFilterExpressionImpl

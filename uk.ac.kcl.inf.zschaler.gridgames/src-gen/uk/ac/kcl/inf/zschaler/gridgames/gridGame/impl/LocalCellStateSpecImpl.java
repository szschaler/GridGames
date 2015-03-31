/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalCellStateSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Cell State Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.LocalCellStateSpecImpl#getStates <em>States</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.LocalCellStateSpecImpl#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalCellStateSpecImpl extends CellStateSpecImpl implements LocalCellStateSpec
{
  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<CellState> states;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected CellState start;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalCellStateSpecImpl()
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
    return GridGamePackage.Literals.LOCAL_CELL_STATE_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CellState> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<CellState>(CellState.class, this, GridGamePackage.LOCAL_CELL_STATE_SPEC__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellState getStart()
  {
    if (start != null && start.eIsProxy())
    {
      InternalEObject oldStart = (InternalEObject)start;
      start = (CellState)eResolveProxy(oldStart);
      if (start != oldStart)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridGamePackage.LOCAL_CELL_STATE_SPEC__START, oldStart, start));
      }
    }
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellState basicGetStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(CellState newStart)
  {
    CellState oldStart = start;
    start = newStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.LOCAL_CELL_STATE_SPEC__START, oldStart, start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GridGamePackage.LOCAL_CELL_STATE_SPEC__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GridGamePackage.LOCAL_CELL_STATE_SPEC__STATES:
        return getStates();
      case GridGamePackage.LOCAL_CELL_STATE_SPEC__START:
        if (resolve) return getStart();
        return basicGetStart();
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
      case GridGamePackage.LOCAL_CELL_STATE_SPEC__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends CellState>)newValue);
        return;
      case GridGamePackage.LOCAL_CELL_STATE_SPEC__START:
        setStart((CellState)newValue);
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
      case GridGamePackage.LOCAL_CELL_STATE_SPEC__STATES:
        getStates().clear();
        return;
      case GridGamePackage.LOCAL_CELL_STATE_SPEC__START:
        setStart((CellState)null);
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
      case GridGamePackage.LOCAL_CELL_STATE_SPEC__STATES:
        return states != null && !states.isEmpty();
      case GridGamePackage.LOCAL_CELL_STATE_SPEC__START:
        return start != null;
    }
    return super.eIsSet(featureID);
  }

} //LocalCellStateSpecImpl

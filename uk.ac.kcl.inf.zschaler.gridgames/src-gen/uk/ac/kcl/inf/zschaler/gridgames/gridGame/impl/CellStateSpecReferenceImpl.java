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

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell State Spec Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateSpecReferenceImpl#getStateSpec <em>State Spec</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateSpecReferenceImpl#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellStateSpecReferenceImpl extends CellStateSpecImpl implements CellStateSpecReference
{
  /**
   * The cached value of the '{@link #getStateSpec() <em>State Spec</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateSpec()
   * @generated
   * @ordered
   */
  protected GlobalCellStateSpec stateSpec;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Value> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CellStateSpecReferenceImpl()
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
    return GridGamePackage.Literals.CELL_STATE_SPEC_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalCellStateSpec getStateSpec()
  {
    if (stateSpec != null && stateSpec.eIsProxy())
    {
      InternalEObject oldStateSpec = (InternalEObject)stateSpec;
      stateSpec = (GlobalCellStateSpec)eResolveProxy(oldStateSpec);
      if (stateSpec != oldStateSpec)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridGamePackage.CELL_STATE_SPEC_REFERENCE__STATE_SPEC, oldStateSpec, stateSpec));
      }
    }
    return stateSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalCellStateSpec basicGetStateSpec()
  {
    return stateSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateSpec(GlobalCellStateSpec newStateSpec)
  {
    GlobalCellStateSpec oldStateSpec = stateSpec;
    stateSpec = newStateSpec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.CELL_STATE_SPEC_REFERENCE__STATE_SPEC, oldStateSpec, stateSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Value>(Value.class, this, GridGamePackage.CELL_STATE_SPEC_REFERENCE__PARAMS);
    }
    return params;
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
      case GridGamePackage.CELL_STATE_SPEC_REFERENCE__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case GridGamePackage.CELL_STATE_SPEC_REFERENCE__STATE_SPEC:
        if (resolve) return getStateSpec();
        return basicGetStateSpec();
      case GridGamePackage.CELL_STATE_SPEC_REFERENCE__PARAMS:
        return getParams();
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
      case GridGamePackage.CELL_STATE_SPEC_REFERENCE__STATE_SPEC:
        setStateSpec((GlobalCellStateSpec)newValue);
        return;
      case GridGamePackage.CELL_STATE_SPEC_REFERENCE__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Value>)newValue);
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
      case GridGamePackage.CELL_STATE_SPEC_REFERENCE__STATE_SPEC:
        setStateSpec((GlobalCellStateSpec)null);
        return;
      case GridGamePackage.CELL_STATE_SPEC_REFERENCE__PARAMS:
        getParams().clear();
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
      case GridGamePackage.CELL_STATE_SPEC_REFERENCE__STATE_SPEC:
        return stateSpec != null;
      case GridGamePackage.CELL_STATE_SPEC_REFERENCE__PARAMS:
        return params != null && !params.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CellStateSpecReferenceImpl

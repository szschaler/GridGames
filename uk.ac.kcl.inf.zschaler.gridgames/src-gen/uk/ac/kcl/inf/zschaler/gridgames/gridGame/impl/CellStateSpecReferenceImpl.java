/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell State Spec Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateSpecReferenceImpl#getStateSpec <em>State Spec</em>}</li>
 * </ul>
 * </p>
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
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GridGamePackage.CELL_STATE_SPEC_REFERENCE__STATE_SPEC:
        if (resolve) return getStateSpec();
        return basicGetStateSpec();
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
      case GridGamePackage.CELL_STATE_SPEC_REFERENCE__STATE_SPEC:
        setStateSpec((GlobalCellStateSpec)newValue);
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
    }
    return super.eIsSet(featureID);
  }

} //CellStateSpecReferenceImpl

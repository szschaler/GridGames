/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalFieldInitialisations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Field Initialisations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.LocalFieldInitialisationsImpl#getInitialisations <em>Initialisations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalFieldInitialisationsImpl extends FieldInitialisationsImpl implements LocalFieldInitialisations
{
  /**
   * The cached value of the '{@link #getInitialisations() <em>Initialisations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialisations()
   * @generated
   * @ordered
   */
  protected EList<FieldInitialisation> initialisations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalFieldInitialisationsImpl()
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
    return GridGamePackage.Literals.LOCAL_FIELD_INITIALISATIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldInitialisation> getInitialisations()
  {
    if (initialisations == null)
    {
      initialisations = new EObjectContainmentEList<FieldInitialisation>(FieldInitialisation.class, this, GridGamePackage.LOCAL_FIELD_INITIALISATIONS__INITIALISATIONS);
    }
    return initialisations;
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
      case GridGamePackage.LOCAL_FIELD_INITIALISATIONS__INITIALISATIONS:
        return ((InternalEList<?>)getInitialisations()).basicRemove(otherEnd, msgs);
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
      case GridGamePackage.LOCAL_FIELD_INITIALISATIONS__INITIALISATIONS:
        return getInitialisations();
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
      case GridGamePackage.LOCAL_FIELD_INITIALISATIONS__INITIALISATIONS:
        getInitialisations().clear();
        getInitialisations().addAll((Collection<? extends FieldInitialisation>)newValue);
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
      case GridGamePackage.LOCAL_FIELD_INITIALISATIONS__INITIALISATIONS:
        getInitialisations().clear();
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
      case GridGamePackage.LOCAL_FIELD_INITIALISATIONS__INITIALISATIONS:
        return initialisations != null && !initialisations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LocalFieldInitialisationsImpl

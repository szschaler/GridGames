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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ParamSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Field Initialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalFieldInitialisationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalFieldInitialisationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GlobalFieldInitialisationImpl#getInitialisations <em>Initialisations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalFieldInitialisationImpl extends MinimalEObjectImpl.Container implements GlobalFieldInitialisation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<ParamSpec> params;

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
  protected GlobalFieldInitialisationImpl()
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
    return GridGamePackage.Literals.GLOBAL_FIELD_INITIALISATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.GLOBAL_FIELD_INITIALISATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParamSpec> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<ParamSpec>(ParamSpec.class, this, GridGamePackage.GLOBAL_FIELD_INITIALISATION__PARAMS);
    }
    return params;
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
      initialisations = new EObjectContainmentEList<FieldInitialisation>(FieldInitialisation.class, this, GridGamePackage.GLOBAL_FIELD_INITIALISATION__INITIALISATIONS);
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
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__INITIALISATIONS:
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
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__NAME:
        return getName();
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__PARAMS:
        return getParams();
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__INITIALISATIONS:
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
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__NAME:
        setName((String)newValue);
        return;
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends ParamSpec>)newValue);
        return;
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__INITIALISATIONS:
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
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__PARAMS:
        getParams().clear();
        return;
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__INITIALISATIONS:
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
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__PARAMS:
        return params != null && !params.isEmpty();
      case GridGamePackage.GLOBAL_FIELD_INITIALISATION__INITIALISATIONS:
        return initialisations != null && !initialisations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //GlobalFieldInitialisationImpl

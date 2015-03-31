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

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateBehaviour;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CellStateImpl#getOnEnter <em>On Enter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellStateImpl extends MinimalEObjectImpl.Container implements CellState
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
   * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplay()
   * @generated
   * @ordered
   */
  protected CellDisplaySpec display;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<TransitionSpec> transitions;

  /**
   * The cached value of the '{@link #getOnEnter() <em>On Enter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnEnter()
   * @generated
   * @ordered
   */
  protected EList<CellStateBehaviour> onEnter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CellStateImpl()
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
    return GridGamePackage.Literals.CELL_STATE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.CELL_STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellDisplaySpec getDisplay()
  {
    return display;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDisplay(CellDisplaySpec newDisplay, NotificationChain msgs)
  {
    CellDisplaySpec oldDisplay = display;
    display = newDisplay;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GridGamePackage.CELL_STATE__DISPLAY, oldDisplay, newDisplay);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplay(CellDisplaySpec newDisplay)
  {
    if (newDisplay != display)
    {
      NotificationChain msgs = null;
      if (display != null)
        msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GridGamePackage.CELL_STATE__DISPLAY, null, msgs);
      if (newDisplay != null)
        msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GridGamePackage.CELL_STATE__DISPLAY, null, msgs);
      msgs = basicSetDisplay(newDisplay, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.CELL_STATE__DISPLAY, newDisplay, newDisplay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TransitionSpec> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList<TransitionSpec>(TransitionSpec.class, this, GridGamePackage.CELL_STATE__TRANSITIONS);
    }
    return transitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CellStateBehaviour> getOnEnter()
  {
    if (onEnter == null)
    {
      onEnter = new EObjectContainmentEList<CellStateBehaviour>(CellStateBehaviour.class, this, GridGamePackage.CELL_STATE__ON_ENTER);
    }
    return onEnter;
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
      case GridGamePackage.CELL_STATE__DISPLAY:
        return basicSetDisplay(null, msgs);
      case GridGamePackage.CELL_STATE__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
      case GridGamePackage.CELL_STATE__ON_ENTER:
        return ((InternalEList<?>)getOnEnter()).basicRemove(otherEnd, msgs);
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
      case GridGamePackage.CELL_STATE__NAME:
        return getName();
      case GridGamePackage.CELL_STATE__DISPLAY:
        return getDisplay();
      case GridGamePackage.CELL_STATE__TRANSITIONS:
        return getTransitions();
      case GridGamePackage.CELL_STATE__ON_ENTER:
        return getOnEnter();
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
      case GridGamePackage.CELL_STATE__NAME:
        setName((String)newValue);
        return;
      case GridGamePackage.CELL_STATE__DISPLAY:
        setDisplay((CellDisplaySpec)newValue);
        return;
      case GridGamePackage.CELL_STATE__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends TransitionSpec>)newValue);
        return;
      case GridGamePackage.CELL_STATE__ON_ENTER:
        getOnEnter().clear();
        getOnEnter().addAll((Collection<? extends CellStateBehaviour>)newValue);
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
      case GridGamePackage.CELL_STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GridGamePackage.CELL_STATE__DISPLAY:
        setDisplay((CellDisplaySpec)null);
        return;
      case GridGamePackage.CELL_STATE__TRANSITIONS:
        getTransitions().clear();
        return;
      case GridGamePackage.CELL_STATE__ON_ENTER:
        getOnEnter().clear();
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
      case GridGamePackage.CELL_STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GridGamePackage.CELL_STATE__DISPLAY:
        return display != null;
      case GridGamePackage.CELL_STATE__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
      case GridGamePackage.CELL_STATE__ON_ENTER:
        return onEnter != null && !onEnter.isEmpty();
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

} //CellStateImpl

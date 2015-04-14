/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionTriggerSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.TransitionSpecImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.TransitionSpecImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionSpecImpl extends MinimalEObjectImpl.Container implements TransitionSpec
{
  /**
   * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected TransitionTriggerSpec trigger;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected CellState target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionSpecImpl()
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
    return GridGamePackage.Literals.TRANSITION_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionTriggerSpec getTrigger()
  {
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrigger(TransitionTriggerSpec newTrigger, NotificationChain msgs)
  {
    TransitionTriggerSpec oldTrigger = trigger;
    trigger = newTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GridGamePackage.TRANSITION_SPEC__TRIGGER, oldTrigger, newTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrigger(TransitionTriggerSpec newTrigger)
  {
    if (newTrigger != trigger)
    {
      NotificationChain msgs = null;
      if (trigger != null)
        msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GridGamePackage.TRANSITION_SPEC__TRIGGER, null, msgs);
      if (newTrigger != null)
        msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GridGamePackage.TRANSITION_SPEC__TRIGGER, null, msgs);
      msgs = basicSetTrigger(newTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.TRANSITION_SPEC__TRIGGER, newTrigger, newTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellState getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (CellState)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridGamePackage.TRANSITION_SPEC__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellState basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(CellState newTarget)
  {
    CellState oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.TRANSITION_SPEC__TARGET, oldTarget, target));
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
      case GridGamePackage.TRANSITION_SPEC__TRIGGER:
        return basicSetTrigger(null, msgs);
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
      case GridGamePackage.TRANSITION_SPEC__TRIGGER:
        return getTrigger();
      case GridGamePackage.TRANSITION_SPEC__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
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
      case GridGamePackage.TRANSITION_SPEC__TRIGGER:
        setTrigger((TransitionTriggerSpec)newValue);
        return;
      case GridGamePackage.TRANSITION_SPEC__TARGET:
        setTarget((CellState)newValue);
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
      case GridGamePackage.TRANSITION_SPEC__TRIGGER:
        setTrigger((TransitionTriggerSpec)null);
        return;
      case GridGamePackage.TRANSITION_SPEC__TARGET:
        setTarget((CellState)null);
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
      case GridGamePackage.TRANSITION_SPEC__TRIGGER:
        return trigger != null;
      case GridGamePackage.TRANSITION_SPEC__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }

} //TransitionSpecImpl

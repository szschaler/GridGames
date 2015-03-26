/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Initialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextInitialisationImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextInitialisationImpl#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextInitialisationImpl extends FieldInitialisationImpl implements ContextInitialisation
{
  /**
   * The cached value of the '{@link #getCheck() <em>Check</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheck()
   * @generated
   * @ordered
   */
  protected ContextExpression check;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected ContextExpression exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextInitialisationImpl()
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
    return GridGamePackage.Literals.CONTEXT_INITIALISATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextExpression getCheck()
  {
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCheck(ContextExpression newCheck, NotificationChain msgs)
  {
    ContextExpression oldCheck = check;
    check = newCheck;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GridGamePackage.CONTEXT_INITIALISATION__CHECK, oldCheck, newCheck);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCheck(ContextExpression newCheck)
  {
    if (newCheck != check)
    {
      NotificationChain msgs = null;
      if (check != null)
        msgs = ((InternalEObject)check).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GridGamePackage.CONTEXT_INITIALISATION__CHECK, null, msgs);
      if (newCheck != null)
        msgs = ((InternalEObject)newCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GridGamePackage.CONTEXT_INITIALISATION__CHECK, null, msgs);
      msgs = basicSetCheck(newCheck, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.CONTEXT_INITIALISATION__CHECK, newCheck, newCheck));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextExpression getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(ContextExpression newExp, NotificationChain msgs)
  {
    ContextExpression oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GridGamePackage.CONTEXT_INITIALISATION__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(ContextExpression newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GridGamePackage.CONTEXT_INITIALISATION__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GridGamePackage.CONTEXT_INITIALISATION__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.CONTEXT_INITIALISATION__EXP, newExp, newExp));
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
      case GridGamePackage.CONTEXT_INITIALISATION__CHECK:
        return basicSetCheck(null, msgs);
      case GridGamePackage.CONTEXT_INITIALISATION__EXP:
        return basicSetExp(null, msgs);
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
      case GridGamePackage.CONTEXT_INITIALISATION__CHECK:
        return getCheck();
      case GridGamePackage.CONTEXT_INITIALISATION__EXP:
        return getExp();
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
      case GridGamePackage.CONTEXT_INITIALISATION__CHECK:
        setCheck((ContextExpression)newValue);
        return;
      case GridGamePackage.CONTEXT_INITIALISATION__EXP:
        setExp((ContextExpression)newValue);
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
      case GridGamePackage.CONTEXT_INITIALISATION__CHECK:
        setCheck((ContextExpression)null);
        return;
      case GridGamePackage.CONTEXT_INITIALISATION__EXP:
        setExp((ContextExpression)null);
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
      case GridGamePackage.CONTEXT_INITIALISATION__CHECK:
        return check != null;
      case GridGamePackage.CONTEXT_INITIALISATION__EXP:
        return exp != null;
    }
    return super.eIsSet(featureID);
  }

} //ContextInitialisationImpl

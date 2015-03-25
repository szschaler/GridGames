/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.AtomicExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.ContextExpressionImpl#getSub_exp <em>Sub exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextExpressionImpl extends MinimalEObjectImpl.Container implements ContextExpression
{
  /**
   * The cached value of the '{@link #getSub_exp() <em>Sub exp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSub_exp()
   * @generated
   * @ordered
   */
  protected EList<AtomicExpression> sub_exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextExpressionImpl()
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
    return GridGamePackage.Literals.CONTEXT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AtomicExpression> getSub_exp()
  {
    if (sub_exp == null)
    {
      sub_exp = new EObjectContainmentEList<AtomicExpression>(AtomicExpression.class, this, GridGamePackage.CONTEXT_EXPRESSION__SUB_EXP);
    }
    return sub_exp;
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
      case GridGamePackage.CONTEXT_EXPRESSION__SUB_EXP:
        return ((InternalEList<?>)getSub_exp()).basicRemove(otherEnd, msgs);
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
      case GridGamePackage.CONTEXT_EXPRESSION__SUB_EXP:
        return getSub_exp();
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
      case GridGamePackage.CONTEXT_EXPRESSION__SUB_EXP:
        getSub_exp().clear();
        getSub_exp().addAll((Collection<? extends AtomicExpression>)newValue);
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
      case GridGamePackage.CONTEXT_EXPRESSION__SUB_EXP:
        getSub_exp().clear();
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
      case GridGamePackage.CONTEXT_EXPRESSION__SUB_EXP:
        return sub_exp != null && !sub_exp.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ContextExpressionImpl

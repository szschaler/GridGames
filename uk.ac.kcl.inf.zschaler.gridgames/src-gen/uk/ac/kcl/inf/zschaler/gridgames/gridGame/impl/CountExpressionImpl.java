/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CountExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.CountExpressionImpl#getCmpVal <em>Cmp Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountExpressionImpl extends AtomicExpressionImpl implements CountExpression
{
  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The default value of the '{@link #getCmpVal() <em>Cmp Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmpVal()
   * @generated
   * @ordered
   */
  protected static final int CMP_VAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCmpVal() <em>Cmp Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmpVal()
   * @generated
   * @ordered
   */
  protected int cmpVal = CMP_VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CountExpressionImpl()
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
    return GridGamePackage.Literals.COUNT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.COUNT_EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCmpVal()
  {
    return cmpVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmpVal(int newCmpVal)
  {
    int oldCmpVal = cmpVal;
    cmpVal = newCmpVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.COUNT_EXPRESSION__CMP_VAL, oldCmpVal, cmpVal));
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
      case GridGamePackage.COUNT_EXPRESSION__OP:
        return getOp();
      case GridGamePackage.COUNT_EXPRESSION__CMP_VAL:
        return getCmpVal();
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
      case GridGamePackage.COUNT_EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case GridGamePackage.COUNT_EXPRESSION__CMP_VAL:
        setCmpVal((Integer)newValue);
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
      case GridGamePackage.COUNT_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case GridGamePackage.COUNT_EXPRESSION__CMP_VAL:
        setCmpVal(CMP_VAL_EDEFAULT);
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
      case GridGamePackage.COUNT_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case GridGamePackage.COUNT_EXPRESSION__CMP_VAL:
        return cmpVal != CMP_VAL_EDEFAULT;
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
    result.append(" (op: ");
    result.append(op);
    result.append(", cmpVal: ");
    result.append(cmpVal);
    result.append(')');
    return result.toString();
  }

} //CountExpressionImpl

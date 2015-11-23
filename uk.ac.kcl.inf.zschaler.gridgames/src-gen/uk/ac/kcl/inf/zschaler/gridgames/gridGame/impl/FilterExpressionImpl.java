/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FilterExpressionImpl#getCell_type <em>Cell type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterExpressionImpl extends AtomicExpressionImpl implements FilterExpression
{
  /**
   * The cached value of the '{@link #getCell_type() <em>Cell type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCell_type()
   * @generated
   * @ordered
   */
  protected CellSpecification cell_type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterExpressionImpl()
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
    return GridGamePackage.Literals.FILTER_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellSpecification getCell_type()
  {
    if (cell_type != null && cell_type.eIsProxy())
    {
      InternalEObject oldCell_type = (InternalEObject)cell_type;
      cell_type = (CellSpecification)eResolveProxy(oldCell_type);
      if (cell_type != oldCell_type)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridGamePackage.FILTER_EXPRESSION__CELL_TYPE, oldCell_type, cell_type));
      }
    }
    return cell_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellSpecification basicGetCell_type()
  {
    return cell_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCell_type(CellSpecification newCell_type)
  {
    CellSpecification oldCell_type = cell_type;
    cell_type = newCell_type;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.FILTER_EXPRESSION__CELL_TYPE, oldCell_type, cell_type));
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
      case GridGamePackage.FILTER_EXPRESSION__CELL_TYPE:
        if (resolve) return getCell_type();
        return basicGetCell_type();
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
      case GridGamePackage.FILTER_EXPRESSION__CELL_TYPE:
        setCell_type((CellSpecification)newValue);
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
      case GridGamePackage.FILTER_EXPRESSION__CELL_TYPE:
        setCell_type((CellSpecification)null);
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
      case GridGamePackage.FILTER_EXPRESSION__CELL_TYPE:
        return cell_type != null;
    }
    return super.eIsSet(featureID);
  }

} //FilterExpressionImpl

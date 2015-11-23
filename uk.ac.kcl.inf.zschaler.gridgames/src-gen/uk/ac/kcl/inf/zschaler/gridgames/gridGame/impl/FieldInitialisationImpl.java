/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Initialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldInitialisationImpl#getCell <em>Cell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldInitialisationImpl extends MinimalEObjectImpl.Container implements FieldInitialisation
{
  /**
   * The cached value of the '{@link #getCell() <em>Cell</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCell()
   * @generated
   * @ordered
   */
  protected CellSpecification cell;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldInitialisationImpl()
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
    return GridGamePackage.Literals.FIELD_INITIALISATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellSpecification getCell()
  {
    if (cell != null && cell.eIsProxy())
    {
      InternalEObject oldCell = (InternalEObject)cell;
      cell = (CellSpecification)eResolveProxy(oldCell);
      if (cell != oldCell)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GridGamePackage.FIELD_INITIALISATION__CELL, oldCell, cell));
      }
    }
    return cell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CellSpecification basicGetCell()
  {
    return cell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCell(CellSpecification newCell)
  {
    CellSpecification oldCell = cell;
    cell = newCell;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.FIELD_INITIALISATION__CELL, oldCell, cell));
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
      case GridGamePackage.FIELD_INITIALISATION__CELL:
        if (resolve) return getCell();
        return basicGetCell();
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
      case GridGamePackage.FIELD_INITIALISATION__CELL:
        setCell((CellSpecification)newValue);
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
      case GridGamePackage.FIELD_INITIALISATION__CELL:
        setCell((CellSpecification)null);
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
      case GridGamePackage.FIELD_INITIALISATION__CELL:
        return cell != null;
    }
    return super.eIsSet(featureID);
  }

} //FieldInitialisationImpl

/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisations;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldSpecificationImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldSpecificationImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.FieldSpecificationImpl#getField_initialisation <em>Field initialisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldSpecificationImpl extends MinimalEObjectImpl.Container implements FieldSpecification
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
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected int width = WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected static final int HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected int height = HEIGHT_EDEFAULT;

  /**
   * The cached value of the '{@link #getField_initialisation() <em>Field initialisation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField_initialisation()
   * @generated
   * @ordered
   */
  protected FieldInitialisations field_initialisation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldSpecificationImpl()
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
    return GridGamePackage.Literals.FIELD_SPECIFICATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.FIELD_SPECIFICATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(int newWidth)
  {
    int oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.FIELD_SPECIFICATION__WIDTH, oldWidth, width));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(int newHeight)
  {
    int oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.FIELD_SPECIFICATION__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldInitialisations getField_initialisation()
  {
    return field_initialisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetField_initialisation(FieldInitialisations newField_initialisation, NotificationChain msgs)
  {
    FieldInitialisations oldField_initialisation = field_initialisation;
    field_initialisation = newField_initialisation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GridGamePackage.FIELD_SPECIFICATION__FIELD_INITIALISATION, oldField_initialisation, newField_initialisation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField_initialisation(FieldInitialisations newField_initialisation)
  {
    if (newField_initialisation != field_initialisation)
    {
      NotificationChain msgs = null;
      if (field_initialisation != null)
        msgs = ((InternalEObject)field_initialisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GridGamePackage.FIELD_SPECIFICATION__FIELD_INITIALISATION, null, msgs);
      if (newField_initialisation != null)
        msgs = ((InternalEObject)newField_initialisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GridGamePackage.FIELD_SPECIFICATION__FIELD_INITIALISATION, null, msgs);
      msgs = basicSetField_initialisation(newField_initialisation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.FIELD_SPECIFICATION__FIELD_INITIALISATION, newField_initialisation, newField_initialisation));
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
      case GridGamePackage.FIELD_SPECIFICATION__FIELD_INITIALISATION:
        return basicSetField_initialisation(null, msgs);
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
      case GridGamePackage.FIELD_SPECIFICATION__NAME:
        return getName();
      case GridGamePackage.FIELD_SPECIFICATION__WIDTH:
        return getWidth();
      case GridGamePackage.FIELD_SPECIFICATION__HEIGHT:
        return getHeight();
      case GridGamePackage.FIELD_SPECIFICATION__FIELD_INITIALISATION:
        return getField_initialisation();
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
      case GridGamePackage.FIELD_SPECIFICATION__NAME:
        setName((String)newValue);
        return;
      case GridGamePackage.FIELD_SPECIFICATION__WIDTH:
        setWidth((Integer)newValue);
        return;
      case GridGamePackage.FIELD_SPECIFICATION__HEIGHT:
        setHeight((Integer)newValue);
        return;
      case GridGamePackage.FIELD_SPECIFICATION__FIELD_INITIALISATION:
        setField_initialisation((FieldInitialisations)newValue);
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
      case GridGamePackage.FIELD_SPECIFICATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GridGamePackage.FIELD_SPECIFICATION__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case GridGamePackage.FIELD_SPECIFICATION__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case GridGamePackage.FIELD_SPECIFICATION__FIELD_INITIALISATION:
        setField_initialisation((FieldInitialisations)null);
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
      case GridGamePackage.FIELD_SPECIFICATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GridGamePackage.FIELD_SPECIFICATION__WIDTH:
        return width != WIDTH_EDEFAULT;
      case GridGamePackage.FIELD_SPECIFICATION__HEIGHT:
        return height != HEIGHT_EDEFAULT;
      case GridGamePackage.FIELD_SPECIFICATION__FIELD_INITIALISATION:
        return field_initialisation != null;
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
    result.append(", width: ");
    result.append(width);
    result.append(", height: ");
    result.append(height);
    result.append(')');
    return result.toString();
  }

} //FieldSpecificationImpl

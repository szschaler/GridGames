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

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.OptionSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl#getStates <em>States</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl#getInits <em>Inits</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridGameImpl extends MinimalEObjectImpl.Container implements GridGame
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
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<GlobalCellStateSpec> states;

  /**
   * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCells()
   * @generated
   * @ordered
   */
  protected EList<CellSpecification> cells;

  /**
   * The cached value of the '{@link #getInits() <em>Inits</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInits()
   * @generated
   * @ordered
   */
  protected EList<GlobalFieldInitialisation> inits;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<FieldSpecification> fields;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<OptionSpecification> options;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GridGameImpl()
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
    return GridGamePackage.Literals.GRID_GAME;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.GRID_GAME__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GlobalCellStateSpec> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<GlobalCellStateSpec>(GlobalCellStateSpec.class, this, GridGamePackage.GRID_GAME__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CellSpecification> getCells()
  {
    if (cells == null)
    {
      cells = new EObjectContainmentEList<CellSpecification>(CellSpecification.class, this, GridGamePackage.GRID_GAME__CELLS);
    }
    return cells;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GlobalFieldInitialisation> getInits()
  {
    if (inits == null)
    {
      inits = new EObjectContainmentEList<GlobalFieldInitialisation>(GlobalFieldInitialisation.class, this, GridGamePackage.GRID_GAME__INITS);
    }
    return inits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldSpecification> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<FieldSpecification>(FieldSpecification.class, this, GridGamePackage.GRID_GAME__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OptionSpecification> getOptions()
  {
    if (options == null)
    {
      options = new EObjectContainmentEList<OptionSpecification>(OptionSpecification.class, this, GridGamePackage.GRID_GAME__OPTIONS);
    }
    return options;
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
      case GridGamePackage.GRID_GAME__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case GridGamePackage.GRID_GAME__CELLS:
        return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
      case GridGamePackage.GRID_GAME__INITS:
        return ((InternalEList<?>)getInits()).basicRemove(otherEnd, msgs);
      case GridGamePackage.GRID_GAME__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case GridGamePackage.GRID_GAME__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
      case GridGamePackage.GRID_GAME__NAME:
        return getName();
      case GridGamePackage.GRID_GAME__STATES:
        return getStates();
      case GridGamePackage.GRID_GAME__CELLS:
        return getCells();
      case GridGamePackage.GRID_GAME__INITS:
        return getInits();
      case GridGamePackage.GRID_GAME__FIELDS:
        return getFields();
      case GridGamePackage.GRID_GAME__OPTIONS:
        return getOptions();
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
      case GridGamePackage.GRID_GAME__NAME:
        setName((String)newValue);
        return;
      case GridGamePackage.GRID_GAME__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends GlobalCellStateSpec>)newValue);
        return;
      case GridGamePackage.GRID_GAME__CELLS:
        getCells().clear();
        getCells().addAll((Collection<? extends CellSpecification>)newValue);
        return;
      case GridGamePackage.GRID_GAME__INITS:
        getInits().clear();
        getInits().addAll((Collection<? extends GlobalFieldInitialisation>)newValue);
        return;
      case GridGamePackage.GRID_GAME__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends FieldSpecification>)newValue);
        return;
      case GridGamePackage.GRID_GAME__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends OptionSpecification>)newValue);
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
      case GridGamePackage.GRID_GAME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GridGamePackage.GRID_GAME__STATES:
        getStates().clear();
        return;
      case GridGamePackage.GRID_GAME__CELLS:
        getCells().clear();
        return;
      case GridGamePackage.GRID_GAME__INITS:
        getInits().clear();
        return;
      case GridGamePackage.GRID_GAME__FIELDS:
        getFields().clear();
        return;
      case GridGamePackage.GRID_GAME__OPTIONS:
        getOptions().clear();
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
      case GridGamePackage.GRID_GAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GridGamePackage.GRID_GAME__STATES:
        return states != null && !states.isEmpty();
      case GridGamePackage.GRID_GAME__CELLS:
        return cells != null && !cells.isEmpty();
      case GridGamePackage.GRID_GAME__INITS:
        return inits != null && !inits.isEmpty();
      case GridGamePackage.GRID_GAME__FIELDS:
        return fields != null && !fields.isEmpty();
      case GridGamePackage.GRID_GAME__OPTIONS:
        return options != null && !options.isEmpty();
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

} //GridGameImpl

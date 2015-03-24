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
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GameSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl#getField_initialisation <em>Field initialisation</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameImpl#getGame <em>Game</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridGameImpl extends MinimalEObjectImpl.Container implements GridGame
{
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
   * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCells()
   * @generated
   * @ordered
   */
  protected EList<CellSpecification> cells;

  /**
   * The default value of the '{@link #getField_initialisation() <em>Field initialisation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField_initialisation()
   * @generated
   * @ordered
   */
  protected static final String FIELD_INITIALISATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getField_initialisation() <em>Field initialisation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField_initialisation()
   * @generated
   * @ordered
   */
  protected String field_initialisation = FIELD_INITIALISATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getGame() <em>Game</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGame()
   * @generated
   * @ordered
   */
  protected GameSpecification game;

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
  public String getField_initialisation()
  {
    return field_initialisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField_initialisation(String newField_initialisation)
  {
    String oldField_initialisation = field_initialisation;
    field_initialisation = newField_initialisation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.GRID_GAME__FIELD_INITIALISATION, oldField_initialisation, field_initialisation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameSpecification getGame()
  {
    return game;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGame(GameSpecification newGame, NotificationChain msgs)
  {
    GameSpecification oldGame = game;
    game = newGame;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GridGamePackage.GRID_GAME__GAME, oldGame, newGame);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGame(GameSpecification newGame)
  {
    if (newGame != game)
    {
      NotificationChain msgs = null;
      if (game != null)
        msgs = ((InternalEObject)game).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GridGamePackage.GRID_GAME__GAME, null, msgs);
      if (newGame != null)
        msgs = ((InternalEObject)newGame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GridGamePackage.GRID_GAME__GAME, null, msgs);
      msgs = basicSetGame(newGame, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GridGamePackage.GRID_GAME__GAME, newGame, newGame));
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
      case GridGamePackage.GRID_GAME__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case GridGamePackage.GRID_GAME__CELLS:
        return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
      case GridGamePackage.GRID_GAME__GAME:
        return basicSetGame(null, msgs);
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
      case GridGamePackage.GRID_GAME__FIELDS:
        return getFields();
      case GridGamePackage.GRID_GAME__CELLS:
        return getCells();
      case GridGamePackage.GRID_GAME__FIELD_INITIALISATION:
        return getField_initialisation();
      case GridGamePackage.GRID_GAME__GAME:
        return getGame();
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
      case GridGamePackage.GRID_GAME__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends FieldSpecification>)newValue);
        return;
      case GridGamePackage.GRID_GAME__CELLS:
        getCells().clear();
        getCells().addAll((Collection<? extends CellSpecification>)newValue);
        return;
      case GridGamePackage.GRID_GAME__FIELD_INITIALISATION:
        setField_initialisation((String)newValue);
        return;
      case GridGamePackage.GRID_GAME__GAME:
        setGame((GameSpecification)newValue);
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
      case GridGamePackage.GRID_GAME__FIELDS:
        getFields().clear();
        return;
      case GridGamePackage.GRID_GAME__CELLS:
        getCells().clear();
        return;
      case GridGamePackage.GRID_GAME__FIELD_INITIALISATION:
        setField_initialisation(FIELD_INITIALISATION_EDEFAULT);
        return;
      case GridGamePackage.GRID_GAME__GAME:
        setGame((GameSpecification)null);
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
      case GridGamePackage.GRID_GAME__FIELDS:
        return fields != null && !fields.isEmpty();
      case GridGamePackage.GRID_GAME__CELLS:
        return cells != null && !cells.isEmpty();
      case GridGamePackage.GRID_GAME__FIELD_INITIALISATION:
        return FIELD_INITIALISATION_EDEFAULT == null ? field_initialisation != null : !FIELD_INITIALISATION_EDEFAULT.equals(field_initialisation);
      case GridGamePackage.GRID_GAME__GAME:
        return game != null;
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
    result.append(" (field_initialisation: ");
    result.append(field_initialisation);
    result.append(')');
    return result.toString();
  }

} //GridGameImpl
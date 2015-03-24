/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getFields <em>Fields</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getCells <em>Cells</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getField_initialisation <em>Field initialisation</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getGame <em>Game</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getGridGame()
 * @model
 * @generated
 */
public interface GridGame extends EObject
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getGridGame_Fields()
   * @model containment="true"
   * @generated
   */
  EList<FieldSpecification> getFields();

  /**
   * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cells</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cells</em>' containment reference list.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getGridGame_Cells()
   * @model containment="true"
   * @generated
   */
  EList<CellSpecification> getCells();

  /**
   * Returns the value of the '<em><b>Field initialisation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field initialisation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field initialisation</em>' attribute.
   * @see #setField_initialisation(String)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getGridGame_Field_initialisation()
   * @model
   * @generated
   */
  String getField_initialisation();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getField_initialisation <em>Field initialisation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field initialisation</em>' attribute.
   * @see #getField_initialisation()
   * @generated
   */
  void setField_initialisation(String value);

  /**
   * Returns the value of the '<em><b>Game</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Game</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Game</em>' containment reference.
   * @see #setGame(GameSpecification)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getGridGame_Game()
   * @model containment="true"
   * @generated
   */
  GameSpecification getGame();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame#getGame <em>Game</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Game</em>' containment reference.
   * @see #getGame()
   * @generated
   */
  void setGame(GameSpecification value);

} // GridGame
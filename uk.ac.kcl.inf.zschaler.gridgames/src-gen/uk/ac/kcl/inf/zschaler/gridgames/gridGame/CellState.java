/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getDisplay <em>Display</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getOnEnter <em>On Enter</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getCellState()
 * @model
 * @generated
 */
public interface CellState extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getCellState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Display</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Display</em>' containment reference.
   * @see #setDisplay(CellDisplaySpec)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getCellState_Display()
   * @model containment="true"
   * @generated
   */
  CellDisplaySpec getDisplay();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState#getDisplay <em>Display</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display</em>' containment reference.
   * @see #getDisplay()
   * @generated
   */
  void setDisplay(CellDisplaySpec value);

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getCellState_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<TransitionSpec> getTransitions();

  /**
   * Returns the value of the '<em><b>On Enter</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateBehaviour}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Enter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Enter</em>' containment reference list.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getCellState_OnEnter()
   * @model containment="true"
   * @generated
   */
  EList<CellStateBehaviour> getOnEnter();

} // CellState

/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getTransitionSpec()
 * @model
 * @generated
 */
public interface TransitionSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference.
   * @see #setTrigger(TransitionTriggerSpec)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getTransitionSpec_Trigger()
   * @model containment="true"
   * @generated
   */
  TransitionTriggerSpec getTrigger();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(TransitionTriggerSpec value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(CellState)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getTransitionSpec_Target()
   * @model
   * @generated
   */
  CellState getTarget();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(CellState value);

} // TransitionSpec

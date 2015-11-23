/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mouse Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.MouseTrigger#isLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getMouseTrigger()
 * @model
 * @generated
 */
public interface MouseTrigger extends TransitionTriggerSpec
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' attribute.
   * @see #setLeft(boolean)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getMouseTrigger_Left()
   * @model
   * @generated
   */
  boolean isLeft();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.MouseTrigger#isLeft <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' attribute.
   * @see #isLeft()
   * @generated
   */
  void setLeft(boolean value);

} // MouseTrigger

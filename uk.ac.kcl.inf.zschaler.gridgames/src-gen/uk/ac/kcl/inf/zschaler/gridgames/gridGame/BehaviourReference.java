/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.BehaviourReference#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getBehaviourReference()
 * @model
 * @generated
 */
public interface BehaviourReference extends CellStateBehaviour
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(VarSpec)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getBehaviourReference_Ref()
   * @model
   * @generated
   */
  VarSpec getRef();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.BehaviourReference#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(VarSpec value);

} // BehaviourReference

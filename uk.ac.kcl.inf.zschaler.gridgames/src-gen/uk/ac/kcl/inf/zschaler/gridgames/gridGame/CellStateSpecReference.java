/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell State Spec Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference#getStateSpec <em>State Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getCellStateSpecReference()
 * @model
 * @generated
 */
public interface CellStateSpecReference extends CellStateSpec
{
  /**
   * Returns the value of the '<em><b>State Spec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Spec</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Spec</em>' reference.
   * @see #setStateSpec(GlobalCellStateSpec)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getCellStateSpecReference_StateSpec()
   * @model
   * @generated
   */
  GlobalCellStateSpec getStateSpec();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference#getStateSpec <em>State Spec</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Spec</em>' reference.
   * @see #getStateSpec()
   * @generated
   */
  void setStateSpec(GlobalCellStateSpec value);

} // CellStateSpecReference

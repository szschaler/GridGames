/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression#getCell_state <em>Cell state</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getStateFilterExpression()
 * @model
 * @generated
 */
public interface StateFilterExpression extends AtomicExpression
{
  /**
   * Returns the value of the '<em><b>Cell state</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cell state</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cell state</em>' reference.
   * @see #setCell_state(CellState)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getStateFilterExpression_Cell_state()
   * @model
   * @generated
   */
  CellState getCell_state();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression#getCell_state <em>Cell state</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cell state</em>' reference.
   * @see #getCell_state()
   * @generated
   */
  void setCell_state(CellState value);

} // StateFilterExpression

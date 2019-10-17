/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression#getCell_state <em>Cell state</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getStateFilterExpression()
 * @model
 * @generated
 */
public interface StateFilterExpression extends AtomicExpression
{
  /**
   * Returns the value of the '<em><b>Cell state</b></em>' reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cell state</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cell state</em>' reference list.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getStateFilterExpression_Cell_state()
   * @model
   * @generated
   */
  EList<CellState> getCell_state();

} // StateFilterExpression

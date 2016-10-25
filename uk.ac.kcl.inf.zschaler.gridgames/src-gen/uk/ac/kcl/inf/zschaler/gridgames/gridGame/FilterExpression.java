/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression#getCell_type <em>Cell type</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getFilterExpression()
 * @model
 * @generated
 */
public interface FilterExpression extends AtomicExpression
{
  /**
   * Returns the value of the '<em><b>Cell type</b></em>' reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cell type</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cell type</em>' reference list.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getFilterExpression_Cell_type()
   * @model
   * @generated
   */
  EList<CellSpecification> getCell_type();

} // FilterExpression

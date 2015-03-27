/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression#getCell_type <em>Cell type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getFilterExpression()
 * @model
 * @generated
 */
public interface FilterExpression extends AtomicExpression
{
  /**
   * Returns the value of the '<em><b>Cell type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cell type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cell type</em>' reference.
   * @see #setCell_type(CellSpecification)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getFilterExpression_Cell_type()
   * @model
   * @generated
   */
  CellSpecification getCell_type();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression#getCell_type <em>Cell type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cell type</em>' reference.
   * @see #getCell_type()
   * @generated
   */
  void setCell_type(CellSpecification value);

} // FilterExpression

/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Initialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation#getCell <em>Cell</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getFieldInitialisation()
 * @model
 * @generated
 */
public interface FieldInitialisation extends EObject
{
  /**
   * Returns the value of the '<em><b>Cell</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cell</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cell</em>' reference.
   * @see #setCell(CellSpecification)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getFieldInitialisation_Cell()
   * @model
   * @generated
   */
  CellSpecification getCell();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation#getCell <em>Cell</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cell</em>' reference.
   * @see #getCell()
   * @generated
   */
  void setCell(CellSpecification value);

} // FieldInitialisation

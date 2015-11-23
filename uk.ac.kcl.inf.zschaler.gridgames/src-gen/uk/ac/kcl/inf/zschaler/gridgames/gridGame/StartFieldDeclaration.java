/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getStartFieldDeclaration()
 * @model
 * @generated
 */
public interface StartFieldDeclaration extends OptionSpecification
{
  /**
   * Returns the value of the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' reference.
   * @see #setField(FieldSpecification)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getStartFieldDeclaration_Field()
   * @model
   * @generated
   */
  FieldSpecification getField();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration#getField <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' reference.
   * @see #getField()
   * @generated
   */
  void setField(FieldSpecification value);

} // StartFieldDeclaration

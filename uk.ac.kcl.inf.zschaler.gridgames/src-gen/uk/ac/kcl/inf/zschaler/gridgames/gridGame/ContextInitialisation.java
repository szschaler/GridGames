/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Initialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getContextInitialisation()
 * @model
 * @generated
 */
public interface ContextInitialisation extends FieldInitialisation
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(ContextExpression)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getContextInitialisation_Exp()
   * @model containment="true"
   * @generated
   */
  ContextExpression getExp();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(ContextExpression value);

} // ContextInitialisation

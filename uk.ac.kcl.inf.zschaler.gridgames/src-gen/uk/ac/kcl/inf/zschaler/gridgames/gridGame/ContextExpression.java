/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression#getSub_exp <em>Sub exp</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getContextExpression()
 * @model
 * @generated
 */
public interface ContextExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Sub exp</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.AtomicExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub exp</em>' containment reference list.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getContextExpression_Sub_exp()
   * @model containment="true"
   * @generated
   */
  EList<AtomicExpression> getSub_exp();

} // ContextExpression

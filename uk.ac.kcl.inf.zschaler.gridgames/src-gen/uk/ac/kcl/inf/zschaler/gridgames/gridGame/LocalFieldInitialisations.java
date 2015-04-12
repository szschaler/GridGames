/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Field Initialisations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalFieldInitialisations#getInitialisations <em>Initialisations</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getLocalFieldInitialisations()
 * @model
 * @generated
 */
public interface LocalFieldInitialisations extends FieldInitialisations
{
  /**
   * Returns the value of the '<em><b>Initialisations</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialisations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialisations</em>' containment reference list.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getLocalFieldInitialisations_Initialisations()
   * @model containment="true"
   * @generated
   */
  EList<FieldInitialisation> getInitialisations();

} // LocalFieldInitialisations

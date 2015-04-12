/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Field Initialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation#getParams <em>Params</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation#getInitialisations <em>Initialisations</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getGlobalFieldInitialisation()
 * @model
 * @generated
 */
public interface GlobalFieldInitialisation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getGlobalFieldInitialisation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.ParamSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getGlobalFieldInitialisation_Params()
   * @model containment="true"
   * @generated
   */
  EList<ParamSpec> getParams();

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
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getGlobalFieldInitialisation_Initialisations()
   * @model containment="true"
   * @generated
   */
  EList<FieldInitialisation> getInitialisations();

} // GlobalFieldInitialisation

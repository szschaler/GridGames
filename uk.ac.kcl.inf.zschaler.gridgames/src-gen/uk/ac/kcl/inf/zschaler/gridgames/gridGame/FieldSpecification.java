/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getWidth <em>Width</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getHeight <em>Height</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getField_initialisation <em>Field initialisation</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getFieldSpecification()
 * @model
 * @generated
 */
public interface FieldSpecification extends EObject
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
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getFieldSpecification_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(int)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getFieldSpecification_Width()
   * @model
   * @generated
   */
  int getWidth();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(int value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #setHeight(int)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getFieldSpecification_Height()
   * @model
   * @generated
   */
  int getHeight();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #getHeight()
   * @generated
   */
  void setHeight(int value);

  /**
   * Returns the value of the '<em><b>Field initialisation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field initialisation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field initialisation</em>' containment reference.
   * @see #setField_initialisation(FieldInitialisations)
   * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage#getFieldSpecification_Field_initialisation()
   * @model containment="true"
   * @generated
   */
  FieldInitialisations getField_initialisation();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification#getField_initialisation <em>Field initialisation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field initialisation</em>' containment reference.
   * @see #getField_initialisation()
   * @generated
   */
  void setField_initialisation(FieldInitialisations value);

} // FieldSpecification

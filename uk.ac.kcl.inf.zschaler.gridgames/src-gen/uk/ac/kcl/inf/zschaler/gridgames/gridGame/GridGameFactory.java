/**
 */
package uk.ac.kcl.inf.zschaler.gridgames.gridGame;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage
 * @generated
 */
public interface GridGameFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GridGameFactory eINSTANCE = uk.ac.kcl.inf.zschaler.gridgames.gridGame.impl.GridGameFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Grid Game</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grid Game</em>'.
   * @generated
   */
  GridGame createGridGame();

  /**
   * Returns a new object of class '<em>Cell Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cell Specification</em>'.
   * @generated
   */
  CellSpecification createCellSpecification();

  /**
   * Returns a new object of class '<em>Field Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Specification</em>'.
   * @generated
   */
  FieldSpecification createFieldSpecification();

  /**
   * Returns a new object of class '<em>Option Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option Specification</em>'.
   * @generated
   */
  OptionSpecification createOptionSpecification();

  /**
   * Returns a new object of class '<em>Allow Restart Menu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Allow Restart Menu</em>'.
   * @generated
   */
  AllowRestartMenu createAllowRestartMenu();

  /**
   * Returns a new object of class '<em>Start Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Field Declaration</em>'.
   * @generated
   */
  StartFieldDeclaration createStartFieldDeclaration();

  /**
   * Returns a new object of class '<em>Field Initialisations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Initialisations</em>'.
   * @generated
   */
  FieldInitialisations createFieldInitialisations();

  /**
   * Returns a new object of class '<em>Field Initialisation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Initialisation</em>'.
   * @generated
   */
  FieldInitialisation createFieldInitialisation();

  /**
   * Returns a new object of class '<em>Default Initialisation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Initialisation</em>'.
   * @generated
   */
  DefaultInitialisation createDefaultInitialisation();

  /**
   * Returns a new object of class '<em>Random Initialisation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Random Initialisation</em>'.
   * @generated
   */
  RandomInitialisation createRandomInitialisation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GridGamePackage getGridGamePackage();

} //GridGameFactory

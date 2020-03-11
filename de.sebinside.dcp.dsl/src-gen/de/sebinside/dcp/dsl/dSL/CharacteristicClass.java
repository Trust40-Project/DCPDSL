/**
 * generated by Xtext 2.20.0
 */
package de.sebinside.dcp.dsl.dSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.CharacteristicClass#getName <em>Name</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.CharacteristicClass#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicClass()
 * @model
 * @generated
 */
public interface CharacteristicClass extends AbstractElement
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicClass_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.CharacteristicClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link de.sebinside.dcp.dsl.dSL.CharacteristicTypeSelector}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicClass_Members()
	 * @model containment="true"
	 * @generated
	 */
  EList<CharacteristicTypeSelector> getMembers();

} // CharacteristicClass

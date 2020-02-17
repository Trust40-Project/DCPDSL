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
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link de.sebinside.dcp.dsl.dSL.CharacteristicSelector}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicClass_Members()
	 * @model containment="true"
	 * @generated
	 */
  EList<CharacteristicSelector> getMembers();

} // CharacteristicClass

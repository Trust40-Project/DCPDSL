/**
 * generated by Xtext 2.20.0
 */
package de.sebinside.dcp.dsl.dSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristics Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.CharacteristicsType#getValueset <em>Valueset</em>}</li>
 * </ul>
 *
 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicsType()
 * @model
 * @generated
 */
public interface CharacteristicsType extends AbstractElement
{
  /**
	 * Returns the value of the '<em><b>Valueset</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Valueset</em>' reference.
	 * @see #setValueset(ValueSet)
	 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getCharacteristicsType_Valueset()
	 * @model
	 * @generated
	 */
  ValueSet getValueset();

  /**
	 * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.CharacteristicsType#getValueset <em>Valueset</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valueset</em>' reference.
	 * @see #getValueset()
	 * @generated
	 */
  void setValueset(ValueSet value);

} // CharacteristicsType

/**
 * generated by Xtext 2.20.0
 */
package de.sebinside.dcp.dsl.dSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.AttributeSelector#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getAttributeSelector()
 * @model
 * @generated
 */
public interface AttributeSelector extends DataSelector
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(CharacteristicSelector)
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getAttributeSelector_Ref()
   * @model containment="true"
   * @generated
   */
  CharacteristicSelector getRef();

  /**
   * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.AttributeSelector#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(CharacteristicSelector value);

} // AttributeSelector
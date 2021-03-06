/**
 * generated by Xtext 2.21.0
 */
package de.sebinside.dcp.dsl.dSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Of Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.ElementOfOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.ElementOfOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getElementOfOperation()
 * @model
 * @generated
 */
public interface ElementOfOperation extends SimpleBooleanOperation
{
  /**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(CharacteristicReference)
	 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getElementOfOperation_Left()
	 * @model containment="true"
	 * @generated
	 */
  CharacteristicReference getLeft();

  /**
	 * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.ElementOfOperation#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
  void setLeft(CharacteristicReference value);

  /**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(CharacteristicSetReference)
	 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getElementOfOperation_Right()
	 * @model containment="true"
	 * @generated
	 */
  CharacteristicSetReference getRight();

  /**
	 * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.ElementOfOperation#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
  void setRight(CharacteristicSetReference value);

} // ElementOfOperation

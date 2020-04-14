/**
 * generated by Xtext 2.21.0
 */
package de.sebinside.dcp.dsl.dSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.Statement#getModality <em>Modality</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.Statement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Modality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modality</em>' containment reference.
   * @see #setModality(StatementModality)
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getStatement_Modality()
   * @model containment="true"
   * @generated
   */
  StatementModality getModality();

  /**
   * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.Statement#getModality <em>Modality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modality</em>' containment reference.
   * @see #getModality()
   * @generated
   */
  void setModality(StatementModality value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(StatementType)
   * @see de.sebinside.dcp.dsl.dSL.DSLPackage#getStatement_Type()
   * @model containment="true"
   * @generated
   */
  StatementType getType();

  /**
   * Sets the value of the '{@link de.sebinside.dcp.dsl.dSL.Statement#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(StatementType value);

} // Statement

/**
 * generated by Xtext 2.21.0
 */
package de.sebinside.dcp.dsl.dSL.tests;

import de.sebinside.dcp.dsl.dSL.DSLFactory;
import de.sebinside.dcp.dsl.dSL.IntersectionOperation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intersection Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntersectionOperationTest extends CharacteristsicSetOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntersectionOperationTest.class);
	}

	/**
	 * Constructs a new Intersection Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntersectionOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intersection Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntersectionOperation getFixture() {
		return (IntersectionOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DSLFactory.eINSTANCE.createIntersectionOperation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IntersectionOperationTest

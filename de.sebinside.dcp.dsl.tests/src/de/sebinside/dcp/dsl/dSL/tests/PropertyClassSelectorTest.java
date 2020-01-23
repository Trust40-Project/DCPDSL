/**
 * generated by Xtext 2.20.0
 */
package de.sebinside.dcp.dsl.dSL.tests;

import de.sebinside.dcp.dsl.dSL.DSLFactory;
import de.sebinside.dcp.dsl.dSL.PropertyClassSelector;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property Class Selector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyClassSelectorTest extends DestinationSelectorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyClassSelectorTest.class);
	}

	/**
	 * Constructs a new Property Class Selector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyClassSelectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property Class Selector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropertyClassSelector getFixture() {
		return (PropertyClassSelector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DSLFactory.eINSTANCE.createPropertyClassSelector());
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

} //PropertyClassSelectorTest
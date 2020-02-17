/**
 * generated by Xtext 2.20.0
 */
package de.sebinside.dcp.dsl.dSL.impl;

import de.sebinside.dcp.dsl.dSL.AttributeClassSelector;
import de.sebinside.dcp.dsl.dSL.CharacteristicClass;
import de.sebinside.dcp.dsl.dSL.DSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Class Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.impl.AttributeClassSelectorImpl#isNegated <em>Negated</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.impl.AttributeClassSelectorImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeClassSelectorImpl extends DataSelectorImpl implements AttributeClassSelector
{
  /**
	 * The default value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
  protected static final boolean NEGATED_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
  protected boolean negated = NEGATED_EDEFAULT;

  /**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
  protected CharacteristicClass ref;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AttributeClassSelectorImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return DSLPackage.Literals.ATTRIBUTE_CLASS_SELECTOR;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean isNegated()
  {
		return negated;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setNegated(boolean newNegated)
  {
		boolean oldNegated = negated;
		negated = newNegated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.ATTRIBUTE_CLASS_SELECTOR__NEGATED, oldNegated, negated));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristicClass getRef()
  {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (CharacteristicClass)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DSLPackage.ATTRIBUTE_CLASS_SELECTOR__REF, oldRef, ref));
			}
		}
		return ref;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CharacteristicClass basicGetRef()
  {
		return ref;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setRef(CharacteristicClass newRef)
  {
		CharacteristicClass oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.ATTRIBUTE_CLASS_SELECTOR__REF, oldRef, ref));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case DSLPackage.ATTRIBUTE_CLASS_SELECTOR__NEGATED:
				return isNegated();
			case DSLPackage.ATTRIBUTE_CLASS_SELECTOR__REF:
				if (resolve) return getRef();
				return basicGetRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case DSLPackage.ATTRIBUTE_CLASS_SELECTOR__NEGATED:
				setNegated((Boolean)newValue);
				return;
			case DSLPackage.ATTRIBUTE_CLASS_SELECTOR__REF:
				setRef((CharacteristicClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case DSLPackage.ATTRIBUTE_CLASS_SELECTOR__NEGATED:
				setNegated(NEGATED_EDEFAULT);
				return;
			case DSLPackage.ATTRIBUTE_CLASS_SELECTOR__REF:
				setRef((CharacteristicClass)null);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case DSLPackage.ATTRIBUTE_CLASS_SELECTOR__NEGATED:
				return negated != NEGATED_EDEFAULT;
			case DSLPackage.ATTRIBUTE_CLASS_SELECTOR__REF:
				return ref != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (negated: ");
		result.append(negated);
		result.append(')');
		return result.toString();
	}

} //AttributeClassSelectorImpl

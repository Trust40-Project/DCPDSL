/**
 * generated by Xtext 2.21.0
 */
package de.sebinside.dcp.dsl.dSL.impl;

import de.sebinside.dcp.dsl.dSL.CharacteristicSetReference;
import de.sebinside.dcp.dsl.dSL.DSLPackage;
import de.sebinside.dcp.dsl.dSL.UnionOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.impl.UnionOperationImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.sebinside.dcp.dsl.dSL.impl.UnionOperationImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnionOperationImpl extends CharacteristsicSetOperationImpl implements UnionOperation
{
  /**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
  protected CharacteristicSetReference left;

  /**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
  protected CharacteristicSetReference right;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected UnionOperationImpl()
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
		return DSLPackage.Literals.UNION_OPERATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristicSetReference getLeft()
  {
		return left;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetLeft(CharacteristicSetReference newLeft, NotificationChain msgs)
  {
		CharacteristicSetReference oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSLPackage.UNION_OPERATION__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setLeft(CharacteristicSetReference newLeft)
  {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSLPackage.UNION_OPERATION__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSLPackage.UNION_OPERATION__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.UNION_OPERATION__LEFT, newLeft, newLeft));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public CharacteristicSetReference getRight()
  {
		return right;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRight(CharacteristicSetReference newRight, NotificationChain msgs)
  {
		CharacteristicSetReference oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSLPackage.UNION_OPERATION__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setRight(CharacteristicSetReference newRight)
  {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSLPackage.UNION_OPERATION__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSLPackage.UNION_OPERATION__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.UNION_OPERATION__RIGHT, newRight, newRight));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case DSLPackage.UNION_OPERATION__LEFT:
				return basicSetLeft(null, msgs);
			case DSLPackage.UNION_OPERATION__RIGHT:
				return basicSetRight(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case DSLPackage.UNION_OPERATION__LEFT:
				return getLeft();
			case DSLPackage.UNION_OPERATION__RIGHT:
				return getRight();
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
			case DSLPackage.UNION_OPERATION__LEFT:
				setLeft((CharacteristicSetReference)newValue);
				return;
			case DSLPackage.UNION_OPERATION__RIGHT:
				setRight((CharacteristicSetReference)newValue);
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
			case DSLPackage.UNION_OPERATION__LEFT:
				setLeft((CharacteristicSetReference)null);
				return;
			case DSLPackage.UNION_OPERATION__RIGHT:
				setRight((CharacteristicSetReference)null);
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
			case DSLPackage.UNION_OPERATION__LEFT:
				return left != null;
			case DSLPackage.UNION_OPERATION__RIGHT:
				return right != null;
		}
		return super.eIsSet(featureID);
	}

} //UnionOperationImpl

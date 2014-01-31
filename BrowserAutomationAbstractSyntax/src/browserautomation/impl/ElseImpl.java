/**
 */
package browserautomation.impl;

import browserautomation.BrowserautomationPackage;
import browserautomation.Else;
import browserautomation.OperationSequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link browserautomation.impl.ElseImpl#getOperationSequence <em>Operation Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElseImpl extends MinimalEObjectImpl.Container implements Else {
	/**
	 * The cached value of the '{@link #getOperationSequence() <em>Operation Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationSequence()
	 * @generated
	 * @ordered
	 */
	protected OperationSequence operationSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BrowserautomationPackage.Literals.ELSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSequence getOperationSequence() {
		return operationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationSequence(OperationSequence newOperationSequence, NotificationChain msgs) {
		OperationSequence oldOperationSequence = operationSequence;
		operationSequence = newOperationSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserautomationPackage.ELSE__OPERATION_SEQUENCE, oldOperationSequence, newOperationSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationSequence(OperationSequence newOperationSequence) {
		if (newOperationSequence != operationSequence) {
			NotificationChain msgs = null;
			if (operationSequence != null)
				msgs = ((InternalEObject)operationSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserautomationPackage.ELSE__OPERATION_SEQUENCE, null, msgs);
			if (newOperationSequence != null)
				msgs = ((InternalEObject)newOperationSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserautomationPackage.ELSE__OPERATION_SEQUENCE, null, msgs);
			msgs = basicSetOperationSequence(newOperationSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrowserautomationPackage.ELSE__OPERATION_SEQUENCE, newOperationSequence, newOperationSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BrowserautomationPackage.ELSE__OPERATION_SEQUENCE:
				return basicSetOperationSequence(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BrowserautomationPackage.ELSE__OPERATION_SEQUENCE:
				return getOperationSequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BrowserautomationPackage.ELSE__OPERATION_SEQUENCE:
				setOperationSequence((OperationSequence)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case BrowserautomationPackage.ELSE__OPERATION_SEQUENCE:
				setOperationSequence((OperationSequence)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BrowserautomationPackage.ELSE__OPERATION_SEQUENCE:
				return operationSequence != null;
		}
		return super.eIsSet(featureID);
	}

} //ElseImpl

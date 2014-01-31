/**
 */
package browserautomation.impl;

import browserautomation.BrowserautomationPackage;
import browserautomation.Condition;
import browserautomation.LoopCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link browserautomation.impl.LoopConditionImpl#getConditionLoop <em>Condition Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopConditionImpl extends LoopImpl implements LoopCondition {
	/**
	 * The cached value of the '{@link #getConditionLoop() <em>Condition Loop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionLoop()
	 * @generated
	 * @ordered
	 */
	protected Condition conditionLoop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BrowserautomationPackage.Literals.LOOP_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getConditionLoop() {
		return conditionLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionLoop(Condition newConditionLoop, NotificationChain msgs) {
		Condition oldConditionLoop = conditionLoop;
		conditionLoop = newConditionLoop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserautomationPackage.LOOP_CONDITION__CONDITION_LOOP, oldConditionLoop, newConditionLoop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionLoop(Condition newConditionLoop) {
		if (newConditionLoop != conditionLoop) {
			NotificationChain msgs = null;
			if (conditionLoop != null)
				msgs = ((InternalEObject)conditionLoop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserautomationPackage.LOOP_CONDITION__CONDITION_LOOP, null, msgs);
			if (newConditionLoop != null)
				msgs = ((InternalEObject)newConditionLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserautomationPackage.LOOP_CONDITION__CONDITION_LOOP, null, msgs);
			msgs = basicSetConditionLoop(newConditionLoop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrowserautomationPackage.LOOP_CONDITION__CONDITION_LOOP, newConditionLoop, newConditionLoop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BrowserautomationPackage.LOOP_CONDITION__CONDITION_LOOP:
				return basicSetConditionLoop(null, msgs);
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
			case BrowserautomationPackage.LOOP_CONDITION__CONDITION_LOOP:
				return getConditionLoop();
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
			case BrowserautomationPackage.LOOP_CONDITION__CONDITION_LOOP:
				setConditionLoop((Condition)newValue);
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
			case BrowserautomationPackage.LOOP_CONDITION__CONDITION_LOOP:
				setConditionLoop((Condition)null);
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
			case BrowserautomationPackage.LOOP_CONDITION__CONDITION_LOOP:
				return conditionLoop != null;
		}
		return super.eIsSet(featureID);
	}

} //LoopConditionImpl

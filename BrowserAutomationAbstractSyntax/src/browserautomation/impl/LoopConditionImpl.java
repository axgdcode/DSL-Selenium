/**
 */
package browserautomation.impl;

import browserautomation.BrowserautomationPackage;
import browserautomation.Condition;
import browserautomation.LoopCondition;

import browserautomation.OperationSequence;
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
 *   <li>{@link browserautomation.impl.LoopConditionImpl#getOperations <em>Operations</em>}</li>
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
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected OperationSequence operations;

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
	public OperationSequence getOperations() {
		if (operations != null && operations.eIsProxy()) {
			InternalEObject oldOperations = (InternalEObject)operations;
			operations = (OperationSequence)eResolveProxy(oldOperations);
			if (operations != oldOperations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BrowserautomationPackage.LOOP_CONDITION__OPERATIONS, oldOperations, operations));
			}
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSequence basicGetOperations() {
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperations(OperationSequence newOperations) {
		OperationSequence oldOperations = operations;
		operations = newOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrowserautomationPackage.LOOP_CONDITION__OPERATIONS, oldOperations, operations));
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
			case BrowserautomationPackage.LOOP_CONDITION__OPERATIONS:
				if (resolve) return getOperations();
				return basicGetOperations();
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
			case BrowserautomationPackage.LOOP_CONDITION__OPERATIONS:
				setOperations((OperationSequence)newValue);
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
			case BrowserautomationPackage.LOOP_CONDITION__OPERATIONS:
				setOperations((OperationSequence)null);
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
			case BrowserautomationPackage.LOOP_CONDITION__OPERATIONS:
				return operations != null;
		}
		return super.eIsSet(featureID);
	}

} //LoopConditionImpl

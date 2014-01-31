/**
 */
package browserautomation.impl;

import browserautomation.BrowserautomationPackage;
import browserautomation.Operation;
import browserautomation.OperationSequence;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link browserautomation.impl.OperationSequenceImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link browserautomation.impl.OperationSequenceImpl#getOperationSequence <em>Operation Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OperationSequenceImpl extends MinimalEObjectImpl.Container implements OperationSequence {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * The cached value of the '{@link #getOperationSequence() <em>Operation Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationSequence> operationSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BrowserautomationPackage.Literals.OPERATION_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<Operation>(Operation.class, this, BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationSequence> getOperationSequence() {
		if (operationSequence == null) {
			operationSequence = new EObjectContainmentEList<OperationSequence>(OperationSequence.class, this, BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION_SEQUENCE);
		}
		return operationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION_SEQUENCE:
				return ((InternalEList<?>)getOperationSequence()).basicRemove(otherEnd, msgs);
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
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION:
				return getOperation();
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION_SEQUENCE:
				return getOperationSequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION_SEQUENCE:
				getOperationSequence().clear();
				getOperationSequence().addAll((Collection<? extends OperationSequence>)newValue);
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
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION:
				getOperation().clear();
				return;
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION_SEQUENCE:
				getOperationSequence().clear();
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
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION:
				return operation != null && !operation.isEmpty();
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION_SEQUENCE:
				return operationSequence != null && !operationSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationSequenceImpl

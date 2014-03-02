/**
 */
package browserautomation.impl;

import browserautomation.BrowserautomationPackage;
import browserautomation.Collection;
import browserautomation.LoopCollection;

import browserautomation.OperationSequence;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link browserautomation.impl.LoopCollectionImpl#getCollectionLoop <em>Collection Loop</em>}</li>
 *   <li>{@link browserautomation.impl.LoopCollectionImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopCollectionImpl extends LoopImpl implements LoopCollection {
	/**
	 * The cached value of the '{@link #getCollectionLoop() <em>Collection Loop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionLoop()
	 * @generated
	 * @ordered
	 */
	protected Collection collectionLoop;

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
	protected LoopCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BrowserautomationPackage.Literals.LOOP_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getCollectionLoop() {
		return collectionLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectionLoop(Collection newCollectionLoop, NotificationChain msgs) {
		Collection oldCollectionLoop = collectionLoop;
		collectionLoop = newCollectionLoop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserautomationPackage.LOOP_COLLECTION__COLLECTION_LOOP, oldCollectionLoop, newCollectionLoop);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionLoop(Collection newCollectionLoop) {
		if (newCollectionLoop != collectionLoop) {
			NotificationChain msgs = null;
			if (collectionLoop != null)
				msgs = ((InternalEObject)collectionLoop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserautomationPackage.LOOP_COLLECTION__COLLECTION_LOOP, null, msgs);
			if (newCollectionLoop != null)
				msgs = ((InternalEObject)newCollectionLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserautomationPackage.LOOP_COLLECTION__COLLECTION_LOOP, null, msgs);
			msgs = basicSetCollectionLoop(newCollectionLoop, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrowserautomationPackage.LOOP_COLLECTION__COLLECTION_LOOP, newCollectionLoop, newCollectionLoop));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BrowserautomationPackage.LOOP_COLLECTION__OPERATIONS, oldOperations, operations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BrowserautomationPackage.LOOP_COLLECTION__OPERATIONS, oldOperations, operations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BrowserautomationPackage.LOOP_COLLECTION__COLLECTION_LOOP:
				return basicSetCollectionLoop(null, msgs);
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
			case BrowserautomationPackage.LOOP_COLLECTION__COLLECTION_LOOP:
				return getCollectionLoop();
			case BrowserautomationPackage.LOOP_COLLECTION__OPERATIONS:
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
			case BrowserautomationPackage.LOOP_COLLECTION__COLLECTION_LOOP:
				setCollectionLoop((Collection)newValue);
				return;
			case BrowserautomationPackage.LOOP_COLLECTION__OPERATIONS:
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
			case BrowserautomationPackage.LOOP_COLLECTION__COLLECTION_LOOP:
				setCollectionLoop((Collection)null);
				return;
			case BrowserautomationPackage.LOOP_COLLECTION__OPERATIONS:
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
			case BrowserautomationPackage.LOOP_COLLECTION__COLLECTION_LOOP:
				return collectionLoop != null;
			case BrowserautomationPackage.LOOP_COLLECTION__OPERATIONS:
				return operations != null;
		}
		return super.eIsSet(featureID);
	}

} //LoopCollectionImpl

/**
 */
package browserautomation.impl;

import browserautomation.BrowserautomationPackage;
import browserautomation.Collection;
import browserautomation.LoopCollection;

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
		}
		return super.eIsSet(featureID);
	}

} //LoopCollectionImpl

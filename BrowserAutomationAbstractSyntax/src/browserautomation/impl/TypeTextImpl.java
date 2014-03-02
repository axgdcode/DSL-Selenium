/**
 */
package browserautomation.impl;

import browserautomation.BrowserautomationPackage;
import browserautomation.TypeText;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link browserautomation.impl.TypeTextImpl#getText <em>Text</em>}</li>
 *   <li>{@link browserautomation.impl.TypeTextImpl#getIdBlock <em>Id Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTextImpl extends UIOperationImpl implements TypeText {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;
	/**
	 * The default value of the '{@link #getIdBlock() <em>Id Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdBlock()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_BLOCK_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIdBlock() <em>Id Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdBlock()
	 * @generated
	 * @ordered
	 */
	protected String idBlock = ID_BLOCK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BrowserautomationPackage.Literals.TYPE_TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrowserautomationPackage.TYPE_TEXT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdBlock() {
		return idBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdBlock(String newIdBlock) {
		String oldIdBlock = idBlock;
		idBlock = newIdBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrowserautomationPackage.TYPE_TEXT__ID_BLOCK, oldIdBlock, idBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BrowserautomationPackage.TYPE_TEXT__TEXT:
				return getText();
			case BrowserautomationPackage.TYPE_TEXT__ID_BLOCK:
				return getIdBlock();
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
			case BrowserautomationPackage.TYPE_TEXT__TEXT:
				setText((String)newValue);
				return;
			case BrowserautomationPackage.TYPE_TEXT__ID_BLOCK:
				setIdBlock((String)newValue);
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
			case BrowserautomationPackage.TYPE_TEXT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case BrowserautomationPackage.TYPE_TEXT__ID_BLOCK:
				setIdBlock(ID_BLOCK_EDEFAULT);
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
			case BrowserautomationPackage.TYPE_TEXT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case BrowserautomationPackage.TYPE_TEXT__ID_BLOCK:
				return ID_BLOCK_EDEFAULT == null ? idBlock != null : !ID_BLOCK_EDEFAULT.equals(idBlock);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(", idBlock: ");
		result.append(idBlock);
		result.append(')');
		return result.toString();
	}

} //TypeTextImpl

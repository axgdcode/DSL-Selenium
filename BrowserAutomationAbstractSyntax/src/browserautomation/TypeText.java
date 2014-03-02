/**
 */
package browserautomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link browserautomation.TypeText#getText <em>Text</em>}</li>
 *   <li>{@link browserautomation.TypeText#getIdBlock <em>Id Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see browserautomation.BrowserautomationPackage#getTypeText()
 * @model
 * @generated
 */
public interface TypeText extends UIOperation {

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see browserautomation.BrowserautomationPackage#getTypeText_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link browserautomation.TypeText#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Id Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Block</em>' attribute.
	 * @see #setIdBlock(String)
	 * @see browserautomation.BrowserautomationPackage#getTypeText_IdBlock()
	 * @model
	 * @generated
	 */
	String getIdBlock();

	/**
	 * Sets the value of the '{@link browserautomation.TypeText#getIdBlock <em>Id Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Block</em>' attribute.
	 * @see #getIdBlock()
	 * @generated
	 */
	void setIdBlock(String value);
} // TypeText

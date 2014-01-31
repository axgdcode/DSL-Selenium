/**
 */
package browserautomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link browserautomation.ConditionalFlow#getIf <em>If</em>}</li>
 *   <li>{@link browserautomation.ConditionalFlow#getThen <em>Then</em>}</li>
 *   <li>{@link browserautomation.ConditionalFlow#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see browserautomation.BrowserautomationPackage#getConditionalFlow()
 * @model abstract="true"
 * @generated
 */
public interface ConditionalFlow extends ProcessOperation {
	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(If)
	 * @see browserautomation.BrowserautomationPackage#getConditionalFlow_If()
	 * @model containment="true" required="true"
	 * @generated
	 */
	If getIf();

	/**
	 * Sets the value of the '{@link browserautomation.ConditionalFlow#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(If value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(Then)
	 * @see browserautomation.BrowserautomationPackage#getConditionalFlow_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Then getThen();

	/**
	 * Sets the value of the '{@link browserautomation.ConditionalFlow#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Then value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Else)
	 * @see browserautomation.BrowserautomationPackage#getConditionalFlow_Else()
	 * @model containment="true"
	 * @generated
	 */
	Else getElse();

	/**
	 * Sets the value of the '{@link browserautomation.ConditionalFlow#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Else value);

} // ConditionalFlow

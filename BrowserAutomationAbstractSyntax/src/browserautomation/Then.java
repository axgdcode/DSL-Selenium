/**
 */
package browserautomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Then</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link browserautomation.Then#getOperationSequence <em>Operation Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see browserautomation.BrowserautomationPackage#getThen()
 * @model
 * @generated
 */
public interface Then extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Sequence</em>' containment reference.
	 * @see #setOperationSequence(OperationSequence)
	 * @see browserautomation.BrowserautomationPackage#getThen_OperationSequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperationSequence getOperationSequence();

	/**
	 * Sets the value of the '{@link browserautomation.Then#getOperationSequence <em>Operation Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Sequence</em>' containment reference.
	 * @see #getOperationSequence()
	 * @generated
	 */
	void setOperationSequence(OperationSequence value);

} // Then

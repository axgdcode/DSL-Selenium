/**
 */
package browserautomation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link browserautomation.OperationSequence#getOperation <em>Operation</em>}</li>
 *   <li>{@link browserautomation.OperationSequence#getOperationSequence <em>Operation Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see browserautomation.BrowserautomationPackage#getOperationSequence()
 * @model
 * @generated
 */
public interface OperationSequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link browserautomation.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see browserautomation.BrowserautomationPackage#getOperationSequence_Operation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Operation Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link browserautomation.OperationSequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Sequence</em>' containment reference list.
	 * @see browserautomation.BrowserautomationPackage#getOperationSequence_OperationSequence()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationSequence> getOperationSequence();

} // OperationSequence

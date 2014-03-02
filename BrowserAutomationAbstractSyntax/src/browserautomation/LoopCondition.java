/**
 */
package browserautomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link browserautomation.LoopCondition#getConditionLoop <em>Condition Loop</em>}</li>
 *   <li>{@link browserautomation.LoopCondition#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see browserautomation.BrowserautomationPackage#getLoopCondition()
 * @model
 * @generated
 */
public interface LoopCondition extends Loop {
	/**
	 * Returns the value of the '<em><b>Condition Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Loop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Loop</em>' containment reference.
	 * @see #setConditionLoop(Condition)
	 * @see browserautomation.BrowserautomationPackage#getLoopCondition_ConditionLoop()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getConditionLoop();

	/**
	 * Sets the value of the '{@link browserautomation.LoopCondition#getConditionLoop <em>Condition Loop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Loop</em>' containment reference.
	 * @see #getConditionLoop()
	 * @generated
	 */
	void setConditionLoop(Condition value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' reference.
	 * @see #setOperations(OperationSequence)
	 * @see browserautomation.BrowserautomationPackage#getLoopCondition_Operations()
	 * @model required="true"
	 * @generated
	 */
	OperationSequence getOperations();

	/**
	 * Sets the value of the '{@link browserautomation.LoopCondition#getOperations <em>Operations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' reference.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(OperationSequence value);

} // LoopCondition

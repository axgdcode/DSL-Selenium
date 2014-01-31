/**
 */
package browserautomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link browserautomation.LoopCollection#getCollectionLoop <em>Collection Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @see browserautomation.BrowserautomationPackage#getLoopCollection()
 * @model
 * @generated
 */
public interface LoopCollection extends Loop {
	/**
	 * Returns the value of the '<em><b>Collection Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Loop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Loop</em>' containment reference.
	 * @see #setCollectionLoop(Collection)
	 * @see browserautomation.BrowserautomationPackage#getLoopCollection_CollectionLoop()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Collection getCollectionLoop();

	/**
	 * Sets the value of the '{@link browserautomation.LoopCollection#getCollectionLoop <em>Collection Loop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Loop</em>' containment reference.
	 * @see #getCollectionLoop()
	 * @generated
	 */
	void setCollectionLoop(Collection value);

} // LoopCollection

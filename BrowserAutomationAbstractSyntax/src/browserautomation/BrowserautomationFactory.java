/**
 */
package browserautomation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see browserautomation.BrowserautomationPackage
 * @generated
 */
public interface BrowserautomationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BrowserautomationFactory eINSTANCE = browserautomation.impl.BrowserautomationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Click Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Click Id</em>'.
	 * @generated
	 */
	ClickId createClickId();

	/**
	 * Returns a new object of class '<em>Click Lien Click Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Click Lien Click Link</em>'.
	 * @generated
	 */
	ClickLienClickLink createClickLienClickLink();

	/**
	 * Returns a new object of class '<em>Click Id Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Click Id Value</em>'.
	 * @generated
	 */
	ClickIdValue createClickIdValue();

	/**
	 * Returns a new object of class '<em>Type Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Text</em>'.
	 * @generated
	 */
	TypeText createTypeText();

	/**
	 * Returns a new object of class '<em>Go To Url</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go To Url</em>'.
	 * @generated
	 */
	GoToUrl createGoToUrl();

	/**
	 * Returns a new object of class '<em>Open Browser Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Browser Window</em>'.
	 * @generated
	 */
	OpenBrowserWindow createOpenBrowserWindow();

	/**
	 * Returns a new object of class '<em>Links Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Links Collection</em>'.
	 * @generated
	 */
	LinksCollection createLinksCollection();

	/**
	 * Returns a new object of class '<em>Text Inputs Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Inputs Collection</em>'.
	 * @generated
	 */
	TextInputsCollection createTextInputsCollection();

	/**
	 * Returns a new object of class '<em>Pictures Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pictures Collection</em>'.
	 * @generated
	 */
	PicturesCollection createPicturesCollection();

	/**
	 * Returns a new object of class '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If</em>'.
	 * @generated
	 */
	If createIf();

	/**
	 * Returns a new object of class '<em>Then</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Then</em>'.
	 * @generated
	 */
	Then createThen();

	/**
	 * Returns a new object of class '<em>Else</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Else</em>'.
	 * @generated
	 */
	Else createElse();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Loop Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Condition</em>'.
	 * @generated
	 */
	LoopCondition createLoopCondition();

	/**
	 * Returns a new object of class '<em>Loop Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Collection</em>'.
	 * @generated
	 */
	LoopCollection createLoopCollection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BrowserautomationPackage getBrowserautomationPackage();

} //BrowserautomationFactory

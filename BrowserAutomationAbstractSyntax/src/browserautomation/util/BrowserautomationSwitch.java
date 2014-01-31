/**
 */
package browserautomation.util;

import browserautomation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see browserautomation.BrowserautomationPackage
 * @generated
 */
public class BrowserautomationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BrowserautomationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowserautomationSwitch() {
		if (modelPackage == null) {
			modelPackage = BrowserautomationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BrowserautomationPackage.UI_OPERATION: {
				UIOperation uiOperation = (UIOperation)theEObject;
				T result = caseUIOperation(uiOperation);
				if (result == null) result = caseOperation(uiOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.CLICK: {
				Click click = (Click)theEObject;
				T result = caseClick(click);
				if (result == null) result = caseUIOperation(click);
				if (result == null) result = caseOperation(click);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.CLICK_ID: {
				ClickId clickId = (ClickId)theEObject;
				T result = caseClickId(clickId);
				if (result == null) result = caseClick(clickId);
				if (result == null) result = caseUIOperation(clickId);
				if (result == null) result = caseOperation(clickId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.CLICK_LIEN_CLICK_LINK: {
				ClickLienClickLink clickLienClickLink = (ClickLienClickLink)theEObject;
				T result = caseClickLienClickLink(clickLienClickLink);
				if (result == null) result = caseClick(clickLienClickLink);
				if (result == null) result = caseUIOperation(clickLienClickLink);
				if (result == null) result = caseOperation(clickLienClickLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.CLICK_ID_VALUE: {
				ClickIdValue clickIdValue = (ClickIdValue)theEObject;
				T result = caseClickIdValue(clickIdValue);
				if (result == null) result = caseClickId(clickIdValue);
				if (result == null) result = caseClick(clickIdValue);
				if (result == null) result = caseUIOperation(clickIdValue);
				if (result == null) result = caseOperation(clickIdValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.TYPE_TEXT: {
				TypeText typeText = (TypeText)theEObject;
				T result = caseTypeText(typeText);
				if (result == null) result = caseUIOperation(typeText);
				if (result == null) result = caseOperation(typeText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.PROCESS_OPERATION: {
				ProcessOperation processOperation = (ProcessOperation)theEObject;
				T result = caseProcessOperation(processOperation);
				if (result == null) result = caseOperation(processOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.GO_TO_URL: {
				GoToUrl goToUrl = (GoToUrl)theEObject;
				T result = caseGoToUrl(goToUrl);
				if (result == null) result = caseUIOperation(goToUrl);
				if (result == null) result = caseOperation(goToUrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.OPEN_BROWSER_WINDOW: {
				OpenBrowserWindow openBrowserWindow = (OpenBrowserWindow)theEObject;
				T result = caseOpenBrowserWindow(openBrowserWindow);
				if (result == null) result = caseUIOperation(openBrowserWindow);
				if (result == null) result = caseOperation(openBrowserWindow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.COLLECTION: {
				Collection collection = (Collection)theEObject;
				T result = caseCollection(collection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.LINKS_COLLECTION: {
				LinksCollection linksCollection = (LinksCollection)theEObject;
				T result = caseLinksCollection(linksCollection);
				if (result == null) result = caseCollection(linksCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.TEXT_INPUTS_COLLECTION: {
				TextInputsCollection textInputsCollection = (TextInputsCollection)theEObject;
				T result = caseTextInputsCollection(textInputsCollection);
				if (result == null) result = caseCollection(textInputsCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.PICTURES_COLLECTION: {
				PicturesCollection picturesCollection = (PicturesCollection)theEObject;
				T result = casePicturesCollection(picturesCollection);
				if (result == null) result = caseCollection(picturesCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.CONDITIONAL_FLOW: {
				ConditionalFlow conditionalFlow = (ConditionalFlow)theEObject;
				T result = caseConditionalFlow(conditionalFlow);
				if (result == null) result = caseProcessOperation(conditionalFlow);
				if (result == null) result = caseOperation(conditionalFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.THEN: {
				Then then = (Then)theEObject;
				T result = caseThen(then);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.ELSE: {
				Else else_ = (Else)theEObject;
				T result = caseElse(else_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.LOOP: {
				Loop loop = (Loop)theEObject;
				T result = caseLoop(loop);
				if (result == null) result = caseProcessOperation(loop);
				if (result == null) result = caseOperation(loop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.LOOP_CONDITION: {
				LoopCondition loopCondition = (LoopCondition)theEObject;
				T result = caseLoopCondition(loopCondition);
				if (result == null) result = caseLoop(loopCondition);
				if (result == null) result = caseProcessOperation(loopCondition);
				if (result == null) result = caseOperation(loopCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.LOOP_COLLECTION: {
				LoopCollection loopCollection = (LoopCollection)theEObject;
				T result = caseLoopCollection(loopCollection);
				if (result == null) result = caseLoop(loopCollection);
				if (result == null) result = caseProcessOperation(loopCollection);
				if (result == null) result = caseOperation(loopCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BrowserautomationPackage.OPERATION_SEQUENCE: {
				OperationSequence operationSequence = (OperationSequence)theEObject;
				T result = caseOperationSequence(operationSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIOperation(UIOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Click</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Click</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClick(Click object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Click Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Click Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClickId(ClickId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Click Lien Click Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Click Lien Click Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClickLienClickLink(ClickLienClickLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Click Id Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Click Id Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClickIdValue(ClickIdValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeText(TypeText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessOperation(ProcessOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go To Url</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go To Url</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoToUrl(GoToUrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Browser Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Browser Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenBrowserWindow(OpenBrowserWindow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollection(Collection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Links Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Links Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinksCollection(LinksCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Inputs Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Inputs Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextInputsCollection(TextInputsCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pictures Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pictures Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePicturesCollection(PicturesCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalFlow(ConditionalFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Then</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Then</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThen(Then object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElse(Else object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopCondition(LoopCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopCollection(LoopCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationSequence(OperationSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BrowserautomationSwitch

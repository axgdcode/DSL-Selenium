/**
 */
package browserautomation.util;

import browserautomation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see browserautomation.BrowserautomationPackage
 * @generated
 */
public class BrowserautomationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BrowserautomationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowserautomationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BrowserautomationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowserautomationSwitch<Adapter> modelSwitch =
		new BrowserautomationSwitch<Adapter>() {
			@Override
			public Adapter caseUIOperation(UIOperation object) {
				return createUIOperationAdapter();
			}
			@Override
			public Adapter caseClick(Click object) {
				return createClickAdapter();
			}
			@Override
			public Adapter caseClickId(ClickId object) {
				return createClickIdAdapter();
			}
			@Override
			public Adapter caseClickLienClickLink(ClickLienClickLink object) {
				return createClickLienClickLinkAdapter();
			}
			@Override
			public Adapter caseClickIdValue(ClickIdValue object) {
				return createClickIdValueAdapter();
			}
			@Override
			public Adapter caseTypeText(TypeText object) {
				return createTypeTextAdapter();
			}
			@Override
			public Adapter caseProcessOperation(ProcessOperation object) {
				return createProcessOperationAdapter();
			}
			@Override
			public Adapter caseGoToUrl(GoToUrl object) {
				return createGoToUrlAdapter();
			}
			@Override
			public Adapter caseOpenBrowserWindow(OpenBrowserWindow object) {
				return createOpenBrowserWindowAdapter();
			}
			@Override
			public Adapter caseCollection(Collection object) {
				return createCollectionAdapter();
			}
			@Override
			public Adapter caseLinksCollection(LinksCollection object) {
				return createLinksCollectionAdapter();
			}
			@Override
			public Adapter caseTextInputsCollection(TextInputsCollection object) {
				return createTextInputsCollectionAdapter();
			}
			@Override
			public Adapter casePicturesCollection(PicturesCollection object) {
				return createPicturesCollectionAdapter();
			}
			@Override
			public Adapter caseConditionalFlow(ConditionalFlow object) {
				return createConditionalFlowAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseThen(Then object) {
				return createThenAdapter();
			}
			@Override
			public Adapter caseElse(Else object) {
				return createElseAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseLoop(Loop object) {
				return createLoopAdapter();
			}
			@Override
			public Adapter caseLoopCondition(LoopCondition object) {
				return createLoopConditionAdapter();
			}
			@Override
			public Adapter caseLoopCollection(LoopCollection object) {
				return createLoopCollectionAdapter();
			}
			@Override
			public Adapter caseOperationSequence(OperationSequence object) {
				return createOperationSequenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.UIOperation <em>UI Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.UIOperation
	 * @generated
	 */
	public Adapter createUIOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.Click <em>Click</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.Click
	 * @generated
	 */
	public Adapter createClickAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.ClickId <em>Click Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.ClickId
	 * @generated
	 */
	public Adapter createClickIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.ClickLienClickLink <em>Click Lien Click Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.ClickLienClickLink
	 * @generated
	 */
	public Adapter createClickLienClickLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.ClickIdValue <em>Click Id Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.ClickIdValue
	 * @generated
	 */
	public Adapter createClickIdValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.TypeText <em>Type Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.TypeText
	 * @generated
	 */
	public Adapter createTypeTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.ProcessOperation <em>Process Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.ProcessOperation
	 * @generated
	 */
	public Adapter createProcessOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.GoToUrl <em>Go To Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.GoToUrl
	 * @generated
	 */
	public Adapter createGoToUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.OpenBrowserWindow <em>Open Browser Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.OpenBrowserWindow
	 * @generated
	 */
	public Adapter createOpenBrowserWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.Collection
	 * @generated
	 */
	public Adapter createCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.LinksCollection <em>Links Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.LinksCollection
	 * @generated
	 */
	public Adapter createLinksCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.TextInputsCollection <em>Text Inputs Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.TextInputsCollection
	 * @generated
	 */
	public Adapter createTextInputsCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.PicturesCollection <em>Pictures Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.PicturesCollection
	 * @generated
	 */
	public Adapter createPicturesCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.ConditionalFlow <em>Conditional Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.ConditionalFlow
	 * @generated
	 */
	public Adapter createConditionalFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.Then <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.Then
	 * @generated
	 */
	public Adapter createThenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.Else
	 * @generated
	 */
	public Adapter createElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.LoopCondition <em>Loop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.LoopCondition
	 * @generated
	 */
	public Adapter createLoopConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.LoopCollection <em>Loop Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.LoopCollection
	 * @generated
	 */
	public Adapter createLoopCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link browserautomation.OperationSequence <em>Operation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see browserautomation.OperationSequence
	 * @generated
	 */
	public Adapter createOperationSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BrowserautomationAdapterFactory

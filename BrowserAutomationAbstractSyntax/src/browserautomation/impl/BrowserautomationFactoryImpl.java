/**
 */
package browserautomation.impl;

import browserautomation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BrowserautomationFactoryImpl extends EFactoryImpl implements BrowserautomationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BrowserautomationFactory init() {
		try {
			BrowserautomationFactory theBrowserautomationFactory = (BrowserautomationFactory)EPackage.Registry.INSTANCE.getEFactory(BrowserautomationPackage.eNS_URI);
			if (theBrowserautomationFactory != null) {
				return theBrowserautomationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BrowserautomationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowserautomationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BrowserautomationPackage.CLICK_ID: return createClickId();
			case BrowserautomationPackage.CLICK_LIEN_CLICK_LINK: return createClickLienClickLink();
			case BrowserautomationPackage.CLICK_ID_VALUE: return createClickIdValue();
			case BrowserautomationPackage.TYPE_TEXT: return createTypeText();
			case BrowserautomationPackage.GO_TO_URL: return createGoToUrl();
			case BrowserautomationPackage.OPEN_BROWSER_WINDOW: return createOpenBrowserWindow();
			case BrowserautomationPackage.LINKS_COLLECTION: return createLinksCollection();
			case BrowserautomationPackage.TEXT_INPUTS_COLLECTION: return createTextInputsCollection();
			case BrowserautomationPackage.PICTURES_COLLECTION: return createPicturesCollection();
			case BrowserautomationPackage.IF: return createIf();
			case BrowserautomationPackage.THEN: return createThen();
			case BrowserautomationPackage.ELSE: return createElse();
			case BrowserautomationPackage.CONDITION: return createCondition();
			case BrowserautomationPackage.OPERATION: return createOperation();
			case BrowserautomationPackage.LOOP_CONDITION: return createLoopCondition();
			case BrowserautomationPackage.LOOP_COLLECTION: return createLoopCollection();
			case BrowserautomationPackage.OPERATION_SEQUENCE: return createOperationSequence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClickId createClickId() {
		ClickIdImpl clickId = new ClickIdImpl();
		return clickId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClickLienClickLink createClickLienClickLink() {
		ClickLienClickLinkImpl clickLienClickLink = new ClickLienClickLinkImpl();
		return clickLienClickLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClickIdValue createClickIdValue() {
		ClickIdValueImpl clickIdValue = new ClickIdValueImpl();
		return clickIdValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeText createTypeText() {
		TypeTextImpl typeText = new TypeTextImpl();
		return typeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoToUrl createGoToUrl() {
		GoToUrlImpl goToUrl = new GoToUrlImpl();
		return goToUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenBrowserWindow createOpenBrowserWindow() {
		OpenBrowserWindowImpl openBrowserWindow = new OpenBrowserWindowImpl();
		return openBrowserWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinksCollection createLinksCollection() {
		LinksCollectionImpl linksCollection = new LinksCollectionImpl();
		return linksCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputsCollection createTextInputsCollection() {
		TextInputsCollectionImpl textInputsCollection = new TextInputsCollectionImpl();
		return textInputsCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicturesCollection createPicturesCollection() {
		PicturesCollectionImpl picturesCollection = new PicturesCollectionImpl();
		return picturesCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Then createThen() {
		ThenImpl then = new ThenImpl();
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Else createElse() {
		ElseImpl else_ = new ElseImpl();
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopCondition createLoopCondition() {
		LoopConditionImpl loopCondition = new LoopConditionImpl();
		return loopCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopCollection createLoopCollection() {
		LoopCollectionImpl loopCollection = new LoopCollectionImpl();
		return loopCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSequence createOperationSequence() {
		OperationSequenceImpl operationSequence = new OperationSequenceImpl();
		return operationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowserautomationPackage getBrowserautomationPackage() {
		return (BrowserautomationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BrowserautomationPackage getPackage() {
		return BrowserautomationPackage.eINSTANCE;
	}

} //BrowserautomationFactoryImpl

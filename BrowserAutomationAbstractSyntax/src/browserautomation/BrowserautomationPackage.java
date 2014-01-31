/**
 */
package browserautomation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see browserautomation.BrowserautomationFactory
 * @model kind="package"
 * @generated
 */
public interface BrowserautomationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "browserautomation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://browserautomation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "browserautomation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BrowserautomationPackage eINSTANCE = browserautomation.impl.BrowserautomationPackageImpl.init();

	/**
	 * The meta object id for the '{@link browserautomation.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.OperationImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 18;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.UIOperationImpl <em>UI Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.UIOperationImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getUIOperation()
	 * @generated
	 */
	int UI_OPERATION = 0;

	/**
	 * The number of structural features of the '<em>UI Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UI Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.ClickImpl <em>Click</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.ClickImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getClick()
	 * @generated
	 */
	int CLICK = 1;

	/**
	 * The number of structural features of the '<em>Click</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Click</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.ClickIdImpl <em>Click Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.ClickIdImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getClickId()
	 * @generated
	 */
	int CLICK_ID = 2;

	/**
	 * The number of structural features of the '<em>Click Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_ID_FEATURE_COUNT = CLICK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Click Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_ID_OPERATION_COUNT = CLICK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.ClickLienClickLinkImpl <em>Click Lien Click Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.ClickLienClickLinkImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getClickLienClickLink()
	 * @generated
	 */
	int CLICK_LIEN_CLICK_LINK = 3;

	/**
	 * The number of structural features of the '<em>Click Lien Click Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_LIEN_CLICK_LINK_FEATURE_COUNT = CLICK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Click Lien Click Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_LIEN_CLICK_LINK_OPERATION_COUNT = CLICK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.ClickIdValueImpl <em>Click Id Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.ClickIdValueImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getClickIdValue()
	 * @generated
	 */
	int CLICK_ID_VALUE = 4;

	/**
	 * The number of structural features of the '<em>Click Id Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_ID_VALUE_FEATURE_COUNT = CLICK_ID_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Click Id Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICK_ID_VALUE_OPERATION_COUNT = CLICK_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.TypeTextImpl <em>Type Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.TypeTextImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getTypeText()
	 * @generated
	 */
	int TYPE_TEXT = 5;

	/**
	 * The number of structural features of the '<em>Type Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TEXT_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TEXT_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.ProcessOperationImpl <em>Process Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.ProcessOperationImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getProcessOperation()
	 * @generated
	 */
	int PROCESS_OPERATION = 6;

	/**
	 * The number of structural features of the '<em>Process Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.GoToUrlImpl <em>Go To Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.GoToUrlImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getGoToUrl()
	 * @generated
	 */
	int GO_TO_URL = 7;

	/**
	 * The number of structural features of the '<em>Go To Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_URL_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Go To Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_URL_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.OpenBrowserWindowImpl <em>Open Browser Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.OpenBrowserWindowImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getOpenBrowserWindow()
	 * @generated
	 */
	int OPEN_BROWSER_WINDOW = 8;

	/**
	 * The number of structural features of the '<em>Open Browser Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_BROWSER_WINDOW_FEATURE_COUNT = UI_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Open Browser Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_BROWSER_WINDOW_OPERATION_COUNT = UI_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.CollectionImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 9;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.LinksCollectionImpl <em>Links Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.LinksCollectionImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getLinksCollection()
	 * @generated
	 */
	int LINKS_COLLECTION = 10;

	/**
	 * The number of structural features of the '<em>Links Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_COLLECTION_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Links Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_COLLECTION_OPERATION_COUNT = COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.TextInputsCollectionImpl <em>Text Inputs Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.TextInputsCollectionImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getTextInputsCollection()
	 * @generated
	 */
	int TEXT_INPUTS_COLLECTION = 11;

	/**
	 * The number of structural features of the '<em>Text Inputs Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUTS_COLLECTION_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Inputs Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUTS_COLLECTION_OPERATION_COUNT = COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.PicturesCollectionImpl <em>Pictures Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.PicturesCollectionImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getPicturesCollection()
	 * @generated
	 */
	int PICTURES_COLLECTION = 12;

	/**
	 * The number of structural features of the '<em>Pictures Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURES_COLLECTION_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pictures Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURES_COLLECTION_OPERATION_COUNT = COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.ConditionalFlowImpl <em>Conditional Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.ConditionalFlowImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getConditionalFlow()
	 * @generated
	 */
	int CONDITIONAL_FLOW = 13;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FLOW__IF = PROCESS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FLOW__THEN = PROCESS_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FLOW__ELSE = PROCESS_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FLOW_FEATURE_COUNT = PROCESS_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FLOW_OPERATION_COUNT = PROCESS_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.IfImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getIf()
	 * @generated
	 */
	int IF = 14;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.ThenImpl <em>Then</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.ThenImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getThen()
	 * @generated
	 */
	int THEN = 15;

	/**
	 * The feature id for the '<em><b>Operation Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN__OPERATION_SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Then</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Then</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.ElseImpl <em>Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.ElseImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getElse()
	 * @generated
	 */
	int ELSE = 16;

	/**
	 * The feature id for the '<em><b>Operation Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__OPERATION_SEQUENCE = 0;

	/**
	 * The number of structural features of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.ConditionImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 17;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.LoopImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 19;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = PROCESS_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = PROCESS_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.LoopConditionImpl <em>Loop Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.LoopConditionImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getLoopCondition()
	 * @generated
	 */
	int LOOP_CONDITION = 20;

	/**
	 * The feature id for the '<em><b>Condition Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CONDITION__CONDITION_LOOP = LOOP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CONDITION_FEATURE_COUNT = LOOP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CONDITION_OPERATION_COUNT = LOOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.LoopCollectionImpl <em>Loop Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.LoopCollectionImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getLoopCollection()
	 * @generated
	 */
	int LOOP_COLLECTION = 21;

	/**
	 * The feature id for the '<em><b>Collection Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_COLLECTION__COLLECTION_LOOP = LOOP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_COLLECTION_FEATURE_COUNT = LOOP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_COLLECTION_OPERATION_COUNT = LOOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link browserautomation.impl.OperationSequenceImpl <em>Operation Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see browserautomation.impl.OperationSequenceImpl
	 * @see browserautomation.impl.BrowserautomationPackageImpl#getOperationSequence()
	 * @generated
	 */
	int OPERATION_SEQUENCE = 22;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SEQUENCE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Operation Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SEQUENCE__OPERATION_SEQUENCE = 1;

	/**
	 * The number of structural features of the '<em>Operation Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SEQUENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operation Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SEQUENCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link browserautomation.UIOperation <em>UI Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Operation</em>'.
	 * @see browserautomation.UIOperation
	 * @generated
	 */
	EClass getUIOperation();

	/**
	 * Returns the meta object for class '{@link browserautomation.Click <em>Click</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Click</em>'.
	 * @see browserautomation.Click
	 * @generated
	 */
	EClass getClick();

	/**
	 * Returns the meta object for class '{@link browserautomation.ClickId <em>Click Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Click Id</em>'.
	 * @see browserautomation.ClickId
	 * @generated
	 */
	EClass getClickId();

	/**
	 * Returns the meta object for class '{@link browserautomation.ClickLienClickLink <em>Click Lien Click Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Click Lien Click Link</em>'.
	 * @see browserautomation.ClickLienClickLink
	 * @generated
	 */
	EClass getClickLienClickLink();

	/**
	 * Returns the meta object for class '{@link browserautomation.ClickIdValue <em>Click Id Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Click Id Value</em>'.
	 * @see browserautomation.ClickIdValue
	 * @generated
	 */
	EClass getClickIdValue();

	/**
	 * Returns the meta object for class '{@link browserautomation.TypeText <em>Type Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Text</em>'.
	 * @see browserautomation.TypeText
	 * @generated
	 */
	EClass getTypeText();

	/**
	 * Returns the meta object for class '{@link browserautomation.ProcessOperation <em>Process Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Operation</em>'.
	 * @see browserautomation.ProcessOperation
	 * @generated
	 */
	EClass getProcessOperation();

	/**
	 * Returns the meta object for class '{@link browserautomation.GoToUrl <em>Go To Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To Url</em>'.
	 * @see browserautomation.GoToUrl
	 * @generated
	 */
	EClass getGoToUrl();

	/**
	 * Returns the meta object for class '{@link browserautomation.OpenBrowserWindow <em>Open Browser Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Browser Window</em>'.
	 * @see browserautomation.OpenBrowserWindow
	 * @generated
	 */
	EClass getOpenBrowserWindow();

	/**
	 * Returns the meta object for class '{@link browserautomation.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see browserautomation.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for class '{@link browserautomation.LinksCollection <em>Links Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Links Collection</em>'.
	 * @see browserautomation.LinksCollection
	 * @generated
	 */
	EClass getLinksCollection();

	/**
	 * Returns the meta object for class '{@link browserautomation.TextInputsCollection <em>Text Inputs Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Inputs Collection</em>'.
	 * @see browserautomation.TextInputsCollection
	 * @generated
	 */
	EClass getTextInputsCollection();

	/**
	 * Returns the meta object for class '{@link browserautomation.PicturesCollection <em>Pictures Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pictures Collection</em>'.
	 * @see browserautomation.PicturesCollection
	 * @generated
	 */
	EClass getPicturesCollection();

	/**
	 * Returns the meta object for class '{@link browserautomation.ConditionalFlow <em>Conditional Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Flow</em>'.
	 * @see browserautomation.ConditionalFlow
	 * @generated
	 */
	EClass getConditionalFlow();

	/**
	 * Returns the meta object for the containment reference '{@link browserautomation.ConditionalFlow#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see browserautomation.ConditionalFlow#getIf()
	 * @see #getConditionalFlow()
	 * @generated
	 */
	EReference getConditionalFlow_If();

	/**
	 * Returns the meta object for the containment reference '{@link browserautomation.ConditionalFlow#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see browserautomation.ConditionalFlow#getThen()
	 * @see #getConditionalFlow()
	 * @generated
	 */
	EReference getConditionalFlow_Then();

	/**
	 * Returns the meta object for the containment reference '{@link browserautomation.ConditionalFlow#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see browserautomation.ConditionalFlow#getElse()
	 * @see #getConditionalFlow()
	 * @generated
	 */
	EReference getConditionalFlow_Else();

	/**
	 * Returns the meta object for class '{@link browserautomation.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see browserautomation.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link browserautomation.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see browserautomation.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for class '{@link browserautomation.Then <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Then</em>'.
	 * @see browserautomation.Then
	 * @generated
	 */
	EClass getThen();

	/**
	 * Returns the meta object for the containment reference '{@link browserautomation.Then#getOperationSequence <em>Operation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Sequence</em>'.
	 * @see browserautomation.Then#getOperationSequence()
	 * @see #getThen()
	 * @generated
	 */
	EReference getThen_OperationSequence();

	/**
	 * Returns the meta object for class '{@link browserautomation.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else</em>'.
	 * @see browserautomation.Else
	 * @generated
	 */
	EClass getElse();

	/**
	 * Returns the meta object for the containment reference '{@link browserautomation.Else#getOperationSequence <em>Operation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation Sequence</em>'.
	 * @see browserautomation.Else#getOperationSequence()
	 * @see #getElse()
	 * @generated
	 */
	EReference getElse_OperationSequence();

	/**
	 * Returns the meta object for class '{@link browserautomation.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see browserautomation.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference '{@link browserautomation.Condition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see browserautomation.Condition#getCondition()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Condition();

	/**
	 * Returns the meta object for class '{@link browserautomation.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see browserautomation.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link browserautomation.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see browserautomation.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for class '{@link browserautomation.LoopCondition <em>Loop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Condition</em>'.
	 * @see browserautomation.LoopCondition
	 * @generated
	 */
	EClass getLoopCondition();

	/**
	 * Returns the meta object for the containment reference '{@link browserautomation.LoopCondition#getConditionLoop <em>Condition Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Loop</em>'.
	 * @see browserautomation.LoopCondition#getConditionLoop()
	 * @see #getLoopCondition()
	 * @generated
	 */
	EReference getLoopCondition_ConditionLoop();

	/**
	 * Returns the meta object for class '{@link browserautomation.LoopCollection <em>Loop Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Collection</em>'.
	 * @see browserautomation.LoopCollection
	 * @generated
	 */
	EClass getLoopCollection();

	/**
	 * Returns the meta object for the containment reference '{@link browserautomation.LoopCollection#getCollectionLoop <em>Collection Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Loop</em>'.
	 * @see browserautomation.LoopCollection#getCollectionLoop()
	 * @see #getLoopCollection()
	 * @generated
	 */
	EReference getLoopCollection_CollectionLoop();

	/**
	 * Returns the meta object for class '{@link browserautomation.OperationSequence <em>Operation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Sequence</em>'.
	 * @see browserautomation.OperationSequence
	 * @generated
	 */
	EClass getOperationSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link browserautomation.OperationSequence#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see browserautomation.OperationSequence#getOperation()
	 * @see #getOperationSequence()
	 * @generated
	 */
	EReference getOperationSequence_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link browserautomation.OperationSequence#getOperationSequence <em>Operation Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Sequence</em>'.
	 * @see browserautomation.OperationSequence#getOperationSequence()
	 * @see #getOperationSequence()
	 * @generated
	 */
	EReference getOperationSequence_OperationSequence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BrowserautomationFactory getBrowserautomationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link browserautomation.impl.UIOperationImpl <em>UI Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.UIOperationImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getUIOperation()
		 * @generated
		 */
		EClass UI_OPERATION = eINSTANCE.getUIOperation();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.ClickImpl <em>Click</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.ClickImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getClick()
		 * @generated
		 */
		EClass CLICK = eINSTANCE.getClick();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.ClickIdImpl <em>Click Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.ClickIdImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getClickId()
		 * @generated
		 */
		EClass CLICK_ID = eINSTANCE.getClickId();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.ClickLienClickLinkImpl <em>Click Lien Click Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.ClickLienClickLinkImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getClickLienClickLink()
		 * @generated
		 */
		EClass CLICK_LIEN_CLICK_LINK = eINSTANCE.getClickLienClickLink();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.ClickIdValueImpl <em>Click Id Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.ClickIdValueImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getClickIdValue()
		 * @generated
		 */
		EClass CLICK_ID_VALUE = eINSTANCE.getClickIdValue();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.TypeTextImpl <em>Type Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.TypeTextImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getTypeText()
		 * @generated
		 */
		EClass TYPE_TEXT = eINSTANCE.getTypeText();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.ProcessOperationImpl <em>Process Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.ProcessOperationImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getProcessOperation()
		 * @generated
		 */
		EClass PROCESS_OPERATION = eINSTANCE.getProcessOperation();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.GoToUrlImpl <em>Go To Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.GoToUrlImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getGoToUrl()
		 * @generated
		 */
		EClass GO_TO_URL = eINSTANCE.getGoToUrl();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.OpenBrowserWindowImpl <em>Open Browser Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.OpenBrowserWindowImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getOpenBrowserWindow()
		 * @generated
		 */
		EClass OPEN_BROWSER_WINDOW = eINSTANCE.getOpenBrowserWindow();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.CollectionImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.LinksCollectionImpl <em>Links Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.LinksCollectionImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getLinksCollection()
		 * @generated
		 */
		EClass LINKS_COLLECTION = eINSTANCE.getLinksCollection();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.TextInputsCollectionImpl <em>Text Inputs Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.TextInputsCollectionImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getTextInputsCollection()
		 * @generated
		 */
		EClass TEXT_INPUTS_COLLECTION = eINSTANCE.getTextInputsCollection();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.PicturesCollectionImpl <em>Pictures Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.PicturesCollectionImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getPicturesCollection()
		 * @generated
		 */
		EClass PICTURES_COLLECTION = eINSTANCE.getPicturesCollection();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.ConditionalFlowImpl <em>Conditional Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.ConditionalFlowImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getConditionalFlow()
		 * @generated
		 */
		EClass CONDITIONAL_FLOW = eINSTANCE.getConditionalFlow();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_FLOW__IF = eINSTANCE.getConditionalFlow_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_FLOW__THEN = eINSTANCE.getConditionalFlow_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_FLOW__ELSE = eINSTANCE.getConditionalFlow_Else();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.IfImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.ThenImpl <em>Then</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.ThenImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getThen()
		 * @generated
		 */
		EClass THEN = eINSTANCE.getThen();

		/**
		 * The meta object literal for the '<em><b>Operation Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEN__OPERATION_SEQUENCE = eINSTANCE.getThen_OperationSequence();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.ElseImpl <em>Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.ElseImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getElse()
		 * @generated
		 */
		EClass ELSE = eINSTANCE.getElse();

		/**
		 * The meta object literal for the '<em><b>Operation Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE__OPERATION_SEQUENCE = eINSTANCE.getElse_OperationSequence();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.ConditionImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CONDITION = eINSTANCE.getCondition_Condition();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.OperationImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.LoopImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.LoopConditionImpl <em>Loop Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.LoopConditionImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getLoopCondition()
		 * @generated
		 */
		EClass LOOP_CONDITION = eINSTANCE.getLoopCondition();

		/**
		 * The meta object literal for the '<em><b>Condition Loop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_CONDITION__CONDITION_LOOP = eINSTANCE.getLoopCondition_ConditionLoop();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.LoopCollectionImpl <em>Loop Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.LoopCollectionImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getLoopCollection()
		 * @generated
		 */
		EClass LOOP_COLLECTION = eINSTANCE.getLoopCollection();

		/**
		 * The meta object literal for the '<em><b>Collection Loop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_COLLECTION__COLLECTION_LOOP = eINSTANCE.getLoopCollection_CollectionLoop();

		/**
		 * The meta object literal for the '{@link browserautomation.impl.OperationSequenceImpl <em>Operation Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see browserautomation.impl.OperationSequenceImpl
		 * @see browserautomation.impl.BrowserautomationPackageImpl#getOperationSequence()
		 * @generated
		 */
		EClass OPERATION_SEQUENCE = eINSTANCE.getOperationSequence();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_SEQUENCE__OPERATION = eINSTANCE.getOperationSequence_Operation();

		/**
		 * The meta object literal for the '<em><b>Operation Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_SEQUENCE__OPERATION_SEQUENCE = eINSTANCE.getOperationSequence_OperationSequence();

	}

} //BrowserautomationPackage

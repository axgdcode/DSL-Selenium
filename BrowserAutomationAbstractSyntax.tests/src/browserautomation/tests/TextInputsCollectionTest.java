/**
 */
package browserautomation.tests;

import browserautomation.BrowserautomationFactory;
import browserautomation.TextInputsCollection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Inputs Collection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextInputsCollectionTest extends CollectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextInputsCollectionTest.class);
	}

	/**
	 * Constructs a new Text Inputs Collection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputsCollectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text Inputs Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextInputsCollection getFixture() {
		return (TextInputsCollection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BrowserautomationFactory.eINSTANCE.createTextInputsCollection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TextInputsCollectionTest

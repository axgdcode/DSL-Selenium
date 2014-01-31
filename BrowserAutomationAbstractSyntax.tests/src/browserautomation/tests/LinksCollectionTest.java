/**
 */
package browserautomation.tests;

import browserautomation.BrowserautomationFactory;
import browserautomation.LinksCollection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Links Collection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinksCollectionTest extends CollectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinksCollectionTest.class);
	}

	/**
	 * Constructs a new Links Collection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinksCollectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Links Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinksCollection getFixture() {
		return (LinksCollection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BrowserautomationFactory.eINSTANCE.createLinksCollection());
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

} //LinksCollectionTest

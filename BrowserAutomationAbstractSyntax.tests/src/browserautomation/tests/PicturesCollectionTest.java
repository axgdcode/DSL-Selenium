/**
 */
package browserautomation.tests;

import browserautomation.BrowserautomationFactory;
import browserautomation.PicturesCollection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pictures Collection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PicturesCollectionTest extends CollectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PicturesCollectionTest.class);
	}

	/**
	 * Constructs a new Pictures Collection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicturesCollectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pictures Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PicturesCollection getFixture() {
		return (PicturesCollection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BrowserautomationFactory.eINSTANCE.createPicturesCollection());
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

} //PicturesCollectionTest

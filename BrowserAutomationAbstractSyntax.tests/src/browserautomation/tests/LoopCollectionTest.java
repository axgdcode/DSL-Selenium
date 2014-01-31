/**
 */
package browserautomation.tests;

import browserautomation.BrowserautomationFactory;
import browserautomation.LoopCollection;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Loop Collection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopCollectionTest extends LoopTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoopCollectionTest.class);
	}

	/**
	 * Constructs a new Loop Collection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopCollectionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Loop Collection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LoopCollection getFixture() {
		return (LoopCollection)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BrowserautomationFactory.eINSTANCE.createLoopCollection());
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

} //LoopCollectionTest

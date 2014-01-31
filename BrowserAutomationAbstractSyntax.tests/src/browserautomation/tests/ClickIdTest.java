/**
 */
package browserautomation.tests;

import browserautomation.BrowserautomationFactory;
import browserautomation.ClickId;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Click Id</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClickIdTest extends ClickTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClickIdTest.class);
	}

	/**
	 * Constructs a new Click Id test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClickIdTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Click Id test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClickId getFixture() {
		return (ClickId)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BrowserautomationFactory.eINSTANCE.createClickId());
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

} //ClickIdTest

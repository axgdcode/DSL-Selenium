/**
 */
package browserautomation.tests;

import browserautomation.BrowserautomationFactory;
import browserautomation.ClickLienClickLink;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Click Lien Click Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClickLienClickLinkTest extends ClickTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClickLienClickLinkTest.class);
	}

	/**
	 * Constructs a new Click Lien Click Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClickLienClickLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Click Lien Click Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClickLienClickLink getFixture() {
		return (ClickLienClickLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BrowserautomationFactory.eINSTANCE.createClickLienClickLink());
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

} //ClickLienClickLinkTest

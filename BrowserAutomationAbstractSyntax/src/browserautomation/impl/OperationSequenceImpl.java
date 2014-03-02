/**
 */
package browserautomation.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import browserautomation.BrowserautomationPackage;
import browserautomation.Operation;
import browserautomation.OperationSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link browserautomation.impl.OperationSequenceImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link browserautomation.impl.OperationSequenceImpl#getOperationSequence <em>Operation Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationSequenceImpl extends MinimalEObjectImpl.Container implements OperationSequence {

//	public void execute(){
//
//		BufferedReader br = null;
//		String in = "";
//		try {
//
//			String sCurrentLine;
//
//			br = new BufferedReader(new FileReader("/Users/Axel/Desktop/scenar.txt"));
//
//			while ((sCurrentLine = br.readLine()) != null) {
//				in+=(sCurrentLine);
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (br != null)br.close();
//			} catch (IOException ex) {
//				ex.printStackTrace();
//			}
//		}
//
//
//		String[] actions = in.split(";");
//
//
//		WebDriver driver = null;
//		WebElement element = null;
//		
//		for (int i=0; i<actions.length; i++){
//			
//			System.out.println("i: " +i );
//			System.out.println("action: " +actions[i] );
//			if(actions[i].equals(EnumOperation.OUVRIR_NAVIGATEUR.getName())){
//				 driver = new FirefoxDriver();
//			} else if (actions[i].contains(EnumOperation.GO_TOURL.toString()) && driver!=null){
//				
//				String url = actions[i].split("=")[1];
//				url.replace(";", "");
//				driver.get(url);
//			} else if  (actions[i].contains(EnumOperation.ECRIRE.getName()) && driver!=null){
//				String[] id_bloc = actions[i].split("dans ");
//				id_bloc[1].replace(";", "");
//				element = driver.findElement(By.name(id_bloc[1]));
//				String word = id_bloc[0].split("=")[1];
//				word.replace(";", "");
//				element.sendKeys(word);
//			} else if(actions[i].contains(EnumOperation.LANCER_RECHERCHE.getName()) && element!=null){
//				element.submit();
//			}
//		}
//	}

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * The cached value of the '{@link #getOperationSequence() <em>Operation Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationSequence> operationSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BrowserautomationPackage.Literals.OPERATION_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<Operation>(Operation.class, this, BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationSequence> getOperationSequence() {
		if (operationSequence == null) {
			operationSequence = new EObjectContainmentEList<OperationSequence>(OperationSequence.class, this, BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION_SEQUENCE);
		}
		return operationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION_SEQUENCE:
				return ((InternalEList<?>)getOperationSequence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION:
				return getOperation();
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION_SEQUENCE:
				return getOperationSequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION_SEQUENCE:
				getOperationSequence().clear();
				getOperationSequence().addAll((Collection<? extends OperationSequence>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION:
				getOperation().clear();
				return;
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION_SEQUENCE:
				getOperationSequence().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION:
				return operation != null && !operation.isEmpty();
			case BrowserautomationPackage.OPERATION_SEQUENCE__OPERATION_SEQUENCE:
				return operationSequence != null && !operationSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationSequenceImpl

/**
 */
package browserautomation.provider;

import browserautomation.util.BrowserautomationAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BrowserautomationItemProviderAdapterFactory extends BrowserautomationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowserautomationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.ClickId} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClickIdItemProvider clickIdItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.ClickId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClickIdAdapter() {
		if (clickIdItemProvider == null) {
			clickIdItemProvider = new ClickIdItemProvider(this);
		}

		return clickIdItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.ClickLienClickLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClickLienClickLinkItemProvider clickLienClickLinkItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.ClickLienClickLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClickLienClickLinkAdapter() {
		if (clickLienClickLinkItemProvider == null) {
			clickLienClickLinkItemProvider = new ClickLienClickLinkItemProvider(this);
		}

		return clickLienClickLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.ClickIdValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClickIdValueItemProvider clickIdValueItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.ClickIdValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClickIdValueAdapter() {
		if (clickIdValueItemProvider == null) {
			clickIdValueItemProvider = new ClickIdValueItemProvider(this);
		}

		return clickIdValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.TypeText} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTextItemProvider typeTextItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.TypeText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeTextAdapter() {
		if (typeTextItemProvider == null) {
			typeTextItemProvider = new TypeTextItemProvider(this);
		}

		return typeTextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.GoToUrl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoToUrlItemProvider goToUrlItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.GoToUrl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoToUrlAdapter() {
		if (goToUrlItemProvider == null) {
			goToUrlItemProvider = new GoToUrlItemProvider(this);
		}

		return goToUrlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.OpenBrowserWindow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenBrowserWindowItemProvider openBrowserWindowItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.OpenBrowserWindow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpenBrowserWindowAdapter() {
		if (openBrowserWindowItemProvider == null) {
			openBrowserWindowItemProvider = new OpenBrowserWindowItemProvider(this);
		}

		return openBrowserWindowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.LinksCollection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinksCollectionItemProvider linksCollectionItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.LinksCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinksCollectionAdapter() {
		if (linksCollectionItemProvider == null) {
			linksCollectionItemProvider = new LinksCollectionItemProvider(this);
		}

		return linksCollectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.TextInputsCollection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextInputsCollectionItemProvider textInputsCollectionItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.TextInputsCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextInputsCollectionAdapter() {
		if (textInputsCollectionItemProvider == null) {
			textInputsCollectionItemProvider = new TextInputsCollectionItemProvider(this);
		}

		return textInputsCollectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.PicturesCollection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PicturesCollectionItemProvider picturesCollectionItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.PicturesCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPicturesCollectionAdapter() {
		if (picturesCollectionItemProvider == null) {
			picturesCollectionItemProvider = new PicturesCollectionItemProvider(this);
		}

		return picturesCollectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.If} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfItemProvider ifItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.If}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfAdapter() {
		if (ifItemProvider == null) {
			ifItemProvider = new IfItemProvider(this);
		}

		return ifItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.Then} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThenItemProvider thenItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.Then}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThenAdapter() {
		if (thenItemProvider == null) {
			thenItemProvider = new ThenItemProvider(this);
		}

		return thenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.Else} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElseItemProvider elseItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.Else}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElseAdapter() {
		if (elseItemProvider == null) {
			elseItemProvider = new ElseItemProvider(this);
		}

		return elseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.Condition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionItemProvider conditionItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionAdapter() {
		if (conditionItemProvider == null) {
			conditionItemProvider = new ConditionItemProvider(this);
		}

		return conditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.LoopCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopConditionItemProvider loopConditionItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.LoopCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoopConditionAdapter() {
		if (loopConditionItemProvider == null) {
			loopConditionItemProvider = new LoopConditionItemProvider(this);
		}

		return loopConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link browserautomation.LoopCollection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopCollectionItemProvider loopCollectionItemProvider;

	/**
	 * This creates an adapter for a {@link browserautomation.LoopCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoopCollectionAdapter() {
		if (loopCollectionItemProvider == null) {
			loopCollectionItemProvider = new LoopCollectionItemProvider(this);
		}

		return loopCollectionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (clickIdItemProvider != null) clickIdItemProvider.dispose();
		if (clickLienClickLinkItemProvider != null) clickLienClickLinkItemProvider.dispose();
		if (clickIdValueItemProvider != null) clickIdValueItemProvider.dispose();
		if (typeTextItemProvider != null) typeTextItemProvider.dispose();
		if (goToUrlItemProvider != null) goToUrlItemProvider.dispose();
		if (openBrowserWindowItemProvider != null) openBrowserWindowItemProvider.dispose();
		if (linksCollectionItemProvider != null) linksCollectionItemProvider.dispose();
		if (textInputsCollectionItemProvider != null) textInputsCollectionItemProvider.dispose();
		if (picturesCollectionItemProvider != null) picturesCollectionItemProvider.dispose();
		if (ifItemProvider != null) ifItemProvider.dispose();
		if (thenItemProvider != null) thenItemProvider.dispose();
		if (elseItemProvider != null) elseItemProvider.dispose();
		if (conditionItemProvider != null) conditionItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (loopConditionItemProvider != null) loopConditionItemProvider.dispose();
		if (loopCollectionItemProvider != null) loopCollectionItemProvider.dispose();
	}

}
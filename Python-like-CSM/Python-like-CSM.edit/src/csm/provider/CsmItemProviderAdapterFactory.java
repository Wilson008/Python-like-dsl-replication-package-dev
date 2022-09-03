/**
 */
package csm.provider;

import csm.util.CsmAdapterFactory;

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
public class CsmItemProviderAdapterFactory extends CsmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public CsmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.CSM} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMItemProvider csmItemProvider;

	/**
	 * This creates an adapter for a {@link csm.CSM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCSMAdapter() {
		if (csmItemProvider == null) {
			csmItemProvider = new CSMItemProvider(this);
		}

		return csmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.Scenarion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarionItemProvider scenarionItemProvider;

	/**
	 * This creates an adapter for a {@link csm.Scenarion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScenarionAdapter() {
		if (scenarionItemProvider == null) {
			scenarionItemProvider = new ScenarionItemProvider(this);
		}

		return scenarionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.Start} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartItemProvider startItemProvider;

	/**
	 * This creates an adapter for a {@link csm.Start}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartAdapter() {
		if (startItemProvider == null) {
			startItemProvider = new StartItemProvider(this);
		}

		return startItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.Stop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopItemProvider stopItemProvider;

	/**
	 * This creates an adapter for a {@link csm.Stop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStopAdapter() {
		if (stopItemProvider == null) {
			stopItemProvider = new StopItemProvider(this);
		}

		return stopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.ResourceAcquire} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAcquireItemProvider resourceAcquireItemProvider;

	/**
	 * This creates an adapter for a {@link csm.ResourceAcquire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAcquireAdapter() {
		if (resourceAcquireItemProvider == null) {
			resourceAcquireItemProvider = new ResourceAcquireItemProvider(this);
		}

		return resourceAcquireItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.ResourceRelease} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceReleaseItemProvider resourceReleaseItemProvider;

	/**
	 * This creates an adapter for a {@link csm.ResourceRelease}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceReleaseAdapter() {
		if (resourceReleaseItemProvider == null) {
			resourceReleaseItemProvider = new ResourceReleaseItemProvider(this);
		}

		return resourceReleaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.Workload} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadItemProvider workloadItemProvider;

	/**
	 * This creates an adapter for a {@link csm.Workload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkloadAdapter() {
		if (workloadItemProvider == null) {
			workloadItemProvider = new WorkloadItemProvider(this);
		}

		return workloadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link csm.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.ProcessingResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingResourceItemProvider processingResourceItemProvider;

	/**
	 * This creates an adapter for a {@link csm.ProcessingResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessingResourceAdapter() {
		if (processingResourceItemProvider == null) {
			processingResourceItemProvider = new ProcessingResourceItemProvider(this);
		}

		return processingResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.ExternalService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalServiceItemProvider externalServiceItemProvider;

	/**
	 * This creates an adapter for a {@link csm.ExternalService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalServiceAdapter() {
		if (externalServiceItemProvider == null) {
			externalServiceItemProvider = new ExternalServiceItemProvider(this);
		}

		return externalServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.Message} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageItemProvider messageItemProvider;

	/**
	 * This creates an adapter for a {@link csm.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageAdapter() {
		if (messageItemProvider == null) {
			messageItemProvider = new MessageItemProvider(this);
		}

		return messageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.Join} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinItemProvider joinItemProvider;

	/**
	 * This creates an adapter for a {@link csm.Join}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoinAdapter() {
		if (joinItemProvider == null) {
			joinItemProvider = new JoinItemProvider(this);
		}

		return joinItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.Fork} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkItemProvider forkItemProvider;

	/**
	 * This creates an adapter for a {@link csm.Fork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForkAdapter() {
		if (forkItemProvider == null) {
			forkItemProvider = new ForkItemProvider(this);
		}

		return forkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.Merge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeItemProvider mergeItemProvider;

	/**
	 * This creates an adapter for a {@link csm.Merge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMergeAdapter() {
		if (mergeItemProvider == null) {
			mergeItemProvider = new MergeItemProvider(this);
		}

		return mergeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.Branch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchItemProvider branchItemProvider;

	/**
	 * This creates an adapter for a {@link csm.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBranchAdapter() {
		if (branchItemProvider == null) {
			branchItemProvider = new BranchItemProvider(this);
		}

		return branchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link csm.Seqence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeqenceItemProvider seqenceItemProvider;

	/**
	 * This creates an adapter for a {@link csm.Seqence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeqenceAdapter() {
		if (seqenceItemProvider == null) {
			seqenceItemProvider = new SeqenceItemProvider(this);
		}

		return seqenceItemProvider;
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
		if (csmItemProvider != null) csmItemProvider.dispose();
		if (scenarionItemProvider != null) scenarionItemProvider.dispose();
		if (startItemProvider != null) startItemProvider.dispose();
		if (stopItemProvider != null) stopItemProvider.dispose();
		if (resourceAcquireItemProvider != null) resourceAcquireItemProvider.dispose();
		if (resourceReleaseItemProvider != null) resourceReleaseItemProvider.dispose();
		if (workloadItemProvider != null) workloadItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (processingResourceItemProvider != null) processingResourceItemProvider.dispose();
		if (externalServiceItemProvider != null) externalServiceItemProvider.dispose();
		if (messageItemProvider != null) messageItemProvider.dispose();
		if (joinItemProvider != null) joinItemProvider.dispose();
		if (forkItemProvider != null) forkItemProvider.dispose();
		if (mergeItemProvider != null) mergeItemProvider.dispose();
		if (branchItemProvider != null) branchItemProvider.dispose();
		if (seqenceItemProvider != null) seqenceItemProvider.dispose();
	}

}

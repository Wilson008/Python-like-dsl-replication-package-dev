/**
 */
package demodsl.provider;

import demodsl.util.DemodslAdapterFactory;

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
public class DemodslItemProviderAdapterFactory extends DemodslAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public DemodslItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link demodsl.Root} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootItemProvider rootItemProvider;

	/**
	 * This creates an adapter for a {@link demodsl.Root}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRootAdapter() {
		if (rootItemProvider == null) {
			rootItemProvider = new RootItemProvider(this);
		}

		return rootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link demodsl.SoftwareComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareComponentItemProvider softwareComponentItemProvider;

	/**
	 * This creates an adapter for a {@link demodsl.SoftwareComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareComponentAdapter() {
		if (softwareComponentItemProvider == null) {
			softwareComponentItemProvider = new SoftwareComponentItemProvider(this);
		}

		return softwareComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link demodsl.Node} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeItemProvider nodeItemProvider;

	/**
	 * This creates an adapter for a {@link demodsl.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeAdapter() {
		if (nodeItemProvider == null) {
			nodeItemProvider = new NodeItemProvider(this);
		}

		return nodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link demodsl.Sensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorItemProvider sensorItemProvider;

	/**
	 * This creates an adapter for a {@link demodsl.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSensorAdapter() {
		if (sensorItemProvider == null) {
			sensorItemProvider = new SensorItemProvider(this);
		}

		return sensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link demodsl.Actuator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorItemProvider actuatorItemProvider;

	/**
	 * This creates an adapter for a {@link demodsl.Actuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActuatorAdapter() {
		if (actuatorItemProvider == null) {
			actuatorItemProvider = new ActuatorItemProvider(this);
		}

		return actuatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link demodsl.PowerPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerPortItemProvider powerPortItemProvider;

	/**
	 * This creates an adapter for a {@link demodsl.PowerPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPowerPortAdapter() {
		if (powerPortItemProvider == null) {
			powerPortItemProvider = new PowerPortItemProvider(this);
		}

		return powerPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link demodsl.FunctionPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPortItemProvider functionPortItemProvider;

	/**
	 * This creates an adapter for a {@link demodsl.FunctionPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionPortAdapter() {
		if (functionPortItemProvider == null) {
			functionPortItemProvider = new FunctionPortItemProvider(this);
		}

		return functionPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link demodsl.PortGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortGroupItemProvider portGroupItemProvider;

	/**
	 * This creates an adapter for a {@link demodsl.PortGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortGroupAdapter() {
		if (portGroupItemProvider == null) {
			portGroupItemProvider = new PortGroupItemProvider(this);
		}

		return portGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link demodsl.PortConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortConnectorItemProvider portConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link demodsl.PortConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortConnectorAdapter() {
		if (portConnectorItemProvider == null) {
			portConnectorItemProvider = new PortConnectorItemProvider(this);
		}

		return portConnectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link demodsl.GroupConnector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupConnectorItemProvider groupConnectorItemProvider;

	/**
	 * This creates an adapter for a {@link demodsl.GroupConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupConnectorAdapter() {
		if (groupConnectorItemProvider == null) {
			groupConnectorItemProvider = new GroupConnectorItemProvider(this);
		}

		return groupConnectorItemProvider;
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
		if (rootItemProvider != null) rootItemProvider.dispose();
		if (softwareComponentItemProvider != null) softwareComponentItemProvider.dispose();
		if (nodeItemProvider != null) nodeItemProvider.dispose();
		if (sensorItemProvider != null) sensorItemProvider.dispose();
		if (actuatorItemProvider != null) actuatorItemProvider.dispose();
		if (powerPortItemProvider != null) powerPortItemProvider.dispose();
		if (functionPortItemProvider != null) functionPortItemProvider.dispose();
		if (portGroupItemProvider != null) portGroupItemProvider.dispose();
		if (portConnectorItemProvider != null) portConnectorItemProvider.dispose();
		if (groupConnectorItemProvider != null) groupConnectorItemProvider.dispose();
	}

}

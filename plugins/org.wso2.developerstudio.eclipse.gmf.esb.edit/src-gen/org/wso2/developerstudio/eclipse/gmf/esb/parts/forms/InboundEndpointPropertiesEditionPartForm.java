/**
 * Generated with Acceleo
 */
package org.wso2.developerstudio.eclipse.gmf.esb.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.jface.window.Window;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;

import org.wso2.developerstudio.eclipse.gmf.esb.parts.EsbViewsRepository;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart;

import org.wso2.developerstudio.eclipse.gmf.esb.providers.EsbMessages;

// End of user code

/**
 * 
 * 
 */
public class InboundEndpointPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, InboundEndpointPropertiesEditionPart {

	protected Text description;
	protected Text commentsList;
	protected Button editCommentsList;
	protected EList commentsListList;
	protected Text name;
	protected EMFComboViewer type;
	protected Text class_;
	protected Text protocol;
	protected EMFComboViewer inboundEndpointBehaviour;
	protected Text inboundHttpPort;
	protected Text inboundWorkerPoolSizeCore;
	protected Text inboundWorkerPoolSizeMax;
	protected Text inboundWorkerThreadKeepAliveSec;
	protected Text inboundWorkerPoolQueueLength;
	protected Text inboundThreadGroupId;
	protected Text inboundThreadId;
	protected Text dispatchFilterPattern;
	protected Text interval;
	protected Button sequential;
	protected Button coordination;
	protected Text transportVFSFileURI;
	protected Text wso2mbConnectionUrl;
	protected Text transportVFSContentType;
	protected Text transportVFSFileNamePattern;
	protected Text transportVFSFileProcessInterval;
	protected Text transportVFSFileProcessCount;
	protected EMFComboViewer transportVFSLocking;
	protected Text transportVFSMaxRetryCount;
	protected Text transportVFSMoveAfterFailedMove;
	protected Text transportVFSReconnectTimeout;
	protected Button transportJMSSharedSubscription;
	protected Text transportJMSSubscriptionName;
	protected Text transportJMSPinnedServers;
	protected EMFComboViewer transportVFSActionAfterProcess;
	protected Text transportVFSMoveAfterProcess;
	protected EMFComboViewer transportVFSActionAfterErrors;
	protected Text transportVFSMoveAfterErrors;
	protected Text transportVFSFailedRecordsFileName;
	protected Text transportVFSFailedRecordsFileDestination;
	protected Text transportVFSMoveFailedRecordTimestampFormat;
	protected Text transportVFSFailedRecordNextRetryDuration;
	protected EMFComboViewer transportVFSActionAfterFailure;
	protected Text transportVFSMoveAfterFailure;
	protected Text transportVFSReplyFileURI;
	protected Text transportVFSReplyFileName;
	protected Button transportVFSAutoLockRelease;
	protected Text transportVFSAutoLockReleaseInterval;
	protected Button transportVFSLockReleaseSameNode;
	protected Button transportVFSDistributedLock;
	protected Button transportVFSStreaming;
	protected Button transportVFSBuild;
	protected Text transportVFSDistributedTimeout;
	protected Text javaNamingFactoryInitial;
	protected Text javaNamingProviderUrl;
	protected Text transportJMSConnectionFactoryJNDIName;
	protected EMFComboViewer transportJMSConnectionFactoryType;
	protected Text transportJMSConcurrentConsumers;
	protected Text transportJMSDestination;
	protected Button transportJMSSessionTransacted;
	protected EMFComboViewer transportJMSSessionAcknowledgement;
	protected EMFComboViewer transportJMSCacheLevel;
	protected Text transportJMSUserName;
	protected Text transportJMSPassword;
	protected Text transportJMSJMSSpecVersion;
	protected Text transportJMSSubscriptionDurable;
	protected Text transportJMSDurableSubscriberClientID;
	protected Text transportJMSMessageSelector;
	protected Text transportJMSRetryDuration;
	protected Text transportVFSMoveTimestampFormat;
	protected EMFComboViewer transportVFSFileSortAttribute;
	protected Button transportVFSFileSortAscending;
	protected Text transportVFSSubFolderTimestampFormat;
	protected Button transportVFSCreateFolder;
	protected Text transportJMSReceiveTimeout;
	protected Text transportJMSContentType;
	protected Text transportJMSContentTypeProperty;
	protected Text transportJMSReplyDestination;
	protected Text transportJMSPubSubNoLocal;
	protected Text transportJMSDurableSubscriberName;
	protected EMFComboViewer transportJMSBrokerType;
	protected Text transportMQTTConnectionFactory;
	protected Text transportMQTTServerHostName;
	protected Text transportMQTTServerPort;
	protected Text transportMQTTTopicName;
	protected EMFComboViewer transportMQTTSubscriptionQOS;
	protected Button transportMQTTSessionClean;
	protected Text transportMQTTSslEnable;
	protected Text transportMQTTTemporaryStoreDirectory;
	protected Text transportMQTTSubscriptionUsername;
	protected Text transportMQTTSubscriptionPassword;
	protected Text transportMQTTClientId;
	protected Text truststore;
	protected Text keystore;
	protected Text sslVerifyClient;
	protected Text sslProtocol;
	protected Text httpsProtocols;
	protected Text certificateRevocationVerifier;
	protected Text inboundHL7Port;
	protected Button inboundHL7AutoAck;
	protected Text inboundHL7MessagePreProcessor;
	protected Text inboundHL7CharSet;
	protected Text inboundHL7TimeOut;
	protected Button inboundHL7ValidateMessage;
	protected Button inboundHL7BuildInvalidMessages;
	protected Button inboundHL7PassThroughInvalidMessages;
	protected Text zookeeperConnect;
	protected Text groupId;
	protected Text contentType;
	protected EMFComboViewer consumerType;
	protected EMFComboViewer topicsOrTopicFilter;
	protected Text topicsName;
	protected EMFComboViewer topicFilterFrom;
	protected Text topicFilterName;
	protected Text simpleConsumerTopic;
	protected Text simpleConsumerBrokers;
	protected Text simpleConsumerPort;
	protected Text simpleConsumerPartition;
	protected Text simpleConsumerMaxMessagesToRead;
	protected Text threadCount;
	protected Text consumerId;
	protected Text socketTimeoutMs;
	protected Text socketReceiveBufferBytes;
	protected Text fetchMessageMaxBytes;
	protected Text numConsumerFetches;
	protected Button autoCommitEnable;
	protected Text autoCommitIntervalMs;
	protected Text queuedMaxMessageChunks;
	protected Text rebalanceMaxRetries;
	protected Text fetchMinBytes;
	protected Text fetchWaitMaxMs;
	protected Text rebalanceBackoffMs;
	protected Text refreshLeaderBackoffMs;
	protected EMFComboViewer autoOffsetReset;
	protected Text consumerTimeoutMs;
	protected Button excludeInternalTopics;
	protected EMFComboViewer partitionAssignmentStrategy;
	protected Text clientId;
	protected Text zookeeperSessionTimeoutMs;
	protected Text zookeeperConnectionTimeoutMs;
	protected Text zookeeperSyncTimeMs;
	protected EMFComboViewer offsetsStorage;
	protected Text offsetsChannelBackoffMs;
	protected Text offsetsChannelSocketTimeoutMs;
	protected Text offsetsCommitMaxRetries;
	protected Button dualCommitEnabled;
	protected Text inboundCxfRmHost;
	protected Text inboundCxfRmPort;
	protected Text inboundCxfRmConfigFile;
	protected Button enableSSL;
	protected ReferencesTable serviceParameters;
	protected List<ViewerFilter> serviceParametersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> serviceParametersFilters = new ArrayList<ViewerFilter>();
	protected Button suspend;
	protected Text transportRabbitMqConnectionFactory;
	protected Text transportRabbitMqServerHostName;
	protected Text transportRabbitMqServerPort;
	protected Text transportRabbitMqServerUserName;
	protected Text transportRabbitMqServerPassword;
	protected Text transportRabbitMqQueueName;
	protected Text transportRabbitMqExchangeName;
	protected Text transportRabbitMqQueueDurable;
	protected Text transportRabbitMqQueueExclusive;
	protected Text transportRabbitMqQueueAutoDelete;
	protected Text transportRabbitMqQueueAutoAck;
	protected Text transportRabbitMqQueueRoutingKey;
	protected Text transportRabbitMqQueueDeliveryMode;
	protected Text transportRabbitMqExchangeType;
	protected Text transportRabbitMqExchangeDurable;
	protected Text transportRabbitMqExchangeAutoDelete;
	protected Text transportRabbitMqServerVirtualHost;
	protected Text transportRabbitMqFactoryHeartbeat;
	protected Text transportRabbitMqConnectionSslEnabled;
	protected Text transportRabbitMqConnectionSslKeystoreLocation;
	protected Text transportRabbitMqConnectionSslKeystoreType;
	protected Text transportRabbitMqConnectionSslKeystorePassword;
	protected Text transportRabbitMqConnectionSslTruststoreLocation;
	protected Text transportRabbitMqConnectionSslTruststoreType;
	protected Text transportRabbitMqConnectionSslTruststorePassword;
	protected Text transportRabbitMqConnectionSslVersion;
	protected Text transportRabbitMqMessageContentType;
	protected Text transportRabbitMqConnectionRetryCount;
	protected Text transportRabbitMqConnectionRetryInterval;
	protected Text transportRabbitMqServerRetryInterval;
	protected Text wsInboundPort;
	protected EMFComboViewer wsClientSideBroadcastLevel;
	protected Text wsOutflowDispatchSequence;
	protected Text wsOutflowDispatchFaultSequence;
	protected Text wsBossThreadPoolSize;
	protected Text wsWorkerThreadPoolSize;
	protected Text wsSubprotocolHandlerClass;
	protected Text wsPipelineHandlerClass;
	protected Text transportFeedURL;
	protected EMFComboViewer transportFeedType;
	protected Button traceEnabled;
	protected Button statisticsEnabled;
	protected Text transportJMSRetriesBeforeSuspension;
	protected Button transportJMSResetConnectionOnPollingSuspension;
	protected Text transportJMSPollingSuspensionPeriod;
	protected Text transportMQTTSslKeystoreLocation;
	protected Text transportMQTTSslKeystoreType;
	protected Text transportMQTTSslKeystorePassword;
	protected Text transportMQTTSslTruststoreLocation;
	protected Text transportMQTTSslTruststoreType;
	protected Text transportMQTTSslTruststorePassword;
	protected Text transportMQTTSslVersion;
	protected Text wssSslKeyStoreFile;
	protected Text wssSslKeyStorePass;
	protected Text wssSslTrustStoreFile;
	protected Text wssSslTrustStorePass;
	protected Text wssSslCertPass;
	protected Text wsDefaultContentType;
	protected Text wsShutdownStatusCode;
	protected Text wsShutdownStatusMessage;
	protected Button wsUsePortOffset;
	protected Text wssSslProtocols;
	protected Text wssSslCipherSuites;
	protected Text transportRabbitMqConsumerQos;
	protected EMFComboViewer transportRabbitMqConsumerQosType;
	protected Text transportJMSDBUrl;



	/**
	 * For {@link ISection} use only.
	 */
	public InboundEndpointPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InboundEndpointPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence inboundEndpointStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = inboundEndpointStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.class);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.description);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.commentsList);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.name);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.type);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.class_);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.protocol);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.interval);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.sequential);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.coordination);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.truststore);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.keystore);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.sslProtocol);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.groupId);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.contentType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.consumerType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.topicsName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.topicFilterName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.threadCount);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.consumerId);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.clientId);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.enableSSL);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.serviceParameters);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.suspend);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportFeedType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.traceEnabled);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl);
		
		
		composer = new PartComposer(inboundEndpointStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EsbViewsRepository.InboundEndpoint.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.commentsList) {
					return createCommentsListMultiValuedEditor(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.type) {
					return createTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.class_) {
					return createClass_Text(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.protocol) {
					return createProtocolText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour) {
					return createInboundEndpointBehaviourEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort) {
					return createInboundHttpPortText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore) {
					return createInboundWorkerPoolSizeCoreText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax) {
					return createInboundWorkerPoolSizeMaxText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec) {
					return createInboundWorkerThreadKeepAliveSecText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength) {
					return createInboundWorkerPoolQueueLengthText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId) {
					return createInboundThreadGroupIdText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId) {
					return createInboundThreadIdText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern) {
					return createDispatchFilterPatternText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.interval) {
					return createIntervalText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.sequential) {
					return createSequentialCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.coordination) {
					return createCoordinationCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI) {
					return createTransportVFSFileURIText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl) {
					return createWso2mbConnectionUrlText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType) {
					return createTransportVFSContentTypeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern) {
					return createTransportVFSFileNamePatternText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval) {
					return createTransportVFSFileProcessIntervalText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount) {
					return createTransportVFSFileProcessCountText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking) {
					return createTransportVFSLockingEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount) {
					return createTransportVFSMaxRetryCountText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove) {
					return createTransportVFSMoveAfterFailedMoveText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout) {
					return createTransportVFSReconnectTimeoutText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription) {
					return createTransportJMSSharedSubscriptionCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName) {
					return createTransportJMSSubscriptionNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers) {
					return createTransportJMSPinnedServersText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess) {
					return createTransportVFSActionAfterProcessEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess) {
					return createTransportVFSMoveAfterProcessText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors) {
					return createTransportVFSActionAfterErrorsEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors) {
					return createTransportVFSMoveAfterErrorsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName) {
					return createTransportVFSFailedRecordsFileNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination) {
					return createTransportVFSFailedRecordsFileDestinationText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat) {
					return createTransportVFSMoveFailedRecordTimestampFormatText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration) {
					return createTransportVFSFailedRecordNextRetryDurationText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure) {
					return createTransportVFSActionAfterFailureEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure) {
					return createTransportVFSMoveAfterFailureText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI) {
					return createTransportVFSReplyFileURIText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName) {
					return createTransportVFSReplyFileNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease) {
					return createTransportVFSAutoLockReleaseCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval) {
					return createTransportVFSAutoLockReleaseIntervalText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode) {
					return createTransportVFSLockReleaseSameNodeCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock) {
					return createTransportVFSDistributedLockCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming) {
					return createTransportVFSStreamingCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild) {
					return createTransportVFSBuildCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout) {
					return createTransportVFSDistributedTimeoutText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial) {
					return createJavaNamingFactoryInitialText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl) {
					return createJavaNamingProviderUrlText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName) {
					return createTransportJMSConnectionFactoryJNDINameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType) {
					return createTransportJMSConnectionFactoryTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers) {
					return createTransportJMSConcurrentConsumersText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination) {
					return createTransportJMSDestinationText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted) {
					return createTransportJMSSessionTransactedCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement) {
					return createTransportJMSSessionAcknowledgementEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel) {
					return createTransportJMSCacheLevelEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName) {
					return createTransportJMSUserNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword) {
					return createTransportJMSPasswordText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion) {
					return createTransportJMSJMSSpecVersionText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable) {
					return createTransportJMSSubscriptionDurableText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID) {
					return createTransportJMSDurableSubscriberClientIDText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector) {
					return createTransportJMSMessageSelectorText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration) {
					return createTransportJMSRetryDurationText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat) {
					return createTransportVFSMoveTimestampFormatText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute) {
					return createTransportVFSFileSortAttributeEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending) {
					return createTransportVFSFileSortAscendingCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat) {
					return createTransportVFSSubFolderTimestampFormatText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder) {
					return createTransportVFSCreateFolderCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout) {
					return createTransportJMSReceiveTimeoutText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType) {
					return createTransportJMSContentTypeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty) {
					return createTransportJMSContentTypePropertyText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination) {
					return createTransportJMSReplyDestinationText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal) {
					return createTransportJMSPubSubNoLocalText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName) {
					return createTransportJMSDurableSubscriberNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType) {
					return createTransportJMSBrokerTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory) {
					return createTransportMQTTConnectionFactoryText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName) {
					return createTransportMQTTServerHostNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort) {
					return createTransportMQTTServerPortText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName) {
					return createTransportMQTTTopicNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS) {
					return createTransportMQTTSubscriptionQOSEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean) {
					return createTransportMQTTSessionCleanCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable) {
					return createTransportMQTTSslEnableText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory) {
					return createTransportMQTTTemporaryStoreDirectoryText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername) {
					return createTransportMQTTSubscriptionUsernameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword) {
					return createTransportMQTTSubscriptionPasswordText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId) {
					return createTransportMQTTClientIdText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.truststore) {
					return createTruststoreText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.keystore) {
					return createKeystoreText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient) {
					return createSslVerifyClientText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.sslProtocol) {
					return createSslProtocolText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols) {
					return createHttpsProtocolsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier) {
					return createCertificateRevocationVerifierText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port) {
					return createInboundHL7PortText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck) {
					return createInboundHL7AutoAckCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor) {
					return createInboundHL7MessagePreProcessorText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet) {
					return createInboundHL7CharSetText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut) {
					return createInboundHL7TimeOutText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage) {
					return createInboundHL7ValidateMessageCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages) {
					return createInboundHL7BuildInvalidMessagesCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages) {
					return createInboundHL7PassThroughInvalidMessagesCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect) {
					return createZookeeperConnectText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.groupId) {
					return createGroupIdText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.contentType) {
					return createContentTypeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.consumerType) {
					return createConsumerTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter) {
					return createTopicsOrTopicFilterEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.topicsName) {
					return createTopicsNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom) {
					return createTopicFilterFromEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.topicFilterName) {
					return createTopicFilterNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic) {
					return createSimpleConsumerTopicText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers) {
					return createSimpleConsumerBrokersText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort) {
					return createSimpleConsumerPortText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition) {
					return createSimpleConsumerPartitionText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead) {
					return createSimpleConsumerMaxMessagesToReadText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.threadCount) {
					return createThreadCountText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.consumerId) {
					return createConsumerIdText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs) {
					return createSocketTimeoutMsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes) {
					return createSocketReceiveBufferBytesText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes) {
					return createFetchMessageMaxBytesText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches) {
					return createNumConsumerFetchesText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable) {
					return createAutoCommitEnableCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs) {
					return createAutoCommitIntervalMsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks) {
					return createQueuedMaxMessageChunksText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries) {
					return createRebalanceMaxRetriesText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes) {
					return createFetchMinBytesText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs) {
					return createFetchWaitMaxMsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs) {
					return createRebalanceBackoffMsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs) {
					return createRefreshLeaderBackoffMsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset) {
					return createAutoOffsetResetEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs) {
					return createConsumerTimeoutMsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics) {
					return createExcludeInternalTopicsCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy) {
					return createPartitionAssignmentStrategyEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.clientId) {
					return createClientIdText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs) {
					return createZookeeperSessionTimeoutMsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs) {
					return createZookeeperConnectionTimeoutMsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs) {
					return createZookeeperSyncTimeMsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage) {
					return createOffsetsStorageEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs) {
					return createOffsetsChannelBackoffMsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs) {
					return createOffsetsChannelSocketTimeoutMsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries) {
					return createOffsetsCommitMaxRetriesText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled) {
					return createDualCommitEnabledCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost) {
					return createInboundCxfRmHostText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort) {
					return createInboundCxfRmPortText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile) {
					return createInboundCxfRmConfigFileText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.enableSSL) {
					return createEnableSSLCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.serviceParameters) {
					return createServiceParametersTableComposition(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.suspend) {
					return createSuspendCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory) {
					return createTransportRabbitMqConnectionFactoryText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName) {
					return createTransportRabbitMqServerHostNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort) {
					return createTransportRabbitMqServerPortText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName) {
					return createTransportRabbitMqServerUserNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword) {
					return createTransportRabbitMqServerPasswordText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName) {
					return createTransportRabbitMqQueueNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName) {
					return createTransportRabbitMqExchangeNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable) {
					return createTransportRabbitMqQueueDurableText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive) {
					return createTransportRabbitMqQueueExclusiveText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete) {
					return createTransportRabbitMqQueueAutoDeleteText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck) {
					return createTransportRabbitMqQueueAutoAckText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey) {
					return createTransportRabbitMqQueueRoutingKeyText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode) {
					return createTransportRabbitMqQueueDeliveryModeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType) {
					return createTransportRabbitMqExchangeTypeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable) {
					return createTransportRabbitMqExchangeDurableText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete) {
					return createTransportRabbitMqExchangeAutoDeleteText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost) {
					return createTransportRabbitMqServerVirtualHostText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat) {
					return createTransportRabbitMqFactoryHeartbeatText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled) {
					return createTransportRabbitMqConnectionSslEnabledText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation) {
					return createTransportRabbitMqConnectionSslKeystoreLocationText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType) {
					return createTransportRabbitMqConnectionSslKeystoreTypeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword) {
					return createTransportRabbitMqConnectionSslKeystorePasswordText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation) {
					return createTransportRabbitMqConnectionSslTruststoreLocationText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType) {
					return createTransportRabbitMqConnectionSslTruststoreTypeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword) {
					return createTransportRabbitMqConnectionSslTruststorePasswordText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion) {
					return createTransportRabbitMqConnectionSslVersionText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType) {
					return createTransportRabbitMqMessageContentTypeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount) {
					return createTransportRabbitMqConnectionRetryCountText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval) {
					return createTransportRabbitMqConnectionRetryIntervalText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval) {
					return createTransportRabbitMqServerRetryIntervalText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort) {
					return createWsInboundPortText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel) {
					return createWsClientSideBroadcastLevelEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence) {
					return createWsOutflowDispatchSequenceText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence) {
					return createWsOutflowDispatchFaultSequenceText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize) {
					return createWsBossThreadPoolSizeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize) {
					return createWsWorkerThreadPoolSizeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass) {
					return createWsSubprotocolHandlerClassText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass) {
					return createWsPipelineHandlerClassText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL) {
					return createTransportFeedURLText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportFeedType) {
					return createTransportFeedTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.traceEnabled) {
					return createTraceEnabledCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled) {
					return createStatisticsEnabledCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension) {
					return createTransportJMSRetriesBeforeSuspensionText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension) {
					return createTransportJMSResetConnectionOnPollingSuspensionCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod) {
					return createTransportJMSPollingSuspensionPeriodText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation) {
					return createTransportMQTTSslKeystoreLocationText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType) {
					return createTransportMQTTSslKeystoreTypeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword) {
					return createTransportMQTTSslKeystorePasswordText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation) {
					return createTransportMQTTSslTruststoreLocationText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType) {
					return createTransportMQTTSslTruststoreTypeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword) {
					return createTransportMQTTSslTruststorePasswordText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion) {
					return createTransportMQTTSslVersionText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile) {
					return createWssSslKeyStoreFileText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass) {
					return createWssSslKeyStorePassText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile) {
					return createWssSslTrustStoreFileText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass) {
					return createWssSslTrustStorePassText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass) {
					return createWssSslCertPassText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType) {
					return createWsDefaultContentTypeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode) {
					return createWsShutdownStatusCodeText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage) {
					return createWsShutdownStatusMessageText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset) {
					return createWsUsePortOffsetCheckbox(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols) {
					return createWssSslProtocolsText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites) {
					return createWssSslCipherSuitesText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos) {
					return createTransportRabbitMqConsumerQosText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType) {
					return createTransportRabbitMqConsumerQosTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl) {
					return createTransportJMSDBUrlText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EsbMessages.InboundEndpointPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.description, EsbMessages.InboundEndpointPropertiesEditionPart_DescriptionLabel);
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.description,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, description.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, EsbViewsRepository.InboundEndpoint.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.description, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createCommentsListMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		commentsList = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData commentsListData = new GridData(GridData.FILL_HORIZONTAL);
		commentsListData.horizontalSpan = 2;
		commentsList.setLayoutData(commentsListData);
		EditingUtils.setID(commentsList, EsbViewsRepository.InboundEndpoint.Properties.commentsList);
		EditingUtils.setEEFtype(commentsList, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editCommentsList = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.commentsList, EsbMessages.InboundEndpointPropertiesEditionPart_CommentsListLabel), SWT.NONE);
		GridData editCommentsListData = new GridData();
		editCommentsList.setLayoutData(editCommentsListData);
		editCommentsList.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						commentsList.getShell(), "InboundEndpoint", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						commentsListList, EsbPackage.eINSTANCE.getEsbElement_CommentsList().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					commentsListList = dialog.getResult();
					if (commentsListList == null) {
						commentsListList = new BasicEList();
					}
					commentsList.setText(commentsListList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.commentsList, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(commentsListList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editCommentsList, EsbViewsRepository.InboundEndpoint.Properties.commentsList);
		EditingUtils.setEEFtype(editCommentsList, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createCommentsListMultiValuedEditor

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.name, EsbMessages.InboundEndpointPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EsbViewsRepository.InboundEndpoint.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.name, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.type, EsbMessages.InboundEndpointPropertiesEditionPart_TypeLabel);
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(EsbViewsRepository.InboundEndpoint.Properties.type);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.type, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createClass_Text(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.class_, EsbMessages.InboundEndpointPropertiesEditionPart_Class_Label);
		class_ = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		class_.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData class_Data = new GridData(GridData.FILL_HORIZONTAL);
		class_.setLayoutData(class_Data);
		class_.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.class_,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, class_.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.class_,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, class_.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		class_.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.class_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, class_.getText()));
				}
			}
		});
		EditingUtils.setID(class_, EsbViewsRepository.InboundEndpoint.Properties.class_);
		EditingUtils.setEEFtype(class_, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.class_, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createClass_Text

		// End of user code
		return parent;
	}

	
	protected Composite createProtocolText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.protocol, EsbMessages.InboundEndpointPropertiesEditionPart_ProtocolLabel);
		protocol = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		protocol.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData protocolData = new GridData(GridData.FILL_HORIZONTAL);
		protocol.setLayoutData(protocolData);
		protocol.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.protocol,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocol.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.protocol,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, protocol.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		protocol.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.protocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocol.getText()));
				}
			}
		});
		EditingUtils.setID(protocol, EsbViewsRepository.InboundEndpoint.Properties.protocol);
		EditingUtils.setEEFtype(protocol, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.protocol, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createProtocolText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundEndpointBehaviourEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour, EsbMessages.InboundEndpointPropertiesEditionPart_InboundEndpointBehaviourLabel);
		inboundEndpointBehaviour = new EMFComboViewer(parent);
		inboundEndpointBehaviour.setContentProvider(new ArrayContentProvider());
		inboundEndpointBehaviour.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData inboundEndpointBehaviourData = new GridData(GridData.FILL_HORIZONTAL);
		inboundEndpointBehaviour.getCombo().setLayoutData(inboundEndpointBehaviourData);
		inboundEndpointBehaviour.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInboundEndpointBehaviour()));
			}

		});
		inboundEndpointBehaviour.setID(EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundEndpointBehaviourEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHttpPortText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHttpPortLabel);
		inboundHttpPort = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundHttpPort.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundHttpPortData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHttpPort.setLayoutData(inboundHttpPortData);
		inboundHttpPort.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHttpPort.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundHttpPort.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundHttpPort.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHttpPort.getText()));
				}
			}
		});
		EditingUtils.setID(inboundHttpPort, EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort);
		EditingUtils.setEEFtype(inboundHttpPort, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHttpPortText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundWorkerPoolSizeCoreText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore, EsbMessages.InboundEndpointPropertiesEditionPart_InboundWorkerPoolSizeCoreLabel);
		inboundWorkerPoolSizeCore = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundWorkerPoolSizeCore.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundWorkerPoolSizeCoreData = new GridData(GridData.FILL_HORIZONTAL);
		inboundWorkerPoolSizeCore.setLayoutData(inboundWorkerPoolSizeCoreData);
		inboundWorkerPoolSizeCore.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerPoolSizeCore.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundWorkerPoolSizeCore.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundWorkerPoolSizeCore.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerPoolSizeCore.getText()));
				}
			}
		});
		EditingUtils.setID(inboundWorkerPoolSizeCore, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore);
		EditingUtils.setEEFtype(inboundWorkerPoolSizeCore, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundWorkerPoolSizeCoreText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundWorkerPoolSizeMaxText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax, EsbMessages.InboundEndpointPropertiesEditionPart_InboundWorkerPoolSizeMaxLabel);
		inboundWorkerPoolSizeMax = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundWorkerPoolSizeMax.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundWorkerPoolSizeMaxData = new GridData(GridData.FILL_HORIZONTAL);
		inboundWorkerPoolSizeMax.setLayoutData(inboundWorkerPoolSizeMaxData);
		inboundWorkerPoolSizeMax.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerPoolSizeMax.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundWorkerPoolSizeMax.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundWorkerPoolSizeMax.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerPoolSizeMax.getText()));
				}
			}
		});
		EditingUtils.setID(inboundWorkerPoolSizeMax, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax);
		EditingUtils.setEEFtype(inboundWorkerPoolSizeMax, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundWorkerPoolSizeMaxText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundWorkerThreadKeepAliveSecText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec, EsbMessages.InboundEndpointPropertiesEditionPart_InboundWorkerThreadKeepAliveSecLabel);
		inboundWorkerThreadKeepAliveSec = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundWorkerThreadKeepAliveSec.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundWorkerThreadKeepAliveSecData = new GridData(GridData.FILL_HORIZONTAL);
		inboundWorkerThreadKeepAliveSec.setLayoutData(inboundWorkerThreadKeepAliveSecData);
		inboundWorkerThreadKeepAliveSec.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerThreadKeepAliveSec.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundWorkerThreadKeepAliveSec.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundWorkerThreadKeepAliveSec.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerThreadKeepAliveSec.getText()));
				}
			}
		});
		EditingUtils.setID(inboundWorkerThreadKeepAliveSec, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec);
		EditingUtils.setEEFtype(inboundWorkerThreadKeepAliveSec, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundWorkerThreadKeepAliveSecText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundWorkerPoolQueueLengthText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength, EsbMessages.InboundEndpointPropertiesEditionPart_InboundWorkerPoolQueueLengthLabel);
		inboundWorkerPoolQueueLength = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundWorkerPoolQueueLength.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundWorkerPoolQueueLengthData = new GridData(GridData.FILL_HORIZONTAL);
		inboundWorkerPoolQueueLength.setLayoutData(inboundWorkerPoolQueueLengthData);
		inboundWorkerPoolQueueLength.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerPoolQueueLength.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundWorkerPoolQueueLength.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundWorkerPoolQueueLength.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerPoolQueueLength.getText()));
				}
			}
		});
		EditingUtils.setID(inboundWorkerPoolQueueLength, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength);
		EditingUtils.setEEFtype(inboundWorkerPoolQueueLength, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundWorkerPoolQueueLengthText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundThreadGroupIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId, EsbMessages.InboundEndpointPropertiesEditionPart_InboundThreadGroupIdLabel);
		inboundThreadGroupId = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundThreadGroupId.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundThreadGroupIdData = new GridData(GridData.FILL_HORIZONTAL);
		inboundThreadGroupId.setLayoutData(inboundThreadGroupIdData);
		inboundThreadGroupId.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundThreadGroupId.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundThreadGroupId.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundThreadGroupId.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundThreadGroupId.getText()));
				}
			}
		});
		EditingUtils.setID(inboundThreadGroupId, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId);
		EditingUtils.setEEFtype(inboundThreadGroupId, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundThreadGroupIdText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundThreadIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId, EsbMessages.InboundEndpointPropertiesEditionPart_InboundThreadIdLabel);
		inboundThreadId = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundThreadId.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundThreadIdData = new GridData(GridData.FILL_HORIZONTAL);
		inboundThreadId.setLayoutData(inboundThreadIdData);
		inboundThreadId.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundThreadId.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundThreadId.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundThreadId.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundThreadId.getText()));
				}
			}
		});
		EditingUtils.setID(inboundThreadId, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId);
		EditingUtils.setEEFtype(inboundThreadId, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundThreadIdText

		// End of user code
		return parent;
	}

	
	protected Composite createDispatchFilterPatternText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern, EsbMessages.InboundEndpointPropertiesEditionPart_DispatchFilterPatternLabel);
		dispatchFilterPattern = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		dispatchFilterPattern.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData dispatchFilterPatternData = new GridData(GridData.FILL_HORIZONTAL);
		dispatchFilterPattern.setLayoutData(dispatchFilterPatternData);
		dispatchFilterPattern.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dispatchFilterPattern.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, dispatchFilterPattern.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		dispatchFilterPattern.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dispatchFilterPattern.getText()));
				}
			}
		});
		EditingUtils.setID(dispatchFilterPattern, EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern);
		EditingUtils.setEEFtype(dispatchFilterPattern, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDispatchFilterPatternText

		// End of user code
		return parent;
	}

	
	protected Composite createIntervalText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.interval, EsbMessages.InboundEndpointPropertiesEditionPart_IntervalLabel);
		interval = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		interval.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData intervalData = new GridData(GridData.FILL_HORIZONTAL);
		interval.setLayoutData(intervalData);
		interval.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.interval,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, interval.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.interval,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, interval.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		interval.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.interval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, interval.getText()));
				}
			}
		});
		EditingUtils.setID(interval, EsbViewsRepository.InboundEndpoint.Properties.interval);
		EditingUtils.setEEFtype(interval, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.interval, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createIntervalText

		// End of user code
		return parent;
	}

	
	protected Composite createSequentialCheckbox(FormToolkit widgetFactory, Composite parent) {
		sequential = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.sequential, EsbMessages.InboundEndpointPropertiesEditionPart_SequentialLabel), SWT.CHECK);
		sequential.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.sequential, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(sequential.getSelection())));
			}

		});
		GridData sequentialData = new GridData(GridData.FILL_HORIZONTAL);
		sequentialData.horizontalSpan = 2;
		sequential.setLayoutData(sequentialData);
		EditingUtils.setID(sequential, EsbViewsRepository.InboundEndpoint.Properties.sequential);
		EditingUtils.setEEFtype(sequential, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.sequential, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSequentialCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createCoordinationCheckbox(FormToolkit widgetFactory, Composite parent) {
		coordination = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.coordination, EsbMessages.InboundEndpointPropertiesEditionPart_CoordinationLabel), SWT.CHECK);
		coordination.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.coordination, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(coordination.getSelection())));
			}

		});
		GridData coordinationData = new GridData(GridData.FILL_HORIZONTAL);
		coordinationData.horizontalSpan = 2;
		coordination.setLayoutData(coordinationData);
		EditingUtils.setID(coordination, EsbViewsRepository.InboundEndpoint.Properties.coordination);
		EditingUtils.setEEFtype(coordination, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.coordination, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCoordinationCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFileURIText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFileURILabel);
		transportVFSFileURI = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSFileURI.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSFileURIData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFileURI.setLayoutData(transportVFSFileURIData);
		transportVFSFileURI.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileURI.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSFileURI.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSFileURI.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileURI.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSFileURI, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI);
		EditingUtils.setEEFtype(transportVFSFileURI, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFileURIText

		// End of user code
		return parent;
	}

	
	protected Composite createWso2mbConnectionUrlText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl, EsbMessages.InboundEndpointPropertiesEditionPart_Wso2mbConnectionUrlLabel);
		wso2mbConnectionUrl = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wso2mbConnectionUrl.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wso2mbConnectionUrlData = new GridData(GridData.FILL_HORIZONTAL);
		wso2mbConnectionUrl.setLayoutData(wso2mbConnectionUrlData);
		wso2mbConnectionUrl.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wso2mbConnectionUrl.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wso2mbConnectionUrl.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wso2mbConnectionUrl.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wso2mbConnectionUrl.getText()));
				}
			}
		});
		EditingUtils.setID(wso2mbConnectionUrl, EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl);
		EditingUtils.setEEFtype(wso2mbConnectionUrl, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWso2mbConnectionUrlText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSContentTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSContentTypeLabel);
		transportVFSContentType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSContentType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSContentTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSContentType.setLayoutData(transportVFSContentTypeData);
		transportVFSContentType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSContentType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSContentType.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSContentType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSContentType.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSContentType, EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType);
		EditingUtils.setEEFtype(transportVFSContentType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSContentTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFileNamePatternText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFileNamePatternLabel);
		transportVFSFileNamePattern = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSFileNamePattern.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSFileNamePatternData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFileNamePattern.setLayoutData(transportVFSFileNamePatternData);
		transportVFSFileNamePattern.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileNamePattern.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSFileNamePattern.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSFileNamePattern.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileNamePattern.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSFileNamePattern, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern);
		EditingUtils.setEEFtype(transportVFSFileNamePattern, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFileNamePatternText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFileProcessIntervalText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFileProcessIntervalLabel);
		transportVFSFileProcessInterval = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSFileProcessInterval.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSFileProcessIntervalData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFileProcessInterval.setLayoutData(transportVFSFileProcessIntervalData);
		transportVFSFileProcessInterval.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileProcessInterval.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSFileProcessInterval.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSFileProcessInterval.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileProcessInterval.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSFileProcessInterval, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval);
		EditingUtils.setEEFtype(transportVFSFileProcessInterval, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFileProcessIntervalText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFileProcessCountText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFileProcessCountLabel);
		transportVFSFileProcessCount = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSFileProcessCount.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSFileProcessCountData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFileProcessCount.setLayoutData(transportVFSFileProcessCountData);
		transportVFSFileProcessCount.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileProcessCount.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSFileProcessCount.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSFileProcessCount.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileProcessCount.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSFileProcessCount, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount);
		EditingUtils.setEEFtype(transportVFSFileProcessCount, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFileProcessCountText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSLockingEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSLockingLabel);
		transportVFSLocking = new EMFComboViewer(parent);
		transportVFSLocking.setContentProvider(new ArrayContentProvider());
		transportVFSLocking.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportVFSLockingData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSLocking.getCombo().setLayoutData(transportVFSLockingData);
		transportVFSLocking.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportVFSLocking()));
			}

		});
		transportVFSLocking.setID(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSLockingEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMaxRetryCountText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMaxRetryCountLabel);
		transportVFSMaxRetryCount = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSMaxRetryCount.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSMaxRetryCountData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMaxRetryCount.setLayoutData(transportVFSMaxRetryCountData);
		transportVFSMaxRetryCount.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMaxRetryCount.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSMaxRetryCount.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSMaxRetryCount.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMaxRetryCount.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSMaxRetryCount, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount);
		EditingUtils.setEEFtype(transportVFSMaxRetryCount, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMaxRetryCountText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMoveAfterFailedMoveText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMoveAfterFailedMoveLabel);
		transportVFSMoveAfterFailedMove = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSMoveAfterFailedMove.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSMoveAfterFailedMoveData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMoveAfterFailedMove.setLayoutData(transportVFSMoveAfterFailedMoveData);
		transportVFSMoveAfterFailedMove.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterFailedMove.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSMoveAfterFailedMove.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSMoveAfterFailedMove.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterFailedMove.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSMoveAfterFailedMove, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove);
		EditingUtils.setEEFtype(transportVFSMoveAfterFailedMove, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMoveAfterFailedMoveText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSReconnectTimeoutText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSReconnectTimeoutLabel);
		transportVFSReconnectTimeout = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSReconnectTimeout.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSReconnectTimeoutData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSReconnectTimeout.setLayoutData(transportVFSReconnectTimeoutData);
		transportVFSReconnectTimeout.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSReconnectTimeout.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSReconnectTimeout.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSReconnectTimeout.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSReconnectTimeout.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSReconnectTimeout, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout);
		EditingUtils.setEEFtype(transportVFSReconnectTimeout, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSReconnectTimeoutText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSSharedSubscriptionCheckbox(FormToolkit widgetFactory, Composite parent) {
		transportJMSSharedSubscription = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSSharedSubscriptionLabel), SWT.CHECK);
		transportJMSSharedSubscription.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportJMSSharedSubscription.getSelection())));
			}

		});
		GridData transportJMSSharedSubscriptionData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSSharedSubscriptionData.horizontalSpan = 2;
		transportJMSSharedSubscription.setLayoutData(transportJMSSharedSubscriptionData);
		EditingUtils.setID(transportJMSSharedSubscription, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription);
		EditingUtils.setEEFtype(transportJMSSharedSubscription, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSSharedSubscriptionCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSSubscriptionNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSSubscriptionNameLabel);
		transportJMSSubscriptionName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSSubscriptionName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSSubscriptionNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSSubscriptionName.setLayoutData(transportJMSSubscriptionNameData);
		transportJMSSubscriptionName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSSubscriptionName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSSubscriptionName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSSubscriptionName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSSubscriptionName.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSSubscriptionName, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName);
		EditingUtils.setEEFtype(transportJMSSubscriptionName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSSubscriptionNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSPinnedServersText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSPinnedServersLabel);
		transportJMSPinnedServers = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSPinnedServers.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSPinnedServersData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSPinnedServers.setLayoutData(transportJMSPinnedServersData);
		transportJMSPinnedServers.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPinnedServers.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSPinnedServers.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSPinnedServers.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPinnedServers.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSPinnedServers, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers);
		EditingUtils.setEEFtype(transportJMSPinnedServers, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSPinnedServersText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSActionAfterProcessEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSActionAfterProcessLabel);
		transportVFSActionAfterProcess = new EMFComboViewer(parent);
		transportVFSActionAfterProcess.setContentProvider(new ArrayContentProvider());
		transportVFSActionAfterProcess.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportVFSActionAfterProcessData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSActionAfterProcess.getCombo().setLayoutData(transportVFSActionAfterProcessData);
		transportVFSActionAfterProcess.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportVFSActionAfterProcess()));
			}

		});
		transportVFSActionAfterProcess.setID(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSActionAfterProcessEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMoveAfterProcessText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMoveAfterProcessLabel);
		transportVFSMoveAfterProcess = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSMoveAfterProcess.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSMoveAfterProcessData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMoveAfterProcess.setLayoutData(transportVFSMoveAfterProcessData);
		transportVFSMoveAfterProcess.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterProcess.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSMoveAfterProcess.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSMoveAfterProcess.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterProcess.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSMoveAfterProcess, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess);
		EditingUtils.setEEFtype(transportVFSMoveAfterProcess, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMoveAfterProcessText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSActionAfterErrorsEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSActionAfterErrorsLabel);
		transportVFSActionAfterErrors = new EMFComboViewer(parent);
		transportVFSActionAfterErrors.setContentProvider(new ArrayContentProvider());
		transportVFSActionAfterErrors.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportVFSActionAfterErrorsData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSActionAfterErrors.getCombo().setLayoutData(transportVFSActionAfterErrorsData);
		transportVFSActionAfterErrors.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportVFSActionAfterErrors()));
			}

		});
		transportVFSActionAfterErrors.setID(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSActionAfterErrorsEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMoveAfterErrorsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMoveAfterErrorsLabel);
		transportVFSMoveAfterErrors = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSMoveAfterErrors.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSMoveAfterErrorsData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMoveAfterErrors.setLayoutData(transportVFSMoveAfterErrorsData);
		transportVFSMoveAfterErrors.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterErrors.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSMoveAfterErrors.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSMoveAfterErrors.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterErrors.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSMoveAfterErrors, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors);
		EditingUtils.setEEFtype(transportVFSMoveAfterErrors, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMoveAfterErrorsText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFailedRecordsFileNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFailedRecordsFileNameLabel);
		transportVFSFailedRecordsFileName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSFailedRecordsFileName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSFailedRecordsFileNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFailedRecordsFileName.setLayoutData(transportVFSFailedRecordsFileNameData);
		transportVFSFailedRecordsFileName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFailedRecordsFileName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSFailedRecordsFileName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSFailedRecordsFileName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFailedRecordsFileName.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSFailedRecordsFileName, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName);
		EditingUtils.setEEFtype(transportVFSFailedRecordsFileName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFailedRecordsFileNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFailedRecordsFileDestinationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFailedRecordsFileDestinationLabel);
		transportVFSFailedRecordsFileDestination = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSFailedRecordsFileDestination.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSFailedRecordsFileDestinationData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFailedRecordsFileDestination.setLayoutData(transportVFSFailedRecordsFileDestinationData);
		transportVFSFailedRecordsFileDestination.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFailedRecordsFileDestination.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSFailedRecordsFileDestination.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSFailedRecordsFileDestination.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFailedRecordsFileDestination.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSFailedRecordsFileDestination, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination);
		EditingUtils.setEEFtype(transportVFSFailedRecordsFileDestination, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFailedRecordsFileDestinationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMoveFailedRecordTimestampFormatText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMoveFailedRecordTimestampFormatLabel);
		transportVFSMoveFailedRecordTimestampFormat = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSMoveFailedRecordTimestampFormat.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSMoveFailedRecordTimestampFormatData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMoveFailedRecordTimestampFormat.setLayoutData(transportVFSMoveFailedRecordTimestampFormatData);
		transportVFSMoveFailedRecordTimestampFormat.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveFailedRecordTimestampFormat.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSMoveFailedRecordTimestampFormat.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSMoveFailedRecordTimestampFormat.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveFailedRecordTimestampFormat.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSMoveFailedRecordTimestampFormat, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat);
		EditingUtils.setEEFtype(transportVFSMoveFailedRecordTimestampFormat, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMoveFailedRecordTimestampFormatText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFailedRecordNextRetryDurationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFailedRecordNextRetryDurationLabel);
		transportVFSFailedRecordNextRetryDuration = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSFailedRecordNextRetryDuration.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSFailedRecordNextRetryDurationData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFailedRecordNextRetryDuration.setLayoutData(transportVFSFailedRecordNextRetryDurationData);
		transportVFSFailedRecordNextRetryDuration.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFailedRecordNextRetryDuration.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSFailedRecordNextRetryDuration.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSFailedRecordNextRetryDuration.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFailedRecordNextRetryDuration.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSFailedRecordNextRetryDuration, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration);
		EditingUtils.setEEFtype(transportVFSFailedRecordNextRetryDuration, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFailedRecordNextRetryDurationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSActionAfterFailureEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSActionAfterFailureLabel);
		transportVFSActionAfterFailure = new EMFComboViewer(parent);
		transportVFSActionAfterFailure.setContentProvider(new ArrayContentProvider());
		transportVFSActionAfterFailure.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportVFSActionAfterFailureData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSActionAfterFailure.getCombo().setLayoutData(transportVFSActionAfterFailureData);
		transportVFSActionAfterFailure.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportVFSActionAfterFailure()));
			}

		});
		transportVFSActionAfterFailure.setID(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSActionAfterFailureEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMoveAfterFailureText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMoveAfterFailureLabel);
		transportVFSMoveAfterFailure = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSMoveAfterFailure.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSMoveAfterFailureData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMoveAfterFailure.setLayoutData(transportVFSMoveAfterFailureData);
		transportVFSMoveAfterFailure.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterFailure.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSMoveAfterFailure.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSMoveAfterFailure.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterFailure.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSMoveAfterFailure, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure);
		EditingUtils.setEEFtype(transportVFSMoveAfterFailure, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMoveAfterFailureText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSReplyFileURIText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSReplyFileURILabel);
		transportVFSReplyFileURI = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSReplyFileURI.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSReplyFileURIData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSReplyFileURI.setLayoutData(transportVFSReplyFileURIData);
		transportVFSReplyFileURI.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSReplyFileURI.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSReplyFileURI.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSReplyFileURI.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSReplyFileURI.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSReplyFileURI, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI);
		EditingUtils.setEEFtype(transportVFSReplyFileURI, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSReplyFileURIText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSReplyFileNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSReplyFileNameLabel);
		transportVFSReplyFileName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSReplyFileName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSReplyFileNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSReplyFileName.setLayoutData(transportVFSReplyFileNameData);
		transportVFSReplyFileName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSReplyFileName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSReplyFileName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSReplyFileName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSReplyFileName.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSReplyFileName, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName);
		EditingUtils.setEEFtype(transportVFSReplyFileName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSReplyFileNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSAutoLockReleaseCheckbox(FormToolkit widgetFactory, Composite parent) {
		transportVFSAutoLockRelease = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSAutoLockReleaseLabel), SWT.CHECK);
		transportVFSAutoLockRelease.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSAutoLockRelease.getSelection())));
			}

		});
		GridData transportVFSAutoLockReleaseData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSAutoLockReleaseData.horizontalSpan = 2;
		transportVFSAutoLockRelease.setLayoutData(transportVFSAutoLockReleaseData);
		EditingUtils.setID(transportVFSAutoLockRelease, EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease);
		EditingUtils.setEEFtype(transportVFSAutoLockRelease, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSAutoLockReleaseCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSAutoLockReleaseIntervalText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSAutoLockReleaseIntervalLabel);
		transportVFSAutoLockReleaseInterval = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSAutoLockReleaseInterval.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSAutoLockReleaseIntervalData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSAutoLockReleaseInterval.setLayoutData(transportVFSAutoLockReleaseIntervalData);
		transportVFSAutoLockReleaseInterval.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSAutoLockReleaseInterval.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSAutoLockReleaseInterval.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSAutoLockReleaseInterval.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSAutoLockReleaseInterval.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSAutoLockReleaseInterval, EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval);
		EditingUtils.setEEFtype(transportVFSAutoLockReleaseInterval, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSAutoLockReleaseIntervalText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSLockReleaseSameNodeCheckbox(FormToolkit widgetFactory, Composite parent) {
		transportVFSLockReleaseSameNode = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSLockReleaseSameNodeLabel), SWT.CHECK);
		transportVFSLockReleaseSameNode.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSLockReleaseSameNode.getSelection())));
			}

		});
		GridData transportVFSLockReleaseSameNodeData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSLockReleaseSameNodeData.horizontalSpan = 2;
		transportVFSLockReleaseSameNode.setLayoutData(transportVFSLockReleaseSameNodeData);
		EditingUtils.setID(transportVFSLockReleaseSameNode, EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode);
		EditingUtils.setEEFtype(transportVFSLockReleaseSameNode, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSLockReleaseSameNodeCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSDistributedLockCheckbox(FormToolkit widgetFactory, Composite parent) {
		transportVFSDistributedLock = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSDistributedLockLabel), SWT.CHECK);
		transportVFSDistributedLock.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSDistributedLock.getSelection())));
			}

		});
		GridData transportVFSDistributedLockData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSDistributedLockData.horizontalSpan = 2;
		transportVFSDistributedLock.setLayoutData(transportVFSDistributedLockData);
		EditingUtils.setID(transportVFSDistributedLock, EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock);
		EditingUtils.setEEFtype(transportVFSDistributedLock, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSDistributedLockCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSStreamingCheckbox(FormToolkit widgetFactory, Composite parent) {
		transportVFSStreaming = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSStreamingLabel), SWT.CHECK);
		transportVFSStreaming.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSStreaming.getSelection())));
			}

		});
		GridData transportVFSStreamingData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSStreamingData.horizontalSpan = 2;
		transportVFSStreaming.setLayoutData(transportVFSStreamingData);
		EditingUtils.setID(transportVFSStreaming, EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming);
		EditingUtils.setEEFtype(transportVFSStreaming, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSStreamingCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSBuildCheckbox(FormToolkit widgetFactory, Composite parent) {
		transportVFSBuild = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSBuildLabel), SWT.CHECK);
		transportVFSBuild.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSBuild.getSelection())));
			}

		});
		GridData transportVFSBuildData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSBuildData.horizontalSpan = 2;
		transportVFSBuild.setLayoutData(transportVFSBuildData);
		EditingUtils.setID(transportVFSBuild, EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild);
		EditingUtils.setEEFtype(transportVFSBuild, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSBuildCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSDistributedTimeoutText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSDistributedTimeoutLabel);
		transportVFSDistributedTimeout = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSDistributedTimeout.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSDistributedTimeoutData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSDistributedTimeout.setLayoutData(transportVFSDistributedTimeoutData);
		transportVFSDistributedTimeout.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSDistributedTimeout.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSDistributedTimeout.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSDistributedTimeout.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSDistributedTimeout.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSDistributedTimeout, EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout);
		EditingUtils.setEEFtype(transportVFSDistributedTimeout, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSDistributedTimeoutText

		// End of user code
		return parent;
	}

	
	protected Composite createJavaNamingFactoryInitialText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial, EsbMessages.InboundEndpointPropertiesEditionPart_JavaNamingFactoryInitialLabel);
		javaNamingFactoryInitial = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		javaNamingFactoryInitial.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData javaNamingFactoryInitialData = new GridData(GridData.FILL_HORIZONTAL);
		javaNamingFactoryInitial.setLayoutData(javaNamingFactoryInitialData);
		javaNamingFactoryInitial.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, javaNamingFactoryInitial.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, javaNamingFactoryInitial.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		javaNamingFactoryInitial.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, javaNamingFactoryInitial.getText()));
				}
			}
		});
		EditingUtils.setID(javaNamingFactoryInitial, EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial);
		EditingUtils.setEEFtype(javaNamingFactoryInitial, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createJavaNamingFactoryInitialText

		// End of user code
		return parent;
	}

	
	protected Composite createJavaNamingProviderUrlText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl, EsbMessages.InboundEndpointPropertiesEditionPart_JavaNamingProviderUrlLabel);
		javaNamingProviderUrl = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		javaNamingProviderUrl.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData javaNamingProviderUrlData = new GridData(GridData.FILL_HORIZONTAL);
		javaNamingProviderUrl.setLayoutData(javaNamingProviderUrlData);
		javaNamingProviderUrl.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, javaNamingProviderUrl.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, javaNamingProviderUrl.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		javaNamingProviderUrl.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, javaNamingProviderUrl.getText()));
				}
			}
		});
		EditingUtils.setID(javaNamingProviderUrl, EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl);
		EditingUtils.setEEFtype(javaNamingProviderUrl, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createJavaNamingProviderUrlText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSConnectionFactoryJNDINameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSConnectionFactoryJNDINameLabel);
		transportJMSConnectionFactoryJNDIName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSConnectionFactoryJNDIName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSConnectionFactoryJNDINameData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSConnectionFactoryJNDIName.setLayoutData(transportJMSConnectionFactoryJNDINameData);
		transportJMSConnectionFactoryJNDIName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSConnectionFactoryJNDIName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSConnectionFactoryJNDIName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSConnectionFactoryJNDIName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSConnectionFactoryJNDIName.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSConnectionFactoryJNDIName, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName);
		EditingUtils.setEEFtype(transportJMSConnectionFactoryJNDIName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSConnectionFactoryJNDINameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSConnectionFactoryTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSConnectionFactoryTypeLabel);
		transportJMSConnectionFactoryType = new EMFComboViewer(parent);
		transportJMSConnectionFactoryType.setContentProvider(new ArrayContentProvider());
		transportJMSConnectionFactoryType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportJMSConnectionFactoryTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSConnectionFactoryType.getCombo().setLayoutData(transportJMSConnectionFactoryTypeData);
		transportJMSConnectionFactoryType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportJMSConnectionFactoryType()));
			}

		});
		transportJMSConnectionFactoryType.setID(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSConnectionFactoryTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSConcurrentConsumersText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSConcurrentConsumersLabel);
		transportJMSConcurrentConsumers = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSConcurrentConsumers.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSConcurrentConsumersData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSConcurrentConsumers.setLayoutData(transportJMSConcurrentConsumersData);
		transportJMSConcurrentConsumers.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSConcurrentConsumers.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSConcurrentConsumers.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSConcurrentConsumers.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSConcurrentConsumers.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSConcurrentConsumers, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers);
		EditingUtils.setEEFtype(transportJMSConcurrentConsumers, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSConcurrentConsumersText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSDestinationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSDestinationLabel);
		transportJMSDestination = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSDestination.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSDestinationData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSDestination.setLayoutData(transportJMSDestinationData);
		transportJMSDestination.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDestination.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSDestination.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSDestination.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDestination.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSDestination, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination);
		EditingUtils.setEEFtype(transportJMSDestination, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSDestinationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSSessionTransactedCheckbox(FormToolkit widgetFactory, Composite parent) {
		transportJMSSessionTransacted = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSSessionTransactedLabel), SWT.CHECK);
		transportJMSSessionTransacted.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportJMSSessionTransacted.getSelection())));
			}

		});
		GridData transportJMSSessionTransactedData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSSessionTransactedData.horizontalSpan = 2;
		transportJMSSessionTransacted.setLayoutData(transportJMSSessionTransactedData);
		EditingUtils.setID(transportJMSSessionTransacted, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted);
		EditingUtils.setEEFtype(transportJMSSessionTransacted, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSSessionTransactedCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSSessionAcknowledgementEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSSessionAcknowledgementLabel);
		transportJMSSessionAcknowledgement = new EMFComboViewer(parent);
		transportJMSSessionAcknowledgement.setContentProvider(new ArrayContentProvider());
		transportJMSSessionAcknowledgement.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportJMSSessionAcknowledgementData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSSessionAcknowledgement.getCombo().setLayoutData(transportJMSSessionAcknowledgementData);
		transportJMSSessionAcknowledgement.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportJMSSessionAcknowledgement()));
			}

		});
		transportJMSSessionAcknowledgement.setID(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSSessionAcknowledgementEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSCacheLevelEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSCacheLevelLabel);
		transportJMSCacheLevel = new EMFComboViewer(parent);
		transportJMSCacheLevel.setContentProvider(new ArrayContentProvider());
		transportJMSCacheLevel.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportJMSCacheLevelData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSCacheLevel.getCombo().setLayoutData(transportJMSCacheLevelData);
		transportJMSCacheLevel.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportJMSCacheLevel()));
			}

		});
		transportJMSCacheLevel.setID(EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSCacheLevelEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSUserNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSUserNameLabel);
		transportJMSUserName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSUserName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSUserNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSUserName.setLayoutData(transportJMSUserNameData);
		transportJMSUserName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSUserName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSUserName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSUserName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSUserName.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSUserName, EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName);
		EditingUtils.setEEFtype(transportJMSUserName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSUserNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSPasswordText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSPasswordLabel);
		transportJMSPassword = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSPassword.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSPasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSPassword.setLayoutData(transportJMSPasswordData);
		transportJMSPassword.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPassword.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSPassword.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSPassword.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPassword.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSPassword, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword);
		EditingUtils.setEEFtype(transportJMSPassword, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSPasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSJMSSpecVersionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSJMSSpecVersionLabel);
		transportJMSJMSSpecVersion = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSJMSSpecVersion.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSJMSSpecVersionData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSJMSSpecVersion.setLayoutData(transportJMSJMSSpecVersionData);
		transportJMSJMSSpecVersion.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSJMSSpecVersion.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSJMSSpecVersion.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSJMSSpecVersion.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSJMSSpecVersion.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSJMSSpecVersion, EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion);
		EditingUtils.setEEFtype(transportJMSJMSSpecVersion, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSJMSSpecVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSSubscriptionDurableText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSSubscriptionDurableLabel);
		transportJMSSubscriptionDurable = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSSubscriptionDurable.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSSubscriptionDurableData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSSubscriptionDurable.setLayoutData(transportJMSSubscriptionDurableData);
		transportJMSSubscriptionDurable.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSSubscriptionDurable.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSSubscriptionDurable.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSSubscriptionDurable.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSSubscriptionDurable.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSSubscriptionDurable, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable);
		EditingUtils.setEEFtype(transportJMSSubscriptionDurable, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSSubscriptionDurableText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSDurableSubscriberClientIDText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSDurableSubscriberClientIDLabel);
		transportJMSDurableSubscriberClientID = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSDurableSubscriberClientID.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSDurableSubscriberClientIDData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSDurableSubscriberClientID.setLayoutData(transportJMSDurableSubscriberClientIDData);
		transportJMSDurableSubscriberClientID.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDurableSubscriberClientID.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSDurableSubscriberClientID.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSDurableSubscriberClientID.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDurableSubscriberClientID.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSDurableSubscriberClientID, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID);
		EditingUtils.setEEFtype(transportJMSDurableSubscriberClientID, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSDurableSubscriberClientIDText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSMessageSelectorText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSMessageSelectorLabel);
		transportJMSMessageSelector = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSMessageSelector.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSMessageSelectorData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSMessageSelector.setLayoutData(transportJMSMessageSelectorData);
		transportJMSMessageSelector.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSMessageSelector.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSMessageSelector.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSMessageSelector.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSMessageSelector.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSMessageSelector, EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector);
		EditingUtils.setEEFtype(transportJMSMessageSelector, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSMessageSelectorText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSRetryDurationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSRetryDurationLabel);
		transportJMSRetryDuration = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSRetryDuration.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSRetryDurationData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSRetryDuration.setLayoutData(transportJMSRetryDurationData);
		transportJMSRetryDuration.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSRetryDuration.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSRetryDuration.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSRetryDuration.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSRetryDuration.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSRetryDuration, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration);
		EditingUtils.setEEFtype(transportJMSRetryDuration, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSRetryDurationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMoveTimestampFormatText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMoveTimestampFormatLabel);
		transportVFSMoveTimestampFormat = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSMoveTimestampFormat.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSMoveTimestampFormatData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMoveTimestampFormat.setLayoutData(transportVFSMoveTimestampFormatData);
		transportVFSMoveTimestampFormat.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveTimestampFormat.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSMoveTimestampFormat.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSMoveTimestampFormat.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveTimestampFormat.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSMoveTimestampFormat, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat);
		EditingUtils.setEEFtype(transportVFSMoveTimestampFormat, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMoveTimestampFormatText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFileSortAttributeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFileSortAttributeLabel);
		transportVFSFileSortAttribute = new EMFComboViewer(parent);
		transportVFSFileSortAttribute.setContentProvider(new ArrayContentProvider());
		transportVFSFileSortAttribute.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportVFSFileSortAttributeData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFileSortAttribute.getCombo().setLayoutData(transportVFSFileSortAttributeData);
		transportVFSFileSortAttribute.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportVFSFileSortAttribute()));
			}

		});
		transportVFSFileSortAttribute.setID(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFileSortAttributeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFileSortAscendingCheckbox(FormToolkit widgetFactory, Composite parent) {
		transportVFSFileSortAscending = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFileSortAscendingLabel), SWT.CHECK);
		transportVFSFileSortAscending.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSFileSortAscending.getSelection())));
			}

		});
		GridData transportVFSFileSortAscendingData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFileSortAscendingData.horizontalSpan = 2;
		transportVFSFileSortAscending.setLayoutData(transportVFSFileSortAscendingData);
		EditingUtils.setID(transportVFSFileSortAscending, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending);
		EditingUtils.setEEFtype(transportVFSFileSortAscending, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFileSortAscendingCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSSubFolderTimestampFormatText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSSubFolderTimestampFormatLabel);
		transportVFSSubFolderTimestampFormat = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportVFSSubFolderTimestampFormat.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportVFSSubFolderTimestampFormatData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSSubFolderTimestampFormat.setLayoutData(transportVFSSubFolderTimestampFormatData);
		transportVFSSubFolderTimestampFormat.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSSubFolderTimestampFormat.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportVFSSubFolderTimestampFormat.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportVFSSubFolderTimestampFormat.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSSubFolderTimestampFormat.getText()));
				}
			}
		});
		EditingUtils.setID(transportVFSSubFolderTimestampFormat, EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat);
		EditingUtils.setEEFtype(transportVFSSubFolderTimestampFormat, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSSubFolderTimestampFormatText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSCreateFolderCheckbox(FormToolkit widgetFactory, Composite parent) {
		transportVFSCreateFolder = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSCreateFolderLabel), SWT.CHECK);
		transportVFSCreateFolder.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSCreateFolder.getSelection())));
			}

		});
		GridData transportVFSCreateFolderData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSCreateFolderData.horizontalSpan = 2;
		transportVFSCreateFolder.setLayoutData(transportVFSCreateFolderData);
		EditingUtils.setID(transportVFSCreateFolder, EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder);
		EditingUtils.setEEFtype(transportVFSCreateFolder, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSCreateFolderCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSReceiveTimeoutText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSReceiveTimeoutLabel);
		transportJMSReceiveTimeout = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSReceiveTimeout.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSReceiveTimeoutData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSReceiveTimeout.setLayoutData(transportJMSReceiveTimeoutData);
		transportJMSReceiveTimeout.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSReceiveTimeout.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSReceiveTimeout.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSReceiveTimeout.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSReceiveTimeout.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSReceiveTimeout, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout);
		EditingUtils.setEEFtype(transportJMSReceiveTimeout, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSReceiveTimeoutText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSContentTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSContentTypeLabel);
		transportJMSContentType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSContentType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSContentTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSContentType.setLayoutData(transportJMSContentTypeData);
		transportJMSContentType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSContentType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSContentType.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSContentType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSContentType.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSContentType, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType);
		EditingUtils.setEEFtype(transportJMSContentType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSContentTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSContentTypePropertyText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSContentTypePropertyLabel);
		transportJMSContentTypeProperty = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSContentTypeProperty.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSContentTypePropertyData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSContentTypeProperty.setLayoutData(transportJMSContentTypePropertyData);
		transportJMSContentTypeProperty.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSContentTypeProperty.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSContentTypeProperty.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSContentTypeProperty.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSContentTypeProperty.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSContentTypeProperty, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty);
		EditingUtils.setEEFtype(transportJMSContentTypeProperty, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSContentTypePropertyText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSReplyDestinationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSReplyDestinationLabel);
		transportJMSReplyDestination = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSReplyDestination.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSReplyDestinationData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSReplyDestination.setLayoutData(transportJMSReplyDestinationData);
		transportJMSReplyDestination.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSReplyDestination.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSReplyDestination.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSReplyDestination.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSReplyDestination.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSReplyDestination, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination);
		EditingUtils.setEEFtype(transportJMSReplyDestination, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSReplyDestinationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSPubSubNoLocalText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSPubSubNoLocalLabel);
		transportJMSPubSubNoLocal = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSPubSubNoLocal.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSPubSubNoLocalData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSPubSubNoLocal.setLayoutData(transportJMSPubSubNoLocalData);
		transportJMSPubSubNoLocal.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPubSubNoLocal.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSPubSubNoLocal.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSPubSubNoLocal.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPubSubNoLocal.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSPubSubNoLocal, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal);
		EditingUtils.setEEFtype(transportJMSPubSubNoLocal, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSPubSubNoLocalText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSDurableSubscriberNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSDurableSubscriberNameLabel);
		transportJMSDurableSubscriberName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSDurableSubscriberName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSDurableSubscriberNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSDurableSubscriberName.setLayoutData(transportJMSDurableSubscriberNameData);
		transportJMSDurableSubscriberName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDurableSubscriberName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSDurableSubscriberName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSDurableSubscriberName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDurableSubscriberName.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSDurableSubscriberName, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName);
		EditingUtils.setEEFtype(transportJMSDurableSubscriberName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSDurableSubscriberNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSBrokerTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSBrokerTypeLabel);
		transportJMSBrokerType = new EMFComboViewer(parent);
		transportJMSBrokerType.setContentProvider(new ArrayContentProvider());
		transportJMSBrokerType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportJMSBrokerTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSBrokerType.getCombo().setLayoutData(transportJMSBrokerTypeData);
		transportJMSBrokerType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportJMSBrokerType()));
			}

		});
		transportJMSBrokerType.setID(EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSBrokerTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTConnectionFactoryText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTConnectionFactoryLabel);
		transportMQTTConnectionFactory = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTConnectionFactory.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTConnectionFactoryData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTConnectionFactory.setLayoutData(transportMQTTConnectionFactoryData);
		transportMQTTConnectionFactory.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTConnectionFactory.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTConnectionFactory.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTConnectionFactory.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTConnectionFactory.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTConnectionFactory, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory);
		EditingUtils.setEEFtype(transportMQTTConnectionFactory, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTConnectionFactoryText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTServerHostNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTServerHostNameLabel);
		transportMQTTServerHostName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTServerHostName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTServerHostNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTServerHostName.setLayoutData(transportMQTTServerHostNameData);
		transportMQTTServerHostName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTServerHostName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTServerHostName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTServerHostName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTServerHostName.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTServerHostName, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName);
		EditingUtils.setEEFtype(transportMQTTServerHostName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTServerHostNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTServerPortText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTServerPortLabel);
		transportMQTTServerPort = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTServerPort.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTServerPortData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTServerPort.setLayoutData(transportMQTTServerPortData);
		transportMQTTServerPort.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTServerPort.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTServerPort.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTServerPort.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTServerPort.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTServerPort, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort);
		EditingUtils.setEEFtype(transportMQTTServerPort, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTServerPortText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTTopicNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTTopicNameLabel);
		transportMQTTTopicName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTTopicName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTTopicNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTTopicName.setLayoutData(transportMQTTTopicNameData);
		transportMQTTTopicName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTTopicName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTTopicName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTTopicName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTTopicName.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTTopicName, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName);
		EditingUtils.setEEFtype(transportMQTTTopicName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTTopicNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSubscriptionQOSEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSubscriptionQOSLabel);
		transportMQTTSubscriptionQOS = new EMFComboViewer(parent);
		transportMQTTSubscriptionQOS.setContentProvider(new ArrayContentProvider());
		transportMQTTSubscriptionQOS.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportMQTTSubscriptionQOSData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSubscriptionQOS.getCombo().setLayoutData(transportMQTTSubscriptionQOSData);
		transportMQTTSubscriptionQOS.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportMQTTSubscriptionQOS()));
			}

		});
		transportMQTTSubscriptionQOS.setID(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSubscriptionQOSEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSessionCleanCheckbox(FormToolkit widgetFactory, Composite parent) {
		transportMQTTSessionClean = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSessionCleanLabel), SWT.CHECK);
		transportMQTTSessionClean.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportMQTTSessionClean.getSelection())));
			}

		});
		GridData transportMQTTSessionCleanData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSessionCleanData.horizontalSpan = 2;
		transportMQTTSessionClean.setLayoutData(transportMQTTSessionCleanData);
		EditingUtils.setID(transportMQTTSessionClean, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean);
		EditingUtils.setEEFtype(transportMQTTSessionClean, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSessionCleanCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslEnableText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslEnableLabel);
		transportMQTTSslEnable = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTSslEnable.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTSslEnableData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslEnable.setLayoutData(transportMQTTSslEnableData);
		transportMQTTSslEnable.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslEnable.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTSslEnable.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTSslEnable.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslEnable.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTSslEnable, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable);
		EditingUtils.setEEFtype(transportMQTTSslEnable, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslEnableText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTTemporaryStoreDirectoryText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTTemporaryStoreDirectoryLabel);
		transportMQTTTemporaryStoreDirectory = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTTemporaryStoreDirectory.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTTemporaryStoreDirectoryData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTTemporaryStoreDirectory.setLayoutData(transportMQTTTemporaryStoreDirectoryData);
		transportMQTTTemporaryStoreDirectory.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTTemporaryStoreDirectory.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTTemporaryStoreDirectory.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTTemporaryStoreDirectory.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTTemporaryStoreDirectory.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTTemporaryStoreDirectory, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory);
		EditingUtils.setEEFtype(transportMQTTTemporaryStoreDirectory, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTTemporaryStoreDirectoryText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSubscriptionUsernameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSubscriptionUsernameLabel);
		transportMQTTSubscriptionUsername = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTSubscriptionUsername.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTSubscriptionUsernameData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSubscriptionUsername.setLayoutData(transportMQTTSubscriptionUsernameData);
		transportMQTTSubscriptionUsername.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSubscriptionUsername.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTSubscriptionUsername.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTSubscriptionUsername.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSubscriptionUsername.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTSubscriptionUsername, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername);
		EditingUtils.setEEFtype(transportMQTTSubscriptionUsername, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSubscriptionUsernameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSubscriptionPasswordText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSubscriptionPasswordLabel);
		transportMQTTSubscriptionPassword = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTSubscriptionPassword.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTSubscriptionPasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSubscriptionPassword.setLayoutData(transportMQTTSubscriptionPasswordData);
		transportMQTTSubscriptionPassword.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSubscriptionPassword.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTSubscriptionPassword.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTSubscriptionPassword.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSubscriptionPassword.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTSubscriptionPassword, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword);
		EditingUtils.setEEFtype(transportMQTTSubscriptionPassword, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSubscriptionPasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTClientIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTClientIdLabel);
		transportMQTTClientId = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTClientId.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTClientIdData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTClientId.setLayoutData(transportMQTTClientIdData);
		transportMQTTClientId.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTClientId.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTClientId.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTClientId.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTClientId.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTClientId, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId);
		EditingUtils.setEEFtype(transportMQTTClientId, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTClientIdText

		// End of user code
		return parent;
	}

	
	protected Composite createTruststoreText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.truststore, EsbMessages.InboundEndpointPropertiesEditionPart_TruststoreLabel);
		truststore = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		truststore.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData truststoreData = new GridData(GridData.FILL_HORIZONTAL);
		truststore.setLayoutData(truststoreData);
		truststore.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.truststore,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, truststore.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.truststore,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, truststore.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		truststore.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.truststore, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, truststore.getText()));
				}
			}
		});
		EditingUtils.setID(truststore, EsbViewsRepository.InboundEndpoint.Properties.truststore);
		EditingUtils.setEEFtype(truststore, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.truststore, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTruststoreText

		// End of user code
		return parent;
	}

	
	protected Composite createKeystoreText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.keystore, EsbMessages.InboundEndpointPropertiesEditionPart_KeystoreLabel);
		keystore = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		keystore.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData keystoreData = new GridData(GridData.FILL_HORIZONTAL);
		keystore.setLayoutData(keystoreData);
		keystore.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.keystore,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, keystore.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.keystore,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, keystore.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		keystore.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.keystore, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, keystore.getText()));
				}
			}
		});
		EditingUtils.setID(keystore, EsbViewsRepository.InboundEndpoint.Properties.keystore);
		EditingUtils.setEEFtype(keystore, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.keystore, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createKeystoreText

		// End of user code
		return parent;
	}

	
	protected Composite createSslVerifyClientText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient, EsbMessages.InboundEndpointPropertiesEditionPart_SslVerifyClientLabel);
		sslVerifyClient = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		sslVerifyClient.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData sslVerifyClientData = new GridData(GridData.FILL_HORIZONTAL);
		sslVerifyClient.setLayoutData(sslVerifyClientData);
		sslVerifyClient.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sslVerifyClient.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, sslVerifyClient.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		sslVerifyClient.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sslVerifyClient.getText()));
				}
			}
		});
		EditingUtils.setID(sslVerifyClient, EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient);
		EditingUtils.setEEFtype(sslVerifyClient, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSslVerifyClientText

		// End of user code
		return parent;
	}

	
	protected Composite createSslProtocolText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.sslProtocol, EsbMessages.InboundEndpointPropertiesEditionPart_SslProtocolLabel);
		sslProtocol = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		sslProtocol.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData sslProtocolData = new GridData(GridData.FILL_HORIZONTAL);
		sslProtocol.setLayoutData(sslProtocolData);
		sslProtocol.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.sslProtocol,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sslProtocol.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.sslProtocol,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, sslProtocol.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		sslProtocol.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.sslProtocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sslProtocol.getText()));
				}
			}
		});
		EditingUtils.setID(sslProtocol, EsbViewsRepository.InboundEndpoint.Properties.sslProtocol);
		EditingUtils.setEEFtype(sslProtocol, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.sslProtocol, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSslProtocolText

		// End of user code
		return parent;
	}

	
	protected Composite createHttpsProtocolsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols, EsbMessages.InboundEndpointPropertiesEditionPart_HttpsProtocolsLabel);
		httpsProtocols = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		httpsProtocols.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData httpsProtocolsData = new GridData(GridData.FILL_HORIZONTAL);
		httpsProtocols.setLayoutData(httpsProtocolsData);
		httpsProtocols.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, httpsProtocols.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, httpsProtocols.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		httpsProtocols.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, httpsProtocols.getText()));
				}
			}
		});
		EditingUtils.setID(httpsProtocols, EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols);
		EditingUtils.setEEFtype(httpsProtocols, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createHttpsProtocolsText

		// End of user code
		return parent;
	}

	
	protected Composite createCertificateRevocationVerifierText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier, EsbMessages.InboundEndpointPropertiesEditionPart_CertificateRevocationVerifierLabel);
		certificateRevocationVerifier = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		certificateRevocationVerifier.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData certificateRevocationVerifierData = new GridData(GridData.FILL_HORIZONTAL);
		certificateRevocationVerifier.setLayoutData(certificateRevocationVerifierData);
		certificateRevocationVerifier.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, certificateRevocationVerifier.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, certificateRevocationVerifier.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		certificateRevocationVerifier.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, certificateRevocationVerifier.getText()));
				}
			}
		});
		EditingUtils.setID(certificateRevocationVerifier, EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier);
		EditingUtils.setEEFtype(certificateRevocationVerifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCertificateRevocationVerifierText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7PortText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7PortLabel);
		inboundHL7Port = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundHL7Port.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundHL7PortData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7Port.setLayoutData(inboundHL7PortData);
		inboundHL7Port.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7Port.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundHL7Port.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundHL7Port.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7Port.getText()));
				}
			}
		});
		EditingUtils.setID(inboundHL7Port, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port);
		EditingUtils.setEEFtype(inboundHL7Port, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7PortText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7AutoAckCheckbox(FormToolkit widgetFactory, Composite parent) {
		inboundHL7AutoAck = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7AutoAckLabel), SWT.CHECK);
		inboundHL7AutoAck.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(inboundHL7AutoAck.getSelection())));
			}

		});
		GridData inboundHL7AutoAckData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7AutoAckData.horizontalSpan = 2;
		inboundHL7AutoAck.setLayoutData(inboundHL7AutoAckData);
		EditingUtils.setID(inboundHL7AutoAck, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck);
		EditingUtils.setEEFtype(inboundHL7AutoAck, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7AutoAckCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7MessagePreProcessorText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7MessagePreProcessorLabel);
		inboundHL7MessagePreProcessor = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundHL7MessagePreProcessor.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundHL7MessagePreProcessorData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7MessagePreProcessor.setLayoutData(inboundHL7MessagePreProcessorData);
		inboundHL7MessagePreProcessor.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7MessagePreProcessor.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundHL7MessagePreProcessor.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundHL7MessagePreProcessor.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7MessagePreProcessor.getText()));
				}
			}
		});
		EditingUtils.setID(inboundHL7MessagePreProcessor, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor);
		EditingUtils.setEEFtype(inboundHL7MessagePreProcessor, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7MessagePreProcessorText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7CharSetText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7CharSetLabel);
		inboundHL7CharSet = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundHL7CharSet.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundHL7CharSetData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7CharSet.setLayoutData(inboundHL7CharSetData);
		inboundHL7CharSet.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7CharSet.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundHL7CharSet.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundHL7CharSet.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7CharSet.getText()));
				}
			}
		});
		EditingUtils.setID(inboundHL7CharSet, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet);
		EditingUtils.setEEFtype(inboundHL7CharSet, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7CharSetText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7TimeOutText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7TimeOutLabel);
		inboundHL7TimeOut = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundHL7TimeOut.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundHL7TimeOutData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7TimeOut.setLayoutData(inboundHL7TimeOutData);
		inboundHL7TimeOut.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7TimeOut.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundHL7TimeOut.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundHL7TimeOut.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7TimeOut.getText()));
				}
			}
		});
		EditingUtils.setID(inboundHL7TimeOut, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut);
		EditingUtils.setEEFtype(inboundHL7TimeOut, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7TimeOutText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7ValidateMessageCheckbox(FormToolkit widgetFactory, Composite parent) {
		inboundHL7ValidateMessage = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7ValidateMessageLabel), SWT.CHECK);
		inboundHL7ValidateMessage.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(inboundHL7ValidateMessage.getSelection())));
			}

		});
		GridData inboundHL7ValidateMessageData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7ValidateMessageData.horizontalSpan = 2;
		inboundHL7ValidateMessage.setLayoutData(inboundHL7ValidateMessageData);
		EditingUtils.setID(inboundHL7ValidateMessage, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage);
		EditingUtils.setEEFtype(inboundHL7ValidateMessage, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7ValidateMessageCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7BuildInvalidMessagesCheckbox(FormToolkit widgetFactory, Composite parent) {
		inboundHL7BuildInvalidMessages = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7BuildInvalidMessagesLabel), SWT.CHECK);
		inboundHL7BuildInvalidMessages.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(inboundHL7BuildInvalidMessages.getSelection())));
			}

		});
		GridData inboundHL7BuildInvalidMessagesData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7BuildInvalidMessagesData.horizontalSpan = 2;
		inboundHL7BuildInvalidMessages.setLayoutData(inboundHL7BuildInvalidMessagesData);
		EditingUtils.setID(inboundHL7BuildInvalidMessages, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages);
		EditingUtils.setEEFtype(inboundHL7BuildInvalidMessages, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7BuildInvalidMessagesCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7PassThroughInvalidMessagesCheckbox(FormToolkit widgetFactory, Composite parent) {
		inboundHL7PassThroughInvalidMessages = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7PassThroughInvalidMessagesLabel), SWT.CHECK);
		inboundHL7PassThroughInvalidMessages.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(inboundHL7PassThroughInvalidMessages.getSelection())));
			}

		});
		GridData inboundHL7PassThroughInvalidMessagesData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7PassThroughInvalidMessagesData.horizontalSpan = 2;
		inboundHL7PassThroughInvalidMessages.setLayoutData(inboundHL7PassThroughInvalidMessagesData);
		EditingUtils.setID(inboundHL7PassThroughInvalidMessages, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages);
		EditingUtils.setEEFtype(inboundHL7PassThroughInvalidMessages, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7PassThroughInvalidMessagesCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createZookeeperConnectText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect, EsbMessages.InboundEndpointPropertiesEditionPart_ZookeeperConnectLabel);
		zookeeperConnect = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		zookeeperConnect.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData zookeeperConnectData = new GridData(GridData.FILL_HORIZONTAL);
		zookeeperConnect.setLayoutData(zookeeperConnectData);
		zookeeperConnect.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperConnect.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, zookeeperConnect.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		zookeeperConnect.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperConnect.getText()));
				}
			}
		});
		EditingUtils.setID(zookeeperConnect, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect);
		EditingUtils.setEEFtype(zookeeperConnect, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createZookeeperConnectText

		// End of user code
		return parent;
	}

	
	protected Composite createGroupIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.groupId, EsbMessages.InboundEndpointPropertiesEditionPart_GroupIdLabel);
		groupId = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		groupId.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData groupIdData = new GridData(GridData.FILL_HORIZONTAL);
		groupId.setLayoutData(groupIdData);
		groupId.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.groupId,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, groupId.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.groupId,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, groupId.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		groupId.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.groupId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, groupId.getText()));
				}
			}
		});
		EditingUtils.setID(groupId, EsbViewsRepository.InboundEndpoint.Properties.groupId);
		EditingUtils.setEEFtype(groupId, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.groupId, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createGroupIdText

		// End of user code
		return parent;
	}

	
	protected Composite createContentTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.contentType, EsbMessages.InboundEndpointPropertiesEditionPart_ContentTypeLabel);
		contentType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		contentType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData contentTypeData = new GridData(GridData.FILL_HORIZONTAL);
		contentType.setLayoutData(contentTypeData);
		contentType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.contentType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, contentType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.contentType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, contentType.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		contentType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.contentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, contentType.getText()));
				}
			}
		});
		EditingUtils.setID(contentType, EsbViewsRepository.InboundEndpoint.Properties.contentType);
		EditingUtils.setEEFtype(contentType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.contentType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createConsumerTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.consumerType, EsbMessages.InboundEndpointPropertiesEditionPart_ConsumerTypeLabel);
		consumerType = new EMFComboViewer(parent);
		consumerType.setContentProvider(new ArrayContentProvider());
		consumerType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData consumerTypeData = new GridData(GridData.FILL_HORIZONTAL);
		consumerType.getCombo().setLayoutData(consumerTypeData);
		consumerType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.consumerType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConsumerType()));
			}

		});
		consumerType.setID(EsbViewsRepository.InboundEndpoint.Properties.consumerType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.consumerType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConsumerTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTopicsOrTopicFilterEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter, EsbMessages.InboundEndpointPropertiesEditionPart_TopicsOrTopicFilterLabel);
		topicsOrTopicFilter = new EMFComboViewer(parent);
		topicsOrTopicFilter.setContentProvider(new ArrayContentProvider());
		topicsOrTopicFilter.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData topicsOrTopicFilterData = new GridData(GridData.FILL_HORIZONTAL);
		topicsOrTopicFilter.getCombo().setLayoutData(topicsOrTopicFilterData);
		topicsOrTopicFilter.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTopicsOrTopicFilter()));
			}

		});
		topicsOrTopicFilter.setID(EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTopicsOrTopicFilterEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTopicsNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.topicsName, EsbMessages.InboundEndpointPropertiesEditionPart_TopicsNameLabel);
		topicsName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		topicsName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData topicsNameData = new GridData(GridData.FILL_HORIZONTAL);
		topicsName.setLayoutData(topicsNameData);
		topicsName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.topicsName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, topicsName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.topicsName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, topicsName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		topicsName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.topicsName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, topicsName.getText()));
				}
			}
		});
		EditingUtils.setID(topicsName, EsbViewsRepository.InboundEndpoint.Properties.topicsName);
		EditingUtils.setEEFtype(topicsName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.topicsName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTopicsNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTopicFilterFromEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom, EsbMessages.InboundEndpointPropertiesEditionPart_TopicFilterFromLabel);
		topicFilterFrom = new EMFComboViewer(parent);
		topicFilterFrom.setContentProvider(new ArrayContentProvider());
		topicFilterFrom.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData topicFilterFromData = new GridData(GridData.FILL_HORIZONTAL);
		topicFilterFrom.getCombo().setLayoutData(topicFilterFromData);
		topicFilterFrom.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTopicFilterFrom()));
			}

		});
		topicFilterFrom.setID(EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTopicFilterFromEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTopicFilterNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.topicFilterName, EsbMessages.InboundEndpointPropertiesEditionPart_TopicFilterNameLabel);
		topicFilterName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		topicFilterName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData topicFilterNameData = new GridData(GridData.FILL_HORIZONTAL);
		topicFilterName.setLayoutData(topicFilterNameData);
		topicFilterName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.topicFilterName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, topicFilterName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.topicFilterName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, topicFilterName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		topicFilterName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.topicFilterName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, topicFilterName.getText()));
				}
			}
		});
		EditingUtils.setID(topicFilterName, EsbViewsRepository.InboundEndpoint.Properties.topicFilterName);
		EditingUtils.setEEFtype(topicFilterName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.topicFilterName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTopicFilterNameText

		// End of user code
		return parent;
	}

	
	protected Composite createSimpleConsumerTopicText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic, EsbMessages.InboundEndpointPropertiesEditionPart_SimpleConsumerTopicLabel);
		simpleConsumerTopic = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		simpleConsumerTopic.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData simpleConsumerTopicData = new GridData(GridData.FILL_HORIZONTAL);
		simpleConsumerTopic.setLayoutData(simpleConsumerTopicData);
		simpleConsumerTopic.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerTopic.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, simpleConsumerTopic.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		simpleConsumerTopic.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerTopic.getText()));
				}
			}
		});
		EditingUtils.setID(simpleConsumerTopic, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic);
		EditingUtils.setEEFtype(simpleConsumerTopic, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSimpleConsumerTopicText

		// End of user code
		return parent;
	}

	
	protected Composite createSimpleConsumerBrokersText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers, EsbMessages.InboundEndpointPropertiesEditionPart_SimpleConsumerBrokersLabel);
		simpleConsumerBrokers = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		simpleConsumerBrokers.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData simpleConsumerBrokersData = new GridData(GridData.FILL_HORIZONTAL);
		simpleConsumerBrokers.setLayoutData(simpleConsumerBrokersData);
		simpleConsumerBrokers.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerBrokers.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, simpleConsumerBrokers.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		simpleConsumerBrokers.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerBrokers.getText()));
				}
			}
		});
		EditingUtils.setID(simpleConsumerBrokers, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers);
		EditingUtils.setEEFtype(simpleConsumerBrokers, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSimpleConsumerBrokersText

		// End of user code
		return parent;
	}

	
	protected Composite createSimpleConsumerPortText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort, EsbMessages.InboundEndpointPropertiesEditionPart_SimpleConsumerPortLabel);
		simpleConsumerPort = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		simpleConsumerPort.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData simpleConsumerPortData = new GridData(GridData.FILL_HORIZONTAL);
		simpleConsumerPort.setLayoutData(simpleConsumerPortData);
		simpleConsumerPort.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerPort.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, simpleConsumerPort.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		simpleConsumerPort.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerPort.getText()));
				}
			}
		});
		EditingUtils.setID(simpleConsumerPort, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort);
		EditingUtils.setEEFtype(simpleConsumerPort, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSimpleConsumerPortText

		// End of user code
		return parent;
	}

	
	protected Composite createSimpleConsumerPartitionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition, EsbMessages.InboundEndpointPropertiesEditionPart_SimpleConsumerPartitionLabel);
		simpleConsumerPartition = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		simpleConsumerPartition.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData simpleConsumerPartitionData = new GridData(GridData.FILL_HORIZONTAL);
		simpleConsumerPartition.setLayoutData(simpleConsumerPartitionData);
		simpleConsumerPartition.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerPartition.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, simpleConsumerPartition.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		simpleConsumerPartition.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerPartition.getText()));
				}
			}
		});
		EditingUtils.setID(simpleConsumerPartition, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition);
		EditingUtils.setEEFtype(simpleConsumerPartition, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSimpleConsumerPartitionText

		// End of user code
		return parent;
	}

	
	protected Composite createSimpleConsumerMaxMessagesToReadText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead, EsbMessages.InboundEndpointPropertiesEditionPart_SimpleConsumerMaxMessagesToReadLabel);
		simpleConsumerMaxMessagesToRead = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		simpleConsumerMaxMessagesToRead.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData simpleConsumerMaxMessagesToReadData = new GridData(GridData.FILL_HORIZONTAL);
		simpleConsumerMaxMessagesToRead.setLayoutData(simpleConsumerMaxMessagesToReadData);
		simpleConsumerMaxMessagesToRead.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerMaxMessagesToRead.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, simpleConsumerMaxMessagesToRead.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		simpleConsumerMaxMessagesToRead.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerMaxMessagesToRead.getText()));
				}
			}
		});
		EditingUtils.setID(simpleConsumerMaxMessagesToRead, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead);
		EditingUtils.setEEFtype(simpleConsumerMaxMessagesToRead, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSimpleConsumerMaxMessagesToReadText

		// End of user code
		return parent;
	}

	
	protected Composite createThreadCountText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.threadCount, EsbMessages.InboundEndpointPropertiesEditionPart_ThreadCountLabel);
		threadCount = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		threadCount.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData threadCountData = new GridData(GridData.FILL_HORIZONTAL);
		threadCount.setLayoutData(threadCountData);
		threadCount.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.threadCount,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, threadCount.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.threadCount,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, threadCount.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		threadCount.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.threadCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, threadCount.getText()));
				}
			}
		});
		EditingUtils.setID(threadCount, EsbViewsRepository.InboundEndpoint.Properties.threadCount);
		EditingUtils.setEEFtype(threadCount, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.threadCount, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createThreadCountText

		// End of user code
		return parent;
	}

	
	protected Composite createConsumerIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.consumerId, EsbMessages.InboundEndpointPropertiesEditionPart_ConsumerIdLabel);
		consumerId = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		consumerId.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData consumerIdData = new GridData(GridData.FILL_HORIZONTAL);
		consumerId.setLayoutData(consumerIdData);
		consumerId.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.consumerId,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, consumerId.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.consumerId,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, consumerId.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		consumerId.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.consumerId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, consumerId.getText()));
				}
			}
		});
		EditingUtils.setID(consumerId, EsbViewsRepository.InboundEndpoint.Properties.consumerId);
		EditingUtils.setEEFtype(consumerId, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.consumerId, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConsumerIdText

		// End of user code
		return parent;
	}

	
	protected Composite createSocketTimeoutMsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs, EsbMessages.InboundEndpointPropertiesEditionPart_SocketTimeoutMsLabel);
		socketTimeoutMs = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		socketTimeoutMs.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData socketTimeoutMsData = new GridData(GridData.FILL_HORIZONTAL);
		socketTimeoutMs.setLayoutData(socketTimeoutMsData);
		socketTimeoutMs.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, socketTimeoutMs.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, socketTimeoutMs.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		socketTimeoutMs.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, socketTimeoutMs.getText()));
				}
			}
		});
		EditingUtils.setID(socketTimeoutMs, EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs);
		EditingUtils.setEEFtype(socketTimeoutMs, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSocketTimeoutMsText

		// End of user code
		return parent;
	}

	
	protected Composite createSocketReceiveBufferBytesText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes, EsbMessages.InboundEndpointPropertiesEditionPart_SocketReceiveBufferBytesLabel);
		socketReceiveBufferBytes = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		socketReceiveBufferBytes.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData socketReceiveBufferBytesData = new GridData(GridData.FILL_HORIZONTAL);
		socketReceiveBufferBytes.setLayoutData(socketReceiveBufferBytesData);
		socketReceiveBufferBytes.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, socketReceiveBufferBytes.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, socketReceiveBufferBytes.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		socketReceiveBufferBytes.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, socketReceiveBufferBytes.getText()));
				}
			}
		});
		EditingUtils.setID(socketReceiveBufferBytes, EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes);
		EditingUtils.setEEFtype(socketReceiveBufferBytes, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSocketReceiveBufferBytesText

		// End of user code
		return parent;
	}

	
	protected Composite createFetchMessageMaxBytesText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes, EsbMessages.InboundEndpointPropertiesEditionPart_FetchMessageMaxBytesLabel);
		fetchMessageMaxBytes = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		fetchMessageMaxBytes.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData fetchMessageMaxBytesData = new GridData(GridData.FILL_HORIZONTAL);
		fetchMessageMaxBytes.setLayoutData(fetchMessageMaxBytesData);
		fetchMessageMaxBytes.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fetchMessageMaxBytes.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, fetchMessageMaxBytes.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		fetchMessageMaxBytes.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fetchMessageMaxBytes.getText()));
				}
			}
		});
		EditingUtils.setID(fetchMessageMaxBytes, EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes);
		EditingUtils.setEEFtype(fetchMessageMaxBytes, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFetchMessageMaxBytesText

		// End of user code
		return parent;
	}

	
	protected Composite createNumConsumerFetchesText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches, EsbMessages.InboundEndpointPropertiesEditionPart_NumConsumerFetchesLabel);
		numConsumerFetches = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		numConsumerFetches.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData numConsumerFetchesData = new GridData(GridData.FILL_HORIZONTAL);
		numConsumerFetches.setLayoutData(numConsumerFetchesData);
		numConsumerFetches.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, numConsumerFetches.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, numConsumerFetches.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		numConsumerFetches.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, numConsumerFetches.getText()));
				}
			}
		});
		EditingUtils.setID(numConsumerFetches, EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches);
		EditingUtils.setEEFtype(numConsumerFetches, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNumConsumerFetchesText

		// End of user code
		return parent;
	}

	
	protected Composite createAutoCommitEnableCheckbox(FormToolkit widgetFactory, Composite parent) {
		autoCommitEnable = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable, EsbMessages.InboundEndpointPropertiesEditionPart_AutoCommitEnableLabel), SWT.CHECK);
		autoCommitEnable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(autoCommitEnable.getSelection())));
			}

		});
		GridData autoCommitEnableData = new GridData(GridData.FILL_HORIZONTAL);
		autoCommitEnableData.horizontalSpan = 2;
		autoCommitEnable.setLayoutData(autoCommitEnableData);
		EditingUtils.setID(autoCommitEnable, EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable);
		EditingUtils.setEEFtype(autoCommitEnable, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAutoCommitEnableCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createAutoCommitIntervalMsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs, EsbMessages.InboundEndpointPropertiesEditionPart_AutoCommitIntervalMsLabel);
		autoCommitIntervalMs = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		autoCommitIntervalMs.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData autoCommitIntervalMsData = new GridData(GridData.FILL_HORIZONTAL);
		autoCommitIntervalMs.setLayoutData(autoCommitIntervalMsData);
		autoCommitIntervalMs.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, autoCommitIntervalMs.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, autoCommitIntervalMs.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		autoCommitIntervalMs.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, autoCommitIntervalMs.getText()));
				}
			}
		});
		EditingUtils.setID(autoCommitIntervalMs, EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs);
		EditingUtils.setEEFtype(autoCommitIntervalMs, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAutoCommitIntervalMsText

		// End of user code
		return parent;
	}

	
	protected Composite createQueuedMaxMessageChunksText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks, EsbMessages.InboundEndpointPropertiesEditionPart_QueuedMaxMessageChunksLabel);
		queuedMaxMessageChunks = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		queuedMaxMessageChunks.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData queuedMaxMessageChunksData = new GridData(GridData.FILL_HORIZONTAL);
		queuedMaxMessageChunks.setLayoutData(queuedMaxMessageChunksData);
		queuedMaxMessageChunks.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, queuedMaxMessageChunks.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, queuedMaxMessageChunks.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		queuedMaxMessageChunks.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, queuedMaxMessageChunks.getText()));
				}
			}
		});
		EditingUtils.setID(queuedMaxMessageChunks, EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks);
		EditingUtils.setEEFtype(queuedMaxMessageChunks, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createQueuedMaxMessageChunksText

		// End of user code
		return parent;
	}

	
	protected Composite createRebalanceMaxRetriesText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries, EsbMessages.InboundEndpointPropertiesEditionPart_RebalanceMaxRetriesLabel);
		rebalanceMaxRetries = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		rebalanceMaxRetries.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData rebalanceMaxRetriesData = new GridData(GridData.FILL_HORIZONTAL);
		rebalanceMaxRetries.setLayoutData(rebalanceMaxRetriesData);
		rebalanceMaxRetries.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rebalanceMaxRetries.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, rebalanceMaxRetries.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		rebalanceMaxRetries.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rebalanceMaxRetries.getText()));
				}
			}
		});
		EditingUtils.setID(rebalanceMaxRetries, EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries);
		EditingUtils.setEEFtype(rebalanceMaxRetries, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createRebalanceMaxRetriesText

		// End of user code
		return parent;
	}

	
	protected Composite createFetchMinBytesText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes, EsbMessages.InboundEndpointPropertiesEditionPart_FetchMinBytesLabel);
		fetchMinBytes = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		fetchMinBytes.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData fetchMinBytesData = new GridData(GridData.FILL_HORIZONTAL);
		fetchMinBytes.setLayoutData(fetchMinBytesData);
		fetchMinBytes.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fetchMinBytes.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, fetchMinBytes.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		fetchMinBytes.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fetchMinBytes.getText()));
				}
			}
		});
		EditingUtils.setID(fetchMinBytes, EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes);
		EditingUtils.setEEFtype(fetchMinBytes, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFetchMinBytesText

		// End of user code
		return parent;
	}

	
	protected Composite createFetchWaitMaxMsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs, EsbMessages.InboundEndpointPropertiesEditionPart_FetchWaitMaxMsLabel);
		fetchWaitMaxMs = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		fetchWaitMaxMs.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData fetchWaitMaxMsData = new GridData(GridData.FILL_HORIZONTAL);
		fetchWaitMaxMs.setLayoutData(fetchWaitMaxMsData);
		fetchWaitMaxMs.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fetchWaitMaxMs.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, fetchWaitMaxMs.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		fetchWaitMaxMs.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fetchWaitMaxMs.getText()));
				}
			}
		});
		EditingUtils.setID(fetchWaitMaxMs, EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs);
		EditingUtils.setEEFtype(fetchWaitMaxMs, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFetchWaitMaxMsText

		// End of user code
		return parent;
	}

	
	protected Composite createRebalanceBackoffMsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs, EsbMessages.InboundEndpointPropertiesEditionPart_RebalanceBackoffMsLabel);
		rebalanceBackoffMs = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		rebalanceBackoffMs.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData rebalanceBackoffMsData = new GridData(GridData.FILL_HORIZONTAL);
		rebalanceBackoffMs.setLayoutData(rebalanceBackoffMsData);
		rebalanceBackoffMs.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rebalanceBackoffMs.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, rebalanceBackoffMs.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		rebalanceBackoffMs.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rebalanceBackoffMs.getText()));
				}
			}
		});
		EditingUtils.setID(rebalanceBackoffMs, EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs);
		EditingUtils.setEEFtype(rebalanceBackoffMs, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createRebalanceBackoffMsText

		// End of user code
		return parent;
	}

	
	protected Composite createRefreshLeaderBackoffMsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs, EsbMessages.InboundEndpointPropertiesEditionPart_RefreshLeaderBackoffMsLabel);
		refreshLeaderBackoffMs = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		refreshLeaderBackoffMs.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData refreshLeaderBackoffMsData = new GridData(GridData.FILL_HORIZONTAL);
		refreshLeaderBackoffMs.setLayoutData(refreshLeaderBackoffMsData);
		refreshLeaderBackoffMs.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, refreshLeaderBackoffMs.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, refreshLeaderBackoffMs.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		refreshLeaderBackoffMs.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, refreshLeaderBackoffMs.getText()));
				}
			}
		});
		EditingUtils.setID(refreshLeaderBackoffMs, EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs);
		EditingUtils.setEEFtype(refreshLeaderBackoffMs, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createRefreshLeaderBackoffMsText

		// End of user code
		return parent;
	}

	
	protected Composite createAutoOffsetResetEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset, EsbMessages.InboundEndpointPropertiesEditionPart_AutoOffsetResetLabel);
		autoOffsetReset = new EMFComboViewer(parent);
		autoOffsetReset.setContentProvider(new ArrayContentProvider());
		autoOffsetReset.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData autoOffsetResetData = new GridData(GridData.FILL_HORIZONTAL);
		autoOffsetReset.getCombo().setLayoutData(autoOffsetResetData);
		autoOffsetReset.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAutoOffsetReset()));
			}

		});
		autoOffsetReset.setID(EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createAutoOffsetResetEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createConsumerTimeoutMsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs, EsbMessages.InboundEndpointPropertiesEditionPart_ConsumerTimeoutMsLabel);
		consumerTimeoutMs = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		consumerTimeoutMs.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData consumerTimeoutMsData = new GridData(GridData.FILL_HORIZONTAL);
		consumerTimeoutMs.setLayoutData(consumerTimeoutMsData);
		consumerTimeoutMs.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, consumerTimeoutMs.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, consumerTimeoutMs.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		consumerTimeoutMs.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, consumerTimeoutMs.getText()));
				}
			}
		});
		EditingUtils.setID(consumerTimeoutMs, EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs);
		EditingUtils.setEEFtype(consumerTimeoutMs, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createConsumerTimeoutMsText

		// End of user code
		return parent;
	}

	
	protected Composite createExcludeInternalTopicsCheckbox(FormToolkit widgetFactory, Composite parent) {
		excludeInternalTopics = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics, EsbMessages.InboundEndpointPropertiesEditionPart_ExcludeInternalTopicsLabel), SWT.CHECK);
		excludeInternalTopics.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(excludeInternalTopics.getSelection())));
			}

		});
		GridData excludeInternalTopicsData = new GridData(GridData.FILL_HORIZONTAL);
		excludeInternalTopicsData.horizontalSpan = 2;
		excludeInternalTopics.setLayoutData(excludeInternalTopicsData);
		EditingUtils.setID(excludeInternalTopics, EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics);
		EditingUtils.setEEFtype(excludeInternalTopics, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createExcludeInternalTopicsCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createPartitionAssignmentStrategyEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy, EsbMessages.InboundEndpointPropertiesEditionPart_PartitionAssignmentStrategyLabel);
		partitionAssignmentStrategy = new EMFComboViewer(parent);
		partitionAssignmentStrategy.setContentProvider(new ArrayContentProvider());
		partitionAssignmentStrategy.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData partitionAssignmentStrategyData = new GridData(GridData.FILL_HORIZONTAL);
		partitionAssignmentStrategy.getCombo().setLayoutData(partitionAssignmentStrategyData);
		partitionAssignmentStrategy.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPartitionAssignmentStrategy()));
			}

		});
		partitionAssignmentStrategy.setID(EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createPartitionAssignmentStrategyEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createClientIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.clientId, EsbMessages.InboundEndpointPropertiesEditionPart_ClientIdLabel);
		clientId = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		clientId.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData clientIdData = new GridData(GridData.FILL_HORIZONTAL);
		clientId.setLayoutData(clientIdData);
		clientId.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.clientId,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clientId.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.clientId,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, clientId.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		clientId.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.clientId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clientId.getText()));
				}
			}
		});
		EditingUtils.setID(clientId, EsbViewsRepository.InboundEndpoint.Properties.clientId);
		EditingUtils.setEEFtype(clientId, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.clientId, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createClientIdText

		// End of user code
		return parent;
	}

	
	protected Composite createZookeeperSessionTimeoutMsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs, EsbMessages.InboundEndpointPropertiesEditionPart_ZookeeperSessionTimeoutMsLabel);
		zookeeperSessionTimeoutMs = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		zookeeperSessionTimeoutMs.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData zookeeperSessionTimeoutMsData = new GridData(GridData.FILL_HORIZONTAL);
		zookeeperSessionTimeoutMs.setLayoutData(zookeeperSessionTimeoutMsData);
		zookeeperSessionTimeoutMs.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperSessionTimeoutMs.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, zookeeperSessionTimeoutMs.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		zookeeperSessionTimeoutMs.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperSessionTimeoutMs.getText()));
				}
			}
		});
		EditingUtils.setID(zookeeperSessionTimeoutMs, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs);
		EditingUtils.setEEFtype(zookeeperSessionTimeoutMs, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createZookeeperSessionTimeoutMsText

		// End of user code
		return parent;
	}

	
	protected Composite createZookeeperConnectionTimeoutMsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs, EsbMessages.InboundEndpointPropertiesEditionPart_ZookeeperConnectionTimeoutMsLabel);
		zookeeperConnectionTimeoutMs = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		zookeeperConnectionTimeoutMs.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData zookeeperConnectionTimeoutMsData = new GridData(GridData.FILL_HORIZONTAL);
		zookeeperConnectionTimeoutMs.setLayoutData(zookeeperConnectionTimeoutMsData);
		zookeeperConnectionTimeoutMs.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperConnectionTimeoutMs.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, zookeeperConnectionTimeoutMs.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		zookeeperConnectionTimeoutMs.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperConnectionTimeoutMs.getText()));
				}
			}
		});
		EditingUtils.setID(zookeeperConnectionTimeoutMs, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs);
		EditingUtils.setEEFtype(zookeeperConnectionTimeoutMs, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createZookeeperConnectionTimeoutMsText

		// End of user code
		return parent;
	}

	
	protected Composite createZookeeperSyncTimeMsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs, EsbMessages.InboundEndpointPropertiesEditionPart_ZookeeperSyncTimeMsLabel);
		zookeeperSyncTimeMs = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		zookeeperSyncTimeMs.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData zookeeperSyncTimeMsData = new GridData(GridData.FILL_HORIZONTAL);
		zookeeperSyncTimeMs.setLayoutData(zookeeperSyncTimeMsData);
		zookeeperSyncTimeMs.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperSyncTimeMs.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, zookeeperSyncTimeMs.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		zookeeperSyncTimeMs.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperSyncTimeMs.getText()));
				}
			}
		});
		EditingUtils.setID(zookeeperSyncTimeMs, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs);
		EditingUtils.setEEFtype(zookeeperSyncTimeMs, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createZookeeperSyncTimeMsText

		// End of user code
		return parent;
	}

	
	protected Composite createOffsetsStorageEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage, EsbMessages.InboundEndpointPropertiesEditionPart_OffsetsStorageLabel);
		offsetsStorage = new EMFComboViewer(parent);
		offsetsStorage.setContentProvider(new ArrayContentProvider());
		offsetsStorage.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData offsetsStorageData = new GridData(GridData.FILL_HORIZONTAL);
		offsetsStorage.getCombo().setLayoutData(offsetsStorageData);
		offsetsStorage.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOffsetsStorage()));
			}

		});
		offsetsStorage.setID(EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createOffsetsStorageEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createOffsetsChannelBackoffMsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs, EsbMessages.InboundEndpointPropertiesEditionPart_OffsetsChannelBackoffMsLabel);
		offsetsChannelBackoffMs = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		offsetsChannelBackoffMs.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData offsetsChannelBackoffMsData = new GridData(GridData.FILL_HORIZONTAL);
		offsetsChannelBackoffMs.setLayoutData(offsetsChannelBackoffMsData);
		offsetsChannelBackoffMs.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, offsetsChannelBackoffMs.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, offsetsChannelBackoffMs.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		offsetsChannelBackoffMs.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, offsetsChannelBackoffMs.getText()));
				}
			}
		});
		EditingUtils.setID(offsetsChannelBackoffMs, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs);
		EditingUtils.setEEFtype(offsetsChannelBackoffMs, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createOffsetsChannelBackoffMsText

		// End of user code
		return parent;
	}

	
	protected Composite createOffsetsChannelSocketTimeoutMsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs, EsbMessages.InboundEndpointPropertiesEditionPart_OffsetsChannelSocketTimeoutMsLabel);
		offsetsChannelSocketTimeoutMs = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		offsetsChannelSocketTimeoutMs.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData offsetsChannelSocketTimeoutMsData = new GridData(GridData.FILL_HORIZONTAL);
		offsetsChannelSocketTimeoutMs.setLayoutData(offsetsChannelSocketTimeoutMsData);
		offsetsChannelSocketTimeoutMs.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, offsetsChannelSocketTimeoutMs.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, offsetsChannelSocketTimeoutMs.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		offsetsChannelSocketTimeoutMs.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, offsetsChannelSocketTimeoutMs.getText()));
				}
			}
		});
		EditingUtils.setID(offsetsChannelSocketTimeoutMs, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs);
		EditingUtils.setEEFtype(offsetsChannelSocketTimeoutMs, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createOffsetsChannelSocketTimeoutMsText

		// End of user code
		return parent;
	}

	
	protected Composite createOffsetsCommitMaxRetriesText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries, EsbMessages.InboundEndpointPropertiesEditionPart_OffsetsCommitMaxRetriesLabel);
		offsetsCommitMaxRetries = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		offsetsCommitMaxRetries.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData offsetsCommitMaxRetriesData = new GridData(GridData.FILL_HORIZONTAL);
		offsetsCommitMaxRetries.setLayoutData(offsetsCommitMaxRetriesData);
		offsetsCommitMaxRetries.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, offsetsCommitMaxRetries.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, offsetsCommitMaxRetries.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		offsetsCommitMaxRetries.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, offsetsCommitMaxRetries.getText()));
				}
			}
		});
		EditingUtils.setID(offsetsCommitMaxRetries, EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries);
		EditingUtils.setEEFtype(offsetsCommitMaxRetries, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createOffsetsCommitMaxRetriesText

		// End of user code
		return parent;
	}

	
	protected Composite createDualCommitEnabledCheckbox(FormToolkit widgetFactory, Composite parent) {
		dualCommitEnabled = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled, EsbMessages.InboundEndpointPropertiesEditionPart_DualCommitEnabledLabel), SWT.CHECK);
		dualCommitEnabled.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(dualCommitEnabled.getSelection())));
			}

		});
		GridData dualCommitEnabledData = new GridData(GridData.FILL_HORIZONTAL);
		dualCommitEnabledData.horizontalSpan = 2;
		dualCommitEnabled.setLayoutData(dualCommitEnabledData);
		EditingUtils.setID(dualCommitEnabled, EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled);
		EditingUtils.setEEFtype(dualCommitEnabled, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDualCommitEnabledCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createInboundCxfRmHostText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost, EsbMessages.InboundEndpointPropertiesEditionPart_InboundCxfRmHostLabel);
		inboundCxfRmHost = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundCxfRmHost.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundCxfRmHostData = new GridData(GridData.FILL_HORIZONTAL);
		inboundCxfRmHost.setLayoutData(inboundCxfRmHostData);
		inboundCxfRmHost.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundCxfRmHost.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundCxfRmHost.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundCxfRmHost.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundCxfRmHost.getText()));
				}
			}
		});
		EditingUtils.setID(inboundCxfRmHost, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost);
		EditingUtils.setEEFtype(inboundCxfRmHost, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundCxfRmHostText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundCxfRmPortText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort, EsbMessages.InboundEndpointPropertiesEditionPart_InboundCxfRmPortLabel);
		inboundCxfRmPort = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundCxfRmPort.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundCxfRmPortData = new GridData(GridData.FILL_HORIZONTAL);
		inboundCxfRmPort.setLayoutData(inboundCxfRmPortData);
		inboundCxfRmPort.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundCxfRmPort.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundCxfRmPort.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundCxfRmPort.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundCxfRmPort.getText()));
				}
			}
		});
		EditingUtils.setID(inboundCxfRmPort, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort);
		EditingUtils.setEEFtype(inboundCxfRmPort, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundCxfRmPortText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundCxfRmConfigFileText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile, EsbMessages.InboundEndpointPropertiesEditionPart_InboundCxfRmConfigFileLabel);
		inboundCxfRmConfigFile = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		inboundCxfRmConfigFile.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData inboundCxfRmConfigFileData = new GridData(GridData.FILL_HORIZONTAL);
		inboundCxfRmConfigFile.setLayoutData(inboundCxfRmConfigFileData);
		inboundCxfRmConfigFile.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundCxfRmConfigFile.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, inboundCxfRmConfigFile.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		inboundCxfRmConfigFile.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundCxfRmConfigFile.getText()));
				}
			}
		});
		EditingUtils.setID(inboundCxfRmConfigFile, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile);
		EditingUtils.setEEFtype(inboundCxfRmConfigFile, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundCxfRmConfigFileText

		// End of user code
		return parent;
	}

	
	protected Composite createEnableSSLCheckbox(FormToolkit widgetFactory, Composite parent) {
		enableSSL = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.enableSSL, EsbMessages.InboundEndpointPropertiesEditionPart_EnableSSLLabel), SWT.CHECK);
		enableSSL.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.enableSSL, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(enableSSL.getSelection())));
			}

		});
		GridData enableSSLData = new GridData(GridData.FILL_HORIZONTAL);
		enableSSLData.horizontalSpan = 2;
		enableSSL.setLayoutData(enableSSLData);
		EditingUtils.setID(enableSSL, EsbViewsRepository.InboundEndpoint.Properties.enableSSL);
		EditingUtils.setEEFtype(enableSSL, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.enableSSL, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createEnableSSLCheckbox

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createServiceParametersTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.serviceParameters = new ReferencesTable(getDescription(EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, EsbMessages.InboundEndpointPropertiesEditionPart_ServiceParametersLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				serviceParameters.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				serviceParameters.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				serviceParameters.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				serviceParameters.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.serviceParametersFilters) {
			this.serviceParameters.addFilter(filter);
		}
		this.serviceParameters.setHelpText(propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, EsbViewsRepository.FORM_KIND));
		this.serviceParameters.createControls(parent, widgetFactory);
		this.serviceParameters.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData serviceParametersData = new GridData(GridData.FILL_HORIZONTAL);
		serviceParametersData.horizontalSpan = 3;
		this.serviceParameters.setLayoutData(serviceParametersData);
		this.serviceParameters.setLowerBound(0);
		this.serviceParameters.setUpperBound(-1);
		serviceParameters.setID(EsbViewsRepository.InboundEndpoint.Properties.serviceParameters);
		serviceParameters.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createServiceParametersTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createSuspendCheckbox(FormToolkit widgetFactory, Composite parent) {
		suspend = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.suspend, EsbMessages.InboundEndpointPropertiesEditionPart_SuspendLabel), SWT.CHECK);
		suspend.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.suspend, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(suspend.getSelection())));
			}

		});
		GridData suspendData = new GridData(GridData.FILL_HORIZONTAL);
		suspendData.horizontalSpan = 2;
		suspend.setLayoutData(suspendData);
		EditingUtils.setID(suspend, EsbViewsRepository.InboundEndpoint.Properties.suspend);
		EditingUtils.setEEFtype(suspend, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.suspend, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSuspendCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionFactoryText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionFactoryLabel);
		transportRabbitMqConnectionFactory = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqConnectionFactory.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqConnectionFactoryData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionFactory.setLayoutData(transportRabbitMqConnectionFactoryData);
		transportRabbitMqConnectionFactory.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionFactory.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqConnectionFactory.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqConnectionFactory.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionFactory.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqConnectionFactory, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory);
		EditingUtils.setEEFtype(transportRabbitMqConnectionFactory, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionFactoryText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqServerHostNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqServerHostNameLabel);
		transportRabbitMqServerHostName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqServerHostName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqServerHostNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqServerHostName.setLayoutData(transportRabbitMqServerHostNameData);
		transportRabbitMqServerHostName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerHostName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqServerHostName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqServerHostName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerHostName.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqServerHostName, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName);
		EditingUtils.setEEFtype(transportRabbitMqServerHostName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqServerHostNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqServerPortText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqServerPortLabel);
		transportRabbitMqServerPort = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqServerPort.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqServerPortData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqServerPort.setLayoutData(transportRabbitMqServerPortData);
		transportRabbitMqServerPort.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerPort.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqServerPort.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqServerPort.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerPort.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqServerPort, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort);
		EditingUtils.setEEFtype(transportRabbitMqServerPort, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqServerPortText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqServerUserNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqServerUserNameLabel);
		transportRabbitMqServerUserName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqServerUserName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqServerUserNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqServerUserName.setLayoutData(transportRabbitMqServerUserNameData);
		transportRabbitMqServerUserName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerUserName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqServerUserName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqServerUserName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerUserName.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqServerUserName, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName);
		EditingUtils.setEEFtype(transportRabbitMqServerUserName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqServerUserNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqServerPasswordText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqServerPasswordLabel);
		transportRabbitMqServerPassword = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqServerPassword.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqServerPasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqServerPassword.setLayoutData(transportRabbitMqServerPasswordData);
		transportRabbitMqServerPassword.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerPassword.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqServerPassword.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqServerPassword.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerPassword.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqServerPassword, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword);
		EditingUtils.setEEFtype(transportRabbitMqServerPassword, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqServerPasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueNameLabel);
		transportRabbitMqQueueName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqQueueName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqQueueNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueName.setLayoutData(transportRabbitMqQueueNameData);
		transportRabbitMqQueueName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqQueueName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqQueueName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueName.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqQueueName, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName);
		EditingUtils.setEEFtype(transportRabbitMqQueueName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqExchangeNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqExchangeNameLabel);
		transportRabbitMqExchangeName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqExchangeName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqExchangeNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqExchangeName.setLayoutData(transportRabbitMqExchangeNameData);
		transportRabbitMqExchangeName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqExchangeName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqExchangeName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeName.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqExchangeName, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName);
		EditingUtils.setEEFtype(transportRabbitMqExchangeName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqExchangeNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueDurableText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueDurableLabel);
		transportRabbitMqQueueDurable = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqQueueDurable.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqQueueDurableData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueDurable.setLayoutData(transportRabbitMqQueueDurableData);
		transportRabbitMqQueueDurable.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueDurable.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqQueueDurable.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqQueueDurable.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueDurable.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqQueueDurable, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable);
		EditingUtils.setEEFtype(transportRabbitMqQueueDurable, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueDurableText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueExclusiveText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueExclusiveLabel);
		transportRabbitMqQueueExclusive = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqQueueExclusive.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqQueueExclusiveData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueExclusive.setLayoutData(transportRabbitMqQueueExclusiveData);
		transportRabbitMqQueueExclusive.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueExclusive.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqQueueExclusive.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqQueueExclusive.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueExclusive.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqQueueExclusive, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive);
		EditingUtils.setEEFtype(transportRabbitMqQueueExclusive, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueExclusiveText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueAutoDeleteText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueAutoDeleteLabel);
		transportRabbitMqQueueAutoDelete = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqQueueAutoDelete.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqQueueAutoDeleteData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueAutoDelete.setLayoutData(transportRabbitMqQueueAutoDeleteData);
		transportRabbitMqQueueAutoDelete.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueAutoDelete.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqQueueAutoDelete.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqQueueAutoDelete.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueAutoDelete.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqQueueAutoDelete, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete);
		EditingUtils.setEEFtype(transportRabbitMqQueueAutoDelete, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueAutoDeleteText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueAutoAckText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueAutoAckLabel);
		transportRabbitMqQueueAutoAck = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqQueueAutoAck.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqQueueAutoAckData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueAutoAck.setLayoutData(transportRabbitMqQueueAutoAckData);
		transportRabbitMqQueueAutoAck.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueAutoAck.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqQueueAutoAck.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqQueueAutoAck.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueAutoAck.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqQueueAutoAck, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck);
		EditingUtils.setEEFtype(transportRabbitMqQueueAutoAck, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueAutoAckText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueRoutingKeyText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueRoutingKeyLabel);
		transportRabbitMqQueueRoutingKey = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqQueueRoutingKey.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqQueueRoutingKeyData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueRoutingKey.setLayoutData(transportRabbitMqQueueRoutingKeyData);
		transportRabbitMqQueueRoutingKey.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueRoutingKey.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqQueueRoutingKey.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqQueueRoutingKey.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueRoutingKey.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqQueueRoutingKey, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey);
		EditingUtils.setEEFtype(transportRabbitMqQueueRoutingKey, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueRoutingKeyText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueDeliveryModeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueDeliveryModeLabel);
		transportRabbitMqQueueDeliveryMode = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqQueueDeliveryMode.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqQueueDeliveryModeData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueDeliveryMode.setLayoutData(transportRabbitMqQueueDeliveryModeData);
		transportRabbitMqQueueDeliveryMode.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueDeliveryMode.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqQueueDeliveryMode.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqQueueDeliveryMode.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueDeliveryMode.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqQueueDeliveryMode, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode);
		EditingUtils.setEEFtype(transportRabbitMqQueueDeliveryMode, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueDeliveryModeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqExchangeTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqExchangeTypeLabel);
		transportRabbitMqExchangeType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqExchangeType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqExchangeTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqExchangeType.setLayoutData(transportRabbitMqExchangeTypeData);
		transportRabbitMqExchangeType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqExchangeType.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqExchangeType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeType.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqExchangeType, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType);
		EditingUtils.setEEFtype(transportRabbitMqExchangeType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqExchangeTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqExchangeDurableText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqExchangeDurableLabel);
		transportRabbitMqExchangeDurable = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqExchangeDurable.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqExchangeDurableData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqExchangeDurable.setLayoutData(transportRabbitMqExchangeDurableData);
		transportRabbitMqExchangeDurable.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeDurable.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqExchangeDurable.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqExchangeDurable.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeDurable.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqExchangeDurable, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable);
		EditingUtils.setEEFtype(transportRabbitMqExchangeDurable, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqExchangeDurableText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqExchangeAutoDeleteText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqExchangeAutoDeleteLabel);
		transportRabbitMqExchangeAutoDelete = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqExchangeAutoDelete.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqExchangeAutoDeleteData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqExchangeAutoDelete.setLayoutData(transportRabbitMqExchangeAutoDeleteData);
		transportRabbitMqExchangeAutoDelete.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeAutoDelete.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqExchangeAutoDelete.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqExchangeAutoDelete.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeAutoDelete.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqExchangeAutoDelete, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete);
		EditingUtils.setEEFtype(transportRabbitMqExchangeAutoDelete, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqExchangeAutoDeleteText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqServerVirtualHostText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqServerVirtualHostLabel);
		transportRabbitMqServerVirtualHost = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqServerVirtualHost.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqServerVirtualHostData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqServerVirtualHost.setLayoutData(transportRabbitMqServerVirtualHostData);
		transportRabbitMqServerVirtualHost.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerVirtualHost.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqServerVirtualHost.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqServerVirtualHost.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerVirtualHost.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqServerVirtualHost, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost);
		EditingUtils.setEEFtype(transportRabbitMqServerVirtualHost, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqServerVirtualHostText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqFactoryHeartbeatText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqFactoryHeartbeatLabel);
		transportRabbitMqFactoryHeartbeat = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqFactoryHeartbeat.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqFactoryHeartbeatData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqFactoryHeartbeat.setLayoutData(transportRabbitMqFactoryHeartbeatData);
		transportRabbitMqFactoryHeartbeat.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqFactoryHeartbeat.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqFactoryHeartbeat.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqFactoryHeartbeat.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqFactoryHeartbeat.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqFactoryHeartbeat, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat);
		EditingUtils.setEEFtype(transportRabbitMqFactoryHeartbeat, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqFactoryHeartbeatText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslEnabledText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslEnabledLabel);
		transportRabbitMqConnectionSslEnabled = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqConnectionSslEnabled.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqConnectionSslEnabledData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslEnabled.setLayoutData(transportRabbitMqConnectionSslEnabledData);
		transportRabbitMqConnectionSslEnabled.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslEnabled.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqConnectionSslEnabled.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqConnectionSslEnabled.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslEnabled.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqConnectionSslEnabled, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslEnabled, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslEnabledText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslKeystoreLocationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslKeystoreLocationLabel);
		transportRabbitMqConnectionSslKeystoreLocation = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqConnectionSslKeystoreLocation.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqConnectionSslKeystoreLocationData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslKeystoreLocation.setLayoutData(transportRabbitMqConnectionSslKeystoreLocationData);
		transportRabbitMqConnectionSslKeystoreLocation.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslKeystoreLocation.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqConnectionSslKeystoreLocation.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqConnectionSslKeystoreLocation.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslKeystoreLocation.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqConnectionSslKeystoreLocation, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslKeystoreLocation, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslKeystoreLocationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslKeystoreTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslKeystoreTypeLabel);
		transportRabbitMqConnectionSslKeystoreType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqConnectionSslKeystoreType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqConnectionSslKeystoreTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslKeystoreType.setLayoutData(transportRabbitMqConnectionSslKeystoreTypeData);
		transportRabbitMqConnectionSslKeystoreType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslKeystoreType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqConnectionSslKeystoreType.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqConnectionSslKeystoreType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslKeystoreType.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqConnectionSslKeystoreType, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslKeystoreType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslKeystoreTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslKeystorePasswordText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslKeystorePasswordLabel);
		transportRabbitMqConnectionSslKeystorePassword = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqConnectionSslKeystorePassword.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqConnectionSslKeystorePasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslKeystorePassword.setLayoutData(transportRabbitMqConnectionSslKeystorePasswordData);
		transportRabbitMqConnectionSslKeystorePassword.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslKeystorePassword.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqConnectionSslKeystorePassword.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqConnectionSslKeystorePassword.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslKeystorePassword.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqConnectionSslKeystorePassword, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslKeystorePassword, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslKeystorePasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslTruststoreLocationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslTruststoreLocationLabel);
		transportRabbitMqConnectionSslTruststoreLocation = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqConnectionSslTruststoreLocation.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqConnectionSslTruststoreLocationData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslTruststoreLocation.setLayoutData(transportRabbitMqConnectionSslTruststoreLocationData);
		transportRabbitMqConnectionSslTruststoreLocation.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslTruststoreLocation.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqConnectionSslTruststoreLocation.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqConnectionSslTruststoreLocation.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslTruststoreLocation.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqConnectionSslTruststoreLocation, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslTruststoreLocation, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslTruststoreLocationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslTruststoreTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslTruststoreTypeLabel);
		transportRabbitMqConnectionSslTruststoreType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqConnectionSslTruststoreType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqConnectionSslTruststoreTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslTruststoreType.setLayoutData(transportRabbitMqConnectionSslTruststoreTypeData);
		transportRabbitMqConnectionSslTruststoreType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslTruststoreType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqConnectionSslTruststoreType.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqConnectionSslTruststoreType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslTruststoreType.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqConnectionSslTruststoreType, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslTruststoreType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslTruststoreTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslTruststorePasswordText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslTruststorePasswordLabel);
		transportRabbitMqConnectionSslTruststorePassword = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqConnectionSslTruststorePassword.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqConnectionSslTruststorePasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslTruststorePassword.setLayoutData(transportRabbitMqConnectionSslTruststorePasswordData);
		transportRabbitMqConnectionSslTruststorePassword.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslTruststorePassword.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqConnectionSslTruststorePassword.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqConnectionSslTruststorePassword.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslTruststorePassword.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqConnectionSslTruststorePassword, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslTruststorePassword, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslTruststorePasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslVersionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslVersionLabel);
		transportRabbitMqConnectionSslVersion = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqConnectionSslVersion.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqConnectionSslVersionData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslVersion.setLayoutData(transportRabbitMqConnectionSslVersionData);
		transportRabbitMqConnectionSslVersion.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslVersion.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqConnectionSslVersion.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqConnectionSslVersion.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslVersion.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqConnectionSslVersion, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslVersion, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqMessageContentTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqMessageContentTypeLabel);
		transportRabbitMqMessageContentType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqMessageContentType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqMessageContentTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqMessageContentType.setLayoutData(transportRabbitMqMessageContentTypeData);
		transportRabbitMqMessageContentType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqMessageContentType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqMessageContentType.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqMessageContentType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqMessageContentType.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqMessageContentType, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType);
		EditingUtils.setEEFtype(transportRabbitMqMessageContentType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqMessageContentTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionRetryCountText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionRetryCountLabel);
		transportRabbitMqConnectionRetryCount = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqConnectionRetryCount.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqConnectionRetryCountData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionRetryCount.setLayoutData(transportRabbitMqConnectionRetryCountData);
		transportRabbitMqConnectionRetryCount.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionRetryCount.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqConnectionRetryCount.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqConnectionRetryCount.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionRetryCount.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqConnectionRetryCount, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount);
		EditingUtils.setEEFtype(transportRabbitMqConnectionRetryCount, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionRetryCountText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionRetryIntervalText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionRetryIntervalLabel);
		transportRabbitMqConnectionRetryInterval = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqConnectionRetryInterval.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqConnectionRetryIntervalData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionRetryInterval.setLayoutData(transportRabbitMqConnectionRetryIntervalData);
		transportRabbitMqConnectionRetryInterval.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionRetryInterval.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqConnectionRetryInterval.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqConnectionRetryInterval.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionRetryInterval.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqConnectionRetryInterval, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval);
		EditingUtils.setEEFtype(transportRabbitMqConnectionRetryInterval, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionRetryIntervalText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqServerRetryIntervalText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqServerRetryIntervalLabel);
		transportRabbitMqServerRetryInterval = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqServerRetryInterval.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqServerRetryIntervalData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqServerRetryInterval.setLayoutData(transportRabbitMqServerRetryIntervalData);
		transportRabbitMqServerRetryInterval.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerRetryInterval.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqServerRetryInterval.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqServerRetryInterval.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerRetryInterval.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqServerRetryInterval, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval);
		EditingUtils.setEEFtype(transportRabbitMqServerRetryInterval, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqServerRetryIntervalText

		// End of user code
		return parent;
	}

	
	protected Composite createWsInboundPortText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort, EsbMessages.InboundEndpointPropertiesEditionPart_WsInboundPortLabel);
		wsInboundPort = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wsInboundPort.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wsInboundPortData = new GridData(GridData.FILL_HORIZONTAL);
		wsInboundPort.setLayoutData(wsInboundPortData);
		wsInboundPort.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsInboundPort.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wsInboundPort.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wsInboundPort.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsInboundPort.getText()));
				}
			}
		});
		EditingUtils.setID(wsInboundPort, EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort);
		EditingUtils.setEEFtype(wsInboundPort, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsInboundPortText

		// End of user code
		return parent;
	}

	
	protected Composite createWsClientSideBroadcastLevelEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel, EsbMessages.InboundEndpointPropertiesEditionPart_WsClientSideBroadcastLevelLabel);
		wsClientSideBroadcastLevel = new EMFComboViewer(parent);
		wsClientSideBroadcastLevel.setContentProvider(new ArrayContentProvider());
		wsClientSideBroadcastLevel.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData wsClientSideBroadcastLevelData = new GridData(GridData.FILL_HORIZONTAL);
		wsClientSideBroadcastLevel.getCombo().setLayoutData(wsClientSideBroadcastLevelData);
		wsClientSideBroadcastLevel.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getWsClientSideBroadcastLevel()));
			}

		});
		wsClientSideBroadcastLevel.setID(EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsClientSideBroadcastLevelEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createWsOutflowDispatchSequenceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence, EsbMessages.InboundEndpointPropertiesEditionPart_WsOutflowDispatchSequenceLabel);
		wsOutflowDispatchSequence = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wsOutflowDispatchSequence.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wsOutflowDispatchSequenceData = new GridData(GridData.FILL_HORIZONTAL);
		wsOutflowDispatchSequence.setLayoutData(wsOutflowDispatchSequenceData);
		wsOutflowDispatchSequence.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsOutflowDispatchSequence.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wsOutflowDispatchSequence.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wsOutflowDispatchSequence.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsOutflowDispatchSequence.getText()));
				}
			}
		});
		EditingUtils.setID(wsOutflowDispatchSequence, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence);
		EditingUtils.setEEFtype(wsOutflowDispatchSequence, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsOutflowDispatchSequenceText

		// End of user code
		return parent;
	}

	
	protected Composite createWsOutflowDispatchFaultSequenceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence, EsbMessages.InboundEndpointPropertiesEditionPart_WsOutflowDispatchFaultSequenceLabel);
		wsOutflowDispatchFaultSequence = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wsOutflowDispatchFaultSequence.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wsOutflowDispatchFaultSequenceData = new GridData(GridData.FILL_HORIZONTAL);
		wsOutflowDispatchFaultSequence.setLayoutData(wsOutflowDispatchFaultSequenceData);
		wsOutflowDispatchFaultSequence.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsOutflowDispatchFaultSequence.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wsOutflowDispatchFaultSequence.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wsOutflowDispatchFaultSequence.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsOutflowDispatchFaultSequence.getText()));
				}
			}
		});
		EditingUtils.setID(wsOutflowDispatchFaultSequence, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence);
		EditingUtils.setEEFtype(wsOutflowDispatchFaultSequence, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsOutflowDispatchFaultSequenceText

		// End of user code
		return parent;
	}

	
	protected Composite createWsBossThreadPoolSizeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize, EsbMessages.InboundEndpointPropertiesEditionPart_WsBossThreadPoolSizeLabel);
		wsBossThreadPoolSize = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wsBossThreadPoolSize.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wsBossThreadPoolSizeData = new GridData(GridData.FILL_HORIZONTAL);
		wsBossThreadPoolSize.setLayoutData(wsBossThreadPoolSizeData);
		wsBossThreadPoolSize.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsBossThreadPoolSize.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wsBossThreadPoolSize.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wsBossThreadPoolSize.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsBossThreadPoolSize.getText()));
				}
			}
		});
		EditingUtils.setID(wsBossThreadPoolSize, EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize);
		EditingUtils.setEEFtype(wsBossThreadPoolSize, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsBossThreadPoolSizeText

		// End of user code
		return parent;
	}

	
	protected Composite createWsWorkerThreadPoolSizeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize, EsbMessages.InboundEndpointPropertiesEditionPart_WsWorkerThreadPoolSizeLabel);
		wsWorkerThreadPoolSize = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wsWorkerThreadPoolSize.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wsWorkerThreadPoolSizeData = new GridData(GridData.FILL_HORIZONTAL);
		wsWorkerThreadPoolSize.setLayoutData(wsWorkerThreadPoolSizeData);
		wsWorkerThreadPoolSize.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsWorkerThreadPoolSize.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wsWorkerThreadPoolSize.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wsWorkerThreadPoolSize.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsWorkerThreadPoolSize.getText()));
				}
			}
		});
		EditingUtils.setID(wsWorkerThreadPoolSize, EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize);
		EditingUtils.setEEFtype(wsWorkerThreadPoolSize, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsWorkerThreadPoolSizeText

		// End of user code
		return parent;
	}

	
	protected Composite createWsSubprotocolHandlerClassText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass, EsbMessages.InboundEndpointPropertiesEditionPart_WsSubprotocolHandlerClassLabel);
		wsSubprotocolHandlerClass = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wsSubprotocolHandlerClass.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wsSubprotocolHandlerClassData = new GridData(GridData.FILL_HORIZONTAL);
		wsSubprotocolHandlerClass.setLayoutData(wsSubprotocolHandlerClassData);
		wsSubprotocolHandlerClass.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsSubprotocolHandlerClass.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wsSubprotocolHandlerClass.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wsSubprotocolHandlerClass.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsSubprotocolHandlerClass.getText()));
				}
			}
		});
		EditingUtils.setID(wsSubprotocolHandlerClass, EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass);
		EditingUtils.setEEFtype(wsSubprotocolHandlerClass, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsSubprotocolHandlerClassText

		// End of user code
		return parent;
	}

	
	protected Composite createWsPipelineHandlerClassText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass, EsbMessages.InboundEndpointPropertiesEditionPart_WsPipelineHandlerClassLabel);
		wsPipelineHandlerClass = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wsPipelineHandlerClass.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wsPipelineHandlerClassData = new GridData(GridData.FILL_HORIZONTAL);
		wsPipelineHandlerClass.setLayoutData(wsPipelineHandlerClassData);
		wsPipelineHandlerClass.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsPipelineHandlerClass.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wsPipelineHandlerClass.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wsPipelineHandlerClass.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsPipelineHandlerClass.getText()));
				}
			}
		});
		EditingUtils.setID(wsPipelineHandlerClass, EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass);
		EditingUtils.setEEFtype(wsPipelineHandlerClass, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsPipelineHandlerClassText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportFeedURLText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL, EsbMessages.InboundEndpointPropertiesEditionPart_TransportFeedURLLabel);
		transportFeedURL = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportFeedURL.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportFeedURLData = new GridData(GridData.FILL_HORIZONTAL);
		transportFeedURL.setLayoutData(transportFeedURLData);
		transportFeedURL.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportFeedURL.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportFeedURL.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportFeedURL.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportFeedURL.getText()));
				}
			}
		});
		EditingUtils.setID(transportFeedURL, EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL);
		EditingUtils.setEEFtype(transportFeedURL, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportFeedURLText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportFeedTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportFeedType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportFeedTypeLabel);
		transportFeedType = new EMFComboViewer(parent);
		transportFeedType.setContentProvider(new ArrayContentProvider());
		transportFeedType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportFeedTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportFeedType.getCombo().setLayoutData(transportFeedTypeData);
		transportFeedType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportFeedType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportFeedType()));
			}

		});
		transportFeedType.setID(EsbViewsRepository.InboundEndpoint.Properties.transportFeedType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportFeedType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportFeedTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTraceEnabledCheckbox(FormToolkit widgetFactory, Composite parent) {
		traceEnabled = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.traceEnabled, EsbMessages.InboundEndpointPropertiesEditionPart_TraceEnabledLabel), SWT.CHECK);
		traceEnabled.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.traceEnabled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(traceEnabled.getSelection())));
			}

		});
		GridData traceEnabledData = new GridData(GridData.FILL_HORIZONTAL);
		traceEnabledData.horizontalSpan = 2;
		traceEnabled.setLayoutData(traceEnabledData);
		EditingUtils.setID(traceEnabled, EsbViewsRepository.InboundEndpoint.Properties.traceEnabled);
		EditingUtils.setEEFtype(traceEnabled, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.traceEnabled, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTraceEnabledCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createStatisticsEnabledCheckbox(FormToolkit widgetFactory, Composite parent) {
		statisticsEnabled = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled, EsbMessages.InboundEndpointPropertiesEditionPart_StatisticsEnabledLabel), SWT.CHECK);
		statisticsEnabled.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(statisticsEnabled.getSelection())));
			}

		});
		GridData statisticsEnabledData = new GridData(GridData.FILL_HORIZONTAL);
		statisticsEnabledData.horizontalSpan = 2;
		statisticsEnabled.setLayoutData(statisticsEnabledData);
		EditingUtils.setID(statisticsEnabled, EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled);
		EditingUtils.setEEFtype(statisticsEnabled, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStatisticsEnabledCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSRetriesBeforeSuspensionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSRetriesBeforeSuspensionLabel);
		transportJMSRetriesBeforeSuspension = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSRetriesBeforeSuspension.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSRetriesBeforeSuspensionData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSRetriesBeforeSuspension.setLayoutData(transportJMSRetriesBeforeSuspensionData);
		transportJMSRetriesBeforeSuspension.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSRetriesBeforeSuspension.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSRetriesBeforeSuspension.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSRetriesBeforeSuspension.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSRetriesBeforeSuspension.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSRetriesBeforeSuspension, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension);
		EditingUtils.setEEFtype(transportJMSRetriesBeforeSuspension, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSRetriesBeforeSuspensionText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSResetConnectionOnPollingSuspensionCheckbox(FormToolkit widgetFactory, Composite parent) {
		transportJMSResetConnectionOnPollingSuspension = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSResetConnectionOnPollingSuspensionLabel), SWT.CHECK);
		transportJMSResetConnectionOnPollingSuspension.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportJMSResetConnectionOnPollingSuspension.getSelection())));
			}

		});
		GridData transportJMSResetConnectionOnPollingSuspensionData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSResetConnectionOnPollingSuspensionData.horizontalSpan = 2;
		transportJMSResetConnectionOnPollingSuspension.setLayoutData(transportJMSResetConnectionOnPollingSuspensionData);
		EditingUtils.setID(transportJMSResetConnectionOnPollingSuspension, EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension);
		EditingUtils.setEEFtype(transportJMSResetConnectionOnPollingSuspension, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSResetConnectionOnPollingSuspensionCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSPollingSuspensionPeriodText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSPollingSuspensionPeriodLabel);
		transportJMSPollingSuspensionPeriod = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSPollingSuspensionPeriod.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSPollingSuspensionPeriodData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSPollingSuspensionPeriod.setLayoutData(transportJMSPollingSuspensionPeriodData);
		transportJMSPollingSuspensionPeriod.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPollingSuspensionPeriod.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSPollingSuspensionPeriod.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSPollingSuspensionPeriod.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPollingSuspensionPeriod.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSPollingSuspensionPeriod, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod);
		EditingUtils.setEEFtype(transportJMSPollingSuspensionPeriod, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSPollingSuspensionPeriodText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslKeystoreLocationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslKeystoreLocationLabel);
		transportMQTTSslKeystoreLocation = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTSslKeystoreLocation.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTSslKeystoreLocationData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslKeystoreLocation.setLayoutData(transportMQTTSslKeystoreLocationData);
		transportMQTTSslKeystoreLocation.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslKeystoreLocation.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTSslKeystoreLocation.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTSslKeystoreLocation.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslKeystoreLocation.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTSslKeystoreLocation, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation);
		EditingUtils.setEEFtype(transportMQTTSslKeystoreLocation, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslKeystoreLocationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslKeystoreTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslKeystoreTypeLabel);
		transportMQTTSslKeystoreType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTSslKeystoreType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTSslKeystoreTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslKeystoreType.setLayoutData(transportMQTTSslKeystoreTypeData);
		transportMQTTSslKeystoreType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslKeystoreType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTSslKeystoreType.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTSslKeystoreType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslKeystoreType.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTSslKeystoreType, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType);
		EditingUtils.setEEFtype(transportMQTTSslKeystoreType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslKeystoreTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslKeystorePasswordText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslKeystorePasswordLabel);
		transportMQTTSslKeystorePassword = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTSslKeystorePassword.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTSslKeystorePasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslKeystorePassword.setLayoutData(transportMQTTSslKeystorePasswordData);
		transportMQTTSslKeystorePassword.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslKeystorePassword.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTSslKeystorePassword.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTSslKeystorePassword.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslKeystorePassword.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTSslKeystorePassword, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword);
		EditingUtils.setEEFtype(transportMQTTSslKeystorePassword, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslKeystorePasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslTruststoreLocationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslTruststoreLocationLabel);
		transportMQTTSslTruststoreLocation = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTSslTruststoreLocation.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTSslTruststoreLocationData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslTruststoreLocation.setLayoutData(transportMQTTSslTruststoreLocationData);
		transportMQTTSslTruststoreLocation.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslTruststoreLocation.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTSslTruststoreLocation.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTSslTruststoreLocation.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslTruststoreLocation.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTSslTruststoreLocation, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation);
		EditingUtils.setEEFtype(transportMQTTSslTruststoreLocation, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslTruststoreLocationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslTruststoreTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslTruststoreTypeLabel);
		transportMQTTSslTruststoreType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTSslTruststoreType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTSslTruststoreTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslTruststoreType.setLayoutData(transportMQTTSslTruststoreTypeData);
		transportMQTTSslTruststoreType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslTruststoreType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTSslTruststoreType.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTSslTruststoreType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslTruststoreType.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTSslTruststoreType, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType);
		EditingUtils.setEEFtype(transportMQTTSslTruststoreType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslTruststoreTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslTruststorePasswordText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslTruststorePasswordLabel);
		transportMQTTSslTruststorePassword = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTSslTruststorePassword.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTSslTruststorePasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslTruststorePassword.setLayoutData(transportMQTTSslTruststorePasswordData);
		transportMQTTSslTruststorePassword.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslTruststorePassword.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTSslTruststorePassword.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTSslTruststorePassword.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslTruststorePassword.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTSslTruststorePassword, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword);
		EditingUtils.setEEFtype(transportMQTTSslTruststorePassword, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslTruststorePasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslVersionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslVersionLabel);
		transportMQTTSslVersion = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportMQTTSslVersion.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportMQTTSslVersionData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslVersion.setLayoutData(transportMQTTSslVersionData);
		transportMQTTSslVersion.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslVersion.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportMQTTSslVersion.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportMQTTSslVersion.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslVersion.getText()));
				}
			}
		});
		EditingUtils.setID(transportMQTTSslVersion, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion);
		EditingUtils.setEEFtype(transportMQTTSslVersion, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslKeyStoreFileText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslKeyStoreFileLabel);
		wssSslKeyStoreFile = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wssSslKeyStoreFile.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wssSslKeyStoreFileData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslKeyStoreFile.setLayoutData(wssSslKeyStoreFileData);
		wssSslKeyStoreFile.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslKeyStoreFile.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wssSslKeyStoreFile.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wssSslKeyStoreFile.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslKeyStoreFile.getText()));
				}
			}
		});
		EditingUtils.setID(wssSslKeyStoreFile, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile);
		EditingUtils.setEEFtype(wssSslKeyStoreFile, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslKeyStoreFileText

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslKeyStorePassText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslKeyStorePassLabel);
		wssSslKeyStorePass = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wssSslKeyStorePass.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wssSslKeyStorePassData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslKeyStorePass.setLayoutData(wssSslKeyStorePassData);
		wssSslKeyStorePass.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslKeyStorePass.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wssSslKeyStorePass.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wssSslKeyStorePass.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslKeyStorePass.getText()));
				}
			}
		});
		EditingUtils.setID(wssSslKeyStorePass, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass);
		EditingUtils.setEEFtype(wssSslKeyStorePass, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslKeyStorePassText

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslTrustStoreFileText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslTrustStoreFileLabel);
		wssSslTrustStoreFile = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wssSslTrustStoreFile.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wssSslTrustStoreFileData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslTrustStoreFile.setLayoutData(wssSslTrustStoreFileData);
		wssSslTrustStoreFile.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslTrustStoreFile.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wssSslTrustStoreFile.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wssSslTrustStoreFile.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslTrustStoreFile.getText()));
				}
			}
		});
		EditingUtils.setID(wssSslTrustStoreFile, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile);
		EditingUtils.setEEFtype(wssSslTrustStoreFile, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslTrustStoreFileText

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslTrustStorePassText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslTrustStorePassLabel);
		wssSslTrustStorePass = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wssSslTrustStorePass.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wssSslTrustStorePassData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslTrustStorePass.setLayoutData(wssSslTrustStorePassData);
		wssSslTrustStorePass.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslTrustStorePass.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wssSslTrustStorePass.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wssSslTrustStorePass.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslTrustStorePass.getText()));
				}
			}
		});
		EditingUtils.setID(wssSslTrustStorePass, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass);
		EditingUtils.setEEFtype(wssSslTrustStorePass, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslTrustStorePassText

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslCertPassText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslCertPassLabel);
		wssSslCertPass = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wssSslCertPass.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wssSslCertPassData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslCertPass.setLayoutData(wssSslCertPassData);
		wssSslCertPass.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslCertPass.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wssSslCertPass.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wssSslCertPass.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslCertPass.getText()));
				}
			}
		});
		EditingUtils.setID(wssSslCertPass, EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass);
		EditingUtils.setEEFtype(wssSslCertPass, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslCertPassText

		// End of user code
		return parent;
	}

	
	protected Composite createWsDefaultContentTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType, EsbMessages.InboundEndpointPropertiesEditionPart_WsDefaultContentTypeLabel);
		wsDefaultContentType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wsDefaultContentType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wsDefaultContentTypeData = new GridData(GridData.FILL_HORIZONTAL);
		wsDefaultContentType.setLayoutData(wsDefaultContentTypeData);
		wsDefaultContentType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsDefaultContentType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wsDefaultContentType.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wsDefaultContentType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsDefaultContentType.getText()));
				}
			}
		});
		EditingUtils.setID(wsDefaultContentType, EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType);
		EditingUtils.setEEFtype(wsDefaultContentType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsDefaultContentTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createWsShutdownStatusCodeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode, EsbMessages.InboundEndpointPropertiesEditionPart_WsShutdownStatusCodeLabel);
		wsShutdownStatusCode = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wsShutdownStatusCode.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wsShutdownStatusCodeData = new GridData(GridData.FILL_HORIZONTAL);
		wsShutdownStatusCode.setLayoutData(wsShutdownStatusCodeData);
		wsShutdownStatusCode.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsShutdownStatusCode.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wsShutdownStatusCode.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wsShutdownStatusCode.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsShutdownStatusCode.getText()));
				}
			}
		});
		EditingUtils.setID(wsShutdownStatusCode, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode);
		EditingUtils.setEEFtype(wsShutdownStatusCode, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsShutdownStatusCodeText

		// End of user code
		return parent;
	}

	
	protected Composite createWsShutdownStatusMessageText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage, EsbMessages.InboundEndpointPropertiesEditionPart_WsShutdownStatusMessageLabel);
		wsShutdownStatusMessage = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wsShutdownStatusMessage.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wsShutdownStatusMessageData = new GridData(GridData.FILL_HORIZONTAL);
		wsShutdownStatusMessage.setLayoutData(wsShutdownStatusMessageData);
		wsShutdownStatusMessage.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsShutdownStatusMessage.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wsShutdownStatusMessage.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wsShutdownStatusMessage.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsShutdownStatusMessage.getText()));
				}
			}
		});
		EditingUtils.setID(wsShutdownStatusMessage, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage);
		EditingUtils.setEEFtype(wsShutdownStatusMessage, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsShutdownStatusMessageText

		// End of user code
		return parent;
	}

	
	protected Composite createWsUsePortOffsetCheckbox(FormToolkit widgetFactory, Composite parent) {
		wsUsePortOffset = widgetFactory.createButton(parent, getDescription(EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset, EsbMessages.InboundEndpointPropertiesEditionPart_WsUsePortOffsetLabel), SWT.CHECK);
		wsUsePortOffset.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(wsUsePortOffset.getSelection())));
			}

		});
		GridData wsUsePortOffsetData = new GridData(GridData.FILL_HORIZONTAL);
		wsUsePortOffsetData.horizontalSpan = 2;
		wsUsePortOffset.setLayoutData(wsUsePortOffsetData);
		EditingUtils.setID(wsUsePortOffset, EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset);
		EditingUtils.setEEFtype(wsUsePortOffset, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsUsePortOffsetCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslProtocolsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslProtocolsLabel);
		wssSslProtocols = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wssSslProtocols.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wssSslProtocolsData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslProtocols.setLayoutData(wssSslProtocolsData);
		wssSslProtocols.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslProtocols.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wssSslProtocols.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wssSslProtocols.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslProtocols.getText()));
				}
			}
		});
		EditingUtils.setID(wssSslProtocols, EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols);
		EditingUtils.setEEFtype(wssSslProtocols, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslProtocolsText

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslCipherSuitesText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslCipherSuitesLabel);
		wssSslCipherSuites = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		wssSslCipherSuites.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData wssSslCipherSuitesData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslCipherSuites.setLayoutData(wssSslCipherSuitesData);
		wssSslCipherSuites.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslCipherSuites.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, wssSslCipherSuites.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		wssSslCipherSuites.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslCipherSuites.getText()));
				}
			}
		});
		EditingUtils.setID(wssSslCipherSuites, EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites);
		EditingUtils.setEEFtype(wssSslCipherSuites, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslCipherSuitesText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConsumerQosText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConsumerQosLabel);
		transportRabbitMqConsumerQos = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportRabbitMqConsumerQos.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportRabbitMqConsumerQosData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConsumerQos.setLayoutData(transportRabbitMqConsumerQosData);
		transportRabbitMqConsumerQos.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConsumerQos.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportRabbitMqConsumerQos.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportRabbitMqConsumerQos.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConsumerQos.getText()));
				}
			}
		});
		EditingUtils.setID(transportRabbitMqConsumerQos, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos);
		EditingUtils.setEEFtype(transportRabbitMqConsumerQos, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConsumerQosText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConsumerQosTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConsumerQosTypeLabel);
		transportRabbitMqConsumerQosType = new EMFComboViewer(parent);
		transportRabbitMqConsumerQosType.setContentProvider(new ArrayContentProvider());
		transportRabbitMqConsumerQosType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportRabbitMqConsumerQosTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConsumerQosType.getCombo().setLayoutData(transportRabbitMqConsumerQosTypeData);
		transportRabbitMqConsumerQosType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportRabbitMqConsumerQosType()));
			}

		});
		transportRabbitMqConsumerQosType.setID(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConsumerQosTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSDBUrlText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSDBUrlLabel);
		transportJMSDBUrl = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		transportJMSDBUrl.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData transportJMSDBUrlData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSDBUrl.setLayoutData(transportJMSDBUrlData);
		transportJMSDBUrl.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDBUrl.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, transportJMSDBUrl.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		transportJMSDBUrl.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDBUrl.getText()));
				}
			}
		});
		EditingUtils.setID(transportJMSDBUrl, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl);
		EditingUtils.setEEFtype(transportJMSDBUrl, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSDBUrlText

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getCommentsList()
	 * 
	 */
	public EList getCommentsList() {
		return commentsListList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setCommentsList(EList newValue)
	 * 
	 */
	public void setCommentsList(EList newValue) {
		commentsListList = newValue;
		if (newValue != null) {
			commentsList.setText(commentsListList.toString());
		} else {
			commentsList.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.commentsList);
		if (eefElementEditorReadOnlyState && commentsList.isEnabled()) {
			commentsList.setEnabled(false);
			commentsList.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !commentsList.isEnabled()) {
			commentsList.setEnabled(true);
		}	
		
	}

	public void addToCommentsList(Object newValue) {
		commentsListList.add(newValue);
		if (newValue != null) {
			commentsList.setText(commentsListList.toString());
		} else {
			commentsList.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToCommentsList(Object newValue) {
		commentsListList.remove(newValue);
		if (newValue != null) {
			commentsList.setText(commentsListList.toString());
		} else {
			commentsList.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initType(Object input, Enumerator current)
	 */
	public void initType(Object input, Enumerator current) {
		type.setInput(input);
		type.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setType(Enumerator newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getClass_()
	 * 
	 */
	public String getClass_() {
		return class_.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setClass_(String newValue)
	 * 
	 */
	public void setClass_(String newValue) {
		if (newValue != null) {
			class_.setText(newValue);
		} else {
			class_.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.class_);
		if (eefElementEditorReadOnlyState && class_.isEnabled()) {
			class_.setEnabled(false);
			class_.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !class_.isEnabled()) {
			class_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getProtocol()
	 * 
	 */
	public String getProtocol() {
		return protocol.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setProtocol(String newValue)
	 * 
	 */
	public void setProtocol(String newValue) {
		if (newValue != null) {
			protocol.setText(newValue);
		} else {
			protocol.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.protocol);
		if (eefElementEditorReadOnlyState && protocol.isEnabled()) {
			protocol.setEnabled(false);
			protocol.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !protocol.isEnabled()) {
			protocol.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundEndpointBehaviour()
	 * 
	 */
	public Enumerator getInboundEndpointBehaviour() {
		Enumerator selection = (Enumerator) ((StructuredSelection) inboundEndpointBehaviour.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initInboundEndpointBehaviour(Object input, Enumerator current)
	 */
	public void initInboundEndpointBehaviour(Object input, Enumerator current) {
		inboundEndpointBehaviour.setInput(input);
		inboundEndpointBehaviour.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour);
		if (eefElementEditorReadOnlyState && inboundEndpointBehaviour.isEnabled()) {
			inboundEndpointBehaviour.setEnabled(false);
			inboundEndpointBehaviour.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundEndpointBehaviour.isEnabled()) {
			inboundEndpointBehaviour.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundEndpointBehaviour(Enumerator newValue)
	 * 
	 */
	public void setInboundEndpointBehaviour(Enumerator newValue) {
		inboundEndpointBehaviour.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour);
		if (eefElementEditorReadOnlyState && inboundEndpointBehaviour.isEnabled()) {
			inboundEndpointBehaviour.setEnabled(false);
			inboundEndpointBehaviour.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundEndpointBehaviour.isEnabled()) {
			inboundEndpointBehaviour.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHttpPort()
	 * 
	 */
	public String getInboundHttpPort() {
		return inboundHttpPort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHttpPort(String newValue)
	 * 
	 */
	public void setInboundHttpPort(String newValue) {
		if (newValue != null) {
			inboundHttpPort.setText(newValue);
		} else {
			inboundHttpPort.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort);
		if (eefElementEditorReadOnlyState && inboundHttpPort.isEnabled()) {
			inboundHttpPort.setEnabled(false);
			inboundHttpPort.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHttpPort.isEnabled()) {
			inboundHttpPort.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundWorkerPoolSizeCore()
	 * 
	 */
	public String getInboundWorkerPoolSizeCore() {
		return inboundWorkerPoolSizeCore.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundWorkerPoolSizeCore(String newValue)
	 * 
	 */
	public void setInboundWorkerPoolSizeCore(String newValue) {
		if (newValue != null) {
			inboundWorkerPoolSizeCore.setText(newValue);
		} else {
			inboundWorkerPoolSizeCore.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore);
		if (eefElementEditorReadOnlyState && inboundWorkerPoolSizeCore.isEnabled()) {
			inboundWorkerPoolSizeCore.setEnabled(false);
			inboundWorkerPoolSizeCore.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundWorkerPoolSizeCore.isEnabled()) {
			inboundWorkerPoolSizeCore.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundWorkerPoolSizeMax()
	 * 
	 */
	public String getInboundWorkerPoolSizeMax() {
		return inboundWorkerPoolSizeMax.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundWorkerPoolSizeMax(String newValue)
	 * 
	 */
	public void setInboundWorkerPoolSizeMax(String newValue) {
		if (newValue != null) {
			inboundWorkerPoolSizeMax.setText(newValue);
		} else {
			inboundWorkerPoolSizeMax.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax);
		if (eefElementEditorReadOnlyState && inboundWorkerPoolSizeMax.isEnabled()) {
			inboundWorkerPoolSizeMax.setEnabled(false);
			inboundWorkerPoolSizeMax.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundWorkerPoolSizeMax.isEnabled()) {
			inboundWorkerPoolSizeMax.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundWorkerThreadKeepAliveSec()
	 * 
	 */
	public String getInboundWorkerThreadKeepAliveSec() {
		return inboundWorkerThreadKeepAliveSec.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundWorkerThreadKeepAliveSec(String newValue)
	 * 
	 */
	public void setInboundWorkerThreadKeepAliveSec(String newValue) {
		if (newValue != null) {
			inboundWorkerThreadKeepAliveSec.setText(newValue);
		} else {
			inboundWorkerThreadKeepAliveSec.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec);
		if (eefElementEditorReadOnlyState && inboundWorkerThreadKeepAliveSec.isEnabled()) {
			inboundWorkerThreadKeepAliveSec.setEnabled(false);
			inboundWorkerThreadKeepAliveSec.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundWorkerThreadKeepAliveSec.isEnabled()) {
			inboundWorkerThreadKeepAliveSec.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundWorkerPoolQueueLength()
	 * 
	 */
	public String getInboundWorkerPoolQueueLength() {
		return inboundWorkerPoolQueueLength.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundWorkerPoolQueueLength(String newValue)
	 * 
	 */
	public void setInboundWorkerPoolQueueLength(String newValue) {
		if (newValue != null) {
			inboundWorkerPoolQueueLength.setText(newValue);
		} else {
			inboundWorkerPoolQueueLength.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength);
		if (eefElementEditorReadOnlyState && inboundWorkerPoolQueueLength.isEnabled()) {
			inboundWorkerPoolQueueLength.setEnabled(false);
			inboundWorkerPoolQueueLength.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundWorkerPoolQueueLength.isEnabled()) {
			inboundWorkerPoolQueueLength.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundThreadGroupId()
	 * 
	 */
	public String getInboundThreadGroupId() {
		return inboundThreadGroupId.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundThreadGroupId(String newValue)
	 * 
	 */
	public void setInboundThreadGroupId(String newValue) {
		if (newValue != null) {
			inboundThreadGroupId.setText(newValue);
		} else {
			inboundThreadGroupId.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId);
		if (eefElementEditorReadOnlyState && inboundThreadGroupId.isEnabled()) {
			inboundThreadGroupId.setEnabled(false);
			inboundThreadGroupId.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundThreadGroupId.isEnabled()) {
			inboundThreadGroupId.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundThreadId()
	 * 
	 */
	public String getInboundThreadId() {
		return inboundThreadId.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundThreadId(String newValue)
	 * 
	 */
	public void setInboundThreadId(String newValue) {
		if (newValue != null) {
			inboundThreadId.setText(newValue);
		} else {
			inboundThreadId.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId);
		if (eefElementEditorReadOnlyState && inboundThreadId.isEnabled()) {
			inboundThreadId.setEnabled(false);
			inboundThreadId.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundThreadId.isEnabled()) {
			inboundThreadId.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getDispatchFilterPattern()
	 * 
	 */
	public String getDispatchFilterPattern() {
		return dispatchFilterPattern.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setDispatchFilterPattern(String newValue)
	 * 
	 */
	public void setDispatchFilterPattern(String newValue) {
		if (newValue != null) {
			dispatchFilterPattern.setText(newValue);
		} else {
			dispatchFilterPattern.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern);
		if (eefElementEditorReadOnlyState && dispatchFilterPattern.isEnabled()) {
			dispatchFilterPattern.setEnabled(false);
			dispatchFilterPattern.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dispatchFilterPattern.isEnabled()) {
			dispatchFilterPattern.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInterval()
	 * 
	 */
	public String getInterval() {
		return interval.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInterval(String newValue)
	 * 
	 */
	public void setInterval(String newValue) {
		if (newValue != null) {
			interval.setText(newValue);
		} else {
			interval.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.interval);
		if (eefElementEditorReadOnlyState && interval.isEnabled()) {
			interval.setEnabled(false);
			interval.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !interval.isEnabled()) {
			interval.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSequential()
	 * 
	 */
	public Boolean getSequential() {
		return Boolean.valueOf(sequential.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSequential(Boolean newValue)
	 * 
	 */
	public void setSequential(Boolean newValue) {
		if (newValue != null) {
			sequential.setSelection(newValue.booleanValue());
		} else {
			sequential.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.sequential);
		if (eefElementEditorReadOnlyState && sequential.isEnabled()) {
			sequential.setEnabled(false);
			sequential.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sequential.isEnabled()) {
			sequential.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getCoordination()
	 * 
	 */
	public Boolean getCoordination() {
		return Boolean.valueOf(coordination.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setCoordination(Boolean newValue)
	 * 
	 */
	public void setCoordination(Boolean newValue) {
		if (newValue != null) {
			coordination.setSelection(newValue.booleanValue());
		} else {
			coordination.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.coordination);
		if (eefElementEditorReadOnlyState && coordination.isEnabled()) {
			coordination.setEnabled(false);
			coordination.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !coordination.isEnabled()) {
			coordination.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFileURI()
	 * 
	 */
	public String getTransportVFSFileURI() {
		return transportVFSFileURI.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFileURI(String newValue)
	 * 
	 */
	public void setTransportVFSFileURI(String newValue) {
		if (newValue != null) {
			transportVFSFileURI.setText(newValue);
		} else {
			transportVFSFileURI.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI);
		if (eefElementEditorReadOnlyState && transportVFSFileURI.isEnabled()) {
			transportVFSFileURI.setEnabled(false);
			transportVFSFileURI.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileURI.isEnabled()) {
			transportVFSFileURI.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWso2mbConnectionUrl()
	 * 
	 */
	public String getWso2mbConnectionUrl() {
		return wso2mbConnectionUrl.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWso2mbConnectionUrl(String newValue)
	 * 
	 */
	public void setWso2mbConnectionUrl(String newValue) {
		if (newValue != null) {
			wso2mbConnectionUrl.setText(newValue);
		} else {
			wso2mbConnectionUrl.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl);
		if (eefElementEditorReadOnlyState && wso2mbConnectionUrl.isEnabled()) {
			wso2mbConnectionUrl.setEnabled(false);
			wso2mbConnectionUrl.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wso2mbConnectionUrl.isEnabled()) {
			wso2mbConnectionUrl.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSContentType()
	 * 
	 */
	public String getTransportVFSContentType() {
		return transportVFSContentType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSContentType(String newValue)
	 * 
	 */
	public void setTransportVFSContentType(String newValue) {
		if (newValue != null) {
			transportVFSContentType.setText(newValue);
		} else {
			transportVFSContentType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType);
		if (eefElementEditorReadOnlyState && transportVFSContentType.isEnabled()) {
			transportVFSContentType.setEnabled(false);
			transportVFSContentType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSContentType.isEnabled()) {
			transportVFSContentType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFileNamePattern()
	 * 
	 */
	public String getTransportVFSFileNamePattern() {
		return transportVFSFileNamePattern.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFileNamePattern(String newValue)
	 * 
	 */
	public void setTransportVFSFileNamePattern(String newValue) {
		if (newValue != null) {
			transportVFSFileNamePattern.setText(newValue);
		} else {
			transportVFSFileNamePattern.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern);
		if (eefElementEditorReadOnlyState && transportVFSFileNamePattern.isEnabled()) {
			transportVFSFileNamePattern.setEnabled(false);
			transportVFSFileNamePattern.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileNamePattern.isEnabled()) {
			transportVFSFileNamePattern.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFileProcessInterval()
	 * 
	 */
	public String getTransportVFSFileProcessInterval() {
		return transportVFSFileProcessInterval.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFileProcessInterval(String newValue)
	 * 
	 */
	public void setTransportVFSFileProcessInterval(String newValue) {
		if (newValue != null) {
			transportVFSFileProcessInterval.setText(newValue);
		} else {
			transportVFSFileProcessInterval.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval);
		if (eefElementEditorReadOnlyState && transportVFSFileProcessInterval.isEnabled()) {
			transportVFSFileProcessInterval.setEnabled(false);
			transportVFSFileProcessInterval.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileProcessInterval.isEnabled()) {
			transportVFSFileProcessInterval.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFileProcessCount()
	 * 
	 */
	public String getTransportVFSFileProcessCount() {
		return transportVFSFileProcessCount.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFileProcessCount(String newValue)
	 * 
	 */
	public void setTransportVFSFileProcessCount(String newValue) {
		if (newValue != null) {
			transportVFSFileProcessCount.setText(newValue);
		} else {
			transportVFSFileProcessCount.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount);
		if (eefElementEditorReadOnlyState && transportVFSFileProcessCount.isEnabled()) {
			transportVFSFileProcessCount.setEnabled(false);
			transportVFSFileProcessCount.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileProcessCount.isEnabled()) {
			transportVFSFileProcessCount.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSLocking()
	 * 
	 */
	public Enumerator getTransportVFSLocking() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportVFSLocking.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportVFSLocking(Object input, Enumerator current)
	 */
	public void initTransportVFSLocking(Object input, Enumerator current) {
		transportVFSLocking.setInput(input);
		transportVFSLocking.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking);
		if (eefElementEditorReadOnlyState && transportVFSLocking.isEnabled()) {
			transportVFSLocking.setEnabled(false);
			transportVFSLocking.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSLocking.isEnabled()) {
			transportVFSLocking.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSLocking(Enumerator newValue)
	 * 
	 */
	public void setTransportVFSLocking(Enumerator newValue) {
		transportVFSLocking.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking);
		if (eefElementEditorReadOnlyState && transportVFSLocking.isEnabled()) {
			transportVFSLocking.setEnabled(false);
			transportVFSLocking.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSLocking.isEnabled()) {
			transportVFSLocking.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMaxRetryCount()
	 * 
	 */
	public String getTransportVFSMaxRetryCount() {
		return transportVFSMaxRetryCount.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMaxRetryCount(String newValue)
	 * 
	 */
	public void setTransportVFSMaxRetryCount(String newValue) {
		if (newValue != null) {
			transportVFSMaxRetryCount.setText(newValue);
		} else {
			transportVFSMaxRetryCount.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount);
		if (eefElementEditorReadOnlyState && transportVFSMaxRetryCount.isEnabled()) {
			transportVFSMaxRetryCount.setEnabled(false);
			transportVFSMaxRetryCount.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMaxRetryCount.isEnabled()) {
			transportVFSMaxRetryCount.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMoveAfterFailedMove()
	 * 
	 */
	public String getTransportVFSMoveAfterFailedMove() {
		return transportVFSMoveAfterFailedMove.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMoveAfterFailedMove(String newValue)
	 * 
	 */
	public void setTransportVFSMoveAfterFailedMove(String newValue) {
		if (newValue != null) {
			transportVFSMoveAfterFailedMove.setText(newValue);
		} else {
			transportVFSMoveAfterFailedMove.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove);
		if (eefElementEditorReadOnlyState && transportVFSMoveAfterFailedMove.isEnabled()) {
			transportVFSMoveAfterFailedMove.setEnabled(false);
			transportVFSMoveAfterFailedMove.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMoveAfterFailedMove.isEnabled()) {
			transportVFSMoveAfterFailedMove.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSReconnectTimeout()
	 * 
	 */
	public String getTransportVFSReconnectTimeout() {
		return transportVFSReconnectTimeout.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSReconnectTimeout(String newValue)
	 * 
	 */
	public void setTransportVFSReconnectTimeout(String newValue) {
		if (newValue != null) {
			transportVFSReconnectTimeout.setText(newValue);
		} else {
			transportVFSReconnectTimeout.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout);
		if (eefElementEditorReadOnlyState && transportVFSReconnectTimeout.isEnabled()) {
			transportVFSReconnectTimeout.setEnabled(false);
			transportVFSReconnectTimeout.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSReconnectTimeout.isEnabled()) {
			transportVFSReconnectTimeout.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSSharedSubscription()
	 * 
	 */
	public Boolean getTransportJMSSharedSubscription() {
		return Boolean.valueOf(transportJMSSharedSubscription.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSSharedSubscription(Boolean newValue)
	 * 
	 */
	public void setTransportJMSSharedSubscription(Boolean newValue) {
		if (newValue != null) {
			transportJMSSharedSubscription.setSelection(newValue.booleanValue());
		} else {
			transportJMSSharedSubscription.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription);
		if (eefElementEditorReadOnlyState && transportJMSSharedSubscription.isEnabled()) {
			transportJMSSharedSubscription.setEnabled(false);
			transportJMSSharedSubscription.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSSharedSubscription.isEnabled()) {
			transportJMSSharedSubscription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSSubscriptionName()
	 * 
	 */
	public String getTransportJMSSubscriptionName() {
		return transportJMSSubscriptionName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSSubscriptionName(String newValue)
	 * 
	 */
	public void setTransportJMSSubscriptionName(String newValue) {
		if (newValue != null) {
			transportJMSSubscriptionName.setText(newValue);
		} else {
			transportJMSSubscriptionName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName);
		if (eefElementEditorReadOnlyState && transportJMSSubscriptionName.isEnabled()) {
			transportJMSSubscriptionName.setEnabled(false);
			transportJMSSubscriptionName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSSubscriptionName.isEnabled()) {
			transportJMSSubscriptionName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSPinnedServers()
	 * 
	 */
	public String getTransportJMSPinnedServers() {
		return transportJMSPinnedServers.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSPinnedServers(String newValue)
	 * 
	 */
	public void setTransportJMSPinnedServers(String newValue) {
		if (newValue != null) {
			transportJMSPinnedServers.setText(newValue);
		} else {
			transportJMSPinnedServers.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers);
		if (eefElementEditorReadOnlyState && transportJMSPinnedServers.isEnabled()) {
			transportJMSPinnedServers.setEnabled(false);
			transportJMSPinnedServers.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSPinnedServers.isEnabled()) {
			transportJMSPinnedServers.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSActionAfterProcess()
	 * 
	 */
	public Enumerator getTransportVFSActionAfterProcess() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportVFSActionAfterProcess.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportVFSActionAfterProcess(Object input, Enumerator current)
	 */
	public void initTransportVFSActionAfterProcess(Object input, Enumerator current) {
		transportVFSActionAfterProcess.setInput(input);
		transportVFSActionAfterProcess.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess);
		if (eefElementEditorReadOnlyState && transportVFSActionAfterProcess.isEnabled()) {
			transportVFSActionAfterProcess.setEnabled(false);
			transportVFSActionAfterProcess.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSActionAfterProcess.isEnabled()) {
			transportVFSActionAfterProcess.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSActionAfterProcess(Enumerator newValue)
	 * 
	 */
	public void setTransportVFSActionAfterProcess(Enumerator newValue) {
		transportVFSActionAfterProcess.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess);
		if (eefElementEditorReadOnlyState && transportVFSActionAfterProcess.isEnabled()) {
			transportVFSActionAfterProcess.setEnabled(false);
			transportVFSActionAfterProcess.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSActionAfterProcess.isEnabled()) {
			transportVFSActionAfterProcess.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMoveAfterProcess()
	 * 
	 */
	public String getTransportVFSMoveAfterProcess() {
		return transportVFSMoveAfterProcess.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMoveAfterProcess(String newValue)
	 * 
	 */
	public void setTransportVFSMoveAfterProcess(String newValue) {
		if (newValue != null) {
			transportVFSMoveAfterProcess.setText(newValue);
		} else {
			transportVFSMoveAfterProcess.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess);
		if (eefElementEditorReadOnlyState && transportVFSMoveAfterProcess.isEnabled()) {
			transportVFSMoveAfterProcess.setEnabled(false);
			transportVFSMoveAfterProcess.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMoveAfterProcess.isEnabled()) {
			transportVFSMoveAfterProcess.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSActionAfterErrors()
	 * 
	 */
	public Enumerator getTransportVFSActionAfterErrors() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportVFSActionAfterErrors.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportVFSActionAfterErrors(Object input, Enumerator current)
	 */
	public void initTransportVFSActionAfterErrors(Object input, Enumerator current) {
		transportVFSActionAfterErrors.setInput(input);
		transportVFSActionAfterErrors.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors);
		if (eefElementEditorReadOnlyState && transportVFSActionAfterErrors.isEnabled()) {
			transportVFSActionAfterErrors.setEnabled(false);
			transportVFSActionAfterErrors.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSActionAfterErrors.isEnabled()) {
			transportVFSActionAfterErrors.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSActionAfterErrors(Enumerator newValue)
	 * 
	 */
	public void setTransportVFSActionAfterErrors(Enumerator newValue) {
		transportVFSActionAfterErrors.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors);
		if (eefElementEditorReadOnlyState && transportVFSActionAfterErrors.isEnabled()) {
			transportVFSActionAfterErrors.setEnabled(false);
			transportVFSActionAfterErrors.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSActionAfterErrors.isEnabled()) {
			transportVFSActionAfterErrors.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMoveAfterErrors()
	 * 
	 */
	public String getTransportVFSMoveAfterErrors() {
		return transportVFSMoveAfterErrors.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMoveAfterErrors(String newValue)
	 * 
	 */
	public void setTransportVFSMoveAfterErrors(String newValue) {
		if (newValue != null) {
			transportVFSMoveAfterErrors.setText(newValue);
		} else {
			transportVFSMoveAfterErrors.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors);
		if (eefElementEditorReadOnlyState && transportVFSMoveAfterErrors.isEnabled()) {
			transportVFSMoveAfterErrors.setEnabled(false);
			transportVFSMoveAfterErrors.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMoveAfterErrors.isEnabled()) {
			transportVFSMoveAfterErrors.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFailedRecordsFileName()
	 * 
	 */
	public String getTransportVFSFailedRecordsFileName() {
		return transportVFSFailedRecordsFileName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFailedRecordsFileName(String newValue)
	 * 
	 */
	public void setTransportVFSFailedRecordsFileName(String newValue) {
		if (newValue != null) {
			transportVFSFailedRecordsFileName.setText(newValue);
		} else {
			transportVFSFailedRecordsFileName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName);
		if (eefElementEditorReadOnlyState && transportVFSFailedRecordsFileName.isEnabled()) {
			transportVFSFailedRecordsFileName.setEnabled(false);
			transportVFSFailedRecordsFileName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFailedRecordsFileName.isEnabled()) {
			transportVFSFailedRecordsFileName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFailedRecordsFileDestination()
	 * 
	 */
	public String getTransportVFSFailedRecordsFileDestination() {
		return transportVFSFailedRecordsFileDestination.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFailedRecordsFileDestination(String newValue)
	 * 
	 */
	public void setTransportVFSFailedRecordsFileDestination(String newValue) {
		if (newValue != null) {
			transportVFSFailedRecordsFileDestination.setText(newValue);
		} else {
			transportVFSFailedRecordsFileDestination.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination);
		if (eefElementEditorReadOnlyState && transportVFSFailedRecordsFileDestination.isEnabled()) {
			transportVFSFailedRecordsFileDestination.setEnabled(false);
			transportVFSFailedRecordsFileDestination.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFailedRecordsFileDestination.isEnabled()) {
			transportVFSFailedRecordsFileDestination.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMoveFailedRecordTimestampFormat()
	 * 
	 */
	public String getTransportVFSMoveFailedRecordTimestampFormat() {
		return transportVFSMoveFailedRecordTimestampFormat.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMoveFailedRecordTimestampFormat(String newValue)
	 * 
	 */
	public void setTransportVFSMoveFailedRecordTimestampFormat(String newValue) {
		if (newValue != null) {
			transportVFSMoveFailedRecordTimestampFormat.setText(newValue);
		} else {
			transportVFSMoveFailedRecordTimestampFormat.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat);
		if (eefElementEditorReadOnlyState && transportVFSMoveFailedRecordTimestampFormat.isEnabled()) {
			transportVFSMoveFailedRecordTimestampFormat.setEnabled(false);
			transportVFSMoveFailedRecordTimestampFormat.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMoveFailedRecordTimestampFormat.isEnabled()) {
			transportVFSMoveFailedRecordTimestampFormat.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFailedRecordNextRetryDuration()
	 * 
	 */
	public String getTransportVFSFailedRecordNextRetryDuration() {
		return transportVFSFailedRecordNextRetryDuration.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFailedRecordNextRetryDuration(String newValue)
	 * 
	 */
	public void setTransportVFSFailedRecordNextRetryDuration(String newValue) {
		if (newValue != null) {
			transportVFSFailedRecordNextRetryDuration.setText(newValue);
		} else {
			transportVFSFailedRecordNextRetryDuration.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration);
		if (eefElementEditorReadOnlyState && transportVFSFailedRecordNextRetryDuration.isEnabled()) {
			transportVFSFailedRecordNextRetryDuration.setEnabled(false);
			transportVFSFailedRecordNextRetryDuration.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFailedRecordNextRetryDuration.isEnabled()) {
			transportVFSFailedRecordNextRetryDuration.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSActionAfterFailure()
	 * 
	 */
	public Enumerator getTransportVFSActionAfterFailure() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportVFSActionAfterFailure.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportVFSActionAfterFailure(Object input, Enumerator current)
	 */
	public void initTransportVFSActionAfterFailure(Object input, Enumerator current) {
		transportVFSActionAfterFailure.setInput(input);
		transportVFSActionAfterFailure.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure);
		if (eefElementEditorReadOnlyState && transportVFSActionAfterFailure.isEnabled()) {
			transportVFSActionAfterFailure.setEnabled(false);
			transportVFSActionAfterFailure.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSActionAfterFailure.isEnabled()) {
			transportVFSActionAfterFailure.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSActionAfterFailure(Enumerator newValue)
	 * 
	 */
	public void setTransportVFSActionAfterFailure(Enumerator newValue) {
		transportVFSActionAfterFailure.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure);
		if (eefElementEditorReadOnlyState && transportVFSActionAfterFailure.isEnabled()) {
			transportVFSActionAfterFailure.setEnabled(false);
			transportVFSActionAfterFailure.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSActionAfterFailure.isEnabled()) {
			transportVFSActionAfterFailure.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMoveAfterFailure()
	 * 
	 */
	public String getTransportVFSMoveAfterFailure() {
		return transportVFSMoveAfterFailure.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMoveAfterFailure(String newValue)
	 * 
	 */
	public void setTransportVFSMoveAfterFailure(String newValue) {
		if (newValue != null) {
			transportVFSMoveAfterFailure.setText(newValue);
		} else {
			transportVFSMoveAfterFailure.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure);
		if (eefElementEditorReadOnlyState && transportVFSMoveAfterFailure.isEnabled()) {
			transportVFSMoveAfterFailure.setEnabled(false);
			transportVFSMoveAfterFailure.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMoveAfterFailure.isEnabled()) {
			transportVFSMoveAfterFailure.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSReplyFileURI()
	 * 
	 */
	public String getTransportVFSReplyFileURI() {
		return transportVFSReplyFileURI.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSReplyFileURI(String newValue)
	 * 
	 */
	public void setTransportVFSReplyFileURI(String newValue) {
		if (newValue != null) {
			transportVFSReplyFileURI.setText(newValue);
		} else {
			transportVFSReplyFileURI.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI);
		if (eefElementEditorReadOnlyState && transportVFSReplyFileURI.isEnabled()) {
			transportVFSReplyFileURI.setEnabled(false);
			transportVFSReplyFileURI.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSReplyFileURI.isEnabled()) {
			transportVFSReplyFileURI.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSReplyFileName()
	 * 
	 */
	public String getTransportVFSReplyFileName() {
		return transportVFSReplyFileName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSReplyFileName(String newValue)
	 * 
	 */
	public void setTransportVFSReplyFileName(String newValue) {
		if (newValue != null) {
			transportVFSReplyFileName.setText(newValue);
		} else {
			transportVFSReplyFileName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName);
		if (eefElementEditorReadOnlyState && transportVFSReplyFileName.isEnabled()) {
			transportVFSReplyFileName.setEnabled(false);
			transportVFSReplyFileName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSReplyFileName.isEnabled()) {
			transportVFSReplyFileName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSAutoLockRelease()
	 * 
	 */
	public Boolean getTransportVFSAutoLockRelease() {
		return Boolean.valueOf(transportVFSAutoLockRelease.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSAutoLockRelease(Boolean newValue)
	 * 
	 */
	public void setTransportVFSAutoLockRelease(Boolean newValue) {
		if (newValue != null) {
			transportVFSAutoLockRelease.setSelection(newValue.booleanValue());
		} else {
			transportVFSAutoLockRelease.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease);
		if (eefElementEditorReadOnlyState && transportVFSAutoLockRelease.isEnabled()) {
			transportVFSAutoLockRelease.setEnabled(false);
			transportVFSAutoLockRelease.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSAutoLockRelease.isEnabled()) {
			transportVFSAutoLockRelease.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSAutoLockReleaseInterval()
	 * 
	 */
	public String getTransportVFSAutoLockReleaseInterval() {
		return transportVFSAutoLockReleaseInterval.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSAutoLockReleaseInterval(String newValue)
	 * 
	 */
	public void setTransportVFSAutoLockReleaseInterval(String newValue) {
		if (newValue != null) {
			transportVFSAutoLockReleaseInterval.setText(newValue);
		} else {
			transportVFSAutoLockReleaseInterval.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval);
		if (eefElementEditorReadOnlyState && transportVFSAutoLockReleaseInterval.isEnabled()) {
			transportVFSAutoLockReleaseInterval.setEnabled(false);
			transportVFSAutoLockReleaseInterval.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSAutoLockReleaseInterval.isEnabled()) {
			transportVFSAutoLockReleaseInterval.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSLockReleaseSameNode()
	 * 
	 */
	public Boolean getTransportVFSLockReleaseSameNode() {
		return Boolean.valueOf(transportVFSLockReleaseSameNode.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSLockReleaseSameNode(Boolean newValue)
	 * 
	 */
	public void setTransportVFSLockReleaseSameNode(Boolean newValue) {
		if (newValue != null) {
			transportVFSLockReleaseSameNode.setSelection(newValue.booleanValue());
		} else {
			transportVFSLockReleaseSameNode.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode);
		if (eefElementEditorReadOnlyState && transportVFSLockReleaseSameNode.isEnabled()) {
			transportVFSLockReleaseSameNode.setEnabled(false);
			transportVFSLockReleaseSameNode.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSLockReleaseSameNode.isEnabled()) {
			transportVFSLockReleaseSameNode.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSDistributedLock()
	 * 
	 */
	public Boolean getTransportVFSDistributedLock() {
		return Boolean.valueOf(transportVFSDistributedLock.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSDistributedLock(Boolean newValue)
	 * 
	 */
	public void setTransportVFSDistributedLock(Boolean newValue) {
		if (newValue != null) {
			transportVFSDistributedLock.setSelection(newValue.booleanValue());
		} else {
			transportVFSDistributedLock.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock);
		if (eefElementEditorReadOnlyState && transportVFSDistributedLock.isEnabled()) {
			transportVFSDistributedLock.setEnabled(false);
			transportVFSDistributedLock.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSDistributedLock.isEnabled()) {
			transportVFSDistributedLock.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSStreaming()
	 * 
	 */
	public Boolean getTransportVFSStreaming() {
		return Boolean.valueOf(transportVFSStreaming.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSStreaming(Boolean newValue)
	 * 
	 */
	public void setTransportVFSStreaming(Boolean newValue) {
		if (newValue != null) {
			transportVFSStreaming.setSelection(newValue.booleanValue());
		} else {
			transportVFSStreaming.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming);
		if (eefElementEditorReadOnlyState && transportVFSStreaming.isEnabled()) {
			transportVFSStreaming.setEnabled(false);
			transportVFSStreaming.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSStreaming.isEnabled()) {
			transportVFSStreaming.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSBuild()
	 * 
	 */
	public Boolean getTransportVFSBuild() {
		return Boolean.valueOf(transportVFSBuild.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSBuild(Boolean newValue)
	 * 
	 */
	public void setTransportVFSBuild(Boolean newValue) {
		if (newValue != null) {
			transportVFSBuild.setSelection(newValue.booleanValue());
		} else {
			transportVFSBuild.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild);
		if (eefElementEditorReadOnlyState && transportVFSBuild.isEnabled()) {
			transportVFSBuild.setEnabled(false);
			transportVFSBuild.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSBuild.isEnabled()) {
			transportVFSBuild.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSDistributedTimeout()
	 * 
	 */
	public String getTransportVFSDistributedTimeout() {
		return transportVFSDistributedTimeout.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSDistributedTimeout(String newValue)
	 * 
	 */
	public void setTransportVFSDistributedTimeout(String newValue) {
		if (newValue != null) {
			transportVFSDistributedTimeout.setText(newValue);
		} else {
			transportVFSDistributedTimeout.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout);
		if (eefElementEditorReadOnlyState && transportVFSDistributedTimeout.isEnabled()) {
			transportVFSDistributedTimeout.setEnabled(false);
			transportVFSDistributedTimeout.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSDistributedTimeout.isEnabled()) {
			transportVFSDistributedTimeout.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getJavaNamingFactoryInitial()
	 * 
	 */
	public String getJavaNamingFactoryInitial() {
		return javaNamingFactoryInitial.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setJavaNamingFactoryInitial(String newValue)
	 * 
	 */
	public void setJavaNamingFactoryInitial(String newValue) {
		if (newValue != null) {
			javaNamingFactoryInitial.setText(newValue);
		} else {
			javaNamingFactoryInitial.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial);
		if (eefElementEditorReadOnlyState && javaNamingFactoryInitial.isEnabled()) {
			javaNamingFactoryInitial.setEnabled(false);
			javaNamingFactoryInitial.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !javaNamingFactoryInitial.isEnabled()) {
			javaNamingFactoryInitial.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getJavaNamingProviderUrl()
	 * 
	 */
	public String getJavaNamingProviderUrl() {
		return javaNamingProviderUrl.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setJavaNamingProviderUrl(String newValue)
	 * 
	 */
	public void setJavaNamingProviderUrl(String newValue) {
		if (newValue != null) {
			javaNamingProviderUrl.setText(newValue);
		} else {
			javaNamingProviderUrl.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl);
		if (eefElementEditorReadOnlyState && javaNamingProviderUrl.isEnabled()) {
			javaNamingProviderUrl.setEnabled(false);
			javaNamingProviderUrl.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !javaNamingProviderUrl.isEnabled()) {
			javaNamingProviderUrl.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSConnectionFactoryJNDIName()
	 * 
	 */
	public String getTransportJMSConnectionFactoryJNDIName() {
		return transportJMSConnectionFactoryJNDIName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSConnectionFactoryJNDIName(String newValue)
	 * 
	 */
	public void setTransportJMSConnectionFactoryJNDIName(String newValue) {
		if (newValue != null) {
			transportJMSConnectionFactoryJNDIName.setText(newValue);
		} else {
			transportJMSConnectionFactoryJNDIName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName);
		if (eefElementEditorReadOnlyState && transportJMSConnectionFactoryJNDIName.isEnabled()) {
			transportJMSConnectionFactoryJNDIName.setEnabled(false);
			transportJMSConnectionFactoryJNDIName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSConnectionFactoryJNDIName.isEnabled()) {
			transportJMSConnectionFactoryJNDIName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSConnectionFactoryType()
	 * 
	 */
	public Enumerator getTransportJMSConnectionFactoryType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportJMSConnectionFactoryType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportJMSConnectionFactoryType(Object input, Enumerator current)
	 */
	public void initTransportJMSConnectionFactoryType(Object input, Enumerator current) {
		transportJMSConnectionFactoryType.setInput(input);
		transportJMSConnectionFactoryType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType);
		if (eefElementEditorReadOnlyState && transportJMSConnectionFactoryType.isEnabled()) {
			transportJMSConnectionFactoryType.setEnabled(false);
			transportJMSConnectionFactoryType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSConnectionFactoryType.isEnabled()) {
			transportJMSConnectionFactoryType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSConnectionFactoryType(Enumerator newValue)
	 * 
	 */
	public void setTransportJMSConnectionFactoryType(Enumerator newValue) {
		transportJMSConnectionFactoryType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType);
		if (eefElementEditorReadOnlyState && transportJMSConnectionFactoryType.isEnabled()) {
			transportJMSConnectionFactoryType.setEnabled(false);
			transportJMSConnectionFactoryType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSConnectionFactoryType.isEnabled()) {
			transportJMSConnectionFactoryType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSConcurrentConsumers()
	 * 
	 */
	public String getTransportJMSConcurrentConsumers() {
		return transportJMSConcurrentConsumers.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSConcurrentConsumers(String newValue)
	 * 
	 */
	public void setTransportJMSConcurrentConsumers(String newValue) {
		if (newValue != null) {
			transportJMSConcurrentConsumers.setText(newValue);
		} else {
			transportJMSConcurrentConsumers.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers);
		if (eefElementEditorReadOnlyState && transportJMSConcurrentConsumers.isEnabled()) {
			transportJMSConcurrentConsumers.setEnabled(false);
			transportJMSConcurrentConsumers.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSConcurrentConsumers.isEnabled()) {
			transportJMSConcurrentConsumers.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSDestination()
	 * 
	 */
	public String getTransportJMSDestination() {
		return transportJMSDestination.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSDestination(String newValue)
	 * 
	 */
	public void setTransportJMSDestination(String newValue) {
		if (newValue != null) {
			transportJMSDestination.setText(newValue);
		} else {
			transportJMSDestination.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination);
		if (eefElementEditorReadOnlyState && transportJMSDestination.isEnabled()) {
			transportJMSDestination.setEnabled(false);
			transportJMSDestination.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSDestination.isEnabled()) {
			transportJMSDestination.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSSessionTransacted()
	 * 
	 */
	public Boolean getTransportJMSSessionTransacted() {
		return Boolean.valueOf(transportJMSSessionTransacted.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSSessionTransacted(Boolean newValue)
	 * 
	 */
	public void setTransportJMSSessionTransacted(Boolean newValue) {
		if (newValue != null) {
			transportJMSSessionTransacted.setSelection(newValue.booleanValue());
		} else {
			transportJMSSessionTransacted.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted);
		if (eefElementEditorReadOnlyState && transportJMSSessionTransacted.isEnabled()) {
			transportJMSSessionTransacted.setEnabled(false);
			transportJMSSessionTransacted.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSSessionTransacted.isEnabled()) {
			transportJMSSessionTransacted.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSSessionAcknowledgement()
	 * 
	 */
	public Enumerator getTransportJMSSessionAcknowledgement() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportJMSSessionAcknowledgement.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportJMSSessionAcknowledgement(Object input, Enumerator current)
	 */
	public void initTransportJMSSessionAcknowledgement(Object input, Enumerator current) {
		transportJMSSessionAcknowledgement.setInput(input);
		transportJMSSessionAcknowledgement.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement);
		if (eefElementEditorReadOnlyState && transportJMSSessionAcknowledgement.isEnabled()) {
			transportJMSSessionAcknowledgement.setEnabled(false);
			transportJMSSessionAcknowledgement.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSSessionAcknowledgement.isEnabled()) {
			transportJMSSessionAcknowledgement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSSessionAcknowledgement(Enumerator newValue)
	 * 
	 */
	public void setTransportJMSSessionAcknowledgement(Enumerator newValue) {
		transportJMSSessionAcknowledgement.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement);
		if (eefElementEditorReadOnlyState && transportJMSSessionAcknowledgement.isEnabled()) {
			transportJMSSessionAcknowledgement.setEnabled(false);
			transportJMSSessionAcknowledgement.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSSessionAcknowledgement.isEnabled()) {
			transportJMSSessionAcknowledgement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSCacheLevel()
	 * 
	 */
	public Enumerator getTransportJMSCacheLevel() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportJMSCacheLevel.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportJMSCacheLevel(Object input, Enumerator current)
	 */
	public void initTransportJMSCacheLevel(Object input, Enumerator current) {
		transportJMSCacheLevel.setInput(input);
		transportJMSCacheLevel.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel);
		if (eefElementEditorReadOnlyState && transportJMSCacheLevel.isEnabled()) {
			transportJMSCacheLevel.setEnabled(false);
			transportJMSCacheLevel.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSCacheLevel.isEnabled()) {
			transportJMSCacheLevel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSCacheLevel(Enumerator newValue)
	 * 
	 */
	public void setTransportJMSCacheLevel(Enumerator newValue) {
		transportJMSCacheLevel.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel);
		if (eefElementEditorReadOnlyState && transportJMSCacheLevel.isEnabled()) {
			transportJMSCacheLevel.setEnabled(false);
			transportJMSCacheLevel.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSCacheLevel.isEnabled()) {
			transportJMSCacheLevel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSUserName()
	 * 
	 */
	public String getTransportJMSUserName() {
		return transportJMSUserName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSUserName(String newValue)
	 * 
	 */
	public void setTransportJMSUserName(String newValue) {
		if (newValue != null) {
			transportJMSUserName.setText(newValue);
		} else {
			transportJMSUserName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName);
		if (eefElementEditorReadOnlyState && transportJMSUserName.isEnabled()) {
			transportJMSUserName.setEnabled(false);
			transportJMSUserName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSUserName.isEnabled()) {
			transportJMSUserName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSPassword()
	 * 
	 */
	public String getTransportJMSPassword() {
		return transportJMSPassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSPassword(String newValue)
	 * 
	 */
	public void setTransportJMSPassword(String newValue) {
		if (newValue != null) {
			transportJMSPassword.setText(newValue);
		} else {
			transportJMSPassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword);
		if (eefElementEditorReadOnlyState && transportJMSPassword.isEnabled()) {
			transportJMSPassword.setEnabled(false);
			transportJMSPassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSPassword.isEnabled()) {
			transportJMSPassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSJMSSpecVersion()
	 * 
	 */
	public String getTransportJMSJMSSpecVersion() {
		return transportJMSJMSSpecVersion.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSJMSSpecVersion(String newValue)
	 * 
	 */
	public void setTransportJMSJMSSpecVersion(String newValue) {
		if (newValue != null) {
			transportJMSJMSSpecVersion.setText(newValue);
		} else {
			transportJMSJMSSpecVersion.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion);
		if (eefElementEditorReadOnlyState && transportJMSJMSSpecVersion.isEnabled()) {
			transportJMSJMSSpecVersion.setEnabled(false);
			transportJMSJMSSpecVersion.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSJMSSpecVersion.isEnabled()) {
			transportJMSJMSSpecVersion.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSSubscriptionDurable()
	 * 
	 */
	public String getTransportJMSSubscriptionDurable() {
		return transportJMSSubscriptionDurable.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSSubscriptionDurable(String newValue)
	 * 
	 */
	public void setTransportJMSSubscriptionDurable(String newValue) {
		if (newValue != null) {
			transportJMSSubscriptionDurable.setText(newValue);
		} else {
			transportJMSSubscriptionDurable.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable);
		if (eefElementEditorReadOnlyState && transportJMSSubscriptionDurable.isEnabled()) {
			transportJMSSubscriptionDurable.setEnabled(false);
			transportJMSSubscriptionDurable.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSSubscriptionDurable.isEnabled()) {
			transportJMSSubscriptionDurable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSDurableSubscriberClientID()
	 * 
	 */
	public String getTransportJMSDurableSubscriberClientID() {
		return transportJMSDurableSubscriberClientID.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSDurableSubscriberClientID(String newValue)
	 * 
	 */
	public void setTransportJMSDurableSubscriberClientID(String newValue) {
		if (newValue != null) {
			transportJMSDurableSubscriberClientID.setText(newValue);
		} else {
			transportJMSDurableSubscriberClientID.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID);
		if (eefElementEditorReadOnlyState && transportJMSDurableSubscriberClientID.isEnabled()) {
			transportJMSDurableSubscriberClientID.setEnabled(false);
			transportJMSDurableSubscriberClientID.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSDurableSubscriberClientID.isEnabled()) {
			transportJMSDurableSubscriberClientID.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSMessageSelector()
	 * 
	 */
	public String getTransportJMSMessageSelector() {
		return transportJMSMessageSelector.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSMessageSelector(String newValue)
	 * 
	 */
	public void setTransportJMSMessageSelector(String newValue) {
		if (newValue != null) {
			transportJMSMessageSelector.setText(newValue);
		} else {
			transportJMSMessageSelector.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector);
		if (eefElementEditorReadOnlyState && transportJMSMessageSelector.isEnabled()) {
			transportJMSMessageSelector.setEnabled(false);
			transportJMSMessageSelector.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSMessageSelector.isEnabled()) {
			transportJMSMessageSelector.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSRetryDuration()
	 * 
	 */
	public String getTransportJMSRetryDuration() {
		return transportJMSRetryDuration.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSRetryDuration(String newValue)
	 * 
	 */
	public void setTransportJMSRetryDuration(String newValue) {
		if (newValue != null) {
			transportJMSRetryDuration.setText(newValue);
		} else {
			transportJMSRetryDuration.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration);
		if (eefElementEditorReadOnlyState && transportJMSRetryDuration.isEnabled()) {
			transportJMSRetryDuration.setEnabled(false);
			transportJMSRetryDuration.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSRetryDuration.isEnabled()) {
			transportJMSRetryDuration.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMoveTimestampFormat()
	 * 
	 */
	public String getTransportVFSMoveTimestampFormat() {
		return transportVFSMoveTimestampFormat.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMoveTimestampFormat(String newValue)
	 * 
	 */
	public void setTransportVFSMoveTimestampFormat(String newValue) {
		if (newValue != null) {
			transportVFSMoveTimestampFormat.setText(newValue);
		} else {
			transportVFSMoveTimestampFormat.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat);
		if (eefElementEditorReadOnlyState && transportVFSMoveTimestampFormat.isEnabled()) {
			transportVFSMoveTimestampFormat.setEnabled(false);
			transportVFSMoveTimestampFormat.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMoveTimestampFormat.isEnabled()) {
			transportVFSMoveTimestampFormat.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFileSortAttribute()
	 * 
	 */
	public Enumerator getTransportVFSFileSortAttribute() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportVFSFileSortAttribute.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportVFSFileSortAttribute(Object input, Enumerator current)
	 */
	public void initTransportVFSFileSortAttribute(Object input, Enumerator current) {
		transportVFSFileSortAttribute.setInput(input);
		transportVFSFileSortAttribute.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute);
		if (eefElementEditorReadOnlyState && transportVFSFileSortAttribute.isEnabled()) {
			transportVFSFileSortAttribute.setEnabled(false);
			transportVFSFileSortAttribute.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileSortAttribute.isEnabled()) {
			transportVFSFileSortAttribute.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFileSortAttribute(Enumerator newValue)
	 * 
	 */
	public void setTransportVFSFileSortAttribute(Enumerator newValue) {
		transportVFSFileSortAttribute.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute);
		if (eefElementEditorReadOnlyState && transportVFSFileSortAttribute.isEnabled()) {
			transportVFSFileSortAttribute.setEnabled(false);
			transportVFSFileSortAttribute.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileSortAttribute.isEnabled()) {
			transportVFSFileSortAttribute.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFileSortAscending()
	 * 
	 */
	public Boolean getTransportVFSFileSortAscending() {
		return Boolean.valueOf(transportVFSFileSortAscending.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFileSortAscending(Boolean newValue)
	 * 
	 */
	public void setTransportVFSFileSortAscending(Boolean newValue) {
		if (newValue != null) {
			transportVFSFileSortAscending.setSelection(newValue.booleanValue());
		} else {
			transportVFSFileSortAscending.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending);
		if (eefElementEditorReadOnlyState && transportVFSFileSortAscending.isEnabled()) {
			transportVFSFileSortAscending.setEnabled(false);
			transportVFSFileSortAscending.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileSortAscending.isEnabled()) {
			transportVFSFileSortAscending.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSSubFolderTimestampFormat()
	 * 
	 */
	public String getTransportVFSSubFolderTimestampFormat() {
		return transportVFSSubFolderTimestampFormat.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSSubFolderTimestampFormat(String newValue)
	 * 
	 */
	public void setTransportVFSSubFolderTimestampFormat(String newValue) {
		if (newValue != null) {
			transportVFSSubFolderTimestampFormat.setText(newValue);
		} else {
			transportVFSSubFolderTimestampFormat.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat);
		if (eefElementEditorReadOnlyState && transportVFSSubFolderTimestampFormat.isEnabled()) {
			transportVFSSubFolderTimestampFormat.setEnabled(false);
			transportVFSSubFolderTimestampFormat.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSSubFolderTimestampFormat.isEnabled()) {
			transportVFSSubFolderTimestampFormat.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSCreateFolder()
	 * 
	 */
	public Boolean getTransportVFSCreateFolder() {
		return Boolean.valueOf(transportVFSCreateFolder.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSCreateFolder(Boolean newValue)
	 * 
	 */
	public void setTransportVFSCreateFolder(Boolean newValue) {
		if (newValue != null) {
			transportVFSCreateFolder.setSelection(newValue.booleanValue());
		} else {
			transportVFSCreateFolder.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder);
		if (eefElementEditorReadOnlyState && transportVFSCreateFolder.isEnabled()) {
			transportVFSCreateFolder.setEnabled(false);
			transportVFSCreateFolder.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSCreateFolder.isEnabled()) {
			transportVFSCreateFolder.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSReceiveTimeout()
	 * 
	 */
	public String getTransportJMSReceiveTimeout() {
		return transportJMSReceiveTimeout.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSReceiveTimeout(String newValue)
	 * 
	 */
	public void setTransportJMSReceiveTimeout(String newValue) {
		if (newValue != null) {
			transportJMSReceiveTimeout.setText(newValue);
		} else {
			transportJMSReceiveTimeout.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout);
		if (eefElementEditorReadOnlyState && transportJMSReceiveTimeout.isEnabled()) {
			transportJMSReceiveTimeout.setEnabled(false);
			transportJMSReceiveTimeout.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSReceiveTimeout.isEnabled()) {
			transportJMSReceiveTimeout.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSContentType()
	 * 
	 */
	public String getTransportJMSContentType() {
		return transportJMSContentType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSContentType(String newValue)
	 * 
	 */
	public void setTransportJMSContentType(String newValue) {
		if (newValue != null) {
			transportJMSContentType.setText(newValue);
		} else {
			transportJMSContentType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType);
		if (eefElementEditorReadOnlyState && transportJMSContentType.isEnabled()) {
			transportJMSContentType.setEnabled(false);
			transportJMSContentType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSContentType.isEnabled()) {
			transportJMSContentType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSContentTypeProperty()
	 * 
	 */
	public String getTransportJMSContentTypeProperty() {
		return transportJMSContentTypeProperty.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSContentTypeProperty(String newValue)
	 * 
	 */
	public void setTransportJMSContentTypeProperty(String newValue) {
		if (newValue != null) {
			transportJMSContentTypeProperty.setText(newValue);
		} else {
			transportJMSContentTypeProperty.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty);
		if (eefElementEditorReadOnlyState && transportJMSContentTypeProperty.isEnabled()) {
			transportJMSContentTypeProperty.setEnabled(false);
			transportJMSContentTypeProperty.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSContentTypeProperty.isEnabled()) {
			transportJMSContentTypeProperty.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSReplyDestination()
	 * 
	 */
	public String getTransportJMSReplyDestination() {
		return transportJMSReplyDestination.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSReplyDestination(String newValue)
	 * 
	 */
	public void setTransportJMSReplyDestination(String newValue) {
		if (newValue != null) {
			transportJMSReplyDestination.setText(newValue);
		} else {
			transportJMSReplyDestination.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination);
		if (eefElementEditorReadOnlyState && transportJMSReplyDestination.isEnabled()) {
			transportJMSReplyDestination.setEnabled(false);
			transportJMSReplyDestination.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSReplyDestination.isEnabled()) {
			transportJMSReplyDestination.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSPubSubNoLocal()
	 * 
	 */
	public String getTransportJMSPubSubNoLocal() {
		return transportJMSPubSubNoLocal.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSPubSubNoLocal(String newValue)
	 * 
	 */
	public void setTransportJMSPubSubNoLocal(String newValue) {
		if (newValue != null) {
			transportJMSPubSubNoLocal.setText(newValue);
		} else {
			transportJMSPubSubNoLocal.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal);
		if (eefElementEditorReadOnlyState && transportJMSPubSubNoLocal.isEnabled()) {
			transportJMSPubSubNoLocal.setEnabled(false);
			transportJMSPubSubNoLocal.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSPubSubNoLocal.isEnabled()) {
			transportJMSPubSubNoLocal.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSDurableSubscriberName()
	 * 
	 */
	public String getTransportJMSDurableSubscriberName() {
		return transportJMSDurableSubscriberName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSDurableSubscriberName(String newValue)
	 * 
	 */
	public void setTransportJMSDurableSubscriberName(String newValue) {
		if (newValue != null) {
			transportJMSDurableSubscriberName.setText(newValue);
		} else {
			transportJMSDurableSubscriberName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName);
		if (eefElementEditorReadOnlyState && transportJMSDurableSubscriberName.isEnabled()) {
			transportJMSDurableSubscriberName.setEnabled(false);
			transportJMSDurableSubscriberName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSDurableSubscriberName.isEnabled()) {
			transportJMSDurableSubscriberName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSBrokerType()
	 * 
	 */
	public Enumerator getTransportJMSBrokerType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportJMSBrokerType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportJMSBrokerType(Object input, Enumerator current)
	 */
	public void initTransportJMSBrokerType(Object input, Enumerator current) {
		transportJMSBrokerType.setInput(input);
		transportJMSBrokerType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType);
		if (eefElementEditorReadOnlyState && transportJMSBrokerType.isEnabled()) {
			transportJMSBrokerType.setEnabled(false);
			transportJMSBrokerType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSBrokerType.isEnabled()) {
			transportJMSBrokerType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSBrokerType(Enumerator newValue)
	 * 
	 */
	public void setTransportJMSBrokerType(Enumerator newValue) {
		transportJMSBrokerType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType);
		if (eefElementEditorReadOnlyState && transportJMSBrokerType.isEnabled()) {
			transportJMSBrokerType.setEnabled(false);
			transportJMSBrokerType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSBrokerType.isEnabled()) {
			transportJMSBrokerType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTConnectionFactory()
	 * 
	 */
	public String getTransportMQTTConnectionFactory() {
		return transportMQTTConnectionFactory.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTConnectionFactory(String newValue)
	 * 
	 */
	public void setTransportMQTTConnectionFactory(String newValue) {
		if (newValue != null) {
			transportMQTTConnectionFactory.setText(newValue);
		} else {
			transportMQTTConnectionFactory.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory);
		if (eefElementEditorReadOnlyState && transportMQTTConnectionFactory.isEnabled()) {
			transportMQTTConnectionFactory.setEnabled(false);
			transportMQTTConnectionFactory.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTConnectionFactory.isEnabled()) {
			transportMQTTConnectionFactory.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTServerHostName()
	 * 
	 */
	public String getTransportMQTTServerHostName() {
		return transportMQTTServerHostName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTServerHostName(String newValue)
	 * 
	 */
	public void setTransportMQTTServerHostName(String newValue) {
		if (newValue != null) {
			transportMQTTServerHostName.setText(newValue);
		} else {
			transportMQTTServerHostName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName);
		if (eefElementEditorReadOnlyState && transportMQTTServerHostName.isEnabled()) {
			transportMQTTServerHostName.setEnabled(false);
			transportMQTTServerHostName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTServerHostName.isEnabled()) {
			transportMQTTServerHostName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTServerPort()
	 * 
	 */
	public String getTransportMQTTServerPort() {
		return transportMQTTServerPort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTServerPort(String newValue)
	 * 
	 */
	public void setTransportMQTTServerPort(String newValue) {
		if (newValue != null) {
			transportMQTTServerPort.setText(newValue);
		} else {
			transportMQTTServerPort.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort);
		if (eefElementEditorReadOnlyState && transportMQTTServerPort.isEnabled()) {
			transportMQTTServerPort.setEnabled(false);
			transportMQTTServerPort.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTServerPort.isEnabled()) {
			transportMQTTServerPort.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTTopicName()
	 * 
	 */
	public String getTransportMQTTTopicName() {
		return transportMQTTTopicName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTTopicName(String newValue)
	 * 
	 */
	public void setTransportMQTTTopicName(String newValue) {
		if (newValue != null) {
			transportMQTTTopicName.setText(newValue);
		} else {
			transportMQTTTopicName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName);
		if (eefElementEditorReadOnlyState && transportMQTTTopicName.isEnabled()) {
			transportMQTTTopicName.setEnabled(false);
			transportMQTTTopicName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTTopicName.isEnabled()) {
			transportMQTTTopicName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSubscriptionQOS()
	 * 
	 */
	public Enumerator getTransportMQTTSubscriptionQOS() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportMQTTSubscriptionQOS.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportMQTTSubscriptionQOS(Object input, Enumerator current)
	 */
	public void initTransportMQTTSubscriptionQOS(Object input, Enumerator current) {
		transportMQTTSubscriptionQOS.setInput(input);
		transportMQTTSubscriptionQOS.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS);
		if (eefElementEditorReadOnlyState && transportMQTTSubscriptionQOS.isEnabled()) {
			transportMQTTSubscriptionQOS.setEnabled(false);
			transportMQTTSubscriptionQOS.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSubscriptionQOS.isEnabled()) {
			transportMQTTSubscriptionQOS.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSubscriptionQOS(Enumerator newValue)
	 * 
	 */
	public void setTransportMQTTSubscriptionQOS(Enumerator newValue) {
		transportMQTTSubscriptionQOS.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS);
		if (eefElementEditorReadOnlyState && transportMQTTSubscriptionQOS.isEnabled()) {
			transportMQTTSubscriptionQOS.setEnabled(false);
			transportMQTTSubscriptionQOS.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSubscriptionQOS.isEnabled()) {
			transportMQTTSubscriptionQOS.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSessionClean()
	 * 
	 */
	public Boolean getTransportMQTTSessionClean() {
		return Boolean.valueOf(transportMQTTSessionClean.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSessionClean(Boolean newValue)
	 * 
	 */
	public void setTransportMQTTSessionClean(Boolean newValue) {
		if (newValue != null) {
			transportMQTTSessionClean.setSelection(newValue.booleanValue());
		} else {
			transportMQTTSessionClean.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean);
		if (eefElementEditorReadOnlyState && transportMQTTSessionClean.isEnabled()) {
			transportMQTTSessionClean.setEnabled(false);
			transportMQTTSessionClean.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSessionClean.isEnabled()) {
			transportMQTTSessionClean.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslEnable()
	 * 
	 */
	public String getTransportMQTTSslEnable() {
		return transportMQTTSslEnable.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslEnable(String newValue)
	 * 
	 */
	public void setTransportMQTTSslEnable(String newValue) {
		if (newValue != null) {
			transportMQTTSslEnable.setText(newValue);
		} else {
			transportMQTTSslEnable.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable);
		if (eefElementEditorReadOnlyState && transportMQTTSslEnable.isEnabled()) {
			transportMQTTSslEnable.setEnabled(false);
			transportMQTTSslEnable.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslEnable.isEnabled()) {
			transportMQTTSslEnable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTTemporaryStoreDirectory()
	 * 
	 */
	public String getTransportMQTTTemporaryStoreDirectory() {
		return transportMQTTTemporaryStoreDirectory.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTTemporaryStoreDirectory(String newValue)
	 * 
	 */
	public void setTransportMQTTTemporaryStoreDirectory(String newValue) {
		if (newValue != null) {
			transportMQTTTemporaryStoreDirectory.setText(newValue);
		} else {
			transportMQTTTemporaryStoreDirectory.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory);
		if (eefElementEditorReadOnlyState && transportMQTTTemporaryStoreDirectory.isEnabled()) {
			transportMQTTTemporaryStoreDirectory.setEnabled(false);
			transportMQTTTemporaryStoreDirectory.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTTemporaryStoreDirectory.isEnabled()) {
			transportMQTTTemporaryStoreDirectory.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSubscriptionUsername()
	 * 
	 */
	public String getTransportMQTTSubscriptionUsername() {
		return transportMQTTSubscriptionUsername.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSubscriptionUsername(String newValue)
	 * 
	 */
	public void setTransportMQTTSubscriptionUsername(String newValue) {
		if (newValue != null) {
			transportMQTTSubscriptionUsername.setText(newValue);
		} else {
			transportMQTTSubscriptionUsername.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername);
		if (eefElementEditorReadOnlyState && transportMQTTSubscriptionUsername.isEnabled()) {
			transportMQTTSubscriptionUsername.setEnabled(false);
			transportMQTTSubscriptionUsername.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSubscriptionUsername.isEnabled()) {
			transportMQTTSubscriptionUsername.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSubscriptionPassword()
	 * 
	 */
	public String getTransportMQTTSubscriptionPassword() {
		return transportMQTTSubscriptionPassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSubscriptionPassword(String newValue)
	 * 
	 */
	public void setTransportMQTTSubscriptionPassword(String newValue) {
		if (newValue != null) {
			transportMQTTSubscriptionPassword.setText(newValue);
		} else {
			transportMQTTSubscriptionPassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword);
		if (eefElementEditorReadOnlyState && transportMQTTSubscriptionPassword.isEnabled()) {
			transportMQTTSubscriptionPassword.setEnabled(false);
			transportMQTTSubscriptionPassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSubscriptionPassword.isEnabled()) {
			transportMQTTSubscriptionPassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTClientId()
	 * 
	 */
	public String getTransportMQTTClientId() {
		return transportMQTTClientId.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTClientId(String newValue)
	 * 
	 */
	public void setTransportMQTTClientId(String newValue) {
		if (newValue != null) {
			transportMQTTClientId.setText(newValue);
		} else {
			transportMQTTClientId.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId);
		if (eefElementEditorReadOnlyState && transportMQTTClientId.isEnabled()) {
			transportMQTTClientId.setEnabled(false);
			transportMQTTClientId.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTClientId.isEnabled()) {
			transportMQTTClientId.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTruststore()
	 * 
	 */
	public String getTruststore() {
		return truststore.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTruststore(String newValue)
	 * 
	 */
	public void setTruststore(String newValue) {
		if (newValue != null) {
			truststore.setText(newValue);
		} else {
			truststore.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.truststore);
		if (eefElementEditorReadOnlyState && truststore.isEnabled()) {
			truststore.setEnabled(false);
			truststore.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !truststore.isEnabled()) {
			truststore.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getKeystore()
	 * 
	 */
	public String getKeystore() {
		return keystore.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setKeystore(String newValue)
	 * 
	 */
	public void setKeystore(String newValue) {
		if (newValue != null) {
			keystore.setText(newValue);
		} else {
			keystore.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.keystore);
		if (eefElementEditorReadOnlyState && keystore.isEnabled()) {
			keystore.setEnabled(false);
			keystore.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !keystore.isEnabled()) {
			keystore.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSslVerifyClient()
	 * 
	 */
	public String getSslVerifyClient() {
		return sslVerifyClient.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSslVerifyClient(String newValue)
	 * 
	 */
	public void setSslVerifyClient(String newValue) {
		if (newValue != null) {
			sslVerifyClient.setText(newValue);
		} else {
			sslVerifyClient.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient);
		if (eefElementEditorReadOnlyState && sslVerifyClient.isEnabled()) {
			sslVerifyClient.setEnabled(false);
			sslVerifyClient.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sslVerifyClient.isEnabled()) {
			sslVerifyClient.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSslProtocol()
	 * 
	 */
	public String getSslProtocol() {
		return sslProtocol.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSslProtocol(String newValue)
	 * 
	 */
	public void setSslProtocol(String newValue) {
		if (newValue != null) {
			sslProtocol.setText(newValue);
		} else {
			sslProtocol.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.sslProtocol);
		if (eefElementEditorReadOnlyState && sslProtocol.isEnabled()) {
			sslProtocol.setEnabled(false);
			sslProtocol.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sslProtocol.isEnabled()) {
			sslProtocol.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getHttpsProtocols()
	 * 
	 */
	public String getHttpsProtocols() {
		return httpsProtocols.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setHttpsProtocols(String newValue)
	 * 
	 */
	public void setHttpsProtocols(String newValue) {
		if (newValue != null) {
			httpsProtocols.setText(newValue);
		} else {
			httpsProtocols.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols);
		if (eefElementEditorReadOnlyState && httpsProtocols.isEnabled()) {
			httpsProtocols.setEnabled(false);
			httpsProtocols.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !httpsProtocols.isEnabled()) {
			httpsProtocols.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getCertificateRevocationVerifier()
	 * 
	 */
	public String getCertificateRevocationVerifier() {
		return certificateRevocationVerifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setCertificateRevocationVerifier(String newValue)
	 * 
	 */
	public void setCertificateRevocationVerifier(String newValue) {
		if (newValue != null) {
			certificateRevocationVerifier.setText(newValue);
		} else {
			certificateRevocationVerifier.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier);
		if (eefElementEditorReadOnlyState && certificateRevocationVerifier.isEnabled()) {
			certificateRevocationVerifier.setEnabled(false);
			certificateRevocationVerifier.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !certificateRevocationVerifier.isEnabled()) {
			certificateRevocationVerifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7Port()
	 * 
	 */
	public String getInboundHL7Port() {
		return inboundHL7Port.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7Port(String newValue)
	 * 
	 */
	public void setInboundHL7Port(String newValue) {
		if (newValue != null) {
			inboundHL7Port.setText(newValue);
		} else {
			inboundHL7Port.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port);
		if (eefElementEditorReadOnlyState && inboundHL7Port.isEnabled()) {
			inboundHL7Port.setEnabled(false);
			inboundHL7Port.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7Port.isEnabled()) {
			inboundHL7Port.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7AutoAck()
	 * 
	 */
	public Boolean getInboundHL7AutoAck() {
		return Boolean.valueOf(inboundHL7AutoAck.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7AutoAck(Boolean newValue)
	 * 
	 */
	public void setInboundHL7AutoAck(Boolean newValue) {
		if (newValue != null) {
			inboundHL7AutoAck.setSelection(newValue.booleanValue());
		} else {
			inboundHL7AutoAck.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck);
		if (eefElementEditorReadOnlyState && inboundHL7AutoAck.isEnabled()) {
			inboundHL7AutoAck.setEnabled(false);
			inboundHL7AutoAck.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7AutoAck.isEnabled()) {
			inboundHL7AutoAck.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7MessagePreProcessor()
	 * 
	 */
	public String getInboundHL7MessagePreProcessor() {
		return inboundHL7MessagePreProcessor.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7MessagePreProcessor(String newValue)
	 * 
	 */
	public void setInboundHL7MessagePreProcessor(String newValue) {
		if (newValue != null) {
			inboundHL7MessagePreProcessor.setText(newValue);
		} else {
			inboundHL7MessagePreProcessor.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor);
		if (eefElementEditorReadOnlyState && inboundHL7MessagePreProcessor.isEnabled()) {
			inboundHL7MessagePreProcessor.setEnabled(false);
			inboundHL7MessagePreProcessor.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7MessagePreProcessor.isEnabled()) {
			inboundHL7MessagePreProcessor.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7CharSet()
	 * 
	 */
	public String getInboundHL7CharSet() {
		return inboundHL7CharSet.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7CharSet(String newValue)
	 * 
	 */
	public void setInboundHL7CharSet(String newValue) {
		if (newValue != null) {
			inboundHL7CharSet.setText(newValue);
		} else {
			inboundHL7CharSet.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet);
		if (eefElementEditorReadOnlyState && inboundHL7CharSet.isEnabled()) {
			inboundHL7CharSet.setEnabled(false);
			inboundHL7CharSet.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7CharSet.isEnabled()) {
			inboundHL7CharSet.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7TimeOut()
	 * 
	 */
	public String getInboundHL7TimeOut() {
		return inboundHL7TimeOut.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7TimeOut(String newValue)
	 * 
	 */
	public void setInboundHL7TimeOut(String newValue) {
		if (newValue != null) {
			inboundHL7TimeOut.setText(newValue);
		} else {
			inboundHL7TimeOut.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut);
		if (eefElementEditorReadOnlyState && inboundHL7TimeOut.isEnabled()) {
			inboundHL7TimeOut.setEnabled(false);
			inboundHL7TimeOut.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7TimeOut.isEnabled()) {
			inboundHL7TimeOut.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7ValidateMessage()
	 * 
	 */
	public Boolean getInboundHL7ValidateMessage() {
		return Boolean.valueOf(inboundHL7ValidateMessage.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7ValidateMessage(Boolean newValue)
	 * 
	 */
	public void setInboundHL7ValidateMessage(Boolean newValue) {
		if (newValue != null) {
			inboundHL7ValidateMessage.setSelection(newValue.booleanValue());
		} else {
			inboundHL7ValidateMessage.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage);
		if (eefElementEditorReadOnlyState && inboundHL7ValidateMessage.isEnabled()) {
			inboundHL7ValidateMessage.setEnabled(false);
			inboundHL7ValidateMessage.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7ValidateMessage.isEnabled()) {
			inboundHL7ValidateMessage.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7BuildInvalidMessages()
	 * 
	 */
	public Boolean getInboundHL7BuildInvalidMessages() {
		return Boolean.valueOf(inboundHL7BuildInvalidMessages.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7BuildInvalidMessages(Boolean newValue)
	 * 
	 */
	public void setInboundHL7BuildInvalidMessages(Boolean newValue) {
		if (newValue != null) {
			inboundHL7BuildInvalidMessages.setSelection(newValue.booleanValue());
		} else {
			inboundHL7BuildInvalidMessages.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages);
		if (eefElementEditorReadOnlyState && inboundHL7BuildInvalidMessages.isEnabled()) {
			inboundHL7BuildInvalidMessages.setEnabled(false);
			inboundHL7BuildInvalidMessages.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7BuildInvalidMessages.isEnabled()) {
			inboundHL7BuildInvalidMessages.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7PassThroughInvalidMessages()
	 * 
	 */
	public Boolean getInboundHL7PassThroughInvalidMessages() {
		return Boolean.valueOf(inboundHL7PassThroughInvalidMessages.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7PassThroughInvalidMessages(Boolean newValue)
	 * 
	 */
	public void setInboundHL7PassThroughInvalidMessages(Boolean newValue) {
		if (newValue != null) {
			inboundHL7PassThroughInvalidMessages.setSelection(newValue.booleanValue());
		} else {
			inboundHL7PassThroughInvalidMessages.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages);
		if (eefElementEditorReadOnlyState && inboundHL7PassThroughInvalidMessages.isEnabled()) {
			inboundHL7PassThroughInvalidMessages.setEnabled(false);
			inboundHL7PassThroughInvalidMessages.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7PassThroughInvalidMessages.isEnabled()) {
			inboundHL7PassThroughInvalidMessages.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getZookeeperConnect()
	 * 
	 */
	public String getZookeeperConnect() {
		return zookeeperConnect.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setZookeeperConnect(String newValue)
	 * 
	 */
	public void setZookeeperConnect(String newValue) {
		if (newValue != null) {
			zookeeperConnect.setText(newValue);
		} else {
			zookeeperConnect.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect);
		if (eefElementEditorReadOnlyState && zookeeperConnect.isEnabled()) {
			zookeeperConnect.setEnabled(false);
			zookeeperConnect.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !zookeeperConnect.isEnabled()) {
			zookeeperConnect.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getGroupId()
	 * 
	 */
	public String getGroupId() {
		return groupId.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setGroupId(String newValue)
	 * 
	 */
	public void setGroupId(String newValue) {
		if (newValue != null) {
			groupId.setText(newValue);
		} else {
			groupId.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.groupId);
		if (eefElementEditorReadOnlyState && groupId.isEnabled()) {
			groupId.setEnabled(false);
			groupId.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !groupId.isEnabled()) {
			groupId.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getContentType()
	 * 
	 */
	public String getContentType() {
		return contentType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setContentType(String newValue)
	 * 
	 */
	public void setContentType(String newValue) {
		if (newValue != null) {
			contentType.setText(newValue);
		} else {
			contentType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.contentType);
		if (eefElementEditorReadOnlyState && contentType.isEnabled()) {
			contentType.setEnabled(false);
			contentType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !contentType.isEnabled()) {
			contentType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getConsumerType()
	 * 
	 */
	public Enumerator getConsumerType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) consumerType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initConsumerType(Object input, Enumerator current)
	 */
	public void initConsumerType(Object input, Enumerator current) {
		consumerType.setInput(input);
		consumerType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.consumerType);
		if (eefElementEditorReadOnlyState && consumerType.isEnabled()) {
			consumerType.setEnabled(false);
			consumerType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !consumerType.isEnabled()) {
			consumerType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setConsumerType(Enumerator newValue)
	 * 
	 */
	public void setConsumerType(Enumerator newValue) {
		consumerType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.consumerType);
		if (eefElementEditorReadOnlyState && consumerType.isEnabled()) {
			consumerType.setEnabled(false);
			consumerType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !consumerType.isEnabled()) {
			consumerType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTopicsOrTopicFilter()
	 * 
	 */
	public Enumerator getTopicsOrTopicFilter() {
		Enumerator selection = (Enumerator) ((StructuredSelection) topicsOrTopicFilter.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTopicsOrTopicFilter(Object input, Enumerator current)
	 */
	public void initTopicsOrTopicFilter(Object input, Enumerator current) {
		topicsOrTopicFilter.setInput(input);
		topicsOrTopicFilter.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter);
		if (eefElementEditorReadOnlyState && topicsOrTopicFilter.isEnabled()) {
			topicsOrTopicFilter.setEnabled(false);
			topicsOrTopicFilter.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !topicsOrTopicFilter.isEnabled()) {
			topicsOrTopicFilter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTopicsOrTopicFilter(Enumerator newValue)
	 * 
	 */
	public void setTopicsOrTopicFilter(Enumerator newValue) {
		topicsOrTopicFilter.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter);
		if (eefElementEditorReadOnlyState && topicsOrTopicFilter.isEnabled()) {
			topicsOrTopicFilter.setEnabled(false);
			topicsOrTopicFilter.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !topicsOrTopicFilter.isEnabled()) {
			topicsOrTopicFilter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTopicsName()
	 * 
	 */
	public String getTopicsName() {
		return topicsName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTopicsName(String newValue)
	 * 
	 */
	public void setTopicsName(String newValue) {
		if (newValue != null) {
			topicsName.setText(newValue);
		} else {
			topicsName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.topicsName);
		if (eefElementEditorReadOnlyState && topicsName.isEnabled()) {
			topicsName.setEnabled(false);
			topicsName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !topicsName.isEnabled()) {
			topicsName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTopicFilterFrom()
	 * 
	 */
	public Enumerator getTopicFilterFrom() {
		Enumerator selection = (Enumerator) ((StructuredSelection) topicFilterFrom.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTopicFilterFrom(Object input, Enumerator current)
	 */
	public void initTopicFilterFrom(Object input, Enumerator current) {
		topicFilterFrom.setInput(input);
		topicFilterFrom.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom);
		if (eefElementEditorReadOnlyState && topicFilterFrom.isEnabled()) {
			topicFilterFrom.setEnabled(false);
			topicFilterFrom.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !topicFilterFrom.isEnabled()) {
			topicFilterFrom.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTopicFilterFrom(Enumerator newValue)
	 * 
	 */
	public void setTopicFilterFrom(Enumerator newValue) {
		topicFilterFrom.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom);
		if (eefElementEditorReadOnlyState && topicFilterFrom.isEnabled()) {
			topicFilterFrom.setEnabled(false);
			topicFilterFrom.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !topicFilterFrom.isEnabled()) {
			topicFilterFrom.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTopicFilterName()
	 * 
	 */
	public String getTopicFilterName() {
		return topicFilterName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTopicFilterName(String newValue)
	 * 
	 */
	public void setTopicFilterName(String newValue) {
		if (newValue != null) {
			topicFilterName.setText(newValue);
		} else {
			topicFilterName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.topicFilterName);
		if (eefElementEditorReadOnlyState && topicFilterName.isEnabled()) {
			topicFilterName.setEnabled(false);
			topicFilterName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !topicFilterName.isEnabled()) {
			topicFilterName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSimpleConsumerTopic()
	 * 
	 */
	public String getSimpleConsumerTopic() {
		return simpleConsumerTopic.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSimpleConsumerTopic(String newValue)
	 * 
	 */
	public void setSimpleConsumerTopic(String newValue) {
		if (newValue != null) {
			simpleConsumerTopic.setText(newValue);
		} else {
			simpleConsumerTopic.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic);
		if (eefElementEditorReadOnlyState && simpleConsumerTopic.isEnabled()) {
			simpleConsumerTopic.setEnabled(false);
			simpleConsumerTopic.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !simpleConsumerTopic.isEnabled()) {
			simpleConsumerTopic.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSimpleConsumerBrokers()
	 * 
	 */
	public String getSimpleConsumerBrokers() {
		return simpleConsumerBrokers.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSimpleConsumerBrokers(String newValue)
	 * 
	 */
	public void setSimpleConsumerBrokers(String newValue) {
		if (newValue != null) {
			simpleConsumerBrokers.setText(newValue);
		} else {
			simpleConsumerBrokers.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers);
		if (eefElementEditorReadOnlyState && simpleConsumerBrokers.isEnabled()) {
			simpleConsumerBrokers.setEnabled(false);
			simpleConsumerBrokers.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !simpleConsumerBrokers.isEnabled()) {
			simpleConsumerBrokers.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSimpleConsumerPort()
	 * 
	 */
	public String getSimpleConsumerPort() {
		return simpleConsumerPort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSimpleConsumerPort(String newValue)
	 * 
	 */
	public void setSimpleConsumerPort(String newValue) {
		if (newValue != null) {
			simpleConsumerPort.setText(newValue);
		} else {
			simpleConsumerPort.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort);
		if (eefElementEditorReadOnlyState && simpleConsumerPort.isEnabled()) {
			simpleConsumerPort.setEnabled(false);
			simpleConsumerPort.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !simpleConsumerPort.isEnabled()) {
			simpleConsumerPort.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSimpleConsumerPartition()
	 * 
	 */
	public String getSimpleConsumerPartition() {
		return simpleConsumerPartition.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSimpleConsumerPartition(String newValue)
	 * 
	 */
	public void setSimpleConsumerPartition(String newValue) {
		if (newValue != null) {
			simpleConsumerPartition.setText(newValue);
		} else {
			simpleConsumerPartition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition);
		if (eefElementEditorReadOnlyState && simpleConsumerPartition.isEnabled()) {
			simpleConsumerPartition.setEnabled(false);
			simpleConsumerPartition.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !simpleConsumerPartition.isEnabled()) {
			simpleConsumerPartition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSimpleConsumerMaxMessagesToRead()
	 * 
	 */
	public String getSimpleConsumerMaxMessagesToRead() {
		return simpleConsumerMaxMessagesToRead.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSimpleConsumerMaxMessagesToRead(String newValue)
	 * 
	 */
	public void setSimpleConsumerMaxMessagesToRead(String newValue) {
		if (newValue != null) {
			simpleConsumerMaxMessagesToRead.setText(newValue);
		} else {
			simpleConsumerMaxMessagesToRead.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead);
		if (eefElementEditorReadOnlyState && simpleConsumerMaxMessagesToRead.isEnabled()) {
			simpleConsumerMaxMessagesToRead.setEnabled(false);
			simpleConsumerMaxMessagesToRead.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !simpleConsumerMaxMessagesToRead.isEnabled()) {
			simpleConsumerMaxMessagesToRead.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getThreadCount()
	 * 
	 */
	public String getThreadCount() {
		return threadCount.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setThreadCount(String newValue)
	 * 
	 */
	public void setThreadCount(String newValue) {
		if (newValue != null) {
			threadCount.setText(newValue);
		} else {
			threadCount.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.threadCount);
		if (eefElementEditorReadOnlyState && threadCount.isEnabled()) {
			threadCount.setEnabled(false);
			threadCount.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !threadCount.isEnabled()) {
			threadCount.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getConsumerId()
	 * 
	 */
	public String getConsumerId() {
		return consumerId.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setConsumerId(String newValue)
	 * 
	 */
	public void setConsumerId(String newValue) {
		if (newValue != null) {
			consumerId.setText(newValue);
		} else {
			consumerId.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.consumerId);
		if (eefElementEditorReadOnlyState && consumerId.isEnabled()) {
			consumerId.setEnabled(false);
			consumerId.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !consumerId.isEnabled()) {
			consumerId.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSocketTimeoutMs()
	 * 
	 */
	public String getSocketTimeoutMs() {
		return socketTimeoutMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSocketTimeoutMs(String newValue)
	 * 
	 */
	public void setSocketTimeoutMs(String newValue) {
		if (newValue != null) {
			socketTimeoutMs.setText(newValue);
		} else {
			socketTimeoutMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs);
		if (eefElementEditorReadOnlyState && socketTimeoutMs.isEnabled()) {
			socketTimeoutMs.setEnabled(false);
			socketTimeoutMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !socketTimeoutMs.isEnabled()) {
			socketTimeoutMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSocketReceiveBufferBytes()
	 * 
	 */
	public String getSocketReceiveBufferBytes() {
		return socketReceiveBufferBytes.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSocketReceiveBufferBytes(String newValue)
	 * 
	 */
	public void setSocketReceiveBufferBytes(String newValue) {
		if (newValue != null) {
			socketReceiveBufferBytes.setText(newValue);
		} else {
			socketReceiveBufferBytes.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes);
		if (eefElementEditorReadOnlyState && socketReceiveBufferBytes.isEnabled()) {
			socketReceiveBufferBytes.setEnabled(false);
			socketReceiveBufferBytes.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !socketReceiveBufferBytes.isEnabled()) {
			socketReceiveBufferBytes.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getFetchMessageMaxBytes()
	 * 
	 */
	public String getFetchMessageMaxBytes() {
		return fetchMessageMaxBytes.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setFetchMessageMaxBytes(String newValue)
	 * 
	 */
	public void setFetchMessageMaxBytes(String newValue) {
		if (newValue != null) {
			fetchMessageMaxBytes.setText(newValue);
		} else {
			fetchMessageMaxBytes.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes);
		if (eefElementEditorReadOnlyState && fetchMessageMaxBytes.isEnabled()) {
			fetchMessageMaxBytes.setEnabled(false);
			fetchMessageMaxBytes.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fetchMessageMaxBytes.isEnabled()) {
			fetchMessageMaxBytes.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getNumConsumerFetches()
	 * 
	 */
	public String getNumConsumerFetches() {
		return numConsumerFetches.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setNumConsumerFetches(String newValue)
	 * 
	 */
	public void setNumConsumerFetches(String newValue) {
		if (newValue != null) {
			numConsumerFetches.setText(newValue);
		} else {
			numConsumerFetches.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches);
		if (eefElementEditorReadOnlyState && numConsumerFetches.isEnabled()) {
			numConsumerFetches.setEnabled(false);
			numConsumerFetches.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !numConsumerFetches.isEnabled()) {
			numConsumerFetches.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getAutoCommitEnable()
	 * 
	 */
	public Boolean getAutoCommitEnable() {
		return Boolean.valueOf(autoCommitEnable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setAutoCommitEnable(Boolean newValue)
	 * 
	 */
	public void setAutoCommitEnable(Boolean newValue) {
		if (newValue != null) {
			autoCommitEnable.setSelection(newValue.booleanValue());
		} else {
			autoCommitEnable.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable);
		if (eefElementEditorReadOnlyState && autoCommitEnable.isEnabled()) {
			autoCommitEnable.setEnabled(false);
			autoCommitEnable.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !autoCommitEnable.isEnabled()) {
			autoCommitEnable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getAutoCommitIntervalMs()
	 * 
	 */
	public String getAutoCommitIntervalMs() {
		return autoCommitIntervalMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setAutoCommitIntervalMs(String newValue)
	 * 
	 */
	public void setAutoCommitIntervalMs(String newValue) {
		if (newValue != null) {
			autoCommitIntervalMs.setText(newValue);
		} else {
			autoCommitIntervalMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs);
		if (eefElementEditorReadOnlyState && autoCommitIntervalMs.isEnabled()) {
			autoCommitIntervalMs.setEnabled(false);
			autoCommitIntervalMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !autoCommitIntervalMs.isEnabled()) {
			autoCommitIntervalMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getQueuedMaxMessageChunks()
	 * 
	 */
	public String getQueuedMaxMessageChunks() {
		return queuedMaxMessageChunks.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setQueuedMaxMessageChunks(String newValue)
	 * 
	 */
	public void setQueuedMaxMessageChunks(String newValue) {
		if (newValue != null) {
			queuedMaxMessageChunks.setText(newValue);
		} else {
			queuedMaxMessageChunks.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks);
		if (eefElementEditorReadOnlyState && queuedMaxMessageChunks.isEnabled()) {
			queuedMaxMessageChunks.setEnabled(false);
			queuedMaxMessageChunks.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !queuedMaxMessageChunks.isEnabled()) {
			queuedMaxMessageChunks.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getRebalanceMaxRetries()
	 * 
	 */
	public String getRebalanceMaxRetries() {
		return rebalanceMaxRetries.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setRebalanceMaxRetries(String newValue)
	 * 
	 */
	public void setRebalanceMaxRetries(String newValue) {
		if (newValue != null) {
			rebalanceMaxRetries.setText(newValue);
		} else {
			rebalanceMaxRetries.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries);
		if (eefElementEditorReadOnlyState && rebalanceMaxRetries.isEnabled()) {
			rebalanceMaxRetries.setEnabled(false);
			rebalanceMaxRetries.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rebalanceMaxRetries.isEnabled()) {
			rebalanceMaxRetries.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getFetchMinBytes()
	 * 
	 */
	public String getFetchMinBytes() {
		return fetchMinBytes.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setFetchMinBytes(String newValue)
	 * 
	 */
	public void setFetchMinBytes(String newValue) {
		if (newValue != null) {
			fetchMinBytes.setText(newValue);
		} else {
			fetchMinBytes.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes);
		if (eefElementEditorReadOnlyState && fetchMinBytes.isEnabled()) {
			fetchMinBytes.setEnabled(false);
			fetchMinBytes.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fetchMinBytes.isEnabled()) {
			fetchMinBytes.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getFetchWaitMaxMs()
	 * 
	 */
	public String getFetchWaitMaxMs() {
		return fetchWaitMaxMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setFetchWaitMaxMs(String newValue)
	 * 
	 */
	public void setFetchWaitMaxMs(String newValue) {
		if (newValue != null) {
			fetchWaitMaxMs.setText(newValue);
		} else {
			fetchWaitMaxMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs);
		if (eefElementEditorReadOnlyState && fetchWaitMaxMs.isEnabled()) {
			fetchWaitMaxMs.setEnabled(false);
			fetchWaitMaxMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fetchWaitMaxMs.isEnabled()) {
			fetchWaitMaxMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getRebalanceBackoffMs()
	 * 
	 */
	public String getRebalanceBackoffMs() {
		return rebalanceBackoffMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setRebalanceBackoffMs(String newValue)
	 * 
	 */
	public void setRebalanceBackoffMs(String newValue) {
		if (newValue != null) {
			rebalanceBackoffMs.setText(newValue);
		} else {
			rebalanceBackoffMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs);
		if (eefElementEditorReadOnlyState && rebalanceBackoffMs.isEnabled()) {
			rebalanceBackoffMs.setEnabled(false);
			rebalanceBackoffMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rebalanceBackoffMs.isEnabled()) {
			rebalanceBackoffMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getRefreshLeaderBackoffMs()
	 * 
	 */
	public String getRefreshLeaderBackoffMs() {
		return refreshLeaderBackoffMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setRefreshLeaderBackoffMs(String newValue)
	 * 
	 */
	public void setRefreshLeaderBackoffMs(String newValue) {
		if (newValue != null) {
			refreshLeaderBackoffMs.setText(newValue);
		} else {
			refreshLeaderBackoffMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs);
		if (eefElementEditorReadOnlyState && refreshLeaderBackoffMs.isEnabled()) {
			refreshLeaderBackoffMs.setEnabled(false);
			refreshLeaderBackoffMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !refreshLeaderBackoffMs.isEnabled()) {
			refreshLeaderBackoffMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getAutoOffsetReset()
	 * 
	 */
	public Enumerator getAutoOffsetReset() {
		Enumerator selection = (Enumerator) ((StructuredSelection) autoOffsetReset.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initAutoOffsetReset(Object input, Enumerator current)
	 */
	public void initAutoOffsetReset(Object input, Enumerator current) {
		autoOffsetReset.setInput(input);
		autoOffsetReset.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset);
		if (eefElementEditorReadOnlyState && autoOffsetReset.isEnabled()) {
			autoOffsetReset.setEnabled(false);
			autoOffsetReset.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !autoOffsetReset.isEnabled()) {
			autoOffsetReset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setAutoOffsetReset(Enumerator newValue)
	 * 
	 */
	public void setAutoOffsetReset(Enumerator newValue) {
		autoOffsetReset.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset);
		if (eefElementEditorReadOnlyState && autoOffsetReset.isEnabled()) {
			autoOffsetReset.setEnabled(false);
			autoOffsetReset.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !autoOffsetReset.isEnabled()) {
			autoOffsetReset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getConsumerTimeoutMs()
	 * 
	 */
	public String getConsumerTimeoutMs() {
		return consumerTimeoutMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setConsumerTimeoutMs(String newValue)
	 * 
	 */
	public void setConsumerTimeoutMs(String newValue) {
		if (newValue != null) {
			consumerTimeoutMs.setText(newValue);
		} else {
			consumerTimeoutMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs);
		if (eefElementEditorReadOnlyState && consumerTimeoutMs.isEnabled()) {
			consumerTimeoutMs.setEnabled(false);
			consumerTimeoutMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !consumerTimeoutMs.isEnabled()) {
			consumerTimeoutMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getExcludeInternalTopics()
	 * 
	 */
	public Boolean getExcludeInternalTopics() {
		return Boolean.valueOf(excludeInternalTopics.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setExcludeInternalTopics(Boolean newValue)
	 * 
	 */
	public void setExcludeInternalTopics(Boolean newValue) {
		if (newValue != null) {
			excludeInternalTopics.setSelection(newValue.booleanValue());
		} else {
			excludeInternalTopics.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics);
		if (eefElementEditorReadOnlyState && excludeInternalTopics.isEnabled()) {
			excludeInternalTopics.setEnabled(false);
			excludeInternalTopics.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !excludeInternalTopics.isEnabled()) {
			excludeInternalTopics.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getPartitionAssignmentStrategy()
	 * 
	 */
	public Enumerator getPartitionAssignmentStrategy() {
		Enumerator selection = (Enumerator) ((StructuredSelection) partitionAssignmentStrategy.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initPartitionAssignmentStrategy(Object input, Enumerator current)
	 */
	public void initPartitionAssignmentStrategy(Object input, Enumerator current) {
		partitionAssignmentStrategy.setInput(input);
		partitionAssignmentStrategy.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy);
		if (eefElementEditorReadOnlyState && partitionAssignmentStrategy.isEnabled()) {
			partitionAssignmentStrategy.setEnabled(false);
			partitionAssignmentStrategy.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !partitionAssignmentStrategy.isEnabled()) {
			partitionAssignmentStrategy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setPartitionAssignmentStrategy(Enumerator newValue)
	 * 
	 */
	public void setPartitionAssignmentStrategy(Enumerator newValue) {
		partitionAssignmentStrategy.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy);
		if (eefElementEditorReadOnlyState && partitionAssignmentStrategy.isEnabled()) {
			partitionAssignmentStrategy.setEnabled(false);
			partitionAssignmentStrategy.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !partitionAssignmentStrategy.isEnabled()) {
			partitionAssignmentStrategy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getClientId()
	 * 
	 */
	public String getClientId() {
		return clientId.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setClientId(String newValue)
	 * 
	 */
	public void setClientId(String newValue) {
		if (newValue != null) {
			clientId.setText(newValue);
		} else {
			clientId.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.clientId);
		if (eefElementEditorReadOnlyState && clientId.isEnabled()) {
			clientId.setEnabled(false);
			clientId.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clientId.isEnabled()) {
			clientId.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getZookeeperSessionTimeoutMs()
	 * 
	 */
	public String getZookeeperSessionTimeoutMs() {
		return zookeeperSessionTimeoutMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setZookeeperSessionTimeoutMs(String newValue)
	 * 
	 */
	public void setZookeeperSessionTimeoutMs(String newValue) {
		if (newValue != null) {
			zookeeperSessionTimeoutMs.setText(newValue);
		} else {
			zookeeperSessionTimeoutMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs);
		if (eefElementEditorReadOnlyState && zookeeperSessionTimeoutMs.isEnabled()) {
			zookeeperSessionTimeoutMs.setEnabled(false);
			zookeeperSessionTimeoutMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !zookeeperSessionTimeoutMs.isEnabled()) {
			zookeeperSessionTimeoutMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getZookeeperConnectionTimeoutMs()
	 * 
	 */
	public String getZookeeperConnectionTimeoutMs() {
		return zookeeperConnectionTimeoutMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setZookeeperConnectionTimeoutMs(String newValue)
	 * 
	 */
	public void setZookeeperConnectionTimeoutMs(String newValue) {
		if (newValue != null) {
			zookeeperConnectionTimeoutMs.setText(newValue);
		} else {
			zookeeperConnectionTimeoutMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs);
		if (eefElementEditorReadOnlyState && zookeeperConnectionTimeoutMs.isEnabled()) {
			zookeeperConnectionTimeoutMs.setEnabled(false);
			zookeeperConnectionTimeoutMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !zookeeperConnectionTimeoutMs.isEnabled()) {
			zookeeperConnectionTimeoutMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getZookeeperSyncTimeMs()
	 * 
	 */
	public String getZookeeperSyncTimeMs() {
		return zookeeperSyncTimeMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setZookeeperSyncTimeMs(String newValue)
	 * 
	 */
	public void setZookeeperSyncTimeMs(String newValue) {
		if (newValue != null) {
			zookeeperSyncTimeMs.setText(newValue);
		} else {
			zookeeperSyncTimeMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs);
		if (eefElementEditorReadOnlyState && zookeeperSyncTimeMs.isEnabled()) {
			zookeeperSyncTimeMs.setEnabled(false);
			zookeeperSyncTimeMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !zookeeperSyncTimeMs.isEnabled()) {
			zookeeperSyncTimeMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getOffsetsStorage()
	 * 
	 */
	public Enumerator getOffsetsStorage() {
		Enumerator selection = (Enumerator) ((StructuredSelection) offsetsStorage.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initOffsetsStorage(Object input, Enumerator current)
	 */
	public void initOffsetsStorage(Object input, Enumerator current) {
		offsetsStorage.setInput(input);
		offsetsStorage.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage);
		if (eefElementEditorReadOnlyState && offsetsStorage.isEnabled()) {
			offsetsStorage.setEnabled(false);
			offsetsStorage.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !offsetsStorage.isEnabled()) {
			offsetsStorage.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setOffsetsStorage(Enumerator newValue)
	 * 
	 */
	public void setOffsetsStorage(Enumerator newValue) {
		offsetsStorage.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage);
		if (eefElementEditorReadOnlyState && offsetsStorage.isEnabled()) {
			offsetsStorage.setEnabled(false);
			offsetsStorage.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !offsetsStorage.isEnabled()) {
			offsetsStorage.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getOffsetsChannelBackoffMs()
	 * 
	 */
	public String getOffsetsChannelBackoffMs() {
		return offsetsChannelBackoffMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setOffsetsChannelBackoffMs(String newValue)
	 * 
	 */
	public void setOffsetsChannelBackoffMs(String newValue) {
		if (newValue != null) {
			offsetsChannelBackoffMs.setText(newValue);
		} else {
			offsetsChannelBackoffMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs);
		if (eefElementEditorReadOnlyState && offsetsChannelBackoffMs.isEnabled()) {
			offsetsChannelBackoffMs.setEnabled(false);
			offsetsChannelBackoffMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !offsetsChannelBackoffMs.isEnabled()) {
			offsetsChannelBackoffMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getOffsetsChannelSocketTimeoutMs()
	 * 
	 */
	public String getOffsetsChannelSocketTimeoutMs() {
		return offsetsChannelSocketTimeoutMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setOffsetsChannelSocketTimeoutMs(String newValue)
	 * 
	 */
	public void setOffsetsChannelSocketTimeoutMs(String newValue) {
		if (newValue != null) {
			offsetsChannelSocketTimeoutMs.setText(newValue);
		} else {
			offsetsChannelSocketTimeoutMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs);
		if (eefElementEditorReadOnlyState && offsetsChannelSocketTimeoutMs.isEnabled()) {
			offsetsChannelSocketTimeoutMs.setEnabled(false);
			offsetsChannelSocketTimeoutMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !offsetsChannelSocketTimeoutMs.isEnabled()) {
			offsetsChannelSocketTimeoutMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getOffsetsCommitMaxRetries()
	 * 
	 */
	public String getOffsetsCommitMaxRetries() {
		return offsetsCommitMaxRetries.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setOffsetsCommitMaxRetries(String newValue)
	 * 
	 */
	public void setOffsetsCommitMaxRetries(String newValue) {
		if (newValue != null) {
			offsetsCommitMaxRetries.setText(newValue);
		} else {
			offsetsCommitMaxRetries.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries);
		if (eefElementEditorReadOnlyState && offsetsCommitMaxRetries.isEnabled()) {
			offsetsCommitMaxRetries.setEnabled(false);
			offsetsCommitMaxRetries.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !offsetsCommitMaxRetries.isEnabled()) {
			offsetsCommitMaxRetries.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getDualCommitEnabled()
	 * 
	 */
	public Boolean getDualCommitEnabled() {
		return Boolean.valueOf(dualCommitEnabled.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setDualCommitEnabled(Boolean newValue)
	 * 
	 */
	public void setDualCommitEnabled(Boolean newValue) {
		if (newValue != null) {
			dualCommitEnabled.setSelection(newValue.booleanValue());
		} else {
			dualCommitEnabled.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled);
		if (eefElementEditorReadOnlyState && dualCommitEnabled.isEnabled()) {
			dualCommitEnabled.setEnabled(false);
			dualCommitEnabled.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dualCommitEnabled.isEnabled()) {
			dualCommitEnabled.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundCxfRmHost()
	 * 
	 */
	public String getInboundCxfRmHost() {
		return inboundCxfRmHost.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundCxfRmHost(String newValue)
	 * 
	 */
	public void setInboundCxfRmHost(String newValue) {
		if (newValue != null) {
			inboundCxfRmHost.setText(newValue);
		} else {
			inboundCxfRmHost.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost);
		if (eefElementEditorReadOnlyState && inboundCxfRmHost.isEnabled()) {
			inboundCxfRmHost.setEnabled(false);
			inboundCxfRmHost.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundCxfRmHost.isEnabled()) {
			inboundCxfRmHost.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundCxfRmPort()
	 * 
	 */
	public String getInboundCxfRmPort() {
		return inboundCxfRmPort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundCxfRmPort(String newValue)
	 * 
	 */
	public void setInboundCxfRmPort(String newValue) {
		if (newValue != null) {
			inboundCxfRmPort.setText(newValue);
		} else {
			inboundCxfRmPort.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort);
		if (eefElementEditorReadOnlyState && inboundCxfRmPort.isEnabled()) {
			inboundCxfRmPort.setEnabled(false);
			inboundCxfRmPort.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundCxfRmPort.isEnabled()) {
			inboundCxfRmPort.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundCxfRmConfigFile()
	 * 
	 */
	public String getInboundCxfRmConfigFile() {
		return inboundCxfRmConfigFile.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundCxfRmConfigFile(String newValue)
	 * 
	 */
	public void setInboundCxfRmConfigFile(String newValue) {
		if (newValue != null) {
			inboundCxfRmConfigFile.setText(newValue);
		} else {
			inboundCxfRmConfigFile.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile);
		if (eefElementEditorReadOnlyState && inboundCxfRmConfigFile.isEnabled()) {
			inboundCxfRmConfigFile.setEnabled(false);
			inboundCxfRmConfigFile.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundCxfRmConfigFile.isEnabled()) {
			inboundCxfRmConfigFile.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getEnableSSL()
	 * 
	 */
	public Boolean getEnableSSL() {
		return Boolean.valueOf(enableSSL.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setEnableSSL(Boolean newValue)
	 * 
	 */
	public void setEnableSSL(Boolean newValue) {
		if (newValue != null) {
			enableSSL.setSelection(newValue.booleanValue());
		} else {
			enableSSL.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.enableSSL);
		if (eefElementEditorReadOnlyState && enableSSL.isEnabled()) {
			enableSSL.setEnabled(false);
			enableSSL.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !enableSSL.isEnabled()) {
			enableSSL.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initServiceParameters(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initServiceParameters(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		serviceParameters.setContentProvider(contentProvider);
		serviceParameters.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.serviceParameters);
		if (eefElementEditorReadOnlyState && serviceParameters.isEnabled()) {
			serviceParameters.setEnabled(false);
			serviceParameters.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !serviceParameters.isEnabled()) {
			serviceParameters.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#updateServiceParameters()
	 * 
	 */
	public void updateServiceParameters() {
	serviceParameters.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#addFilterServiceParameters(ViewerFilter filter)
	 * 
	 */
	public void addFilterToServiceParameters(ViewerFilter filter) {
		serviceParametersFilters.add(filter);
		if (this.serviceParameters != null) {
			this.serviceParameters.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#addBusinessFilterServiceParameters(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToServiceParameters(ViewerFilter filter) {
		serviceParametersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#isContainedInServiceParametersTable(EObject element)
	 * 
	 */
	public boolean isContainedInServiceParametersTable(EObject element) {
		return ((ReferencesTableSettings)serviceParameters.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSuspend()
	 * 
	 */
	public Boolean getSuspend() {
		return Boolean.valueOf(suspend.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSuspend(Boolean newValue)
	 * 
	 */
	public void setSuspend(Boolean newValue) {
		if (newValue != null) {
			suspend.setSelection(newValue.booleanValue());
		} else {
			suspend.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.suspend);
		if (eefElementEditorReadOnlyState && suspend.isEnabled()) {
			suspend.setEnabled(false);
			suspend.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !suspend.isEnabled()) {
			suspend.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionFactory()
	 * 
	 */
	public String getTransportRabbitMqConnectionFactory() {
		return transportRabbitMqConnectionFactory.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionFactory(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionFactory(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionFactory.setText(newValue);
		} else {
			transportRabbitMqConnectionFactory.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionFactory.isEnabled()) {
			transportRabbitMqConnectionFactory.setEnabled(false);
			transportRabbitMqConnectionFactory.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionFactory.isEnabled()) {
			transportRabbitMqConnectionFactory.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqServerHostName()
	 * 
	 */
	public String getTransportRabbitMqServerHostName() {
		return transportRabbitMqServerHostName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqServerHostName(String newValue)
	 * 
	 */
	public void setTransportRabbitMqServerHostName(String newValue) {
		if (newValue != null) {
			transportRabbitMqServerHostName.setText(newValue);
		} else {
			transportRabbitMqServerHostName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName);
		if (eefElementEditorReadOnlyState && transportRabbitMqServerHostName.isEnabled()) {
			transportRabbitMqServerHostName.setEnabled(false);
			transportRabbitMqServerHostName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqServerHostName.isEnabled()) {
			transportRabbitMqServerHostName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqServerPort()
	 * 
	 */
	public String getTransportRabbitMqServerPort() {
		return transportRabbitMqServerPort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqServerPort(String newValue)
	 * 
	 */
	public void setTransportRabbitMqServerPort(String newValue) {
		if (newValue != null) {
			transportRabbitMqServerPort.setText(newValue);
		} else {
			transportRabbitMqServerPort.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort);
		if (eefElementEditorReadOnlyState && transportRabbitMqServerPort.isEnabled()) {
			transportRabbitMqServerPort.setEnabled(false);
			transportRabbitMqServerPort.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqServerPort.isEnabled()) {
			transportRabbitMqServerPort.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqServerUserName()
	 * 
	 */
	public String getTransportRabbitMqServerUserName() {
		return transportRabbitMqServerUserName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqServerUserName(String newValue)
	 * 
	 */
	public void setTransportRabbitMqServerUserName(String newValue) {
		if (newValue != null) {
			transportRabbitMqServerUserName.setText(newValue);
		} else {
			transportRabbitMqServerUserName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName);
		if (eefElementEditorReadOnlyState && transportRabbitMqServerUserName.isEnabled()) {
			transportRabbitMqServerUserName.setEnabled(false);
			transportRabbitMqServerUserName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqServerUserName.isEnabled()) {
			transportRabbitMqServerUserName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqServerPassword()
	 * 
	 */
	public String getTransportRabbitMqServerPassword() {
		return transportRabbitMqServerPassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqServerPassword(String newValue)
	 * 
	 */
	public void setTransportRabbitMqServerPassword(String newValue) {
		if (newValue != null) {
			transportRabbitMqServerPassword.setText(newValue);
		} else {
			transportRabbitMqServerPassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword);
		if (eefElementEditorReadOnlyState && transportRabbitMqServerPassword.isEnabled()) {
			transportRabbitMqServerPassword.setEnabled(false);
			transportRabbitMqServerPassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqServerPassword.isEnabled()) {
			transportRabbitMqServerPassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueName()
	 * 
	 */
	public String getTransportRabbitMqQueueName() {
		return transportRabbitMqQueueName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueName(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueName(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueName.setText(newValue);
		} else {
			transportRabbitMqQueueName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueName.isEnabled()) {
			transportRabbitMqQueueName.setEnabled(false);
			transportRabbitMqQueueName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueName.isEnabled()) {
			transportRabbitMqQueueName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqExchangeName()
	 * 
	 */
	public String getTransportRabbitMqExchangeName() {
		return transportRabbitMqExchangeName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqExchangeName(String newValue)
	 * 
	 */
	public void setTransportRabbitMqExchangeName(String newValue) {
		if (newValue != null) {
			transportRabbitMqExchangeName.setText(newValue);
		} else {
			transportRabbitMqExchangeName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName);
		if (eefElementEditorReadOnlyState && transportRabbitMqExchangeName.isEnabled()) {
			transportRabbitMqExchangeName.setEnabled(false);
			transportRabbitMqExchangeName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqExchangeName.isEnabled()) {
			transportRabbitMqExchangeName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueDurable()
	 * 
	 */
	public String getTransportRabbitMqQueueDurable() {
		return transportRabbitMqQueueDurable.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueDurable(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueDurable(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueDurable.setText(newValue);
		} else {
			transportRabbitMqQueueDurable.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueDurable.isEnabled()) {
			transportRabbitMqQueueDurable.setEnabled(false);
			transportRabbitMqQueueDurable.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueDurable.isEnabled()) {
			transportRabbitMqQueueDurable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueExclusive()
	 * 
	 */
	public String getTransportRabbitMqQueueExclusive() {
		return transportRabbitMqQueueExclusive.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueExclusive(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueExclusive(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueExclusive.setText(newValue);
		} else {
			transportRabbitMqQueueExclusive.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueExclusive.isEnabled()) {
			transportRabbitMqQueueExclusive.setEnabled(false);
			transportRabbitMqQueueExclusive.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueExclusive.isEnabled()) {
			transportRabbitMqQueueExclusive.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueAutoDelete()
	 * 
	 */
	public String getTransportRabbitMqQueueAutoDelete() {
		return transportRabbitMqQueueAutoDelete.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueAutoDelete(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueAutoDelete(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueAutoDelete.setText(newValue);
		} else {
			transportRabbitMqQueueAutoDelete.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueAutoDelete.isEnabled()) {
			transportRabbitMqQueueAutoDelete.setEnabled(false);
			transportRabbitMqQueueAutoDelete.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueAutoDelete.isEnabled()) {
			transportRabbitMqQueueAutoDelete.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueAutoAck()
	 * 
	 */
	public String getTransportRabbitMqQueueAutoAck() {
		return transportRabbitMqQueueAutoAck.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueAutoAck(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueAutoAck(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueAutoAck.setText(newValue);
		} else {
			transportRabbitMqQueueAutoAck.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueAutoAck.isEnabled()) {
			transportRabbitMqQueueAutoAck.setEnabled(false);
			transportRabbitMqQueueAutoAck.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueAutoAck.isEnabled()) {
			transportRabbitMqQueueAutoAck.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueRoutingKey()
	 * 
	 */
	public String getTransportRabbitMqQueueRoutingKey() {
		return transportRabbitMqQueueRoutingKey.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueRoutingKey(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueRoutingKey(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueRoutingKey.setText(newValue);
		} else {
			transportRabbitMqQueueRoutingKey.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueRoutingKey.isEnabled()) {
			transportRabbitMqQueueRoutingKey.setEnabled(false);
			transportRabbitMqQueueRoutingKey.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueRoutingKey.isEnabled()) {
			transportRabbitMqQueueRoutingKey.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueDeliveryMode()
	 * 
	 */
	public String getTransportRabbitMqQueueDeliveryMode() {
		return transportRabbitMqQueueDeliveryMode.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueDeliveryMode(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueDeliveryMode(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueDeliveryMode.setText(newValue);
		} else {
			transportRabbitMqQueueDeliveryMode.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueDeliveryMode.isEnabled()) {
			transportRabbitMqQueueDeliveryMode.setEnabled(false);
			transportRabbitMqQueueDeliveryMode.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueDeliveryMode.isEnabled()) {
			transportRabbitMqQueueDeliveryMode.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqExchangeType()
	 * 
	 */
	public String getTransportRabbitMqExchangeType() {
		return transportRabbitMqExchangeType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqExchangeType(String newValue)
	 * 
	 */
	public void setTransportRabbitMqExchangeType(String newValue) {
		if (newValue != null) {
			transportRabbitMqExchangeType.setText(newValue);
		} else {
			transportRabbitMqExchangeType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType);
		if (eefElementEditorReadOnlyState && transportRabbitMqExchangeType.isEnabled()) {
			transportRabbitMqExchangeType.setEnabled(false);
			transportRabbitMqExchangeType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqExchangeType.isEnabled()) {
			transportRabbitMqExchangeType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqExchangeDurable()
	 * 
	 */
	public String getTransportRabbitMqExchangeDurable() {
		return transportRabbitMqExchangeDurable.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqExchangeDurable(String newValue)
	 * 
	 */
	public void setTransportRabbitMqExchangeDurable(String newValue) {
		if (newValue != null) {
			transportRabbitMqExchangeDurable.setText(newValue);
		} else {
			transportRabbitMqExchangeDurable.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable);
		if (eefElementEditorReadOnlyState && transportRabbitMqExchangeDurable.isEnabled()) {
			transportRabbitMqExchangeDurable.setEnabled(false);
			transportRabbitMqExchangeDurable.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqExchangeDurable.isEnabled()) {
			transportRabbitMqExchangeDurable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqExchangeAutoDelete()
	 * 
	 */
	public String getTransportRabbitMqExchangeAutoDelete() {
		return transportRabbitMqExchangeAutoDelete.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqExchangeAutoDelete(String newValue)
	 * 
	 */
	public void setTransportRabbitMqExchangeAutoDelete(String newValue) {
		if (newValue != null) {
			transportRabbitMqExchangeAutoDelete.setText(newValue);
		} else {
			transportRabbitMqExchangeAutoDelete.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete);
		if (eefElementEditorReadOnlyState && transportRabbitMqExchangeAutoDelete.isEnabled()) {
			transportRabbitMqExchangeAutoDelete.setEnabled(false);
			transportRabbitMqExchangeAutoDelete.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqExchangeAutoDelete.isEnabled()) {
			transportRabbitMqExchangeAutoDelete.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqServerVirtualHost()
	 * 
	 */
	public String getTransportRabbitMqServerVirtualHost() {
		return transportRabbitMqServerVirtualHost.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqServerVirtualHost(String newValue)
	 * 
	 */
	public void setTransportRabbitMqServerVirtualHost(String newValue) {
		if (newValue != null) {
			transportRabbitMqServerVirtualHost.setText(newValue);
		} else {
			transportRabbitMqServerVirtualHost.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost);
		if (eefElementEditorReadOnlyState && transportRabbitMqServerVirtualHost.isEnabled()) {
			transportRabbitMqServerVirtualHost.setEnabled(false);
			transportRabbitMqServerVirtualHost.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqServerVirtualHost.isEnabled()) {
			transportRabbitMqServerVirtualHost.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqFactoryHeartbeat()
	 * 
	 */
	public String getTransportRabbitMqFactoryHeartbeat() {
		return transportRabbitMqFactoryHeartbeat.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqFactoryHeartbeat(String newValue)
	 * 
	 */
	public void setTransportRabbitMqFactoryHeartbeat(String newValue) {
		if (newValue != null) {
			transportRabbitMqFactoryHeartbeat.setText(newValue);
		} else {
			transportRabbitMqFactoryHeartbeat.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat);
		if (eefElementEditorReadOnlyState && transportRabbitMqFactoryHeartbeat.isEnabled()) {
			transportRabbitMqFactoryHeartbeat.setEnabled(false);
			transportRabbitMqFactoryHeartbeat.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqFactoryHeartbeat.isEnabled()) {
			transportRabbitMqFactoryHeartbeat.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslEnabled()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslEnabled() {
		return transportRabbitMqConnectionSslEnabled.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslEnabled(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslEnabled(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslEnabled.setText(newValue);
		} else {
			transportRabbitMqConnectionSslEnabled.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslEnabled.isEnabled()) {
			transportRabbitMqConnectionSslEnabled.setEnabled(false);
			transportRabbitMqConnectionSslEnabled.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslEnabled.isEnabled()) {
			transportRabbitMqConnectionSslEnabled.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslKeystoreLocation()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslKeystoreLocation() {
		return transportRabbitMqConnectionSslKeystoreLocation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslKeystoreLocation(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslKeystoreLocation(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslKeystoreLocation.setText(newValue);
		} else {
			transportRabbitMqConnectionSslKeystoreLocation.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslKeystoreLocation.isEnabled()) {
			transportRabbitMqConnectionSslKeystoreLocation.setEnabled(false);
			transportRabbitMqConnectionSslKeystoreLocation.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslKeystoreLocation.isEnabled()) {
			transportRabbitMqConnectionSslKeystoreLocation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslKeystoreType()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslKeystoreType() {
		return transportRabbitMqConnectionSslKeystoreType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslKeystoreType(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslKeystoreType(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslKeystoreType.setText(newValue);
		} else {
			transportRabbitMqConnectionSslKeystoreType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslKeystoreType.isEnabled()) {
			transportRabbitMqConnectionSslKeystoreType.setEnabled(false);
			transportRabbitMqConnectionSslKeystoreType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslKeystoreType.isEnabled()) {
			transportRabbitMqConnectionSslKeystoreType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslKeystorePassword()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslKeystorePassword() {
		return transportRabbitMqConnectionSslKeystorePassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslKeystorePassword(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslKeystorePassword(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslKeystorePassword.setText(newValue);
		} else {
			transportRabbitMqConnectionSslKeystorePassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslKeystorePassword.isEnabled()) {
			transportRabbitMqConnectionSslKeystorePassword.setEnabled(false);
			transportRabbitMqConnectionSslKeystorePassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslKeystorePassword.isEnabled()) {
			transportRabbitMqConnectionSslKeystorePassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslTruststoreLocation()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslTruststoreLocation() {
		return transportRabbitMqConnectionSslTruststoreLocation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslTruststoreLocation(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslTruststoreLocation(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslTruststoreLocation.setText(newValue);
		} else {
			transportRabbitMqConnectionSslTruststoreLocation.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslTruststoreLocation.isEnabled()) {
			transportRabbitMqConnectionSslTruststoreLocation.setEnabled(false);
			transportRabbitMqConnectionSslTruststoreLocation.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslTruststoreLocation.isEnabled()) {
			transportRabbitMqConnectionSslTruststoreLocation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslTruststoreType()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslTruststoreType() {
		return transportRabbitMqConnectionSslTruststoreType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslTruststoreType(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslTruststoreType(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslTruststoreType.setText(newValue);
		} else {
			transportRabbitMqConnectionSslTruststoreType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslTruststoreType.isEnabled()) {
			transportRabbitMqConnectionSslTruststoreType.setEnabled(false);
			transportRabbitMqConnectionSslTruststoreType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslTruststoreType.isEnabled()) {
			transportRabbitMqConnectionSslTruststoreType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslTruststorePassword()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslTruststorePassword() {
		return transportRabbitMqConnectionSslTruststorePassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslTruststorePassword(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslTruststorePassword(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslTruststorePassword.setText(newValue);
		} else {
			transportRabbitMqConnectionSslTruststorePassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslTruststorePassword.isEnabled()) {
			transportRabbitMqConnectionSslTruststorePassword.setEnabled(false);
			transportRabbitMqConnectionSslTruststorePassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslTruststorePassword.isEnabled()) {
			transportRabbitMqConnectionSslTruststorePassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslVersion()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslVersion() {
		return transportRabbitMqConnectionSslVersion.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslVersion(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslVersion(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslVersion.setText(newValue);
		} else {
			transportRabbitMqConnectionSslVersion.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslVersion.isEnabled()) {
			transportRabbitMqConnectionSslVersion.setEnabled(false);
			transportRabbitMqConnectionSslVersion.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslVersion.isEnabled()) {
			transportRabbitMqConnectionSslVersion.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqMessageContentType()
	 * 
	 */
	public String getTransportRabbitMqMessageContentType() {
		return transportRabbitMqMessageContentType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqMessageContentType(String newValue)
	 * 
	 */
	public void setTransportRabbitMqMessageContentType(String newValue) {
		if (newValue != null) {
			transportRabbitMqMessageContentType.setText(newValue);
		} else {
			transportRabbitMqMessageContentType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType);
		if (eefElementEditorReadOnlyState && transportRabbitMqMessageContentType.isEnabled()) {
			transportRabbitMqMessageContentType.setEnabled(false);
			transportRabbitMqMessageContentType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqMessageContentType.isEnabled()) {
			transportRabbitMqMessageContentType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionRetryCount()
	 * 
	 */
	public String getTransportRabbitMqConnectionRetryCount() {
		return transportRabbitMqConnectionRetryCount.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionRetryCount(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionRetryCount(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionRetryCount.setText(newValue);
		} else {
			transportRabbitMqConnectionRetryCount.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionRetryCount.isEnabled()) {
			transportRabbitMqConnectionRetryCount.setEnabled(false);
			transportRabbitMqConnectionRetryCount.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionRetryCount.isEnabled()) {
			transportRabbitMqConnectionRetryCount.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionRetryInterval()
	 * 
	 */
	public String getTransportRabbitMqConnectionRetryInterval() {
		return transportRabbitMqConnectionRetryInterval.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionRetryInterval(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionRetryInterval(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionRetryInterval.setText(newValue);
		} else {
			transportRabbitMqConnectionRetryInterval.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionRetryInterval.isEnabled()) {
			transportRabbitMqConnectionRetryInterval.setEnabled(false);
			transportRabbitMqConnectionRetryInterval.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionRetryInterval.isEnabled()) {
			transportRabbitMqConnectionRetryInterval.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqServerRetryInterval()
	 * 
	 */
	public String getTransportRabbitMqServerRetryInterval() {
		return transportRabbitMqServerRetryInterval.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqServerRetryInterval(String newValue)
	 * 
	 */
	public void setTransportRabbitMqServerRetryInterval(String newValue) {
		if (newValue != null) {
			transportRabbitMqServerRetryInterval.setText(newValue);
		} else {
			transportRabbitMqServerRetryInterval.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval);
		if (eefElementEditorReadOnlyState && transportRabbitMqServerRetryInterval.isEnabled()) {
			transportRabbitMqServerRetryInterval.setEnabled(false);
			transportRabbitMqServerRetryInterval.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqServerRetryInterval.isEnabled()) {
			transportRabbitMqServerRetryInterval.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsInboundPort()
	 * 
	 */
	public String getWsInboundPort() {
		return wsInboundPort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsInboundPort(String newValue)
	 * 
	 */
	public void setWsInboundPort(String newValue) {
		if (newValue != null) {
			wsInboundPort.setText(newValue);
		} else {
			wsInboundPort.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort);
		if (eefElementEditorReadOnlyState && wsInboundPort.isEnabled()) {
			wsInboundPort.setEnabled(false);
			wsInboundPort.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsInboundPort.isEnabled()) {
			wsInboundPort.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsClientSideBroadcastLevel()
	 * 
	 */
	public Enumerator getWsClientSideBroadcastLevel() {
		Enumerator selection = (Enumerator) ((StructuredSelection) wsClientSideBroadcastLevel.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initWsClientSideBroadcastLevel(Object input, Enumerator current)
	 */
	public void initWsClientSideBroadcastLevel(Object input, Enumerator current) {
		wsClientSideBroadcastLevel.setInput(input);
		wsClientSideBroadcastLevel.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel);
		if (eefElementEditorReadOnlyState && wsClientSideBroadcastLevel.isEnabled()) {
			wsClientSideBroadcastLevel.setEnabled(false);
			wsClientSideBroadcastLevel.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsClientSideBroadcastLevel.isEnabled()) {
			wsClientSideBroadcastLevel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsClientSideBroadcastLevel(Enumerator newValue)
	 * 
	 */
	public void setWsClientSideBroadcastLevel(Enumerator newValue) {
		wsClientSideBroadcastLevel.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel);
		if (eefElementEditorReadOnlyState && wsClientSideBroadcastLevel.isEnabled()) {
			wsClientSideBroadcastLevel.setEnabled(false);
			wsClientSideBroadcastLevel.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsClientSideBroadcastLevel.isEnabled()) {
			wsClientSideBroadcastLevel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsOutflowDispatchSequence()
	 * 
	 */
	public String getWsOutflowDispatchSequence() {
		return wsOutflowDispatchSequence.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsOutflowDispatchSequence(String newValue)
	 * 
	 */
	public void setWsOutflowDispatchSequence(String newValue) {
		if (newValue != null) {
			wsOutflowDispatchSequence.setText(newValue);
		} else {
			wsOutflowDispatchSequence.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence);
		if (eefElementEditorReadOnlyState && wsOutflowDispatchSequence.isEnabled()) {
			wsOutflowDispatchSequence.setEnabled(false);
			wsOutflowDispatchSequence.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsOutflowDispatchSequence.isEnabled()) {
			wsOutflowDispatchSequence.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsOutflowDispatchFaultSequence()
	 * 
	 */
	public String getWsOutflowDispatchFaultSequence() {
		return wsOutflowDispatchFaultSequence.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsOutflowDispatchFaultSequence(String newValue)
	 * 
	 */
	public void setWsOutflowDispatchFaultSequence(String newValue) {
		if (newValue != null) {
			wsOutflowDispatchFaultSequence.setText(newValue);
		} else {
			wsOutflowDispatchFaultSequence.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence);
		if (eefElementEditorReadOnlyState && wsOutflowDispatchFaultSequence.isEnabled()) {
			wsOutflowDispatchFaultSequence.setEnabled(false);
			wsOutflowDispatchFaultSequence.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsOutflowDispatchFaultSequence.isEnabled()) {
			wsOutflowDispatchFaultSequence.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsBossThreadPoolSize()
	 * 
	 */
	public String getWsBossThreadPoolSize() {
		return wsBossThreadPoolSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsBossThreadPoolSize(String newValue)
	 * 
	 */
	public void setWsBossThreadPoolSize(String newValue) {
		if (newValue != null) {
			wsBossThreadPoolSize.setText(newValue);
		} else {
			wsBossThreadPoolSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize);
		if (eefElementEditorReadOnlyState && wsBossThreadPoolSize.isEnabled()) {
			wsBossThreadPoolSize.setEnabled(false);
			wsBossThreadPoolSize.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsBossThreadPoolSize.isEnabled()) {
			wsBossThreadPoolSize.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsWorkerThreadPoolSize()
	 * 
	 */
	public String getWsWorkerThreadPoolSize() {
		return wsWorkerThreadPoolSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsWorkerThreadPoolSize(String newValue)
	 * 
	 */
	public void setWsWorkerThreadPoolSize(String newValue) {
		if (newValue != null) {
			wsWorkerThreadPoolSize.setText(newValue);
		} else {
			wsWorkerThreadPoolSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize);
		if (eefElementEditorReadOnlyState && wsWorkerThreadPoolSize.isEnabled()) {
			wsWorkerThreadPoolSize.setEnabled(false);
			wsWorkerThreadPoolSize.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsWorkerThreadPoolSize.isEnabled()) {
			wsWorkerThreadPoolSize.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsSubprotocolHandlerClass()
	 * 
	 */
	public String getWsSubprotocolHandlerClass() {
		return wsSubprotocolHandlerClass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsSubprotocolHandlerClass(String newValue)
	 * 
	 */
	public void setWsSubprotocolHandlerClass(String newValue) {
		if (newValue != null) {
			wsSubprotocolHandlerClass.setText(newValue);
		} else {
			wsSubprotocolHandlerClass.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass);
		if (eefElementEditorReadOnlyState && wsSubprotocolHandlerClass.isEnabled()) {
			wsSubprotocolHandlerClass.setEnabled(false);
			wsSubprotocolHandlerClass.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsSubprotocolHandlerClass.isEnabled()) {
			wsSubprotocolHandlerClass.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsPipelineHandlerClass()
	 * 
	 */
	public String getWsPipelineHandlerClass() {
		return wsPipelineHandlerClass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsPipelineHandlerClass(String newValue)
	 * 
	 */
	public void setWsPipelineHandlerClass(String newValue) {
		if (newValue != null) {
			wsPipelineHandlerClass.setText(newValue);
		} else {
			wsPipelineHandlerClass.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass);
		if (eefElementEditorReadOnlyState && wsPipelineHandlerClass.isEnabled()) {
			wsPipelineHandlerClass.setEnabled(false);
			wsPipelineHandlerClass.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsPipelineHandlerClass.isEnabled()) {
			wsPipelineHandlerClass.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportFeedURL()
	 * 
	 */
	public String getTransportFeedURL() {
		return transportFeedURL.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportFeedURL(String newValue)
	 * 
	 */
	public void setTransportFeedURL(String newValue) {
		if (newValue != null) {
			transportFeedURL.setText(newValue);
		} else {
			transportFeedURL.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL);
		if (eefElementEditorReadOnlyState && transportFeedURL.isEnabled()) {
			transportFeedURL.setEnabled(false);
			transportFeedURL.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportFeedURL.isEnabled()) {
			transportFeedURL.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportFeedType()
	 * 
	 */
	public Enumerator getTransportFeedType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportFeedType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportFeedType(Object input, Enumerator current)
	 */
	public void initTransportFeedType(Object input, Enumerator current) {
		transportFeedType.setInput(input);
		transportFeedType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportFeedType);
		if (eefElementEditorReadOnlyState && transportFeedType.isEnabled()) {
			transportFeedType.setEnabled(false);
			transportFeedType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportFeedType.isEnabled()) {
			transportFeedType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportFeedType(Enumerator newValue)
	 * 
	 */
	public void setTransportFeedType(Enumerator newValue) {
		transportFeedType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportFeedType);
		if (eefElementEditorReadOnlyState && transportFeedType.isEnabled()) {
			transportFeedType.setEnabled(false);
			transportFeedType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportFeedType.isEnabled()) {
			transportFeedType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTraceEnabled()
	 * 
	 */
	public Boolean getTraceEnabled() {
		return Boolean.valueOf(traceEnabled.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTraceEnabled(Boolean newValue)
	 * 
	 */
	public void setTraceEnabled(Boolean newValue) {
		if (newValue != null) {
			traceEnabled.setSelection(newValue.booleanValue());
		} else {
			traceEnabled.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.traceEnabled);
		if (eefElementEditorReadOnlyState && traceEnabled.isEnabled()) {
			traceEnabled.setEnabled(false);
			traceEnabled.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !traceEnabled.isEnabled()) {
			traceEnabled.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getStatisticsEnabled()
	 * 
	 */
	public Boolean getStatisticsEnabled() {
		return Boolean.valueOf(statisticsEnabled.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setStatisticsEnabled(Boolean newValue)
	 * 
	 */
	public void setStatisticsEnabled(Boolean newValue) {
		if (newValue != null) {
			statisticsEnabled.setSelection(newValue.booleanValue());
		} else {
			statisticsEnabled.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled);
		if (eefElementEditorReadOnlyState && statisticsEnabled.isEnabled()) {
			statisticsEnabled.setEnabled(false);
			statisticsEnabled.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !statisticsEnabled.isEnabled()) {
			statisticsEnabled.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSRetriesBeforeSuspension()
	 * 
	 */
	public String getTransportJMSRetriesBeforeSuspension() {
		return transportJMSRetriesBeforeSuspension.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSRetriesBeforeSuspension(String newValue)
	 * 
	 */
	public void setTransportJMSRetriesBeforeSuspension(String newValue) {
		if (newValue != null) {
			transportJMSRetriesBeforeSuspension.setText(newValue);
		} else {
			transportJMSRetriesBeforeSuspension.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension);
		if (eefElementEditorReadOnlyState && transportJMSRetriesBeforeSuspension.isEnabled()) {
			transportJMSRetriesBeforeSuspension.setEnabled(false);
			transportJMSRetriesBeforeSuspension.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSRetriesBeforeSuspension.isEnabled()) {
			transportJMSRetriesBeforeSuspension.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSResetConnectionOnPollingSuspension()
	 * 
	 */
	public Boolean getTransportJMSResetConnectionOnPollingSuspension() {
		return Boolean.valueOf(transportJMSResetConnectionOnPollingSuspension.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSResetConnectionOnPollingSuspension(Boolean newValue)
	 * 
	 */
	public void setTransportJMSResetConnectionOnPollingSuspension(Boolean newValue) {
		if (newValue != null) {
			transportJMSResetConnectionOnPollingSuspension.setSelection(newValue.booleanValue());
		} else {
			transportJMSResetConnectionOnPollingSuspension.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension);
		if (eefElementEditorReadOnlyState && transportJMSResetConnectionOnPollingSuspension.isEnabled()) {
			transportJMSResetConnectionOnPollingSuspension.setEnabled(false);
			transportJMSResetConnectionOnPollingSuspension.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSResetConnectionOnPollingSuspension.isEnabled()) {
			transportJMSResetConnectionOnPollingSuspension.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSPollingSuspensionPeriod()
	 * 
	 */
	public String getTransportJMSPollingSuspensionPeriod() {
		return transportJMSPollingSuspensionPeriod.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSPollingSuspensionPeriod(String newValue)
	 * 
	 */
	public void setTransportJMSPollingSuspensionPeriod(String newValue) {
		if (newValue != null) {
			transportJMSPollingSuspensionPeriod.setText(newValue);
		} else {
			transportJMSPollingSuspensionPeriod.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod);
		if (eefElementEditorReadOnlyState && transportJMSPollingSuspensionPeriod.isEnabled()) {
			transportJMSPollingSuspensionPeriod.setEnabled(false);
			transportJMSPollingSuspensionPeriod.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSPollingSuspensionPeriod.isEnabled()) {
			transportJMSPollingSuspensionPeriod.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslKeystoreLocation()
	 * 
	 */
	public String getTransportMQTTSslKeystoreLocation() {
		return transportMQTTSslKeystoreLocation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslKeystoreLocation(String newValue)
	 * 
	 */
	public void setTransportMQTTSslKeystoreLocation(String newValue) {
		if (newValue != null) {
			transportMQTTSslKeystoreLocation.setText(newValue);
		} else {
			transportMQTTSslKeystoreLocation.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation);
		if (eefElementEditorReadOnlyState && transportMQTTSslKeystoreLocation.isEnabled()) {
			transportMQTTSslKeystoreLocation.setEnabled(false);
			transportMQTTSslKeystoreLocation.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslKeystoreLocation.isEnabled()) {
			transportMQTTSslKeystoreLocation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslKeystoreType()
	 * 
	 */
	public String getTransportMQTTSslKeystoreType() {
		return transportMQTTSslKeystoreType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslKeystoreType(String newValue)
	 * 
	 */
	public void setTransportMQTTSslKeystoreType(String newValue) {
		if (newValue != null) {
			transportMQTTSslKeystoreType.setText(newValue);
		} else {
			transportMQTTSslKeystoreType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType);
		if (eefElementEditorReadOnlyState && transportMQTTSslKeystoreType.isEnabled()) {
			transportMQTTSslKeystoreType.setEnabled(false);
			transportMQTTSslKeystoreType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslKeystoreType.isEnabled()) {
			transportMQTTSslKeystoreType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslKeystorePassword()
	 * 
	 */
	public String getTransportMQTTSslKeystorePassword() {
		return transportMQTTSslKeystorePassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslKeystorePassword(String newValue)
	 * 
	 */
	public void setTransportMQTTSslKeystorePassword(String newValue) {
		if (newValue != null) {
			transportMQTTSslKeystorePassword.setText(newValue);
		} else {
			transportMQTTSslKeystorePassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword);
		if (eefElementEditorReadOnlyState && transportMQTTSslKeystorePassword.isEnabled()) {
			transportMQTTSslKeystorePassword.setEnabled(false);
			transportMQTTSslKeystorePassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslKeystorePassword.isEnabled()) {
			transportMQTTSslKeystorePassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslTruststoreLocation()
	 * 
	 */
	public String getTransportMQTTSslTruststoreLocation() {
		return transportMQTTSslTruststoreLocation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslTruststoreLocation(String newValue)
	 * 
	 */
	public void setTransportMQTTSslTruststoreLocation(String newValue) {
		if (newValue != null) {
			transportMQTTSslTruststoreLocation.setText(newValue);
		} else {
			transportMQTTSslTruststoreLocation.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation);
		if (eefElementEditorReadOnlyState && transportMQTTSslTruststoreLocation.isEnabled()) {
			transportMQTTSslTruststoreLocation.setEnabled(false);
			transportMQTTSslTruststoreLocation.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslTruststoreLocation.isEnabled()) {
			transportMQTTSslTruststoreLocation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslTruststoreType()
	 * 
	 */
	public String getTransportMQTTSslTruststoreType() {
		return transportMQTTSslTruststoreType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslTruststoreType(String newValue)
	 * 
	 */
	public void setTransportMQTTSslTruststoreType(String newValue) {
		if (newValue != null) {
			transportMQTTSslTruststoreType.setText(newValue);
		} else {
			transportMQTTSslTruststoreType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType);
		if (eefElementEditorReadOnlyState && transportMQTTSslTruststoreType.isEnabled()) {
			transportMQTTSslTruststoreType.setEnabled(false);
			transportMQTTSslTruststoreType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslTruststoreType.isEnabled()) {
			transportMQTTSslTruststoreType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslTruststorePassword()
	 * 
	 */
	public String getTransportMQTTSslTruststorePassword() {
		return transportMQTTSslTruststorePassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslTruststorePassword(String newValue)
	 * 
	 */
	public void setTransportMQTTSslTruststorePassword(String newValue) {
		if (newValue != null) {
			transportMQTTSslTruststorePassword.setText(newValue);
		} else {
			transportMQTTSslTruststorePassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword);
		if (eefElementEditorReadOnlyState && transportMQTTSslTruststorePassword.isEnabled()) {
			transportMQTTSslTruststorePassword.setEnabled(false);
			transportMQTTSslTruststorePassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslTruststorePassword.isEnabled()) {
			transportMQTTSslTruststorePassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslVersion()
	 * 
	 */
	public String getTransportMQTTSslVersion() {
		return transportMQTTSslVersion.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslVersion(String newValue)
	 * 
	 */
	public void setTransportMQTTSslVersion(String newValue) {
		if (newValue != null) {
			transportMQTTSslVersion.setText(newValue);
		} else {
			transportMQTTSslVersion.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion);
		if (eefElementEditorReadOnlyState && transportMQTTSslVersion.isEnabled()) {
			transportMQTTSslVersion.setEnabled(false);
			transportMQTTSslVersion.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslVersion.isEnabled()) {
			transportMQTTSslVersion.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslKeyStoreFile()
	 * 
	 */
	public String getWssSslKeyStoreFile() {
		return wssSslKeyStoreFile.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslKeyStoreFile(String newValue)
	 * 
	 */
	public void setWssSslKeyStoreFile(String newValue) {
		if (newValue != null) {
			wssSslKeyStoreFile.setText(newValue);
		} else {
			wssSslKeyStoreFile.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile);
		if (eefElementEditorReadOnlyState && wssSslKeyStoreFile.isEnabled()) {
			wssSslKeyStoreFile.setEnabled(false);
			wssSslKeyStoreFile.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslKeyStoreFile.isEnabled()) {
			wssSslKeyStoreFile.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslKeyStorePass()
	 * 
	 */
	public String getWssSslKeyStorePass() {
		return wssSslKeyStorePass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslKeyStorePass(String newValue)
	 * 
	 */
	public void setWssSslKeyStorePass(String newValue) {
		if (newValue != null) {
			wssSslKeyStorePass.setText(newValue);
		} else {
			wssSslKeyStorePass.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass);
		if (eefElementEditorReadOnlyState && wssSslKeyStorePass.isEnabled()) {
			wssSslKeyStorePass.setEnabled(false);
			wssSslKeyStorePass.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslKeyStorePass.isEnabled()) {
			wssSslKeyStorePass.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslTrustStoreFile()
	 * 
	 */
	public String getWssSslTrustStoreFile() {
		return wssSslTrustStoreFile.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslTrustStoreFile(String newValue)
	 * 
	 */
	public void setWssSslTrustStoreFile(String newValue) {
		if (newValue != null) {
			wssSslTrustStoreFile.setText(newValue);
		} else {
			wssSslTrustStoreFile.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile);
		if (eefElementEditorReadOnlyState && wssSslTrustStoreFile.isEnabled()) {
			wssSslTrustStoreFile.setEnabled(false);
			wssSslTrustStoreFile.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslTrustStoreFile.isEnabled()) {
			wssSslTrustStoreFile.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslTrustStorePass()
	 * 
	 */
	public String getWssSslTrustStorePass() {
		return wssSslTrustStorePass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslTrustStorePass(String newValue)
	 * 
	 */
	public void setWssSslTrustStorePass(String newValue) {
		if (newValue != null) {
			wssSslTrustStorePass.setText(newValue);
		} else {
			wssSslTrustStorePass.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass);
		if (eefElementEditorReadOnlyState && wssSslTrustStorePass.isEnabled()) {
			wssSslTrustStorePass.setEnabled(false);
			wssSslTrustStorePass.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslTrustStorePass.isEnabled()) {
			wssSslTrustStorePass.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslCertPass()
	 * 
	 */
	public String getWssSslCertPass() {
		return wssSslCertPass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslCertPass(String newValue)
	 * 
	 */
	public void setWssSslCertPass(String newValue) {
		if (newValue != null) {
			wssSslCertPass.setText(newValue);
		} else {
			wssSslCertPass.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass);
		if (eefElementEditorReadOnlyState && wssSslCertPass.isEnabled()) {
			wssSslCertPass.setEnabled(false);
			wssSslCertPass.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslCertPass.isEnabled()) {
			wssSslCertPass.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsDefaultContentType()
	 * 
	 */
	public String getWsDefaultContentType() {
		return wsDefaultContentType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsDefaultContentType(String newValue)
	 * 
	 */
	public void setWsDefaultContentType(String newValue) {
		if (newValue != null) {
			wsDefaultContentType.setText(newValue);
		} else {
			wsDefaultContentType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType);
		if (eefElementEditorReadOnlyState && wsDefaultContentType.isEnabled()) {
			wsDefaultContentType.setEnabled(false);
			wsDefaultContentType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsDefaultContentType.isEnabled()) {
			wsDefaultContentType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsShutdownStatusCode()
	 * 
	 */
	public String getWsShutdownStatusCode() {
		return wsShutdownStatusCode.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsShutdownStatusCode(String newValue)
	 * 
	 */
	public void setWsShutdownStatusCode(String newValue) {
		if (newValue != null) {
			wsShutdownStatusCode.setText(newValue);
		} else {
			wsShutdownStatusCode.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode);
		if (eefElementEditorReadOnlyState && wsShutdownStatusCode.isEnabled()) {
			wsShutdownStatusCode.setEnabled(false);
			wsShutdownStatusCode.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsShutdownStatusCode.isEnabled()) {
			wsShutdownStatusCode.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsShutdownStatusMessage()
	 * 
	 */
	public String getWsShutdownStatusMessage() {
		return wsShutdownStatusMessage.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsShutdownStatusMessage(String newValue)
	 * 
	 */
	public void setWsShutdownStatusMessage(String newValue) {
		if (newValue != null) {
			wsShutdownStatusMessage.setText(newValue);
		} else {
			wsShutdownStatusMessage.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage);
		if (eefElementEditorReadOnlyState && wsShutdownStatusMessage.isEnabled()) {
			wsShutdownStatusMessage.setEnabled(false);
			wsShutdownStatusMessage.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsShutdownStatusMessage.isEnabled()) {
			wsShutdownStatusMessage.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsUsePortOffset()
	 * 
	 */
	public Boolean getWsUsePortOffset() {
		return Boolean.valueOf(wsUsePortOffset.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsUsePortOffset(Boolean newValue)
	 * 
	 */
	public void setWsUsePortOffset(Boolean newValue) {
		if (newValue != null) {
			wsUsePortOffset.setSelection(newValue.booleanValue());
		} else {
			wsUsePortOffset.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset);
		if (eefElementEditorReadOnlyState && wsUsePortOffset.isEnabled()) {
			wsUsePortOffset.setEnabled(false);
			wsUsePortOffset.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsUsePortOffset.isEnabled()) {
			wsUsePortOffset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslProtocols()
	 * 
	 */
	public String getWssSslProtocols() {
		return wssSslProtocols.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslProtocols(String newValue)
	 * 
	 */
	public void setWssSslProtocols(String newValue) {
		if (newValue != null) {
			wssSslProtocols.setText(newValue);
		} else {
			wssSslProtocols.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols);
		if (eefElementEditorReadOnlyState && wssSslProtocols.isEnabled()) {
			wssSslProtocols.setEnabled(false);
			wssSslProtocols.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslProtocols.isEnabled()) {
			wssSslProtocols.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslCipherSuites()
	 * 
	 */
	public String getWssSslCipherSuites() {
		return wssSslCipherSuites.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslCipherSuites(String newValue)
	 * 
	 */
	public void setWssSslCipherSuites(String newValue) {
		if (newValue != null) {
			wssSslCipherSuites.setText(newValue);
		} else {
			wssSslCipherSuites.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites);
		if (eefElementEditorReadOnlyState && wssSslCipherSuites.isEnabled()) {
			wssSslCipherSuites.setEnabled(false);
			wssSslCipherSuites.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslCipherSuites.isEnabled()) {
			wssSslCipherSuites.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConsumerQos()
	 * 
	 */
	public String getTransportRabbitMqConsumerQos() {
		return transportRabbitMqConsumerQos.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConsumerQos(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConsumerQos(String newValue) {
		if (newValue != null) {
			transportRabbitMqConsumerQos.setText(newValue);
		} else {
			transportRabbitMqConsumerQos.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos);
		if (eefElementEditorReadOnlyState && transportRabbitMqConsumerQos.isEnabled()) {
			transportRabbitMqConsumerQos.setEnabled(false);
			transportRabbitMqConsumerQos.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConsumerQos.isEnabled()) {
			transportRabbitMqConsumerQos.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConsumerQosType()
	 * 
	 */
	public Enumerator getTransportRabbitMqConsumerQosType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportRabbitMqConsumerQosType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportRabbitMqConsumerQosType(Object input, Enumerator current)
	 */
	public void initTransportRabbitMqConsumerQosType(Object input, Enumerator current) {
		transportRabbitMqConsumerQosType.setInput(input);
		transportRabbitMqConsumerQosType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType);
		if (eefElementEditorReadOnlyState && transportRabbitMqConsumerQosType.isEnabled()) {
			transportRabbitMqConsumerQosType.setEnabled(false);
			transportRabbitMqConsumerQosType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConsumerQosType.isEnabled()) {
			transportRabbitMqConsumerQosType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConsumerQosType(Enumerator newValue)
	 * 
	 */
	public void setTransportRabbitMqConsumerQosType(Enumerator newValue) {
		transportRabbitMqConsumerQosType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType);
		if (eefElementEditorReadOnlyState && transportRabbitMqConsumerQosType.isEnabled()) {
			transportRabbitMqConsumerQosType.setEnabled(false);
			transportRabbitMqConsumerQosType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConsumerQosType.isEnabled()) {
			transportRabbitMqConsumerQosType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSDBUrl()
	 * 
	 */
	public String getTransportJMSDBUrl() {
		return transportJMSDBUrl.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSDBUrl(String newValue)
	 * 
	 */
	public void setTransportJMSDBUrl(String newValue) {
		if (newValue != null) {
			transportJMSDBUrl.setText(newValue);
		} else {
			transportJMSDBUrl.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl);
		if (eefElementEditorReadOnlyState && transportJMSDBUrl.isEnabled()) {
			transportJMSDBUrl.setEnabled(false);
			transportJMSDBUrl.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSDBUrl.isEnabled()) {
			transportJMSDBUrl.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EsbMessages.InboundEndpoint_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

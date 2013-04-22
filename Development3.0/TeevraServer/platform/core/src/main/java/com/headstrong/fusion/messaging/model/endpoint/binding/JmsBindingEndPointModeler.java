/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: JmsEndPoint.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 16, 2008 
 */
package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.io.File;
import java.io.FileReader;
import java.security.NoSuchAlgorithmException;
import java.util.Hashtable;
import java.util.Map;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.activemq.pool.PooledConnectionFactory;
import org.apache.camel.Component;
import org.apache.camel.Endpoint;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.component.jms.JmsEndpoint;
import org.apache.camel.model.ProcessorDefinition;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.connection.UserCredentialsConnectionFactoryAdapter;

import com.headstrong.fusion.commons.exception.DecryptionException;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.core.BundleContextManager;
import com.headstrong.fusion.core.CamelProcessContext;
import com.ibm.msg.client.jms.JmsConnectionFactory;
import com.ibm.msg.client.jms.JmsConstants;
import com.ibm.msg.client.jms.JmsFactoryFactory;
import com.ibm.msg.client.wmq.WMQConstants;
import org.apache.commons.io.IOUtils;

/**
 * Represent a JMS connector.
 * 
 */
public class JmsBindingEndPointModeler extends AbstractBindingEndPointModeler {

	private static Logger logger = LoggerFactory
			.getLogger(JmsBindingEndPointModeler.class);
	private static final String KEY = "fusion.encryption.keyPath";

	private ConnectorConfig config;
	/**
	 * This is the direct TCP connector URL in case of Active MQ.
	 */
	private String brokerUrl;
	/**
	 * User credentials for MQ
	 */
	private String userName;
	private String password;
	/**
	 * Queue/Topic Name
	 */
	private String destination;
	/**
	 * Queue/Topic
	 */
	private String destinationType;
	private BundleContext context;

	private LdapConfiguration ldapConfiguration;
	/**
	 * Currently Active MQ, IBM MQ supported. It's a mandatory property. TODO ::
	 * Need to find an alternate way to provide connection factory details so
	 * that it's not tightly coupled with provider name.
	 */
	private String provider;

	/**
	 * 
	 * IBM specific properties.
	 */
	private int port;
	private String queueManager;
	private String channel;
	private int deliveryMode;
	
	/**
	 * Thread Count to support concurrency.
	 */	
	private int threadCount = 1;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.model.binding.AbstractBindingEndPointModeler#init(com.headstrong.fusion.config.ConnectorConfig)
	 */
	public void init(CamelProcessContext processContext, ConnectorConfig config)
			throws InitializationException {
		this.context = BundleContextManager.getInstance().getBundleContext();
		/**
		 * Initialize properties in the Super Class.
		 */
		super.init(config, JmsBindingProperty.values(), LdapProperty.values());
		/**
		 * Initialize the Bean.
		 */
		this.configure(config);
		/**
		 * Check if all mandatory fields are present.
		 */
	}

	/**
	 * Reads the properties from the properties map and set the bean properties.
	 * 
	 * @precondition config != null
	 * @param properties
	 * @param bean
	 * @throws InitializationException
	 */
	private void configure(ConnectorConfig config)
			throws InitializationException {
		Map<String, String> properties = config.getProperties();
		if (properties.containsKey(JmsBindingProperty.brokerUrl.toString())) {
			this.setBrokerUrl(properties.get(JmsBindingProperty.brokerUrl
					.toString()));
		}
		// set Ldap related properties.
		LdapConfiguration ldapConfiguration = new LdapConfiguration();
		if (properties.containsKey(LdapProperty.providerUrl.toString())) {
			ldapConfiguration.setProviderUrl(properties
					.get(LdapProperty.providerUrl.toString()));
		}
		if (properties.containsKey(LdapProperty.initialContextFactory
				.toString())) {
			ldapConfiguration.setInitialContextFactory(properties
					.get(LdapProperty.initialContextFactory.toString()));
		}
		if (properties.containsKey(LdapProperty.connectionFactoryJndiName
				.toString())) {
			ldapConfiguration.setConnectionFactoryJndiName(properties
					.get(LdapProperty.connectionFactoryJndiName.toString()));
		}

		if (properties.containsKey(LdapProperty.securityAuthentication
				.toString())) {
			ldapConfiguration.setSecurityAuthentication(properties
					.get(LdapProperty.securityAuthentication.toString()));
		}

		if (properties.containsKey(LdapProperty.secutiryCredentials.toString())) {
			try {
				String encryptedPassword  = IOUtils.toString(new FileReader(new File( properties.get(LdapProperty.secutiryCredentials.toString()))));
				if (!encryptedPassword.trim().equals("")) {
					ldapConfiguration.setSecutiryCredentials(FusionUtil.decrypt(encryptedPassword,context.getProperty(KEY)));
				} else {
					ldapConfiguration.setSecutiryCredentials(encryptedPassword);
				}
			} catch (DecryptionException e) {
				e.printStackTrace();
				logger.error("Error occured durion password decryption");
			} catch (NoSuchAlgorithmException e) {
				logger.error("Error while decrypting the message: Invalid algorithm" +e);						
			} catch (NoSuchPaddingException e) {
				logger.error("Error while decrypting the message: Invalid padding"+e);
			} catch (IllegalBlockSizeException e) {
				logger.error("Error while decrypting the message: Illegal block size "+e);
			} catch (BadPaddingException e) {
				logger.error("Error while decrypting the message: Bad padding "+e);
			} catch (Exception e) {
				logger.error("Error while decrypting the message."+e);						
			}
			
		}
		if (properties.containsKey(LdapProperty.secutiryPrincipal.toString())) {
			ldapConfiguration.setSecutiryPrincipal(properties
					.get(LdapProperty.secutiryPrincipal.toString()));
		}
		// LDAP configuration end..
		this.setLdapConfiguration(ldapConfiguration);
		if (properties.containsKey(JmsBindingProperty.destination.toString())) {
			this.setDestination(properties.get(JmsBindingProperty.destination
					.toString()));
		}
		if (properties.containsKey(JmsBindingProperty.destinationType
				.toString())) {
			this.setDestinationType(properties
					.get(JmsBindingProperty.destinationType.toString()));
		}
		if (properties.containsKey(JmsBindingProperty.provider.toString())) {
			this.setProvider(properties.get(JmsBindingProperty.provider
					.toString()));
		}

		if (properties.containsKey(JmsBindingProperty.userName.toString())) {
			this.setUserName(properties.get(JmsBindingProperty.userName
					.toString()));
		}
		// Decrypting the encrypted password.
		if (properties.containsKey(JmsBindingProperty.passwordFileLocation.toString())) {
			
			try {
				String encryptedPassword  = IOUtils.toString(new FileReader(new File( properties.get(JmsBindingProperty.passwordFileLocation.toString()))));
				if (!encryptedPassword.trim().equals("")) {
					this.setPassword(FusionUtil.decrypt(encryptedPassword,context.getProperty(KEY)));
				} else {
					this.setPassword(encryptedPassword);
				}
			} catch (DecryptionException e) {
				e.printStackTrace();
				logger.error("Error occured durion password decryption");
			} catch (NoSuchAlgorithmException e) {
				logger.error("Error while decrypting the message: Invalid algorithm" +e);						
			} catch (NoSuchPaddingException e) {
				logger.error("Error while decrypting the message: Invalid padding"+e);
			} catch (IllegalBlockSizeException e) {
				logger.error("Error while decrypting the message: Illegal block size "+e);
			} catch (BadPaddingException e) {
				logger.error("Error while decrypting the message: Bad padding "+e);
			} catch (Exception e) {
				logger.error("Error while decrypting the message."+e);						
			}
		}
		if (properties.containsKey(JmsBindingProperty.port.toString())) {
			this.setPort(Integer.parseInt(properties
					.get(JmsBindingProperty.port.toString())));
		}
		if (properties.containsKey(JmsBindingProperty.queueManager.toString())) {
			this.setQueueManager(properties.get(JmsBindingProperty.queueManager
					.toString()));
		}
		if (properties.containsKey(JmsBindingProperty.channel.toString())) {
			this.setChannel(properties.get(JmsBindingProperty.channel
					.toString()));
		}
		if (properties.containsKey(JmsBindingProperty.deliveryMode.toString())) {
			this.setDeliveryMode(Integer.parseInt(properties
					.get(JmsBindingProperty.deliveryMode.toString())));
		}
		if (properties.containsKey(JmsBindingProperty.threadCount.toString())) {
			this.setThreadCount(Integer.parseInt(properties
					.get(JmsBindingProperty.threadCount.toString())));
		}		
	}

	/**
	 * Creates a {@link JmsComponent} using the parameters set.
	 * 
	 * @param routeBuilder
	 * @return {@link JmsComponent}
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	private Component getJmsComponent(RouteBuilder routeBuilder)
			throws ProcessModellingException {
		JmsComponent jmsComponent = null;
		if (this.getProvider().equals(Provider.activemq.toString())) {
			jmsComponent = ActiveMQComponent.activeMQComponent();
			jmsComponent.setConnectionFactory(new PooledConnectionFactory(this
					.getBrokerUrl()));
			jmsComponent.setCamelContext(routeBuilder.getContext());
			jmsComponent.setAcknowledgementMode(Session.AUTO_ACKNOWLEDGE);
		} else if (this.getProvider().equals(Provider.ibmmq.toString())) {
			JmsConnectionFactory factory = null;
			try {
				JmsFactoryFactory jmsFactoryFactory;
				jmsFactoryFactory = JmsFactoryFactory
						.getInstance(JmsConstants.WMQ_PROVIDER);
				factory = jmsFactoryFactory.createConnectionFactory();
				factory.setIntProperty(WMQConstants.WMQ_CONNECTION_MODE,
						WMQConstants.WMQ_CM_CLIENT);
				factory.setStringProperty(WMQConstants.WMQ_QUEUE_MANAGER, this
						.getQueueManager());
				factory.setStringProperty(WMQConstants.WMQ_HOST_NAME, this
						.getBrokerUrl());
				factory.setIntProperty(WMQConstants.WMQ_PORT, this.getPort());
				if(this.getChannel()!=null && !this.getChannel().isEmpty())
				factory.setStringProperty(WMQConstants.WMQ_CHANNEL, this
						.getChannel());
				factory.setIntProperty(WMQConstants.DELIVERY_MODE, this
						.getDeliveryMode());
			} catch (JMSException e) {
				logger.error("Error connecting to JMS provider.", e);
				throw new ProcessModellingException(
						"Error connecting to JMS provider.", e);
			}
			UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
			adapter.setTargetConnectionFactory(factory);
			if (this.getUserName() != null) {
				adapter.setUsername(this.getUserName());
			}
			if (this.getPassword() != null) {
				adapter.setPassword(this.getPassword());
			}
			jmsComponent = JmsComponent.jmsComponent();
			jmsComponent.setConnectionFactory(adapter);
			jmsComponent.setCamelContext(routeBuilder.getContext());
			jmsComponent.setAcknowledgementMode(Session.AUTO_ACKNOWLEDGE);
		} else {
			Hashtable<String, String> prop = new Hashtable<String, String>();
			// Mandatory property.
			prop.put(Context.PROVIDER_URL, this.getLdapConfiguration()
					.getProviderUrl());
			prop.put(Context.INITIAL_CONTEXT_FACTORY, this
					.getLdapConfiguration().getInitialContextFactory());

			// Only these optional properties supported now.
			if (this.getLdapConfiguration().getSecurityAuthentication() != null) {
				prop.put(Context.SECURITY_AUTHENTICATION, this
						.getLdapConfiguration().getSecurityAuthentication());
			}
			if (this.getLdapConfiguration().getSecutiryPrincipal() != null) {
				prop.put(Context.SECURITY_PRINCIPAL, this
						.getLdapConfiguration().getSecutiryPrincipal());
			}
			if (this.getLdapConfiguration().getSecutiryCredentials() != null) {
				prop.put(Context.SECURITY_CREDENTIALS, this
						.getLdapConfiguration().getSecutiryCredentials());
			}
			Context context;
			ConnectionFactory connectionFactory;
			try {
				// HACK required to avoid ClassNotFoundException while
				// retrieving the
				// InitialContext.
				ClassLoader contextClassLoader = Thread.currentThread()
						.getContextClassLoader();
				try {
					Thread.currentThread().setContextClassLoader(
							getClass().getClassLoader());
					context = new InitialContext(prop);
					connectionFactory = (ConnectionFactory) context.lookup(this
							.getLdapConfiguration()
							.getConnectionFactoryJndiName());
				} finally {
					Thread.currentThread().setContextClassLoader(
							contextClassLoader);
				}
				// HACK -- Finished
			} catch (NamingException e) {
				logger.error("Error connecting to JMS provider.", e);
				throw new ProcessModellingException(
						"Error connecting to JMS provider.", e);
			}
			UserCredentialsConnectionFactoryAdapter adapter = new UserCredentialsConnectionFactoryAdapter();
			adapter.setTargetConnectionFactory(connectionFactory);
			if (this.getUserName() != null) {
				adapter.setUsername(this.getUserName());
			}
			if (this.getPassword() != null) {
				adapter.setPassword(this.getPassword());
			}
			jmsComponent = JmsComponent.jmsComponent();
			jmsComponent.setConnectionFactory(adapter);
			jmsComponent.setCamelContext(routeBuilder.getContext());
			jmsComponent.setAcknowledgementMode(Session.AUTO_ACKNOWLEDGE);
		}
		
		if (jmsComponent != null) {
			jmsComponent.setConcurrentConsumers(getThreadCount());
		}
		return jmsComponent;
	}

	/**
	 * Creates a {@link JmsComponent} using the parameters set.
	 * 
	 * @param routeBuilder
	 * @return {@link JmsComponent}
	 * @throws ProcessModellingException
	 */
//	@SuppressWarnings("unchecked")
//	private Component getIBMMqComponent(RouteBuilder routeBuilder)
//			throws ProcessModellingException {
//		IBMMQComponent ibmComponent = null;
//		try {
//			JmsFactoryFactory jmsFactoryFactory = JmsFactoryFactory
//					.getInstance(JmsConstants.WMQ_PROVIDER);
//			JmsConnectionFactory factory = jmsFactoryFactory
//					.createConnectionFactory();
//			factory.setIntProperty(WMQConstants.WMQ_CONNECTION_MODE,
//					WMQConstants.WMQ_CM_CLIENT);
//			factory.setStringProperty(WMQConstants.WMQ_QUEUE_MANAGER, this
//					.getQueueManager());
//			factory.setStringProperty(WMQConstants.WMQ_HOST_NAME, this
//					.getBrokerUrl());
//			factory.setIntProperty(WMQConstants.WMQ_PORT, this.getPort());
//			factory.setStringProperty(WMQConstants.WMQ_CHANNEL, this
//					.getChannel());
//			factory.setIntProperty(WMQConstants.DELIVERY_MODE, this
//					.getDeliveryMode());
//			ibmComponent = new IBMMQComponent();
//			ibmComponent.setConnectionFactory(factory);
//			ibmComponent.setCamelContext(routeBuilder.getContext());
//		} catch (JMSException ex) {
//			logger.error("Error creating IBM MQ endpoint.", ex);
//			throw new ProcessModellingException(ex);
//		}
//		return ibmComponent;
//	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.BindingEndPoint#modelFrom(org.apache.camel.builder.RouteBuilder)
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition modelFrom(RouteBuilder routeBuilder)
			throws ProcessModellingException {
		Component jmsComponent = this.getJmsComponent(routeBuilder);
		String uri = "jms" + this.getConfig().getId() + ":"
				+ this.getDestinationType() + ":" + this.getDestination();
		Endpoint jmsEndPoint = null;

		try {
			jmsComponent = this.getJmsComponent(routeBuilder);
			jmsEndPoint = (JmsEndpoint) jmsComponent.createEndpoint(uri);

		} catch (Exception e) {
			logger.error("Error creating JMS EndPointModeler.", e);
			throw new ProcessModellingException(
					"Error creating JMS EndPointModeler.", e);
		}
//		try {
//			if (this.getProvider().equals(Provider.ibmmq.toString())) {
//				jmsComponent = this.getIBMMqComponent(routeBuilder);
//				IBMMQEndpoint ibmMqEndpoint = (IBMMQEndpoint) jmsComponent
//						.createEndpoint(uri);
//				ibmMqEndpoint.setUserName(this.getUserName());
//				ibmMqEndpoint.setPassword(this.getPassword());
//				jmsEndPoint = ibmMqEndpoint;
//			} else {
//				jmsComponent = this.getJmsComponent(routeBuilder);
//				jmsEndPoint = (JmsEndpoint) jmsComponent.createEndpoint(uri);
//			}
//
//		} catch (Exception e) {
//			logger.error("Error creating JMS EndPointModeler.", e);
//			throw new ProcessModellingException(
//					"Error creating JMS EndPointModeler.", e);
//		}
		return routeBuilder.from(jmsEndPoint);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.BindingEndPoint#modelTo(org.apache.camel.builder.RouteBuilder,
	 *      org.apache.camel.model.ProcessorType)
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition modelTo(RouteBuilder routeBuilder,
			ProcessorDefinition processorType) throws ProcessModellingException {
		Component jmsComponent = null;
		String uri = "jms" + this.getConfig().getId() + ":"
				+ this.getDestinationType() + ":" + this.getDestination();
		Endpoint jmsEndPoint = null;
//		try {
//			if (this.getProvider().equals(Provider.ibmmq.toString())) {
//				jmsComponent = this.getIBMMqComponent(routeBuilder);
//				IBMMQEndpoint ibmMqEndpoint = (IBMMQEndpoint) jmsComponent
//						.createEndpoint(uri);
//				ibmMqEndpoint.setUserName(this.getUserName());
//				ibmMqEndpoint.setPassword(this.getPassword());
//				jmsEndPoint = ibmMqEndpoint;
//			} else {
//				jmsComponent = this.getJmsComponent(routeBuilder);
//				jmsEndPoint = (JmsEndpoint) jmsComponent.createEndpoint(uri);
//			}
//		} catch (Exception e) {
//			logger.error("Error creating JMS EndPointModeler.", e);
//			throw new ProcessModellingException(
//					"Error creating JMS EndPointModeler.", e);
//		}
		
		try {

			jmsComponent = this.getJmsComponent(routeBuilder);
			jmsEndPoint = (JmsEndpoint) jmsComponent.createEndpoint(uri);
		} catch (Exception e) {
			logger.error("Error creating JMS EndPointModeler.", e);
			throw new ProcessModellingException(
					"Error creating JMS EndPointModeler.", e);
		}
		return processorType.to(jmsEndPoint);
	}

	/**
	 * @return the brokerUrl
	 */
	public String getBrokerUrl() {
		return brokerUrl;
	}

	/**
	 * @param brokerUrl
	 *            the brokerUrl to set
	 */
	public void setBrokerUrl(String brokerUrl) {
		this.brokerUrl = brokerUrl;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the destinationType
	 */
	public String getDestinationType() {
		return destinationType;
	}

	/**
	 * @param destinationType
	 *            the destinationType to set
	 */
	public void setDestinationType(String destinationType) {
		this.destinationType = destinationType;
	}

	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * @param provider
	 *            the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}

	/**
	 * @return the config
	 */
	public ConnectorConfig getConfig() {
		return config;
	}

	/**
	 * @param config
	 *            the config to set
	 */
	public void setConfig(ConnectorConfig config) {
		this.config = config;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	 * LDAP properties class.
	 */

	private class LdapConfiguration {
		private String providerUrl;
		private String initialContextFactory;
		private String securityAuthentication;
		private String secutiryPrincipal;
		private String secutiryCredentials;
		private String connectionFactoryJndiName;

		/**
		 * @return the providerUrl
		 */
		public String getProviderUrl() {
			return providerUrl;
		}

		/**
		 * @param providerUrl
		 *            the providerUrl to set
		 */
		public void setProviderUrl(String providerUrl) {
			this.providerUrl = providerUrl;
		}

		/**
		 * @return the initialContextFactory
		 */
		public String getInitialContextFactory() {
			return initialContextFactory;
		}

		/**
		 * @param initialContextFactory
		 *            the initialContextFactory to set
		 */
		public void setInitialContextFactory(String initialContextFactory) {
			this.initialContextFactory = initialContextFactory;
		}

		/**
		 * @return the securityAuthentication
		 */
		public String getSecurityAuthentication() {
			return securityAuthentication;
		}

		/**
		 * @param securityAuthentication
		 *            the securityAuthentication to set
		 */
		public void setSecurityAuthentication(String securityAuthentication) {
			this.securityAuthentication = securityAuthentication;
		}

		/**
		 * @return the secutiryPrincipal
		 */
		public String getSecutiryPrincipal() {
			return secutiryPrincipal;
		}

		/**
		 * @param secutiryPrincipal
		 *            the secutiryPrincipal to set
		 */
		public void setSecutiryPrincipal(String secutiryPrincipal) {
			this.secutiryPrincipal = secutiryPrincipal;
		}

		/**
		 * @return the secutiryCredentials
		 */
		public String getSecutiryCredentials() {
			return secutiryCredentials;
		}

		/**
		 * @param secutiryCredentials
		 *            the secutiryCredentials to set
		 */
		public void setSecutiryCredentials(String secutiryCredentials) {
			this.secutiryCredentials = secutiryCredentials;
		}

		/**
		 * @return the connectionFactoryJndiName
		 */
		public String getConnectionFactoryJndiName() {
			return connectionFactoryJndiName;
		}

		/**
		 * @param connectionFactoryJndiName
		 *            the connectionFactoryJndiName to set
		 */
		public void setConnectionFactoryJndiName(
				String connectionFactoryJndiName) {
			this.connectionFactoryJndiName = connectionFactoryJndiName;
		}
	}

	public static enum JmsBindingProperty implements BindingProperty {
		// List of properties expected by JMS EndPointModeler.
		brokerUrl, port, queueManager, channel, deliveryMode, userName, destination {
			public boolean isMandatory() {
				return true;
			}
		},
		provider {
			public boolean isMandatory() {
				return true;
			}
		},
		destinationType, threadCount ,passwordFileLocation;
		public boolean isMandatory() {
			return false;
		}
	}

	public static enum LdapProperty implements BindingProperty {
		providerUrl, initialContextFactory, securityAuthentication, secutiryPrincipal, secutiryCredentials, connectionFactoryJndiName;
		@Override
		public String toString() {
			return "ldap." + name();
		}

		public boolean isMandatory() {
			return false;
		}
	}

	public static enum Provider {
		activemq {
			public String toString() {
				return "Active MQ";
			}
		},
		openjms {
			public String toString() {
				return "Open JMS";
			}
		},
		ibmmq {
			public String toString() {
				return "IBM MQ";
			}
		}
	}

	/**
	 * @return the ldapConfiguration
	 */
	public LdapConfiguration getLdapConfiguration() {
		return ldapConfiguration;
	}

	/**
	 * @param ldapConfiguration
	 *            the ldapConfiguration to set
	 */
	public void setLdapConfiguration(LdapConfiguration ldapConfiguration) {
		this.ldapConfiguration = ldapConfiguration;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port
	 *            the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * @return the queueManager
	 */
	public String getQueueManager() {
		return queueManager;
	}

	/**
	 * @param queueManager
	 *            the queueManager to set
	 */
	public void setQueueManager(String queueManager) {
		this.queueManager = queueManager;
	}

	/**
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * @param channel
	 *            the channel to set
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * @return the deliveryMode
	 */
	public int getDeliveryMode() {
		return deliveryMode;
	}

	/**
	 * @param deliveryMode
	 *            the deliveryMode to set
	 */
	public void setDeliveryMode(int deliveryMode) {
		this.deliveryMode = deliveryMode;
	}
	
	/**
	 * Returns the thread count used to set concurrent consumers.
	 * @return
	 */
	public int getThreadCount() {
		return threadCount;
	}

	/**
	 * Sets the thread count used to set concurrent consumers.
	 * @param threadCount
	 */
	public void setThreadCount(int threadCount) {
		if (threadCount > 1)
			this.threadCount = threadCount;
	}
}

/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: IBMMQEndpoint.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: July 24, 2009 
 */
package com.headstrong.fusion.connector.ibm.mq;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.FusionMessageExchange;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionPollingConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.connector.ibm.mq.config.ConfigNotFoundException;
import com.headstrong.fusion.connector.ibm.mq.config.ConfigurationUtil;
import com.headstrong.fusion.connector.ibm.mq.config.ConfigurationUtil.Config;
import com.headstrong.fusion.connector.ibm.mq.exception.ConnectException;
import com.ibm.mq.jms.MQQueueConnectionFactory;
import com.ibm.msg.client.wmq.WMQConstants;

/**
 * IBM MQ endpoint.
 */
public class IBMMQEndpoint implements FusionEndpoint<MessageExchange> {

	protected static final String IBM_MQ = "ibmmq";

	/**
	 * BindingConfig
	 */
	private BindingConfig bindingConfig;
	/**
	 * Connection Factory.
	 */
	private ConnectionFactory connectionFactory;

	/**
	 * SSL Socket.
	 */
	private SSLSocket sslSocket;
	
	private BundleContext context;

	/**
	 * creates a new IBM MQ Endpoint.
	 * @param bindingConfig 
	 */
	public IBMMQEndpoint(final BindingConfig bindingConfig, final BundleContext context) {
		this.bindingConfig = bindingConfig;
		this.sslSocket = new SSLSocket(bindingConfig);
		this.context = context;
	}

	/**
	 * creates a connection factory.
	 * 
	 * @throws JMSException
	 * @throws ConfigNotFoundException
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws CertificateException
	 * @throws KeyStoreException
	 * @throws NoSuchAlgorithmException
	 * @throws UnrecoverableKeyException
	 * @throws KeyManagementException
	 */
	private void createConnectionFactory() throws JMSException,
			ConfigNotFoundException, KeyManagementException,
			UnrecoverableKeyException, NoSuchAlgorithmException,
			KeyStoreException, CertificateException, FileNotFoundException,
			IOException {
		// Create MQ connection factory with given user name and password if present otherwise default
		MQQueueConnectionFactory factory = new MQQueueConnectionFactory();
		// Customize the factory
		factory.setTransportType(WMQConstants.WMQ_CM_CLIENT);
		factory.setQueueManager(ConfigurationUtil.getConfig(bindingConfig,
				Config.queueManager));
		factory.setHostName(ConfigurationUtil.getConfig(bindingConfig,
				Config.brokerUrl));
		String config = ConfigurationUtil.getConfig(bindingConfig, Config.channel, true);
		if(null != config) {
			factory.setChannel(config);
		}
		factory.setPort(Integer.parseInt(ConfigurationUtil.getConfig(
				bindingConfig, Config.port)));
		factory.setIntProperty(WMQConstants.DELIVERY_MODE, Integer
				.parseInt(ConfigurationUtil.getConfig(bindingConfig,
						Config.deliveryMode, true)));
		
		if (sslSocket.isEnabled()) {
			factory.setSSLFipsRequired(Boolean.getBoolean(ConfigurationUtil
					.getConfig(bindingConfig, Config.sslFipsRequired, true)));
			factory.setSSLSocketFactory(sslSocket.getSSLSocketFactory());
			factory.setSSLCipherSuite(ConfigurationUtil.getConfig(
					bindingConfig, Config.sslCipherSuite));
		}
		this.connectionFactory = factory;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	/**
	 * returns the connection factory. Creates one if not created already.
	 * 
	 * @return the connectionFactory
	 * @throws ConnectException
	 */
	public ConnectionFactory getConnectionFactory() throws ConnectException {
		synchronized (this) {
			if (connectionFactory == null) {
				try {
					this.createConnectionFactory();
				} catch (Exception e) {
					throw new ConnectException(e);
				}
			}
		}
		return connectionFactory;
	}

	@Override
	public FusionConsumer<MessageExchange> createConsumer(
			FusionProcessor fusionProcessor) throws Exception {
		return new IBMMQConsumer(this, fusionProcessor);
	}

	@Override
	public MessageExchange createExchange() {
		return new FusionMessageExchange();
	}

	@Override
	public MessageExchange createMessageExchange(MessageExchange exchange) {
		return exchange.copy();
	}

	@Override
	public FusionPollingConsumer<MessageExchange> createPollingConsumer()
			throws Exception {
		throw new FusionException("Polling consumer not supported.");
	}

	@Override
	public FusionProducer<MessageExchange> createProducer() throws Exception {
		return new IBMMQProducer(this);
	}

	@Override
	public String getEndpointUri() {
		return IBM_MQ + this.hashCode();
	}

	public BindingConfig getBindingConfig() {
		return bindingConfig;
	}

	public BundleContext getContext() {
		return context;
	}
}
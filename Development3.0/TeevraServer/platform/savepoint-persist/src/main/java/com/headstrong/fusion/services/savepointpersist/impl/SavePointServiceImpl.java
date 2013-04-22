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
 * $Id: SavePointServiceImpl.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Sep 23, 2008 
 */

package com.headstrong.fusion.services.savepointpersist.impl;

import java.util.Map;
import java.util.concurrent.BlockingQueue;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.seda.SedaComponent;
import org.apache.camel.component.seda.SedaEndpoint;
import org.apache.camel.impl.DefaultCamelContext;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.core.recovery.RecoveryManager;
import com.headstrong.fusion.eventlogger.EventLogger;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;
import com.headstrong.fusion.eventlogger.beans.MessageEventLogBean;
import com.headstrong.fusion.eventlogger.beans.MessageRecoveryLogBean;
import com.headstrong.fusion.eventlogger.factory.EventLoggerFactory;

/**
 * <code>SavePointServiceImpl</code> provides implementation for persisting
 * the messages processed by fusion framework. It exposes operations through
 * JMX.
 */
public class SavePointServiceImpl implements SavePointServiceImplMBean {

	private static Logger logger = LoggerFactory
			.getLogger(SavePointServiceImpl.class);

	private BundleContext bundleContext;
	private DefaultCamelContext camelContext;

	/**
	 * @param bundleContext
	 */
	public SavePointServiceImpl(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	/**
	 * Creates Camel route for the savepoint.
	 * 
	 * @precondition
	 * @postcondition
	 * @throws FusionException
	 */
	public void createRouteForSavepoint() throws FusionException {
		if (logger.isDebugEnabled()) {
			logger.debug("Creating a new camel context for savepoint ");
		}
		camelContext = new DefaultCamelContext();
		camelContext.setName("MessageInfoPersistence");
		final Processor savepointProcessor = new SavePointServiceProcessor();

		RouteBuilder rb = new RouteBuilder() {

			@SuppressWarnings("unchecked")
			@Override
			public void configure() throws Exception {
				RecoveryManager recoveryManager = (RecoveryManager) ServiceAliasManager
						.getInstance().getServiceByAlias(
								RecoveryManager.class.getSimpleName(), 100);
				
				/*SedaEndpoint sedaEndpoint = new SedaEndpoint(
						"MessageInfoPersistence",
						(BlockingQueue<Exchange>) recoveryManager
								.getRecoveryQueue());*/
				SedaComponent sedaComponent = new SedaComponent();
				sedaComponent.setCamelContext(camelContext);
				SedaEndpoint sedaEndpoint = new SedaEndpoint("MessageInfoPersistence", sedaComponent,
						(BlockingQueue<Exchange>) recoveryManager
								.getRecoveryQueue());
				from(sedaEndpoint).process(savepointProcessor);
			}
		};
		rb.setContext(camelContext);
		try {
			camelContext.addRoutes(rb);
		} catch (Exception e) {
			logger.error("Error while adding the routes ", e);
			throw new FusionException(
					"Error while creating the route for savepoint", e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.savepointpersist.impl.SavePointServiceImplMBean#start()
	 */
	public void start() throws Exception {
		logger.info("Starting camel context for savepoint ");
		camelContext.start();
		logger.info("Started camel context for savepoint ");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.savepointpersist.impl.SavePointServiceImplMBean#stop()
	 */
	public void stop() throws Exception {
		logger.info("Stopping camel context for savepoint ");
		camelContext.stop();
		logger.info("Stopped camel context for savepoint ");

	}

	/**
	 * <code>SavePointServiceProcessor</code> implements Camel processor. It
	 * processes the headers in the message and persist the information in the
	 * database.
	 */
	private class SavePointServiceProcessor implements Processor {

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
		 */
		/**
		 * This processor currently logs only the error messages. No other message is being logged using 
		 * savepoint processor. This also has to be removed.
		 */
		@Deprecated
		public void process(Exchange exchange) throws FusionException {

			logger.info("Processing message at savepoint");
			if (logger.isDebugEnabled()) {
				logger.debug("Message content is :" + exchange.getIn());
			}

			EventLogger eventMsgLogger = EventLoggerFactory
					.getEventLogger(EventLoggerFactory.EVENT_LOGGERS.MESSAGE_LOGGER);

			eventMsgLogger
					.log(createEventLogBean(exchange.getIn().getHeaders()));
			RecoveryManager recoveryManager = (RecoveryManager) ServiceAliasManager
					.getInstance().getServiceByAlias(
							RecoveryManager.class.getSimpleName(), 100);
			int queueSize = ((BlockingQueue<Exchange>) recoveryManager
					.getRecoveryQueue()).size();
			logger.info("Savepoint queue size :" + queueSize);

			// EventLogger eventMsgRecovery = EventLoggerFactory
			// .getEventLogger(EventLoggerFactory.EVENT_LOGGERS.MESSAGE_RECOVER_LOG);
			//
			// try {
			// eventMsgRecovery.log(createRecoverBean(exchange.getIn()
			// .getHeaders(), exchange.getIn().getBody()));
			// } catch (Exception e) {
			// String errorMsg = "Error while logging recovery information";
			// logger.error(errorMsg, e);
			// throw new FusionException(errorMsg, e);
			// }
		}

		/**
		 * Creates {@link MessageEventLogBean} for the message.
		 * 
		 * @precondition
		 * @postcondition
		 * @param headers
		 * @return
		 */
		private EventLogBean createEventLogBean(Map<String, Object> headers) {

			MessageEventLogBean logBean = new MessageEventLogBean();
			logBean.setSessionId((String) headers
					.get(FusionConstants.SESSION_ID));
			logBean.setMessageId((String) headers
					.get(FusionConstants.MESSAGE_ID));
			logBean.setSavepointName((String) headers
					.get(FusionConstants.SAVEPOINT_NAME));
			logBean.setSavepointTime((String) headers
					.get(FusionConstants.SAVEPOINT_TIME));

			/*Object oSequenceId = headers.get(Splitter.SPLIT_COUNTER);
			Object oTotalSequence = headers.get(Splitter.SPLIT_SIZE);*/
			
			Object oSequenceId = headers.get(Exchange.SPLIT_INDEX);
			Object oTotalSequence = headers.get(Exchange.SPLIT_SIZE);

			Integer iSequenceId = 0;
			Integer iTotalSequence = 0;

			if ((oSequenceId != null) && (oSequenceId instanceof Integer)) {
				iSequenceId = ((Integer) oSequenceId) + 1;
			}

			if ((oTotalSequence != null) && (oTotalSequence instanceof Integer)) {
				iTotalSequence = (Integer) iTotalSequence;
			}

			logBean.setSequenceId(iSequenceId.toString());
			logBean.setTotalSequences(iTotalSequence.toString());
			logBean.setLogMessage(headers
					.containsKey(FusionConstants.LOG_MESSAGE) ? headers.get(
					FusionConstants.LOG_MESSAGE).toString() : new String());

			logBean.setMessageData(headers.get(FusionConstants.LOG_DATA)
					.toString());

			return logBean;

		}

		/**
		 * Creates {@link MessageRecoveryLogBean} for the message.
		 * 
		 * @precondition
		 * @postcondition
		 * @param headers
		 * @param data
		 * @return
		 * @throws Exception
		 */
		private EventLogBean createRecoverBean(Map<String, Object> headers,
				Object data) throws Exception {
			MessageRecoveryLogBean logBean = new MessageRecoveryLogBean();
			logBean.setSessionId((String) headers
					.get(FusionConstants.SESSION_ID));
			logBean.setMessageId((String) headers
					.get(FusionConstants.MESSAGE_ID));
			logBean.setSavepointName((String) headers
					.get(FusionConstants.SAVEPOINT_NAME));
			logBean.setMessageData((byte[]) data);
			return logBean;
		}
	}
}

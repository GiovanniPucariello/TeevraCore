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
 * $Id: AbstractFlow.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 23, 2009 
 */

package com.headstrong.fusion.messaging.model.flow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.seda.SedaComponent;
import org.apache.camel.component.seda.SedaEndpoint;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.spi.InterceptStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.ErrorFormatter;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.HandledException;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.config.ErrorReporterConfig;
import com.headstrong.fusion.config.ErrorReportingConfig;
import com.headstrong.fusion.config.SavepointConfig;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.config.SourceSequence;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.core.FusionActivator;
import com.headstrong.fusion.core.recovery.RecoveryProcessor;
import com.headstrong.fusion.messaging.error.formatter.ErrorFormatterFactory;
import com.headstrong.fusion.messaging.error.formatter.XmlErrorFormatter;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModelerFactory;
import com.headstrong.fusion.messaging.model.endpoint.error.ErrorRouteModeler;
import com.headstrong.fusion.messaging.model.endpoint.routing.SavePointEndPointModeler;
import com.headstrong.fusion.messaging.service.ErrorEventLogger;
import com.headstrong.fusion.messaging.service.ErrorExchangeConverter;
import com.headstrong.fusion.messaging.service.ErrorExchangeProcessor;
import com.headstrong.fusion.messaging.service.HeaderMessageProcessor;
import com.headstrong.fusion.messaging.service.FirstMessageDelayProcessor;
import com.headstrong.fusion.messaging.service.MessageConverter;
import com.headstrong.fusion.messaging.service.OnCompMessageDeliveryProcessor;
import com.headstrong.fusion.messaging.service.OnCompMessageReceiveProcessor;
import com.headstrong.fusion.messaging.service.OnMessageDeliveryProcessor;
import com.headstrong.fusion.messaging.service.OnMessageReceiveProcessor;

/**
 * 
 */
public abstract class AbstractFlow implements CamelFlow {
	/**
	 * The class contains a map of endpoint id v/s corresponding modelers.
	 * 
	 */
	private Map<String, EndPointModeler> endPointModelers = new HashMap<String, EndPointModeler>();
	/**
	 * Apache Camel Route Builder. Based on the process configuration model the
	 * Route Builder will be configured using the EndpointModelers.
	 */
	private RouteBuilder routeBuilder;

	private Logger logger = LoggerFactory.getLogger(AbstractFlow.class);
	/**
	 * Process Metadata.
	 */
	private CamelProcessContext processContext;

	public AbstractFlow(RouteBuilder routeBuilder,
			Map<String, EndPointModeler> endPointModelers,
			CamelProcessContext processContext) {
		this.endPointModelers = endPointModelers;
		this.routeBuilder = routeBuilder;
		this.processContext = processContext;
	}

	/**
	 * Returns the input <b>SEDA</b> queue for the {@link EndPointModeler}.
	 * 
	 * @param processId
	 *            unique process identifier.
	 * @param endpointType
	 *            endpoint type identifier. (e.g. JMS for JMS endpoint)
	 * @param endpointId
	 *            unique endpoint identifier.
	 * @return {@link SedaEndpoint} SEDA endpoint.
	 */
	public Endpoint getSourceSedaEndpoint(String processId, String endpointId) {
		String endpointUri = processId + "." + endpointId;
		Endpoint sedaEndpoint = this.getProcessContext().getProcessMetaData()
				.getSourceSedaEndpoint(processId, endpointId);
		if (sedaEndpoint == null) {
			SedaComponent sedaComponent = new SedaComponent();
			sedaComponent.setCamelContext(this.getProcessContext()
					.getCamelContext());
			sedaEndpoint = new SedaEndpoint(endpointUri, sedaComponent,
					new LinkedBlockingQueue<Exchange>());
			sedaEndpoint.setCamelContext(this.getRouteBuilder().getContext());
			this.getProcessContext().getProcessMetaData()
					.addSourceSedaEndpoint(processId, endpointId, sedaEndpoint);
		}
		return sedaEndpoint;
	}

	/**
	 * Creates error route for Error Connectors.
	 * 
	 * @param processorType
	 * @param connectorConfig
	 */
	@SuppressWarnings("unchecked")
	protected void addConnectorErrorRoute(ProcessorDefinition processorType,
			ConnectorConfig connectorConfig) {
		Endpoint inputRecoverySedaQueue = this.getSourceSedaEndpoint(this
				.getProcessContext().getProcessConfigurationModel()
				.getProcess().getId(), FusionConstants.ERROR_QUEUE);

		// TODO :: same message should be sent to the recovery queue too.
		// Assumption :: for endpoints multiple configurations can't be
		// provided.
		if (connectorConfig.getErrorConfigList() != null
				&& !connectorConfig.getErrorConfigList().isEmpty()) {
			List<ErrorReportingConfig> errorReportingConfigs = connectorConfig
					.getErrorConfigList().get(0).getErrorReporters();
			if (errorReportingConfigs != null) {
				for (ErrorReportingConfig errorReportingConfig : errorReportingConfigs) {
					// This is pending.
					String formatterType = errorReportingConfig.getFormatter();
					ErrorFormatter errorFormatter = ErrorFormatterFactory
							.getErrorFormatter(formatterType);
					if (errorFormatter == null) {
						errorFormatter = new XmlErrorFormatter();
					}
					// create error exchange converter.
					ErrorExchangeConverter exchangeConverter = new ErrorExchangeConverter(
							errorFormatter);
					// send the context to corresponding
					// Endpoint.
					String processId = this.getProcessContext()
							.getProcessConfigurationModel().getProcess()
							.getId();
					String reporterId = errorReportingConfig
							.getErrorReporterId();
					Endpoint inputSedaQueue = this.getSourceSedaEndpoint(
							processId, reporterId);
					// TODO :: See if Null check should be there or not ?
					// separate messages required as formatting might be
					// different
					// for different service.
					/*
					 * @bug 12-04-2012 temporary fix for DB endpoint.Messages
					 * were not processed when db endpoint process was used with
					 * error reporting. This is because of camel bug,
					 * Onexception when used in route doesnt work with camel
					 * components like multicasting cbr etc. camel will fix this
					 * in camel 3.0 version.
					 */
					if (!connectorConfig.getType().equals("DATABASE")) {
						processorType.onException(Throwable.class)
								.handled(true).maximumRedeliveries(0).process(
										exchangeConverter).to(inputSedaQueue,
										inputRecoverySedaQueue).end();
					}
				}
			}
		}
	}

	/**
	 * Adds exception handler to the flow. In case recovery is on , It'll also
	 * mark message for deletion.
	 * 
	 * @param processId
	 * @param recoveryManager
	 */
	public void addExceptionHandler(String processId) {

		this.getRouteBuilder().onException(HandledException.class).handled(true).stop();
		//this.getRouteBuilder().intercept().stop();

		ProcessorDefinition processorType = this.getRouteBuilder().onException(
				Throwable.class).handled(true).process(
				new ErrorExchangeProcessor());
		/*
		 * if (recoveryOn) { RecoveryProcessor recoveryProcessor = new
		 * RecoveryProcessor(this .getProcessContext(),
		 * FusionConstants.DEFAULT_END_SP_NAME, true); processorType =
		 * processorType.process(recoveryProcessor); }
		 */processorType.to(this.getSourceSedaEndpoint(processId,
				FusionConstants.ERROR_QUEUE));

	}

	/**
	 * Adds recovery handler to the flow. It will send savepoint messages to
	 * JMS.
	 * 
	 * @param processId
	 * @param recoveryManager
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition addSourceRecoveryFlow(
			ProcessorDefinition processorType, SourceSequence sequence)
			throws InitializationException, ProcessModellingException {
		SavePointEndPointModeler endpoint = (SavePointEndPointModeler) EndPointModelerFactory
				.getEndPoint(EndPointModelerFactory.ENDPOINT.SAVEPOINT
						.toString());
		SavepointConfig config = new SavepointConfig();
		config.setId(FusionConstants.DEFAULT_RECEIVED_SP_NAME);
		endpoint.init(this.getProcessContext(), config);
		return endpoint.model(this, processorType, sequence, this
				.getProcessContext().getProcessId());
	}

	/**
	 * Adds recovery handler to the flow. It will send savepoint messages to
	 * JMS.
	 * 
	 * @param processId
	 * @param recoveryManager
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition addMarkMessageForDeletionFlow(
			ProcessorDefinition processorType) throws InitializationException,
			ProcessModellingException {

		RecoveryProcessor recoveryProcessor = new RecoveryProcessor(this
				.getProcessContext(), FusionConstants.DEFAULT_END_SP_NAME, true);
		return processorType.process(recoveryProcessor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.flow.CamelFlow#addErrorRoute(org
	 *      .apache.camel.model.ProcessorType,
	 *      com.headstrong.fusion.config.ErrorReporterConfig, java.lang.String)
	 */
	/**
	 * Creates Camel route for the Error Reporter.
	 * <p>
	 * <b>Route Definition Template</b>
	 * <p>
	 * <code>from(seda:<<error reporter id>>.to(<<error reporter endpoint>>))
	 */
	@SuppressWarnings("unchecked")
	public void createErrorRoute(ErrorReporterConfig errorReporterConfig,
			String processId) throws InitializationException,
			ProcessModellingException {
		ErrorRouteModeler endPointModeler = (ErrorRouteModeler) this
				.getEndPointModeler(errorReporterConfig.getId());
		Endpoint sedaEndpoint = this.getSourceSedaEndpoint(processId,
				errorReporterConfig.getId());
		ProcessorDefinition processorType = this.getRouteBuilder().from(
				sedaEndpoint);
		endPointModeler.model(this.getRouteBuilder(), processorType);
	}

	/**
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition addMessageReceivedFlow(
			SequenceType sequenceType, ProcessorDefinition processorType)
			throws InitializationException, ProcessModellingException {
		// create system in processor.
		OnMessageReceiveProcessor systemInProcessor = new OnMessageReceiveProcessor(
				this.getProcessContext());
		processorType = processorType.process(systemInProcessor);
		return processorType;
	}

	@SuppressWarnings("unchecked")
	public ProcessorDefinition addMessageHeaderSetFlow(
			SequenceType sequenceType, ProcessorDefinition processorType)
			throws InitializationException, ProcessModellingException {
		// create system in processor.
		HeaderMessageProcessor headerSetProcessor = new HeaderMessageProcessor(
				this.getProcessContext());

		processorType = processorType.process(headerSetProcessor);
		if (FusionActivator.FIRST_MSG_DELAY_VAL > 0) {
			FirstMessageDelayProcessor firstMsgDelayProcessor = new FirstMessageDelayProcessor(
					this.getProcessContext());
			processorType = processorType.process(firstMsgDelayProcessor);
		}
		return processorType;
	}

	/**
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition addMessageDeliveredFlow(
			SequenceType sequenceType, ProcessorDefinition processorType)
			throws InitializationException, ProcessModellingException {
		OnMessageDeliveryProcessor systemOutProcessor = new OnMessageDeliveryProcessor(
				this.getProcessContext());
		processorType = processorType.process(systemOutProcessor);
		return processorType;
	}

	/**
	 * Adds recovery handler to the flow. It will send savepoint messages to
	 * JMS.
	 * 
	 * @param processId
	 * @param recoveryManager
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition addErrorEventLoggingRoute()
			throws InitializationException, ProcessModellingException {
		ProcessorDefinition processorType = this.getRouteBuilder().from(
				getSourceSedaEndpoint(this.getProcessContext()
						.getProcessConfigurationModel().getProcess().getId(),
						FusionConstants.ERROR_QUEUE));
		// destination recovery queue.

		// if recovery is enabled mark message for deletion too.
		boolean recoveryOn = this.getProcessContext()
				.getProcessConfigurationModel().getProcess().isToRecover();
		if (recoveryOn) {
			RecoveryProcessor recoveryProcessor = new RecoveryProcessor(this
					.getProcessContext(), FusionConstants.DEFAULT_END_SP_NAME,
					true);
			processorType = processorType.process(recoveryProcessor);
		}

		processorType = processorType.process(new MessageConverter());
		// add error message event logging if configured
		boolean msgEvntlogOn = this.getProcessContext()
				.getProcessConfigurationModel().getProcess().isToLogMsgEvents();
		if (msgEvntlogOn) {
			processorType.process(new ErrorEventLogger());
		}
		return processorType;
	}

	/**
	 * Adds message deliver flow from a component
	 * 
	 * @precondition
	 * @postcondition
	 * @param endpoint
	 * @param processorType
	 * @return
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition addCompMessageDeliveredFlow(String endpointId,
			ProcessorDefinition processorType) throws InitializationException,
			ProcessModellingException {
		OnCompMessageDeliveryProcessor compInProcessor = new OnCompMessageDeliveryProcessor(
				this.getProcessContext(), endpointId);
		processorType = processorType.process(compInProcessor);
		return processorType;
	}

	/**
	 * Adds message receive to from a component
	 * 
	 * @precondition
	 * @postcondition
	 * @param endpoint
	 * @param processorType
	 * @return
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition addCompMessageReceivedFlow(String endpointId,
			ProcessorDefinition processorType) throws InitializationException,
			ProcessModellingException {
		OnCompMessageReceiveProcessor compOutProcessor = new OnCompMessageReceiveProcessor(
				this.getProcessContext(), endpointId);
		processorType = processorType.process(compOutProcessor);
		return processorType;
	}

	/**
	 * @return the endPointModelers
	 */
	public Map<String, EndPointModeler> getEndPointModelers() {
		return endPointModelers;
	}

	/**
	 * @param endPointModelers
	 *            the endPointModelers to set
	 */
	public void setEndPointModelers(
			Map<String, EndPointModeler> endPointModelers) {
		this.endPointModelers = endPointModelers;
	}

	/**
	 * @return the routeBuilder
	 */
	public RouteBuilder getRouteBuilder() {
		return routeBuilder;
	}

	/**
	 * @param routeBuilder
	 *            the routeBuilder to set
	 */
	public void setRouteBuilder(RouteBuilder routeBuilder) {
		this.routeBuilder = routeBuilder;
	}

	/**
	 * @return the processContext
	 */
	public CamelProcessContext getProcessContext() {
		return processContext;
	}

	/**
	 * @param processContext
	 *            the processContext to set
	 */
	public void setProcessContext(CamelProcessContext processContext) {
		this.processContext = processContext;
	}

	public EndPointModeler getEndPointModeler(String endPointId) {
		return this.getEndPointModelers().get(endPointId);
	}

	/**
	 * Adds recovery handler to the flow. Storing the multicast ID and endpoint
	 * ID for a multicast flow.
	 * 
	 * @param processorType
	 *            Processor type.
	 * @param multicastId
	 *            Multicast Id.
	 * @param endPointSeqId
	 *            Endpoint Id.
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition addMarkMessageForDeletionFlow(
			ProcessorDefinition processorType, String multicastId,
			String endPointSeqId) throws InitializationException,
			ProcessModellingException {

		RecoveryProcessor recoveryProcessor = new RecoveryProcessor(this
				.getProcessContext(), FusionConstants.DEFAULT_END_SP_NAME,
				true, multicastId, endPointSeqId);
		return processorType.process(recoveryProcessor);
	}
}

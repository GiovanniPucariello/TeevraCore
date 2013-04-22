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
 * $Id: CamelSedaFlow.java
 * $Revision: 
 * $Author: som krishan
 * $DateTime: Sep 21, 2008
 */

package com.headstrong.fusion.messaging.model.flow.seda;

import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.seda.SedaEndpoint;
import org.apache.camel.model.ProcessorDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.config.EndPointSequence;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.config.SourceSequence;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.binding.BindingEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.processor.MediationEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.routing.CBREndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.routing.MultiCastEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.routing.RoutingEndPointModeler;
import com.headstrong.fusion.messaging.model.flow.AbstractFlow;

/**
 * It creates Camel flow for the process. It uses SEDA as the intermediate
 * queues.
 */
public class CamelSedaFlow extends AbstractFlow {
	
	private static Logger logger = LoggerFactory.getLogger(CamelSedaFlow.class);

	/**
	 * @param endPointModelers
	 */
	public CamelSedaFlow(RouteBuilder routeBuilder,
			Map<String, EndPointModeler> endPointModelers,
			CamelProcessContext processContext) {
		super(routeBuilder, endPointModelers, processContext);
	}

	/**
	 * Returns the EndPointModeler.
	 * 
	 * @precondition endPointModelers != null
	 * @param id
	 *            endPointId
	 * @return {@link EndPointModeler}
	 */
	public EndPointModeler getEndPointModeler(String id) {
		return this.getEndPointModelers().get(id);
	}

	/**
	 * Starts a Camel Route.
	 * 
	 * 
	 * @param routeBuilder
	 *            Apache Camel route builder.
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition addFrom(SourceSequence sequenceType, String processId)
			throws InitializationException, ProcessModellingException {
		ProcessorDefinition processorType = null;
		EndPointModeler endPointModeler = this.getEndPointModeler(sequenceType
				.getEndPointId());
		boolean compEvntlogOn = this.getProcessContext()
				.getProcessConfigurationModel().getProcess()
				.isToLogCompEvents();
		if (endPointModeler instanceof BindingEndPointModeler) {

			// start a route . Directly read from the Binding EndPointModeler
			BindingEndPointModeler bindingEndPointModeler = (BindingEndPointModeler) endPointModeler;
			processorType = bindingEndPointModeler.modelFrom(this
					.getRouteBuilder());
			// set headers
			processorType = this.addMessageHeaderSetFlow(sequenceType,
					processorType);
			// add the error route.
			this.addConnectorErrorRoute(processorType,
					(ConnectorConfig) bindingEndPointModeler.getConfig());
		} else if (endPointModeler instanceof MediationEndPointModeler) {
			// Start a route. Read from the SEDA queue of Mediation
			// EndPointModeler.
			MediationEndPointModeler mediationEndPointModeler = (MediationEndPointModeler) endPointModeler;
			Endpoint inputEndpoint = this.getSourceSedaEndpoint(processId,
					mediationEndPointModeler.getConfig().getId());
			processorType = this.getRouteBuilder().from(inputEndpoint);
			if (sequenceType.getThreads() > 0) {
				processorType = processorType.threads(sequenceType.getThreads());
			}

			Map<String, Object> propertiesHandler = mediationEndPointModeler
					.getConfig().getProperties();

			if (propertiesHandler != null && propertiesHandler.containsKey("threadCount")) {
				int threadCount = Integer.parseInt(propertiesHandler.get(
						"threadCount").toString());

				int consumerCount = ((SedaEndpoint) inputEndpoint)
						.getConcurrentConsumers();

				// Set concurrent consumers if value to be configured is greater
				// than the default value and only if the count is already not set.
				if (threadCount > 1 && consumerCount != threadCount) {
					((SedaEndpoint) inputEndpoint)
							.setConcurrentConsumers(threadCount);
				}
			}
			processorType = processorType.process(mediationEndPointModeler
					.getProcessor());

		} else if (endPointModeler instanceof RoutingEndPointModeler) {

			RoutingEndPointModeler routingEndPointModeler = (RoutingEndPointModeler) endPointModeler;
			Endpoint inputEndpoint = this.getSourceSedaEndpoint(processId,
					routingEndPointModeler.getConfig().getId());
			processorType = this.getRouteBuilder().from(inputEndpoint);
			// Call the Router Modeler
			// TC: Individually need to verify the modelers.
			processorType = routingEndPointModeler.model(this, processorType,
					sequenceType, processId);
		}
		// if component logging is required, log message 'FINISHED' event by
		// this component
		if (compEvntlogOn) {
			processorType = this.addCompMessageDeliveredFlow(endPointModeler
					.getConfig().getId(), processorType);
		}

		return processorType;
	}

	/**
	 * Generates a To Route.
	 * 
	 * @precondition processorType != null
	 * @param processorType
	 *            process type identifier.
	 * @param sequence
	 *            Sequence Type.
	 * @param processId
	 *            unique process identifier.
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition addTo(ProcessorDefinition processorType,
			SequenceType sequence, String processId)
			throws InitializationException, ProcessModellingException {

		EndPointSequence endPointSequence = (EndPointSequence) sequence;
		EndPointModeler endPointModeler = this.getEndPointModeler(sequence
				.getEndPointId());
		ProcessorDefinition newProcessorType = null;

		boolean compEvntlogOn = this.getProcessContext()
				.getProcessConfigurationModel().getProcess()
				.isToLogCompEvents();

		// if component logging is required, log message 'RECEIVED' event by
		// this
		// component
		if (compEvntlogOn) {
			processorType = this.addCompMessageReceivedFlow(endPointModeler
					.getConfig().getId(), processorType);
		}

		Endpoint sedaEndpoint = this.getSourceSedaEndpoint(processId,
				endPointModeler.getConfig().getId());

		Integer throttleCnt = 0;
		if (this.getProcessContext().getProcessConfigurationModel()
				.getProcess().getThrottleMsgCount() != null)
			throttleCnt = Integer.parseInt(this.getProcessContext()
					.getProcessConfigurationModel().getProcess()
					.getThrottleMsgCount());

		Integer throttleTime = 0;
		if (this.getProcessContext().getProcessConfigurationModel()
				.getProcess().getThrottleTime() != null)
			throttleTime = Integer.parseInt(this.getProcessContext()
					.getProcessConfigurationModel().getProcess()
					.getThrottleTime());

		if (throttleCnt != null && throttleTime != null && throttleCnt > 0
				&& throttleTime > 0) {
			logger
					.debug("Seda Flow Throttling Configuration with throttle count as "
							+ throttleCnt
							+ ", and throttle time as "
							+ throttleTime);

			// It has been observed that camel always processes 1 message more 
			// than configured for throttling. 
			if (throttleCnt > 1)
				throttleCnt--;
			else
				throttleTime = throttleTime * 2;

			newProcessorType = processorType.throttle(throttleCnt)
					.timePeriodMillis(throttleTime).to(sedaEndpoint);
		} else {
			newProcessorType = processorType.to(sedaEndpoint);
		}

		if (endPointModeler instanceof MediationEndPointModeler) {
			// If EndPointModeler is MediationEndPointModeler.
			MediationEndPointModeler mediationEndPointModeler = (MediationEndPointModeler) endPointModeler;

			Map<String, Object> propertiesHandler = mediationEndPointModeler
					.getConfig().getProperties();

			if (propertiesHandler != null && propertiesHandler.containsKey("threadCount")) {
				int threadCount = Integer.parseInt(propertiesHandler.get(
						"threadCount").toString());

				int consumerCount = ((SedaEndpoint) sedaEndpoint)
						.getConcurrentConsumers();

				// Set concurrent consumers if value to be configured is greater
				// than the default value and only if the count is already not set.
				if (threadCount > 1 && consumerCount != threadCount) {
					((SedaEndpoint) sedaEndpoint)
							.setConcurrentConsumers(threadCount);
				}
			}

			if (endPointSequence.isDeadEnd()) {
				// If Dead End.
				// TC: if this is the last component in the flow .
				newProcessorType = this.getRouteBuilder().from(sedaEndpoint)
						.process(mediationEndPointModeler.getProcessor());
			}
		} else if (endPointModeler instanceof BindingEndPointModeler) {

			BindingEndPointModeler bindingEndPointModeler = (BindingEndPointModeler) endPointModeler;
			//Set concurrent Consumers
			Map<String, String> propertiesHandler = ((ConnectorConfig)bindingEndPointModeler.getConfig()).getProperties();
			if (propertiesHandler != null && propertiesHandler.containsKey("threadCount")) {
				int threadCount = Integer.parseInt(propertiesHandler.get(
						"threadCount").toString());

				int consumerCount = ((SedaEndpoint) sedaEndpoint)
						.getConcurrentConsumers();

				// Set concurrent consumers if value to be configured is greater
				// than the default value and only if the count is already not set.
				if (threadCount > 1 && consumerCount != threadCount) {
					((SedaEndpoint) sedaEndpoint)
							.setConcurrentConsumers(threadCount);
				}
			}
			// TC: Send the data to EndPointModeler
			newProcessorType = bindingEndPointModeler.modelTo(this
					.getRouteBuilder(), this.getRouteBuilder().from(
					sedaEndpoint));
			// add the error route.
			this.addConnectorErrorRoute(newProcessorType,
					(ConnectorConfig) bindingEndPointModeler.getConfig());
			
			// if component logging is required, log message 'FINISHED' event by
			// this component
			if (compEvntlogOn) {
				processorType = this.addCompMessageDeliveredFlow(
						endPointModeler.getConfig().getId(), processorType);
			}
		} else if (endPointModeler instanceof CBREndPointModeler) {
			RoutingEndPointModeler routingEndPointModeler = (RoutingEndPointModeler) endPointModeler;
			newProcessorType = this.getRouteBuilder().from(sedaEndpoint);
			// Call the Router Modeler
			// TC: Individually need to verify the modelers.
			newProcessorType = routingEndPointModeler.model(this,
					newProcessorType, sequence, processId);
		}else if (endPointModeler instanceof MultiCastEndPointModeler) {
			RoutingEndPointModeler routingEndPointModeler = (RoutingEndPointModeler) endPointModeler;
			newProcessorType = this.getRouteBuilder().from(sedaEndpoint);
			// Call the Router Modeler
			// TC: Individually need to verify the modelers.
			newProcessorType = routingEndPointModeler.model(this,
					newProcessorType, sequence, processId);
		}  
		else if (endPointModeler instanceof RoutingEndPointModeler) {
			// do nothing
		} else {
			throw new ProcessModellingException("Invalid Sequence defined");
		}
		return newProcessorType;
	}

}

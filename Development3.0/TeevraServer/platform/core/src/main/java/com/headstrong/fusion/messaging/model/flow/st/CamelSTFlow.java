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

package com.headstrong.fusion.messaging.model.flow.st;

import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.ProcessorDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.config.SourceSequence;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.binding.BindingEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.processor.MediationEndPointModeler;
import com.headstrong.fusion.messaging.model.flow.AbstractFlow;

/**
 * It creates ST - Camel flow for the process.
 */
public class CamelSTFlow extends AbstractFlow {

	private static Logger logger = LoggerFactory.getLogger(CamelSTFlow.class);

	/**
	 * @param endPointModelers
	 */
	public CamelSTFlow(RouteBuilder routeBuilder,
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
		if (endPointModeler instanceof BindingEndPointModeler) {
			// start a route . Directly read from the Binding EndPointModeler
			BindingEndPointModeler bindingEndPointModeler = (BindingEndPointModeler) endPointModeler;
			processorType = bindingEndPointModeler.modelFrom(this
					.getRouteBuilder());
			// add the error route.
			this.addConnectorErrorRoute(processorType,
					(ConnectorConfig) bindingEndPointModeler.getConfig());
		} else {
			throw new ProcessModellingException("Router "
					+ sequenceType.getEndPointId()
					+ " not supported for ST flow");
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
		EndPointModeler endPointModeler = this.getEndPointModeler(sequence
				.getEndPointId());
		ProcessorDefinition newProcessorType = null;

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

		if (endPointModeler instanceof MediationEndPointModeler) {
			MediationEndPointModeler mediationEndPointModeler = (MediationEndPointModeler) endPointModeler;

			if (throttleCnt != null && throttleTime != null && throttleCnt > 0
					&& throttleTime > 0) {
				logger
						.debug("ST Flow Throttling Configuration with throttle count as "
								+ throttleCnt
								+ ", and throttle time as "
								+ throttleTime);
				// It has been observed that camel always processes 1 message more 
				// than configured for throttling. 
				if (throttleCnt > 1)
					throttleCnt--;
				else
					throttleTime = throttleTime * 2;

				newProcessorType = processorType.throttle(throttleCnt).timePeriodMillis(
						throttleTime).process(mediationEndPointModeler.getProcessor());
			} else {
				newProcessorType = processorType
						.process(mediationEndPointModeler.getProcessor());
			}

		} else if (endPointModeler instanceof BindingEndPointModeler) {
			BindingEndPointModeler bindingEndPointModeler = (BindingEndPointModeler) endPointModeler;

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
				
				newProcessorType = bindingEndPointModeler.modelTo(
						this.getRouteBuilder(), processorType).throttle(throttleCnt)
						.timePeriodMillis(throttleTime);

			} else {
				// TC: Send the data to EndPointModeler
				newProcessorType = bindingEndPointModeler.modelTo(this
						.getRouteBuilder(), processorType);
			}
			// add the error route.
			this.addConnectorErrorRoute(newProcessorType,
					(ConnectorConfig) bindingEndPointModeler.getConfig());
		} else {
			throw new ProcessModellingException("Router "
					+ sequence.getEndPointId() + " not supported for ST flow");
		}
		return newProcessorType;
	}
}

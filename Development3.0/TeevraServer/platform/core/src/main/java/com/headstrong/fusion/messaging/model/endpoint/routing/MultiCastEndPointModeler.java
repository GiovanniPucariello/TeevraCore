/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright '\u00a9' 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: MultiCastEndPointModeler.java
 * $Revision: 
 * $Author: vgarde
 * $DateTime: Mar 12, 2010 
 */

package com.headstrong.fusion.messaging.model.endpoint.routing;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.model.ChoiceDefinition;
import org.apache.camel.model.MulticastDefinition;
import org.apache.camel.model.ProcessorDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.EndPointSequence;
import com.headstrong.fusion.config.MultiCastRouterConfig;
import com.headstrong.fusion.config.RouterConfig;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.core.ProcessContext;
import com.headstrong.fusion.messaging.model.flow.AbstractFlow;
import com.headstrong.fusion.messaging.model.flow.CamelFlow;
import com.headstrong.fusion.messaging.model.flow.seda.CamelSedaFlow;
import com.headstrong.fusion.config.Process;
import com.headstrong.fusion.config.Route;

/**
 * Refer to {@link http://camel.apache.org/multicast.html}.
 * <br>
 * The Multicast allows to route the same message to a number of 
 * endpoints and process them in a different way. The main difference 
 * between the Multicast and Splitter is that Splitter will split the message 
 * into several pieces but the Multicast will not modify the request message.
 * @author vgarde
 *
 */
public class MultiCastEndPointModeler implements RoutingEndPointModeler {

	private MultiCastRouterConfig config;
	private ProcessContext processContext;
	private Logger logger = LoggerFactory
			.getLogger(MultiCastEndPointModeler.class);
	
	/* (non-Javadoc)
	 * @see com.headstrong.fusion.messaging.model.endpoint.routing.RoutingEndPointModeler#getConfig()
	 */
	@Override
	public RouterConfig getConfig() {
		return this.config;
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.messaging.model.endpoint.routing.RoutingEndPointModeler#init(com.headstrong.fusion.core.ProcessContext, com.headstrong.fusion.config.RouterConfig)
	 */
	@Override
	public void init(ProcessContext processContext, RouterConfig config) throws InitializationException {
		this.config = (MultiCastRouterConfig) config;
		this.processContext = processContext;
	}
	

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.messaging.model.endpoint.routing.RoutingEndPointModeler#model(com.headstrong.fusion.messaging.model.flow.CamelFlow, org.apache.camel.model.ProcessorType, com.headstrong.fusion.config.SequenceType, java.lang.String)
	 */
	@Override
	public ProcessorDefinition model(CamelFlow flow, ProcessorDefinition processorType, SequenceType sequence, String processId)
			throws ProcessModellingException, InitializationException {

		boolean recoveryOn = this.processContext.getProcessConfigurationModel()
				.getProcess().isToRecover();
		
		boolean msgEvntlogOn = this.processContext.getProcessConfigurationModel().getProcess().isToLogMsgEvents();

		if (recoveryOn && this.config.getTargets().size() > 1) {

			processorType = processorType.multicast();

			for (EndPointSequence endpointSeq : config.getTargets()) {

				processorType = processorType.to("seda:multiCastSeda_"
						+ endpointSeq.getEndPointId() + "_" + processId);
			}

			for (EndPointSequence endpointSeq : config.getTargets()) {

				Processor multicastProcessor = null;
				if (endpointSeq.isDeadEnd()) {
					multicastProcessor = new MutlicastRecoveryProcessor(
							endpointSeq.getEndPointId());
				} else {
					multicastProcessor = new MutlicastRecoveryProcessor(
							getDestinationEndpoint(endpointSeq.getEndPointId()));
				}
				// Processor to set the endpoint in the header.
				processorType = ((AbstractFlow) flow).getRouteBuilder().from(
						"seda:multiCastSeda_" + endpointSeq.getEndPointId()
								+ "_" + processId).process(multicastProcessor);

				// Choice to filter the messages for the condition check
				ChoiceDefinition choiceType = processorType.choice();
				// If the message is already processed, move it to the
				// DeadLetterChannel
				choiceType = choiceType.when(
						flow.getRouteBuilder().header("recoverable").isEqualTo(
								"false")).to(
						"log:org.apache.camel.DeadLetterChannel?level=error");

				// Else route it to the next component.
				choiceType = choiceType.otherwise();
				processorType = flow.addTo(choiceType, endpointSeq, processId);

				if (endpointSeq.isDeadEnd()) {

					if (msgEvntlogOn) {
						processorType = ((CamelSedaFlow) flow)
								.addMessageDeliveredFlow(null, processorType);
					}

					processorType = ((CamelSedaFlow) flow)
							.addMarkMessageForDeletionFlow(processorType, this
									.getConfig().getId(), endpointSeq
									.getEndPointId());
				}
			}
		} else {
			MulticastDefinition multicastType = processorType.multicast();
			for (EndPointSequence endpointSeq : config.getTargets()) {
				flow.addTo(multicastType, endpointSeq, processId);
				
				if (endpointSeq.isDeadEnd()) {
					if (msgEvntlogOn) {
						processorType = ((CamelSedaFlow) flow)
								.addMessageDeliveredFlow(null, processorType);
					}
				}
			}
			return multicastType;
		}

		return processorType;
	}

	/**
	 * Fetch the destination endpoint for the passed component.
	 * @param componentId
	 * @return
	 */
	private String getDestinationEndpoint(String componentId) {

		Process process = processContext.getProcessConfigurationModel()
				.getProcess();

		for (Route route : process.getRoutes()) {

			Iterator<SequenceType> routeSeqItr = route.getSequence().iterator();
			SequenceType srcSeqType = routeSeqItr.next();
			SequenceType endSeqType = routeSeqItr.next();

			// If this is the end route, return the end sequence.
			if (srcSeqType.getEndPointId().equals(componentId)) {
				if (route.isEnd()) {
					return endSeqType.getEndPointId();
				} else {
					return getDestinationEndpoint(endSeqType.getEndPointId());
				}
			}
		}

		return "";
	}

	/**
	 * Processor to set the recoverable flag based on processed endpoints.
	 * @author nbagchi
	 * 
	 */
	class MutlicastRecoveryProcessor implements Processor {
		private String endpointSeqId;

		public MutlicastRecoveryProcessor(String endpointSeqId) {
			this.endpointSeqId = endpointSeqId;
		}

		@Override
		public void process(Exchange exchange) throws Exception {

			if (exchange.getIn().getHeader("processedEndpoints") != null) {
				String processedEPStr = exchange.getIn().getHeader(
						"processedEndpoints").toString();
				
				if (!processedEPStr.trim().equals("")) {
					logger
							.debug("Inside MutlicastRecoveryProcessor endpoint is "
									+ this.endpointSeqId
									+ " message, processedEPStr as "
									+ processedEPStr);

					List<String> temp = Arrays
							.asList(processedEPStr.split(","));

					if (temp.contains(this.endpointSeqId)) {
						exchange.getIn().setHeader("recoverable", "false");
					} else {
						exchange.getIn().setHeader("recoverable", "true");
					}
				}
			}
		}
	}

}

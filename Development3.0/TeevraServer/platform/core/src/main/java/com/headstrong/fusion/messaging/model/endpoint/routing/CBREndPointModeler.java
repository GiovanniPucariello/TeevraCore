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
 * $Id: CBREndPointModeler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 1, 2008 
 */

package com.headstrong.fusion.messaging.model.endpoint.routing;

import org.apache.camel.Exchange;
import org.apache.camel.model.ChoiceDefinition;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.processor.Splitter;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.CBREndPointConfig;
import com.headstrong.fusion.config.EndPointSequence;
import com.headstrong.fusion.config.RouterConfig;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.config.When;
import com.headstrong.fusion.core.ProcessContext;
import com.headstrong.fusion.messaging.model.flow.CamelFlow;
import com.headstrong.fusion.messaging.model.flow.seda.CamelSedaFlow;
import com.headstrong.fusion.messaging.service.CBRProcessor;

/**
 * Content Based Routing EndPointModeler.
 * 
 * 
 */
public class CBREndPointModeler implements RoutingEndPointModeler {
	/**
	 * Content Based Router Configuration.
	 */
	private CBREndPointConfig config;
	private boolean active;
	private ProcessContext processContext;

	/**
	 * Expression Types.
	 * 
	 */
	private static enum expressions {
		XPATH, JEXPRESSION
	};

	/**
	 * Initialize the EndPointModeler and Set the status to <code>Active</code>
	 * 
	 * @param config
	 */
	public void init(ProcessContext processContext, RouterConfig config) {
		this.config = (CBREndPointConfig) config;
		this.setActive(true);
		this.processContext = processContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.messaging.model.endpoint.model.EndPointModeler#
	 * isActive()
	 */
	public boolean isActive() {
		return this.active;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.messaging.model.endpoint.model.EndPointModeler#
	 * setActive(boolean)
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	public CBREndPointConfig getConfig() {
		return this.config;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.messaging.model.endpoint.model.RoutingEndPoint#
	 * model(org.apache.camel.builder.RouteBuilder,
	 * org.apache.camel.model.ProcessorType)
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition model(CamelFlow flow, ProcessorDefinition processorType,
			SequenceType sequence, String processId)
			throws ProcessModellingException, InitializationException {

		// Recovery changes - If the route is ending to an endpoint, deadend is marked in the ProcessModel.
		// Handle recovery for deadend routes.
		boolean recoveryOn = this.processContext.getProcessConfigurationModel().getProcess().isToRecover();
		boolean msgEvntlogOn = this.processContext.getProcessConfigurationModel().getProcess().isToLogMsgEvents();
		
		ChoiceDefinition choiceType = null;
		if (expressions.XPATH.toString().equals(
				this.getConfig().getExpressionType())) {
			choiceType = processorType.choice();
			// Add when sequences
			for (When when : this.getConfig().getWhen()) {
				choiceType = choiceType.when().xpath(when.getExpression());

				EndPointSequence endPointSequence = when.getTo();
				flow.addTo(choiceType, endPointSequence, processId);
				
				if (endPointSequence.isDeadEnd()) {
					
					if (msgEvntlogOn) {
						processorType = ((CamelSedaFlow) flow)
								.addMessageDeliveredFlow(null, processorType);
					}
					
					if (recoveryOn) {
						processorType = ((CamelSedaFlow) flow)
								.addMarkMessageForDeletionFlow(processorType);
					}
				}
			}
			// Otherwise clause if specified.
			if (this.getConfig().getOtherwise() != null) {
				
				EndPointSequence endPointSequence = this.getConfig()
						.getOtherwise().getTo();
				flow.addTo(choiceType, endPointSequence,
						processId);

				if (endPointSequence.isDeadEnd()) {
					
					if (msgEvntlogOn) {
						processorType = ((CamelSedaFlow) flow)
								.addMessageDeliveredFlow(null, processorType);
					}
					
					if (recoveryOn) {
						processorType = ((CamelSedaFlow) flow)
								.addMarkMessageForDeletionFlow(processorType);
					}
				}
			}
		} else if (expressions.JEXPRESSION.toString().equals(
				this.getConfig().getExpressionType())) {
			// create a content based grouping processor.
			CBRProcessor cbrGroupProcessor = null;
			try {
				cbrGroupProcessor = new CBRProcessor(config);
			} catch (Exception e) {
				throw new InitializationException(
						"Error while parsing the expressions.", e);
			}
			// since processor is based on index numbers.
			int index = 0;
			// Add Route to create sub-groups based on the
			// route conditions. ( when and otherwise ).
			// split the sub-groups into multiple exchanges.
			choiceType = processorType.process(cbrGroupProcessor).split(
					flow.getRouteBuilder().body()).choice();

			// this block filters the empty list and empty objects .
			// set the SPLIT COUNTER header as ignore.
			choiceType = choiceType.when(
					flow.getRouteBuilder().body().isEqualTo(
							FusionConstants.EMPTY_STRING)).setHeader(
					Exchange.SPLIT_INDEX ,
					flow.getRouteBuilder().constant("ignore")).when(
					flow.getRouteBuilder().body().isEqualTo(
							FusionConstants.EMPTY_LIST)).setHeader(
									Exchange.SPLIT_INDEX,
					flow.getRouteBuilder().constant("ignore"));

			for (When when : this.getConfig().getWhen()) {
				choiceType = choiceType.when(flow.getRouteBuilder().header(
						Exchange.SPLIT_INDEX).isEqualTo(new Integer(index)));
				
				EndPointSequence endPointSequence = when.getTo();				
				processorType = flow.addTo(choiceType, endPointSequence, processId);
				
				if (endPointSequence.isDeadEnd()) {
					
					if (msgEvntlogOn) {
						processorType = ((CamelSedaFlow) flow)
								.addMessageDeliveredFlow(null, processorType);
					}
					
					if (recoveryOn) {
						processorType = ((CamelSedaFlow)flow).addMarkMessageForDeletionFlow(processorType);
					}
				}
				
				index++;
			}
			if (this.getConfig().getOtherwise() != null) {
				choiceType = choiceType.when(flow.getRouteBuilder().header(
						Exchange.SPLIT_INDEX).isEqualTo(new Integer(index)));
				
				EndPointSequence endPointSequence = this.getConfig().getOtherwise().getTo();
				processorType = flow.addTo(choiceType, endPointSequence, processId);
				
				if (endPointSequence.isDeadEnd()) {
					
					if (msgEvntlogOn) {
						processorType = ((CamelSedaFlow) flow)
								.addMessageDeliveredFlow(null, processorType);
					}
					
					if (recoveryOn) {
						processorType = ((CamelSedaFlow)flow).addMarkMessageForDeletionFlow(processorType);
					}
				}
			}
		} else {
			throw new ProcessModellingException("Expression type "
					+ this.getConfig().getExpressionType() + " not supported.");
		}
		return choiceType;
	}
}

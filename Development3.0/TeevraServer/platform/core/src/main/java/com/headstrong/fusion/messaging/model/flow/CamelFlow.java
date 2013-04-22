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
 * $Id: Flow.java
 * $Revision: 
 * $Author: som krishan
 * $DateTime: Sep 21, 2008
 */

package com.headstrong.fusion.messaging.model.flow;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.ProcessorDefinition;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.config.SourceSequence;

/**
 * 
 */
public interface CamelFlow {
	public static enum FLOW_TYPE {
		SEDA {
			@Override
			public String toString() {
				return "SEDA";
			}
		},
		JMS {
			@Override
			public String toString() {
				return "JMS";
			}
		},
		ST {
			@Override
			public String toString() {
				return "ST";
			}
		}
	};

	/**
	 * Method starts a route.
	 * 
	 * @param routeBuilder
	 * @param sequenceType
	 * @param processId
	 * @return
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings( { "unchecked" })
	public ProcessorDefinition addFrom(SourceSequence sequenceType, String processId)
			throws InitializationException, ProcessModellingException;

	/**
	 * Method adds {@link ProcessorType} to the route.
	 * 
	 * @param routeBuilder
	 * @param processorType
	 * @param sequence
	 * @param processId
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition addTo(ProcessorDefinition processorType,
			SequenceType sequence, String processId)
			throws InitializationException, ProcessModellingException;

	public RouteBuilder getRouteBuilder();

	/**
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition addMessageReceivedFlow(SequenceType sequenceType,
			ProcessorDefinition processorType) throws InitializationException,
			ProcessModellingException;

	/**
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition addMessageDeliveredFlow(SequenceType sequenceType,
			ProcessorDefinition processorType) throws InitializationException,
			ProcessModellingException;
}

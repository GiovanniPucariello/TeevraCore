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
 * $Id: BindingEndPointModeler.java
 * $Revision: 
 * $Author: som krishan
 * $DateTime: Sep 21, 2008
 */

package com.headstrong.fusion.messaging.model.endpoint.binding;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.ProcessorDefinition;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModeler;

public interface BindingEndPointModeler extends EndPointModeler {

	/**
	 * Initializes the Binding Endpoint with the configuration.
	 * 
	 * @param config
	 * @throws InitializationException
	 */
	public void init(CamelProcessContext processContext, ConnectorConfig config)
			throws InitializationException;

	/**
	 * Creates a Apache Camel route with this connector as the route source.
	 * 
	 * 
	 * @param routeBuilder
	 * @return {@link ProcessorType}
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition modelFrom(RouteBuilder routeBuilder)
			throws ProcessModellingException;

	/**
	 * Creates a Apache Camel route with this connector as the route
	 * destination.
	 * 
	 * @param routeBuilder
	 * @param processorType
	 * @return {@link ProcessorType}
	 * @throws ProcessModellingException
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition modelTo(RouteBuilder routeBuilder,
			ProcessorDefinition processorType) throws ProcessModellingException;
}

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
 * $Id: ErrorRouteModeler.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: May 28, 2009 
 */

package com.headstrong.fusion.messaging.model.endpoint.error;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.ProcessorDefinition;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.config.ErrorReporterConfig;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModelerFactory;
import com.headstrong.fusion.messaging.model.endpoint.binding.BindingEndPointModeler;

/**
 * 
 */
public class ErrorRouteModeler implements EndPointModeler {

	/**
	 * Configuration.
	 */
	private ErrorReporterConfig config;

	/**
	 * Error Reporter reads from the SEDA queue and pushes data to some Binding
	 * Endpoint. This modeler will create the route for the Binding Endpoint.
	 */
	private BindingEndPointModeler bindingEndPointModeler;

	/**
	 * 
	 * @throws InitializationException
	 */
	public void init(CamelProcessContext processContext,
			ErrorReporterConfig errorReporterConfig)
			throws InitializationException {
		this.setConfig(errorReporterConfig);
		this.bindingEndPointModeler = (BindingEndPointModeler) EndPointModelerFactory
				.getEndPoint(errorReporterConfig.getType());
		ConnectorConfig connectorConfig = new ConnectorConfig();
		connectorConfig.setId(errorReporterConfig.getId());
		connectorConfig.setType(errorReporterConfig.getType());
		connectorConfig.setProperties(errorReporterConfig.getProperties());
		bindingEndPointModeler.init(processContext, connectorConfig);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.RoutingEndPoint#model(org.apache.camel.builder.RouteBuilder,
	 *      org.apache.camel.model.ProcessorType)
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition model(RouteBuilder routeBuilder,
			ProcessorDefinition processorType) throws ProcessModellingException,
			InitializationException {
		return this.bindingEndPointModeler.modelTo(routeBuilder, processorType);
	}

	/**
	 * @return the config
	 */
	public ErrorReporterConfig getConfig() {
		return config;
	}

	/**
	 * @param config
	 *            the config to set
	 */
	public void setConfig(ErrorReporterConfig config) {
		this.config = config;
	}

}

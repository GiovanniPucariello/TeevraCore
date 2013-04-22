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
 * $Id: MockEndPointModeler.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: May 29, 2009 
 */

package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.util.concurrent.LinkedBlockingQueue;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.seda.SedaComponent;
import org.apache.camel.component.seda.SedaEndpoint;
import org.apache.camel.model.ProcessorDefinition;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.core.CamelProcessContext;

/**
 * 
 */
public class SedaEndPointModeler extends AbstractBindingEndPointModeler {

	private String sedaEndPointName;
	private CamelProcessContext processContext;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.model.binding.AbstractBindingEndPointModeler#init(com.headstrong.fusion.config.ConnectorConfig)
	 */
	public void init(CamelProcessContext processContext, ConnectorConfig config)
			throws InitializationException {
		this.processContext = processContext;
		/**
		 * Initialize properties in the Super Class.
		 */
		super.init(config, SedaEndPointBindingProperty.values());
		/**
		 * Initialize the Bean.
		 */
		this.configure(config);
		/**
		 * Check if all mandatory fields are present.
		 */
	}

	private void configure(ConnectorConfig config) {
		this.setSedaEndPointName(config
				.getProperty(SedaEndPointBindingProperty.sedaEndPointName
						.toString()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.binding.BindingEndPointModeler#modelFrom(org.apache.camel.builder.RouteBuilder)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ProcessorDefinition modelFrom(RouteBuilder routeBuilder)
			throws ProcessModellingException {
		ProcessorDefinition processorType = null;
		String processId = this.processContext.getProcessConfigurationModel()
				.getProcess().getId();
		String endpointId = this.getSedaEndPointName();
		String endpointUri = processId + "." + endpointId;

		SedaComponent sedaComponent = new SedaComponent();
		sedaComponent.setCamelContext(this.processContext.getCamelContext());
		Endpoint sedaEndpoint = new SedaEndpoint(endpointUri, sedaComponent, 
				new LinkedBlockingQueue<Exchange>());
		sedaEndpoint.setCamelContext(routeBuilder.getContext());
		this.processContext.getProcessMetaData().addEndpoint(processId,
				endpointId, sedaEndpoint);
		try {
			processorType = routeBuilder.from(sedaEndpoint);
		} catch (Exception e) {
			throw new ProcessModellingException(e);
		}
		return processorType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.binding.BindingEndPointModeler#modelTo(org.apache.camel.builder.RouteBuilder,
	 *      org.apache.camel.model.ProcessorType)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ProcessorDefinition modelTo(RouteBuilder routeBuilder,
			ProcessorDefinition processorType) throws ProcessModellingException {

		ProcessorDefinition routeProcessor = null;
		String processId = this.processContext.getProcessConfigurationModel()
				.getProcess().getId();
		String endpointId = this.getSedaEndPointName();
		String endpointUri = processId + "." + endpointId;

		SedaComponent sedaComponent = new SedaComponent();
		sedaComponent.setCamelContext(this.processContext.getCamelContext());
		Endpoint sedaEndpoint = new SedaEndpoint(endpointUri, sedaComponent, 
				new LinkedBlockingQueue<Exchange>());
		sedaEndpoint.setCamelContext(routeBuilder.getContext());
		this.processContext.getProcessMetaData().addEndpoint(processId,
				endpointId, sedaEndpoint);
		try {
			routeProcessor = processorType.to(sedaEndpoint);
		} catch (Exception e) {
			throw new ProcessModellingException(e);
		}
		return routeProcessor;
	}

	public static enum SedaEndPointBindingProperty implements BindingProperty {
		// List of properties expected by JMS EndPointModeler.
		sedaEndPointName;

		@Override
		public boolean isMandatory() {
			return true;
		}
	}

	/**
	 * @return the sedaEndPointName
	 */
	public String getSedaEndPointName() {
		return sedaEndPointName;
	}

	/**
	 * @param sedaEndPointName
	 *            the sedaEndPointName to set
	 */
	public void setSedaEndPointName(String sedaEndPointName) {
		this.sedaEndPointName = sedaEndPointName;
	}

}

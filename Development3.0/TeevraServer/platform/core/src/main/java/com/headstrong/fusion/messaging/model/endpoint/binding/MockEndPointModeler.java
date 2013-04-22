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

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.ProcessorDefinition;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.core.CamelProcessContext;

/**
 * 
 */
public class MockEndPointModeler extends AbstractBindingEndPointModeler {

	private String mockEndPointName;
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
		super.init(config, MockEndPointBindingProperty.values());
		/**
		 * Initialize the Bean.
		 */
		this.configure(config);
		/**
		 * Check if all mandatory fields are present.
		 */
	}

	private void configure(ConnectorConfig config) {
		this.setMockEndPointName(config
				.getProperty(MockEndPointBindingProperty.mockEndPointName
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
		String key = "mock:" + this.getMockEndPointName();
		MockEndpoint mockEndpoint = new MockEndpoint(key);
		// add the endpoint in the metadata
		this.processContext.getProcessMetaData().addEndpoint(
				this.getProcessContext().getProcessConfigurationModel()
						.getProcess().getId(), this.getConfig().getId(),
				mockEndpoint);
		ProcessorDefinition processorType = null;
		try {
			routeBuilder.getContext().addEndpoint(key, mockEndpoint);
			processorType = routeBuilder.from(mockEndpoint);
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
		String key = "mock:" + this.getMockEndPointName();
		MockEndpoint mockEndpoint = new MockEndpoint(key);
		// add the endpoint in the metadata
		this.processContext.getProcessMetaData().addEndpoint(
				this.getProcessContext().getProcessConfigurationModel()
						.getProcess().getId(), this.getConfig().getId(),
				mockEndpoint);
		ProcessorDefinition routeProcessor = null;
		try {
			routeBuilder.getContext().addEndpoint(key, mockEndpoint);
			routeProcessor = processorType.to(mockEndpoint);
		} catch (Exception e) {
			throw new ProcessModellingException(e);
		}
		return routeProcessor;
	}

	public static enum MockEndPointBindingProperty implements BindingProperty {
		// List of properties expected by JMS EndPointModeler.
		mockEndPointName;

		@Override
		public boolean isMandatory() {
			return true;
		}
	}

	/**
	 * @return the sedaEndPointName
	 */
	public String getMockEndPointName() {
		return mockEndPointName;
	}

	/**
	 * @param sedaEndPointName
	 *            the sedaEndPointName to set
	 */
	public void setMockEndPointName(String mockEndPointName) {
		this.mockEndPointName = mockEndPointName;
	}

	public CamelProcessContext getProcessContext() {
		return processContext;
	}

	public void setProcessContext(CamelProcessContext processContext) {
		this.processContext = processContext;
	}

}

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
 * $Id: EuronextBindingEndPointModeler.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Mar 6, 2009 
 */

package com.headstrong.fusion.messaging.model.endpoint.binding;

import org.apache.camel.Endpoint;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.ProcessorDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.component.FusionComponent;
import com.headstrong.fusion.commons.component.FusionComponentFactory;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.core.commons.DefaultBindingConfig;
import com.headstrong.fusion.core.commons.adapter.camel.FusionCamelComponent;

/**
 * 
 */
@SuppressWarnings("unchecked")
public class FusionBindingEndPointModeler extends
		AbstractBindingEndPointModeler {

	private static final Logger logger = LoggerFactory
			.getLogger(FusionBindingEndPointModeler.class);

	/**
	 * Generic Fusion Camel Component.
	 */
	private FusionCamelComponent fusionCamelComponent;

	private CamelProcessContext processContext;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.model.binding.AbstractBindingEndPointModeler#init(com.headstrong.fusion.config.ConnectorConfig)
	 */
	public void init(CamelProcessContext processContext, ConnectorConfig config)
			throws InitializationException {
		// call the init of the AbstractBindingEndpoint.
		super.init(config);
		this.processContext = processContext;
		FusionComponent fusionComponent = FusionComponentFactory
				.getComponent(config.getType());
		fusionCamelComponent = new FusionCamelComponent(fusionComponent,
				processContext.getCamelContext(), this.processContext
						.getProcessStateController());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.BindingEndPoint#modelFrom(org.apache.camel.builder.RouteBuilder)
	 */
	public ProcessorDefinition modelFrom(RouteBuilder routeBuilder)
			throws ProcessModellingException {
		Endpoint endPoint;
		try {
			BindingConfig bindingConfig = new DefaultBindingConfig(
					processContext, processContext.getProcessId(), this
							.getConfig().getId(), this.getConfig()
							.getProperties(), this.getConfig()
							.getErrorConfigList());
			endPoint = this.fusionCamelComponent.createEndpoint(bindingConfig,
					FusionCamelComponent.FUSION_CONSUMER);
		} catch (Exception e) {
			logger.error("Error creating the endpoint.", e);
			throw new ProcessModellingException("Error creating the endpoint.",
					e);
		}
		return routeBuilder.from(endPoint);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.BindingEndPoint#modelTo(org.apache.camel.builder.RouteBuilder,
	 *      org.apache.camel.model.ProcessorType)
	 */
	public ProcessorDefinition modelTo(RouteBuilder routeBuilder,
			ProcessorDefinition processorType) throws ProcessModellingException {
		Endpoint endPoint;
		try {
			BindingConfig bindingConfig = new DefaultBindingConfig(
					processContext, processContext.getProcessId(), this
							.getConfig().getId(), this.getConfig()
							.getProperties(), this.getConfig()
							.getErrorConfigList());
			endPoint = this.fusionCamelComponent.createEndpoint(bindingConfig,
					FusionCamelComponent.FUSION_PRODUCER);
		} catch (Exception e) {
			logger.error("Error creating the endpoint.", e);
			throw new ProcessModellingException("Error creating the endpoint.",
					e);
		}
		return processorType.to(endPoint);
	}

}

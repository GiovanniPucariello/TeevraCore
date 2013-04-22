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
 * $Id: FusionCamelComponent.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 15, 2009 
 */

package com.headstrong.fusion.core.commons.adapter.camel;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ProcessStateController;
import com.headstrong.fusion.commons.component.FusionComponent;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.SyncEndpoint;

/**
 * Wrapper Component which wraps all fusion component ( connectors ). creates a
 * wrapper camel endpoint which wraps the fusion endpoint.
 */
public class FusionCamelComponent extends DefaultComponent {
	public static final int FUSION_PRODUCER = 1;
	public static final int FUSION_CONSUMER = 2;

	private static final Logger logger = LoggerFactory
			.getLogger(FusionCamelComponent.class);
	/**
	 * Fusion Component.
	 */
	private FusionComponent fusionComponent;

	private ProcessStateController stateController;

	/**
	 * @param fusionComponent
	 */
	public FusionCamelComponent(FusionComponent fusionComponent,
			CamelContext context, ProcessStateController stateController) {
		super(context);
		this.fusionComponent = fusionComponent;
		this.stateController = stateController;
		logger.debug("Inside FusionCamelComponent, setting stateController "
				+ stateController);
	}

	public Endpoint createEndpoint(BindingConfig bindingConfig,
			int endpointType) throws Exception {
		FusionEndpoint<MessageExchange> fusionEndPoint = this.fusionComponent
				.createEndpoint(bindingConfig);
		Endpoint endPoint = new FusionCamelEndPoint(fusionEndPoint,
				this.stateController);
		endPoint.setCamelContext(this.getCamelContext());

		if (fusionEndPoint instanceof SyncEndpoint) {
			// register the endpoint for synchronization
			switch (endpointType) {
			case FUSION_PRODUCER:
				if (((SyncEndpoint) fusionEndPoint).isSyncProducer()) {
					this.stateController.registerByServiceId(bindingConfig
							.getServiceId());
				}
				break;
			case FUSION_CONSUMER:
				if (((SyncEndpoint) fusionEndPoint).isSyncConsumer()) {
					this.stateController.registerByServiceId(bindingConfig
							.getServiceId());
				}
				break;
			}
		}
		return endPoint;

	}

	@Override
	protected Endpoint createEndpoint(String uri, String remaining,
			Map parameters) throws Exception {
		throw new Exception("Method not supported exception");
	}

}

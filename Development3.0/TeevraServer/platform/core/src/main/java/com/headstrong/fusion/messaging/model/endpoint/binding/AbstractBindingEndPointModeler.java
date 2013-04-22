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
 * $Id: AbstractBindingEndPointModeler.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 19, 2008 
 */

package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.config.ConnectorConfig;

/**
 * Abstract binding endpoint class.
 * 
 */
public abstract class AbstractBindingEndPointModeler implements
		BindingEndPointModeler {

	private static Logger logger = LoggerFactory
			.getLogger(AbstractBindingEndPointModeler.class);

	/**
	 * Configuration for the connector endpoint.
	 */
	private ConnectorConfig config;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.BindingEndPoint#init(com.headstrong.fusion.config.ConnectorConfig,
	 *      org.apache.camel.CamelContext)
	 */
	public void init(ConnectorConfig connectorConfig,
			BindingProperty[]... properties) throws InitializationException {
		this.setConfig(connectorConfig);
		this.validateConfiguration(properties);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.model.binding.BindingEndPointModeler#init(com.headstrong.fusion.config.ConnectorConfig)
	 */
	protected void init(ConnectorConfig connectorConfig)
			throws InitializationException {
		this.setConfig(connectorConfig);
	}

	/**
	 * A utility method that verifies all the mandatory properties if the
	 * properties are present or not.
	 * 
	 * @throws InitializationException
	 */
	protected void validateConfiguration(BindingProperty[]... properties)
			throws InitializationException {

		if (this.getConfig() == null) {
			throw new InitializationException("No configuration provided.");
		}

		List<String> missingFields = new ArrayList<String>();
		for (BindingProperty[] bindingProperties : properties) {
			for (BindingProperty bindingProperty : bindingProperties) {
				if (bindingProperty.isMandatory()
						&& !this.getConfig().containsKey(
								bindingProperty.toString())) {
					missingFields.add(bindingProperty.toString());
				}
			}
		}
		if (!missingFields.isEmpty()) {
			throw new InitializationException(
					"Following mandatory fields are missing "
							+ missingFields.toString() + " for component id "
							+ this.getConfig().getId());
		}
	}

	@SuppressWarnings("unchecked")
	public void registerComponent(CamelContext context, String componenentName,
			Component component) {
		try {
			context.addComponent(componenentName, component);
		} catch (Exception e) {
			logger
					.info("Error while registering, may be component is already registered");
		}
	}

	/**
	 * @param config
	 *            the config to set
	 */
	public void setConfig(ConnectorConfig config) {
		this.config = config;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.EndPointModeler#getConfig()
	 */
	public ConnectorConfig getConfig() {
		return config;
	}
}

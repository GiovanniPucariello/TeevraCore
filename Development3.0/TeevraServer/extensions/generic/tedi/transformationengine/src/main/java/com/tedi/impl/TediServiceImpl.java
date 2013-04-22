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
 * $Id: TediServiceImpl.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Feb 11, 20111 
 */

package com.tedi.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.tedi.TediService;
import com.tedi.beans.TransformResult;
import com.tedi.engine.TediBlackBox;

/**
 * Invoked TEDI engine.
 */
public class TediServiceImpl extends GenericMediationService implements
		TediService {

	private final static String MAP = "mapFile";
	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(TediServiceImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public void process(MessageExchange exchange, ServiceConfig serviceConfig)
			throws FusionException {
		ErrorHandler errorHandler = serviceConfig.getErrorHandler();
		String inputMessage = (String) exchange.getIn().getBody();
		String errorString = " For Process '" + serviceConfig.getProcessId()
				+ "', Service '" + serviceConfig.getServiceId()
				+ "', Message= " + inputMessage;

		TransformResult result;
		if (logger.isDebugEnabled()) {
			logger.debug("TEDI Service starting to process message.");
		}

		String mapConfig = (String) serviceConfig.getProperty(MAP);
		if (mapConfig == null) {

			// Bugchase 234 ErrorMonitoring # Invalid map file name entry
			logger.error("Invalid Map file name entry." + errorString);
			super
					.handleError(
							errorHandler,
							serviceConfig.getProcessId(),
							serviceConfig.getServiceId(),
							ERROR_TYPE_SYSTEM,
							serviceConfig.getServiceType(),
							new FusionException("Invalid Map file name entry."),
							inputMessage, null,true);
		}
		// read the input message from exchange.
		if (exchange != null && exchange.getIn() != null
				&& exchange.getIn().getBody() != null) {
			try {
				NormalizedMessage normalizedMessage = exchange.getIn();
				String messageBody = (String) normalizedMessage.getBody();
				result = TediBlackBox.doTransformToBean(mapConfig, messageBody);
				normalizedMessage.setBody(result.getPayload());

				Object camelFileNameHeader = normalizedMessage
						.getHeader("CamelFileName");
				Object fileNameHeader = normalizedMessage
						.getHeader("org.apache.camel.file.name");

				if (camelFileNameHeader != null) {
					normalizedMessage.setHeader("CamelFileName", null);
				}

				if (fileNameHeader != null) {
					normalizedMessage.setHeader("org.apache.camel.file.name",
							null);
				}
			} catch (Exception e) {
				// Bugchase 234 ErrorMonitoring # Error Processing the message
				logger.error("Error while message transformation." + errorString, e);
				super.handleError(errorHandler, serviceConfig.getProcessId(),
						serviceConfig.getServiceId(), ERROR_TYPE_SYSTEM,
						serviceConfig.getServiceType(), e, inputMessage, null);

			}

		} else {
			// Bugchase 234 ErrorMonitoring # if invalid input message is
			// passed
			logger.error("Invalid input message." + errorString);
			super.handleError(errorHandler, serviceConfig.getProcessId(),
					serviceConfig.getServiceId(), ERROR_TYPE_BUSINESS,
					serviceConfig.getServiceType(), new FusionException(
							"Invalid input message."), inputMessage, null);

		}
	}

	@Override
	public void init() {
	}
}

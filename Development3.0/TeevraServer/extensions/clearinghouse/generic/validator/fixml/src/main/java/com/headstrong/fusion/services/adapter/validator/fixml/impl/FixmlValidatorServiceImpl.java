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
 * $Id: FixmlValidatorServiceImpl.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 22, 2009 
 */

package com.headstrong.fusion.services.adapter.validator.fixml.impl;

import org.fixprotocol.fixml_5_0.FIXML;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.adapter.validator.fixml.FixmlValidatorService;
import com.headstrong.fusion.services.adapter.validator.fixml.config.FixmlValidatorConfigCache;
import com.headstrong.fusion.services.validator.exception.ValidationException;
import com.headstrong.fusion.services.validator.impl.Validator;
import com.headstrong.fusion.services.validator.serviceconfig.ValidatorServiceConfig;

/**
 * Fixml Validation service implementation.
 */
public class FixmlValidatorServiceImpl extends GenericMediationService
		implements FixmlValidatorService {

	private static Logger logger = LoggerFactory
			.getLogger(FixmlValidatorServiceImpl.class);
	private Validator validator;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.commons.MediationService#process(com.headstrong
	 * .fusion.commons.MessageExchange,
	 * com.headstrong.fusion.commons.ServiceConfig)
	 */
	@Override
	public void process(MessageExchange exchange, ServiceConfig serviceConfig)
			throws FusionException, InvalidAttributeExpressionException {
		ErrorHandler errorHandler = serviceConfig.getErrorHandler();
		Object incomingBody = exchange.getIn().getBody();
		// retrieve the message
		if (!(incomingBody instanceof JavaBusinessObject)) {
			// BugChase 234 ErrorMonitoring #thrown if input message is not
			// JavaBO
			logger.error("message type "
					+ exchange.getIn().getBody().getClass()
					+ " not supported by FIXML validator." + " For Process '"
					+ serviceConfig.getProcessId() + "', Service '"
					+ serviceConfig.getServiceId() + "', Message "
					+ incomingBody);
			super.handleError(errorHandler, serviceConfig.getProcessId(),
					serviceConfig.getServiceId(), ERROR_TYPE_BUSINESS,
					serviceConfig.getServiceType(), new FusionException(
							"message type "
									+ exchange.getIn().getBody().getClass()
									+ " not supported by FIXML validator."),
					exchange.getIn().getBody(), null);
		}

		// incoming fixml message object.
		JavaBusinessObject incomingMessage = (JavaBusinessObject) incomingBody;

		// BugChase 234 ErrorMonitoring #Added for logging
		String errorString = " For Process '" + serviceConfig.getProcessId()
				+ "', Service '" + serviceConfig.getServiceId() + "', Message "
				+ incomingMessage.toXml();

		// validation configuration for the fixml message.
		String validatorConfigKey = ((FIXML) incomingMessage.getObject())
				.getMessage().getDeclaredType().getSimpleName();
		ValidatorServiceConfig validatorServiceConfig = FixmlValidatorConfigCache
				.getValidatorServiceConfig(validatorConfigKey);
		if (validatorServiceConfig == null) {
			// FIXME
			logger.info("No validator configured for validator config key "
					+ validatorConfigKey);
		} else {
			// continue with the validation.
			try {
				if (this.getValidator() == null) {
					// BugChase 234 ErrorMonitoring # thrown when validator not
					// initialized
					logger.error("Validator not initialized" + errorString);
					super.handleError(errorHandler, serviceConfig
							.getProcessId(), serviceConfig.getServiceId(),
							ERROR_TYPE_SYSTEM, serviceConfig.getServiceType(),
							new FusionException(
									"validator not initialized properly."),
							incomingMessage, null);
				} else {
					this.getValidator().validate(exchange.getIn().getHeaders(),
							incomingMessage, validatorServiceConfig);
				}
			} catch (ValidationException e) {
				// set the message to Null in the exchange
				// BugChase 234 ErrorMonitoring # Error while validating input
				// Business Object
				logger.error("Error while validating input Business Object"
						+ errorString, e);
				super.handleError(errorHandler, serviceConfig.getProcessId(),
						serviceConfig.getServiceId(), ERROR_TYPE_BUSINESS,
						serviceConfig.getServiceType(), e, incomingMessage,
						null, false);
			}
		}
	}

	/**
	 * @return the validator
	 */
	public Validator getValidator() {
		return validator;
	}

	/**
	 * @param validator
	 *            the validator to set
	 */
	public void setValidator(Validator validator) {
		this.validator = validator;
	}
}

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
 * $Id: GenericProcessor.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 12, 2008 
 */

package com.headstrong.fusion.core.commons;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.MediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorContext;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.HandledException;
import com.headstrong.fusion.commons.resolver.exception.ServiceUnavailableException;
import com.headstrong.fusion.core.ProcessContext;
import com.headstrong.fusion.core.commons.adapter.camel.ExchangeAdapter;

/**
 * Default processor that implements {@link Processor}. All mediation service
 * would be wrapped around this processor.
 * 
 */

public class GenericProcessor implements Processor {

	private static Logger logger = LoggerFactory
			.getLogger(GenericProcessor.class);

	private static final String WAIT_TIME = "waitTime";
	/**
	 * {@link GenericProcessor} delegates the call to
	 * {@link MediationService#process(com.headstrong.fusion.commons.Exchange)}
	 * for message mediation.
	 */
	private ProcessContext processContext;

	/**
	 * Service Configuration to be passed to the mediation services.
	 */
	private ServiceConfig serviceConfig;

	/**
	 * Time to wait for the service before exiting.
	 */
	private long timeToWait = 0;

	/**
	 * Validates the message exchange
	 */
	private MessageExchangeValidator messageExchangeValidator;

	/**
	 * @param service
	 *            MediationService
	 * @param serviceConfig
	 *            Configuration properties for the {@link MediationService}
	 */
	public GenericProcessor(ProcessContext processContext,
			ServiceConfig serviceConfig) {
		this.processContext = processContext;
		this.serviceConfig = serviceConfig;
		String waitTime = (String) this.getServiceConfig().getProperty(
				WAIT_TIME);
		if (waitTime != null) {
			this.timeToWait = Long.parseLong(waitTime);
		}
		this.messageExchangeValidator = new DefaultExchangeValidator();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	/**
	 * No error handling at generic process level as same is being handled at
	 * service level. And once the handling is done to stop the processing
	 * handler throws HandledException to mark that the further processing
	 * should be stopped.
	 */
	public void process(Exchange exchange) throws Exception {
		// Generate Fusion Exchange
		MessageExchange messageExchange = null;
		// check the exchange
		if (exchange instanceof ExchangeAdapter) {
			messageExchange = ((ExchangeAdapter) exchange).getMessageExchange();
		} else {
			messageExchange = new CamelMessageExchange(exchange);
		}
		
		MediationService mediationService = null;
		// Delegate the call to Mediation LifeCycle.
		try {
			// initialize the context.
			if (this.getServiceConfig().getErrorHandler() != null) {
				this.getServiceConfig().getErrorHandler().initContext(
						messageExchange);
			}
			String serviceType = this.getServiceConfig().getServiceType();
			// Default time would be used by the ServiceResolver.
			// in case property is not specified.
			mediationService = this.processContext.getApplicationContext()
					.getMediationService(serviceType, timeToWait);
			if (this.getExchangeValidator().isValid(messageExchange)) {
				mediationService.process(messageExchange, this
						.getServiceConfig());
			} else {
				throw new HandledException(
						"Invalid message exchange abandoing the exchange");
			}
		} catch (ServiceUnavailableException e) {
			logger.error("Service " + this.getServiceConfig().getServiceType()
					+ " is currently unavailable.");
			// If service is unavailable stop the process.
			processContext.getApplicationContext().stopProcess(
					this.getServiceConfig().getProcessId());
			throw e;
		} catch (HandledException ex) {
			// Exception thrown by Handler to stop the processing of the message
			// should not be handled by the
			// generic processor.
			// Ignore.
			logger.error("Error processing the message exchange.", ex);
			throw ex;
		} catch (Exception e) {
			logger.error("Error while processing message [" + exchange.getIn()
					+ "] " + " in service "
					+ this.getServiceConfig().getServiceType() + ".", e);
			// For other exception which are not caught the services and
			// directly thrown.
			// e.g. RunTimeException will be handled by the processor.
			ServiceConfig config = this.getServiceConfig();
			ErrorContext errorContext = new ErrorContext();

			errorContext.setProcessId(config.getProcessId());
			errorContext.setServiceId(config.getServiceId());
			errorContext.setType(FusionConstants.ERROR_TYPE_SYSTEM);
			errorContext.setComponentType(config.getServiceType());
			errorContext.setTimestamp(new Date());
			errorContext.setCause(e);
			errorContext.setResource(exchange.getIn().getBody());

			ErrorHandler errorHandler = config.getErrorHandler();
			if (errorHandler != null) {
				errorHandler.reportError(errorContext, true, true);
			}
			throw e;
		} finally {
			// Reset the Error Context.
			if (this.getServiceConfig().getErrorHandler() != null) {
				this.getServiceConfig().getErrorHandler().resetContext();
			}
		}
	}

	/**
	 * @return the serviceConfig
	 */
	public ServiceConfig getServiceConfig() {
		return serviceConfig;
	}

	/**
	 * @param serviceConfig
	 *            the serviceConfig to set
	 */
	public void setServiceConfig(ServiceConfig serviceConfig) {
		this.serviceConfig = serviceConfig;
	}

	/**
	 * @return the messageExchangeValidator
	 */
	public MessageExchangeValidator getExchangeValidator() {
		return messageExchangeValidator;
	}

	/**
	 * @param messageExchangeValidator
	 *            the messageExchangeValidator to set
	 */
	public void setExchangeValidator(
			MessageExchangeValidator messageExchangeValidator) {
		this.messageExchangeValidator = messageExchangeValidator;
	}
}

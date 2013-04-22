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
 * $Id: TemplateFormatterServiceImpl.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 24, 2008 
 */

package com.headstrong.fusion.services.message.formatter.template.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.velocity.Template;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.RuntimeSingleton;
import org.apache.velocity.runtime.resource.loader.StringResourceLoader;
import org.apache.velocity.runtime.resource.util.StringResourceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.config.ServiceConfigurationCache;
import com.headstrong.fusion.services.config.exception.ServiceConfigurationNotFoundException;
import com.headstrong.fusion.services.config.parse.ServiceConfigurationParserRegistry;
import com.headstrong.fusion.services.config.vo.ServiceConfiguration;
import com.headstrong.fusion.services.message.commons.config.exception.InvalidConfigurationException;
import com.headstrong.fusion.services.message.formatter.template.TemplateFormatterService;
import com.headstrong.fusion.services.message.formatter.template.serviceconfig.TemplateServiceConfigParser;

/**
 * Template Formatter service. This is based on Apache Velocity.
 * 
 */
public class TemplateFormatterServiceImpl extends GenericMediationService
		implements TemplateFormatterService {

	private static final Logger logger = LoggerFactory
			.getLogger(TemplateFormatterServiceImpl.class);

	private ServiceConfigurationCache serviceConfigCache = ServiceConfigurationCache
			.getInstance();
	private StringResourceRepository vsRepository;

	private TemplateFormatter formatter = new TemplateFormatter();

	@Override
	public void init() {
		super.init();
		// Register service configuration parsers.
		ServiceConfigurationParserRegistry configurationParserRegistry = ServiceConfigurationParserRegistry
				.getInstance();
		configurationParserRegistry.registerServiceConfigurationParser(
				TemplateFormatterService.class.getSimpleName(),
				OBJECT_MAPPING_ID, TemplateServiceConfigParser.class
						.getSimpleName());

	}

	public TemplateFormatterServiceImpl() throws Exception {
		Velocity.setProperty(Velocity.RESOURCE_LOADER, "string");
		Velocity.addProperty("string.resource.loader.class",
				StringResourceLoader.class.getName());
		Velocity.addProperty(
				"string.resource.loader.modificationCheckInterval", "1");
		Velocity.init();
		vsRepository = StringResourceLoader.getRepository();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.commons.MediationService#process(com.headstrong
	 * .fusion.commons.MessageExchange,
	 * com.headstrong.fusion.commons.ServiceConfig)
	 */
	@SuppressWarnings("unchecked")
	public void process(MessageExchange exchange, ServiceConfig config)
			throws FusionException, InvalidAttributeExpressionException {
		// Input payload
		ErrorHandler errorHandler = config.getErrorHandler();
		Object inputMessage = exchange.getIn().getBody();
		Object outputMessage = null;
		// BugChase 234 ErrorMonitoring # Used for logging message.
		String errorString = " For Process '"
				+ config.getProcessId()
				+ "', Service '"
				+ config.getServiceId()
				+ "', Message= "
				+ ((inputMessage instanceof BusinessObject) ? ((BusinessObject) inputMessage)
						.toXml()
						: inputMessage);

		if (inputMessage != null) {
			// Read the Mapping.
			String mappingId = (String) config.getProperty(OBJECT_MAPPING_ID);
			if (mappingId == null) {
				// BugChase 234 ErrorMonitoring # Added LOG
				InvalidConfigurationException iex = new InvalidConfigurationException(
						"Field Mapping definition identifier not specified.");
				logger.error(
						"Field Mapping definition identifier not specified."
								+ errorString, iex);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), iex, null, null);
			}

			// Read the service configuration
			ServiceConfiguration serviceConfiguration = new ServiceConfiguration();
			serviceConfiguration.setProcessId(config.getProcessId());
			serviceConfiguration.setServiceId(config.getServiceId());
			serviceConfiguration.setPropertyId(mappingId);

			String templateName = serviceConfiguration.getProcessId() + "."
					+ serviceConfiguration.getPropertyId() + "."
					+ serviceConfiguration.getServiceId();

			synchronized (this) {
				// FIXME check actual resource loading in apache velocity.
				// HACK .. Needs further verification.
				/*
				 * if (vsRepository.getStringResource(templateName) == null) {
				 */String template = null;
				try {
					template = (String) serviceConfigCache
							.getPropertyConfiguration(serviceConfiguration);
					if (logger.isDebugEnabled()) {
						logger.debug("Template : " + template);
					}
				} catch (ServiceConfigurationNotFoundException e) {
					// BugChase 234 ErrorMonitoring # Modified LOG
					logger.error(
							"No configuration found for the service configuration id provided."
									+ errorString, e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e, serviceConfiguration,
							null);
				}
				// HACK
				// since serviceConfigCache can be updated by
				// the Admin UI. even if the vsRepository is
				vsRepository.putStringResource(templateName, template);
				/*
				 * }
				 */}
			Template template = null;
			try {
				template = RuntimeSingleton.getTemplate(templateName);
			} catch (ResourceNotFoundException e1) {
				// BugChase 234 ErrorMonitoring # Modified LOG
				logger.error("Error getting the template." + errorString, e1);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e1, templateName, null);
			} catch (ParseErrorException e1) {
				// BugChase 234 ErrorMonitoring # Modified LOG
				logger.error("Error getting the template." + errorString, e1);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e1, templateName, null);
			} catch (Exception e1) {
				// BugChase 234 ErrorMonitoring # Modified LOG
				logger.error("Error getting the template." + errorString, e1);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e1, templateName, null);
			}

			try {
				if (inputMessage instanceof BusinessObject) {
					outputMessage = formatter.format(exchange.getIn()
							.getHeaders(), inputMessage, template);
				} else {
					StringBuilder formatBuffer = new StringBuilder();
					Map<String, Object> headers = exchange.getIn().getHeaders();
					for (BusinessObject message : (List<BusinessObject>) inputMessage) {
						formatBuffer.append(formatter.format(headers, message,
								template));
						formatBuffer.append(System
								.getProperty("line.separator"));
					}
					outputMessage = formatBuffer.toString();
				}
			} catch (ResourceNotFoundException e) {
				// BugChase 234 ErrorMonitoring # Modified LOG
				logger.error("Error Formatting the message." + errorString, e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e, inputMessage, null);
			} catch (ParseErrorException e) {
				// BugChase 234 ErrorMonitoring # Modified LOG
				logger.error("Error Formatting the message." + errorString, e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e, inputMessage, null);
			} catch (MethodInvocationException e) {
				// BugChase 234 ErrorMonitoring # Modified LOG
				logger.error("Error Formatting the message" + errorString, e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e, inputMessage, null);
			} catch (IOException e) {
				// BugChase 234 ErrorMonitoring # Modified LOG
				logger.error("Error Formatting the message." + errorString, e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e, inputMessage, null);
			}
			exchange.getIn().setBody(outputMessage);
		} else {
			// Ignoring the Error.
			logger.error("Empty message payload. For process "
					+ config.getProcessId() + " service "
					+ config.getServiceId());
		}
	}
}

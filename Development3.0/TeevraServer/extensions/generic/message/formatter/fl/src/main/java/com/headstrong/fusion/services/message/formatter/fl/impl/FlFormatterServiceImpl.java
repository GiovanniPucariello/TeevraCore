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
 * $Id: FlFormatterServiceImpl.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 26, 2008 
 */

package com.headstrong.fusion.services.message.formatter.fl.impl;

import static com.headstrong.fusion.services.message.commons.util.MessageServiceUtil.getSchemaDescriptor;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.DataFormattingException;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.config.parse.ServiceConfigurationParserRegistry;
import com.headstrong.fusion.services.message.commons.config.exception.InvalidConfigurationException;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlBinding;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlConfigParser;
import com.headstrong.fusion.services.message.formatter.fl.FlFormatterService;

/**
 * Fixed Length Message Formatter Service.
 */
public class FlFormatterServiceImpl extends GenericMediationService implements
		FlFormatterService {

	private static final Logger logger = LoggerFactory
			.getLogger(FlFormatterServiceImpl.class);

	/**
	 * Formats the incoming Business object into a Fixed-Length message based on
	 * the configuration.
	 */
	private FlFormatter formatter = new FlFormatter();

	@Override
	public void init() {
		super.init();
		// Register service configuration parsers.
		ServiceConfigurationParserRegistry configurationParserRegistry = ServiceConfigurationParserRegistry
				.getInstance();
		configurationParserRegistry.registerServiceConfigurationParser(
				FlFormatterService.class.getSimpleName(), OBJECT_MAPPING_ID,
				FlConfigParser.class.getSimpleName());
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
		ErrorHandler errorHandler = config.getErrorHandler();
		// Bugchase 234 ErrorMonitoring # Used for logging message.
		String errorString = " For Process '" + config.getProcessId()
				+ "', Service '" + config.getServiceId() + "', Message= ";
		// Input message
		Object inputMessage = exchange.getIn().getBody();
		Object outputMessage = null;

		if (inputMessage != null) {
			SchemaDescriptor<FlBinding> schemaDescriptor = null;
			try {
				schemaDescriptor = (SchemaDescriptor<FlBinding>) getSchemaDescriptor(config);
			} catch (InvalidConfigurationException e1) {
				// Bugchase 234 ErrorMonitoring # Exception is thrown if schema
				// descriptor is
				// not specified for process.
				logger
						.error(
								"SchemaDescriptor details not found."
										+ errorString
										+ (inputMessage instanceof BusinessObject ? ((BusinessObject) inputMessage)
												.toXml()
												: inputMessage.toString()), e1);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e1, inputMessage,
						"schema descriptor error", false);

			}

			if (inputMessage instanceof BusinessObject) {
				try {
					outputMessage = formatter.format(
							(BusinessObject) inputMessage, schemaDescriptor);
				} catch (DataFormattingException e) {
					// Bugchase 234 ErrorMonitoring # Exception is thrown if
					// digits in field
					// exceeds field size
					logger.error("Error digits in field exceeds field size."
							+ errorString
							+ ((BusinessObject) inputMessage).toXml(), e);

					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_BUSINESS, config
									.getServiceType(), e, inputMessage,
							"Digit in field exceeds field size", false);

				} catch (AttributeNotFoundException e) {
					// Bugchase 234 ErrorMonitoring # Attribute not Found
					logger.error("Attribute not found in BusinessObject."
							+ errorString
							+ ((BusinessObject) inputMessage).toXml(), e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e, inputMessage,
							"Attribute not found in BusinessObject", false);
				}
			} else {
				// assumption : message either is a DefaultBusinessObject or a
				// list of DefaultBusinessObject
				// TODO :: confirm the assumption
				StringBuilder formatBuffer = new StringBuilder();
				String formatString = null;

				for (BusinessObject message : (List<BusinessObject>) inputMessage) {
					try {
						formatBuffer.append(formatter.format(message,
								schemaDescriptor));
					}
					// Bugchase 234 ErrorMonitoring # Exception is thrown if
					// number size in
					// record is greater than field size
					catch (DataFormattingException e) {
						logger.error("Error digits in record field exceeds field size."
								+ errorString
								+ ((BusinessObject) message).toXml(), e);
						super.handleError(errorHandler, config.getProcessId(),
								config.getServiceId(), ERROR_TYPE_BUSINESS,
								config.getServiceType(), e, inputMessage,
								"Digits in record field exceeds field size",
								false);
					} catch (AttributeNotFoundException e) {
						// Bugchase 234 ErrorMonitoring # Attribute not Found
						logger.error("Attribute not found in BusinessObject."
								+ errorString
								+ ((BusinessObject) message).toXml(), e);
						super.handleError(errorHandler, config.getProcessId(),
								config.getServiceId(), ERROR_TYPE_SYSTEM,
								config.getServiceType(), e, inputMessage,
								"Attribute not found in BusinessObject", false);
					}
					formatBuffer.append(FusionConstants.NEW_LINE);
				}
				formatString = formatBuffer.toString();
				if (formatString != null
						&& formatString.endsWith(FusionConstants.NEW_LINE)) {
					formatString = formatString.substring(0, formatString
							.length() - 1);
				}
				outputMessage = formatString;
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

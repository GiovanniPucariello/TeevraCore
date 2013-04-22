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
 * $Id: DbFormatterServiceImpl.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 13, 2008 
 */

package com.headstrong.fusion.services.message.formatter.db.impl;

import static com.headstrong.fusion.services.message.commons.util.MessageServiceUtil.getSchemaDescriptor;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.config.parse.ServiceConfigurationParserRegistry;
import com.headstrong.fusion.services.message.commons.config.exception.InvalidConfigurationException;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.db.DbFieldIndexBindConfigParser;
import com.headstrong.fusion.services.message.commons.config.parser.db.DbFieldIndexBinding;
import com.headstrong.fusion.services.message.formatter.db.DbFormatterService;

/**
 * Database formatter service
 */
public class DbFormatterServiceImpl extends GenericMediationService implements
		DbFormatterService {

	private static final Logger logger = LoggerFactory
			.getLogger(DbFormatterServiceImpl.class);
	/**
	 * Default DB message parser.
	 * 
	 */
	private static DbFormatter formatter = new DbFormatter();
	
	/**
	 * property key of Root.
	 */
	public static final String ROOT = "root"; 

	@Override
	public void init() {
		super.init();
		// Register service configuration parsers.
		ServiceConfigurationParserRegistry configurationParserRegistry = ServiceConfigurationParserRegistry
				.getInstance();
		configurationParserRegistry.registerServiceConfigurationParser(
				DbFormatterService.class.getSimpleName(), OBJECT_MAPPING_ID,
				DbFieldIndexBindConfigParser.class.getSimpleName());

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
	/**
	 * @precondition inputMessage instanceof BusinessObject
	 */
	public void process(MessageExchange exchange, ServiceConfig config)
			throws FusionException, InvalidAttributeExpressionException {
		ErrorHandler errorHandler = config.getErrorHandler();
		// Input message
		Object inputMessage = exchange.getIn().getBody();
		// Bugchase 234 ErrorMonitoring # Used For ErrorLogging
		String errorString = " For Process '"
				+ config.getProcessId()
				+ "', Service '"
				+ config.getServiceId()
				+ "', Message= "
				+ ((inputMessage instanceof BusinessObject) ? ((BusinessObject) inputMessage)
						.toXml()
						: inputMessage);

		// check if the parent field is specified.
		String root = (config.getProperty("root") == null )? null : config.getProperty("root").toString();
		if (root != null && !ROOT.equals(root) && inputMessage instanceof BusinessObject) {
			try {
				inputMessage = ((BusinessObject) inputMessage).getValue(root);
			} catch (AttributeNotFoundException e) {
				// Bugchase 234 ErrorMonitoring # Error reading the root value,
				// Attribute not
				// Found
				logger.error("Error reading the root value." + errorString, e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e, inputMessage,
						"Error reading the root value, attribute not found",
						false);

			}

		}
		if (inputMessage != null) {
			Object outputMessage = null;
			SchemaDescriptor<DbFieldIndexBinding> dbSchemaDescriptor = null;
			try {
				dbSchemaDescriptor = (SchemaDescriptor<DbFieldIndexBinding>) getSchemaDescriptor(config);
			} catch (InvalidConfigurationException e1) {
				logger.error("SchemaDescriptor details not found."
						+ errorString, e1);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e1, inputMessage,
						"schema descriptor error", false);
			}

			// Individual Records handling.

			if (inputMessage instanceof BusinessObject) {
				try {
					outputMessage = formatter.format(
							(BusinessObject) inputMessage, dbSchemaDescriptor);
				} catch (AttributeNotFoundException e) {
					// Bugchase 234 ErrorMonitoring # Attribute not Found
					logger.error("Error Attribute not found." + errorString, e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e, inputMessage,
							"Attribute not found", false);
				}
			} else {
				List<BusinessObject> messages = (List<BusinessObject>) inputMessage;
				List<List<Object>> output = new ArrayList<List<Object>>();
				for (BusinessObject message : messages) {
					try {
						output.add(formatter
								.format(message, dbSchemaDescriptor));
					} catch (AttributeNotFoundException e) {
						// Bugchase 234 ErrorMonitoring # Attribute not Found
						logger.error("Error Attribute not found."
								+ " For Process '" + config.getProcessId()
								+ "', Service '" + config.getServiceId()
								+ "', Message= " + message.toXml(), e);
						super.handleError(errorHandler, config.getProcessId(),
								config.getServiceId(), ERROR_TYPE_SYSTEM,
								config.getServiceType(), e, inputMessage,
								"Attribute not found", false);
					}
				}
				outputMessage = output;
			}
			// set the output as expected by DB EndPoint.
			exchange.getIn().setBody(outputMessage);
		} else {
			// Ignoring the Error.
			logger.warn("Empty message payloa. For process "
					+ config.getProcessId() + " service "
					+ config.getServiceId());
		}
	}
}

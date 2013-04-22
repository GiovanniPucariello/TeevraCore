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
 * $Id: DBParserImpl.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Oct 15, 2008 
 */

package com.headstrong.fusion.services.message.parser.db.impl;

import static com.headstrong.fusion.services.message.commons.util.MessageServiceUtil.getObjectDescriptor;
import static com.headstrong.fusion.services.message.commons.util.MessageServiceUtil.getSchemaDescriptor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectFactory.Type;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.config.parse.ServiceConfigurationParserRegistry;
import com.headstrong.fusion.services.message.commons.config.exception.InvalidConfigurationException;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.db.DbFieldBindConfigParser;
import com.headstrong.fusion.services.message.commons.config.parser.db.DbFieldBinding;
import com.headstrong.fusion.services.message.parser.db.DBParserService;

/**
 * Database Record parser service. Database record should be in the following
 * format. {@link Map<String,Object>}.
 * 
 */
public class DBParserServiceImpl extends GenericMediationService implements
		DBParserService {

	private static final Logger logger = LoggerFactory
			.getLogger(DBParserServiceImpl.class);
	/**
	 * Default DB message parser.
	 * 
	 */
	private static DbParser parser = new DbParser();

	@Override
	/**
	 * Registers property parser for schemaDescriptor configuration.
	 * Initialization is done in the Activator.
	 */
	public void init() {
		super.init();
		// Register service configuration parsers.
		ServiceConfigurationParserRegistry configurationParserRegistry = ServiceConfigurationParserRegistry
				.getInstance();
		configurationParserRegistry.registerServiceConfigurationParser(
				DBParserService.class.getSimpleName(), OBJECT_MAPPING_ID,
				DbFieldBindConfigParser.class.getSimpleName());
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
	 * @precondition exchange.getIn().getBody() instanceof List<Map<String,Object>> ||
	 *               exchange.getIn().getBody() instanceof Map<String,Object> ||
	 * @postcondition exchange.getIn().getBody() instanceof List<DefaultBusinessObject> ||
	 *                exchange.getIn().getBody() instanceof
	 *                DefaultBusinessObject
	 */
	public void process(MessageExchange exchange, ServiceConfig config)
			throws FusionException {
		ErrorHandler errorHandler = config.getErrorHandler();
		// Input pay load.
		Object input = (List) exchange.getIn().getBody();
		String errorString = " For Process '" + config.getProcessId()
				+ "', Service '" + config.getServiceId() + "', Message= ";
		Type type = Type.Default;
		if (input != null) {
			// check the object type to be created
			String boType = (String) config.getProperty(SCHEMA_TYPE);
			if (boType != null) {
				type = Type.valueOf(boType);
			}
			ObjectDescriptor objectDescriptor = null;
			if (type == Type.Default) {
				try {
					objectDescriptor = getObjectDescriptor(config);
				} catch (InvalidConfigurationException e1) {
					// Bugchase 234 ErrorMonitoring # Exception is thrown if
					// Object
					// descriptor is
					// not specified for process.
					logger.error("ObjectDescriptor details not found."
							+ errorString + input, e1);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e1, input,
							"Object descriptor error", false);
				}
			}
			SchemaDescriptor<DbFieldBinding> dbSchemaDescriptor = null;
			try {
				dbSchemaDescriptor = (SchemaDescriptor<DbFieldBinding>) getSchemaDescriptor(config);
			} catch (InvalidConfigurationException e1) {
				// Bugchase 234 ErrorMonitoring # Exception is thrown if schema
				// descriptor is
				// not specified for process.
				logger.error("SchemaDescriptor details not found." + errorString
						+ input, e1);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e1, input,
						"Schema descriptor error", false);
			}

			Object output = null;
			if (input instanceof List) {
				List<BusinessObject> businessObjects = new ArrayList<BusinessObject>();
				for (Map<String, Object> message : (List<Map<String, Object>>) input) {
					try {
						businessObjects.add(parser.parse(type,
								objectDescriptor, dbSchemaDescriptor, message));
					} catch (Exception e) {
						// Bugchase 234 ErrorMonitoring # Exception is thrown
						// when value in
						// record cannot be converted to type mentioned in
						// schema.
						logger.error(
								"Unsupported or datatype mismatch error while parsing the record."
										+ errorString + message, e);
						super.handleError(errorHandler, config.getProcessId(),
								config.getServiceId(), ERROR_TYPE_BUSINESS,
								config.getServiceType(), e, message,
								"Unsupported data in record,datatype mismatch",
								false);
					}
				}
				output = businessObjects;
			} else {
				try {
					output = parser.parse(type, objectDescriptor,
							dbSchemaDescriptor, (Map<String, Object>) input);
				} catch (Exception e) {
					// Bugchase 234 ErrorMonitoring # Exception is thrown when
					// value in
					// record cannot be converted to type mentioned in
					// schema.
					logger.error(
							"Unsupported or datatype mismatch error while parsing the record."
									+ errorString + input, e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_BUSINESS, config
									.getServiceType(), e, input,
							"Unsupported data in record,datatype mismatch",
							false);
				}
			}
			// set the output
			exchange.getIn().setBody(output);
		} else {
			logger.info("Empty message payload. For process "
					+ config.getProcessId() + " service "
					+ config.getServiceId());
			throw new FusionException("Message payload is empty");

		}
	}

}

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
 * $Id: XMLParserImpl.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 17, 2008 
 */

package com.headstrong.fusion.services.message.parser.xml.impl;

import static com.headstrong.fusion.services.message.commons.util.MessageServiceUtil.getObjectDescriptor;
import static com.headstrong.fusion.services.message.commons.util.MessageServiceUtil.getSchemaDescriptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.config.parse.ServiceConfigurationParserRegistry;
import com.headstrong.fusion.services.message.commons.config.exception.InvalidConfigurationException;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.xml.XPathBinding;
import com.headstrong.fusion.services.message.commons.config.parser.xml.XmlBindConfigParser;
import com.headstrong.fusion.services.message.parser.xml.XmlParserService;

/**
 * 
 */
public class XmlParserServiceImpl extends GenericMediationService implements
		XmlParserService {

	private static Logger logger = LoggerFactory
			.getLogger(XmlParserServiceImpl.class);
	/**
	 * Default XML message parser.
	 * 
	 */
	private XmlMessageParser xmlParser = new DefaultXmlMessageParser();

	@Override
	public void init() {
		super.init();
		// Register service configuration parsers.
		ServiceConfigurationParserRegistry configurationParserRegistry = ServiceConfigurationParserRegistry
				.getInstance();
		configurationParserRegistry.registerServiceConfigurationParser(
				XmlParserService.class.getSimpleName(), OBJECT_MAPPING_ID,
				XmlBindConfigParser.class.getSimpleName());
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
			throws FusionException {
		ErrorHandler errorHandler = config.getErrorHandler();
		// Input payload
		String inputMessage = (String) exchange.getIn().getBody();
		// Bugchase 234 ErrorMonitoring # Used for logging message.
		String errorString = " For Process '" + config.getProcessId()
				+ "', Service '" + config.getServiceId() + "', Message= "
				+ inputMessage;
		if (inputMessage != null) {
			// Information required to generate the DefaultBusinessObject
			ObjectDescriptor objectDescriptor = null;
			try {
				objectDescriptor = getObjectDescriptor(config);
			} catch (InvalidConfigurationException e1) {
				// Bugchase 234 ErrorMonitoring # Exception is thrown if
				// there is no ObjectDescriptor for selected schema.
				logger.error("ObjectSchemaDescriptor not specified."
						+ errorString, e1);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e1, inputMessage,
						"object descriptor error", false);
			}
			SchemaDescriptor<XPathBinding> schemaDescriptor = null;
			try {
				schemaDescriptor = (SchemaDescriptor<XPathBinding>) getSchemaDescriptor(config);
			} catch (InvalidConfigurationException e1) {
				// Bugchase 234 ErrorMonitoring # Exception is thrown if schema
				// descriptor is
				// not specified for process.
				logger.error(
						"SchemaDescriptor details not found." + errorString, e1);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e1, inputMessage,
						"schema descriptor error", false);
			}
			// Business Object . Create the Business Object
			DefaultBusinessObject outputMessage = new DefaultBusinessObject();
			outputMessage.setObjectDescriptor(objectDescriptor);
			try {
				xmlParser.parse(outputMessage, schemaDescriptor, inputMessage);
				exchange.getIn().setBody(outputMessage);
			} catch (Exception e) {
				// Bugchase 234 ErrorMonitoring # Error while parsing the input
				// XML cause
				// of error can be invalid xml or invalid xpath expression or
				// datatype of value is not supported.
				logger.error("Error while parsing the message." + errorString,
						e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_BUSINESS, config
						.getServiceType(), e, inputMessage,
						"Error while parsing input message", false);
			}
		} else {
			// Ignoring the Error.
			logger.error("Empty message payload for process "
					+ config.getProcessId() + " service "
					+ config.getServiceId());
		}
	}

}

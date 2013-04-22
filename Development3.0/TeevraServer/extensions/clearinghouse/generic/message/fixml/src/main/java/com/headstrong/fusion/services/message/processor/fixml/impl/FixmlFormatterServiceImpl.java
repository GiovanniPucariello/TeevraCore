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
 * $Id: FixmlParserServiceImpl.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: May 26, 2009 
 */

package com.headstrong.fusion.services.message.processor.fixml.impl;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.java.FixmlContext;
import com.headstrong.fusion.bo.java.FixmlContextFactory;
import com.headstrong.fusion.bo.java.FixmlNamespace;
import com.headstrong.fusion.bo.java.JavaBusinessObject;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.message.processor.fixml.FixmlFormatterService;

/**
 * Assumes the given message in the exchange as FIXML Java business object and
 * marshals the same into XML using JAXB
 */
public class FixmlFormatterServiceImpl extends GenericMediationService
		implements FixmlFormatterService {

	private static Logger logger = LoggerFactory
			.getLogger(FixmlFormatterServiceImpl.class);

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
		Object message = exchange.getIn().getBody();
		if (message == null) {
			// Ignoring the empty message
			logger.error("Empty message payload for process "
					+ config.getProcessId() + " service "
					+ config.getServiceId());
			return;
		}
		logger.debug("Message Received by the Fixml Formatter : " + message);
		Object fixmlMessage = null;

		// It is assumed here that if a splitter is connected before fixml
		// formatter, it would provide a list with single JavaBO, if the batch
		// size is configured to be 1
		if (message instanceof List) {
			logger.debug("Message is an instance of List ");
			if ((((List) message).size() != 0)) {
				Object javabo = (Object) ((List) message).get(0);
				if (javabo instanceof JavaBusinessObject) {
					logger
							.debug("Message in the list is an instance of JavaBusinessObject");
					fixmlMessage = ((JavaBusinessObject) javabo).getObject();
				}

			} else {
				// throw an error as invalid message is passed to this component

				// Bugchase 234 ErrorMonitoring # Exception is thrown if message
				// passed is an instance of list with zero size
				logger
						.error("Message passed is an instance of list with zero size"
								+ " For Process '"
								+ config.getProcessId()
								+ "', Service '"
								+ config.getServiceId()
								+ "', Message= " + message);
				super
						.handleError(
								errorHandler,
								config.getProcessId(),
								config.getServiceId(),
								ERROR_TYPE_BUSINESS,
								config.getServiceType(),
								new FusionException(
										"Message passed is an instance of list with zero size"),
								message, null);
				return;
			}
		}
		if (message instanceof JavaBusinessObject) {
			logger.debug("Message is an instance of JavaBusinessObject");
			fixmlMessage = ((JavaBusinessObject) message).getObject();
		}

		if (fixmlMessage == null) {
			// throw an error as invalid message is passed to this component
			// Bugchase 234 ErrorMonitoring # Invalid message passed to this component
			logger.error("Invalid message passed to this component"
					+ " For Process '" + config.getProcessId() + "', Service '"
					+ config.getServiceId() + "', Message= "
					+ message);
			super.handleError(errorHandler, config.getProcessId(), config
					.getServiceId(), ERROR_TYPE_BUSINESS, config
					.getServiceType(), new FusionException(
					"Invalid message passed to this component"), message, null);
			return;
		}

		// Marshal the fixml message to create the required XML string
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {
			// get the fixml marshaller.
			// get the namespace from the config.
			Object ns = config.getProperty(FIXML_SCHEMA);
			String namespace = ns == null ? DEFAULT_SCHEMA : ns.toString();
			FixmlContext context = FixmlContextFactory
					.getFixmlContext(FixmlNamespace.valueOf(namespace));

			Marshaller marshaller = context.getMarshaller();

			Boolean nsReqrd = Boolean.valueOf(config.getProperty(
					NAMESPACE_REQD, "TRUE").toString());

			synchronized (marshaller) {
				if (!nsReqrd) {
					NamespaceFilter outFilter = new NamespaceFilter(null, false);
					// Create a new org.dom4j.io.XMLWriter that will serve as
					// the ContentHandler for our filter.
					XMLWriter writer = null;
					try {
						writer = new XMLWriter(os);
					} catch (UnsupportedEncodingException e) {
						// Bugchase 234 ErrorMonitoring # Unsupported Encoding exception
						logger.error(
								"Error while creating xml writer while removing namespace"
										+ " For Process '"
										+ config.getProcessId()
										+ "', Service '"
										+ config.getServiceId()
										+ "', Message= "
										+ ((JavaBusinessObject) fixmlMessage)
												.toXml(), e);
						super
								.handleError(errorHandler, config
										.getProcessId(), config.getServiceId(),
										ERROR_TYPE_SYSTEM, config
												.getServiceType(), e, message,
										null, true);
					}
					// Attach the writer to the filter
					outFilter.setContentHandler(writer);
					// marshal the fixml message
					marshaller.marshal(fixmlMessage, outFilter);
				} else {
					// marshal the fixml message
					marshaller.marshal(fixmlMessage, os);
				}
			}

		} catch (JAXBException e) {
			// Bugchase 234 ErrorMonitoring # Error marshalling the given
			// message into FIXML
			logger.error("Error marshalling the given message into FIXML.For Process "
					+ config.getProcessId() + ", service id "
					+ config.getServiceId() + "', Message= "
					+ ((JavaBusinessObject) fixmlMessage).toXml(), e);
			super.handleError(errorHandler, config.getProcessId(), config
					.getServiceId(), ERROR_TYPE_BUSINESS, config
					.getServiceType(), e, message, "Error while Marshalling");
			return;

		}
		exchange.getIn().setBody(os.toString());
	}
}

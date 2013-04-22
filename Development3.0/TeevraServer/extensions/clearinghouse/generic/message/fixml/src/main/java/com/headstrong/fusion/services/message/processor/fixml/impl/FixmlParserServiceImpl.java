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

import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.sax.SAXSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import com.headstrong.fusion.bo.java.FixmlContext;
import com.headstrong.fusion.bo.java.FixmlContextFactory;
import com.headstrong.fusion.bo.java.FixmlMarshaller;
import com.headstrong.fusion.bo.java.FixmlNamespace;
import com.headstrong.fusion.bo.java.JavaBusinessObject;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.message.processor.fixml.FixmlParserService;

/**
 * Parses the given FIXML string to create a FIXML object that is bundled inside
 * a JavaBusinessObject.
 */
public class FixmlParserServiceImpl extends GenericMediationService implements
		FixmlParserService {

	private static Logger logger = LoggerFactory
			.getLogger(FixmlParserServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.commons.MediationService#process(com.headstrong
	 * .fusion.commons.MessageExchange,
	 * com.headstrong.fusion.commons.ServiceConfig)
	 */
	public void process(MessageExchange exchange, ServiceConfig config)
			throws FusionException {
		ErrorHandler errorHandler = config.getErrorHandler();

		/**
		 * Input message payload.
		 */
		String inputMessage = (String) exchange.getIn().getBody();

		// Bugchase 234 ErrorMonitoring # Used for logging message.
		String errorString = " For Process '" + config.getProcessId()
				+ "', Service '" + config.getServiceId() + "', Message= "
				+ inputMessage;

		if (logger.isDebugEnabled()) {
			logger.debug("Input message received for parsing." + inputMessage);
		}
		if (inputMessage != null) {
			try {
				// get the namespace from the config.
				Object ns = config.getProperty(FIXML_SCHEMA);
				String namespace = ns == null ? DEFAULT_SCHEMA : ns.toString();
				FixmlContext context = FixmlContextFactory
						.getFixmlContext(FixmlNamespace.valueOf(namespace));

				Unmarshaller unmarshaller = context.getUnmarshaller();
				Object fixmlObj = null;
				Boolean nsProvided = Boolean.valueOf(config.getProperty(
						NAMESPACE_PROVIDED, "TRUE").toString());

				// get the fixml namespace used from configurations.
				String fixmlNamespace = FixmlNamespace.valueOf(namespace)
						.getFixmlNamespace();
				// get the provided namespace
				String fixmlNamespaceProvided = getNamespace(inputMessage);

				synchronized (unmarshaller) {
					if (!nsProvided) {
						if (fixmlNamespaceProvided.trim().length() != 0) {
							throw new NamespaceException(
									"Namespace should not be provided in the Input as per the configuration on UI");
						}

						// Create an XMLReader to use with our filter
						XMLReader reader = null;
						try {
							reader = XMLReaderFactory.createXMLReader();
						} catch (SAXException e) {
							logger
									.debug(
											"Error while creating xml reader while adding namespace",
											e);
							throw new NamespaceException(
									"Error while creating xml reader while adding namespace",
									e);
						}

						// Create the filter (to add namespace) and set the
						// xmlReader as its parent.
						NamespaceFilter inFilter = new NamespaceFilter(
								fixmlNamespace, true);
						inFilter.setParent(reader);

						// Prepare the input
						InputSource is = new InputSource(new StringReader(
								inputMessage));

						// Create a SAXSource specifying the filter
						SAXSource source = new SAXSource(inFilter, is);
						fixmlObj = unmarshaller.unmarshal(source);
					} else {
						if (!fixmlNamespace.trim().equals(
								fixmlNamespaceProvided.trim())) {
							logger
									.debug("Provided Namespace in message : "
											+ fixmlNamespaceProvided
											+ "| Namespace ontained from configuration: "
											+ fixmlNamespaceProvided);
							throw new NamespaceException(
									"Namespace provided in the Input and the namespace selected on UI are not same");
						} else {
							logger
									.debug("Namespace provided in the Input and the namespace selected on UI are same");
						}

						fixmlObj = unmarshaller.unmarshal(new StringReader(
								inputMessage));
					}

				}

				JavaBusinessObject businessObject = new JavaBusinessObject(
						fixmlObj);
				businessObject.setBusinessObjectMarshaller(new FixmlMarshaller(
						context.getMarshaller()));
				exchange.getIn().setBody(businessObject);
			} catch (NamespaceException e) {
				// Bugchase 234 ErrorMonitoring # Added NamespaceException
				logger.error("Error while getting namespace." + errorString, e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_BUSINESS, config
						.getServiceType(), e, inputMessage, null, true);
			} catch (JAXBException e) {
				// Bugchase 234 ErrorMonitoring # Error occured while unmarshalling
				logger.error("Error occured while unmarshalling." + errorString,
						e);
				super
						.handleError(
								errorHandler,
								config.getProcessId(),
								config.getServiceId(),
								ERROR_TYPE_BUSINESS,
								config.getServiceType(),
								e,
								inputMessage,
								"Error occured while unmarshalling FIXML message",
								true);
			}
		}
	}

	/**
	 * Parses the xml string and returns the namespace out of it
	 * 
	 * @precondition
	 * @postcondition
	 * @param inputMessage
	 * @return
	 */
	private String getNamespace(String inputMessage) throws NamespaceException {

		String namespace = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource();
			is.setCharacterStream(new StringReader(inputMessage));
			Document doc = db.parse(is);
			// get the root element of the document
			Element nodeElement = doc.getDocumentElement();
			// get the namespace from the node element. 'xmlns' is the attribute
			// name for namespace in XML document
			namespace = nodeElement.getAttribute("xmlns");

		} catch (ParserConfigurationException e) {
			throw new NamespaceException(
					"Error while Document builder while parsing XML string", e);
		} catch (SAXException e) {
			throw new NamespaceException(
					"Error while creating Document while parsing XML string", e);
		} catch (IOException e) {
			throw new NamespaceException(
					"Error while creating Document while parsing XML string", e);
		}

		return namespace;
	}
}

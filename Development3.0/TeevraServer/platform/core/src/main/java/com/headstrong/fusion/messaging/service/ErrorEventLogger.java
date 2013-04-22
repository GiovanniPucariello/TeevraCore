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
 * $Id: ErrorEventLogger.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 25, 2009 
 */

package com.headstrong.fusion.messaging.service;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.EventLogger;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;
import com.headstrong.fusion.eventlogger.beans.MessageEventLogBean;
import com.headstrong.fusion.eventlogger.factory.EventLoggerFactory;

/**
 * This class logs the error event in the event table.
 */

public class ErrorEventLogger implements Processor {
	/**
	 * Logger.
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ErrorEventLogger.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	/**
	 * This processor currently logs only the error messages. No other message
	 * is being logged using savepoint processor. This also has to be removed.
	 */
	public void process(Exchange exchange) throws FusionException {

		logger.info("Processing message at savepoint");
		if (logger.isDebugEnabled()) {
			logger.debug("Message content is :" + exchange.getIn());
		}
		
		Message message = exchange.getIn();
		
		try{
			if (logger.isDebugEnabled()) {
				logger.debug("Tagging Process Run Id :" + message.getHeader(FusionConstants.SESSION_ID) +"and   Message Id :" + message.getHeader(FusionConstants.MESSAGE_ID)+" with the FIXML");
			}
		}catch (Exception e) {
			logger.error("Error while generating message header", e);
			throw new FusionException(e);
		}
		
		EventLogger eventMsgLogger = EventLoggerFactory
				.getEventLogger(EventLoggerFactory.EVENT_LOGGERS.MESSAGE_LOGGER);

		eventMsgLogger.log(createEventLogBean(exchange.getIn().getHeaders()));
	}

	/**
	 * Creates {@link MessageEventLogBean} for the message.
	 * 
	 * @precondition
	 * @postcondition
	 * @param headers
	 * @return
	 */
	private EventLogBean createEventLogBean(Map<String, Object> headers) {

		MessageEventLogBean logBean = new MessageEventLogBean();
		logBean.setSessionId((String) headers.get(FusionConstants.SESSION_ID));
		logBean.setMessageId((String) headers.get(FusionConstants.MESSAGE_ID));
		logBean.setSavepointName((String) headers
				.get(FusionConstants.SAVEPOINT_NAME));
		logBean.setSavepointTime((String) headers
				.get(FusionConstants.SAVEPOINT_TIME));

		Object oSequenceId = headers.get(Exchange.SPLIT_INDEX);
		Object oTotalSequence = headers.get(Exchange.SPLIT_SIZE);

		Integer iSequenceId = 0;
		Integer iTotalSequence = 0;

		if ((oSequenceId != null) && (oSequenceId instanceof Integer)) {
			iSequenceId = ((Integer) oSequenceId) + 1;
		}

		if ((oTotalSequence != null) && (oTotalSequence instanceof Integer)) {
			iTotalSequence = (Integer) iTotalSequence;
		}

		logBean.setSequenceId(iSequenceId.toString());
		logBean.setTotalSequences(iTotalSequence.toString());
		
		/*
		 * The format of the data expected here is the Error XML formatted by 
		 * {@link ErrorContextFormatter#formatToXml}. 
		 * This XML is parsed here and the actual message(Resource tag) is
		 * stripped from the Error Xml.
		 * The actual message is set as Message Data in the Bean.
		 * The Error Xml is set as Log Message in the Bean.
		 * 
		 * Karthikeyan Punniakrishnan - 9 Jan 2013
		 */
		String logMessage = null;
		String messageData = null;
		
		String errorDetails = (String) headers.get(FusionConstants.LOG_DATA);
		if(errorDetails != null) {
			try {
				DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
				InputSource is = new InputSource(new StringReader(errorDetails));
				Document document = docBuilder.parse(is);
				
				XPathFactory xpf = XPathFactory.newInstance();
		        XPath xpath = xpf.newXPath();
		        XPathExpression expression = xpath.compile("//Error/Resource");

		        Node node = (Node) expression.evaluate(document, XPathConstants.NODE);
		        node.getParentNode().removeChild(node);
		        
		        messageData = node.getTextContent();
				
				OutputFormat format = new OutputFormat(document);
				StringWriter stringOut = new StringWriter();
				XMLSerializer serial = new XMLSerializer(stringOut, format);
				serial.asDOMSerializer();
				serial.serialize(document.getDocumentElement());

				logMessage = stringOut.toString();
				
			} catch (Exception e) {
				logger.error("Error while retrieving Message from error record: " + errorDetails, e);
			}
		}
		
		if(logMessage == null) {
			logMessage = errorDetails;
		}
	
		logBean.setLogMessage(logMessage);
		logBean.setMessageData(messageData);
		
		return logBean;

	}
}

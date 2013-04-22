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
 * $Id: QpidQueueMessageListener.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Apr 12, 2011 
 */

package com.headstrong.fusion.connector.qpid;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionNormalizedMessage;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;
import com.headstrong.fusion.commons.component.FusionProcessor;

/**
 * Qpid message listener for Queue.
 */
public class QpidQueueMessageListener implements MessageListener {

	private static final Logger logger = LoggerFactory
			.getLogger(QpidQueueMessageListener.class);
	private QpidEndpoint endpoint;
	private FusionProcessor processor;

	public QpidQueueMessageListener(QpidEndpoint endpoint,
			FusionProcessor processor) {
		this.endpoint = endpoint;
		this.processor = processor;
	}

	/**
	 * Creating message exchange and setting the body.
	 * 
	 * @param message
	 *            The message
	 * @return The exchange
	 * @throws Exception
	 */
	public MessageExchange createExchange(Message message) throws Exception {
		MessageExchange exchange = this.getEndpoint().createExchange();
		NormalizedMessage fusionMessage = new FusionNormalizedMessage();
		if (message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
			fusionMessage.setBody(textMessage.getText());
		} else if (message instanceof ObjectMessage) {
			ObjectMessage objectMessage = (ObjectMessage) message;
			fusionMessage.setBody(objectMessage.getObject());
		} else {
			logger.error("Logging JMS Message, " + message);
			throw new Exception("unsupported message type received"
					+ message.getClass().getName());
		}
		fusionMessage.setMessageId(message.getJMSMessageID());
		exchange.setIn(fusionMessage);
		exchange.getIn().setHeaders(this.createHeaders(message));
		return exchange;
	}

	/**
	 * Create headers for the message exchange.
	 * 
	 * @param message
	 *            The message containing the header information.
	 * @return The headers.
	 * @throws JMSException
	 */
	private Map<String, Object> createHeaders(Message message)
			throws JMSException {
		Map<String, Object> headers = new HashMap<String, Object>();
		Enumeration propertyNames = message.getPropertyNames();
		while (propertyNames.hasMoreElements()) {
			String propertyName = (String) propertyNames.nextElement();
			if (message.getObjectProperty(propertyName) != null) {
				headers.put(propertyName, message
						.getObjectProperty(propertyName));
			}
		}
		// set other properties
		this.setValue(headers, "JMSCorrelationID", message
				.getJMSCorrelationID());
		this.setValue(headers, "JMSDestination", message.getJMSDestination());
		this.setValue(headers, "JMSMessageID", message.getJMSMessageID());
		this.setValue(headers, "JMSReplyTo", message.getJMSReplyTo());
		this.setValue(headers, "JMSType", message.getJMSType());
		this.setValue(headers, "JMSExpiration", message.getJMSExpiration());
		this.setValue(headers, "JMSTimestamp", message.getJMSTimestamp());
		this.setValue(headers, "JMSCorrelationID", message
				.getJMSCorrelationID());
		return headers;
	}

	/**
	 * sets the header only if the property value is non-null.
	 * 
	 * @param headers
	 *            header map.
	 * @param key
	 *            property key.
	 * @param value
	 *            property value.
	 */
	private void setValue(Map<String, Object> headers, String key, Object value) {
		if (key != null && value != null) {
			headers.put(key, value);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.jms.MessageListener#onMessage(javax.jms.Message)
	 */
	public void onMessage(final Message message) {
		RuntimeException rce = null;
		try {
			if (logger.isDebugEnabled()) {
				logger.debug(endpoint + " consumer receiving JMS message: "
						+ message);
			}
			final MessageExchange exchange = createExchange(message);
			// process the exchange
			processor.process(exchange);
		} catch (Exception e) {
			rce = new RuntimeException(e);
		}
		if (rce != null) {
			logger.error(endpoint
					+ " consumer caught an exception while processing "
					+ "JMS message: " + message, rce);
		}
	}

	/**
	 * @return the endpoint
	 */
	public QpidEndpoint getEndpoint() {
		return endpoint;
	}

	/**
	 * @param endpoint
	 *            the endpoint to set
	 */
	public void setEndpoint(QpidEndpoint endpoint) {
		this.endpoint = endpoint;
	}

}

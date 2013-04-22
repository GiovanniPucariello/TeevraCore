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
 * $Id: IBMMQMessageListener.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 29, 2009 
 */

package com.headstrong.fusion.connector.ibm.mq;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;
import com.ibm.jms.JMSBytesMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.FusionNormalizedMessage;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.util.FusionUtil;

/**
 * IBM MQ message listener for Queue.
 */
public class IBMMQMessageListener implements MessageListener {

	private static final Logger logger = LoggerFactory
			.getLogger(IBMMQMessageListener.class);
	/**
	 * IBM MQ endpoint.
	 */
	private IBMMQEndpoint endpoint;
	/**
	 * Async processor.
	 */
	private FusionProcessor processor;

	/**
	 * @param endpoint
	 * @param processor
	 */
	public IBMMQMessageListener(IBMMQEndpoint endpoint,
			FusionProcessor processor) {
		this.endpoint = endpoint;
		this.processor = processor;
	}

	/**
	 * Creates message exchange.
	 * 
	 * @param message
	 *            JMS Message.
	 * @param replyDestination
	 *            reply desination queue.
	 * @return
	 * @throws JMSException
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
		} else if (message instanceof JMSBytesMessage) {
			JMSBytesMessage byteMessage = (JMSBytesMessage) message;
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < (int) byteMessage.getBodyLength(); i++) {
				buffer.append((char) byteMessage.readByte());
			}
			String msg = buffer.toString().trim();
			logger.debug("##JMSBytesMessage converted to String is : " + msg);
			fusionMessage.setBody(msg);
		} else {
			logger.error("Logging JMS Message, " + message);
			throw new Exception("unsupported message type received"
					+ message.getClass().getName());
		}
		fusionMessage.setMessageId(message.getJMSMessageID());
		exchange.setIn(fusionMessage);
		// set the header
		exchange.getIn().setHeaders(this.createHeaders(message));
		return exchange;
	}

	// create header map

	/**
	 * create the message header.
	 * 
	 * @param message
	 *            Message received.
	 * @return Header map
	 * @throws JMSException
	 */
	@SuppressWarnings("unchecked")
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
			logger.warn(endpoint
					+ " consumer caught an exception while processing "
					+ "JMS message: " + message, rce);
			// check if the error handler is configured.
			if (this.endpoint.getBindingConfig().getErrorHandler() != null) {
				BindingConfig bindingConfig = this.endpoint.getBindingConfig();
				ErrorHandler errorHandler = bindingConfig.getErrorHandler();
				try {
					FusionUtil.handleError(errorHandler, bindingConfig
							.getProcessId(), bindingConfig.getServiceId(),
							"System", "IBMMQComponent", rce, null, null, true);
				} catch (FusionException e) {
					logger.error(
							"Error handling the error using error handler", e);
					throw rce;
				}
			} else {
				throw rce;
			}
		}
	}

	/**
	 * @return the endpoint
	 */
	public IBMMQEndpoint getEndpoint() {
		return endpoint;
	}

	/**
	 * @param endpoint
	 *            the endpoint to set
	 */
	public void setEndpoint(IBMMQEndpoint endpoint) {
		this.endpoint = endpoint;
	}

}

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
 * $Id: AMQPProducer.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 16, 2009 
 */

package com.headstrong.fusion.connector.amqp;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.commons.component.FusionServiceSupport;
import com.headstrong.fusion.connector.amqp.message.AMQPMessageConverter;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.AMQP.BasicProperties;

/**
 * AMQP producer sends message to AMQP complaint messaging service.
 * 
 */
public class AMQPProducer implements FusionProducer<MessageExchange> {
	private static Logger logger = LoggerFactory.getLogger(AMQPProducer.class);
	
	private AMQPEndpoint amqpEndpoint;
	private Connection connection;
	private Channel channel;
	
	FusionServiceSupport serviceSupport;

	public AMQPProducer(AMQPEndpoint amqpEndpoint) {
		this.amqpEndpoint = amqpEndpoint;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionProducer#process(com.headstrong.fusion.commons.MessageExchange)
	 */
	public void process(MessageExchange messageExchange) throws Exception {
		try {
			Map<String, Object> headers = messageExchange.getIn().getHeaders();
			BasicProperties basicProperties = new BasicProperties();
			basicProperties.headers = AMQPMessageConverter
					.convertHeaderMessage(headers);
			channel.basicPublish(this.amqpEndpoint.getAmqpBinding()
					.getExchange(), this.amqpEndpoint.getAmqpBinding()
					.getRoutingKey(), basicProperties, AMQPMessageConverter
					.convertMessageBody(messageExchange.getIn().getBody()));
		} catch (Exception e) {
			logger.error("Error sending the message to the client.", e);
			throw e;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#start()
	 */
	public void start() throws Exception {
		if (this.connection == null || !this.connection.isOpen()) {
			this.connection = new ConnectionFactory().newConnection(
					this.amqpEndpoint.getAmqpBinding().getHostName(),
					this.amqpEndpoint.getAmqpBinding().getPortNumber());
		}
		if (this.channel == null || !this.channel.isOpen()) {
			this.channel = this.connection.createChannel();
			String exchange = this.amqpEndpoint.getAmqpBinding().getExchange();
			if (exchange != null && !"".equals(exchange)) {
				this.channel.exchangeDeclare(exchange, "direct");
			}
			this.channel.queueDeclare(this.amqpEndpoint.getAmqpBinding()
					.getRoutingKey());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#stop()
	 */
	public void stop() throws Exception {
		this.channel.close();
		this.connection.close();
	}

	@Override
	public void setServiceSupport(FusionServiceSupport serviceSupport) {
		this.serviceSupport=serviceSupport;
		
	}
}

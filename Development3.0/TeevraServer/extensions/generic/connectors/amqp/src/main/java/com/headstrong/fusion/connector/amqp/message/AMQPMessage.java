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
 * $Id: AMQPMessage.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 20, 2009 
 */

package com.headstrong.fusion.connector.amqp.message;

import java.io.Serializable;
import java.util.Map;

/**
 * AMQP Message to be sent to AMQP client.
 * 
 */
public class AMQPMessage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String, Serializable> properties;
	private Serializable message;
	/**
	 * @return the properties
	 */
	public Map<String, Serializable> getProperties() {
		return properties;
	}
	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Map<String, Serializable> properties) {
		this.properties = properties;
	}
	/**
	 * @return the message
	 */
	public Serializable getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(Serializable message) {
		this.message = message;
	}
	
}

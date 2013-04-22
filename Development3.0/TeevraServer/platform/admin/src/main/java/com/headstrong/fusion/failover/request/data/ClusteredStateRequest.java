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
 * $Id: ClusteredConfiguration.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 29, 2009 
 */

package com.headstrong.fusion.failover.request.data;

import java.io.Serializable;

/**
 * This state can be serialized and send to other failover instances. Make sure
 * that all the other properties of the state are also serializable.
 * 
 */
public class ClusteredStateRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5092065148869054356L;
	/**
	 * 
	 */
	private byte[] buffer;
	private String handlerName;

	/**
	 * Name of the handler service. {@link ClusteredStateManager} searches for
	 * the service using handler name provided. Since it uses OSGi context for
	 * the service registry make sure the handler is registered using a unique
	 * name across all the budles.
	 * 
	 * @return state handler service.
	 */

	/**
	 * @return the handlerName
	 */
	public String getHandlerName() {
		return handlerName;
	}

	/**
	 * @param handlerName the handlerName to set
	 */
	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

	/**
	 * @param buffer the buffer to set
	 */
	public void setBuffer(byte[] buffer) {
		this.buffer = buffer;
	}

	/**
	 * @return the buffer
	 */
	public byte[] getBuffer() {
		return buffer;
	}
}

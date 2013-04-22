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
 * $Id: TransformResult.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 8, 2010 
 */
package com.tedi.beans;

import java.util.List;

/**
 * This file is provided by MCH team for TEDI engine integration.
 */
public class TransformResult {

	/**
	 * The return code.
	 */
	private int returnCode;
	/**
	 * The pay load.
	 */
	private String payload;
	/**
	 * The messages.
	 */
	private List messages;

	/**
	 * Constructor
	 */
	public TransformResult() {
	}

	/**
	 * Returns the Pay load.
	 * 
	 * @return Returns the Pay load.
	 */
	public String getPayload() {
		return payload;
	}

	/**
	 * Set the Pay load.
	 * 
	 * @param payload
	 *            Set the Pay load.
	 */
	public void setPayload(String payload) {
		this.payload = payload;
	}

	/**
	 * Returns the Messages.
	 * 
	 * @return Returns the Messages.
	 */
	public List getMessages() {
		return messages;
	}

	/**
	 * Set the Messages.
	 * 
	 * @param messages
	 *            Set the Messages.
	 */
	public void setMessages(List messages) {
		this.messages = messages;
	}

	/**
	 * Returns the Return Code.
	 * 
	 * @return Returns the Return Code.
	 */
	public int getReturnCode() {
		return returnCode;
	}

	/**
	 * Set the Return Code.
	 * 
	 * @param returnCode
	 *            Set the Return Code to returnCode.
	 */
	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}
}

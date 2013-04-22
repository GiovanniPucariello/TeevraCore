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
 * $Id: ExecutionMessage.java
 * $Revision: 
 * $Author: byoung
 * $DateTime: Mar 8, 2010 
 */
package com.tedi.engine;

import java.io.Serializable;

/**
 * This file is provided by MCH team for TEDI engine integration.
 */
public class ExecutionMessage implements Serializable {

	/**
	 * The message.
	 */
	private String message;
	/**
	 * The level.
	 */
	private int level;
	/**
	 * Message ID.
	 */
	private int messageID;

	/**
	 * Constructor
	 */
	public ExecutionMessage() {
	}

	/**
	 * Returns the message.
	 * 
	 * @return Returns the message.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Set the message.
	 * 
	 * @param msg
	 *            Set the message.
	 */
	public void setMessage(String msg) {
		message = msg;
	}

	/**
	 * Returns the level.
	 * 
	 * @return Returns the level.
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * Set the level.
	 * 
	 * @param lev
	 *            Set the level.
	 */
	public void setLevel(int lev) {
		level = lev;
	}

	/**
	 * Returns the message ID.
	 * 
	 * @return Returns the message ID.
	 */
	public int getMessageID() {
		return messageID;
	}

	/**
	 * Set the message ID.
	 * 
	 * @param id
	 *            Set the message ID.
	 */
	public void setMessageID(int id) {
		messageID = id;
	}

}

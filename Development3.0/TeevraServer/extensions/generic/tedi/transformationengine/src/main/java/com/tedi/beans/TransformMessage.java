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
 * $Id: TransformMessage.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 8, 2010 
 */
package com.tedi.beans;

/**
 * This file is provided by MCH team for TEDI engine integration.
 */
public class TransformMessage {

	/**
	 * The text.
	 */
	private String text;
	/**
	 * Message level.
	 */
	private int level;
	/**
	 * Message ID.
	 */
	private int id;

	/**
	 * Constructor
	 */
	public TransformMessage() {
	}

	/**
	 * Returns the text.
	 * 
	 * @return Returns the text.
	 */
	public String getText() {
		return text;
	}

	/**
	 * Set the text.
	 * 
	 * @param text
	 *            Set the text.
	 */
	public void setText(String text) {
		this.text = text;
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
	 * @param level
	 *            Set the level.
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * Returns the id.
	 * 
	 * @return Returns the id.
	 */
	public int getID() {
		return id;
	}

	/**
	 * Set the id.
	 * 
	 * @param id
	 *            Set the id.
	 */
	public void setID(int id) {
		this.id = id;
	}

}

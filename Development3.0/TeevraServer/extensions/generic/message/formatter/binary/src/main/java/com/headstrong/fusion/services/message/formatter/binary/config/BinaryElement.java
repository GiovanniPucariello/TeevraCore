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
 * $Id: BinaryElement.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: May 26, 2009 
 */

package com.headstrong.fusion.services.message.formatter.binary.config;

/**
 * 
 */
public class BinaryElement {
	
	private String name;
	private String type;
	private String size;
	
	public BinaryElement() {
	}
	
	public BinaryElement(String name,String type,String size) {
		setName(name);
		setType(type);
		setSize(size);
	}
	
	public BinaryElement(String name,String type) {
		setName(name);
		setType(type);
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	
	

}

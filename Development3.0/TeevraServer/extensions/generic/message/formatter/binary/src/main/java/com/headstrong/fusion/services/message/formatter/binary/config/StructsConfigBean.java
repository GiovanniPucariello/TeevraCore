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
 * $Id: StructsConfig.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: May 26, 2009 
 */

package com.headstrong.fusion.services.message.formatter.binary.config;

import java.util.List;

/**
 * Bean holding a single Structure Configuration as expected by
 * BinaryParserFormatter
 */
public class StructsConfigBean {

	private String parentStructName;
	private List<BinaryElement> elements;
	private boolean isUnion = false;

	public String getParentStructName() {
		return parentStructName;
	}

	public void setParentStructName(String parentStructName) {
		this.parentStructName = parentStructName;
	}

	public List<BinaryElement> getElements() {
		return elements;
	}

	public void setElements(List<BinaryElement> elements) {
		this.elements = elements;
	}

	public boolean isUnion() {
		return isUnion;
	}

	public void setUnion(boolean isUnion) {
		this.isUnion = isUnion;
	}

}

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
 * $Id: XPathBinding.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 1, 2008
 */

package com.headstrong.fusion.services.message.commons.config.parser.xml;

import com.headstrong.fusion.services.message.commons.config.parser.Binding;

/**
 * Represent XPath for the XML Payload.
 * 
 */
public class XPathBinding implements Binding {
	private String xPath;

	/**
	 * @return the xPath
	 */
	public String getXPath() {
		return xPath;
	}

	/**
	 * @param path the xPath to set
	 */
	public void setXPath(String path) {
		xPath = path;
	}
	

}

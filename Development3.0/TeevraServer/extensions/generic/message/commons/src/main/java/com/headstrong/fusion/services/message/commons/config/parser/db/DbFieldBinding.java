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
 * $Id: DbFiledBinding.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 12, 2008 
 */

package com.headstrong.fusion.services.message.commons.config.parser.db;

import com.headstrong.fusion.services.message.commons.config.parser.Binding;

/**
 * 
 */
public class DbFieldBinding implements Binding {
	String dbField;

	/**
	 * @return the dbField
	 */
	public String getDbField() {
		return dbField;
	}

	/**
	 * @param dbField the dbField to set
	 */
	public void setDbField(String dbField) {
		this.dbField = dbField;
	}

}

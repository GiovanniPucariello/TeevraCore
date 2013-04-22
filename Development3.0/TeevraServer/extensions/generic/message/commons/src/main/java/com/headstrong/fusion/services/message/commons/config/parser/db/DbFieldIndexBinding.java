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
 * $Id: DbFieldIndexBinding.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 13, 2008 
 */

package com.headstrong.fusion.services.message.commons.config.parser.db;

import com.headstrong.fusion.services.message.commons.config.parser.Binding;

/**
 * Field index required for setting the data in the insert statement.
 * 
 */
public class DbFieldIndexBinding implements Binding {
	private int dbFieldIndex;

	/**
	 * @return the dbFieldIndex
	 */
	public int getDbFieldIndex() {
		return dbFieldIndex;
	}

	/**
	 * @param dbFieldIndex the dbFieldIndex to set
	 */
	public void setDbFieldIndex(int dbFieldIndex) {
		this.dbFieldIndex = dbFieldIndex;
	}
	
}

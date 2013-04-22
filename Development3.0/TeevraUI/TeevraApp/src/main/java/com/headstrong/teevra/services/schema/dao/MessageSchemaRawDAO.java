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
 * $Id: MessageSchemaRawDao.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 12, 2008 
 */

package com.headstrong.teevra.services.schema.dao;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.schema.eo.MessageSchemaRawEO;
import com.headstrong.teevra.services.schema.exception.SchemaServiceException;

/**
 * MessageSchemaRawDAO extneds BaseDAO to perform all operations related to
 * schemaRaw.
 */
public interface MessageSchemaRawDAO extends BaseDAO<MessageSchemaRawEO> {

	/**
	 * Saves the raw data related to the schema
	 * 
	 * @precondition
	 * @postcondition
	 * @param schemaRaw
	 * @throws SchemaServiceException
	 */
	public void saveSchemaRaw(MessageSchemaRawEO schemaRaw)
			throws SchemaServiceException;

	/**
	 * Deletes the raw data from the system
	 * 
	 * @precondition
	 * @postcondition
	 * @param schemaRaw
	 * @throws SchemaServiceException
	 */
	public void deleteSchemaRaw(MessageSchemaRawEO schemaRaw)
			throws SchemaServiceException;
}

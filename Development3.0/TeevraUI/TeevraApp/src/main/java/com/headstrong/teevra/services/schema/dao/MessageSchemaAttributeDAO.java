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
 * $Id: MessageSchemaAttributeDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.teevra.services.schema.dao;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.schema.eo.MessageSchemaAttributeEO;
import com.headstrong.teevra.services.schema.exception.SchemaServiceException;

/**
 * MessageSchemaAttributeDAO extneds BaseDAO to perform all operations related
 * to attribute.
 */
public interface MessageSchemaAttributeDAO extends
		BaseDAO<MessageSchemaAttributeEO> {

	/**
	 * Persists the given attribute
	 * 
	 * @precondition
	 * @postcondition
	 * @param attribute
	 * @throws SchemaServiceException
	 */
	public void saveSchemaAttribute(MessageSchemaAttributeEO attribute)
			throws SchemaServiceException;

	/**
	 * Deletes the given attribute
	 * 
	 * @precondition
	 * @postcondition
	 * @param attribute
	 * @throws SchemaServiceException
	 */
	public void deleteSchemaAttribute(MessageSchemaAttributeEO attribute)
			throws SchemaServiceException;
}

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
 * $Id: MessageSchemaAttributeDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.teevra.services.schema.dao.impl;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.schema.dao.MessageSchemaAttributeDAO;
import com.headstrong.teevra.services.schema.eo.MessageSchemaAttributeEO;
import com.headstrong.teevra.services.schema.exception.SchemaServiceException;

/**
 * MessageSchemaAttributeDAOImpl implements MessageSchemaAttributeDAO to perform
 * all operations related to attribute.
 */
public class MessageSchemaAttributeDAOImpl extends
		BaseHibernateDAO<MessageSchemaAttributeEO> implements
		MessageSchemaAttributeDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.dao.MessageSchemaAttributeDAO
	 *      #deleteSchemaAttribute
	 *      (com.headstrong.teevra.services.schema.eo.MessageSchemaAttributeEO)
	 */
	public void deleteSchemaAttribute(MessageSchemaAttributeEO attribute)
			throws SchemaServiceException {
		super.delete(attribute);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.dao.MessageSchemaAttributeDAO
	 *      #saveSchemaAttribute
	 *      (com.headstrong.teevra.services.schema.eo.MessageSchemaAttributeEO)
	 */
	public void saveSchemaAttribute(MessageSchemaAttributeEO attribute)
			throws SchemaServiceException {
		super.save(attribute);

	}

}

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
 * $Id: MessageSchemaRawDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 12, 2008 
 */

package com.headstrong.teevra.services.schema.dao.impl;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.schema.dao.MessageSchemaRawDAO;
import com.headstrong.teevra.services.schema.eo.MessageSchemaRawEO;
import com.headstrong.teevra.services.schema.exception.SchemaServiceException;

/**
 * MessageSchemaRawDAOImpl implements MessageSchemaRawDAO to perform all
 * operations related to schema raw.
 */
public class MessageSchemaRawDAOImpl extends
		BaseHibernateDAO<MessageSchemaRawEO> implements MessageSchemaRawDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.dao.MessageSchemaRawDAO#saveSchemaRaw
	 *      (MessageSchemaRawEO)
	 */
	public void saveSchemaRaw(MessageSchemaRawEO schemaRaw)
			throws SchemaServiceException {
		super.save(schemaRaw);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.dao.MessageSchemaRawDAO#deleteSchemaRaw(MessageSchemaRawEO)
	 */
	public void deleteSchemaRaw(MessageSchemaRawEO schemaRaw)
			throws SchemaServiceException {
		super.delete(schemaRaw);

	}

}

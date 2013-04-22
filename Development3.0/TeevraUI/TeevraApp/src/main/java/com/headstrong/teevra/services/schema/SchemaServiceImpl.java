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
 * $Id: SchemaServiceImpl.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Oct 16, 2008 
 */

package com.headstrong.teevra.services.schema;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.services.schema.dao.MessageSchemaDAO;
import com.headstrong.teevra.services.schema.eo.MessageSchemaEO;
import com.headstrong.teevra.services.schema.exception.RemoteSchemaReloadException;
import com.headstrong.teevra.services.schema.exception.SchemaServiceException;
import com.headstrong.teevra.services.schema.remoting.RemoteSchemaDelegate;
import com.headstrong.teevra.services.serveradmin.dao.ServerConfigDAO;
import com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO;
import com.headstrong.teevra.services.serveradmin.exception.ServerAdminServiceException;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Service implementation to perform all operations related to schema.
 */
public class SchemaServiceImpl implements SchemaService {

	/**
	 * Logger for SchemaServiceImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(SchemaServiceImpl.class);

	private MessageSchemaDAO messageSchemaDAO;
	private ServerConfigDAO serverConfigDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.SchemaService#deleteSchema(java
	 *      .lang.String)
	 */
	public void deleteSchema(String schemaName) throws SchemaServiceException,
			UserAuthorizationException, SessionTimeOutException {

		messageSchemaDAO.deleteSchema(schemaName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.SchemaService#deleteSchemaTree
	 *      (java.lang.Long)
	 */
	public void deleteSchemaTree(Long rootSchemaId)
			throws SchemaServiceException, UserAuthorizationException,
			SessionTimeOutException {
		messageSchemaDAO.deleteSchemaTree(rootSchemaId);
		// After deleting schema tree, schema cache has to be refreshed on all
		// the
		// servers registered in the system
		refreshRemoteSchemaCache();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.SchemaService#loadSchema()
	 */
	public void loadSchema() throws SchemaServiceException,
			UserAuthorizationException, SessionTimeOutException {
		messageSchemaDAO.loadSchema();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.SchemaService#loadSchema(java
	 *      .lang.String)
	 */
	public MessageSchemaEO loadSchema(String schemaName)
			throws SchemaServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return messageSchemaDAO.loadSchema(schemaName);
		// return ObjectDescriptorCache.getInstance().getDescriptor(schemaName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.SchemaService#saveSchema(com
	 *      .headstrong.teevra.services.schema.eo.MessageSchemaEO)
	 */
	public void saveSchema(MessageSchemaEO schema)
			throws SchemaServiceException, UserAuthorizationException,
			SessionTimeOutException {

		messageSchemaDAO.save(schema);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.SchemaService#saveSchemaTree
	 *      (java.util.Map,
	 *      com.headstrong.teevra.services.schema.eo.MessageSchemaEO)
	 */
	public void saveSchemaTree(Map<String, MessageSchemaEO> descriptorMap,
			MessageSchemaEO rootSchema) throws SchemaServiceException,
			UserAuthorizationException, SessionTimeOutException {
		messageSchemaDAO.saveSchemaTree(descriptorMap, rootSchema);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.SchemaService#getSchemas()
	 */
	public List<MessageSchemaEO> getSchemas() throws SchemaServiceException,
			UserAuthorizationException, SessionTimeOutException {
		return messageSchemaDAO.getSchemas();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.SchemaService#getPublicSchemas()
	 */
	public List<MessageSchemaEO> getPublicSchemas()
			throws SchemaServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return messageSchemaDAO.getPublicSchemas();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.SchemaService#saveXMLSchema
	 *      (com.headstrong.teevra.services.schema.eo.MessageSchemaEO,
	 *      java.lang.String)
	 */
	public MessageSchemaEO saveXMLSchema(MessageSchemaEO rootSchema,
			String schemaText) throws SchemaServiceException,
			UserAuthorizationException, SessionTimeOutException {

		if (rootSchema.getSchemaId().intValue() == 0) {
			rootSchema.setSchemaId(null);
			rootSchema.setCreatedBy(System.getProperty("user.name"));
			rootSchema
					.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		} else {
			rootSchema.setModifiedBy(System.getProperty("user.name"));
			rootSchema
					.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		}
		rootSchema = messageSchemaDAO.saveXMLSchema(rootSchema, schemaText);

		// After saving schema, schema cache has to be refreshed on all the
		// servers registered in the system
		refreshRemoteSchemaCache();

		// return the rootSchema
		return rootSchema;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.SchemaService#getSchemas
	 *      (com.headstrong.teevra.services.schema.eo.MessageSchemaEO)
	 */
	public List<MessageSchemaEO> getSchemas(MessageSchemaEO criteria)
			throws SchemaServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return messageSchemaDAO.getSchemas(criteria);
	}

	/**
	 * Refreshes Schema Caches on all the servers registered in the system
	 * 
	 * @precondition
	 * @postcondition
	 */
	private void refreshRemoteSchemaCache() throws SchemaServiceException {
		List<ServerConfigEO> servers = new ArrayList<ServerConfigEO>();
		try {
			servers = serverConfigDAO.getServerConfigs();
		} catch (ServerAdminServiceException e) {
			logger.error(
					"Error while retrieving server configurations from Db", e);
			throw new SchemaServiceException(e.getMessage());

		}
		if (!servers.isEmpty()) {
			for (ServerConfigEO server : servers) {
				try {
					RemoteSchemaDelegate.getInstance().reloadSchemaCache(
							server.getServerUrl());
				} catch (RemoteSchemaReloadException ex) {

				}
			}
		}

	}

	/**
	 * @return the messageSchemaDAO
	 */
	public MessageSchemaDAO getMessageSchemaDAO() {
		return messageSchemaDAO;
	}

	/**
	 * @param messageSchemaDAO
	 *            the messageSchemaDAO to set
	 */
	public void setMessageSchemaDAO(MessageSchemaDAO messageSchemaDAO) {
		this.messageSchemaDAO = messageSchemaDAO;
	}

	/**
	 * @return the serverConfigDAO
	 */
	public ServerConfigDAO getServerConfigDAO() {
		return serverConfigDAO;
	}

	/**
	 * @param serverConfigDAO
	 *            the serverConfigDAO to set
	 */
	public void setServerConfigDAO(ServerConfigDAO serverConfigDAO) {
		this.serverConfigDAO = serverConfigDAO;
	}
}

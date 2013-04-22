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
 * $Id: MessageSchemaDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.teevra.services.schema.dao;

import java.util.Map;
import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.schema.eo.MessageSchemaEO;
import com.headstrong.teevra.services.schema.exception.SchemaServiceException;

/**
 * MessageSchemaDAO extneds BaseDAO to perform all operations related to schema.
 */
public interface MessageSchemaDAO extends BaseDAO<MessageSchemaEO> {

	/**
	 * If the given object descriptor has schemaId already set, then that schema
	 * would be replaced with the given descriptor. Exception would be thrown
	 * when one of the following conditions fail a) If the types set in the
	 * attribute descriptor are not present b) If there are no key attributes
	 * set c) If the schema name already exist d) If the schema name or
	 * attribute name contains invalid characters
	 * 
	 * @precondition
	 * @postcondition
	 * @param schema
	 * @throws SchemaServiceException
	 */
	public void saveSchema(MessageSchemaEO schema)
			throws SchemaServiceException;

	/**
	 * Saves the complete schema tree rooted by the given ?rootSchema?
	 * recursively. All validations stated in saveSchema are applicable here.
	 * The complete operation is performed in a single transaction implying that
	 * the complete tree is saved successfully or nothing in it will be saved.
	 * 
	 * @precondition
	 * @postcondition
	 * @param descriptorMap
	 * @param rootSchema
	 * @throws SchemaServiceException
	 */
	public void saveSchemaTree(Map<String, MessageSchemaEO> descriptorMap,
			MessageSchemaEO rootSchema) throws SchemaServiceException;

	/**
	 * Loads all the schema present in the system and places in the cache. This
	 * is required in case we decide to load all the schemas on system startup.
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void loadSchema();

	/**
	 * Checks if the given schema is already loaded in the cache and returns the
	 * same, else recursively loads the complete object tree and returns it
	 * after inserting into the cache.
	 * 
	 * @precondition
	 * @postcondition
	 * @param schemaName
	 * @return
	 */
	public MessageSchemaEO loadSchema(String schemaName);

	/**
	 * Checks if there are any dependencies to the given schema. If yes proceeds
	 * with the deletion of the given schema. This operation does not delete the
	 * complete schema tree.
	 * 
	 * @precondition
	 * @postcondition
	 * @param schemaName
	 * @throws SchemaServiceException
	 */
	public void deleteSchema(String schemaName) throws SchemaServiceException;

	/**
	 * Deletes the complete schema rooted by the given schema id recursively in
	 * a single transaction.
	 * 
	 * @precondition
	 * @postcondition
	 * @param rootSchemaId
	 * @throws SchemaServiceException
	 */
	public void deleteSchemaTree(Long rootSchemaId)
			throws SchemaServiceException;

	/**
	 * Fetches list of all the Schemas present in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws SchemaServiceException
	 */
	public List<MessageSchemaEO> getSchemas() throws SchemaServiceException;

	/**
	 * gets all the schemas and attributes and constructs a schema tree. Saves
	 * the complete schema tree rooted by the ?rootSchema? recursively along
	 * with the XML Schema as HTML Text. All validations stated in saveSchema
	 * are applicable here. The complete operation is performed in a single
	 * transaction implying that the complete tree is saved successfully or
	 * nothing in it will be saved. After saving the root schema saved is will
	 * be returned
	 * 
	 * @precondition
	 * @postcondition
	 * @param rootSchema,
	 *            rootSchema to store the details of schema *
	 * @param schemaText,
	 *            schemaText to parse
	 * @return rootSchema after saving
	 * @throws SchemaServiceException
	 */
	public MessageSchemaEO saveXMLSchema(MessageSchemaEO rootSchema,
			String schemaText) throws SchemaServiceException;

	/**
	 * Same as getSchemas() but the result is filtered with the values specified
	 * in the input criteria object. This can be used to filter processes based
	 * on schema id, name, etc
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws SchemaServiceException
	 */
	public List<MessageSchemaEO> getSchemas(MessageSchemaEO criteria)
			throws SchemaServiceException;

	/**
	 * Fetches list of all the Schemas present in the system which are public
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws SchemaServiceException
	 */
	public List<MessageSchemaEO> getPublicSchemas()
			throws SchemaServiceException;

}

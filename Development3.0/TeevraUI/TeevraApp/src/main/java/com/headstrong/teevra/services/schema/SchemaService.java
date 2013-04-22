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
 * $Id: SchemaService.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 9, 2008 
 */

package com.headstrong.teevra.services.schema;

import java.util.Map;
import java.util.List;

import com.headstrong.teevra.services.schema.eo.MessageSchemaEO;
import com.headstrong.teevra.services.schema.exception.SchemaServiceException;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Service to perform all operations related to schema.
 */
public interface SchemaService {
	/**
	 * If the given object descriptor has schemaId already set, then that schema
	 * would be replaced with the given descriptor. Exception would be thrown
	 * when one of the following conditions fail a) If the types set in the
	 * attribute descriptor are not present b) If there are no key attributes
	 * set c) If the schema name already exist d) If the schema name or
	 * attribute name contains invalid characters
	 * 
	 * @precondition (schema != null)
	 * @param schema
	 *            Schema that needs to be persisted
	 * @throws SchemaServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void saveSchema(MessageSchemaEO schema)
			throws SchemaServiceException, UserAuthorizationException,
			SessionTimeOutException;

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
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void saveSchemaTree(Map<String, MessageSchemaEO> descriptorMap,
			MessageSchemaEO rootSchema) throws SchemaServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Loads all the schema present in the system and places in the cache. This
	 * is required in case we decide to load all the schemas on system startup.
	 * 
	 * @precondition
	 * @postcondition
	 * @throws SchemaServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void loadSchema() throws SchemaServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Checks if the given schema is already loaded in the cache and returns the
	 * same, else recursively loads the complete object tree and returns it
	 * after inserting into the cache.
	 * 
	 * @precondition
	 * @postcondition
	 * @param schemaName
	 * @return
	 * @throws SchemaServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public MessageSchemaEO loadSchema(String schemaName)
			throws SchemaServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Checks if there are any dependencies to the given schema. If yes proceeds
	 * with the deletion of the given schema. This operation does not delete the
	 * complete schema tree.
	 * 
	 * @precondition
	 * @postcondition
	 * @param schemaName
	 * @throws SchemaServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void deleteSchema(String schemaName) throws SchemaServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Deletes the complete schema rooted by the given schema id recursively in
	 * a single transaction.
	 * 
	 * @precondition
	 * @postcondition
	 * @param rootSchemaId
	 * @throws SchemaServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void deleteSchemaTree(Long rootSchemaId)
			throws SchemaServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Fetches list of all the Schemas present in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws SchemaServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<MessageSchemaEO> getSchemas() throws SchemaServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Same as getSchemas() but the result is filtered with the values specified
	 * in the input criteria object. This can be used to filter processes based
	 * on schema id, name, etc
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws SchemaServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<MessageSchemaEO> getSchemas(MessageSchemaEO criteria)
			throws SchemaServiceException, UserAuthorizationException,
			SessionTimeOutException;

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
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public MessageSchemaEO saveXMLSchema(MessageSchemaEO rootSchema,
			String schemaText) throws SchemaServiceException,
			UserAuthorizationException, SessionTimeOutException;

	/**
	 * Fetches list of all the Schemas present in the system which are public
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws SchemaServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<MessageSchemaEO> getPublicSchemas()
			throws SchemaServiceException, UserAuthorizationException,
			SessionTimeOutException;

}

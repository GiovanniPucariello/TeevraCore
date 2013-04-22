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

package com.headstrong.fusion.services.message.schema;

import java.util.Map;

import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptorCache;
import com.headstrong.fusion.bo.impl.exception.SchemaServiceException;

/**
 * Service to perform all operations related to schema.
 */
public class SchemaService {
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
	 */
	public void saveSchema(ObjectDescriptor schema)
			throws SchemaServiceException {

	}

	/**
	 * Saves the complete schema tree rooted by the given ©rootSchema©
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
	public void saveSchemaTree(Map<String, ObjectDescriptor> descriptorMap,
			ObjectDescriptor rootSchema) throws SchemaServiceException {

	}

	/**
	 * Loads all the schema present in the system and places in the cache. This
	 * is required in case we decide to load all the schemas on system startup.
	 * 
	 * @precondition
	 * @postcondition
	 * @throws SchemaServiceException
	 */
	public void loadSchema() throws SchemaServiceException {

	}

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
	 */
	public ObjectDescriptor loadSchema(String schemaName)
			throws SchemaServiceException {
		return ObjectDescriptorCache.getInstance().getDescriptor(schemaName);
	}

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
	public void deleteSchema(String schemaName) throws SchemaServiceException {

	}

	/**
	 * Deletes the complete schema rooted by the given schema name recursively
	 * in a single transaction.
	 * 
	 * @precondition
	 * @postcondition
	 * @param rootSchemaName
	 * @throws SchemaServiceException
	 */
	public void deleteSchemaTree(String rootSchemaName)
			throws SchemaServiceException {

	}

}

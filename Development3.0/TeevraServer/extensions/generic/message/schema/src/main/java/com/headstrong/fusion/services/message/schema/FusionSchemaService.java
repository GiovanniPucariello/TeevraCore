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
 * $Id: SchemaReader.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 15, 2008 
 */

package com.headstrong.fusion.services.message.schema;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptorCache;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;

/**
 * Schema Reader reads the schema definition from Teevra database. and caches
 * the schema locally.
 * 
 */
public class FusionSchemaService {

	private static final Logger logger = LoggerFactory
			.getLogger(FusionSchemaService.class);

	private static final String schemaQuery = "SELECT schema_id, schema_name,  schema_desc,  "
			+ " schema_is_primitive, "
			+ "parent_schema_id  FROM message_schema ";

	private static final String attributeQuery = "SELECT schema_id, schema_attr_id, schema_attr_name, "
			+ "schema_attr_type, schema_attr_is_key, schema_attr_relation, schema_m2m_type "
			+ "FROM message_schema_attribute";

	/**
	 * Reloads the schema definition from Db.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws SQLException
	 */
	public Map<Long, ObjectDescriptor> reloadSchema() throws SQLException {
		Map<Long, ObjectDescriptor> objectDesriptorMap = new HashMap<Long, ObjectDescriptor>();
		Connection connection = null;
		try {
			connection = DatabaseManager.getInstance(FusionConstants.FUSIONDB)
					.getConnection();
			if (connection != null) {
				/**
				 * Schema table statement and result set
				 */
				Statement schemaStmt = null;
				ResultSet schemaRs = null;

				try {
					schemaStmt = connection.createStatement();
					schemaRs = schemaStmt.executeQuery(schemaQuery);
					while (schemaRs.next()) {
						ObjectDescriptor schemaDescriptor = new ObjectDescriptor();
						schemaDescriptor.setId(schemaRs.getLong("schema_id"));
						schemaDescriptor.setName(schemaRs
								.getString("schema_name"));
						schemaDescriptor.setDesc(schemaRs
								.getString("schema_desc"));
						schemaDescriptor.setParentSchemaId(schemaRs
								.getLong("parent_schema_id"));
						schemaDescriptor.setPrimitive(schemaRs
								.getBoolean("schema_is_primitive"));
						// set empty attributes map
						schemaDescriptor
								.setAttributes(new HashMap<String, AttributeDescriptor>());
						// Add the schema in the map
						objectDesriptorMap.put(schemaDescriptor.getId(),
								schemaDescriptor);
					}
				} catch (SQLException e) {
					logger.error("Error while create schema.", e);
					throw e;
				} finally {
					DatabaseManager
							.releaseResources(null, schemaStmt, schemaRs);

					// connection would be closed by outer try/catch block.
				}

				// On successful schema creation create attribute descriptions.
				/**
				 * Attribute descriptor table statement and result set.
				 */

				Statement attributeStmt = null;
				ResultSet attributeRs = null;

				try {
					attributeStmt = connection.createStatement();
					attributeRs = attributeStmt.executeQuery(attributeQuery);

					while (attributeRs.next()) {
						AttributeDescriptor attributeDescriptor = new AttributeDescriptor();
						Long schemaId = attributeRs.getLong("schema_id");
						attributeDescriptor.setAttributeId(attributeRs
								.getLong("schema_attr_id"));
						attributeDescriptor.setAttributeName(attributeRs
								.getString("schema_attr_name"));
						attributeDescriptor.setType(objectDesriptorMap
								.get(attributeRs.getLong("schema_attr_type")));
						attributeDescriptor.setKey(attributeRs
								.getBoolean("schema_attr_is_key"));
						attributeDescriptor.setAttrRelation(attributeRs
								.getString("schema_attr_relation"));
						// set this to the object description.
						ObjectDescriptor objectDescriptor = objectDesriptorMap
								.get(schemaId);
						// add the attribute descriptor.
						objectDescriptor.getAttributes().put(
								attributeDescriptor.getAttributeName(),
								attributeDescriptor);
					}
				} catch (SQLException e) {
					logger.error("Error loading attribute descriptions.", e);
					throw e;
				} finally {
					DatabaseManager
							.releaseResources(null, schemaStmt, schemaRs);
					// connection would be closed by outer try/catch block.
				}

			}
		} catch (SQLException sqlEx) {
			logger.error("Error reading the schema definition", sqlEx);
			throw sqlEx;
		} finally {
			DatabaseManager.releaseResources(connection, null, null);

		}
		return objectDesriptorMap;
	}

	/**
	 * Reloads the cache from the DB.
	 * 
	 * @throws SQLException
	 */
	public void reloadCache() throws SQLException {
		ObjectDescriptorCache objectDescriptorCache = ObjectDescriptorCache
				.getInstance();
		// Iterate through the map and
		Map<Long, ObjectDescriptor> objectDesriptorMap = this.reloadSchema();

		Collection<ObjectDescriptor> schemas = objectDesriptorMap.values();
		for (ObjectDescriptor schema : schemas) {
			objectDescriptorCache.addDescriptor(schema.getName(), schema);
		}

	}
}

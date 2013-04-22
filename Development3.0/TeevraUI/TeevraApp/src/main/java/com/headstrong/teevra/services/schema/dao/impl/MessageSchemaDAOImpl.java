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
 * $Id: MessageSchemaDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.teevra.services.schema.dao.impl;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.ws.jaxme.xs.XSComplexType;
import org.apache.ws.jaxme.xs.XSElement;
import org.apache.ws.jaxme.xs.XSGroup;
import org.apache.ws.jaxme.xs.XSParser;
import org.apache.ws.jaxme.xs.XSParticle;
import org.apache.ws.jaxme.xs.XSSchema;
import org.apache.ws.jaxme.xs.XSType;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.schema.dao.MessageSchemaAttributeDAO;
import com.headstrong.teevra.services.schema.dao.MessageSchemaDAO;
import com.headstrong.teevra.services.schema.dao.MessageSchemaRawDAO;
import com.headstrong.teevra.services.schema.eo.MessageSchemaAttributeEO;
import com.headstrong.teevra.services.schema.eo.MessageSchemaEO;
import com.headstrong.teevra.services.schema.eo.MessageSchemaRawEO;
import com.headstrong.teevra.services.schema.exception.InvalidAttributeSchemaException;
import com.headstrong.teevra.services.schema.exception.NoKeyAttributeException;
import com.headstrong.teevra.services.schema.exception.SchemaDeleteException;
import com.headstrong.teevra.services.schema.exception.SchemaServiceException;
import com.headstrong.teevra.services.schema.exception.UniqueSchemaException;
import com.headstrong.teevra.services.schema.vo.ObjectDescriptorCache;

/**
 * MessageSchemaDAOImpl implements MessageSchemaDAO to perform all operations
 * related to schema.
 */
public class MessageSchemaDAOImpl extends BaseHibernateDAO<MessageSchemaEO>
		implements MessageSchemaDAO {
	/**
	 * Logger for MessageSchemaDAOImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(MessageSchemaDAOImpl.class);

	private MessageSchemaAttributeDAO messageSchemaAttributeDAO = null;

	private MessageSchemaRawDAO messageSchemaRawDAO = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.dao.MessageSchemaDAO#saveSchema
	 *      (com.headstrong.teevra.services.schema.eo.MessageSchemaEO)
	 */
	public void saveSchema(MessageSchemaEO schema)
			throws SchemaServiceException {

		if (schema.getSchemaName() == null) {
			logger.error("key attributes are not specified for the schema");
			throw new NoKeyAttributeException(
					"Schema name is not specified for the schema");
		} else {
			List<MessageSchemaEO> schemaCheckList = super
					.getByCriteria(DetachedCriteria.forClass(
							MessageSchemaEO.class).add(
							Restrictions.eq("schemaName", schema
									.getSchemaName())));
			if (!schemaCheckList.isEmpty()) {
				logger
						.error("A schema with the same name already exists in the system");
				throw new UniqueSchemaException("A schema with the name " + "'"
						+ schema.getSchemaName() + "'"
						+ " is already exists in the system");
			} else {
				super.save(schema);

				List<MessageSchemaAttributeEO> attributes = schema
						.getAttributes();
				if (attributes != null) {
					for (int i = 0; i < attributes.size(); i++) {
						MessageSchemaAttributeEO attribute = attributes.get(i);

						String schemaName = attribute.getSchemaName();
						String schemaAttrTypeName = attribute
								.getSchemaAttrTypeName();
						if (schemaName == null || schemaAttrTypeName == null) {
							logger
									.error("key attributes are not specified for the schema");
							throw new NoKeyAttributeException(
									"key attributes are not specified for the schema");
						} else {
							List<MessageSchemaEO> schemaList = super
									.getByCriteria(DetachedCriteria.forClass(
											MessageSchemaEO.class).add(
											Restrictions.eq("schemaName",
													schemaName)));
							// set id to the attribute
							attribute.setSchemaId(schemaList.get(0)
									.getSchemaId());
							List<MessageSchemaEO> schemaTypeList = super
									.getByCriteria(DetachedCriteria.forClass(
											MessageSchemaEO.class).add(
											Restrictions.eq("schemaName",
													schemaAttrTypeName)));
							if (schemaTypeList.size() == 0) {
								logger
										.error("Type set in the attribute descriptor is not present");
								throw new InvalidAttributeSchemaException(
										"The type schema "
												+ "'"
												+ schemaAttrTypeName
												+ "'"
												+ " is not present in the system");
							} else {
								// set schema type id to the attribute
								attribute.setSchemaAttrType(schemaTypeList.get(
										0).getSchemaId());
							}
							messageSchemaAttributeDAO
									.saveSchemaAttribute(attribute);
						}
					}
				}

			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.dao.MessageSchemaDAO#deleteSchema
	 *      (java.lang.String)
	 */
	public void deleteSchema(String schemaName) throws SchemaServiceException {
		List<MessageSchemaEO> schemaList = super.getByCriteria(DetachedCriteria
				.forClass(MessageSchemaEO.class).add(
						Restrictions.eq("schemaName", schemaName)));
		MessageSchemaEO schema = schemaList.get(0);
		List<MessageSchemaAttributeEO> attributes = schema.getAttributes();

		if (!attributes.isEmpty()) {
			super.delete(schemaList.get(0));
		} else {

			logger
					.error("Couldn't delete.. there are dependencies for this schema");
			throw new SchemaDeleteException(
					"Cannot delete the schema "
							+ "'"
							+ schemaName
							+ "'"
							+ ". dependencies exist for the schema specified for delete");

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.teevra.services.schema.dao.MessageSchemaDAO#
	 * deleteSchemaTree(java.lang.Long)
	 */

	public void deleteSchemaTree(Long rootSchemaId)
			throws SchemaServiceException {

		List<MessageSchemaEO> schemasToDelete = new ArrayList<MessageSchemaEO>();
		List<MessageSchemaEO> schemaList = super.getByCriteria(DetachedCriteria
				.forClass(MessageSchemaEO.class).add(
						Restrictions.eq("schemaId", rootSchemaId)));
		MessageSchemaEO rootSchema = schemaList.get(0);

		// Get the non primitive schemas in the tree
		schemasToDelete = getSchemasToDelete(schemasToDelete, rootSchema);

		// delete atributes and schemaRaw for all the schemas
		for (int i = 0; i < schemasToDelete.size(); i++) {
			deleteSchemaDetails(schemasToDelete.get(i));
		}

		// delete the schemas
		for (int i = 0; i < schemasToDelete.size(); i++) {
			super.delete(schemasToDelete.get(i));
		}

	}

	/**
	 * Deletes the attributes and the rawMessage associated with the schema(if
	 * exists) in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @param schema
	 * @throws SchemaServiceException
	 */
	private void deleteSchemaDetails(MessageSchemaEO schema)
			throws SchemaServiceException {
		// delete raw data of the schema if exists
		if (schema.getSchemaRaw() != null) {
			messageSchemaRawDAO.deleteSchemaRaw(schema.getSchemaRaw());
		}

		// delete all the schemas
		List<MessageSchemaAttributeEO> attributes = schema.getAttributes();
		for (int i = 0; i < attributes.size(); i++) {
			messageSchemaAttributeDAO.deleteSchemaAttribute(attributes.get(i));
		}
	}

	/**
	 * Takes the root schema and gets all the schemas in the object tree and in
	 * the process delete the attributes
	 * 
	 * @precondition
	 * @postcondition
	 * @param schemasToDelete
	 *            a list of schemas
	 * @param rootSchema
	 * @return the list of schemas
	 */
	private List<MessageSchemaEO> getSchemasToDelete(
			List<MessageSchemaEO> schemasToDelete, MessageSchemaEO rootSchema) {

		if (!rootSchema.isSchemaIsPrimitive()) {

			schemasToDelete.add(rootSchema);
			List<MessageSchemaAttributeEO> attributes = rootSchema
					.getAttributes();
			for (int i = 0; i < attributes.size(); i++) {
				MessageSchemaAttributeEO attribute = attributes.get(i);
				long schemaAttrType = attribute.getSchemaAttrType();

				List<MessageSchemaEO> schemaTypeList = super
						.getByCriteria(DetachedCriteria.forClass(
								MessageSchemaEO.class).add(
								Restrictions.eq("schemaId", schemaAttrType)));

				getSchemasToDelete(schemasToDelete, schemaTypeList.get(0));
			}
		}
		return schemasToDelete;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.dao.MessageSchemaDAO#loadSchema ()
	 */
	public void loadSchema() {
		ObjectDescriptorCache objectDescriptorCache = ObjectDescriptorCache
				.getInstance();
		Map<String, MessageSchemaEO> objectDesriptorMap = new HashMap<String, MessageSchemaEO>();
		String query = null;
		query = "from MessageSchemaEO schema ";
		List<MessageSchemaEO> schemaList = super.getByQuery(query);

		for (MessageSchemaEO schema : schemaList) {
			objectDesriptorMap.put(schema.getSchemaName(), schema);

		}

		Collection<MessageSchemaEO> schemas = objectDesriptorMap.values();
		for (MessageSchemaEO schema : schemas) {
			objectDescriptorCache.addDescriptor(schema.getSchemaName(), schema);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.dao.MessageSchemaDAO#loadSchema
	 *      (java.lang.String)
	 */
	public MessageSchemaEO loadSchema(String schemaName) {

		ObjectDescriptorCache objectDescriptorCache = ObjectDescriptorCache
				.getInstance();
		MessageSchemaEO schema = objectDescriptorCache
				.getDescriptor(schemaName);
		if (schema != null) {
			logger.info("Schema is already present in the Cache");
			return schema;
		} else {
			List<MessageSchemaEO> schemaList = super
					.getByCriteria(DetachedCriteria.forClass(
							MessageSchemaEO.class).add(
							Restrictions.eq("schemaName", schemaName)));
			MessageSchemaEO rootSchema = schemaList.get(0);
			// load all the schemas to the cache
			loadSchemasToCache(objectDescriptorCache, rootSchema);
			return rootSchema;
		}

	}

	/**
	 * Loads all the schemas in the tree specified by the root schema name to
	 * the cache iteratively
	 * 
	 * @precondition
	 * @postcondition
	 * @param objectDescriptorCache
	 * @param rootSchema
	 */
	private void loadSchemasToCache(
			ObjectDescriptorCache objectDescriptorCache,
			MessageSchemaEO rootSchema) {
		objectDescriptorCache.addDescriptor(rootSchema.getSchemaName(),
				rootSchema);
		if (!rootSchema.isSchemaIsPrimitive()) {
			List<MessageSchemaAttributeEO> attributes = rootSchema
					.getAttributes();
			for (int i = 0; i < attributes.size(); i++) {
				MessageSchemaAttributeEO attribute = attributes.get(i);
				long schemaAttrType = attribute.getSchemaAttrType();

				List<MessageSchemaEO> schemaTypeList = super
						.getByCriteria(DetachedCriteria.forClass(
								MessageSchemaEO.class).add(
								Restrictions.eq("schemaId", schemaAttrType)));

				loadSchemasToCache(objectDescriptorCache, schemaTypeList.get(0));

			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.dao.MessageSchemaDAO#saveSchemaTree
	 *      (java.util.Map,
	 *      com.headstrong.teevra.services.schema.eo.MessageSchemaEO)
	 */
	public void saveSchemaTree(Map<String, MessageSchemaEO> descriptorMap,
			MessageSchemaEO rootSchema) throws SchemaServiceException {

		// Save all the schemas
		saveSchemas(descriptorMap, rootSchema);

		// save all the attributes along with root Schema Description and
		// SchemaRaw if any

		saveSchemaDetails(descriptorMap, rootSchema);
	}

	/**
	 * Saves all the schemas in the tree specified by the root schema name
	 * iteratively
	 * 
	 * @precondition
	 * @postcondition
	 * @param descriptorMap
	 * @param rootSchema
	 * @throws SchemaServiceException
	 */
	private void saveSchemas(Map<String, MessageSchemaEO> descriptorMap,
			MessageSchemaEO rootSchema) throws SchemaServiceException {

		if (!rootSchema.isSchemaIsPrimitive()) {
			// check if schema name is provided
			if (rootSchema.getSchemaName() == null) {
				logger.error("key attributes are not specified for the schema");
				throw new NoKeyAttributeException(
						"Schema name is not specified for the schema");
			} else {
				List<MessageSchemaEO> schemaCheckList = super
						.getByCriteria(DetachedCriteria.forClass(
								MessageSchemaEO.class).add(
								Restrictions.eq("schemaName", rootSchema
										.getSchemaName())));
				// check if any schema with the name already exists in the
				// system
				if (!schemaCheckList.isEmpty()) {
					logger
							.error("A schema with the same name already exists in the system");
					throw new UniqueSchemaException("A schema with the name "
							+ "'" + rootSchema.getSchemaName() + "'"
							+ "already exists in the system");
				} else {
					// save the schema
					super.save(rootSchema);
					// iterate through the attributes
					// and get the schema type of the attributes

					List<MessageSchemaAttributeEO> attributes = rootSchema
							.getAttributes();
					for (MessageSchemaAttributeEO attribute : attributes) {
						String schemaAttrTypeName = attribute
								.getSchemaAttrTypeName();
						// check if the schema type is provided
						if (schemaAttrTypeName == null) {
							logger
									.error("key attributes are not specified for the schema");
							throw new NoKeyAttributeException(
									"key attributes are not specified for the schema");
						} else {
							// Repeat the process for the next schema
							saveSchemas(descriptorMap, descriptorMap
									.get(schemaAttrTypeName));

						}
					}
				}
			}
		}
	}

	/**
	 * Fetches all the attributes present in the schema tree and persist them.
	 * Saves the rootSchema Description and it's corresponding SchemaRaw
	 * 
	 * @precondition
	 * @postcondition
	 * @param descriptorMap
	 * @param rootSchema
	 * @throws SchemaServiceException
	 */
	private void saveSchemaDetails(Map<String, MessageSchemaEO> descriptorMap,
			MessageSchemaEO rootSchema) throws SchemaServiceException {

		if (!rootSchema.isSchemaIsPrimitive()) {
			String schemaName = rootSchema.getSchemaName();
			// Get the schemaId from database
			List<MessageSchemaEO> schemaList = super
					.getByCriteria(DetachedCriteria.forClass(
							MessageSchemaEO.class).add(
							Restrictions.eq("schemaName", schemaName)));
			// check if the schema contains any schemaRaw. if yes, set
			// schemaId and save it
			if (rootSchema.getSchemaRaw() != null) {
				MessageSchemaRawEO schemaRaw = new MessageSchemaRawEO();
				schemaRaw.setSchemaId(schemaList.get(0).getSchemaId());
				if (rootSchema.getSchemaRaw().getSchemaFormattedText() != null) {
					schemaRaw.setSchemaFormattedText(rootSchema.getSchemaRaw()
							.getSchemaFormattedText());
				}
				schemaRaw.setCreatedBy(rootSchema.getCreatedBy());
				schemaRaw.setCreatedDate(rootSchema.getCreatedDate());
				schemaRaw.setModifiedBy(rootSchema.getModifiedBy());
				schemaRaw.setModifiedDate(rootSchema.getModifiedDate());
				messageSchemaRawDAO.saveSchemaRaw(schemaRaw);
			}

			List<MessageSchemaAttributeEO> attributes = rootSchema
					.getAttributes();
			for (MessageSchemaAttributeEO attribute : attributes) {

				String schemaAttrTypeName = attribute.getSchemaAttrTypeName();
				// check if schema name and the schema type name of the
				// attributes are provided
				if (schemaName == null || schemaAttrTypeName == null) {
					logger
							.error("key attributes are not specified for the schema");
					throw new NoKeyAttributeException(
							"Either Schema name or type name is not specified for the attribute");
				} else {
					attribute.setSchemaId(schemaList.get(0).getSchemaId());
					// from DB, set the schemaId of the schemaType of the
					// attribute
					List<MessageSchemaEO> schemaTypeList = super
							.getByCriteria(DetachedCriteria.forClass(
									MessageSchemaEO.class).add(
									Restrictions.eq("schemaName",
											schemaAttrTypeName)));
					// check if the schemaType is in the system then proceed
					// with setting Id
					if (schemaTypeList.size() == 0) {
						logger
								.error("Type set in the attribute descriptor is not present");
						throw new InvalidAttributeSchemaException(
								"The type schema" + "'" + schemaAttrTypeName
										+ "'" + " not present in the system");
					} else {
						attribute.setSchemaAttrType(schemaTypeList.get(0)
								.getSchemaId());
						// save the attribute
						messageSchemaAttributeDAO
								.saveSchemaAttribute(attribute);
						// Repeat the process for the next schema
						saveSchemaDetails(descriptorMap, descriptorMap
								.get(schemaAttrTypeName));

					}
				}

			}

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.dao.MessageSchemaDAO#getSchemas ()
	 */
	public List<MessageSchemaEO> getSchemas() throws SchemaServiceException {
		String query = null;
		query = "from MessageSchemaEO schema";
		List<MessageSchemaEO> schemaList = super.getByQuery(query);
		return schemaList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.dao.MessageSchemaDAO#getPublicSchemas ()
	 */
	public List<MessageSchemaEO> getPublicSchemas()
			throws SchemaServiceException {
		return super.getByCriteria(DetachedCriteria.forClass(
				MessageSchemaEO.class).add(
				Restrictions.eq("schemaIsPublic", true)));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.dao.MessageSchemaDAO#saveXMLSchema
	 *      (com.headstrong.teevra.services.schema.eo.MessageSchemaEO,java.lang.String)
	 */
	public MessageSchemaEO saveXMLSchema(MessageSchemaEO schemaEO,
			String schemaText) throws SchemaServiceException {

		// if the schema is already saved in the system delete it and save it
		// again
		if (schemaEO.getSchemaId() != null) {
			deleteSchemaTree(schemaEO.getSchemaId());
		}
		String rootSchemaName = null;
		Map<String, MessageSchemaEO> descriptorMap = new HashMap<String, MessageSchemaEO>();
		String rootType = "";
		MessageSchemaEO rootSchema = null;
		XSParser parser = new XSParser();
		parser.setValidating(false);

		try {
			XSSchema schema = parser.parse(new InputSource(new StringReader(
					schemaText)));
			XSType[] types = schema.getTypes();
			for (XSType type : types) {

				if (type.isSimple()) {
					// if we have any simple types in the schema at root level,
					// do operations
				} else {

					// parse the xml schema and get the descriptor map along
					// with the rootSchema type
					rootType = buildSchemaTreeTypes(schemaEO, type,
							descriptorMap);

					// Set Schema Description and Raw Data to the parent Schema
					// and put it back in map
					rootSchema = descriptorMap.get(rootType);
					rootSchema.setSchemaDesc(schemaEO.getSchemaDesc());
					rootSchema.setSchemaIsPublic(true);
					MessageSchemaRawEO schemaRaw = schemaEO.getSchemaRaw();
					schemaRaw.setSchemaFormattedText(schemaRaw
							.getSchemaFormattedText());
					rootSchema.setSchemaRaw(schemaRaw);
					rootSchemaName = rootSchema.getSchemaName();
					descriptorMap.put(rootSchemaName, rootSchema);
					break;
				}
			}
		} catch (ParserConfigurationException e) {
			logger
					.error(
							"ParserConfigurationException while parsing the schema XML text ",
							e);
			throw new SchemaServiceException(e.getMessage());
		} catch (SAXException e) {
			logger.error("SAXException while parsing the schema XML text ", e);
			throw new SchemaServiceException(e.getMessage());
		} catch (IOException e) {
			logger.error("IOException while parsing the schema XML text ", e);
			throw new SchemaServiceException(e.getMessage());
		}

		// save the schematree
		saveSchemaTree(descriptorMap, rootSchema);
		// get the root schema tree saved
		return rootSchema;
		// return super.getByCriteria(
		// DetachedCriteria.forClass(MessageSchemaEO.class).add(
		// Restrictions.eq("schemaName", rootSchemaName))).get(0);
	}

	/**
	 * 
	 * 
	 * @precondition
	 * @postcondition
	 * @param schemaEO
	 * @param type
	 * @param descriptorMap
	 * @return rootSchema type
	 */
	private String buildSchemaTreeTypes(MessageSchemaEO schemaEO, XSType type,
			Map<String, MessageSchemaEO> descriptorMap)
			throws SchemaServiceException {

		XSComplexType complexType = null;
		try {
			complexType = type.getComplexType();
		} catch (SAXException e) {
			logger.error("Exception while obtaining complex type from XSType ",
					e);
			throw new SchemaServiceException(e.getMessage());
		}

		MessageSchemaEO schema = new MessageSchemaEO();
		schema.setSchemaName(type.getName().getLocalName());
		schema.setCreatedBy(schemaEO.getCreatedBy());
		schema.setCreatedDate(schemaEO.getCreatedDate());
		schema.setModifiedBy(schemaEO.getModifiedBy());
		schema.setModifiedDate(schemaEO.getModifiedDate());

		// list to store complex attributes
		List<XSType> complexAttributes = new ArrayList<XSType>();

		if (!complexType.hasSimpleContent()) {
			XSParticle particle = null;
			try {
				particle = complexType.getParticle();
			} catch (SAXException e) {
				logger
						.error(
								"Exception while obtaining XSParticle from complex type ",
								e);
				throw new SchemaServiceException(e.getMessage());
			}
			if (particle.isGroup()) {
				XSGroup group = particle.getGroup();
				// List of attributes of the schema
				XSParticle[] particles = group.getParticles();

				List<MessageSchemaAttributeEO> attributes = new ArrayList<MessageSchemaAttributeEO>();
				for (int j = 0; j < particles.length; j++) {
					if (particles[j].isElement()) {
						XSElement element = particles[j].getElement();

						// create MessageSchemaAttributeEO for the attribute and
						// add it
						// to the attributes list of the schema
						MessageSchemaAttributeEO attribute = new MessageSchemaAttributeEO();
						attribute.setSchemaAttrName(element.getName()
								.getLocalName());
						attribute.setSchemaAttrTypeName(element.getType()
								.getName().getLocalName());
						attribute.setCreatedBy(schemaEO.getCreatedBy());
						attribute.setCreatedDate(schemaEO.getCreatedDate());
						attribute.setModifiedBy(schemaEO.getModifiedBy());
						attribute.setModifiedDate(schemaEO.getModifiedDate());
						attributes.add(attribute);

						if (element.getType().isSimple()) {

							// if the element is of simple type, create a
							// primitive schema and add it to the descriptor map
							// if it is not there in the map

							if (!descriptorMap.containsKey(element.getType()
									.getName().getLocalName())) {

								MessageSchemaEO primitiveSchema = new MessageSchemaEO();
								primitiveSchema.setSchemaName(element.getType()
										.getName().getLocalName());
								primitiveSchema.setSchemaIsPrimitive(true);
								descriptorMap.put(element.getType().getName()
										.getLocalName(), primitiveSchema);
							}
						} else if (!element.getType().isSimple()) {
							// if the element is complex type, add it to the
							// list of complexAttributes to repeat the process
							complexAttributes.add(element.getType());
						}
					}
				}
				schema.setAttributes(attributes);
				descriptorMap.put(schema.getSchemaName(), schema);
			}
		}
		for (XSType complexAttribute : complexAttributes) {
			buildSchemaTreeTypes(schemaEO, complexAttribute, descriptorMap);
		}
		return type.getName().getLocalName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.schema.MessageSchemaDAO#getSchemas
	 *      (com.headstrong.teevra.services.schema.eo.MessageSchemaEO)
	 */
	public List<MessageSchemaEO> getSchemas(MessageSchemaEO criteria)
			throws SchemaServiceException {

		return super.getByCriteria(DetachedCriteria.forClass(
				MessageSchemaEO.class).add(
				Restrictions.eq("schemaId", criteria.getSchemaId())));

	}

	/**
	 * @return the messageSchemaAttributeDAO
	 */
	public MessageSchemaAttributeDAO getMessageSchemaAttributeDAO() {
		return messageSchemaAttributeDAO;
	}

	/**
	 * @param messageSchemaAttributeDAO
	 *            the messageSchemaAttributeDAO to set
	 */
	public void setMessageSchemaAttributeDAO(
			MessageSchemaAttributeDAO messageSchemaAttributeDAO) {
		this.messageSchemaAttributeDAO = messageSchemaAttributeDAO;
	}

	/**
	 * @return the messageSchemaRawDAO
	 */
	public MessageSchemaRawDAO getMessageSchemaRawDAO() {
		return messageSchemaRawDAO;
	}

	/**
	 * @param messageSchemaRawDAO
	 *            the messageSchemaRawDAO to set
	 */
	public void setMessageSchemaRawDAO(MessageSchemaRawDAO messageSchemaRawDAO) {
		this.messageSchemaRawDAO = messageSchemaRawDAO;
	}
}

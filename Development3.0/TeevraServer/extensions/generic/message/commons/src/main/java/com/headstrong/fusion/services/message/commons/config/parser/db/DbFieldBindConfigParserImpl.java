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
 * $Id: DbBindingConfigurationParser.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 1, 2008
 */

package com.headstrong.fusion.services.message.commons.config.parser.db;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.services.config.exception.ServiceConfigurationParseException;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;

/**
 * configuration parser for database field binding. configuration format used by
 * database parser component.
 * <p>
 * <b>sample configuration</b>
 * 
 * <pre>
 * &lt;binding&gt;
 * 		&lt;field name=&quot;field1&quot; mapto=&quot;field1&quot; /&gt; 
 * 		&lt;field name=&quot;field2&quot; mapto=&quot;field2&quot; /&gt; 
 * &lt;/binding&gt;
 * </pre>
 */
public class DbFieldBindConfigParserImpl implements DbFieldBindConfigParser {

	private static final Logger logger = LoggerFactory
			.getLogger(DbFieldBindConfigParserImpl.class);
	private static final String BINDING = "binding";
	private static final String FIELD = "field";
	private static final String NAME = "name";
	private static final String MAPTO = "mapto";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.config.parse.ServiceConfigurationParser#parseConfiguration(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public Object parseConfiguration(Object configuration)
			throws ServiceConfigurationParseException {

		/**
		 * As this is flat
		 */
		SchemaDescriptor<DbFieldBinding> dbSchemaDescriptor = new SchemaDescriptor<DbFieldBinding>();

		SAXBuilder builder = new SAXBuilder();
		Document document = null;
		try {
			document = builder
					.build(new StringReader(configuration.toString()));
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		} catch (IOException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}
		Element root = null;
		try {
			root = (Element) XPath.selectSingleNode(document, BINDING);
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}

		/**
		 * Select all fields.
		 */
		List<Element> fields = null;
		try {
			fields = (List<Element>) XPath.selectNodes(root, FIELD);
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}

		String fieldName = null;
		String mapToField = null;

		for (Element field : fields) {
			Attribute name = field.getAttribute(NAME);
			// No null check as its a mandatory field.
			fieldName = name.getValue().trim();
			Attribute mapTo = field.getAttribute(MAPTO);
			// No null check as its a mandatory field.
			mapToField = mapTo.getValue().trim();
			DbFieldConfig dbConfig = new DbFieldConfig();
			dbConfig.setFieldName(fieldName);
			dbConfig.setDbField(mapToField);
			// Add new child schema.
			this.addSchema(dbSchemaDescriptor, dbConfig);
		}
		return dbSchemaDescriptor;
	}

	/**
	 * Converts the flat configuration to hierarchical configuration.
	 * @param schemaDescriptor database schema descriptor.
	 * @param dbConfig database field mapping configuration.
	 * @throws ServiceConfigurationParseException
	 */
	private void addSchema(SchemaDescriptor<DbFieldBinding> schemaDescriptor,
			DbFieldConfig dbConfig) throws ServiceConfigurationParseException {
		int i = dbConfig.getFieldName().indexOf(".");
		if (i > -1) {
			// break the fields and add. A.B.C
			String parentFieldName = dbConfig.getFieldName().substring(0, i); // A
			SchemaDescriptor<DbFieldBinding> parent = null;
			if (schemaDescriptor.getFieldName() != null
					&& schemaDescriptor.getFieldName().equals(parentFieldName)) {
				parent = schemaDescriptor;
			} else {
				parent = this.findChild(schemaDescriptor, parentFieldName);
			}
			if (parent == null) {
				// Scenario -- A.B.C
				// since it gets the data from DB and currently it supports only
				// single query.
				// the input data would be flat. so there wouldn't be any direct
				// binding details
				// for A and B in the configuration provided. That's why the
				// parser generates
				// in-between parent descriptor objects if required. in this
				// case for A and B
				// recursively.
				parent = new SchemaDescriptor<DbFieldBinding>();
				parent.setFieldName(parentFieldName);
				schemaDescriptor.getChildren().add(parent);
			}
			dbConfig.setFieldName(dbConfig.getFieldName().substring(i + 1));
			// change remove the parent xpath in the full qualified xpath of
			// the child.
			this.addSchema(parent, dbConfig);
		} else {
			// There is no dot should be added directly.
			SchemaDescriptor<DbFieldBinding> child = new SchemaDescriptor<DbFieldBinding>();
			child.setFieldName(dbConfig.getFieldName());
			DbFieldBinding binding = new DbFieldBinding();
			binding.setDbField(dbConfig.getDbField());
			child.setBinding(binding);
			schemaDescriptor.getChildren().add(child);
		}

	}

	/**
	 * searches for the field name in the schema descriptor.
	 * 
	 * @param schemaDescriptor database schema descriptor.
	 * @param fieldName field name.
	 * @return child schema descriptor.
	 */
	private SchemaDescriptor<DbFieldBinding> findChild(
			SchemaDescriptor<DbFieldBinding> schemaDescriptor, String fieldName) {
		SchemaDescriptor<DbFieldBinding> childSchema = null;
		for (SchemaDescriptor<DbFieldBinding> child : schemaDescriptor
				.getChildren()) {
			if (child.getFieldName() != null
					&& child.getFieldName().equals(fieldName)) {
				childSchema = child;
				break;
			}
		}
		return childSchema;
	}

}

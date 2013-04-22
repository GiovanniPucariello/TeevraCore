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
 * 		&lt;field name=&quot;field1&quot; index=&quot;1&quot; /&gt; 
 * 		&lt;field name=&quot;field2&quot; index=&quot;2&quot; /&gt; 
 * &lt;/binding&gt;
 * </pre>
 */
public class DbFieldIndexBindConfigParserImpl implements
		DbFieldIndexBindConfigParser {

	private static final Logger logger = LoggerFactory
			.getLogger(DbFieldIndexBindConfigParserImpl.class);
	private static final String BINDING = "binding";
	private static final String FIELD = "field";
	private static final String NAME = "name";
	private static final String INDEX = "index";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.config.parse.ServiceConfigurationParser#parseConfiguration(java.lang.Object)
	 */
	public Object parseConfiguration(Object configuration)
			throws ServiceConfigurationParseException {

		/**
		 * As this is flat
		 */
		SchemaDescriptor<DbFieldIndexBinding> dbSchemaDescriptor = new SchemaDescriptor<DbFieldIndexBinding>();

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
		for (Element field : fields) {
			Attribute name = field.getAttribute(NAME);
			fieldName = name.getValue().trim();
			Attribute dbField = field.getAttribute(INDEX);
			SchemaDescriptor<DbFieldIndexBinding> childSchema = new SchemaDescriptor<DbFieldIndexBinding>();
			childSchema.setFieldName(fieldName);
			DbFieldIndexBinding binding = new DbFieldIndexBinding();
			binding
					.setDbFieldIndex(Integer
							.parseInt(dbField.getValue().trim()));
			childSchema.setBinding(binding);
			// Add new child schema.
			dbSchemaDescriptor.getChildren().add(childSchema);
		}
		return dbSchemaDescriptor;
	}

}

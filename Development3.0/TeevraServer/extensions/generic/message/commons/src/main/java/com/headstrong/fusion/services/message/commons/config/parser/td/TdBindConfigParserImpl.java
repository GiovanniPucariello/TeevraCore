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
 * $Id: TdBindingConfigurationParser.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 1, 2008
 */

package com.headstrong.fusion.services.message.commons.config.parser.td;

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
 * configuration parser for tag-delimited binding. configuration format used by
 * following components.
 * <li>tag-delimited parser
 * <li>tag-delimited formatter
 * <p>
 * <b>sample configuration</b>
 * 
 * <pre>
 * &lt;binding&gt;
 * 		&lt;field name=&quot;field1&quot; index=&quot;1&quot; /&gt; 
 * 		&lt;field name=&quot;field2&quot; index=&quot;11&quot; /&gt; 
 * &lt;/binding&gt;
 * </pre>
 */
public class TdBindConfigParserImpl implements TdBindConfigParser {

	private static final Logger logger = LoggerFactory
			.getLogger(TdBindConfigParserImpl.class);
	private static final String BINDING = "binding";
	private static final String FIELD = "field";
	private static final String NAME = "name";
	private static final String INDEX = "index";

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
		SchemaDescriptor<ColumnIndexBinding> tdSchemaDescriptor = new SchemaDescriptor<ColumnIndexBinding>();

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

		parseBinding(root, tdSchemaDescriptor);
		return tdSchemaDescriptor;
	}

	/**
	 * Parses the binding.
	 * @param binding
	 * @param tagDelimitedSchemaDescriptor
	 * @throws ServiceConfigurationParseException
	 */
	@SuppressWarnings("unchecked")
	public void parseBinding(Element binding,
			SchemaDescriptor<ColumnIndexBinding> tagDelimitedSchemaDescriptor)
			throws ServiceConfigurationParseException {

		/**
		 * Select all fields.
		 */
		List<Element> fields = null;
		try {
			fields = (List<Element>) XPath.selectNodes(binding, FIELD);
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}
		String fieldName = null;
		int columnIndex;
		for (Element field : fields) {
			Attribute name = field.getAttribute(NAME);
			fieldName = name.getValue().trim();
			Attribute indexAttr = field.getAttribute(INDEX);
			columnIndex = Integer.parseInt(indexAttr.getValue().trim());
			ColumnIndexConfig indexConfig = new ColumnIndexConfig();
			indexConfig.setFieldName(fieldName);
			indexConfig.setColumnIndex(columnIndex);
			// Add new child schema.
			this.addSchema(tagDelimitedSchemaDescriptor, indexConfig);
		}
	}

	/**
	 * @param schemaDescriptor
	 * @param fieldName
	 * @param xPath
	 * @throws ServiceConfigurationParseException
	 */
	private void addSchema(
			SchemaDescriptor<ColumnIndexBinding> schemaDescriptor,
			ColumnIndexConfig columnIndexConfig)
			throws ServiceConfigurationParseException {
		int i = columnIndexConfig.getFieldName().indexOf(".");
		if (i > -1) {
			// break the fields and add. A.B.C
			String parentFieldName = columnIndexConfig.getFieldName()
					.substring(0, i); // A
			SchemaDescriptor<ColumnIndexBinding> parent = null;
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
				// the input data would be flat. so there would'nt be any direct
				// binding details
				// for A and B in the configuration provided. That's why the
				// parser generates
				// in-between parent descriptor objects if required. in this
				// case for A and B
				// recursively.
				parent = new SchemaDescriptor<ColumnIndexBinding>();
				parent.setFieldName(parentFieldName);
				schemaDescriptor.getChildren().add(parent);
			}
			columnIndexConfig.setFieldName(columnIndexConfig.getFieldName()
					.substring(i + 1));
			// change remove the parent xpath in the full qualified xpath of
			// the child.
			this.addSchema(parent, columnIndexConfig);
		} else {
			// There is no dot should be added directly.
			SchemaDescriptor<ColumnIndexBinding> child = new SchemaDescriptor<ColumnIndexBinding>();
			child.setFieldName(columnIndexConfig.getFieldName());
			ColumnIndexBinding binding = new ColumnIndexBinding();
			binding.setColumnIndex(columnIndexConfig.getColumnIndex());
			child.setBinding(binding);
			schemaDescriptor.getChildren().add(child);
		}

	}

	/**
	 * 
	 * @param schemaDescriptor
	 * @param fieldName
	 * @return
	 */
	private SchemaDescriptor<ColumnIndexBinding> findChild(
			SchemaDescriptor<ColumnIndexBinding> schemaDescriptor,
			String fieldName) {
		SchemaDescriptor<ColumnIndexBinding> childSchema = null;
		for (SchemaDescriptor<ColumnIndexBinding> child : schemaDescriptor
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

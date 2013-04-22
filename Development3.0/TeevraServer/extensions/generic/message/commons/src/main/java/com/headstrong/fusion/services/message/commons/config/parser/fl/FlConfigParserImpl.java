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
 * $Id: FixedLengthConfigurationParserImpl.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 25, 2008 
 */

package com.headstrong.fusion.services.message.commons.config.parser.fl;

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
import com.headstrong.fusion.services.message.commons.config.parser.td.TdBindConfigParserImpl;

/**
 * configuration parser for fixed length binding. configuration format used by
 * following components.
 * <li>fixed length parser
 * <li>fixed length formatter
 * <p>
 * <b>sample configuration</b>
 * 
 * <pre>
 * &lt;binding&gt;
 * 		&lt;field name=&quot;field1&quot; start=&quot;1&quot; end=&quot;10&quot;/&gt; 
 * 		&lt;field name=&quot;field2&quot; start=&quot;11&quot; end=&quot;20&quot;/&gt; 
 * &lt;/binding&gt;
 * </pre>
 */
public class FlConfigParserImpl implements FlConfigParser {

	private static final Logger logger = LoggerFactory
			.getLogger(TdBindConfigParserImpl.class);
	protected static final String BINDING = "binding";
	protected static final String FIELD = "field";
	protected static final String NAME = "name";
	protected static final String START_INDEX = "start";
	protected static final String END_INDEX = "end";
	protected static final String PRINT_TYPE = "printType";

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
		SchemaDescriptor<FlBinding> fixedLengthSchemaDescriptor = new SchemaDescriptor<FlBinding>();

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
		this.parseBinding(root, fixedLengthSchemaDescriptor);
		return fixedLengthSchemaDescriptor;
	}

	/**
	 * Parses the binding.
	 * 
	 * @precondition
	 * @postcondition
	 * @param binding
	 * @param fixedLengthSchemaDescriptor
	 * @throws ServiceConfigurationParseException
	 */
	@SuppressWarnings("unchecked")
	public void parseBinding(Element binding,
			SchemaDescriptor<FlBinding> fixedLengthSchemaDescriptor)
			throws ServiceConfigurationParseException {
		/**
		 * Select all fields.
		 */
		List<Element> fields = null;
		try {
			fields = (List<Element>) XPath.selectNodes(binding, FIELD);
		} catch (JDOMException e) {
			logger.error("Error parsing the fields in configuration xml", e);
			throw new ServiceConfigurationParseException(e);
		}

		String fieldName = null;
		int startIndex;
		int endIndex;
		for (Element field : fields) {

			FlConfig flConfig = new FlConfig();
			Attribute name = field.getAttribute(NAME);
			fieldName = name.getValue().trim();
			startIndex = Integer.parseInt(field.getAttribute(START_INDEX)
					.getValue().trim());
			endIndex = Integer.parseInt(field.getAttribute(END_INDEX)
					.getValue().trim());

			Attribute printType = field.getAttribute(PRINT_TYPE);
			if (printType != null) {
				flConfig.setPrintType(printType.getValue());
			}
			flConfig.setFieldName(fieldName);
			flConfig.setStartIndex(startIndex);
			flConfig.setEndIndex(endIndex);
			// Add new child schema.
			this.addSchema(fixedLengthSchemaDescriptor, flConfig);
		}
	}

	/**
	 * @param schemaDescriptor
	 * @param fieldName
	 * @param xPath
	 * @throws ServiceConfigurationParseException
	 */
	private void addSchema(SchemaDescriptor<FlBinding> schemaDescriptor,
			FlConfig fixedLengthConfig)
			throws ServiceConfigurationParseException {
		int i = fixedLengthConfig.getFieldName().indexOf(".");
		if (i > -1) {
			// break the fields and add. A.B.C
			String parentFieldName = fixedLengthConfig.getFieldName()
					.substring(0, i); // A
			SchemaDescriptor<FlBinding> parent = null;
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
				parent = new SchemaDescriptor<FlBinding>();
				parent.setFieldName(parentFieldName);
				schemaDescriptor.getChildren().add(parent);
			}
			fixedLengthConfig.setFieldName(fixedLengthConfig.getFieldName()
					.substring(i + 1));
			// change remove the parent xpath in the full qualified xpath of
			// the child.
			this.addSchema(parent, fixedLengthConfig);
		} else {
			// There is no dot should be added directly.
			SchemaDescriptor<FlBinding> child = new SchemaDescriptor<FlBinding>();
			child.setFieldName(fixedLengthConfig.getFieldName());
			FlBinding binding = new FlBinding();
			binding.setStartIndex(fixedLengthConfig.getStartIndex());
			binding.setEndIndex(fixedLengthConfig.getEndIndex());
			binding.setPrintType(fixedLengthConfig.getPrintType());
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
	private SchemaDescriptor<FlBinding> findChild(
			SchemaDescriptor<FlBinding> schemaDescriptor, String fieldName) {
		SchemaDescriptor<FlBinding> childSchema = null;
		for (SchemaDescriptor<FlBinding> child : schemaDescriptor.getChildren()) {
			if (child.getFieldName() != null
					&& child.getFieldName().equals(fieldName)) {
				childSchema = child;
				break;
			}
		}
		return childSchema;
	}

}

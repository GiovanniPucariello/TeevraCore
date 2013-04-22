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
 * $Id: XmlBindingConfigurationParser.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 1, 2008
 */

package com.headstrong.fusion.services.message.commons.config.parser.xml;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
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
 * 		&lt;field name=&quot;field1&quot; xpath=&quot;/root/field1&quot; /&gt; 
 * 		&lt;field name=&quot;field2&quot; xpath=&quot;/root/field2&quot; /&gt; 
 * &lt;/binding&gt;
 * </pre>
 */
public class XmlBindConfigParserImpl implements XmlBindConfigParser {

	private static final Logger logger = LoggerFactory
			.getLogger(XmlBindConfigParserImpl.class);

	private static final String BINDING = "binding";
	private static final String FIELD = "field";

	public Object parseConfiguration(Object configuration)
			throws ServiceConfigurationParseException {
		SchemaDescriptor<XPathBinding> xmlSchemaDescriptor = new SchemaDescriptor<XPathBinding>();

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
		String xPathBinding = null;
		List<XmlConfiguration> xmlConfigList = new ArrayList<XmlConfiguration>();
		for (Element field : fields) {

			Attribute name = field.getAttribute("name");
			fieldName = name.getValue().trim();
			Attribute xPath = field.getAttribute("xpath");
			xPathBinding = xPath.getValue().trim();
			XmlConfiguration xmlConfig = new XmlConfiguration();
			xmlConfig.setFieldName(fieldName);
			xmlConfig.setXPath(xPathBinding);
			xmlConfigList.add(xmlConfig);
		}

		// Sort the collection
		Collections.sort(xmlConfigList);

		// add all the schema
		for (XmlConfiguration xmlConfig : xmlConfigList) {
			this.addSchema(xmlSchemaDescriptor, xmlConfig);
		}
		return xmlSchemaDescriptor;
	}

	/**
	 * @param schemaDescriptor
	 * @param fieldName
	 * @param xPath
	 * @throws ServiceConfigurationParseException
	 */
	private void addSchema(SchemaDescriptor<XPathBinding> schemaDescriptor,
			XmlConfiguration xmlConfig)
			throws ServiceConfigurationParseException {

		int i = xmlConfig.getFieldName().indexOf(".");
		if (i > -1) {
			// break the fields and add. A.B.C
			String parentFieldName = xmlConfig.getFieldName().substring(0, i); // A
			SchemaDescriptor<XPathBinding> parent = null;
			parent = this.findChild(schemaDescriptor, parentFieldName);
			if (parent == null) {
				throw new ServiceConfigurationParseException(
						"invalid configuration.");
			}

			xmlConfig.setFieldName(xmlConfig.getFieldName().substring(i + 1));
			// change remove the parent xpath in the full qualified xpath of
			// the child.
			xmlConfig.setXPath(xmlConfig.getXPath().replace(
					parent.getBinding().getXPath(), ""));
			// Remove leading "/" if present. Needed in case of attributes.
			if (xmlConfig.getXPath().startsWith("/")) {
				xmlConfig.setXPath(xmlConfig.getXPath().replace("/", ""));
			}
			this.addSchema(parent, xmlConfig);
		} else {
			// There is no dot should be added directly.
			SchemaDescriptor<XPathBinding> child = new SchemaDescriptor<XPathBinding>();
			child.setFieldName(xmlConfig.getFieldName());
			XPathBinding binding = new XPathBinding();
			binding.setXPath(xmlConfig.getXPath());
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
	private SchemaDescriptor<XPathBinding> findChild(
			SchemaDescriptor<XPathBinding> schemaDescriptor, String fieldName) {
		SchemaDescriptor<XPathBinding> childSchema = null;
		for (SchemaDescriptor<XPathBinding> child : schemaDescriptor
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

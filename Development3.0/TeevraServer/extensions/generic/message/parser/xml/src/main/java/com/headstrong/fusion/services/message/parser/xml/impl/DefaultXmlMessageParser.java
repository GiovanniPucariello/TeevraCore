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
 * $Id: MessageParser.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 17, 2008 
 */

package com.headstrong.fusion.services.message.parser.xml.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;

import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.Primitive;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.xml.XPathBinding;

/**
 * This class fills DefaultBusinessObject will data based on the XML payload.
 * 
 */
public class DefaultXmlMessageParser implements XmlMessageParser {

	/**
	 * Relationship identifier for one to one relationship
	 */
	private static final String ONE2ONE = "121";
	/**
	 * Relationship identifier for one to many relationship
	 */
	private static final String ONE2MANY = "12M";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.parsers.xmlparser.impl.XMLMessageParser#parse(com.headstrong.fusion.services.schema.vo.BusinessObject,
	 *      com.headstrong.fusion.services.parsers.xmlparser.impl.XmlFieldDescriptor,
	 *      java.lang.String)
	 */
	public void parse(DefaultBusinessObject defaultBusinessObject,
			SchemaDescriptor<XPathBinding> schemaDesc, String xml)
			throws Exception {
		// Iteratively parse the XML.
		SAXBuilder builder = new SAXBuilder();
		// HACK : default namespace being removed.
		xml = xml.replaceAll(" *xmlns=\"[^>\"]*\"", "");

		Document document = builder.build(new StringReader(xml));
		Element root = document.getRootElement();
		// Parse the document.
		defaultBusinessObject.setAttributeValues(this.parseNode(defaultBusinessObject,
				schemaDesc, root));
	}

	/**
	 * 
	 * @param parentBO
	 *            Parent Business Object.
	 * @param parentFieldDesc
	 *            Corresponding Field Mapping
	 * @param parentNode
	 *            Parent Dom Node.
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public Map<String, Object> parseNode(DefaultBusinessObject parentBO,
			SchemaDescriptor<XPathBinding> schemaDesc, Object parentNode)
			throws Exception {
		Map<String, Object> attributes = new HashMap<String, Object>();
		// Get the Children.
		List<SchemaDescriptor<XPathBinding>> children = schemaDesc
				.getChildren();
		// Iteratively parse the document.
		for (SchemaDescriptor<XPathBinding> child : children) {
			// Get the Attribute Descriptor and Object Descriptor for the child
			// Node.
			AttributeDescriptor childAttributeDesc = parentBO
					.getObjectDescriptor().getAttribute(child.getFieldName());
			ObjectDescriptor childObjectDesc = childAttributeDesc.getType();

			// Add the business Object for the child node recursively.
			if (childObjectDesc.getPrimitive()) {
				attributes.put(child.getFieldName(), this.getPrimitiveValue(
						parentBO, parentNode, child));
			} else {
				// check the relationships and handle it accordingly.
				if (ONE2ONE.equals(childAttributeDesc.getAttrRelation())) {
					// If the child shares ONE2ONE relationship with the parent.
					Element element = (Element) XPath.selectSingleNode(
							parentNode, child.getBinding().getXPath());
					DefaultBusinessObject defaultBusinessObject = new DefaultBusinessObject();
					defaultBusinessObject.setObjectDescriptor(childAttributeDesc
							.getType());
					defaultBusinessObject.setAttributeValues(this.parseNode(
							defaultBusinessObject, child, element));
					attributes.put(child.getFieldName(), defaultBusinessObject);
				} else if (ONE2MANY
						.equals(childAttributeDesc.getAttrRelation())) {
					// TODO : check required if child schema is primitive
					// list would be of primitive type or else of
					// type BO.

					// If the child shares ONE2MANY relationship with the
					// parent.
					List<DefaultBusinessObject> values = new ArrayList<DefaultBusinessObject>();
					List<Element> elements = XPath.selectNodes(parentNode,
							child.getBinding().getXPath());
					// parse individual nodes
					for (Element element : elements) {
						DefaultBusinessObject defaultBusinessObject = new DefaultBusinessObject();
						defaultBusinessObject.setObjectDescriptor(childAttributeDesc
								.getType());
						defaultBusinessObject.setAttributeValues(this.parseNode(
								defaultBusinessObject, child, element));
						values.add(defaultBusinessObject);
					}
					attributes.put(child.getFieldName(), values);
				}
			}
		}
		return attributes;
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param parentBO
	 * @param parentNode
	 * @param child
	 * @throws Exception
	 */
	private Object getPrimitiveValue(DefaultBusinessObject parentBO,
			Object parentNode, SchemaDescriptor<XPathBinding> child)
			throws Exception {
		Object node = XPath.selectSingleNode(parentNode, child.getBinding()
				.getXPath());
		Object value = null;
		if (node instanceof Attribute) {
			Attribute attribute = (Attribute) node;
			value = attribute.getValue();
		} else {
			Element element = (Element) node;
			if (element != null) {
				value = element.getTextTrim();
			}
		}
		// convert the data type to actual type
		String primitiveType = parentBO.getObjectDescriptor().getAttribute(
				child.getFieldName()).getType().getDesc();
		Primitive primitive = Primitive.valueOf(primitiveType);
		value = primitive.eval(value);

		return value;
	}

	public static void main(String[] args) throws Exception {
		// Iteratively parse the XML.
		SAXBuilder builder = new SAXBuilder();
		// HACK : default namespace being removed.
		File file = new File("src/test/resources/TestData.xml");
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));
		StringBuffer message = new StringBuffer();
		String line = reader.readLine();
		while (line != null) {
			message.append(line);
			line = reader.readLine();
		}

		Document document = builder.build(new StringReader(message.toString()));
		Element root = document.getRootElement();
		Element element = (Element) XPath
				.selectSingleNode(root,
						"/data/testcase[@id='DefaultXmlMessageParserTest1']/test[@id > 2]");
		System.out.println(element.getText());
	}
}

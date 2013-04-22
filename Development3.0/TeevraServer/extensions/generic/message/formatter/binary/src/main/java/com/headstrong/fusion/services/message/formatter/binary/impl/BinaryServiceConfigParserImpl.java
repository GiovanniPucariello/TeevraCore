package com.headstrong.fusion.services.message.formatter.binary.impl;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.services.config.exception.ServiceConfigurationParseException;
import com.headstrong.fusion.services.message.formatter.binary.BinaryServiceConfigParser;
import com.headstrong.fusion.services.message.formatter.binary.config.BinaryElement;
import com.headstrong.fusion.services.message.formatter.binary.config.StructsConfigBean;

/**
 * Configuration parser both - structConfig & structFormatterConfig -
 * configuration files for BinaryParserFormatterService.
 * 
 * @author akrishnamoorthy
 * 
 */
public class BinaryServiceConfigParserImpl implements BinaryServiceConfigParser {
	private static final Logger logger = LoggerFactory
			.getLogger(BinaryServiceConfigParserImpl.class);
	// literals used in structFormatterConfig
	private static final String BINDING = "binding";
	private static final String BINDING_FIELD = "field";
	private static final String BINDING_FIELD_ATTR = "name";
	private static final String BINDING_STRUCT_FIELD = "structField";

	// literals used in structConfig
	private static final String STRUCT = "struct";
	private static final String STRUCT_TYPE_ATTR = "type";
	private static final String STRUCT_COMPLEX_TYPE = "complexType";
	private static final String STRUCT_TYPE_NAME_ATTR = "name";
	private static final String STRUCT_UNION_ATTR = "union";
	private static final String STRUCT_ROOT_ATTR = "root";
	private static final String STRUCT_SEQUENCE = "sequence";
	private static final String STRUCT_ELEMENT = "element";
	private static final String STRUCT_ELEMENT_NAME_ATTR = "name";
	private static final String STRUCT_ELEMENT_TYPE_ATTR = "type";
	private static final String STRUCT_ELEMENT_LEN_ATTR = "size";

	/**
	 * Parses the given configuration. Identifies type of configuration and
	 * based on that creates the configuration details.
	 */
	public Object parseConfiguration(Object configuration)
			throws ServiceConfigurationParseException {
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
		if (root != null) {
			return parseStructFormatterConfig(document);
		} else {
			return parseStructConfig(document);
		}
	}

	/**
	 * Parses structFormatter configuration that binds the field in the message
	 * schema to field in the structure
	 * 
	 * @param doc
	 */
	private Map<String, String> parseStructFormatterConfig(Document doc)
			throws ServiceConfigurationParseException {
		Map<String, String> bindingMap = new HashMap<String, String>();
		Element root = null;
		try {
			root = (Element) XPath.selectSingleNode(doc, BINDING);
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}

		try {
			List<Element> fieldElements = (List<Element>) XPath.selectNodes(
					root, BINDING_FIELD);
			for (Element field : fieldElements) {
				String fieldName = field.getAttributeValue(BINDING_FIELD_ATTR);
				Element structField = (Element) XPath.selectSingleNode(field,
						BINDING_STRUCT_FIELD);
				String structFieldName = structField.getTextTrim();
				bindingMap.put(fieldName, structFieldName);
			}
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}
		return bindingMap;
	}

	/**
	 * Parses structConfig containing the details of individual structure and
	 * the field set each one of them has
	 * 
	 * @param doc
	 */
	private Map<String, StructsConfigBean> parseStructConfig(Document doc)
			throws ServiceConfigurationParseException {

		StructsConfigBean config = new StructsConfigBean();
		Element root = null;
		try {
			root = (Element) XPath.selectSingleNode(doc, STRUCT);
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}
		Map<String, StructsConfigBean> structMap = new HashMap<String, StructsConfigBean>();
		String rootStructName = root.getAttributeValue(STRUCT_TYPE_ATTR);

		try {
			List<Element> types = (List<Element>) XPath.selectNodes(root,
					STRUCT_COMPLEX_TYPE);
			for (Element complexType : types) {
				String structName = complexType
						.getAttributeValue(STRUCT_TYPE_NAME_ATTR);
				boolean isUnion = Boolean.parseBoolean(complexType
						.getAttributeValue(STRUCT_UNION_ATTR));

				Element sequence = (Element) XPath.selectSingleNode(
						complexType, STRUCT_SEQUENCE);
				List<Element> elements = (List<Element>) XPath.selectNodes(
						sequence, STRUCT_ELEMENT);
				List<BinaryElement> binElementsList = new ArrayList<BinaryElement>(
						elements.size());
				for (Element e : elements) {
					BinaryElement binElement = new BinaryElement();
					binElement.setName(e
							.getAttributeValue(STRUCT_ELEMENT_NAME_ATTR));
					binElement.setType(e
							.getAttributeValue(STRUCT_ELEMENT_TYPE_ATTR));
					binElement.setSize(e
							.getAttributeValue(STRUCT_ELEMENT_LEN_ATTR));

					binElementsList.add(binElement);
				}
				StructsConfigBean structConfig = new StructsConfigBean();
				structConfig.setParentStructName(structName);
				structConfig.setUnion(isUnion);
				structConfig.setElements(binElementsList);
				
				//add structure to the map
				structMap.put(structName, structConfig);
			}
		} catch (JDOMException ex) {
			logger.error("Error parsing the configuration", ex);
			throw new ServiceConfigurationParseException(ex);
		}

		return structMap;
	}
}

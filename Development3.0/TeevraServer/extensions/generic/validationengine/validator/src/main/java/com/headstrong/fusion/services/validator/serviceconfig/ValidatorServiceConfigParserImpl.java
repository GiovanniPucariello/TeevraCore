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
 * $Id: ValidatorServiceConfigParserImpl.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 10, 2008 
 */

package com.headstrong.fusion.services.validator.serviceconfig;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
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

import com.headstrong.fusion.commons.expression.evaluator.Expression;
import com.headstrong.fusion.commons.expression.evaluator.parser.ExpressionParser;
import com.headstrong.fusion.commons.expression.evaluator.parser.ParseException;
import com.headstrong.fusion.services.config.exception.ServiceConfigurationParseException;

/**
 * Parses transformation service configuration.
 * 
 */
public class ValidatorServiceConfigParserImpl implements
		ValidatorServiceConfigParser {

	private static final Logger logger = LoggerFactory
			.getLogger(ValidatorServiceConfigParserImpl.class);
	private static final String RULESET = "ruleset";
	private static final String RULE = "rule";
	private static final String INPUT = "input";
	private static final String NAME = "name";
	private static final String TYPE = "type";
	private static final String VALUE = "value";
	private static final String ERRORMSG = "errormsg";
	private static final String SEQUENCE = "sequence";
	private ExpressionParser parser = new ExpressionParser();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.config.parse.ServiceConfigurationParser#parseConfiguration(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
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

		return this.parseConfiguration(document);
	}

	/**
	 * If the configuration is stored in a file.
	 * 
	 * @param configFile
	 * @return
	 * @throws Exception
	 */
	public Object parseConfiguration(File configFile)
			throws ServiceConfigurationParseException {
		Document document = null;
		SAXBuilder builder = new SAXBuilder();

		try {
			document = builder.build(configFile);
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		} catch (IOException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}
		return this.parseConfiguration(document);

	}

	/**
	 * Parse the configuration file in the given URL
	 * 
	 * @param configFileURL
	 * @return
	 * @throws ServiceConfigurationParseException
	 */
	public Object parseConfiguration(URL configFileURL)
			throws ServiceConfigurationParseException {
		Document document = null;
		SAXBuilder builder = new SAXBuilder();

		try {
			document = builder.build(configFileURL);
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		} catch (IOException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}
		return this.parseConfiguration(document);

	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param document
	 * @return
	 * @throws ServiceConfigurationParseException
	 */
	@SuppressWarnings("unchecked")
	private Object parseConfiguration(Document document)
			throws ServiceConfigurationParseException {

		ValidatorServiceConfig serviceConfig = new ValidatorServiceConfig();
		Element root = null;
		try {
			root = (Element) XPath.selectSingleNode(document, RULESET);
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}

		/**
		 * Select all fields.
		 */
		List<Element> rules = null;
		try {
			rules = (List<Element>) XPath.selectNodes(root, RULE);
		} catch (JDOMException e) {
			logger.error("Error parsing the configuration", e);
			throw new ServiceConfigurationParseException(e);
		}

		String ruleName = null;
		String sequenceId = null;
		Expression condition = null;

		String errorMsg;

		for (Element rule : rules) {

			RuleSet ruleSet = new RuleSet();
			/**
			 * 
			 */
			Attribute ruleNameAttr = rule.getAttribute(NAME);
			Attribute ruleSequenceAttr = rule.getAttribute(SEQUENCE);
			Attribute errorMsgAttr = rule.getAttribute(ERRORMSG);
			Attribute conditionAttr = rule.getAttribute("condition");

			ruleName = ruleNameAttr.getValue().trim();
			sequenceId = ruleSequenceAttr.getValue().trim();
			try {
				if (conditionAttr != null) {
					condition = parser.parse(conditionAttr.getValue().trim());
				}
			} catch (ParseException e1) {
				throw new ServiceConfigurationParseException(e1);
			}

			if (errorMsgAttr != null) {
				errorMsg = errorMsgAttr.getValue().trim();
			} else {
				errorMsg = "Rule :" + ruleName + " failed ";
			}

			ruleSet.setRuleName(ruleName);
			ruleSet.setSequenceId(Integer.parseInt(sequenceId));
			ruleSet.setErrorMsg(errorMsg);
			ruleSet.setCondition(condition);

			try {
				// set of input fields.

				List<Element> inputElements = (List<Element>) XPath
						.selectNodes(rule, INPUT);

				List<FieldSet> inputFieldSet = new ArrayList<FieldSet>();
				for (Element inputElement : inputElements) {
					inputFieldSet.add(createFieldSet(inputElement));
				}
				ruleSet.setInputFields(inputFieldSet);

			} catch (JDOMException e) {
				logger.error("Error parsing the configuration", e);
				throw new ServiceConfigurationParseException(e);
			}

			serviceConfig.addRule(ruleSet);
		}

		Collections.sort(serviceConfig.getRules());

		return serviceConfig;

	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param fieldElement
	 * @return
	 */
	private FieldSet createFieldSet(Element fieldElement) {
		FieldSet fieldSet = new FieldSet();

		Attribute fieldNameAttr = fieldElement.getAttribute(NAME);
		Attribute fieldValueAttr = fieldElement.getAttribute(VALUE);
		Attribute fieldTypeAttr = fieldElement.getAttribute(TYPE);

		fieldSet.setParamName(fieldNameAttr.getValue().trim());
		fieldSet.setParamType(fieldTypeAttr.getValue().trim());
		fieldSet.setParamValue(fieldValueAttr.getValue().trim());

		return fieldSet;
	}
}

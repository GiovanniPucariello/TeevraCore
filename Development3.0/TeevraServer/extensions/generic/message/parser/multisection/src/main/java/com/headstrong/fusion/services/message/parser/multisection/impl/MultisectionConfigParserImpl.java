package com.headstrong.fusion.services.message.parser.multisection.impl;

import java.io.IOException;
import java.io.StringReader;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.commons.resolver.exception.ServiceUnavailableException;
import com.headstrong.fusion.services.config.exception.ServiceConfigurationParseException;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlBinding;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlConfigParser;
import com.headstrong.fusion.services.message.commons.config.parser.td.ColumnIndexBinding;
import com.headstrong.fusion.services.message.commons.config.parser.td.TdBindConfigParser;
import com.headstrong.fusion.services.message.parser.multisection.MultisectionConfigParser;

/**
 * Parses the configuration specified for multisection parser component and
 * creates the corresponding object model expected by the parser.
 * 
 * @author mohammia
 * @version 1.0
 * @created 20-May-2009 2:55:36 PM This class parses the config file and creates
 *          config object
 */
public final class MultisectionConfigParserImpl implements
		MultisectionConfigParser {
	private static final Logger logger = LoggerFactory
			.getLogger(MultisectionConfigParserImpl.class);

	private static MultisectionConfigParserImpl configParseInst = new MultisectionConfigParserImpl();

	private static final String CONFIG_NAME = "ConfigName";
	private static final String HEADER_PRESENT = "IsHeaderPresent";
	private static final String HEADER_LINE = "HeaderLine";
	private static final String HEADER_OFFSET = "HeaderOffset";
	private static final String HEADER_IDENTIFIER = "HeaderIdentifier";
	private static final String SECTION_HEADER_PRESENT = "IsSectionHeaderPresent";
	private static final String SECTION_HEADER_IDENTIFIER = "SectionHeaderIdentifier";
	private static final String SECTION_HEADER_LINE = "SectionHeaderLine";
	private static final String SECTION_BODY_IDENTIFIER = "SectionBodyIdentifier";
	private static final String SECTION_BODY_LINE = "SectionBodyLine";

	public static final String GENERIC_HEADER = "GenericHeader";
	private static final String DELIMITER = "delimiter";
	public static final String SECTION_HEADER = "Sections/Section/SectionHeader";
	public static final String SECTION_BODY = "Sections/Section/SectionBody";
	private static final String BINDING = "binding";

	private static final String FL_CONFIG_PARSER_ALIAS = "FlConfigParser";
	private static final String TD_CONFIG_PARSER_ALIAS = "TdBindConfigParser";

	private MultisectionConfigParserImpl() {
	}

	/**
	 * Returns singleton instance
	 * 
	 * @return
	 */
	public static MultisectionConfigParserImpl getInstance() {
		return configParseInst;
	}

	/**
	 * Parses the configuration passed as a XML string
	 * 
	 * @param configuration
	 *            XML configuration for the component
	 * @return instance of MultisectionParserConfiguration containing details of
	 *         both header and section configuration
	 * @throws ServiceConfigurationParseException
	 */
	public Object parseConfiguration(Object configuration)
			throws ServiceConfigurationParseException {
		try {
			ServiceAliasManager serviceAliasManager = ServiceAliasManager
					.getInstance();
			TdBindConfigParser tdparser = (TdBindConfigParser) serviceAliasManager
					.getServiceByAlias(TD_CONFIG_PARSER_ALIAS, 0);
			FlConfigParser flparser = (FlConfigParser) serviceAliasManager
					.getServiceByAlias(FL_CONFIG_PARSER_ALIAS, 0);
			return parseConfiguration(configuration, tdparser,
					flparser);
		} catch (ServiceUnavailableException e) {
			logger
					.error(
							"Not able to find dependent fixed length / tag delimited parser",
							e);
			throw new ServiceConfigurationParseException(e);
		}
	}

	public Object parseConfiguration(Object configuration,
			TdBindConfigParser tdParser, FlConfigParser flParser)
			throws ServiceConfigurationParseException {
		SAXBuilder builder = new SAXBuilder();
		Document document = null;
		try {
			document = builder
					.build(new StringReader(configuration.toString()));
			return parseConfiguration(document.getRootElement(), tdParser,
					flParser);
		} catch (JDOMException e) {
			logger.error("Error parsing the Multisection parser configuration",
					e);
			throw new ServiceConfigurationParseException(e);
		} catch (IOException e) {
			logger.error("Error parsing the Multisection parser configuration",
					e);
			throw new ServiceConfigurationParseException(e);
		} catch (ServiceUnavailableException e) {
			logger
					.error(
							"Not able to find dependent fixed length / tag delimited parser",
							e);
			throw new ServiceConfigurationParseException(e);
		}

	}

	/**
	 * Parses the XML Configuration with the given root
	 * 
	 * @param root
	 *            Root element in the xml configuration
	 * @return instance of MultisectionParserConfiguration
	 * @throws ServiceConfigurationParseException
	 * @throws JDOMException
	 * @throws ServiceUnavailableException
	 */
	private Object parseConfiguration(Element root,
			TdBindConfigParser tdParser, FlConfigParser flParser)
			throws ServiceConfigurationParseException, JDOMException,
			ServiceUnavailableException {
		MultiSectionParserConfiguration config = new MultiSectionParserConfiguration();
		setBaseConfigDetails(root, config);
		setConfig(root, config, GENERIC_HEADER, tdParser, flParser);
		setConfig(root, config, SECTION_HEADER, tdParser, flParser);
		setConfig(root, config, SECTION_BODY, tdParser, flParser);
		return config;
	}

	/**
	 * Loads the basic config details
	 * 
	 * @param root
	 * @param config
	 * @throws JDOMException
	 */
	private void setBaseConfigDetails(Element root,
			MultiSectionParserConfiguration config) throws JDOMException {
		// config name
		Element element = (Element) XPath.selectSingleNode(root, CONFIG_NAME);
		if (element != null) {
			config.setConfigFileName(element.getTextTrim());
		}

		// header present or not
		element = (Element) XPath.selectSingleNode(root, HEADER_PRESENT);
		if ((element != null) && (!"".equals(element.getTextTrim()))) {
			config.setGenericHeaderPresent(Boolean.parseBoolean(element
					.getTextTrim()));
		}

		// num header lines
		element = (Element) XPath.selectSingleNode(root, HEADER_LINE);
		if ((element != null) && (!"".equals(element.getTextTrim()))) {
			config
					.setGenericHeaderLine(Integer.parseInt(element
							.getTextTrim()));
		}

		// offset within the header line
		element = (Element) XPath.selectSingleNode(root, HEADER_OFFSET);
		if ((element != null) && (!"".equals(element.getTextTrim()))) {
			config.setGenericHeaderOffset(element.getTextTrim());
		}
		// pattern to recognize header line
		element = (Element) XPath.selectSingleNode(root, HEADER_IDENTIFIER);
		if ((element != null) && (!"".equals(element.getTextTrim()))) {
			config.setGenericHeaderIdentifier(element.getTextTrim());
		}

		// line relative to generic header for section header
		element = (Element) XPath.selectSingleNode(root, SECTION_HEADER_LINE);
		if ((element != null) && (!"".equals(element.getTextTrim()))) {
			config
					.setSectionHeaderLine(Integer.parseInt(element
							.getTextTrim()));
		}

		// pattern recognizes section body
		element = (Element) XPath.selectSingleNode(root,
				SECTION_BODY_IDENTIFIER);
		if ((element != null) && (!"".equals(element.getTextTrim()))) {
			config.setSectionBodyIdentifier(element.getTextTrim());
		}

		// line relative to section header for identiying section body
		element = (Element) XPath.selectSingleNode(root, SECTION_BODY_LINE);
		if ((element != null) && (!"".equals(element.getTextTrim()))) {
			config.setSectionBodyLine(Integer.parseInt(element.getTextTrim()));
		}

		// section header present or not
		element = (Element) XPath
				.selectSingleNode(root, SECTION_HEADER_PRESENT);
		if ((element != null) && (!"".equals(element.getTextTrim()))) {
			config.setSectionHeaderPresent(Boolean.parseBoolean(element
					.getTextTrim()));
		}

		// section header identifier
		element = (Element) XPath.selectSingleNode(root,
				SECTION_HEADER_IDENTIFIER);
		if ((element != null) && (!"".equals(element.getTextTrim()))) {
			config.setSectionHeaderIdentifier(element.getTextTrim());
		}
	}

	/**
	 * Load config for block identified by the given key - it can be either of
	 * generic header, section header, section body
	 * 
	 * @param root
	 * @param config
	 * @return
	 * @throws JDOMException
	 * @throws ServiceUnavailableException
	 * @throws ServiceConfigurationParseException
	 */
	private void setConfig(Element root,
			MultiSectionParserConfiguration config, String key,
			TdBindConfigParser tdparser, FlConfigParser flparser)
			throws JDOMException, ServiceUnavailableException,
			ServiceConfigurationParseException {
		Element element = (Element) XPath.selectSingleNode(root, key);
		if (element == null) {
			return;
		}

		// obtain generic header delimiter
		Element delimiter = (Element) XPath
				.selectSingleNode(element, DELIMITER);
		if ((delimiter != null) && (!"".equals(delimiter.getText()))) {
			config.addDelimiter(key, delimiter.getText());
		}

		// if delimiter is null -> fixed length parser config else it is
		// delimited parser config
		Element binding = (Element) XPath.selectSingleNode(element, BINDING);
		if (binding != null) {
			if (config.getDelimiter(key) != null) {
				// get bindings from delim parser config
				SchemaDescriptor<ColumnIndexBinding> desc = new SchemaDescriptor<ColumnIndexBinding>();
				tdparser.parseBinding(binding, desc);
				config.addBinding(key, desc);
			} else {
				// get bindings from fixed len parser config
				SchemaDescriptor<FlBinding> desc = new SchemaDescriptor<FlBinding>();
				flparser.parseBinding(binding, desc);
				config.addBinding(key, desc);
			}
		}
	}
}
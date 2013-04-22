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
 * $Id: MultisectionParserServiceImpl.java
 * $Revision:
 * $Author: ssoni
 * $DateTime: Nov 26, 2008
 */

package com.headstrong.fusion.services.message.parser.multisection.impl;

import static com.headstrong.fusion.services.message.commons.util.MessageServiceUtil.getObjectDescriptor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.Primitive;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.config.ServiceConfigurationCache;
import com.headstrong.fusion.services.config.exception.ServiceConfigurationNotFoundException;
import com.headstrong.fusion.services.config.parse.ServiceConfigurationParserRegistry;
import com.headstrong.fusion.services.config.vo.ServiceConfiguration;
import com.headstrong.fusion.services.message.commons.config.exception.InvalidConfigurationException;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlBinding;
import com.headstrong.fusion.services.message.commons.config.parser.td.ColumnIndexBinding;
import com.headstrong.fusion.services.message.parser.fl.impl.FlBodyParser;
import com.headstrong.fusion.services.message.parser.fl.impl.FlHeaderParser;
import com.headstrong.fusion.services.message.parser.multisection.MultisectionConfigParser;
import com.headstrong.fusion.services.message.parser.multisection.MultisectionParserService;
import com.headstrong.fusion.services.message.parser.multisection.impl.MultiSectionParserConfiguration;
import com.headstrong.fusion.services.message.parser.td.impl.TdBodyParser;
import com.headstrong.fusion.services.message.parser.td.impl.TdHeaderParser;

/**
 * Multi-section parser service. It parses content containing generic header
 * followed by mulitple sections. Each section will have a section header and
 * section body. All three categories - generic header, section header and
 * section body can be of different format. Currently these different formats
 * can be fixed length or delimited.
 */
public class MultisectionParserServiceImpl extends GenericMediationService
		implements MultisectionParserService {

	private static final Logger logger = LoggerFactory
			.getLogger(MultisectionParserServiceImpl.class);

	@Override
	public void init() {
		super.init();
		// Register service configuration parsers.
		ServiceConfigurationParserRegistry configurationParserRegistry = ServiceConfigurationParserRegistry
				.getInstance();
		configurationParserRegistry.registerServiceConfigurationParser(
				MultisectionParserService.class.getSimpleName(),
				OBJECT_MAPPING_ID, MultisectionConfigParser.class
						.getSimpleName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MediationService#process(com.headstrong.fusion.commons.MessageExchange,
	 *      com.headstrong.fusion.commons.ServiceConfig)
	 */
	@SuppressWarnings("unchecked")
	public void process(MessageExchange exchange, ServiceConfig config)
			throws FusionException {
		ErrorHandler errorHandler = config.getErrorHandler();

		// Input message payload.
		String inputMessage = exchange.getIn().getBody(String.class);
		if (logger.isDebugEnabled()) {
			logger.debug("Input message received for parsing." + inputMessage);
		}
		if (inputMessage == null) {
			// Ignoring the Error.
			logger.error("Empty message payload for process "
					+ config.getProcessId() + " service "
					+ config.getServiceId());
			return;
		}

		// parser configuration
		// get configuration
		MultiSectionParserConfiguration parserConfig = (MultiSectionParserConfiguration) getServiceConfig(
				config, OBJECT_MAPPING_ID);
		if (exchange.getIn().getHeaders() == null) {
			exchange.getIn().setHeaders(new HashMap<String, Object>());
		}

		ObjectDescriptor objectDescriptor = null;
		try {
			objectDescriptor = getObjectDescriptor(config);
		} catch (InvalidConfigurationException e1) {
			super.handleError(errorHandler, config.getProcessId(), config
					.getServiceId(), ERROR_TYPE_BUSINESS, config
					.getServiceType(), e1, config, null);
		}
		String prcsId = config.getProcessId();
		String serviceId = config.getServiceId();
		String serviceType = config.getServiceType();

		List<BusinessObject> messages = process(config, inputMessage, exchange
				.getIn().getHeaders(), parserConfig, errorHandler,
				objectDescriptor, prcsId, serviceId, serviceType);

		// set the exchange body
		Object outputMessage = messages;
		// check if there is a single record.
		if (messages.size() == 1) {
			outputMessage = messages.get(0);
		}
		exchange.getIn().setBody(outputMessage);
	}

	/**
	 * Separated it from the main process method to help in unit testing
	 * 
	 * @param exchange
	 * @param config
	 * @param inputMessage
	 * @param parserConfig
	 * @param errorHandler
	 * @param serviceType
	 * @param serviceId
	 * @param prcsId
	 * @throws FusionException
	 */
	@SuppressWarnings("unchecked")
	public List<BusinessObject> process(ServiceConfig config,
			String inputMessage, Map<String, Object> headers,
			MultiSectionParserConfiguration parserConfig,
			ErrorHandler errorHandler, ObjectDescriptor objectDesc,
			String prcsId, String serviceId, String serviceType)
			throws FusionException {
		if (inputMessage == null) {
			return null;
		}
		int linePointer = 0;

		// TODO Check if offset is required
		int offset = 0;
		try {
			offset = this.getOffset(parserConfig, headers);
		} catch (Exception e) {
			logger.error("Error calculating record offset.", e);
			super.handleError(errorHandler, prcsId, serviceId,
					ERROR_TYPE_BUSINESS, serviceType, e, config, null);
		}

		// parse the generic header
		if (parserConfig.isGenericHeaderPresent()) {
			// get the starting line number of generic header. Default is 1 if
			// not specified
			Integer line = parserConfig.getGenericHeaderLine();
			if (line == null) {
				line = 1;
			}

			// get the header pattern to be matched. If no pattern specified,
			// data at the line would be set
			String headerPattern = parserConfig.getGenericHeaderIdentifier();
			String[] inputPattern = getPattern(headerPattern);
			StringBuffer record = new StringBuffer();
			int matchingIndex = -1;
			try {
				matchingIndex = this.getRecordMatchingPattern(inputMessage,
						inputPattern, line, record);

			} catch (IOException e) {
				logger.error(
						"Error reading the generic header of the message for process "
								+ prcsId + " service " + serviceId, e);
				super.handleError(errorHandler, prcsId, serviceId,
						ERROR_TYPE_SYSTEM, serviceType, e, inputMessage, null);
			}

			// if a header record has matched, parse it based on the
			// configuration (fixed len / tag delim)
			if (matchingIndex != -1) {
				linePointer = matchingIndex;
				String key = MultisectionConfigParserImpl.GENERIC_HEADER;
				String delimiter = parserConfig.getDelimiter(key);
				Map<String, Object> genHeaders = null;
				if (delimiter != null) {
					// use delimited parser to parser
					TdHeaderParser headerParser = TdHeaderParser.getInstance();
					SchemaDescriptor<ColumnIndexBinding> binding = (SchemaDescriptor<ColumnIndexBinding>) parserConfig
							.getBinding(key);
					genHeaders = headerParser.parse(delimiter, binding, record
							.toString());
				} else {
					// use fixed length header parser
					FlHeaderParser headerParser = FlHeaderParser.getInstance();
					SchemaDescriptor<FlBinding> binding = (SchemaDescriptor<FlBinding>) parserConfig
							.getBinding(key);
					genHeaders = headerParser.parse(record.toString(), binding,
							offset);
				}
				if (genHeaders != null) {
					// set the message header in exchange
					headers.putAll(genHeaders);
				}
			}
		}

		// NOW ENTERING THE REPEATING SECTION. IT CAN REPEAT UNTIL NO SECTION
		// HEADER IS OBTAINED
		boolean firstPass = true;
		List<BusinessObject> parsedRecords = new ArrayList<BusinessObject>();

		while (true) {
			// BEGIN SECTION HEADER PARSING
			Map<String, Object> sectionHeaders = null;
			// get the header pattern to be matched. If no pattern specified,
			// data at the line would be set
			String[] sectionHdrPattern = getPattern(parserConfig
					.getSectionHeaderIdentifier());
			if (parserConfig.isSectionHeaderPresent()) {
				// get the starting line number of section header which is with
				// reference to generic header occurence. Default is 1 if
				// not specified
				Integer line = parserConfig.getSectionHeaderLine();
				if (line == null) {
					line = 1;
				}
				if (firstPass) {
					linePointer += line;
					firstPass = false;
				}

				StringBuffer record = new StringBuffer();
				int matchingIndex = -1;
				try {
					matchingIndex = this.getRecordMatchingPattern(inputMessage,
							sectionHdrPattern, linePointer, record);

				} catch (IOException e) {
					logger.error(
							"Error reading the section header of the message for process "
									+ prcsId + " service " + serviceId, e);
					super.handleError(errorHandler, prcsId, serviceId,
							ERROR_TYPE_SYSTEM, serviceType, e, inputMessage,
							null);
				}

				// if a header record has matched, parse it based on the
				// configuration (fixed len / tag delim)
				if (matchingIndex != -1) {
					linePointer = matchingIndex;
					String key = MultisectionConfigParserImpl.SECTION_HEADER;
					String delimiter = parserConfig.getDelimiter(key);
					if (delimiter != null) {
						// use delimited parser to parser
						TdHeaderParser headerParser = TdHeaderParser
								.getInstance();
						SchemaDescriptor<ColumnIndexBinding> binding = (SchemaDescriptor<ColumnIndexBinding>) parserConfig
								.getBinding(key);
						sectionHeaders = headerParser.parse(delimiter, binding,
								record.toString());
					} else {
						// use fixed length header parser
						FlHeaderParser headerParser = FlHeaderParser
								.getInstance();
						SchemaDescriptor<FlBinding> binding = (SchemaDescriptor<FlBinding>) parserConfig
								.getBinding(key);
						sectionHeaders = headerParser.parse(record.toString(),
								binding, offset);
					}
				} else {
					// end the repeating sections
					break;
				}
			}
			// END SECTION HEADER PARSING

			// BEGIN SECTION BODY PARSING
			// parse the section body and append section header details in the
			// business object
			int lastLine = linePointer;
			lastLine = parseSectionBody(inputMessage, parsedRecords,
					sectionHeaders, parserConfig, linePointer, objectDesc,
					config, errorHandler, prcsId, serviceId, serviceType);
			if (lastLine == -1) {
				// reached end of file, so end of parsing
				break;
			} else {
				linePointer = lastLine;
			}
		}
		return parsedRecords;
	}

	/**
	 * 
	 * @param inputMessage
	 * @param parsedRecords
	 * @param sectionHeaders
	 * @param parserConfig
	 * @param linePointer
	 * @param prcsId
	 * @param serviceId
	 * @param serviceType
	 * @return
	 * @throws FusionException
	 * @throws Exception
	 */
	private int parseSectionBody(String inputMessage,
			List<BusinessObject> parsedRecords,
			Map<String, Object> sectionHeaders,
			MultiSectionParserConfiguration parserConfig, int linePointer,
			ObjectDescriptor objectDesc, ServiceConfig config,
			ErrorHandler errorHandler, String prcsId, String serviceId,
			String serviceType) throws FusionException {

		String[] sectionHdrPattern = getPattern(parserConfig
				.getSectionHeaderIdentifier());
		// get the starting line number of section body which is with
		// reference to section header occurence. Default is 1 if
		// not specified
		Integer line = parserConfig.getSectionBodyLine();
		if (line == null) {
			line = 1;
		}
		linePointer += line - 1;
		return parseRecordsUntilEnd(inputMessage, linePointer,
				sectionHdrPattern, parsedRecords, sectionHeaders, objectDesc,
				parserConfig, config, errorHandler, prcsId, serviceId,
				serviceType);

	}

	/**
	 * Obtains patterns specified in the given config. Individual patters are
	 * delimited by comma.
	 * 
	 * @param config
	 * @return
	 */
	private String[] getPattern(String inputPattern) {
		if (inputPattern == null) {
			return null;
		}
		String[] pattern = null;
		if (!"".equals(inputPattern)) {
			StringTokenizer tokenizer = (new StringTokenizer(inputPattern, ","));
			pattern = new String[tokenizer.countTokens()];
			int patternCount = 0;
			while (tokenizer.hasMoreTokens()) {
				pattern[patternCount] = tokenizer.nextToken();
				patternCount++;
			}
		}
		return pattern;
	}

	/**
	 * Returns all the record (delimited by <code>NEW_LINE</code> character)
	 * starting from the start line number till the footer record that is
	 * matching the pattern is obtained
	 * 
	 * @param message
	 *            Input message.
	 * @param start
	 *            start line number. *
	 * @param footerPattern
	 *            pattern to recognize the footer to stop fetching the records
	 * 
	 * @param prcsId
	 * @param serviceId
	 * @param serviceType
	 * @return records delimited by new line character.
	 * @throws FusionException
	 * @throws Exception
	 */
	private int parseRecordsUntilEnd(String message, int startLine,
			String[] endingPattern, List<BusinessObject> recordObjects,
			Map<String, Object> parentFields, ObjectDescriptor objectDesc,
			MultiSectionParserConfiguration parserConfig, ServiceConfig config,
			ErrorHandler errorHandler, String prcsId, String serviceType,
			String serviceId) throws FusionException {
		BufferedReader reader = null;
		String record = null;

		// compile the given set of patterns
		ArrayList<Pattern> compiledPatterns = null;
		if (endingPattern != null) {
			compiledPatterns = new ArrayList<Pattern>();
			for (String patternStr : endingPattern) {
				Pattern p = Pattern.compile(patternStr);
				compiledPatterns.add(p);
			}
		}

		int lineCounter = 1;
		try {
			reader = new BufferedReader(new StringReader(message));
			record = reader.readLine();
			boolean exit = false;
			while (record != null) {
				if ((lineCounter >= startLine)
						&& !record.trim().equals(FusionConstants.EMPTY)) {
					// check if the record matches the ending pattern
					if (compiledPatterns != null) {
						for (Pattern p : compiledPatterns) {
							if (p.matcher(record).matches()) {
								// current record matches the footer pattern
								// defined
								exit = true;
								break;
							}
						}
					}

					if (exit) {
						break;
					}
					// parse the record and append it to BO list
					recordObjects.add(parseRecord(record, parentFields,
							objectDesc, parserConfig));
				}
				lineCounter++;
				record = reader.readLine();
			}
		} catch (Exception e) {
			logger.error("Error parsing record in section body.", e);
			super.handleError(errorHandler, prcsId, serviceId,
					ERROR_TYPE_BUSINESS, serviceType, e, config, record);
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				logger.error("Error while parsing record in section body.", e);
				super.handleError(errorHandler, prcsId, serviceId,
						ERROR_TYPE_SYSTEM, serviceType, e, config, record);
			}
		}
		if (record == null) {
			// reached the end of file, return -1
			return -1;
		} else {
			// reached the begin of next section header
			return lineCounter;
		}
	}

	/**
	 * Parses the given record based on the configuration
	 * 
	 * @param record
	 * @param parentFields
	 * @param parserType
	 * @param objectDesc
	 * @param parserConfig
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	private BusinessObject parseRecord(String record,
			Map<String, Object> parentFields, ObjectDescriptor objectDesc,
			MultiSectionParserConfiguration parserConfig) throws Exception {
		BusinessObject bo = null;
		String configKey = MultisectionConfigParserImpl.SECTION_BODY;
		String delimiter = parserConfig.getDelimiter(configKey);
		if (delimiter != null) {
			TdBodyParser tdparser = TdBodyParser.getInstance();
			SchemaDescriptor<ColumnIndexBinding> schemaDesc = (SchemaDescriptor<ColumnIndexBinding>) parserConfig
					.getBinding(configKey);
			bo = tdparser.parse(delimiter, objectDesc, schemaDesc, record);
		} else {
			FlBodyParser flparser = FlBodyParser.getInstance();
			SchemaDescriptor<FlBinding> schemaDesc = (SchemaDescriptor<FlBinding>) parserConfig
					.getBinding(configKey);
			bo = flparser.parse(objectDesc, schemaDesc, record, 0);
		}
		// populate parent fields in BO
		if (bo != null) {
			Iterator<String> itr = parentFields.keySet().iterator();
			while (itr.hasNext()) {
				String parentField = itr.next();
				bo.setValue(parentField, parentFields.get(parentField));
			}
		}
		return bo;
	}

	/**
	 * Reads the line from the given startLine and compares each read line with
	 * the given pattern to see if it is matching or not. The first matched line
	 * would be set in the StringBuffer matchingRecord and its corresponding
	 * line number is returned. If no matching record, -1 would be returned.
	 * 
	 * @param message
	 * @param pattern
	 * @param startLine
	 * @param matchingRecord
	 * @return
	 * @throws IOException
	 */
	private int getRecordMatchingPattern(String message, String[] pattern,
			int startLine, StringBuffer matchingRecord) throws IOException {
		if (startLine < 1) {
			return -1;
		}
		BufferedReader reader = null;
		String record = null;
		int lineIndex = 1;

		// compile the given set of patterns
		ArrayList<Pattern> compiledPatterns = null;
		if (pattern != null) {
			compiledPatterns = new ArrayList<Pattern>();
			for (String patternStr : pattern) {
				Pattern p = Pattern.compile(patternStr);
				compiledPatterns.add(p);
			}
		}

		try {
			reader = new BufferedReader(new StringReader(message));
			// read till the line from where you need to start matching
			while (lineIndex < startLine) {
				record = reader.readLine();
				if (record == null) {
					break;
				}
				lineIndex++;
			}

			// check for abrupt end
			if (lineIndex != startLine) {
				return -1;
			}

			// start matching from the desired line
			record = reader.readLine();
			lineIndex++;

			// if there is no pattern return the record in the current line
			if (compiledPatterns == null) {
				matchingRecord.append(record);
				return lineIndex;
			}

			// scan thro the lines for the record matching the pattern
			while (record != null) {
				for (Pattern p : compiledPatterns) {
					if (p.matcher(record).matches()) {
						// obtained the desired record, return it
						matchingRecord.append(record);
						return lineIndex;
					}
				}
				record = reader.readLine();
				lineIndex++;
			}
		} finally {
			reader.close();
		}
		return -1;
	}

	/**
	 * Generates the Offset based on the expression.
	 * 
	 * @precondition Header contains values of all the header mentioned in the
	 *               expression.
	 * @param config
	 * @param headers
	 * @throws Exception
	 */
	private int getOffset(MultiSectionParserConfiguration config,
			Map<String, Object> headers) throws Exception {
		int offset = 0;
		String offsetConfig = (String) config.getGenericHeaderOffset();
		if (offsetConfig != null) {
			// currently the configuration is in the form of
			// header1 + header2 ..
			// Tokenize and iterate it
			for (String header : offsetConfig.split(Pattern.quote("+"))) {
				Object value = headers.get(header.trim());
				if (value == null) {
					// if the header is actually a static number
					value = header.trim();
				}
				// If header is a number
				offset += ((Integer) Primitive.INTEGER.eval(value)).intValue();
			}
		}
		/*
		 * // considering the user would provide the index starting from 1 which //
		 * should be changed to 0 as per the string indexes. if ( offset > 0) {
		 * offset--; }
		 */return offset;
	}

	/**
	 * Gets the Service Configuration for the given config key
	 * 
	 * @param config
	 * @return
	 * @throws FusionException
	 */
	protected Object getServiceConfig(ServiceConfig config, String configKey)
			throws FusionException {
		// Read the Mapping.
		String mappingId = (String) config.getProperty(configKey);
		if (mappingId == null) {
			String errorMsg = configKey
					+ " Configuration identifier not specified.";
			logger.error(errorMsg);
			throw new FusionException(errorMsg);
		}

		// Read the service configuration
		ServiceConfiguration serviceConfiguration = new ServiceConfiguration();
		serviceConfiguration.setProcessId(config.getProcessId());
		serviceConfiguration.setServiceId(config.getServiceId());
		serviceConfiguration.setPropertyId(mappingId);

		try {
			// Get the configuration from the cache.
			ServiceConfigurationCache serviceConfigCache = ServiceConfigurationCache
					.getInstance();
			return serviceConfigCache
					.getPropertyConfiguration(serviceConfiguration);
		} catch (ServiceConfigurationNotFoundException e) {
			String errorMsg = "No configuration found for the binary formatter "
					+ "service configuration id provided ";
			logger.error(errorMsg, e);
			throw new FusionException(errorMsg, e);
		}
	}
}

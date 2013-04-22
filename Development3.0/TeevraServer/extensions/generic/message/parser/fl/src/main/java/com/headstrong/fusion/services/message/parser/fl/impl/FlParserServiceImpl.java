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
 * $Id: FlParserServiceImpl.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 26, 2008 
 */

package com.headstrong.fusion.services.message.parser.fl.impl;

import static com.headstrong.fusion.services.message.commons.util.MessageServiceUtil.getObjectDescriptor;
import static com.headstrong.fusion.services.message.commons.util.MessageServiceUtil.getSchemaDescriptor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
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
import com.headstrong.fusion.services.config.parse.ServiceConfigurationParserRegistry;
import com.headstrong.fusion.services.message.commons.config.exception.InvalidConfigurationException;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlBinding;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlConfigParser;
import com.headstrong.fusion.services.message.parser.fl.FlParserService;

/**
 * Fixed-Length parser service. It parses message header or body based on the
 * configuration provided.
 * 
 */
public class FlParserServiceImpl extends GenericMediationService implements
		FlParserService {

	private static final Logger logger = LoggerFactory
			.getLogger(FlParserServiceImpl.class);
	/**
	 * Parses the message body and creates a list of business object.
	 */
	private FlBodyParser bodyParser = new FlBodyParser();
	/**
	 * Parses message header record and returns a map of header key and value.
	 */
	private FlHeaderParser headerParser = new FlHeaderParser();

	@Override
	public void init() {
		super.init();
		// Register service configuration parsers.
		ServiceConfigurationParserRegistry configurationParserRegistry = ServiceConfigurationParserRegistry
				.getInstance();
		configurationParserRegistry.registerServiceConfigurationParser(
				FlParserService.class.getSimpleName(), OBJECT_MAPPING_ID,
				FlConfigParser.class.getSimpleName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.commons.MediationService#process(com.headstrong
	 * .fusion.commons.MessageExchange,
	 * com.headstrong.fusion.commons.ServiceConfig)
	 */
	@SuppressWarnings("unchecked")
	public void process(MessageExchange exchange, ServiceConfig config)
			throws FusionException {
		ErrorHandler errorHandler = config.getErrorHandler();
		/**
		 * Input message payload.
		 */
		String inputMessage = exchange.getIn().getBody(String.class);
		// Bugchase 234 ErrorMonitoring # Used for logging message.
		String errorString = " For Process '" + config.getProcessId()
				+ "', Service '" + config.getServiceId() + "', Message= "
				+ inputMessage;
		if (logger.isDebugEnabled()) {
			logger.debug("Input message received for parsing." + inputMessage);
		}
		if (inputMessage != null) {
			// check the parse type if partial parsing is required or full
			// parsing.
			String type = (String) config.getProperty(TYPE);
			SchemaDescriptor<FlBinding> schemaDescriptor = null;
			try {
				schemaDescriptor = (SchemaDescriptor<FlBinding>) getSchemaDescriptor(config);
			} catch (InvalidConfigurationException e1) {
				// Bugchase 234 ErrorMonitoring # Exception is thrown if schema
				// descriptor is
				// not specified for process.
				logger.error(
						"SchemaDescriptor details not found." + errorString, e1);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e1, inputMessage,
						"Schema descriptor error", false);
			}
			int offset = 0;
			try {
				offset = this.getOffset(config, exchange.getIn().getHeaders());
			} catch (Exception e) {
				// Bugchase 234 ErrorMonitoring # Exception is thrown when
				// invalid value is
				// set in offset.
				logger.error("Error calculating record offset." + errorString,
						e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_SYSTEM, config
						.getServiceType(), e, inputMessage,
						"Error calculating record offset", false);
			}

			/**
			 * Fixed-Length parser works in two modes. 1: Header - parses and
			 * puts the data in the Message Header 2: Body - Parses and put the
			 * data in the Message Body.
			 */
			if (type.equals(PARSE_TYPE_HEADER)) {
				int line = Integer.parseInt((String) config
						.getProperty(HEADER_LINE));
				String record = null;
				try {
					record = this.getRecordForLine(inputMessage, line);
					if (logger.isDebugEnabled()) {
						logger.debug("Message Header{" + record + "}");
					}
				} catch (IOException e) {
					// Bugchase 234 ErrorMonitoring # I/O Error
					logger.error("I/O error while reading the message."
							+ errorString, e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e, inputMessage,
							"I/O error while reading the message", false);
				}
				Map<String, Object> headers = headerParser.parse(record,
						schemaDescriptor, offset);
				// set the message header.
				if (exchange.getIn().getHeaders() == null) {
					exchange.getIn().setHeaders(headers);
				} else {
					exchange.getIn().getHeaders().putAll(headers);
				}
			} else {
				// Body Parsing.
				ObjectDescriptor objectDescriptor = null;
				try {
					objectDescriptor = getObjectDescriptor(config);
				} catch (InvalidConfigurationException e1) {
					// Bugchase 234 ErrorMonitoring # Exception is thrown if
					// there is no ObjectDescriptor for selected schema.
					logger.error("objectSchemaDescriptor not specified."
							+ errorString, e1);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e1, inputMessage,
							"Object descriptor error", false);

				}
				String records = null;
				try {
					int start = this.getBodyStartLine(config);
					String[] footerPattern = this.getFooterPattern(config);

					records = this.getRecordsForLine(inputMessage, start,
							footerPattern);
					if (logger.isDebugEnabled()) {
						logger.debug("Message Body{" + records + "}");
					}
				} catch (IOException e) {
					// Bugchase 234 ErrorMonitoring # I/O Error
					logger.error("I/O error while parsing the message."
							+ errorString, e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e, inputMessage,
							"I/O error while reading the message", false);
				}

				List<BusinessObject> messages = new ArrayList<BusinessObject>();
				BufferedReader reader = new BufferedReader(new StringReader(
						records));
				String record = null;
				try {
					record = reader.readLine();

				} catch (IOException e) {
					// Bugchase 234 ErrorMonitoring # I/O Error
					logger.error("I/O Error while parsing the message."
							+ errorString, e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e, inputMessage,
							"I/O error while reading the message", false);
				}
				while (record != null
						&& !record.trim().equals(FusionConstants.EMPTY)) {
					BusinessObject businessObject = null;
					try {
						businessObject = bodyParser.parse(objectDescriptor,
								schemaDescriptor, record, offset);
					} catch (Exception e) {
						// Bugchase 234 ErrorMonitoring # Exception is thrown
						// when value in
						// record cannot be converted to type mentioned in
						// schema.
						logger.error(
								"Unsupported or datatype mismatch error while parsing the message."
										+ errorString, e);
						super.handleError(errorHandler, config.getProcessId(),
								config.getServiceId(), ERROR_TYPE_BUSINESS,
								config.getServiceType(), e, inputMessage,
								"Unsupported data in record,datatype mismatch",
								false);

					}
					messages.add(businessObject);
					try {
						record = reader.readLine();
					} catch (IOException e) {
						// Bugchase 234 ErrorMonitoring # I/O Error
						logger.error("I/O Error while parsing the message."
								+ errorString, e);
						super.handleError(errorHandler, config.getProcessId(),
								config.getServiceId(), ERROR_TYPE_SYSTEM,
								config.getServiceType(), e, inputMessage,
								"I/O error while reading the message", false);
					}
				}
				try {
					reader.close();
				} catch (IOException e) {
					// Bugchase 234 ErrorMonitoring # I/O Error
					logger.error("I/O Error while parsing the message."
							+ errorString, e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e, inputMessage,
							"I/O error Occurred", false);
				}

				Object outputMessage = messages;
				// check if there is a single record.
				if (messages.size() == 1) {
					outputMessage = messages.get(0);
				}
				exchange.getIn().setBody(outputMessage);
			}
		} else {
			// Ignoring the Error.
			logger.error("Empty message payload. For process "
					+ config.getProcessId() + " service "
					+ config.getServiceId());
		}
	}

	/**
	 * This utility method returns the body start line number. If the property
	 * is not provided it is assumed that it starts from the first line so 1 is
	 * returned.
	 * 
	 * @param config
	 *            service configuration.
	 * @return start line number.
	 */
	private int getBodyStartLine(ServiceConfig config) {
		int start = 1;
		if (config.getProperty(BODY_START_LINE) != null) {
			start = Integer.parseInt((String) config
					.getProperty(BODY_START_LINE));
		}
		return start;
	}

	/**
	 * Obtains patterns specified in the given config. Individual patters are
	 * delimited by comma.
	 * 
	 * @param config
	 * @return
	 */
	private String[] getFooterPattern(ServiceConfig config) {
		String[] footerPattern = null;
		if (config.getProperty(FOOTER_PATTERN) != null) {
			String patterns = ((String) config.getProperty(FOOTER_PATTERN))
					.trim();
			if (!"".equals(patterns)) {
				StringTokenizer tokenizer = (new StringTokenizer(patterns, ","));
				footerPattern = new String[tokenizer.countTokens()];
				int patternCount = 0;
				while (tokenizer.hasMoreTokens()) {
					footerPattern[patternCount] = tokenizer.nextToken();
					patternCount++;
				}
			}
		}
		return footerPattern;
	}

	/**
	 * Returns all the record (delimited by <code>NEW_LINE</code> character)
	 * starting from the start line number.
	 * 
	 * @param message
	 *            Input message.
	 * @param start
	 *            start line number. *
	 * @param footerPattern
	 *            pattern to recognize the footer to stop fetching the records
	 * 
	 * @return records delimited by new line character.
	 * @throws IOException
	 */
	private String getRecordsForLine(String message, int start,
			String[] footerPattern) throws IOException {
		BufferedReader reader = null;
		StringBuffer records = new StringBuffer();
		String record = null;
		String recordsForLine = null;
		ArrayList<Pattern> compiledPatterns = null;
		if (footerPattern != null) {
			compiledPatterns = new ArrayList<Pattern>();
			for (String patternStr : footerPattern) {
				Pattern p = Pattern.compile(patternStr);
				compiledPatterns.add(p);
			}
		}

		try {
			reader = new BufferedReader(new StringReader(message));
			record = reader.readLine();
			int i = 1;
			boolean exit = false;
			while (record != null
					&& !record.trim().equals(FusionConstants.EMPTY)) {
				if (record != null
						&& !record.trim().equals(FusionConstants.EMPTY)
						&& i >= start) {
					// check if the record matches the footer pattern
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
					records.append(record);
					records.append(FusionConstants.NEW_LINE);
				}
				i++;
				record = reader.readLine();
			}
		} finally {
			reader.close();
		}
		// FIXME :: can be optimized
		recordsForLine = records.toString();
		if (recordsForLine != null
				&& recordsForLine.endsWith(FusionConstants.NEW_LINE)) {
			recordsForLine = recordsForLine.substring(0, recordsForLine
					.length() - 1);
		}
		// Remove extra new line if present.
		return recordsForLine;
	}

	/**
	 * Iterates through the message and returns the record for the line number
	 * provided. Records are split based on new line character.
	 * 
	 * @precondition message != null && line > 0
	 * @param message
	 *            input message.
	 * @param line
	 *            record line number.
	 * @return record as per the line number provided.
	 * @throws IOException
	 */
	private String getRecordForLine(String message, int line)
			throws IOException {
		BufferedReader reader = null;
		String record = null;
		try {
			reader = new BufferedReader(new StringReader(message));
			record = reader.readLine();
			if (line == 1) {
				return record;
			} else {
				int i = 1;
				while (record != null) {
					i++;
					record = reader.readLine();
					if (i == line) {
						break;
					}
				}
			}
		} finally {
			reader.close();
		}
		return record;
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
	private int getOffset(ServiceConfig config, Map<String, Object> headers)
			throws Exception {
		int offset = 0;
		String offsetConfig = (String) config.getProperty(OFFSET);
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
		 * // considering the user would provide the index starting from 1 which
		 * // should be changed to 0 as per the string indexes. if ( offset > 0)
		 * { offset--; }
		 */return offset;
	}
}

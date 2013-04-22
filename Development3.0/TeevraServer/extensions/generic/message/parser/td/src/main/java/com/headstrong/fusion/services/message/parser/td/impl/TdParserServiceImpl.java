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
 * $Id: TdParserServiceImpl.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 21, 2008 
 */

package com.headstrong.fusion.services.message.parser.td.impl;

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

import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.config.parse.ServiceConfigurationParserRegistry;
import com.headstrong.fusion.services.message.commons.config.exception.InvalidConfigurationException;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.td.ColumnIndexBinding;
import com.headstrong.fusion.services.message.commons.config.parser.td.TdBindConfigParser;
import com.headstrong.fusion.services.message.commons.util.MessageServiceUtil;
import com.headstrong.fusion.services.message.parser.td.TdParserService;

/**
 * Tag-Delimited Parser service.
 */
public class TdParserServiceImpl extends GenericMediationService implements
		TdParserService {
	private static final Logger logger = LoggerFactory
			.getLogger(TdParserServiceImpl.class);

	/**
	 * Tag-Delimited Header parser.
	 */
	private TdHeaderParser headerParser = new TdHeaderParser();
	/**
	 * Tag-Delimited Body Parser.
	 */
	private TdBodyParser bodyParser = new TdBodyParser();

	@Override
	/**
	 * Initializes the service configuration parser for schemaMapping.
	 */
	public void init() {
		super.init();
		// Register service configuration parsers.
		ServiceConfigurationParserRegistry configurationParserRegistry = ServiceConfigurationParserRegistry
				.getInstance();
		configurationParserRegistry.registerServiceConfigurationParser(
				TdParserService.class.getSimpleName(), OBJECT_MAPPING_ID,
				TdBindConfigParser.class.getSimpleName());
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
			logger.debug("Message received for processing by "
					+ config.getProcessId() + " service "
					+ config.getServiceId() + ",  Message is {" + inputMessage
					+ "}");
		}
		if (inputMessage != null) {
			// check the parse type if partial parsing is required or full
			// parsing.
			String type = (String) config.getProperty(TYPE);
			SchemaDescriptor<ColumnIndexBinding> tdSchemaDescriptor = null;
			try {
				tdSchemaDescriptor = (SchemaDescriptor<ColumnIndexBinding>) getSchemaDescriptor(config);
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
			String delimiter = (String) config.getProperty(DELIMITER);

			Boolean considerQuote = Boolean.getBoolean((String) config
					.getProperty(CONSIDER_QUOTE));
			// HACK
			// if parse type is not specified make default to BODY parsing.
			if (type != null && type.equals(PARSE_TYPE_HEADER)) {
				int line = Integer.parseInt((String) config
						.getProperty(HEADER_LINE));
				String record = null;
				try {
					record = this.getRecordForLine(inputMessage, line);
				} catch (IOException e) {
					// Bugchase 234 Error Monitoring # I/O Error
					logger.error("I/O error while reading the message."
							+ errorString, e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e, inputMessage,
							"I/O error while reading the message", false);
				}
				if (logger.isDebugEnabled()) {
					logger.debug("Message Header{" + record + "}");
				}
				Map<String, Object> headers = headerParser.parse(delimiter,
						tdSchemaDescriptor, record, considerQuote);
				// set the message header.
				if (exchange.getIn().getHeaders() == null) {
					exchange.getIn().setHeaders(headers);
				} else {
					exchange.getIn().getHeaders().putAll(headers);
				}
			} else {
				ObjectDescriptor objectDescriptor = null;
				try {
					objectDescriptor = MessageServiceUtil
							.getObjectDescriptor(config);
				} catch (InvalidConfigurationException e) {
					// Bugchase 234 ErrorMonitoring # Exception is thrown if
					// there is no ObjectDescriptor for selected schema.
					logger.error("objectSchemaDescriptor not specified."
							+ errorString, e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e, inputMessage,
							"object descriptor error", false);
				}

				int start = this.getBodyStartLine(config);
				String[] footerPattern = this.getFooterPattern(config);

				String records = null;
				try {
					records = this.getRecordsForLine(inputMessage, start,
							footerPattern);
				} catch (IOException e) {
					// Bugchase 234 Error Monitoring # I/O Error
					logger.error("I/O error while reading the message."
							+ errorString, e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e, inputMessage,
							"I/O error while reading the message", false);
				}

				if (logger.isDebugEnabled()) {
					logger.debug("Message Body{" + records + "}");
				}
				List<DefaultBusinessObject> messages = new ArrayList<DefaultBusinessObject>();
				BufferedReader reader = new BufferedReader(new StringReader(
						records));
				String record = null;
				try {
					record = reader.readLine();
				} catch (IOException e) {
					// Bugchase 234 Error Monitoring # I/O Error
					logger.error("I/O error while reading the message."
							+ errorString, e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e, inputMessage,
							"I/O error while reading the message", false);
				}
				while (record != null
						&& !record.trim().equals(FusionConstants.EMPTY)) {
					DefaultBusinessObject defaultBusinessObject = null;
					try {
						defaultBusinessObject = bodyParser.parse(delimiter,
								objectDescriptor, tdSchemaDescriptor, record,
								considerQuote);
					} catch (Exception e) {
						// Bugchase 234 ErrorMonitoring # Exception is thrown
						// when value in
						// record cannot be converted to type mentioned in
						// schema.
						logger.error(
								"Unsupported data or datatype mismatch error while parsing the message."
										+ errorString, e);
						super.handleError(errorHandler, config.getProcessId(),
								config.getServiceId(), ERROR_TYPE_BUSINESS,
								config.getServiceType(), e, inputMessage,
								"Unsupported data in record,datatype mismatch",
								false);
					}
					messages.add(defaultBusinessObject);
					try {
						record = reader.readLine();
					} catch (IOException e) {
						// Bugchase 234 Error Monitoring # I/O Error
						logger.error("I/O error while reading the message."
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
					logger.error("I/O error." + errorString, e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_SYSTEM, config
									.getServiceType(), e, inputMessage,
							"I/O error", false);
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

	private String[] getFooterPattern(ServiceConfig config) {
		String[] footerPattern = null;
		if (config.getProperty(FOOTER_PATTERN) != null) {
			String patterns = ((String) config.getProperty(FOOTER_PATTERN))
					.trim();
			if (!"".equals(patterns)) {
				StringTokenizer tokenizer = (new StringTokenizer(patterns,
						PATTERNS_DELIMITER));
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
	 *            start line number.
	 * @param footerPattern
	 *            pattern to recognize the footer to stop fetching the records
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

					if (exit) { // footer is encountered
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

}

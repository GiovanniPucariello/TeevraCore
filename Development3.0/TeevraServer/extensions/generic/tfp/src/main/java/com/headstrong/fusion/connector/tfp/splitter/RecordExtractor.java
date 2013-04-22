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
 * $Id: RecordExtractor.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 5, 2010 
 */

package com.headstrong.fusion.connector.tfp.splitter;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.connector.tfp.TFPEndpoint;
import com.headstrong.fusion.connector.tfp.iterator.FileIterator;

/**
 * Extracts Records based on the record start patterns. Creates as many files as
 * the record start patterns
 */
/**
 * 
 */
public class RecordExtractor extends FileSplitter {

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(RecordExtractor.class);

	/**
	 * Record patterns separator
	 */
	private static final String recordPatternSeperator = ",";
	/**
	 * 'FIXML' tag, to be added at the start of the extracted record
	 */
	private static String FIXML = "FIXML";

	/**
	 * 'Batch' tag, to be added before that the start of records' batch
	 */
	private static String BATCH = "Batch";

	/**
	 * Record starts with '<'
	 */
	private static String recordStart = "<";

	/**
	 * Record ends with '>'
	 */
	private static String recordEnd = ">";

	/**
	 * Constructor which sets File splitter end point, configuration and Fusion
	 * processor.
	 * 
	 * @param endpoint TFP end point.
	 * @param processor Processor.
	 * @throws FusionException
	 */
	public RecordExtractor(TFPEndpoint endpoint, FusionProcessor processor)
			throws FusionException {
		setEndpoint(endpoint);
		setConfig(endpoint.getTfpConfiguration());
		setProcessor(processor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.connector.filesplitter.splitter.FileSplitter#split()
	 */
	@Override
	public void split() throws IOException, FusionException {

		/*if (config.getRecordStartPattern() != null) {
			String[] recordStartPatterns = config.getRecordStartPattern()
					.split(recordPatternSeperator);

			// get all the files in the specified directory
			File[] files = config.getFilesToProcess();

			// process all the files
			if (files != null) {
				for (File file : files) {
					for (String recordStartPattern : recordStartPatterns) {
						// extract the record
						String record = extractRecord(file, recordStartPattern);
						// process the record
						FileSplitterProcessor processor = new FileSplitterProcessorImpl();
						processor.process(this, record, recordStartPattern);
					}
					// once the processing of the file is done, move it to
					// '.camel' folder
					try {
						FileManager.moveFile(file, config);
					} catch (Exception e) {
						logger
								.error(
										"Error while moving the processed file to .camel directory",
										e);
						throw new FusionException(
								"Error while moving the processed file to .camel directory",
								e);
					}

				}
			} else {
				logger
						.info("No files to process in the file path specified yet");
			}

		} else {
			logger.info("Record start patterns are not specified");
		}*/

	}

	/**
	 * Extracts the batch of records from the given file.
	 * 
	 * @precondition
	 * @postcondition
	 * @param file					The File.
	 * @param recordStartPattern	Record start pattern.
	 * @return
	 * @throws IOException
	 * @throws FusionException
	 */
	private String extractRecord(File file, String recordStartPattern)
			throws IOException, FusionException {
		FileIterator fileIterator = new FileIterator(file);
		Iterator<String> iterator = fileIterator.iterator();

		StringBuffer str = new StringBuffer();

		while (iterator.hasNext()) {
			String currentLine = iterator.next();

			if (currentLine.startsWith(recordStart + BATCH)
					|| currentLine.startsWith(recordStartPattern)
					|| currentLine.endsWith(BATCH + recordEnd)) {
				str.append(currentLine + "\n");
			}
		}
		// closes the reader in Iterator
		fileIterator.close();
		return str.toString();
	}
}

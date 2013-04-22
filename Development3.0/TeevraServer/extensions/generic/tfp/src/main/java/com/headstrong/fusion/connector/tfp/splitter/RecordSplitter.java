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
 * $Id: FileSplitter.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.connector.tfp.splitter;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.connector.tfp.TFPEndpoint;

/**
 * Extracts Records based on the record start and end patterns. Creates the
 * files based on the batch size.
 */
public class RecordSplitter extends FileSplitter {

	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(RecordSplitter.class);

	/**
	 * Constructor which sets File splitter end point, configuration and Fusion
	 * processor.
	 * 
	 * @param endpoint
	 * @param processor
	 * @throws FusionException
	 */
	public RecordSplitter(TFPEndpoint endpoint, FusionProcessor processor)
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

		/*
		 * File[] files = config.getFilesToProcess(); // process all the files
		 * if (files != null) { for (File file : files) {
		 * 
		 * int recordCounter = 0; StringBuffer str = null;
		 * 
		 * FileIterator fileIterator = new FileIterator(file);
		 * 
		 * Iterator<String> iterator = fileIterator.iterator();
		 * 
		 * while (iterator.hasNext()) { String currentLine = iterator.next(); if
		 * (currentLine.startsWith(config.getRecordStartPattern())) { if
		 * (recordCounter % config.getBatchSize() == 0) { str = new
		 * StringBuffer(); } if (str != null) { str.append(currentLine + "\n"); }
		 * 
		 * recordCounter++;
		 *  } else if (currentLine.startsWith(config .getRecordEndPattern())) {
		 * if (str != null) { str.append(currentLine + "\n"); }
		 * 
		 * if (recordCounter % config.getBatchSize() == 0) { // process the
		 * record FileSplitterProcessor processor = new
		 * FileSplitterProcessorImpl(); processor.process(this, str.toString(),
		 * null);
		 *  } } else if (!currentLine.startsWith(config .getFooterPattern()) &&
		 * str != null) { str.append(currentLine + "\n"); } } if (str != null) { //
		 * process the record FileSplitterProcessor processor = new
		 * FileSplitterProcessorImpl(); processor.process(this, str.toString(),
		 * null);
		 *  } // close the file iterator fileIterator.Close(); // once the
		 * processing of the file is done, move it to // '.camel' folder try {
		 * FileManager.moveFile(file, config); } catch (Exception e) { logger
		 * .error( "Error while moving the processed file to .camel directory",
		 * e); throw new FusionException( "Error while moving the processed file
		 * to .camel directory", e); }
		 *  } } else { logger.info("No files to process in the file path
		 * specified yet"); }
		 */
	}
}

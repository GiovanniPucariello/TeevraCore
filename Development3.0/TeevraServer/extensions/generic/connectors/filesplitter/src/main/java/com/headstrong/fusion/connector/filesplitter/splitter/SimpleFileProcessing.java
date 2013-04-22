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
 * $Id: SimpleFileProcessor.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Apr 9, 2010 
 */

package com.headstrong.fusion.connector.filesplitter.splitter;

import java.io.File;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.connector.filesplitter.FileSplitterEndpoint;
import com.headstrong.fusion.connector.filesplitter.iterator.FileIterator;
import com.headstrong.fusion.connector.filesplitter.processor.FileSplitterProcessor;
import com.headstrong.fusion.connector.filesplitter.processor.FileSplitterProcessorImpl;
import com.headstrong.fusion.connector.filesplitter.utils.FileManager;

/**
 * SimpleFileProcessing doesnt split the file. It just reads the input files and
 * process them as strings
 */
public class SimpleFileProcessing extends FileSplitter {

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(SimpleFileProcessing.class);

	public SimpleFileProcessing(FileSplitterEndpoint endpoint,
			FusionProcessor processor) throws FusionException {
		this.endpoint = endpoint;
		this.config = endpoint.getFileSplitterBinding();
		this.processor = processor;
	}

	@Override
	public void split() throws Exception {
		// No splitting Involved, just process the file
		process();

	}

	public void process() throws Exception {

		FileSplitterProcessor processor = new FileSplitterProcessorImpl();

		// get all the files in the specified directory
		File[] files = config.getFilesToProcess();

		// process all the files
		if (files != null) {
			for (File file : files) {
				FileIterator fileIterator = new FileIterator(file);
				Iterator<String> iterator = fileIterator.iterator();

				StringBuffer str = new StringBuffer();

				while (iterator.hasNext()) {
					String currentLine = iterator.next();
					str.append(currentLine + "\n");
				}
				// closes the reader in Iterator
				fileIterator.Close();

				// process the record
				processor.process(this, str.toString(), null);

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
		}
	}
}
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
 * $Id: FileSplitterProcessorimpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 12, 2010 
 */

package com.headstrong.fusion.connector.filesplitter.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionNormalizedMessage;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.connector.filesplitter.splitter.FileSplitter;

/**
 * 
 */
public class FileSplitterProcessorImpl implements FileSplitterProcessor {

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(FileSplitterProcessorImpl.class);

	private static final String pattern_header_key = "record_pattern";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.connector.filesplitter.processor.FileSplitterProcessor#process(com.headstrong.fusion.connector.filesplitter.splitter.FileSplitter,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public void process(FileSplitter splitter, String message,
			String recordStartPattern) throws FusionException {

		// Forward message to next component in the process
		MessageExchange messageExchange = splitter.getEndpoint()
				.createExchange();
		NormalizedMessage normalizedMessage = new FusionNormalizedMessage();
		if (recordStartPattern != null) {
			normalizedMessage.setHeader(pattern_header_key, recordStartPattern);
		}
		normalizedMessage.setBody(message);
		messageExchange.setIn(normalizedMessage);

		try {
			splitter.getProcessor().process(messageExchange);
		} catch (Exception e) {
			logger.error("Error while processing the input message", e);
			throw new FusionException(
					"Error while processing the input message", e);
		}
	}

}

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
 * $Id: FileSplitConsumer.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.connector.filesplitter;

import java.io.File;
import java.io.FileFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionServiceSupport;
import com.headstrong.fusion.connector.filesplitter.config.FileSplitterConfiguration;
import com.headstrong.fusion.connector.filesplitter.splitter.FileSplitter;
import com.headstrong.fusion.connector.filesplitter.splitter.RecordExtractor;
import com.headstrong.fusion.connector.filesplitter.splitter.RecordSplitter;
import com.headstrong.fusion.connector.filesplitter.splitter.SimpleFileProcessing;

/**
 * File Splitter Consumer
 */
public class FileSplitterConsumer implements FusionConsumer<MessageExchange> {

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(FileSplitterConsumer.class);
	/**
	 * Fusion Service Support
	 */
	FusionServiceSupport serviceSupport;

	/**
	 * Fusion Processor
	 */
	private FusionProcessor processor;

	/**
	 * File Splitter Endpoint
	 */
	private FileSplitterEndpoint endpoint;

	/**
	 * File Splitter Configuration
	 */
	private FileSplitterConfiguration config;

	/**
	 * variable to stop executing thread
	 */
	private static volatile boolean pleaseStop;

	/**
	 * Constructor, which initializes the filesplitter endpoint, config and
	 * Fusion Processor
	 * 
	 * @param endpoint
	 * @param fusionProcessor
	 */
	public FileSplitterConsumer(FileSplitterEndpoint endpoint,
			FusionProcessor fusionProcessor) {
		this.endpoint = endpoint;
		this.config = endpoint.getFileSplitterBinding();
		this.processor = fusionProcessor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#start()
	 */
	@Override
	public void start() throws Exception {
		logger.info("Starting FileSplitterService thread");
		FileSplitterService service = new FileSplitterService(this.endpoint,
				this.processor, this.config);
		Thread t = new Thread(service);
		t.start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#stop()
	 */
	@Override
	public void stop() throws Exception {
		logger.info("FileSplitterService thread stopped)");

		pleaseStop = true;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionConsumer#setServiceSupport(com.headstrong.fusion.commons.component.FusionServiceSupport)
	 */
	@Override
	public void setServiceSupport(FusionServiceSupport serviceSupport) {
		this.serviceSupport = serviceSupport;

	}

	/**
	 * @return the serviceSupport
	 */
	public FusionServiceSupport getServiceSupport() {
		return serviceSupport;
	}

	/**
	 * @return the config
	 */
	public FileSplitterConfiguration getConfig() {
		return config;
	}

	/**
	 * @param config
	 *            the config to set
	 */
	public void setConfig(FileSplitterConfiguration config) {
		this.config = config;
	}

	/**
	 * @return the processor
	 */
	public FusionProcessor getProcessor() {
		return processor;
	}

	/**
	 * @param processor
	 *            the processor to set
	 */
	public void setProcessor(FusionProcessor processor) {
		this.processor = processor;
	}

	/**
	 * @return the endpoint
	 */
	public FileSplitterEndpoint getEndpoint() {
		return endpoint;
	}

	/**
	 * @param endpoint
	 *            the endpoint to set
	 */
	public void setEndpoint(FileSplitterEndpoint endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * Service for file splitting
	 */
	private static class FileSplitterService implements Runnable {
		private FileSplitterEndpoint endpoint;
		private FileSplitterConfiguration config;
		private FusionProcessor processor;

		public FileSplitterService(FileSplitterEndpoint endpoint,
				FusionProcessor processor, FileSplitterConfiguration config) {
			this.endpoint = endpoint;
			this.processor = processor;
			this.config = config;
		}

		@Override
		public void run() {
			pleaseStop = false;
			// poll input directory
			String inputDirectory = null;
			if (config.getInputDirectory() != null) {
				inputDirectory = config.getInputDirectory();
			} else {
				logger.warn("File Path is empty");
				return;
			}

			File rootDirectory = new File(inputDirectory);
			if (!rootDirectory.exists() || !rootDirectory.isDirectory()) {
				logger
						.error("Cannot poll as specified directory does not exist or its not a directory: "
								+ rootDirectory);
				return;
			}

			File[] inputFiles = null;

			while (!pleaseStop) {

				inputFiles = rootDirectory.listFiles(new FileFilter() {
					@Override
					public boolean accept(File pathname) {
						if (config.getFilePattern() != null
								&& config.getFilePattern().trim().length() != 0) {

							return pathname.getName().matches(
									config.getFilePattern());

						} else if (!pathname.isDirectory()) {
							return true;
						}
						return false;
					}
				}

				);

				if (inputFiles != null) {
					config.setFilesToProcess(inputFiles);
				}
				// if no start pattern specified process without splitting else
				// split and process the files
				try {
					FileSplitter fileSplitter;

					// if no record start pattern is provided, FileSplitter
					// assumes as no splitting involved
					if (this.endpoint.getFileSplitterBinding()
							.getRecordStartPattern() == null) {
						fileSplitter = new SimpleFileProcessing(endpoint,
								processor);
					} else {
						if (this.endpoint.getFileSplitterBinding()
								.getRecordEndPattern() != null) {
							fileSplitter = new RecordSplitter(endpoint,
									processor);
						} else {
							fileSplitter = new RecordExtractor(endpoint,
									processor);
						}
					}

					if (fileSplitter != null) {
						fileSplitter.split();
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				try {
					Thread.sleep(config.getDelay());
				} catch (InterruptedException ex) {
					logger.debug("FileSplitterService thread interrupted");
				}
			}
		}
	}
}

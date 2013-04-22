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
 * $Id: TFPConsumer.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.connector.tfp;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionServiceSupport;
import com.headstrong.fusion.connector.tfp.config.TFPConfiguration;
import com.headstrong.fusion.connector.tfp.utils.FileManager;
import com.tfp.factory.BatchManagerFactory;
import com.tfp.impl.ProcessObjectImpl;
import com.tfp.interfaces.BatchManager;
import com.tfp.interfaces.ProcessObject;
import com.tfp.manager.PropertyConstants;

/**
 * TFP consumer.
 * 
 * Its a polling consumer, though managed locally. all this has to be abstracted
 * out.
 */
public class TFPConsumer implements FusionConsumer<MessageExchange> {

	/**
	 * Fusion Service Support
	 */
	private FusionServiceSupport serviceSupport;

	/**
	 * Fusion Processor
	 */
	private FusionProcessor processor;

	/**
	 * File Splitter Endpoint
	 */
	private TFPEndpoint endpoint;

	/**
	 * File Splitter Configuration
	 */
	private TFPConfiguration config;

	/**
	 * Exception reported by the ScheduledFilePoller thread.
	 */
	private Exception firstExceptionThrown;

	/**
	 * Scheduled Executor service.
	 */
	private final ScheduledExecutorService executor;
	/**
	 * initial delay.
	 */
	private long initialDelay = 1000;
	/**
	 * wait interval
	 */
	private long delay = 500;
	/**
	 * Time unit type
	 */
	private TimeUnit timeUnit = TimeUnit.MILLISECONDS;
	/**
	 * Using fixed delay or not.
	 */
	private boolean useFixedDelay;
	/**
	 * A delayed result-bearing action that can be cancelled. Usually a
	 * scheduled future is the result of scheduling a task with a
	 * ScheduledExecutorService. Used for polling.
	 * 
	 */
	private ScheduledFuture<?> future;
	/**
	 * Directory poller thread.
	 */
	private final ScheduledFilePoller poller;
	/**
	 * Logger
	 */
	private static final Logger consumerLogger = LoggerFactory
			.getLogger(TFPConsumer.class);

	/**
	 * Constructor, which initializes the config and the Fusion Processor.
	 * 
	 * @param endpoint
	 *            The endpoint.
	 * @param fusionProcessor
	 *            The processor.
	 */
	public TFPConsumer(TFPEndpoint endpoint, FusionProcessor fusionProcessor) {
		this.endpoint = endpoint;
		config = endpoint.getTfpConfiguration();
		delay = config.getPollingDelay();
		processor = fusionProcessor;
		// this would start a single thread.
		executor = Executors.newSingleThreadScheduledExecutor();
		poller = new ScheduledFilePoller(endpoint, fusionProcessor, config);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#start()
	 */
	@Override
	public void start() throws Exception {
		firstExceptionThrown = null;
		poller.setConsumer(this);
		if (isUseFixedDelay()) {
			consumerLogger.info("Starting fixed delay executor.");
			future = executor.scheduleWithFixedDelay(poller, getInitialDelay(),
					getDelay(), getTimeUnit());
		} else {
			consumerLogger.info("Starting executor.");
			future = executor.scheduleAtFixedRate(poller, getInitialDelay(),
					getDelay(), getTimeUnit());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#stop()
	 */
	@Override
	public void stop() throws Exception {
		consumerLogger.info("Stopping executor.");
		if (future != null) {
			future.cancel(false);
		}
		if (firstExceptionThrown != null) {
			throw firstExceptionThrown;
		}
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
	public TFPConfiguration getConfig() {
		return config;
	}

	/**
	 * @param config
	 *            the config to set
	 */
	public void setConfig(TFPConfiguration config) {
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
	public TFPEndpoint getEndpoint() {
		return endpoint;
	}

	/**
	 * @param endpoint
	 *            the endpoint to set
	 */
	public void setEndpoint(TFPEndpoint endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * Scheduled file poller.
	 */
	private static class ScheduledFilePoller implements Runnable {
		/**
		 * Endpoint instance
		 */
		private TFPEndpoint endpoint;
		/**
		 * TFPConfiguration.
		 */
		private TFPConfiguration config;
		/**
		 * Fusion Processor.
		 */
		private FusionProcessor processor;
		/**
		 * Consumer.
		 */
		private TFPConsumer consumer;
		/**
		 * Logger
		 */
		private static final Logger pollerLogger = LoggerFactory
				.getLogger(ScheduledFilePoller.class);

		/**
		 * @param endpoint
		 *            tfp endpoint.
		 * @param processor
		 *            fusion processor.
		 * @param config
		 *            tfp configuration.
		 */
		public ScheduledFilePoller(TFPEndpoint endpoint,
				FusionProcessor processor, TFPConfiguration config) {
			this.endpoint = endpoint;
			this.processor = processor;
			this.config = config;
		}

		/**
		 * Invoked whenever it should be polled.
		 */
		public void run() {
			try {
				poll();
			} catch (Exception e) {
				pollerLogger.error("Error during polling the consumer.", e);
				if (this.consumer.firstExceptionThrown == null) {
					this.consumer.firstExceptionThrown = e;
				}
			}
		}

		/**
		 * Polls a particular directory.
		 * 
		 * @throws Exception
		 */
		public void poll() throws Exception {

			pollerLogger.info("Polling the TFPConsumer" + consumer);

			File[] inputFiles = FileManager.getFilesWithExcludePattern(config,
					PropertyConstants.CAMEL_FOLDER_PATTERN);

			if (inputFiles != null) {
				for (File file : inputFiles) {
					if (file != null) {
						File processingFile = FileManager
								.moveFileToDir(file, config.getInputDirectory());
						if (processingFile != null) {
							ProcessObject processObject = new ProcessObjectImpl();
							processObject.setBatchType(config.getBatchType());
							processObject.setFileName(processingFile
									.getAbsolutePath());
							processObject.setProcessor(this.processor);
							processObject.setEndpoint(this.endpoint);
							BatchManager batchManager;
							batchManager = BatchManagerFactory
									.getBatchManager(processObject);
							batchManager.processBatch();
						}
					}
				}
				
				//This is necessary in order to release the Processed files.
				System.gc();
			}
		}

		/**
		 * The consumer.
		 * 
		 * @return The consumer.
		 */
		public TFPConsumer getConsumer() {
			return consumer;
		}

		/**
		 * Set the consumer.
		 * 
		 * @param consumer
		 *            The consumer.
		 */
		public void setConsumer(TFPConsumer consumer) {
			this.consumer = consumer;
		}
	}

	/**
	 * Get the initial delay.
	 * 
	 * @return The initialDelay.
	 */
	public long getInitialDelay() {
		return initialDelay;
	}

	/**
	 * Set the initial delay.
	 * 
	 * @param initialDelay
	 *            The value to set.
	 */
	public void setInitialDelay(long initialDelay) {
		this.initialDelay = initialDelay;
	}

	/**
	 * Get delay.
	 * 
	 * @return The delay.
	 */
	public long getDelay() {
		return delay;
	}

	/**
	 * Set the delay.
	 * 
	 * @param delay
	 *            The value to set.
	 */
	public void setDelay(long delay) {
		this.delay = delay;
	}

	/**
	 * Check if the fixed delay is set.
	 * 
	 * @return The fixed delay value.
	 */
	public boolean isUseFixedDelay() {
		return useFixedDelay;
	}

	/**
	 * Set the useFixedDelay attribute.
	 * 
	 * @param useFixedDelay
	 *            The value to set.
	 */
	public void setUseFixedDelay(boolean useFixedDelay) {
		this.useFixedDelay = useFixedDelay;
	}

	/**
	 * Get the Time Unit.
	 * 
	 * @return The time unit set.
	 */
	public TimeUnit getTimeUnit() {
		return timeUnit;
	}

	/**
	 * Set the TimeUnit.
	 * 
	 * @param timeUnit
	 *            The value to set.
	 */
	public void setTimeUnit(TimeUnit timeUnit) {
		this.timeUnit = timeUnit;
	}
}

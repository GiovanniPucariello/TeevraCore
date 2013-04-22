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
 * $Id: ProcessDefinitionReader.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 8, 2008 
 */

package com.headstrong.fusion.core;

import java.io.File;
import java.io.FilenameFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Reads process definition files from the temp directory.
 */
public class ProcessDefinitionReader extends FusionRunnable {
	private static Logger logger = LoggerFactory
			.getLogger(ProcessDefinitionReader.class);

	private ApplicationContext applicationContext;

	/**
	 * @param applicationContext
	 */
	public ProcessDefinitionReader(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.FusionRunnable#task()
	 */
	@Override
	public void task() {
		// 1: pick the process definition file from the configuration directory.
		String processDirectory = applicationContext.getBundleContext()
				.getProperty("fusion.process.temp.dir");
		if (processDirectory != null) {
			File directory = new File(processDirectory);
			if (directory != null && directory.listFiles() != null) {
				File[] processFiles = directory.listFiles(new FilenameFilter() {
					public boolean accept(File dir, String name) {
						name = name.toLowerCase();
						return name.endsWith(".xml");
					}
				});
				for (File processFile : processFiles) {
					try {
						// It'll throw exception if the process is already
						// registered.
						this.applicationContext.registerProcess(processFile,
								true);
						// Remove the temporary file.
						processFile.delete();
					} catch (Exception e) {
						logger.error("Error Reading Process File"
								+ processFile.getName());
						// Ignore the file.
					}
				}
			} else {
				logger.debug("Process directory missing");
			}
		}
	}
}

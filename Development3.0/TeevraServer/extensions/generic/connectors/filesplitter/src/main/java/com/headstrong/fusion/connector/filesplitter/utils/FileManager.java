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
 * $Id: FileManager.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 11, 2010 
 */

package com.headstrong.fusion.connector.filesplitter.utils;

import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.connector.filesplitter.config.FileSplitterConfiguration;

/**
 * Contains file/directory related operations
 */
public class FileManager {

	private static String PROCESSEDFILES_FOLDER_NAME = ".teevra";
	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(FileManager.class);

	/**
	 * returns all the files in the directory as a list. It excludes the
	 * '.camel' folder, which gets created during process run
	 * 
	 * @precondition
	 * @postcondition
	 * @param config
	 * @return
	 * @throws Exception
	 */
	public static File[] getFiles(FileSplitterConfiguration config)
			throws Exception {

		String filePath = null;
		if (config.getInputDirectory() != null) {
			filePath = config.getInputDirectory();
		} else {
			logger.warn("File Path is empty");
			return null;
		}

		File directory = new File(filePath);
		if (!directory.exists() || !directory.isDirectory()) {
			logger
					.warn("Cannot poll as directory does not exist or its not a directory: "
							+ directory);
			return null;
		}

		return directory.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if (pathname.getName().endsWith(PROCESSEDFILES_FOLDER_NAME)) {
					return false;
				}
				return true;
			}
		});
	}

	/**
	 * Moves the given file to the .camel folder in the given location
	 * 
	 * @precondition
	 * @postcondition
	 * @param file
	 * @param config
	 * @throws Exception
	 */
	public static void moveFile(File file, FileSplitterConfiguration config)
			throws Exception {

		File directory = new File(config.getInputDirectory());

		File[] camelFolders = directory.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {

				return pathname.getName().endsWith(PROCESSEDFILES_FOLDER_NAME);
			}
		});

		if (camelFolders.length == 0) {
			File camelFolder = new File(config.getInputDirectory()
					+ "\\.teevra");
			camelFolder.mkdir();
		}
		if (camelFolders[0].isDirectory()) {
			boolean success = file.renameTo(new File(camelFolders[0], file
					.getName()));

			if (success) {
				logger
						.info("Processed file was successfully moved to .teevra folder");
				renameFile(file, config);
			} else {
				logger
						.info("Processed file was not able to move to .teevra folder");
			}
		}
	}

	/**
	 * 
	 * Renames the file appending time to it
	 * 
	 * @precondition
	 * @postcondition
	 * @param file
	 * @param config
	 * @throws Exception
	 */
	public static void renameFile(File file, FileSplitterConfiguration config)
			throws Exception {

		File originalFile = new File(config.getInputDirectory() + "/"
				+ PROCESSEDFILES_FOLDER_NAME + "/" + file.getName());

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date = sdf.format(cal.getTime());

		sdf = new SimpleDateFormat("hh:mm:ss");
		String time = sdf.format(cal.getTime()).replace(":", "");

		boolean success = originalFile.renameTo(new File(config
				.getInputDirectory()
				+ "/"
				+ PROCESSEDFILES_FOLDER_NAME
				+ "/"
				+ file.getName()
				+ "."
				+ date + time));

		if (success) {
			logger.info("Processed file was successfully renamed");
		} else {
			logger.info("Failed while renaming the file");
		}
	}
}

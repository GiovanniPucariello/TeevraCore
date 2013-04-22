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

package com.headstrong.fusion.connector.tfp.utils;

import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.connector.tfp.config.TFPConfiguration;

/**
 * Contains file/directory related operations.
 */
public class FileManager {

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(FileManager.class);

	/**
	 * Returns the files in the directory as a list that doesn't end having the
	 * passed pattern.
	 * 
	 * @param config
	 *            TFPConfiguration is used to get the input directory.
	 * @param endPattern
	 *            End pattern.
	 * @return Files that doesn't end having the passed pattern.
	 * @throws Exception
	 */
	public static File[] getFilesWithExcludePattern(TFPConfiguration config,
			final String endPattern) throws Exception {

		String filePath = null;
		if (config.getInputDirectory() != null) {
			filePath = config.getInputDirectory();
		} else {
			String errStr = "Invalid input directory "
					+ config.getInputDirectory();
			logger.error(errStr);
			throw new RuntimeException(errStr);
		}

		File directory = new File(filePath);
		if (!directory.exists() || !directory.isDirectory()) {
			String errStr = "Cannot poll as directory " + directory
					+ " does not exist.";
			logger.warn(errStr);
			throw new RuntimeException(errStr);
		}

		return directory.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				if (file.getName().trim().endsWith(endPattern)) {
					return false;
				}
				return true;
			}
		});
	}

	/**
	 * Moves the given file to the .camel folder in the given location
	 * 
	 * @param sourceFile
	 *            Source file.
	 * @param destinationDirPath
	 *            Destination directory path.
	 */
	public static File moveFileToDir(File sourceFile, String destinationDirPath) {

		if (destinationDirPath != null && !destinationDirPath.trim().equals("")) {

			File directory = new File(destinationDirPath);
			if (!directory.exists() || !directory.isDirectory()) {
				String errStr = "Cannot move as directory " + directory
						+ " does not exist.";
				logger.error(errStr);
			}

			// Class to filter the .camel folder
			final class CamelFolderFilter implements FileFilter {
				@Override
				public boolean accept(File pathname) {

					return pathname.getName().endsWith(".camel");
				}
			}

			CamelFolderFilter camelFolderFilter = new CamelFolderFilter();
			File[] camelFolders = directory.listFiles(camelFolderFilter);

			// Create the .camel if it is not created already.
			if (camelFolders.length == 0) {
				// Use file separator to support all file systems.
				File camelFolder = new File(destinationDirPath + File.separator
						+ ".camel");
				// This ensures that the parent file is also created.
				camelFolder.mkdirs();
				camelFolders = directory.listFiles(camelFolderFilter);
			}

			// Moving the file to .camel.
			if (camelFolders[0].isDirectory()) {

				// Use file separator to support all file systems.
				File destFile = new File(camelFolders[0] + File.separator
						+ sourceFile.getName());

				boolean success = sourceFile.renameTo(destFile);

				if (success) {
					return destFile;
					// renameFile(file, config);
				} else {
					logger
							.error("Input file could not be moved to camel folder.");
				}

			}
		} else {
			logger.error("Invalid input directory.");
		}
		return null;
	}

	/**
	 * 
	 * Renames the file appending time to it.
	 * 
	 * @precondition
	 * @postcondition
	 * @param file
	 * @param config
	 * @throws Exception
	 */
	public static void renameFile(File file, TFPConfiguration config)
			throws Exception {

		// Use file separator to support all file systems.
		File originalFile = new File(config.getInputDirectory() + File.separator
				+ ".camel" + File.separator + file.getName());

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date = sdf.format(cal.getTime());

		sdf = new SimpleDateFormat("hh:mm:ss");
		String time = sdf.format(cal.getTime()).replace(":", "");

		// Use file separator to support all file systems.
		boolean success = originalFile.renameTo(new File(config
				.getInputDirectory()
				+ File.separator + "camel" + File.separator + file.getName() + "." + date + time));

		if (success) {
			logger.info("Processed file was successfully renamed.");
		} else {
			logger.info("Failed while renaming the file.");
		}
	}
}

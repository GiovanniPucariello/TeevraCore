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
 * $Id: FusionLoggerWriter.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.logger.slf4j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Arrays;

/**
 * The <code>FusionLoggerWriter</code> abstract the output writing
 * functionality for the fusion Logging implementation. This class is able to
 * write to log files and manage log file rotation for these files.
 * Alternatively this class supports writing to the standard output if no log
 * file name is configured.
 */
class FusionLoggerWriter extends Writer {

	private static final long FACTOR_KB = 1024;

	private static final long FACTOR_MB = 1024 * FACTOR_KB;

	private static final long FACTOR_GB = 1024 * FACTOR_MB;

	private static final String ARCHIVE_FILE_EXT = ".bak";	// Refactored for fixed number of archived files

	private static final String ARCHIVE_FILE_RENAME_SEP = "_";	// Refactored for fixed number of archived files

	/**
	 * The string to place at the end of a line. This is a platform specific
	 * string set from the <code>line.separator</code> system property.
	 */
	private static final String LINE_SEPARATOR = System
			.getProperty("line.separator");

	/**
	 * The PID of the configuration from which this instance has been
	 * configured.
	 */
	private final String configurationPID;

	/**
	 * The actual <code>Writer</code> to which this instance delegates any
	 * message writes.
	 */
	private Writer delegatee;

	/**
	 * The object on which access to this instance are serialized in
	 * multi-threading environments.
	 */
	protected final Object lock = new Object();

	/**
	 * The <code>java.io.File</code> of the log or <code>null</code> if this
	 * instance writes to the standard output.
	 */
	private File file;

	/**
	 * The absolute path to the log file or <code>null</code> if this instance
	 * writes to the standard output.
	 */
	private String path;

	/**
	 * The maximum size of the log file after which the current log file is
	 * rolled. This setting is ignored if logging to standard output.
	 */
	private long maxSize;

	/**
	 * The maximum number of old rotated log files to keep. This setting is
	 * ignored if logging to standard output.
	 */
	private int maxNum;

	/**
	 * On file rotation last file will be copied to the archive directory. If
	 * this is not specified the file will be removed from the log directory.
	 */
	private String archiveDir;

	private int maxArchiveNum;	// Added for fixed number of archived files
	
	private FilenameFilter filenameFilter;	// Added for fixed number of archived files

	/**
	 * Creates a new instance of this class to be configured from the given
	 * <code>configurationPID</code>. This new instance is not ready until
	 * the {@link #configure(String, int, String)} method is being called.
	 */
	FusionLoggerWriter(String configurationPID) {
		this.configurationPID = configurationPID;
	}

	/**
	 * (Re)configures this instance to log to the given file.
	 * 
	 * @param logFileName
	 *            The name of the file to log to or <code>null</code> to log
	 *            to the standard output.
	 * @param fileNum
	 *            The maximum number of old (rotated) files to keep. This is
	 *            ignored if <code>logFileName</code> is <code>null</code>.
	 * @param fileSize
	 *            The maximum size of the log file before rotating it. This is
	 *            ignored if <code>logFileName</code> is <code>null</code>.
	 * @throws IOException
	 *             May be thrown if the file indicated by
	 *             <code>logFileName</code> cannot be opened for writing.
	 */
	void configure(String logFileName, int fileNum, String fileSize,
			String archiveDir, int logArchiveNum) throws IOException {

		// lock this instance while reconfiguring it
		synchronized (lock) {

			// change the log file name (if reconfigured)
			if (logFileName == null || !logFileName.equals(path)) {

				// close the current file
				close();

				if (logFileName == null) {

					this.path = null;
					this.file = null;

				} else {

					// make sure the file is absolute and derive the path from
					// there
					File file = new File(logFileName);
					if (!file.isAbsolute()) {
						file = file.getAbsoluteFile();
					}

					this.path = file.getAbsolutePath();
					this.file = file;
					
					// START: Added for fixed number of archived files
					final String archFileName = this.file.getName();
					filenameFilter = new FilenameFilter() {
			            public boolean accept(File currFile, String name) {
			                return name.startsWith(archFileName + ARCHIVE_FILE_RENAME_SEP) && name.endsWith(ARCHIVE_FILE_EXT);
			            }
			        };
			        // END: Added for fixed number of archived files
					
				}

				setDelegatee(createWriter());

			} else {

				// make sure, everything is written
				flush();

			}

			// assign new rotation values
			this.maxNum = fileNum;
			this.maxArchiveNum = logArchiveNum;	// Added for fixed number of archived files
			this.maxSize = convertMaxSizeSpec(fileSize);
			if (archiveDir != null) {
				File archiveDirFile = new File(archiveDir);
				if (!archiveDirFile.exists()) {
					archiveDirFile.mkdir();
				}

				File tempArchDir = new File(archiveDir);
				if (tempArchDir.exists() && tempArchDir.isDirectory()) {
					// archive directory.
					this.archiveDir = archiveDir;
				}
			}
			// check whether the new values cause different rotation
			checkRotate();
		}
	}

	String getConfigurationPID() {
		return configurationPID;
	}

	String getPath() {
		return path;
	}

	long getMaxSize() {
		return maxSize;
	}

	int getMaxNum() {
		return maxNum;
	}

	// ---------- Writer Overwrite ---------------------------------------------

	@Override
	public void close() throws IOException {
		synchronized (lock) {
			if (delegatee != null) {
				flush();

				delegatee.close();
				delegatee = null;
			}
		}
	}

	@Override
	public void flush() throws IOException {
		synchronized (lock) {
			if (delegatee != null) {
				delegatee.flush();

				// check whether we have to rotate the log file
				checkRotate();
			}
		}

	}

	@Override
	public void write(int c) throws IOException {
		synchronized (lock) {
			if (delegatee != null) {
				delegatee.write(c);
			}
		}
	}

	@Override
	public void write(char[] cbuf) throws IOException {
		synchronized (lock) {
			if (delegatee != null) {
				delegatee.write(cbuf);
			}
		}
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		synchronized (lock) {
			if (delegatee != null) {
				delegatee.write(cbuf, off, len);
			}
		}
	}

	@Override
	public void write(String str) throws IOException {
		synchronized (lock) {
			if (delegatee != null) {
				delegatee.write(str);
			}
		}
	}

	@Override
	public void write(String str, int off, int len) throws IOException {
		synchronized (lock) {
			if (delegatee != null) {
				delegatee.write(str, off, len);
			}
		}
	}

	public void writeln() throws IOException {
		synchronized (lock) {
			write(LINE_SEPARATOR);
			flush();
		}
	}

	// ---------- internal -----------------------------------------------------

	static long convertMaxSizeSpec(String maxSize) {
		long factor;
		int len = maxSize.length() - 1;

		maxSize = maxSize.toUpperCase();

		if (maxSize.endsWith("G")) {
			factor = FACTOR_GB;
		} else if (maxSize.endsWith("GB")) {
			factor = FACTOR_GB;
			len--;
		} else if (maxSize.endsWith("M")) {
			factor = FACTOR_MB;
		} else if (maxSize.endsWith("MB")) {
			factor = FACTOR_MB;
			len--;
		} else if (maxSize.endsWith("K")) {
			factor = FACTOR_KB;
		} else if (maxSize.endsWith("KB")) {
			factor = FACTOR_KB;
			len--;
		} else {
			factor = 1;
			len = -1;
		}

		if (len > 0) {
			maxSize = maxSize.substring(0, len);
		}

		try {
			return factor * Long.parseLong(maxSize);
		} catch (NumberFormatException nfe) {
			return 10 * 1024 * 1024;
		}
	}

	void setDelegatee(Writer delegatee) {
		synchronized (lock) {
			this.delegatee = delegatee;
		}
	}

	Writer getDelegatee() {
		synchronized (lock) {
			return delegatee;
		}
	}

	/**
	 * Must be called while the lock is held !!
	 */
	private void checkRotate() throws IOException {
		if (file != null && file.length() > maxSize) {

			getDelegatee().close();

			if (maxNum >= 0) {

				// remove oldest file
				File dstFile = new File(path + "." + maxNum);
				if (dstFile.exists()) {
					archiveFile(dstFile);
				}

				// rename next files
				for (int i = maxNum - 1; i >= 0; i--) {
					File srcFile = new File(path + "." + i);
					if (srcFile.exists()) {
						srcFile.renameTo(dstFile);
					}
					dstFile = srcFile;
				}

				// rename youngest file
				file.renameTo(dstFile);

			} else {

				// just remove the old file if we don't keep backups
				archiveFile(file);
			}

			// create new file
			setDelegatee(createWriter());
		}
	}

	private void archiveFile(File file) {
		if (this.archiveDir != null) {

			final String arcName = this.file.getName();
			
			// START: Added for fixed number of archived files
			
			File archiveDirFile = new File(archiveDir + File.separator);
			String[] files = archiveDirFile.list(filenameFilter);
			
			if(files.length > this.maxArchiveNum) {
				Arrays.sort(files);
				File delFile = new File(archiveDir + File.separator + files[0]);
				delFile.delete();
			}
			
			// END: Added for fixed number of archived files
			
			file.renameTo(new File(archiveDir + File.separator + arcName + ARCHIVE_FILE_RENAME_SEP + System.currentTimeMillis() + ARCHIVE_FILE_EXT));
		} else {
			file.delete();
		}
	}

	private Writer createWriter() throws IOException {
		if (file == null) {
			return new OutputStreamWriter(System.out) {
				@Override
				public void close() {
					// not really !!
				}
			};
		}

		// ensure parent path of the file to create
		file.getParentFile().mkdirs();

		// open the file in append mode to not overwrite an existing
		// log file from a previous instance running
		return new OutputStreamWriter(new FileOutputStream(file, true));
	}

}

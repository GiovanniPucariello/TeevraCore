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
 * $Id: FileIterator.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.connector.filesplitter.iterator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.FusionException;

/**
 * File Iterator for the given file
 */
public class FileIterator implements Iterable<String> {

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(FileIterator.class);
	/**
	 * Buffered reader
	 */
	private BufferedReader reader;

	/**
	 * Constructor, initializes the buffered reader for the file at the given
	 * location
	 * 
	 * @param filePath
	 * @throws FusionException
	 */
	public FileIterator(String filePath) throws FusionException {
		try {
			reader = new BufferedReader(new FileReader(filePath));
		} catch (FileNotFoundException e) {

			logger.error("File to split not found at the given location "
					+ filePath, e);
			throw new FusionException(
					"File to split not found at the given location " + filePath,
					e);
		}

	}

	/**
	 * Constructor, initializes the buffered reader for the given file
	 * 
	 * @param filePath
	 * @throws FusionException
	 */
	public FileIterator(java.io.File file) throws FusionException {
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {

			logger.error("File to split not found " + file, e);
			throw new FusionException("File to split not found  " + file, e);
		}

	}

	/**
	 * closes the reader
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void Close() {
		try {
			reader.close();
		} catch (Exception ex) {
		}
	}

	/**
	 * Returns the iterator for the file
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<String> iterator() {
		return new File();
	}

	/**
	 * File Class, provides the iterator methods
	 */
	private class File implements Iterator<String> {
		private String currentLine;

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Iterator#hasNext()
		 */
		public boolean hasNext() {
			try {
				currentLine = reader.readLine();
			} catch (Exception ex) {
				currentLine = null;
				ex.printStackTrace();
			}

			return currentLine != null;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Iterator#next()
		 */
		public String next() {
			return currentLine;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Iterator#remove()
		 */
		public void remove() {
		}

	}

}

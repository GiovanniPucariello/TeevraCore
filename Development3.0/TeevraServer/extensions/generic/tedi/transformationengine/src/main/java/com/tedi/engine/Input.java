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
 * $Id: Input.java
 * $Revision: 
 * $Author: byoung
 * $DateTime: Mar 8, 2010 
 */
package com.tedi.engine;

import javax.activation.DataSource;

import objTedi.objTedi_srcfile;
import tedi.common.CachedLog;
import tedi.common.LogOutputInterface;
import tedi.parser.AbstractParser;
import tedi.server.engine.MapLog;
import tedi.util.StringDataSource;

/**
 * This file is provided by MCH team for TEDI engine integration.
 */
public class Input {

	/**
	 * Output interface.
	 */
	private LogOutputInterface log;
	/**
	 * Source instance.
	 */
	private objTedi_srcfile source;
	/**
	 * Data source.
	 */
	private DataSource dataSource = null;
	/**
	 * Read error or not.
	 */
	protected boolean readError = false;
	/**
	 * Parser.
	 */
	private AbstractParser parser = null;
	/**
	 * Original logical record.
	 */
	protected Object originalLogicalRecord = null;

	/**
	 * Input constructor
	 * 
	 * @param source
	 *            The TEDI source file instance.
	 * @param dataBlob
	 *            The input data.
	 */
	public Input(objTedi_srcfile source, String dataBlob) {
		this.source = source;
		dataSource = new StringDataSource(dataBlob);
		parser = AbstractParser.createParser(dataSource, source);
		parser.setReturnType(AbstractParser.NO_META_DATA);
	}

	/**
	 * Input constructor
	 * 
	 * @param source
	 *            The TEDI source file instance.
	 * @param dataSource
	 *            The input data.
	 */
	public Input(objTedi_srcfile source, DataSource dataSource) {
		this.source = source;
		this.dataSource = dataSource;
		parser = AbstractParser.createParser(dataSource, source);
		parser.setReturnType(AbstractParser.NO_META_DATA);
	}

	/**
	 * Set the map log.
	 * 
	 * @param log
	 *            The Map log
	 */
	public void setMapLog(MapLog log) {
		this.log = log;
	}

	/**
	 * Get the cached log.
	 * 
	 * @return the cached log
	 */
	public String getCachedLog() {
		CachedLog plc = (CachedLog) parser.getLogOutput();
		return plc.getCache();
	}

	/**
	 * Method to read the logical record.
	 * 
	 * @return The logical record.
	 * @throws Exception
	 */
	public Object readRecord() throws Exception {
		Object result = null;
		result = parser.nextRecord();
		originalLogicalRecord = parser.getOriginalLogicalRecord();
		return result;
	}

	/**
	 * Get the original logical record.
	 * 
	 * @return Original Logical Record
	 */
	public Object getOriginalLogicalRecord() {
		return originalLogicalRecord;
	}

	/**
	 * Return is error has occurred.
	 * 
	 * @return Return is error has occurred.
	 */
	public boolean getReadError() {
		return readError;
	}

	/**
	 * Set the validation for the parser.
	 * 
	 * @param state
	 *            validation state
	 */
	public void setValidate(boolean state) {
		parser.setValidate(state);
	}

	/**
	 * Close the parser, if it exists.
	 */
	public void fileCleanup() {
		if (parser != null) {
			parser.close();
		}
	}
}

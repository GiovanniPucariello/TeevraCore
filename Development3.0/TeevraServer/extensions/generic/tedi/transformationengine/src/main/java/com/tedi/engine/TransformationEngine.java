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
 * $Id: TransformationEngine.java
 * $Revision: 
 * $Author: byoung
 * $DateTime: Mar 8, 2010 
 */
package com.tedi.engine;

import java.util.Hashtable;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import objTedi.*;
import tedi.common.TediInterpreter;

/**
 * This file is provided by MCH team for TEDI engine integration.
 */
public class TransformationEngine {

	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(TransformationEngine.class);
	/**
	 * Map instance.
	 */
	private MapFile map = null;
	/**
	 * Source hash.
	 */
	private Hashtable sourceHash = null;
	/**
	 * Source instance.
	 */
	private objTedi_srcfile source = null;
	/**
	 * Tedi interpreter.
	 */
	private TediInterpreter xi = null;
	/**
	 * To store execution results.
	 */
	private ExecutionResults execResults = new ExecutionResults();

	/**
	 * To set the source files.
	 * 
	 * @param table
	 */
	public void setSourceFiles(Hashtable table) {
		sourceHash = table;
	}

	/**
	 * To set the map files.
	 * 
	 * @param mapFile
	 */
	public void setMapFile(MapFile mapFile) {
		map = mapFile;
		source = map.getSourceFile();
	}

	/**
	 * Method to initialize the TEDI interpreter.
	 * 
	 * @throws Exception
	 */
	public void initInterpreter() throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("Initiallizing TEDI interpreter.");
		}
		xi = new TediInterpreter(execResults);
		xi.setTediMapFile(map);
		xi.setExecutionResults(null);
		try {
			xi.set("directives", new Properties());
			xi.set("exit", false);
			xi.set("goTo", "");
			if (map != null)
				xi.set("map", map);
		} catch (bsh.EvalError evalErr) {
			execResults.post("Error initializing interpreter: "
					+ evalErr.getMessage());
		}
		xi.setFileType(map.get_type());
		xi.setSourceFileType(source.get_type());
	}

	/**
	 * Return the map file.
	 * 
	 * @return the map file.
	 */
	public MapFile getMapFile() {
		return this.map;
	}

	/**
	 * Return the TEDI interpreter.
	 * 
	 * @return the TEDI interpreter.
	 */
	public TediInterpreter getInterpreter() {
		return this.xi;
	}

	/**
	 * Return the execution results
	 * 
	 * @return The execution results.
	 */
	public ExecutionResults getExecResults() {
		return this.execResults;
	}

	/**
	 * The engine exception class.
	 */
	private class EngineException extends Exception {
		private Exception rootException;
		private String rootReason;
		private int code;

		/**
		 * Constructor
		 * 
		 * @param excption
		 *            The exception.
		 * @param cde
		 *            The code.
		 * @param msg
		 *            The message.
		 */
		EngineException(Exception excption, int cde, String msg) {
			code = cde;
			rootException = excption;
			rootReason = msg;
		}

		/**
		 * Get message
		 * 
		 * @param The
		 *            message.
		 */
		public String getMessage() {
			return rootReason;
		}

		/**
		 * Fetch the exception instance. *
		 * 
		 * @return The exception
		 */
		public Exception getRootException() {
			return rootException;
		}

		/**
		 * Get the exception code.
		 * 
		 * @return
		 */
		public int getCode() {
			return code;
		}
	}
}

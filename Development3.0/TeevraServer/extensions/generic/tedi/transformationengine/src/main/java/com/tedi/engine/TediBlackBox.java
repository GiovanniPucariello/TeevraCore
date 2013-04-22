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
 * $Id: TediBlackBox.java
 * $Revision: 
 * $Author: byoung
 * $DateTime: Mar 8, 2010 
 */
package com.tedi.engine;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

import objTedi.MapFile;
import objTedi.objTedi_srcfile;

import org.dom4j.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tedi.common.TediInterpreter;
import tedi.parser.AbstractParser;

import com.tedi.TediService;
import com.tedi.activator.BundleContextManager;
import com.tedi.beans.TransformResult;

/**
 * This file is provided by MCH team for TEDI engine integration.
 */
public class TediBlackBox {

	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(TediBlackBox.class);
	private static final long serialVersionUID = 8819702606796024849L;
	/**
	 * Source maps are cached with cachedSourceMap.
	 */
	private static Map<String, Hashtable<String, objTedi_srcfile>> cachedSourceMap = new HashMap<String, Hashtable<String, objTedi_srcfile>>();
	/**
	 * Source path
	 */
	public static final String SOURCE_FILE_PATH = "com/tedi/sources/";
	/**
	 * Target path
	 */
	public static final String TARGET_FILE_PATH = "com.tedi.maps.";

	/**
	 * Processing the message to get output as string.
	 * 
	 * @param mapClazz
	 *            The map file name.
	 * @param dataBlob
	 *            The input message.
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws Exception
	 */
	public static String doTransformToString(String mapClazz, String dataBlob)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException, IOException, Exception {
		TransformResult tr = doTransformToBean(mapClazz, dataBlob);
		return tr.getPayload();
	}

	/**
	 * Fetch the TEDI source file
	 * 
	 * @param srcName
	 * 
	 * 
	 *            Source file name.
	 * @return The objTedi_srcfile source instance.
	 * @throws Exception
	 */
	public static objTedi_srcfile getTediSourceObject(String srcName)
			throws Exception {
		logger.info("Fetching the objTedi_srcfile instance of the source "
				+ srcName);
		objTedi_srcfile theSrc = null;
		String objName = srcName + ".dat";
		ObjectInputStream ois = new ObjectInputStream(BundleContextManager
				.getInstance().getBundleContext().getBundle().getEntry(
						SOURCE_FILE_PATH + objName).openStream());
		theSrc = (objTedi_srcfile) ois.readObject();
		ois.close();

		return theSrc;
	}

	/**
	 * Processing the message.
	 * 
	 * @param mapClazz
	 *            The map file name.
	 * @param dataBlob
	 *            The input message.
	 * @return The transformation result.
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws Exception
	 */
	public static TransformResult doTransformToBean(String mapClazz,
			String dataBlob) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException, IOException,
			Exception {

		logger
				.info("Transformation of message initiated inside for the map "
						+ mapClazz);

		// PREPARE map+source
		Object obj = Class.forName(
				TARGET_FILE_PATH + mapClazz).newInstance();
		
		CompiledMapInterface mi =  (CompiledMapInterface) obj;
		
		logger.info("Map file loaded succesfully."+ mapClazz);
		
		MapFile theMap = mi.getMapFile();

		objTedi_srcfile theSrc = null;
		Hashtable<String, objTedi_srcfile> srcHash = (Hashtable<String, objTedi_srcfile>) cachedSourceMap
				.get(mapClazz);
		if (null == srcHash) {
			String srcName = theMap.get_source();
			theSrc = getTediSourceObject(srcName);
			srcHash = new Hashtable<String, objTedi_srcfile>();
			srcHash.put(srcName, theSrc);
			cachedSourceMap.put(mapClazz, srcHash);
		} else {
			theSrc = (objTedi_srcfile) srcHash.get(theMap.get_source());
		}

		theMap.setSourceFile(theSrc);

		if (logger.isDebugEnabled()) {
			logger.debug("Map file initallized.");
		}

		// PREPARE engine
		TransformationEngine engine = new TransformationEngine();
		engine.setMapFile(theMap);
		engine.setSourceFiles(srcHash);
		engine.initInterpreter();

		if (logger.isDebugEnabled()) {
			logger.debug("TransformationEngine initallized.");
		}
		TediInterpreter interpreter = engine.getInterpreter();

		// PARSE 1 logical record
		Input input = new Input(theSrc, dataBlob);
		if (AbstractParser.getProcessingType(theSrc.get_type()).equals(
				TediService.XML)) {
			input.setValidate(false);
			interpreter.setXMLSource((Document) input.readRecord());
			interpreter.setSourceValuesHashtable(null);
			interpreter.getGenericFunctions().setXMLDocument(
					interpreter.getXMLSource());
			interpreter.getGenericFunctions().setSourceValuesHashtable(null);
		} else {
			interpreter
					.setSourceValuesHashtable((Hashtable) input.readRecord());
			interpreter.setXMLSource(null);
			interpreter.getGenericFunctions().setXMLDocument(null);
			interpreter.getGenericFunctions().setSourceValuesHashtable(
					interpreter.getSourceValuesHashtable());
		}

		// EXECECUTE compiled map
		mi.setEngine(engine);
		Vector[] structureAndData = mi.processUnitOfWork();

		if (logger.isDebugEnabled()) {
			logger.debug("Executed map file for TEDI Transformation.");
		}

		// PREPARE output
		AbstractOutput outputClazz = null;
		if (mi.getOutputType().equals(TediService.XML)) {
			outputClazz = new XMLOutput();
		} else if (mi.getOutputType().equals(TediService.DELIMITED)) {
			outputClazz = new DelimitedOutput();
		} else {
			outputClazz = new FixedOutput();
		}
		outputClazz.setExecutionResults(engine.getExecResults());
		outputClazz.setMap(mi.getMapFile());

		if (logger.isDebugEnabled()) {
			logger.debug("Output file prepared for TEDI transformation.");
		}
		String transformedData = outputClazz.process(structureAndData[0],
				structureAndData[1]);

		if (transformedData.trim().equals(""))
			logger.info("Output payload empty during TEDI transformation.");

		TransformResult result = new TransformResult();
		result.setReturnCode(engine.getExecResults().getReturnCode());
		result.setPayload(transformedData);

		return result;
	}
	
	public static void setCachedSourceMap(String mapClazz, Hashtable<String, objTedi_srcfile> srcHash) {
		
		cachedSourceMap.put(mapClazz, srcHash);
	}
}

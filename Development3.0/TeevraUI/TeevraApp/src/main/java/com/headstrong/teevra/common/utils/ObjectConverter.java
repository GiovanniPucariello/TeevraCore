/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright � 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: ObjectConverter.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jul 29, 2009 
 */

package com.headstrong.teevra.common.utils;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.exception.ObjectConversionException;

/**
 * Converts the given objects to the specified data types
 */
public class ObjectConverter {
	/**
	 * Logger for ObjectConverter
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ObjectConverter.class);

	/**
	 * converts the given object to Long
	 * 
	 * @precondition
	 * @postcondition
	 * @param data
	 * @return
	 * @throws ObjectConversionException
	 */
	public static Long getLong(Object data) throws ObjectConversionException {
		logger.info("Converting the object: '" + data + "' to Long");
		if (data instanceof Long) {
			return (Long) data;
		} else if (data instanceof Integer) {
			return ((Integer) data).longValue();
		} else {
			return Long.parseLong(data.toString());
		}
	}

	/**
	 * converts the given object to integer
	 * 
	 * @precondition
	 * @postcondition
	 * @param data
	 * @return
	 * @throws ObjectConversionException
	 */
	public static int getInt(Object data) throws ObjectConversionException {
		logger.info("Converting the object: '" + data + "' to integer");
		if (data instanceof Integer) {
			return (Integer) data;
		} else {
			return Integer.parseInt(data.toString());
		}
	}

	/**
	 * converts the given object to TimeStamp
	 * 
	 * @precondition
	 * @postcondition
	 * @param data
	 * @return
	 * @throws ObjectConversionException
	 */
	public static Timestamp getTimeStamp(Object data)
			throws ObjectConversionException {
		logger.info("Converting the object: '" + data + "' to Timestamp");
		if (data instanceof Timestamp) {
			return (Timestamp) data;
		} else {
			return new Timestamp(getLong(data));
		}
	}

	/**
	 * converts the given object to String
	 * 
	 * @precondition
	 * @postcondition
	 * @param data
	 * @return
	 * @throws ObjectConversionException
	 */
	public static String getString(Object data)
			throws ObjectConversionException {
		logger.info("Converting the object: '" + data + "' to String");
		return data.toString();
	}

	/**
	 * converts the given object to Boolean
	 * 
	 * @precondition
	 * @postcondition
	 * @param data
	 * @return
	 */
	public static Boolean getBoolean(Object data)
			throws ObjectConversionException {
		logger.info("Converting the object: '" + data + "' to Boolean");
		if (data instanceof Boolean) {
			return (Boolean) data;
		} else {
			return Boolean.parseBoolean(data.toString());
		}
	}
}

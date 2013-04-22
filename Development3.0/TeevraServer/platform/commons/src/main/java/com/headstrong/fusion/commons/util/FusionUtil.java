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
 * $Id: FusionUtil.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Dec 31, 2008 
 */

package com.headstrong.fusion.commons.util;

import java.math.BigDecimal;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.jasypt.util.text.BasicTextEncryptor;

import com.headstrong.fusion.commons.exception.DecryptionException;
import com.headstrong.fusion.commons.exception.EncryptionException;
import com.headstrong.fusion.commons.exception.ErrorContext;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.exception.HandledException;

/**
 * Fusion Utility class.
 */
public class FusionUtil {

	/**
	 * Populates the datamap which is {@link Map}in following fashion. If
	 * exists key = parameterName, and value is not Array, then an new array is
	 * created and old valus is stored in array. The new value parameterValue is
	 * added to array.
	 * 
	 * @precondition
	 * @postcondition
	 * @param dataMap
	 * @param parameterName
	 * @param parameterValue
	 */
	@SuppressWarnings("unchecked")
	public static void populateMap(Map<String, Object> dataMap,
			String parameterName, Object parameterValue) {
		if (dataMap.containsKey(parameterName)) {
			// parametervalue has to be added in arraylist now
			Object existingData = dataMap.get(parameterName);
			if (existingData instanceof List) {
				((List<Object>) existingData).add(parameterValue);
				dataMap.put(parameterName, existingData);
			} else {
				List<Object> newList = new ArrayList<Object>();
				newList.add(existingData);
				newList.add(parameterValue);
				dataMap.put(parameterName, newList);
			}

		} else {
			dataMap.put(parameterName, parameterValue);
		}
	}

	/**
	 * Gets the integer value out of data.
	 * 
	 * @precondition
	 * @postcondition
	 * @param data
	 * @return
	 * @throws NumberFormatException
	 */
	public static int parseInt(Object data) throws NumberFormatException {
		int i = 0;
		if (data instanceof String) {
			i = Integer.parseInt((String) data);
		} else if (data instanceof Integer) {
			i = (Integer) data;
		}
		return i;
	}

	/**
	 * Gets the double value out of data.
	 * 
	 * @precondition
	 * @postcondition
	 * @param data
	 * @return
	 * @throws NumberFormatException
	 */
	public static double parseDouble(Object data) throws NumberFormatException {
		double i = 0.0;
		if (data != null) {
			if (data instanceof String) {
				i = Double.parseDouble((String) data);
			} else if (data instanceof Integer) {
				i = (Integer) data;
			} else if (data instanceof Double) {
				i = (Double) data;
			} else if (data instanceof BigDecimal) {
				i = Double.parseDouble(data.toString());
			}
		}
		return i;
	}

	/**
	 * Compares obj1 and obj2 if they are integers.
	 * 
	 * @precondition
	 * @postcondition
	 * @param obj1
	 * @param obj2
	 * @return
	 */
	public static int compareInteger(Object obj1, Object obj2) {
		Integer int1 = parseInt(obj1);
		Integer int2 = parseInt(obj2);
		return int1.compareTo(int2);
	}

	/**
	 * Safely substring a string Following rules are applied during the string
	 * handling If start index is less than string length, blank string is
	 * returned If end index is not specified and string is longer then start
	 * index, the whole string from start index to end is returned If end index
	 * is specified and string is longer then start index, but shorter than end
	 * index, the whole string from start index to end is returned else string
	 * from start index to end index is returned
	 * 
	 * @param str
	 *            String to be returned as substring
	 * @param startInd
	 *            start index
	 * @param endInd
	 *            end Index (if <i>null</i> this field is ignored
	 * 
	 * @return substring
	 */
	public static String safeSubString(String str, int startInd, Integer endInd) {

		if ((str != null) && (str.length() > startInd)) {
			if (endInd == null) {
				return str.substring(startInd);
			} else {
				int endIndexVal = endInd.intValue();

				if (endIndexVal <= startInd) {
					return "";
				} else if (endIndexVal > str.length()) {
					endIndexVal = str.length();
				}
				return str.substring(startInd, endIndexVal);
			}
		}
		return "";
	}

	/**
	 * Compares String1 with String2
	 * 
	 * @precondition
	 * @postcondition
	 * @param string1
	 * @param string2
	 * @return
	 */
	public static int compareString(String string1, String string2) {
		return string1.compareTo(string2);
	}

	/**
	 * Gets current system time in milliseconds.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 */
	public static String getCurrentSystemDate() {
		return Long.toString(System.currentTimeMillis());
	}

	/**
	 * If error handler is configured reports the error using reportError method
	 * of error handler, or else creates a new FusionException and rethrows the
	 * same which would be caught and reported by GenericProcessor. 
	 * 
	 * @param errorHandler
	 *            Error Handler.
	 * @param processId
	 *            Unique process identifier.
	 * @param serviceId
	 *            Unique Service identifier.
	 * @param errorType
	 *            Type of Exception ( Business/ System )
	 * @param componentType
	 *            Component Type
	 * @param cause
	 *            Cause of Error.
	 * @param resource
	 *            Resource processing which the exception was thrown.
	 * @param moreInfo
	 *            Additional Information.
	 * @throws FusionException
	 *             Exception thrown if Error Handler is not configured.
	 */
	public static void handleError(ErrorHandler errorHandler, String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo,
			boolean stopExecution) throws FusionException {
		if (errorHandler != null) {
			ErrorContext errorContext = FusionUtil.createErrorContext(
					processId, serviceId, errorType, componentType, cause,
					resource, moreInfo);
			errorHandler.reportError(errorContext);
			if (stopExecution) {
				throw new HandledException(
						"Dummy exception thrown to stop the execution");
			}
		} else {
			String exceptionMessage = "Exception thrown in process = "
					+ processId + ", service = " + serviceId
					+ ", component type = " + componentType
					+ "while processing [" + resource + "].";
			FusionException exception = new FusionException(exceptionMessage,
					cause);
			throw exception;
		}
	}

	/**
	 * Creates an Error Context Object which can be passed to the Error handler.
	 * 
	 * @param serviceId
	 *            unique service identifier.
	 * @param errorType
	 *            type of the error Business/System
	 * @param cause
	 *            Cause of the Error
	 * @param resource
	 *            Resource
	 * @param moreInfo
	 *            Additional Information
	 * @return Error Context.
	 */
	protected static ErrorContext createErrorContext(String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo) {
		ErrorContext errorContext = new ErrorContext();
		errorContext.setProcessId(processId);
		errorContext.setServiceId(serviceId);
		errorContext.setType(errorType);
		errorContext.setComponentType(componentType);
		errorContext.setTimestamp(new Date());
		errorContext.setCause(cause);
		errorContext.setResource(resource);
		errorContext.setMoreInfo(moreInfo);
		return errorContext;
	}

	/**
	 * If error handler is configured reports the error using reportError method
	 * of error handler, or else creates a new FusionException and rethrows the
	 * same which would be caught and reported by GenericProcessor.It also
	 * takes care of any extra information passed for the error context
	 * 
	 * @param errorHandler
	 *            Error Handler.
	 * @param processId
	 *            Unique process identifier.
	 * @param serviceId
	 *            Unique Service identifier.
	 * @param errorType
	 *            Type of Exception ( Business/ System )
	 * @param componentType
	 *            Component Type
	 * @param cause
	 *            Cause of Error.
	 * @param resource
	 *            Resource processing which the exception was thrown.
	 * @param moreInfo
	 *            Additional Information.
	 * @throws FusionException
	 *             Exception thrown if Error Handler is not configured.
	 */
	public static void handleError(ErrorHandler errorHandler, String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo,
			Map<String, String> properties, boolean stopExecution)
			throws FusionException {
		if (errorHandler != null) {
			ErrorContext errorContext = FusionUtil.createErrorContext(
					processId, serviceId, errorType, componentType, cause,
					resource, moreInfo, properties);
			errorHandler.reportError(errorContext);
			if (stopExecution) {
				throw new HandledException(
						"Dummy exception thrown to stop the execution");
			}
		} else {
			String exceptionMessage = "Exception thrown in process = "
					+ processId + ", service = " + serviceId
					+ ", component type = " + componentType
					+ "while processing [" + resource + "].";
			FusionException exception = new FusionException(exceptionMessage,
					cause);
			throw exception;
		}
	}

	/**
	 * Creates an Error Context Object which can be passed to the Error handler.
	 * 
	 * @param serviceId
	 *            unique service identifier.
	 * @param errorType
	 *            type of the error Business/System
	 * @param cause
	 *            Cause of the Error
	 * @param resource
	 *            Resource
	 * @param moreInfo
	 *            Additional Information
	 * @return Error Context.
	 */
	protected static ErrorContext createErrorContext(String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo,
			Map<String, String> properties) {
		ErrorContext errorContext = FusionUtil.createErrorContext(processId,
				serviceId, errorType, componentType, cause, resource, moreInfo);
		errorContext.setProperties(properties);
		return errorContext;
	}
	
	/**
	 * If error handler is configured reports the error using reportError method
	 * of error handler, or else creates a new FusionException and rethrows the
	 * same which would be caught and reported by GenericProcessor.It also
	 * takes care of any extra information passed for the error context
	 * 
	 * @param errorHandler
	 *            Error Handler.
	 * @param processId
	 *            Unique process identifier.
	 * @param serviceId
	 *            Unique Service identifier.
	 * @param errorType
	 *            Type of Exception ( Business/ System )
	 * @param componentType
	 *            Component Type
	 * @param cause
	 *            Cause of Error.
	 * @param resource
	 *            Resource processing which the exception was thrown.
	 * @param moreInfo
	 *            Additional Information.
	 * @param fixmlVersion
	 *            sp2 or sp1            
	 * @throws FusionException
	 *             Exception thrown if Error Handler is not configured.
	 */
	public static void handleError(ErrorHandler errorHandler, String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo,
			Map<String, String> properties, boolean stopExecution,String fixmlVersion)
			throws FusionException {
		if (errorHandler != null) {
			ErrorContext errorContext = FusionUtil.createErrorContext(
					processId, serviceId, errorType, componentType, cause,
					resource, moreInfo, properties,fixmlVersion);
			errorHandler.reportError(errorContext);
			if (stopExecution) {
				throw new HandledException(
						"Dummy exception thrown to stop the execution");
			}
		} else {
			String exceptionMessage = "Exception thrown in process = "
					+ processId + ", service = " + serviceId
					+ ", component type = " + componentType
					+ "while processing [" + resource + "].";
			FusionException exception = new FusionException(exceptionMessage,
					cause);
			throw exception;
		}
	}

	/**
	 * Creates an Error Context Object which can be passed to the Error handler.
	 * 
	 * @param serviceId
	 *            unique service identifier.
	 * @param errorType
	 *            type of the error Business/System
	 * @param cause
	 *            Cause of the Error
	 * @param resource
	 *            Resource
	 * @param moreInfo
	 *            Additional Information
	 * @param fixmlVersion
	 *            sp2 or sp1            
	 * @return Error Context.
	 */
	protected static ErrorContext createErrorContext(String processId,
			String serviceId, String errorType, String componentType,
			Throwable cause, Object resource, String moreInfo,
			Map<String, String> properties,String fixmlVersion) {
		ErrorContext errorContext = FusionUtil.createErrorContext(processId,
				serviceId, errorType, componentType, cause, resource, moreInfo);
		errorContext.setProperties(properties);
		errorContext.setFixmlVersion(fixmlVersion);
		return errorContext;
	}
	
	/**
	 * For MD5 encryption
	 * @param plainText
	 * @return
	 * @throws EncryptionException
	 */
	public static String encrypt(String plainText) throws EncryptionException {
		BasicTextEncryptor encryptor = new BasicTextEncryptor();
		encryptor.setPassword("teevra");
		return encryptor.encrypt(plainText);
	}
	
	/**
	 * For MD5 Decryption
	 * @param encryptedText
	 * @return
	 * @throws DecryptionException
	 */
	public static String decrypt(String encryptedText) throws DecryptionException {
		BasicTextEncryptor encryptor = new BasicTextEncryptor();
		encryptor.setPassword("teevra");
		return encryptor.decrypt(encryptedText);
	}
	
	/**
	 * For AES encryption
	 * @param plainText
	 * @return
	 * @throws EncryptionException
	 * @throws NoSuchPaddingException 
	 * @throws NoSuchAlgorithmException 
	 * @throws InvalidKeyException 
	 * @throws BadPaddingException 
	 * @throws IllegalBlockSizeException 
	 */
	public static String encrypt(String plainText, String key) throws EncryptionException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		SecretKeySpec skey = new SecretKeySpec(Base64.hexToByte(key), "AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
	    cipher.init(Cipher.ENCRYPT_MODE, skey);
	    byte[] encrypted = cipher.doFinal(Base64.hexToByte(plainText));
	    return Base64.byteToHex(encrypted);
	}
	
	/**
	 * For AES Decryption
	 * @param encryptedText
	 * @return
	 * @throws DecryptionException
	 * @throws NoSuchPaddingException 
	 * @throws NoSuchAlgorithmException 
	 * @throws InvalidKeyException 
	 * @throws BadPaddingException 
	 * @throws IllegalBlockSizeException 
	 */
	public static String decrypt(String encryptedText, String key) throws DecryptionException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		SecretKeySpec skey = new SecretKeySpec(Base64.hexToByte(key), "AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
		cipher.init(Cipher.DECRYPT_MODE, skey);
	      byte[] decrypted = cipher.doFinal(Base64.hexToByte(encryptedText));
		return new String(decrypted);
	}
	
}

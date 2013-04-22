package com.tfp.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import objTedi.objTedi_srcfile;
import org.slf4j.Logger;
import tedi.parser.AbstractParser;
import com.tedi.engine.TediBlackBox;
import com.tfp.properties.TEDIParseConfigType.Record;

public class TediParsingUtility {

	/**
	 * Source file map.
	 */
	private static final Map<String, objTedi_srcfile> srcFileMap = Collections
			.synchronizedMap(new HashMap<String, objTedi_srcfile>());

	/**
	 * Convert to byte array
	 * 
	 * @param contents
	 *            The object content that is to be converted to an byte array.
	 * @return The byte array.
	 */
	public static byte[] convertToByteArray(Object contents) {
		return (contents instanceof byte[]) ? (byte[]) contents
				: ((String) contents).getBytes();
	}

	/**
	 * Utility method to replace invalid characters and trim right, if auto trim
	 * is set.
	 * 
	 * @param logicalRecord
	 *            The logical record.
	 * @param record
	 *            The record.
	 * @return
	 */
	@SuppressWarnings("unused")
	private static Object replaceInvalidCharsAndTrimRight(Object logicalRecord,
			Record record) {
		// char tediPadChar = record.getTediPadCharacter();
		// char tfpReplaceChar = record.getTfpPadCharacter();
		// char tfpReplaceChar = tranConfig.getTfpReplaceCharacter(); - original
		boolean isTrimRight = record.isAutoRightTrim();
		if (logicalRecord instanceof byte[]) {
			String s = new String((byte[]) logicalRecord);
			/*
			 * if (Character.UNASSIGNED != tediPadChar && tediPadChar !=
			 * tfpReplaceChar) { s = s.replace(tediPadChar, tfpReplaceChar); }
			 */
			if (isTrimRight) {
				s = trimRight(s);
			}
			return s.getBytes();
		} else if (logicalRecord instanceof String) {
			String s = (String) logicalRecord;
			/*
			 * if (Character.UNASSIGNED != tediPadChar && tediPadChar !=
			 * tfpReplaceChar) { s = s.replace(tediPadChar, tfpReplaceChar); }
			 */
			if (isTrimRight) {
				s = trimRight(s);
			}
			return s;
		}
		return logicalRecord;
	}

	/**
	 * Trim operation.
	 * 
	 * @param str
	 *            The string to trim.
	 * @return Trimmed string.
	 */
	private static String trimRight(String str) {
		int len = str.length();
		int st = 0;
		while ((st < len) && (Character.isWhitespace(str.charAt(len - 1)))) {
			len--;
		}
		return (len < str.length()) ? str.substring(st, len) : str;
	}

	/**
	 * Fetch the next record.
	 * 
	 * @param parser
	 *            The parser.
	 * @return The record object.
	 * @throws Exception
	 */
	public static Object getNextRecord(AbstractParser parser) throws Exception {
		Object nextRecord = null;
		Object logicalRecord = null;
		nextRecord = parser.nextRecord();
		if (nextRecord != null) {
			logicalRecord = parser.getOriginalLogicalRecord();
		}
		return logicalRecord;
	}

	/**
	 * Gets the source from the TEDI Black Box
	 * 
	 * @param srcName
	 * @return
	 * @throws Exception
	 */
	public static objTedi_srcfile getSourceFile(String srcName, Logger logger)
			throws Exception {
		objTedi_srcfile srcFile = null;
		if (srcFileMap.containsKey(srcName)) {
			srcFile = (objTedi_srcfile) srcFileMap.get(srcName);
		} else {
			try {
				// Properties p = new Properties();
				/*
				 * String initCtxFactory =
				 * PropertiesManager.getServerProperty(PropertyConstants.CONTEXT_FACTORY);
				 * if(initCtxFactory!=null && initCtxFactory.trim().length()>0){
				 * p.put(Context.INITIAL_CONTEXT_FACTORY,
				 * initCtxFactory.trim()); }
				 * 
				 * //String providerUrl =
				 * TFPConfigLoader.getInstance().getAppServerConfig().getProviderURL();
				 * String providerUrl =
				 * PropertiesManager.getServerProperty(PropertyConstants.PROVIDER_URL);
				 * if(providerUrl!=null && providerUrl.trim().length()>0){
				 * p.put(Context.PROVIDER_URL, providerUrl.trim()); }
				 */

				// get the TEDI Source object from the TEDI Black Box
				srcFile = TediBlackBox.getTediSourceObject(srcName);

				// cache for better performance
				srcFileMap.put(srcName, srcFile);
			} catch (Exception e) {
				String errString = "Error getting source file.";
				logger.error(errString);
				throw new Exception(errString, e);
			}
		}
		return srcFile;
	}
}

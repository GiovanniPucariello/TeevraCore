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
 * $Id: FusionLauncherUtils.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 25, 2008 
 */

package com.headstrong.fusion.launcher.utils;

import java.io.File;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.jasypt.util.text.BasicTextEncryptor;

import com.headstrong.fusion.launcher.exception.DecryptionException;
import com.headstrong.fusion.launcher.exception.EncryptionException;

/**
 * FusionLauncherUtils contains the common Strings used in the launcher application. 
 * It also contains the helper methods. 
 */

public class FusionLauncherUtils {
	public static final String[] logLevels = { "FATAL", "ERROR", "WARN",
		"INFO", "DEBUG" };

	
	public static final String DEFAULT_EMBEDDED_EXEC="true";
	
	public static final String DEFAULT_CACHE_PROFILE="launcher";
	
	public static final String DEFAULT_CACHE_DIR="fusionlauncher";
	
	public static final String DEFAULT_LOG_FILE="fusion.log";
	
	
	// ---------- Property file variable substitution support
	// --------------------

	/**
	 * The starting delimiter of variable names (value is "${").
	 */
	private static final String DELIM_START = "${";

	/**
	 * The ending delimiter of variable names (value is "}").
	 */
	private static final String DELIM_STOP = "}";

	/**
	 * This method performs property variable substitution on the specified
	 * value. If the specified value contains the syntax
	 * <tt>${&lt;prop-name&gt;}</tt>, where <tt>&lt;prop-name&gt;</tt>
	 * refers to either a configuration property or a system property, then the
	 * corresponding property value is substituted for the variable placeholder.
	 * Multiple variable placeholders may exist in the specified value as well
	 * as nested variable placeholders, which are substituted from inner most to
	 * outer most. Configuration properties override system properties.
	 * 
	 * @param val
	 *            The string on which to perform property substitution.
	 * @param currentKey
	 *            The key of the property being evaluated used to detect cycles.
	 * @param cycleMap
	 *            Map of variable references used to detect nested cycles.
	 * @param configProps
	 *            Set of configuration properties.
	 * @return The value of the specified string after system property
	 *         substitution.
	 * @throws IllegalArgumentException
	 *             If there was a syntax error in the property placeholder
	 *             syntax or a recursive variable reference.
	 */
	public static String substVars(String val, String currentKey,
			Map<String, String> cycleMap, Map<String, String> configProps)
			throws IllegalArgumentException {
		// If there is currently no cycle map, then create
		// one for detecting cycles for this invocation.
		if (cycleMap == null) {
			cycleMap = new HashMap<String, String>();
		}

		// Put the current key in the cycle map.
		cycleMap.put(currentKey, currentKey);

		// Assume we have a value that is something like:
		// "leading ${foo.${bar}} middle ${baz} trailing"

		// Find the first ending '}' variable delimiter, which
		// will correspond to the first deepest nested variable
		// placeholder.
		int stopDelim = val.indexOf(DELIM_STOP);

		// Find the matching starting "${" variable delimiter
		// by looping until we find a start delimiter that is
		// greater than the stop delimiter we have found.
		int startDelim = val.indexOf(DELIM_START);
		while (stopDelim >= 0) {
			int idx = val.indexOf(DELIM_START, startDelim
					+ DELIM_START.length());
			if ((idx < 0) || (idx > stopDelim)) {
				break;
			} else if (idx < stopDelim) {
				startDelim = idx;
			}
		}

		// If we do not have a start or stop delimiter, then just
		// return the existing value.
		if ((startDelim < 0) && (stopDelim < 0)) {
			return val;
		}
		// At this point, we found a stop delimiter without a start,
		// so throw an exception.
		else if (((startDelim < 0) || (startDelim > stopDelim))
				&& (stopDelim >= 0)) {
			throw new IllegalArgumentException(
					"stop delimiter with no start delimiter: " + val);
		}

		// At this point, we have found a variable placeholder so
		// we must perform a variable substitution on it.
		// Using the start and stop delimiter indices, extract
		// the first, deepest nested variable placeholder.
		String variable = val.substring(startDelim + DELIM_START.length(),
				stopDelim);

		// Verify that this is not a recursive variable reference.
		if (cycleMap.get(variable) != null) {
			throw new IllegalArgumentException("recursive variable reference: "
					+ variable);
		}

		// Get the value of the deepest nested variable placeholder.
		// Try to configuration properties first.
		String substValue = (configProps != null) ? configProps.get(variable)
				: null;
		if (substValue == null) {
			// Ignore unknown property values.
			substValue = System.getProperty(variable, "");
		}

		// Remove the found variable from the cycle map, since
		// it may appear more than once in the value and we don't
		// want such situations to appear as a recursive reference.
		cycleMap.remove(variable);

		// Append the leading characters, the substituted value of
		// the variable, and the trailing characters to get the new
		// value.
		val = val.substring(0, startDelim) + substValue
				+ val.substring(stopDelim + DELIM_STOP.length(), val.length());

		// Now perform substitution again, since there could still
		// be substitutions to make.
		val = substVars(val, currentKey, cycleMap, configProps);

		// Return the value.
		return val;
	}

	/**
	 * Deletes all files and subdirectories under directory.
	 * 
	 * @precondition
	 * @postcondition
	 * @param dir
	 *            Directory location which needs to be completely deleted
	 * @return True if deletion is successful False if deletion fails
	 */

	public static boolean deleteDir(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) {
				boolean success = deleteDir(new File(dir, children[i]));
				if (!success) {
					return false;
				}
			}
		}

		// The directory is now empty so delete it
		return dir.delete();
	}
	
	/**
	 * For encryption
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
	 * For Decryption
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
	    byte[] encrypted = cipher.doFinal(plainText.getBytes());
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

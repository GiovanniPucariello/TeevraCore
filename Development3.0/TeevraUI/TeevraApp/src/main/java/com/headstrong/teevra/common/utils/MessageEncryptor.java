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
 * $Id: MessageEncryptor.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 4, 2009 
 */

package com.headstrong.teevra.common.utils;

import org.jasypt.util.text.BasicTextEncryptor;

import com.headstrong.teevra.common.exception.EncryptionException;

/**
 * Encrypts/Decrypts the given message
 */
public class MessageEncryptor {

	private String password = "teevra";
	private BasicTextEncryptor textEncryptor;

	/**
	 * Default Constructor
	 */
	public MessageEncryptor() {
		textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(password);
	}

	/**
	 * Encrypts the given message
	 * 
	 * @precondition
	 * @postcondition
	 * @param message
	 * @return
	 * @throws EncryptionException
	 */
	public String encrypt(String message) throws EncryptionException {

		return textEncryptor.encrypt(message);

	}

	/**
	 * Decrypts the given encrypted message
	 * 
	 * @precondition
	 * @postcondition
	 * @param encryptedMessage
	 * @return
	 * @throws EncryptionException
	 */
	public String decrypt(String encryptedMessage) throws EncryptionException {

		return textEncryptor.decrypt(encryptedMessage);

	}

	public static void main(String[] args) {
		MessageEncryptor encryptor = new MessageEncryptor();
		try {
			String encryptedMessage = encryptor.encrypt("teevra");
			System.out.println("encryptedMessage->" + encryptedMessage);
		} catch (EncryptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

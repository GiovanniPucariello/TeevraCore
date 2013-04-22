package com.headstrong.fusion.services.message.encrypter.impl;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import com.headstrong.fusion.services.message.decrypter.util.Base64;
import com.headstrong.fusion.services.message.encrypter.util.EncrypterUtils;

public class RSAEncrypter {

	private static final String RSA = "RSA";
	private static Cipher ecipher;
	private static SecureRandom random;

	public static String encrypt(String blockMode, String padding,String key64,String ivparams, String inputMessage) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, UnsupportedEncodingException {
		int validLength = 512/8-11;
		byte[] key = null;
		if(key64 != null){
			key = Base64.decode(key64);
		}else{
			key = Base64.decode("9QDFmv742ddi1F12wdzj1iEhQkcs8A7Dt4l=");
		}
		StringBuffer encryptedText = new StringBuffer("");
		String[] splitStrArray  = null;
		String chunkStr= null;
		ecipher = Cipher.getInstance(RSA + "/" + blockMode + "/" + padding);
		random = new SecureRandom(key);

		// create the keys
		KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");

			generator.initialize(1280, random);

		KeyPair pair = generator.generateKeyPair();
		Key pubKey = pair.getPublic();
		if(padding.equals("OAEPWITHSHA-512ANDMGF1PADDING")){
			validLength = 328/8-11;
		}else if(padding.equals("OAEPWITHSHA-384ANDMGF1PADDING")){
			validLength = 584/8-11;
		}else if(padding.equals("OAEPWITHSHA-256ANDMGF1PADDING")){
			validLength = 840/8-11;
		}else if(padding.equals("O AEPWITHSHA-1ANDMGF1PADDING") || padding.equals("OAEPWITHSHA1ANDMGF1PADDING")){
			validLength = 1032/8-11;
		}else if(padding.equals("OAEPWITHMD5ANDMGF1PADDING")){
			validLength = 1096/8-11;
		}else if(padding.equals("NOPADDING")){
			validLength = 1368/8-11;
		}
		ecipher.init(Cipher.ENCRYPT_MODE, pubKey, random);
		
		if(inputMessage.length()>validLength){
	         splitStrArray = EncrypterUtils.splitByLength(inputMessage,validLength);
	         for(int i=0; i<splitStrArray.length; i++){
	         	chunkStr = splitStrArray[i];
	         	encryptedText = encryptedText.append(encrypt(chunkStr));
	         	encryptedText.append("delim");        	
	 		}
	       return encryptedText.toString();
	    }else
		return encrypt(inputMessage);
				
	}

	/**
	 * * Input is a string to encrypt.
	 * 
	 * @return a Hex string of the byte array
	 */
	private static String encrypt(String plaintext)
			throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		
			byte[] ciphertext = ecipher.doFinal(plaintext.getBytes("UTF-8"));
			return EncrypterUtils.byteToHex(ciphertext);

	}
}

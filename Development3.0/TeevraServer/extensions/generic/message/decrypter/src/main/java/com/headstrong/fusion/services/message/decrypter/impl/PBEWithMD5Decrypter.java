package com.headstrong.fusion.services.message.decrypter.impl;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.headstrong.fusion.services.message.decrypter.util.Base64;
import com.headstrong.fusion.services.message.decrypter.util.DecrypterUtils;

public class PBEWithMD5Decrypter {

	private static String PBEWithMD5;
	private static Cipher dcipher;
	private static SecretKeySpec secretkey;	
	
	public static String decrypt(String cipherAlgorithm,String blockMode,String padding,String key64,String ivparams,  String inputMessage)throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException,InvalidAlgorithmParameterException, UnsupportedEncodingException{
		byte[] key = null;
		if(key64 != null){
			key = Base64.decode(key64);
		}else{
			key = Base64.decode("9QDFmv742ddi1F12wdzj1iEhQkcs8A7Dt4l=");
		}
		PBEWithMD5 = cipherAlgorithm; 
		 byte[] salt = {
		         (byte)0xA9, (byte)0x9B, (byte)0xC8, (byte)0x32,
		         (byte)0x56, (byte)0x34, (byte)0xE3, (byte)0x03
		     };
		int iterationCount = 19;
		secretkey = new SecretKeySpec(key,PBEWithMD5);
		dcipher = Cipher.getInstance(PBEWithMD5 + "/" + blockMode + "/" + padding);
		 AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt, iterationCount);
		 dcipher.init(Cipher.DECRYPT_MODE, secretkey, paramSpec);

				
		return decrypt(inputMessage);
	}
	
	/**
	 * * Input encrypted String represented in HEX
	 * 
	 * @return a string decrypted in plain text
	 */
	private static String decrypt(String hexCipherText) throws UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
			String plaintext = new String(dcipher.doFinal(DecrypterUtils.hexToByte(hexCipherText)), "UTF-8");
			return plaintext;

	}
}

package com.headstrong.fusion.services.message.decrypter.impl;

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
import com.headstrong.fusion.services.message.decrypter.util.DecrypterUtils;

public class RSADecrypter {

	private static final String RSA = "RSA";
	private static Cipher dcipher;
	private static SecureRandom random;

	public static String decrypt(String blockMode, String padding,String key64,String ivparams,  String inputMessage) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, UnsupportedEncodingException {

		byte[] key = null;
		if(key64 != null){
			key = Base64.decode(key64);
		}else{
			key = Base64.decode("9QDFmv742ddi1F12wdzj1iEhQkcs8A7Dt4l=");
		}
		String[] decStrArray = null;
		String chunkStr= null;
		StringBuffer decryptedText = new StringBuffer("");
		dcipher = Cipher.getInstance(RSA + "/" + blockMode + "/" + padding);
		random = new SecureRandom(key);
		KeyPairGenerator generator = KeyPairGenerator.getInstance(RSA);
		
	    	generator.initialize(1280, random);
	    KeyPair  pair = generator.generateKeyPair();
	    Key   privKey = pair.getPrivate();
	    dcipher.init(Cipher.DECRYPT_MODE, privKey,random);
	    if(inputMessage.contains("delim")){
	    	decStrArray = inputMessage.split("delim");
	    	for(int i=0; i<decStrArray.length; i++){
	     	   chunkStr = decStrArray[i];
	     	   decryptedText = decryptedText.append(decrypt(chunkStr));
	     	}
	    	return decryptedText.toString();
	    }else{
	    return decrypt(inputMessage);
	    }
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

package com.headstrong.fusion.services.message.encrypter.impl;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import com.headstrong.fusion.services.message.decrypter.util.Base64;
import com.headstrong.fusion.services.message.encrypter.util.EncrypterUtils;

public class ARCFOUREncrypter {
	
	private static final String ARCFOUR = "ARCFOUR";
	private static Cipher ecipher;
	private static SecretKeySpec secretkey;	

	public static String encrypt(String blockMode,String padding,String key64,String ivparams, String inputMessage)throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException,InvalidAlgorithmParameterException, UnsupportedEncodingException{
		
		byte[] key = null;
		if(key64 != null){
			key = Base64.decode(key64);
		}else{
			key = Base64.decode("9QDFmv742ddi1F12wdzj1iEhQkcs8A7Dt4lc+Erus2Y=");
		}
		secretkey = new SecretKeySpec(key,ARCFOUR);
		ecipher = Cipher.getInstance(ARCFOUR + "/" + blockMode + "/" + padding);
		ecipher.init(Cipher.ENCRYPT_MODE, secretkey);
				
		return encrypt(inputMessage);
	}

	/** 
	 * * Input is a string to encrypt.
	 * @return a Hex string of the byte array
	 */	
	private static String encrypt(String plaintext)throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
	
			byte[] ciphertext = ecipher.doFinal(plaintext.getBytes("UTF-8"));
			return EncrypterUtils.byteToHex(ciphertext);

		}
		

}

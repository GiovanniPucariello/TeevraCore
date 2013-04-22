package com.headstrong.fusion.services.message.decrypter.impl;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.headstrong.fusion.services.message.decrypter.util.Base64;
import com.headstrong.fusion.services.message.decrypter.util.DecrypterUtils;

public class RC2Decrypter {

	private static final String RC2 = "RC2";
	private static Cipher dcipher;
	private static SecretKeySpec secretkey;	
	
	public static String decrypt(String blockMode,String padding,String key64,String ivparams, String inputMessage)throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException,InvalidAlgorithmParameterException, UnsupportedEncodingException{
		byte[] key = null;
		if(key64 != null){
			key = Base64.decode(key64);
		}else{
			key = Base64.decode("9QDFmv742ddi1F12wdzj1iEhQkcs8A7Dt4lc+Erus2Y=");
		}
		byte[] param = null;
		if(ivparams != null){
			param = new byte[ivparams.trim().length()];
		}else
			param = new byte[8];
		secretkey = new SecretKeySpec(key,RC2);
		dcipher = Cipher.getInstance(RC2 + "/" + blockMode + "/" + padding);
		if(blockMode.equalsIgnoreCase("ECB")){
			dcipher.init(Cipher.DECRYPT_MODE, secretkey);
			}
		else
			dcipher.init(Cipher.DECRYPT_MODE, secretkey,new IvParameterSpec(param));
				
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

package com.headstrong.fusion.services.message.encrypter.impl;

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
import com.headstrong.fusion.services.message.encrypter.util.EncrypterUtils;

public class DESedeEncrypter {

	private static final String DESede = "DESede";
	private static Cipher ecipher;
	private static SecretKeySpec secretkey;	

	public static String encrypt(String blockMode,String padding,String key64,String ivparams, String inputMessage)throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException,InvalidAlgorithmParameterException, UnsupportedEncodingException{
		
		byte[] key = null;
		if(key64 != null){
			key = Base64.decode(key64);
		}else{
			key = Base64.decode("9QDFmv742ddi1F12wdzj1iEhQkcs8A7D");
		}
		byte[] param = null;
		if(ivparams != null){
			param = new byte[ivparams.trim().length()];
		}else
			param = new byte[8];
		secretkey = new SecretKeySpec(key,DESede);
		ecipher = Cipher.getInstance(DESede + "/" + blockMode + "/" + padding);
		if(blockMode.equalsIgnoreCase("ECB")){
		ecipher.init(Cipher.ENCRYPT_MODE, secretkey);
		}
		else
			ecipher.init(Cipher.ENCRYPT_MODE, secretkey,new IvParameterSpec(param));
				
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

package com.headstrong.fusion.services.message.encrypter.impl;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.headstrong.fusion.services.message.decrypter.impl.AESDecrypter;
import com.headstrong.fusion.services.message.decrypter.impl.ARCFOURDecrypter;
import com.headstrong.fusion.services.message.decrypter.impl.BlowfishDecrypter;
import com.headstrong.fusion.services.message.decrypter.impl.DESDecrypter;
import com.headstrong.fusion.services.message.decrypter.impl.DESedeDecrypter;
import com.headstrong.fusion.services.message.decrypter.impl.PBEWithMD5Decrypter;
import com.headstrong.fusion.services.message.decrypter.impl.RC2Decrypter;
import com.headstrong.fusion.services.message.decrypter.impl.RSADecrypter;

public class MessageEncrypterDecrypterServiceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMessageEncrypter() throws Exception{
		String inputMessage = "000083000072V0540020004L1978MST_O_MO_1  000005MO$MSTE00111225015348000RT";
		String outputMessage= null;
		String output= null;
		String cipherBlockMode = "ECB";
		String cipherPadding = "PKCS5PADDING";
		String cipherAlgorithm = "AES";
		if(cipherAlgorithm.equalsIgnoreCase("AES")){
			output = AESEncrypter.encrypt(cipherBlockMode,cipherPadding,null,null,inputMessage);
			outputMessage = AESDecrypter.decrypt(cipherBlockMode,cipherPadding,null,null,output);
		} else if(cipherAlgorithm.equalsIgnoreCase("ARCFOUR")){
			output = ARCFOUREncrypter.encrypt(cipherBlockMode,cipherPadding,null,null,inputMessage);
			outputMessage = ARCFOURDecrypter.decrypt(cipherBlockMode,cipherPadding,null,null,output);
		} else if(cipherAlgorithm.equalsIgnoreCase("Blowfish")){
			output = BlowfishEncrypter.encrypt(cipherBlockMode,cipherPadding,null,null,inputMessage);
			outputMessage = BlowfishDecrypter.decrypt(cipherBlockMode,cipherPadding,null,null,output);
		} else if(cipherAlgorithm.equalsIgnoreCase("DES")){
			output = DESEncrypter.encrypt(cipherBlockMode,cipherPadding,null,null,inputMessage);
			outputMessage = DESDecrypter.decrypt(cipherBlockMode,cipherPadding,null,null,output);
		} else if(cipherAlgorithm.equalsIgnoreCase("RC2")){
			output = RC2Encrypter.encrypt(cipherBlockMode,cipherPadding,null,null,inputMessage);
			outputMessage = RC2Decrypter.decrypt(cipherBlockMode,cipherPadding,null,null,output);
		} else if(cipherAlgorithm.equalsIgnoreCase("RSA")){
			output = RSAEncrypter.encrypt(cipherBlockMode,cipherPadding,null,null,inputMessage);
			outputMessage = RSADecrypter.decrypt(cipherBlockMode,cipherPadding,null,null,output);
		} else if(cipherAlgorithm.startsWith("PBEWithMD5")||cipherAlgorithm.startsWith("PBEWithSHA")){
			output = PBEWithMD5Encrypter.encrypt(cipherAlgorithm,cipherBlockMode,cipherPadding,null,null,inputMessage);
			outputMessage = PBEWithMD5Decrypter.decrypt(cipherAlgorithm,cipherBlockMode,cipherPadding,null,null,output);
		} else if(cipherAlgorithm.startsWith("DESede")){
			output = DESedeEncrypter.encrypt(cipherBlockMode,cipherPadding,null,null,inputMessage);
			outputMessage = DESedeDecrypter.decrypt(cipherBlockMode,cipherPadding,null,null,output);
		}
		System.out.println("encrypted "+output);
		System.out.println("original"+ outputMessage);
		Assert.assertEquals(inputMessage, outputMessage);
	}
	

}

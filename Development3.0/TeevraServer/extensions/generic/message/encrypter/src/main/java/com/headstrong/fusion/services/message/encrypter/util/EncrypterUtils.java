package com.headstrong.fusion.services.message.encrypter.util;

public class EncrypterUtils {
	
	static final String HEXES = "0123456789ABCDEF";

	public static String byteToHex(byte[] raw) {
		if (raw == null) {
			return null;
		}
		final StringBuilder hex = new StringBuilder(2 * raw.length);
		for (final byte b : raw) {
			hex.append(HEXES.charAt((b & 0xF0) >> 4)).append(
					HEXES.charAt((b & 0x0F)));
		}
		return hex.toString();
	}
	public static String[] splitByLength(String str, int chunkSize)   
	{   
	    int arraySize = (int) Math.ceil((double)str.length() / chunkSize);   
	    String[] returnArray = new String[arraySize];   
	    int index = 0;   
	    for(int i = 0; i < str.length(); i = i+chunkSize)   
	    {   
	        if(str.length() - i < chunkSize)   
	        {   
	            returnArray[index++] = str.substring(i);   
	        }    
	        else  
	        {   
	            returnArray[index++] = str.substring(i, i+chunkSize);   
	        }   
	    } 	  
	    return returnArray;   
	}  
}

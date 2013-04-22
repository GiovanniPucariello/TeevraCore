package com.headstrong.fusion.services.message.decrypter.util;

/**
 * Base64
 *
 * Handles basic base64 encoding/decoding - used by simple wrapper methods
 * encodeBase64 & decodeBase64 in Utils.
 */
public class Base64 {

	public static byte[] decode(String base64) {
		int pad = 0;
		for (int i = base64.length() - 1; base64.charAt(i) == '='; i--) pad++;
		int length = base64.length() * 6 / 8 - pad;
		byte[] raw = new byte[length];
		int rawIndex = 0;
		for (int i = 0; i < base64.length(); i += 4) {
			int block = (getValue(base64.charAt(i)) << 18)
						 + (getValue(base64.charAt(i + 1)) << 12)
						 + (getValue(base64.charAt(i + 2)) << 6)
						 + (getValue(base64.charAt(i + 3)));
			for (int j = 0; j < 3 && rawIndex + j < raw.length; j++) {
				raw[rawIndex + j] = (byte)((block >> (8 * (2 - j))) & 0xff);
			}
			rawIndex += 3;
		}
		return raw;
	}


	private static int getValue(char c) {
		if (c >= 'A' && c <= 'Z') return c - 'A';
		if (c >= 'a' && c <= 'z') return c - 'a' + 26;
		if (c >= '0' && c <= '9') return c - '0' + 52;
		if (c == '+') return 62;
		if (c == '/') return 63;
		if (c == '=') return 0;
		return -1;
	}

}
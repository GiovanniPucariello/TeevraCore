package com.headstrong.fusion.configGenerator.core;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.headstrong.fusion.configGenerator.viewObjects.liffe.Constants;

/**
 * Works on Liffe specific data.
 * 
 * @see com.headstrong.fusion.configGenerator.Core.DTOTransformer
 * @author mtiwari
 */

public class DTOTransformerForLiffe implements DTOTransformer {

	List<Map> finalOutput = new LinkedList<Map>();
	List<Map> mapFixml;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.configGenerator.Core.DTOTransformer#getObjects()
	 */
	public List<Map> getObjects(String objType) {
		finalOutput = createRequestMaps();
		return finalOutput;

	}

	public DTOTransformerForLiffe(List<Map> mapFixml) {
		super();
		this.mapFixml = mapFixml;
	}

	/**
	 * This method is used to format the fixml tag and add it into the list
	 * 
	 * @param mapFixml
	 */

	private List<Map> createRequestMaps() {

		Iterator<Map> iterator = mapFixml.iterator();
		Map<String, String> next = null;
		String strField = null;
		String strFixml = null;
		while (iterator.hasNext()) {
			next = iterator.next();
			strField = next.get(Constants.FIELD).toString().trim();
			strField  = convertToCamelCase(strField);
			strField = strField.replace(Constants.DOT, "");
			next.remove(Constants.FIELD);
			next.put(Constants.FIELD, strField.trim());

			if (null != next.get(Constants.FIXML)) {
				strFixml = next.get(Constants.FIXML).toString();
				strFixml.contains(Constants.AT_RATE);
			}
		}

		return mapFixml;

	}

	/**
	 * This method is used to remove the special character from the String
	 * 
	 * @param String
	 *            text
	 * @return String
	 */
	public static String removeSpecialChars(String text) {
		int length = text.length();
		StringBuffer buffer = new StringBuffer(length);
		for (int i = 0; i < length; i++) {
			char ch = text.charAt(i);
			if (Character.isLetter(ch)) {
				buffer.append(ch);
			}
		}
		return buffer.toString();
	}

	/**
	 * This method is used to convert string into camel case.
	 * @param cn
	 * @return
	 */
	public static String convertToCamelCase(String cn) {
		StringBuffer sb = new StringBuffer();
		cn = cn.trim();
		String[] str = cn.split(" ");
		boolean firstTime = true;
		for (String temp : str) {
			if (firstTime) {
				sb.append(temp.toLowerCase());
				firstTime = false;
			} else {
				sb.append(Character.toUpperCase(temp.charAt(0)));
				sb.append(temp.substring(1).toLowerCase());
			}
		}
		return sb.toString();
	}

}

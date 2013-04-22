/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright '\u00a9' 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: FixmlTagTypes.java
 * $Revision: 
 * $Author: VGarde
 * $DateTime: Sep 25, 2009 
 */

package com.headstrong.fusion.configGenerator.commObjs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.headstrong.fusion.configGenerator.core.eurex.MappingsGenerator;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.ObjectFactory;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.Switch;

/**
 * Represents one line of the fixml tags as represented in the excel sheet.
 * 
 * @author VGarde
 */
public class FixMLConfigurationElement {

	public static final String REQUEST = MappingsGenerator.CHECK_REQUEST;
	public static final String RESPONSE = MappingsGenerator.CHECK_RESPONSE;
	private static final String EQUALS = "=";
	public static final String DOT = ".";
	private static final String BRACKET_OPEN = "(";
	private static final String COMMA = ",";
	private static final String FORWRD_SLASH = "/";
	public static final String STR_BLANK = "";
	public static final String STR_SPACE = " ";
	public static final String STR_NA = MappingsGenerator.STR_NA;

	String fixmlStr;
	String constantValue;
	String constantFixmlStr;
	String targetDataType;
	String caseClause;
	String validationType;
	String targetDataSize;
	String fixmlClassname;
	FixMLConfigurationElement mergedConstantObj;

	public ObjectFactory objFactory = new ObjectFactory();

	public static final String ADD_MESSAGE_VALUE = "message.value";

	/**
	 * Get a list of fixmltag objects from string represented in excel sheet.
	 * 
	 * @param concatenatedFixMLTypes
	 * @param dataTypes
	 * @return
	 */
	public static List<FixMLConfigurationElement> getFixMLTagTypes(String concatenatedFixMLTypes, String dataTypes,
			String validationType, String dataSize) {
		List<FixMLConfigurationElement> fixMLTags = new ArrayList();
		String separator = "\n";
		String[] fixMLTagsStrs = concatenatedFixMLTypes.split(separator);
		if (fixMLTagsStrs.length > 1 && !fixMLTagsStrs[1].startsWith(FORWRD_SLASH)) {
			fixMLTagsStrs[1] = null;
			fixMLTagsStrs[0] = concatenatedFixMLTypes.replace(separator, STR_BLANK);
		}
		String[] dataTypesArr = null;
		if (dataTypes != null) {
			dataTypesArr = dataTypes.split(separator);
		}
		int count = 0;
		for (String fixMLTagsStr : fixMLTagsStrs) {
			if (fixMLTagsStr != null && !STR_BLANK.equals(fixMLTagsStr.trim()) && !STR_NA.equals(fixMLTagsStr)) {
				if (dataTypesArr != null) {
					fixMLTags.add(new FixMLConfigurationElement(fixMLTagsStr, dataTypesArr[count++], validationType,
							dataSize));
				} else {
					fixMLTags.add(new FixMLConfigurationElement(fixMLTagsStr, null, validationType, dataSize));
				}
			}
			if (fixMLTagsStr.startsWith(STR_NA)) {
				fixMLTags.add(new FixMLConfigurationElement(fixMLTagsStr, null, validationType, dataSize));
			}

		}
		return fixMLTags;
	}

	/**
	 *Matches another FixMlTag type and returns a matched filter e.g. [R=21]
	 * 
	 * @param other
	 * @return
	 */
	public void changeToConditionalString(List<FixMLConfigurationElement> others) {
//		if (other.getConstantValue() != null) {
//			String modifiedString = STR_BLANK;
//			String thisFixML = this.fixmlStr;
//			String otherFixml = other.fixmlStr;
//			String commonPart = otherFixml.substring(0, otherFixml.lastIndexOf(DOT));
//			int insertLocation = commonPart.length() - 1;
//			String variableName = otherFixml.substring(insertLocation + 2);
//			modifiedString = thisFixML.substring(0, insertLocation + 1) + "[" + variableName + EQUALS + other.constantValue
//					+ "]." + thisFixML.substring(insertLocation + 2);
//			this.mergedConstantObj = other;
//			this.fixmlStr = modifiedString;
//		}
		
		for(FixMLConfigurationElement otherElement:others.subList(1, others.size())) {
			if (otherElement.getConstantValue() != null) {
			String modifiedString = STR_BLANK;
			String thisFixML = this.fixmlStr;
			String otherFixml = otherElement.fixmlStr;
			String commonPart = otherFixml.substring(0, otherFixml.lastIndexOf(DOT));
			int insertLocation = commonPart.length() - 1;
			String variableName = otherFixml.substring(insertLocation + 2);
			modifiedString = thisFixML.substring(0, insertLocation + 1) + "[" + variableName + EQUALS + otherElement.constantValue
					+ "]." + thisFixML.substring(insertLocation + 2);
			this.mergedConstantObj = otherElement;
			this.fixmlStr = modifiedString;
		}
		}
	}

	/**
	 * Parse a fixml string and set parameters.
	 * 
	 * @param fixml
	 */
	private void parseFixMlString(String fixml) {
		String tempFixmlStr = fixml;
		tempFixmlStr = convertToDotNotation(tempFixmlStr);
		if (tempFixmlStr.contains("(for")) {
			tempFixmlStr = assignCaseSwitch(tempFixmlStr);
		}
		if (tempFixmlStr.contains(BRACKET_OPEN)) {
			String beforeBracket = tempFixmlStr.substring(0, tempFixmlStr.indexOf(BRACKET_OPEN));
			tempFixmlStr = beforeBracket.trim();
		}
		if (MappingsGenerator.removeBracketEnclosure(tempFixmlStr,"{","}").contains(EQUALS) && this.caseClause==null) {
			tempFixmlStr = assignConstant(tempFixmlStr);
		}
		this.fixmlStr = tempFixmlStr;

		if (STR_NA.equals(tempFixmlStr)) {
			constantValue = (constantValue == null) ? STR_BLANK : constantValue;
			handleNA();
			this.fixmlStr = null;
		}
	}

	/**
	 * 
	 */
	private void handleNA() {
		if (targetDataSize.startsWith("alphanumeric")) {
			int length = Integer.parseInt(targetDataSize.replace("alphanumeric", STR_BLANK).trim());
			this.constantValue = fillUpSpaces(length);
		} else if (targetDataSize.startsWith("binary")) {
			int length = Integer.parseInt(targetDataSize.replace("binary", STR_BLANK).trim());
			this.constantValue = fillUpSpaces(length);
		} else if (targetDataSize.startsWith("freetext")) {
			int length = Integer.parseInt(targetDataSize.replace("freetext", STR_BLANK).trim());
			this.constantValue = fillUpSpaces(length);
		} else if (targetDataSize.startsWith("numeric")) {
			int length = 0;
			String stringSize = extractNumerals(targetDataSize);
			// checking if the size value has a precision component in it
			if (stringSize.contains(COMMA)) {
				String[] dataSize = stringSize.split(COMMA);
				length = Integer.parseInt(dataSize[0]);
			} else {
				length = Integer.parseInt(stringSize);
			}
			this.constantValue = fillUpZeroes(length);
		} else if (targetDataSize.startsWith("Date")) {
			int length = 8;
			this.constantValue = fillUpZeroes(length);
		} else if (targetDataSize.startsWith("Timestamp")) {
			int length = 18;
			this.constantValue = fillUpZeroes(length);
		} else if (targetDataSize.startsWith("Volume")) {
			int length = 12;
			this.constantValue = fillUpZeroes(length);
		} else if (targetDataSize.startsWith("Amount")) {
			int length = 15;
			this.constantValue = fillUpZeroes(length);
		} else if (targetDataSize.startsWith("Quantity")) {
			int length = 15;
			this.constantValue = fillUpZeroes(length);
		} else if (targetDataSize.startsWith("Price")) {
			int length = 13;
			this.constantValue = fillUpZeroes(length);
		}
	}

	/**
	 * Extract Numbers from a string containing numbers and string.
	 * 
	 * @return
	 */
	private String extractNumerals(String target) {
		String stringSize;
		char[] charArray = target.toCharArray();
		int intPosition = 0;
		for (char eachChar : charArray) {
			if (Character.isDigit(eachChar)) {
				break;
			}
			intPosition++;
		}
		stringSize = target.substring(intPosition);
		return stringSize;
	}

	/**
	 * @param tempFixmlStr
	 * @return
	 */
	private String convertToDotNotation(String tempFixmlStr) {
		if (tempFixmlStr.startsWith(FORWRD_SLASH)) {
			tempFixmlStr = tempFixmlStr.substring(1);
		}
		tempFixmlStr = tempFixmlStr.replace("@", STR_BLANK);
		tempFixmlStr = tempFixmlStr.replaceAll(FORWRD_SLASH, DOT);
		return tempFixmlStr;
	}

	/**
	 * @param tempFixmlStr
	 * @return
	 */
	private String assignConstant(String tempFixmlStr) {
		this.constantFixmlStr = FixMLConfigurationElement.ADD_MESSAGE_VALUE + DOT
				+ (tempFixmlStr.substring(tempFixmlStr.indexOf(DOT) + 1));
		String[] constArr = MappingsGenerator.removeBracketEnclosure(tempFixmlStr,"{","}").split(EQUALS);
		tempFixmlStr = tempFixmlStr.substring(0,tempFixmlStr.indexOf(EQUALS+constArr[1]));
		this.constantValue = constArr[1];
		return tempFixmlStr;
	}

	/**
	 * @param tempFixmlStr
	 * @return
	 */
	private String assignCaseSwitch(String tempFixmlStr) {
		int indexOfBracket = tempFixmlStr.indexOf(BRACKET_OPEN);
		String firstPart = tempFixmlStr.substring(0, indexOfBracket);
		String caseStr = tempFixmlStr.substring(indexOfBracket).replace("(for", STR_BLANK);
		caseStr = caseStr.substring(0, caseStr.indexOf(")"));
		String[] caseArray = caseStr.split(COMMA);
		String optionsStr= MappingsGenerator.removeBracketEnclosure(firstPart,"{","}").split(EQUALS)[1];
		tempFixmlStr = tempFixmlStr.substring(0, tempFixmlStr.indexOf(optionsStr)-1).trim();
		String[] options = (optionsStr).split(COMMA);
		int caseLength = (caseArray.length < options.length) ? caseArray.length : options.length;
		String caseClause = STR_BLANK;
		for (int caseCounter = 0; caseCounter < caseLength; caseCounter++) {
			caseClause = caseClause + "|" + caseArray[caseCounter].trim() + "!" + options[caseCounter].trim();
		}
		this.caseClause = caseClause.trim();
		return tempFixmlStr;
	}

	/**
	 * @param length
	 */
	private String fillUpSpaces(int length) {
		String value = "";
		for (int i = 0; i < length; i++) {
			value += STR_SPACE;
		}
		return value;
	}

	/**
	 * @param length
	 * @return TODO
	 */
	private String fillUpZeroes(int length) {
		String value = "";
		for (int i = 0; i < length; i++) {
			value += "0";
		}
		return value;
	}

	private FixMLConfigurationElement(String fixmlString, String datatype, String validationType, String dataSize) {
		this.targetDataType = datatype;
		this.targetDataSize = dataSize;
		this.setValidationType(validationType);
		parseFixMlString(fixmlString);
	}

	/**
	 * @return the fixmlStr
	 */
	public String getFixmlStr() {
		return fixmlStr;
	}

	/**
	 * @return the constantValue
	 */
	public String getConstantValue() {
		return constantValue;
	}

	/**
	 * @return the targetDataType
	 */
	public String getTargetDataType() {
		return targetDataType;
	}

	/**
	 * @return the caseClause
	 */
	public String getCaseClause() {
		return caseClause;
	}

	public String getConstantFixmlStr() {
		return constantFixmlStr;
	}

	public FixMLConfigurationElement getMergedConstantObj() {
		return mergedConstantObj;
	}

	private void setValidationType(String validationString) {
		if (null != validationString) {
			if (validationString.contains(FORWRD_SLASH)) {
				this.validationType = validationString.substring(0, validationString.indexOf(FORWRD_SLASH));
			} else {
				this.validationType = validationString;
			}
		}
	}

	/**
	 * @return the validationType
	 */
	public String getValidationType() {
		return validationType;
	}

	public String getPreAppendedFixmlStr() {
		if (null == fixmlStr) {
			return null;
		}
		int cutoffIndex = fixmlStr.indexOf(DOT);
		if (fixmlStr.contains("[")) {
			cutoffIndex = (cutoffIndex > fixmlStr.indexOf("[")) ? fixmlStr.indexOf("[") : cutoffIndex;
		}
		String fixStr = FixMLConfigurationElement.ADD_MESSAGE_VALUE + (fixmlStr.substring(cutoffIndex));
		return fixStr;
	}

	public String getFixmlShortName() {
		String shortName = (fixmlStr != null && fixmlStr.contains(DOT)) ? this.fixmlStr.substring(0, fixmlStr.indexOf(DOT))
				: fixmlStr;
		return shortName;
	}

	/**
	 * @return the targetDataSize
	 */
	public String getTargetDataSize() {
		return targetDataSize;
	}
	
	/**
	 * @param structNavPath
	 * @return
	 */
	private String partBeforeBracket(String structNavPath) {
		if(structNavPath.contains("{")){
			return  structNavPath.substring(0, structNavPath.indexOf("{"));
		}
		return structNavPath;
	}
	


	/**
	 * @return the fixmlClassname
	 */
	public String getFixmlClassname() {
		return fixmlClassname;
	}
}
/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: DBCacheLookupRule.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 10, 2008 
 */

package com.headstrong.fusion.services.transformer.rules.clearinghouserules;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * Decode C21's external derivative product code to the individual parameters -
 * symbol, contract date, security type, option sign and strike price. Refer to
 * Derivatives Data Referential file from LCH.Clearnet SA for the field 25
 */
public class DecodeC21ExtCodeRule implements Rule {
	private static final Logger logger = LoggerFactory
			.getLogger(DecodeC21ExtCodeRule.class);

	private static final String RULE_NAME = "decodeC21ExtCode";
	private static final String SYMBOL = "message.value.Sym";
	private static final String CONTRACT_DATE = "message.value.Exch";
	private static final String SECURITY_TYPE = "message.value.SecTyp";
	private static final String OPTION_SIGN = "message.value.PutCall";
	private static final String STRIKE_PRICE = "message.value.StrkPx";
	private static final String EXT_CODE = "externalCode";

	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName(RULE_NAME);
		ruleVO.setClassName(DecodeC21ExtCodeRule.class.getName());
		ruleVO.addInParameter(EXT_CODE);
		ruleVO.addOutParameter(SYMBOL);
		ruleVO.addOutParameter(CONTRACT_DATE);
		ruleVO.addOutParameter(SECURITY_TYPE);
		ruleVO.addOutParameter(OPTION_SIGN);
		ruleVO.addOutParameter(STRIKE_PRICE);
		return ruleVO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.transformer.rulemanager.Rule#operate(java.util.Map)
	 */
	public Object operate(Map<String, Object> data)
			throws RuleOperationFailedException {
		logger.debug("Inside DecodeC21ExtCodeRule operate method");

		String externalCode = (String) data.get(EXT_CODE);
		logger.debug("Inside DecodeC21ExtCodeRule operate method "
				+ " - Before validation");
		validateParameters(externalCode);
		logger.debug("Inside DecodeC21ExtCodeRule operate method "
				+ "- Validation complete. External code is " + externalCode);

		// derive all attributes
		Map<String, Object> resultMap = new HashMap<String, Object>();

		String symbol = externalCode.substring(0, 3);
		resultMap.put(SYMBOL, symbol);

		XMLGregorianCalendar contractDt = getC21ContractDate(externalCode
				.substring(3, 4), externalCode.substring(4, 5));
		resultMap.put(CONTRACT_DATE, contractDt);

		int len = externalCode.length();
		if (len > 5) {
			// corresponds to options - extract option sign and strike price too
			resultMap.put(SECURITY_TYPE, "O");
			String strkPrcStr = externalCode.substring(5, len - 1);
			resultMap.put(STRIKE_PRICE, new BigDecimal(Integer
					.parseInt(strkPrcStr)));

			String optSign = externalCode.substring(len - 1, len);
			optSign = ("P".equals(optSign)) ? "0" : "1";
			resultMap.put(OPTION_SIGN, new BigInteger(optSign));
		} else {
			resultMap.put(SECURITY_TYPE, "F");
		}
		logger.debug("Completed decoding external code " + resultMap);
		return resultMap;
	}

	/**
	 * Computes the contract date based on the year and month code given
	 * 
	 * @param monthCode
	 * @param yearCode
	 * @return
	 * @throws RuleOperationFailedException
	 */
	private XMLGregorianCalendar getC21ContractDate(String monthCode,
			String yearCode) throws RuleOperationFailedException {

		int month = getMonthValFromC21(monthCode.charAt(0));
		if (month == -1) {
			throw new RuleOperationFailedException("Invalid month code "
					+ monthCode + " passed in external code ");
		}
		GregorianCalendar cal = new GregorianCalendar(); // creates with
		// current time
		int currentYear = cal.get(Calendar.YEAR);
		int startYearOfDecade = currentYear / 10 * 10;
		int requiredYear = startYearOfDecade + Integer.parseInt(yearCode);
		cal.set(Calendar.YEAR, requiredYear);
		cal.set(Calendar.MONTH, month - 1);
//		cal.set(Calendar.DATE, 1);
//		cal.set(Calendar.HOUR, 0);
//		cal.set(Calendar.MINUTE, 0);
//		cal.set(Calendar.SECOND, 0);
		try {
			XMLGregorianCalendar gregCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			gregCalendar.setDay(DatatypeConstants.FIELD_UNDEFINED);
			gregCalendar.setTime(DatatypeConstants.FIELD_UNDEFINED,
					DatatypeConstants.FIELD_UNDEFINED,
					DatatypeConstants.FIELD_UNDEFINED);
			gregCalendar.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);
			gregCalendar.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			return gregCalendar;
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
			throw new RuleOperationFailedException(
					"DatatypeConfigurationException obtained "
							+ "while trying to create contractDate "
							+ e.getMessage());
		}
	}

	/**
	 * Obtains C21 Month code based on the lookup table given in Derivatives
	 * data referential
	 * 
	 * @param month
	 * @return
	 */
	private int getMonthValFromC21(char monthCode) {
		// get the month code
		switch (monthCode) {
		case 'F':
			return 1;
		case 'G':
			return 2;
		case 'H':
			return 3;
		case 'J':
			return 4;
		case 'K':
			return 5;
		case 'M':
			return 6;
		case 'N':
			return 7;
		case 'Q':
			return 8;
		case 'U':
			return 9;
		case 'V':
			return 10;
		case 'X':
			return 11;
		case 'Z':
			return 12;
		}
		return -1;
	}

	/**
	 * Validates for mandatory fields and their data types. Throws exception if
	 * not valid.
	 * 
	 * @param externalCode
	 * @throws RuleOperationFailedException
	 */
	private void validateParameters(String externalCode)
			throws RuleOperationFailedException {

		// check for mandatory fields
		if (externalCode == null) {
			throw new RuleOperationFailedException(
					"Please specify value for External Code as it is "
							+ "mandatory field for EncodeC21ExtCode Rule.");
		}

		// length of the external code should be minimum of 5 chars, 3 for
		// Symbol, 1 for month and 1 for year
		if (externalCode.length() < 5) {
			throw new RuleOperationFailedException(
					"External code should be minimum of 5 chars in length,"
							+ " 3 for Symbol, 1 for month and 1 for year");
		}
	}

	/**
	 * Main to test / clarify how formatting works
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger bigInt = new BigInteger("2600");
		System.out.println("Big int " + bigInt);

		BigDecimal dec = new BigDecimal(1.0);
		System.out.println("Precision " + dec.precision());

		// System.out.println("Moving dec point " +
		// dec.movePointRight(dec.precision()).toString());

		System.out.println("Long value  " + dec.longValue());
		System.out.println("Float value  " + dec.floatValue());
		System.out.println("Plain string value  " + dec.toPlainString());

		String floatStr = dec.toString();
		int index = floatStr.indexOf(".");
		String absString = "";
		if (index != -1) {
			absString = floatStr.substring(0, index)
					+ floatStr.substring(index + 1, floatStr.length());
		} else {
			absString = floatStr.toString();
		}

		System.out.println("With decimal removed " + absString);

		try {
			System.out.println("Greg cal "
					+ new DecodeC21ExtCodeRule().getC21ContractDate("M", "3"));
		} catch (RuleOperationFailedException e) {
			e.printStackTrace();
		}
	}
}

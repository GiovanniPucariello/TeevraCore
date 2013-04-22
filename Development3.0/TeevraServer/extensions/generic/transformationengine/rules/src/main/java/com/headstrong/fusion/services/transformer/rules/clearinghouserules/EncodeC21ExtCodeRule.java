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
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * Compute's C21's external derivative product code from the individual
 * parameters - symbol, contract date, security type, option sign and strike
 * price. Refer to Derivatives Data Referential file from LCH.Clearnet SA for
 * the field 25
 */
public class EncodeC21ExtCodeRule implements Rule {
	private static final Logger logger = LoggerFactory
			.getLogger(EncodeC21ExtCodeRule.class);

	private static final String RULE_NAME = "encodeC21ExtCode";
	private static final String SYMBOL = "symbol";
	private static final String CONTRACT_DATE = "contractdate";
	private static final String SECURITY_TYPE = "securitytype";
	private static final String OPTION_SIGN = "optionsign";
	private static final String STRIKE_PRICE = "strikeprice";

	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName(RULE_NAME);
		ruleVO.setClassName(EncodeC21ExtCodeRule.class.getName());
		ruleVO.addInParameter(SYMBOL);
		ruleVO.addInParameter(CONTRACT_DATE);
		ruleVO.addInParameter(SECURITY_TYPE);
		ruleVO.addInParameter(OPTION_SIGN);
		ruleVO.addInParameter(STRIKE_PRICE);
		ruleVO.addOutParameter(RESULT);
		return ruleVO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.transformer.rulemanager.Rule#operate(java.util.Map)
	 */
	public Object operate(Map<String, Object> data)
			throws RuleOperationFailedException {
		logger.debug("Inside EncodeC21ExtCodeRule operate method");

		// get all attributes
		Object symbolObj = data.get(SYMBOL);
		Object contractDtObj = data.get(CONTRACT_DATE);
		Object secTypObj = data.get(SECURITY_TYPE);
		Object optSignObj = data.get(OPTION_SIGN);
		Object strkPxObj = data.get(STRIKE_PRICE);

		logger
				.debug("Inside EncodeC21ExtCodeRule operate method - Before validation "
						+ "symbolObj = "
						+ symbolObj
						+ ", contractDtObj = "
						+ contractDtObj
						+ ", secTypObj="
						+ secTypObj
						+ ", optSignObj="
						+ optSignObj
						+ ",strkPxObj="
						+ strkPxObj);

		validateParameters(symbolObj, contractDtObj, secTypObj, optSignObj,
				strkPxObj);
		logger
				.debug("Inside EncodeC21ExtCodeRule operate method - Validation complete");

		String symbol = (String) symbolObj;
		XMLGregorianCalendar contractDate = (XMLGregorianCalendar) contractDtObj;
		String secType = (String) secTypObj;

		BigInteger optSign = null;
		BigDecimal strkPx = null;

		if ("O".equals(secType)) {
			optSign = (BigInteger) optSignObj;
			strkPx = (BigDecimal) strkPxObj;
		}
		logger.debug("Parameters for EncodeC21ExtCodeRule are symbol=" + symbol
				+ " contractDate= " + contractDate + " Security type "
				+ secType + " Option sign=" + optSign + " Strike price= "
				+ strkPx);

		String externalCode = getExternalCode(symbol, contractDate, secType,
				optSign, strkPx);
		logger.debug("Obtained External Code= " + externalCode);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put(RESULT, externalCode);
		return resultMap;
	}

	/**
	 * Computes external code from the given list of parameters
	 * 
	 * @param symbol2
	 * @param contractDate
	 * @param secType
	 * @param optSign
	 * @param strkPx
	 * @return
	 */
	private String getExternalCode(String symbol,
			XMLGregorianCalendar contractDate, String secType,
			BigInteger optSign, BigDecimal strkPx) {
		// assume that it is going to be maximum of 3 chars as expected by C21
		String c21ExtCode = "";

		symbol = symbol.trim();
		String year = String.valueOf(contractDate.getYear());
		// get the last digit of the year
		String c21Year = year.substring(year.length() - 1, year.length());
		String c21Month = getC21Month(contractDate.getMonth());

		c21ExtCode = symbol + c21Month + c21Year;

		if ("F".equals(secType)) {
			return c21ExtCode;
		}

		// for options include strike price and put/call sign
		String c21StrkPx = strkPx.toString();
		String c21OptSign = "";
		switch (optSign.intValue()) {
		case 0:
			c21OptSign = "P";
			break;
		case 1:
			c21OptSign = "C";
			break;
		}
		c21ExtCode = c21ExtCode + c21StrkPx + c21OptSign;
		return c21ExtCode;
	}

	/**
	 * Obtains C21 Month code based on the lookup table given in Derivatives
	 * data referential
	 * 
	 * @param month
	 * @return
	 */
	private String getC21Month(int month) {
		// get the month code
		String c21Month = "";
		switch (month) {
		case 1:
			c21Month = "F";
			break;
		case 2:
			c21Month = "G";
			break;
		case 3:
			c21Month = "H";
			break;
		case 4:
			c21Month = "J";
			break;
		case 5:
			c21Month = "K";
			break;
		case 6:
			c21Month = "M";
			break;
		case 7:
			c21Month = "N";
			break;
		case 8:
			c21Month = "Q";
			break;
		case 9:
			c21Month = "U";
			break;
		case 10:
			c21Month = "V";
			break;
		case 11:
			c21Month = "X";
			break;
		case 12:
			c21Month = "Z";
			break;
		}
		return c21Month;
	}

	/**
	 * Validates for mandatory fields and their data types. Throws exception if
	 * not valid.
	 * 
	 * @param symbolObj
	 * @param contractDtObj
	 * @param secTypObj
	 * @param optSignObj
	 * @param strkPxObj
	 * @throws RuleOperationFailedException
	 */
	private void validateParameters(Object symbolObj, Object contractDtObj,
			Object secTypObj, Object optSignObj, Object strkPxObj)
			throws RuleOperationFailedException {

		// check for mandatory fields
		if (symbolObj == null) {
			throw new RuleOperationFailedException(
					"Please specify value for Symbol as it is "
							+ "mandatory field for EncodeC21ExtCode Rule.");
		}

		if (contractDtObj == null) {
			throw new RuleOperationFailedException(
					"Please specify value for Contract Date as it is "
							+ "mandatory field for EncodeC21ExtCode Rule.");
		}

		if (secTypObj == null) {
			throw new RuleOperationFailedException(
					"Please specify value for Security type as it is "
							+ "mandatory field for EncodeC21ExtCode Rule.");
		}

		// if the instrument is an option, strike price and option sign are
		// mandatory
		if ("O".equals(secTypObj.toString())) {
			if (optSignObj == null) {
				throw new RuleOperationFailedException(
						"Please specify value for Option Sign "
								+ "mandatory field for EncodeC21ExtCode Rule for options.");
			}

			if (strkPxObj == null) {
				throw new RuleOperationFailedException(
						"Please specify value for Strike Price "
								+ "mandatory field for EncodeC21ExtCode Rule for options.");
			}
		}

		// check the data type of fields
		if ((!(symbolObj instanceof String))
				|| (!(contractDtObj instanceof XMLGregorianCalendar))
				|| (!(secTypObj instanceof String))) {
			throw new RuleOperationFailedException(
					"Invalid datatype specified for Symbol (String) or "
							+ "ContractDate (XMLGregorianCalendar) or Security Type (String).");
		}

		if ("O".equals(secTypObj.toString())) {
			if ((!(optSignObj instanceof BigInteger))
					|| (!(strkPxObj instanceof BigDecimal))) {
				throw new RuleOperationFailedException(
						"Invalid datatype specified for Option Sign (BigInteger) or "
								+ "StrikePrice (BigDecimal).");

			}
		}
	}

	/**
	 * Main to test / clarify how formatting works
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BigDecimal dec = new BigDecimal(1.0);
		System.out.println("Precision " + dec.precision());

		BigInteger i = new BigInteger("1");
		System.out.println("Str " + i.toString() + " int value " + i.intValue());
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
	}
}

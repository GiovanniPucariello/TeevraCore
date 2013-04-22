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
 * $Id: DataTypeConverter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 14, 2009
 */
package com.headstrong.fusion.commons;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DataTypeConverter {

	private static Map<String, Parser> dataParserMap = new HashMap<String, Parser>();
	private static Map<String, DataFormatter> dataFormatterMap = new HashMap<String, DataFormatter>();
	private static final String DEFAULT_DATE_YYYYMMDD = "00000000";

	static {
		IntegerDataParser integerDataParser = new IntegerDataParser();
		dataParserMap.put("int", integerDataParser);
		dataParserMap.put("integer", integerDataParser);
		dataParserMap.put("biginteger", new BigIntegerDataParser());
		dataParserMap.put("double", new DoubleDataParser());
		dataParserMap.put("long", new LongDataParser());
		dataParserMap.put("boolean", new BooleanDataParser());
		dataParserMap.put("float", new FloatDataParser());
		dataParserMap.put("short", new ShortDataParser());
		dataParserMap.put("string", new StringDataParser());
		dataParserMap.put("xmlgregoriancalendar",
				new XMLGregorianCalendarParser());
		dataParserMap.put("bigdecimal", new BigDecimalDataParser());

		dataFormatterMap.put("xmlgregoriancalendar",
				new XMLGregorianCalendarFormatter());
		dataFormatterMap
				.put("signed_numeric", new SignedNumericDataFormatter());
	}

	/**
	 * Formats the data based on the Datatype provided.
	 * 
	 * @param data
	 *            Input data
	 * @param dataType
	 *            Simple data types.
	 * @return formatted data
	 * @throws Exception
	 */
	public static Object parse(Object data, String dataType) throws Exception {
		Object parsedData = null;
		SimpleDataParser dataParser = (SimpleDataParser) dataParserMap
				.get(dataType.toLowerCase());
		if (dataParser == null) {
			throw new Exception("Invalid Data Type " + dataType + " specified");
		} else {
			parsedData = dataParser.parse(data);
		}
		return parsedData;
	}

	/**
	 * Formats the input data based on the data type provided.
	 * 
	 * @param data
	 *            input data
	 * @param dataType
	 *            data type.
	 * @param input
	 *            additional input required to format the data.
	 * @return formatted data.
	 * @throws Exception
	 */
	public static Object parse(Object data, String dataType, String... input)
			throws Exception {

		if (dataType.toLowerCase().equals("bigdecimal")) {
			if (input == null) {
				input = new String[5];
				input[0] = "0";
			}

			if (input.length == 0) {

				input[0] = "0";
			}
		}

		if (input == null || input.length == 0) {
			return parse(data, dataType);
		}

		Object parsedData = null;
		AdvancedDataParser dataParser = (AdvancedDataParser) dataParserMap
				.get(dataType.toLowerCase());
		if (dataParser == null) {
			throw new Exception("Invalid format " + dataType + " specified");
		} else {
			parsedData = dataParser.parse(data, input);
		}
		return parsedData;
	}

	/**
	 * Formats the input data based on the data type provided.
	 * 
	 * @param data
	 *            input data
	 * @param dataType
	 *            data type.
	 * @param input
	 *            additional input required to format the data.
	 * @return formatted data.
	 * @throws Exception
	 */
	public static Object format(Object data, String dataType, String... input)
			throws Exception {
		Object formattedData = null;
		DataFormatter dataFormatter = (DataFormatter) dataFormatterMap
				.get(dataType.toLowerCase());
		if (dataFormatter == null) {
			throw new Exception("Invalid format " + dataType + " specified");
		} else {
			formattedData = dataFormatter.format(data, input);
		}
		return formattedData;
	}

	/**
	 * @author Ssoni
	 * 
	 */
	private static interface DataFormatter {
		public Object format(Object data, String... input) throws Exception;
	}

	/**
	 * @author Ssoni
	 * 
	 */
	private static interface Parser {

	}

	/**
	 * @author Ssoni
	 * 
	 */
	private static interface SimpleDataParser extends Parser {
		public Object parse(Object data) throws Exception;
	}

	/**
	 * @author Ssoni
	 * 
	 */
	private static interface AdvancedDataParser extends Parser {
		public Object parse(Object data, String... input) throws Exception;
	}

	private static class BigDecimalDataParser implements AdvancedDataParser {
		public Object parse(Object data, String... input) throws Exception {
			BigDecimal value = null;
			if (data != null) {
				if (data instanceof String) {
					int dot_position = Integer.parseInt(input[0]);
					int length = data.toString().length();
					if (length == dot_position) {

					}
					String numeric_part = data.toString().substring(0,
							(length - dot_position));
					String decimal_part = data.toString().substring(
							length - dot_position);
					if (decimal_part != null && !decimal_part.equals("")) {
						data = numeric_part + "." + decimal_part;
					}

					if (((String) data).isEmpty()) {
						value = BigDecimal.ZERO;
					} else {
						value = BigDecimal.valueOf(Double
								.parseDouble((String) data));
					}
				} else if (data instanceof BigDecimal) {
					value = (BigDecimal) data;
				} else if (data instanceof Long) {
					value = BigDecimal.valueOf(((Long) data));
				} else if (data instanceof Integer) {
					value = BigDecimal.valueOf(((Integer) data));
				} else if (data instanceof Double) {
					value = BigDecimal.valueOf(((Double) data));
				} else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	}

	private static class LongDataParser implements SimpleDataParser {
		public Object parse(Object data) throws Exception {
			Long value = null;
			if (data != null) {
				if (data instanceof String) {
					if (((String) data).isEmpty()) {
						value = new Long(0);
					} else {
						value = Long.parseLong((String) data);
					}
				} else if (data instanceof Long) {
					value = (Long) data;
				} else if (data instanceof Integer) {
					value = ((Integer) data).longValue();
				}

				else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	}

	private static class DoubleDataParser implements SimpleDataParser {
		public Object parse(Object data) throws Exception {
			Double value = null;
			if (data != null) {
				if (data instanceof String) {
					if (((String) data).isEmpty()) {
						value = new Double(0);
					} else {
						value = Double.parseDouble((String) data);
					}
				} else if (data instanceof Double) {
					value = (Double) data;
				} else if (data instanceof BigDecimal) {
					value = ((BigDecimal) data).doubleValue();
				} else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	}

	private static class IntegerDataParser implements SimpleDataParser {
		public Object parse(Object data) throws Exception {
			Integer value = null;
			if (data != null) {
				if (data instanceof String) {
					if (((String) data).isEmpty()) {
						value = new Integer(0);
					} else {
						value = Integer.parseInt(data.toString());
					}
				} else if (data instanceof Integer) {
					value = (Integer) data;
				} else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	}

	private static class BigIntegerDataParser implements SimpleDataParser {
		public Object parse(Object data) throws Exception {
			BigInteger value = null;
			if (data != null) {
				if (data instanceof String) {
					if (((String) data).isEmpty()) {
						value = BigInteger.ZERO;
					} else {
						data = data.toString().replace("+", "");
						value = BigInteger.valueOf(Long.parseLong(data
								.toString()));
					}
				} else if (data instanceof BigInteger) {
					value = (BigInteger) data;
				} else if (data instanceof Integer) {
					Integer intgr = (Integer) data;
					value = BigInteger.valueOf(intgr);
				} else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	}

	private static class BooleanDataParser implements SimpleDataParser {
		public Object parse(Object data) throws Exception {
			Boolean value = null;
			if (data != null) {
				if (data instanceof String) {
					if (((String) data).isEmpty()) {
						value = false;
					} else {
						value = Boolean.valueOf((String) data);
					}
				} else if (data instanceof Boolean) {
					value = (Boolean) data;
				} else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	}

	private static class FloatDataParser implements SimpleDataParser {
		public Object parse(Object data) throws Exception {
			Float value = null;
			if (data != null) {
				if (data instanceof String) {
					if (((String) data).isEmpty()) {
						value = new Float(0);
					} else {
						value = Float.valueOf((String) data);
					}
				} else if (data instanceof Float) {
					value = (Float) data;
				} else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	}

	private static class ShortDataParser implements SimpleDataParser {
		public Object parse(Object data) throws Exception {
			Short value = null;
			if (data != null) {
				if (!(data instanceof Short)) {
					if (((String) data).isEmpty()) {
						value = new Short("0");
					} else {
						value = Short.valueOf((String) data);
					}
				} else if (data instanceof Short) {
					value = (Short) data;
				} else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	}

	private static class XMLGregorianCalendarParser implements
			AdvancedDataParser {
		/**
		 * To specify simple date format without time
		 */
		static final String SIMPLE_DATE_FORMAT = "YYYYMMDD";
		/**
		 * To specify simple time format without date
		 */
		static final String SIMPLE_TIME_FORMAT = "HHMMSS";

		// for optimization purpose store the date format.
		private static Map<String, SimpleDateFormat> dateFormatMap = new HashMap<String, SimpleDateFormat>();
		private static DatatypeFactory datatypeFactory;

		public Object parse(Object data, String... input) throws Exception {
			if (datatypeFactory == null) {
				datatypeFactory = DatatypeFactory.newInstance();
			}
			XMLGregorianCalendar value = null;
			if (data != null && !data.toString().isEmpty()) {
				if (data instanceof XMLGregorianCalendar) {
					value = (XMLGregorianCalendar) data;
				} else if (data instanceof String) {
					if (data.toString().equals(DEFAULT_DATE_YYYYMMDD)) {
						return null;
					}
					String dateFormatStr = input[0];
					SimpleDateFormat simpleDateFormat = null;
					if (!dateFormatMap.containsKey(dateFormatStr)) {
						simpleDateFormat = new SimpleDateFormat(input[0]);
						dateFormatMap.put(dateFormatStr, simpleDateFormat);
					} else {
						simpleDateFormat = dateFormatMap.get(input[0]);
					}

					Date date = null;
					boolean noDate = false;
					if (data instanceof String && data.toString().length() == 8
							&& data.toString().substring(6, 8).equals("00")) {
						// provide a valid date.
						data = data.toString().substring(0, 6) + "01";
						noDate = true;
					}
					date = simpleDateFormat.parse(data.toString());
					if (date == null)
						return null;
					GregorianCalendar cal = new GregorianCalendar();
					cal.setTime(date);
					value = datatypeFactory.newXMLGregorianCalendar(cal);
					value.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
					// if the date format is of simple date(time) format remove
					// the information of time(date)
					if (dateFormatStr.equalsIgnoreCase(SIMPLE_DATE_FORMAT)) {
						value.setTime(DatatypeConstants.FIELD_UNDEFINED,
								DatatypeConstants.FIELD_UNDEFINED,
								DatatypeConstants.FIELD_UNDEFINED);
					} else if (dateFormatStr
							.equalsIgnoreCase(SIMPLE_TIME_FORMAT)) {
						value.setYear(DatatypeConstants.FIELD_UNDEFINED);
						value.setMonth(DatatypeConstants.FIELD_UNDEFINED);
						value.setDay(DatatypeConstants.FIELD_UNDEFINED);
						value
								.setMillisecond((DatatypeConstants.FIELD_UNDEFINED));
					}

					// if day part was invalid remove the day from parsed date
					if (noDate) {
						value.setDay(DatatypeConstants.FIELD_UNDEFINED);
						// value.setMonth(value.getMonth()+1);
					}
				} else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	}

	private static class StringDataParser implements SimpleDataParser {
		public Object parse(Object data) throws Exception {
			if (data == null) {
				return null;
			}
			if (data instanceof String) {
				return data;
			} else {
				return data.toString();
			}
		}
	}

	/**
	 * Formats the incoming XMLGregorianCalender to the date format specified.
	 * 
	 */
	private static class XMLGregorianCalendarFormatter implements DataFormatter {
		/**
		 * To specify simple date format without time
		 */
		static final String SIMPLE_DATE_FORMAT = "YYYYMMDD";
		/**
		 * To specify simple time format without date
		 */
		static final String SIMPLE_TIME_FORMAT = "HHMMSS";
		// for optimization purpose store the date format.
		private Map<String, SimpleDateFormat> dateFormatMap = new HashMap<String, SimpleDateFormat>();

		public Object format(Object data, String... input) throws Exception {
			if (data == null) {
				return null;
			}
			XMLGregorianCalendar inputData = (XMLGregorianCalendar) data;
			String dateFormatStr = input[0];
			SimpleDateFormat dateFormat = null;
			if (!dateFormatMap.containsKey(dateFormatStr)) {
				dateFormat = new SimpleDateFormat(input[0]);
				dateFormatMap.put(dateFormatStr, dateFormat);
			} else {
				dateFormat = dateFormatMap.get(input[0]);
			}
			String formattedDate = dateFormat.format(inputData
					.toGregorianCalendar().getTime());
			if (dateFormatStr.equalsIgnoreCase(SIMPLE_DATE_FORMAT)
					&& inputData.getDay() <= 0) {
				formattedDate = formattedDate.substring(0, 6) + "00";
			}
			return formattedDate;
		}
	}

	/**
	 * Formats the incoming XMLGregorianCalender to the date format specified.
	 * 
	 */
	private static class SignedNumericDataFormatter implements DataFormatter {
		public Object format(Object data, String... input) throws Exception {

			if (data == null) {
				return null;
			}
			String formattedData = null;

			String[] inputArray = data.toString().split("\\.");
			String decimalPart = null;
			if (inputArray.length > 1) {
				decimalPart = inputArray[1];
			} else {
				decimalPart = "";
			}

			int decimalLength = decimalPart.length();
			int expectedLength = Integer.parseInt(input[0]);
			if (decimalLength >= expectedLength) {
				decimalPart = decimalPart.substring(0, expectedLength);
				formattedData = inputArray[0] + decimalPart;
				return formattedData;
			}

			int padLength = expectedLength - decimalLength;
			StringBuffer buffer = new StringBuffer();
			for (int i = padLength; i > 0; --i) {
				buffer.append("0");
			}
			formattedData = inputArray[0] + decimalPart + buffer;

			return formattedData;
		}
	}
}

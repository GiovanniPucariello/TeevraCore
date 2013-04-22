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
 * $Id: DataTypeConverterTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 4, 2010 
 */

package com.headstrong.fusion.commons;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import junit.framework.TestCase;

/**
 * 
 */
public class DataTypeConverterTest extends TestCase {

	public void testParseInvalidTypeSimpleParse() throws Exception {
		try {
			DataTypeConverter.parse("10", "invalid");
		} catch (Exception e) {
			return;
		}
		fail();
	}

	public void testParseInvalidTypeAdvancedParse() throws Exception {
		try {
			DataTypeConverter.parse("10", "invalid", "param1", "param2");
		} catch (Exception e) {
			return;
		}
		fail();
	}

	public void testParseInteger() throws Exception {
		assertEquals(new Integer(10), DataTypeConverter.parse("10", "integer"));
	}

	public void testParseInt() throws Exception {
		assertEquals(10, DataTypeConverter.parse("10", "int"));
	}

	public void testParseBigInteger() throws Exception {
		assertEquals(new BigInteger("10"), DataTypeConverter.parse("10",
				"biginteger"));
	}

	public void testParseDouble() throws Exception {
		assertEquals(new Double(10.00), DataTypeConverter.parse("10", "double"));
	}

	public void testParseLong() throws Exception {
		Long expected = new Long(10);
		assertEquals(expected, DataTypeConverter.parse("10", "long"));
		assertEquals(expected, DataTypeConverter.parse(new Long(10), "long"));
		assertEquals(expected, DataTypeConverter.parse(new Integer(10), "long"));
		boolean error = false;
		try {
			DataTypeConverter.parse(new Double(10), "long");
		} catch (Exception e) {
			error = true;
		}
		if (!error) {
			fail();
		}
	}

	public void testParseBoolean() throws Exception {
		assertEquals(false, DataTypeConverter.parse("false", "boolean"));
	}

	public void testParseFloat() throws Exception {
		assertEquals(new Float(10.00), DataTypeConverter
				.parse("10.00", "float"));
	}

	public void testParseShort() throws Exception {
		assertEquals(new Short("10"), DataTypeConverter.parse("10", "short"));
	}

	public void testParseString() throws Exception {
		assertEquals("10", DataTypeConverter.parse(10, "string"));
	}

	public void testParseXmlGregorianCalender() throws Exception {
		XMLGregorianCalendar cal = (XMLGregorianCalendar) DataTypeConverter
				.parse("20100810", "xmlgregoriancalendar", "yyyyMMdd");
		assertEquals(2010, cal.getYear());
		assertEquals(8, cal.getMonth());
		assertEquals(10, cal.getDay());
	}

	public void testFormat() throws Exception {
		XMLGregorianCalendar cal = (XMLGregorianCalendar) DataTypeConverter
				.parse("20100810", "xmlgregoriancalendar", "yyyyMMdd");
		assertEquals("10082010", DataTypeConverter.format(cal,
				"xmlgregoriancalendar", "ddMMyyyy"));
	}

	public void testFormatInvalidFormatType() throws Exception {
		XMLGregorianCalendar cal = (XMLGregorianCalendar) DataTypeConverter
				.parse("20100810", "xmlgregoriancalendar", "yyyyMMdd");
		try {
			DataTypeConverter.format(cal, "invalid", "ddMMyyyy");
		} catch (Exception e) {
			return;
		}
		fail();
	}

	public void testParseBigDecimal() throws Exception {
		BigDecimal expected = BigDecimal.valueOf(Double.valueOf("10"));
		BigDecimal actual = null;
		actual = (BigDecimal) DataTypeConverter.parse("10", "bigdecimal",null);
		assertEquals(expected, actual);
		actual = (BigDecimal) DataTypeConverter.parse(new Long(10),
				"bigdecimal",null);
		expected = BigDecimal.valueOf(Long.valueOf("10"));
		assertEquals(expected, actual);
		actual = (BigDecimal) DataTypeConverter.parse(new Double(10),
				"bigdecimal",null);
		expected = BigDecimal.valueOf(Double.valueOf("10"));
		assertEquals(expected, actual);
		actual = (BigDecimal) DataTypeConverter.parse(new Integer(10),
				"bigdecimal",null);
		expected = BigDecimal.valueOf(Integer.valueOf("10"));
		assertEquals(expected, actual);
	}
}

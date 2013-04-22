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
 * $Id: MessageExchangePattern.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Sep 3, 2009 
 */

package com.headstrong.fusion.commons;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents the kind of message exchange pattern.
 */
public enum MessageExchangePattern {
	InOnly, RobustInOnly, InOut, InOptionalOut, OutOnly, RobustOutOnly, OutIn, OutOptionalIn;

	protected static final Map<String, MessageExchangePattern> MAP = new HashMap<String, MessageExchangePattern>();

	/**
	 * Returns the WSDL URI for this message exchange pattern
	 */
	public String getWsdlUri() {
		switch (this) {
		case InOnly:
			return "http://www.w3.org/ns/wsdl/in-only";
		case InOptionalOut:
			return "http://www.w3.org/ns/wsdl/in-optional-out";
		case InOut:
			return "http://www.w3.org/ns/wsdl/in-out";
		case OutIn:
			return "http://www.w3.org/ns/wsdl/out-in";
		case OutOnly:
			return "http://www.w3.org/ns/wsdl/out-only";
		case OutOptionalIn:
			return "http://www.w3.org/ns/wsdl/out-optional_in";
		case RobustInOnly:
			return "http://www.w3.org/ns/wsdl/robust-in-only";
		case RobustOutOnly:
			return "http://www.w3.org/ns/wsdl/robust-out-only";
		default:
			throw new IllegalArgumentException(
					"Unknown message exchange pattern: " + this);
		}
	}

	/**
	 * Return true if there can be an IN message
	 */
	public boolean isInCapable() {
		switch (this) {
		case OutOnly:
		case RobustOutOnly:
			return false;
		default:
			return true;
		}
	}

	/**
	 * Return true if there can be an OUT message
	 */
	public boolean isOutCapable() {
		switch (this) {
		case InOnly:
		case RobustInOnly:
			return false;
		default:
			return true;
		}
	}

	/**
	 * Return true if there can be a FAULT message
	 */
	public boolean isFaultCapable() {
		switch (this) {
		case InOnly:
		case OutOnly:
			return false;
		default:
			return true;
		}
	}

	/**
	 * Converts the WSDL URI into a {@link ExchangePattern} instance
	 */
	public static MessageExchangePattern fromWsdlUri(String wsdlUri) {
		return MAP.get(wsdlUri);
	}

	static {
		for (MessageExchangePattern mep : values()) {
			String uri = mep.getWsdlUri();
			MAP.put(uri, mep);
			String name = uri.substring(uri.lastIndexOf('/') + 1);
			MAP.put("http://www.w3.org/2004/08/wsdl/" + name, mep);
			MAP.put("http://www.w3.org/2006/01/wsdl/" + name, mep);
		}
	}
}

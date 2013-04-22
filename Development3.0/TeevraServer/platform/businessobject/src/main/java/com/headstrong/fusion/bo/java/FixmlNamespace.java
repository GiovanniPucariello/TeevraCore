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
 * $Id: FixmlNamespace.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Feb 3, 2010 
 */

package com.headstrong.fusion.bo.java;

/**
 * Represents different namespaces
 */
public enum FixmlNamespace {

	FIXML_5_0 {
		public String getFixmlNamespace() {
			return "http://www.fixprotocol.org/FIXML-5-0";
		}

		public String getFixmlContext() {
			return "org.fixprotocol.fixml_5_0";
		}
	},
	FIXML_5_0_SP2 {
		public String getFixmlNamespace() {
			return "http://www.fixprotocol.org/FIXML-5-0-SP2";
		}

		public String getFixmlContext() {
			return "org.fixprotocol.fixml_5_0_sp2";
		}
	},
	TEEVRA_FIXML_1_0 {
		public String getFixmlNamespace() {
			return "http://www.headstrong.com/TEEVRA-FIXML-1-0";
		}

		public String getFixmlContext() {
			return "com.headstrong.teevra_fixml_1_0";
		}
	},
	DEFAULT {
		public String getFixmlNamespace() {
			return "http://www.headstrong.com/TEEVRA-FIXML-1-0";
		}

		public String getFixmlContext() {
			return "com.headstrong.teevra_fixml_1_0";
		}
	};

	public String getFixmlContext() {
		return null;
	}

	public String getFixmlNamespace() {
		return null;
	}

}

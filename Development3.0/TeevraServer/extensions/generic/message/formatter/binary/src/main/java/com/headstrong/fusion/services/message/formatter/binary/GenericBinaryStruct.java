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
 * $Id: GenericBinaryStruct.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Apr 20, 2009 
 */

package com.headstrong.fusion.services.message.formatter.binary;


public class GenericBinaryStruct extends AbstractBinaryStruct {
	@Override
	public boolean isUnion() {
		return false;
	}
}

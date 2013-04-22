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
 * $Id: MessageIDGenerator.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Oct 1, 2008 
 */

package com.headstrong.fusion.commons;

import com.headstrong.fusion.commons.exception.FusionException;


public interface MessageIDGenerator {
	/**
	 * Gets a new message id for the sessionid specified. 
	 * @precondition
	 * @postcondition 	
	 * @param sessionId
	 * @return
	 */
	public String getMessageID(String sessionId);
	
	/**
	 * Gets a new sessionid for the processid specified. 
	 * @precondition
	 * @postcondition 	
	 * @param processId
	 * @return
	 * @throws FusionException
	 */
	public String getSessionId(String processId) throws FusionException;
}

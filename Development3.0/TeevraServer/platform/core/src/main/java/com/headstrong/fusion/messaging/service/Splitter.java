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
 * $Id: Splitter.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 27, 2009 
 */

package com.headstrong.fusion.messaging.service;

import com.headstrong.fusion.config.SplitterStrategy;

/**
 * Split the incoming message based on the splitter strategy.
 * 
 */
public interface Splitter {
	public Object split(Object message,
			SplitterStrategy splitterStrategy) throws Exception;
}

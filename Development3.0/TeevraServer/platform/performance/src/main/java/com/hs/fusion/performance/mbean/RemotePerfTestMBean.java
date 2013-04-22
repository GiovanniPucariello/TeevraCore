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
 * $Id: RemotePerfTestMBean.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 16, 2009 
 */

package com.hs.fusion.performance.mbean;

/**
 * 
 */
public interface RemotePerfTestMBean {

	public void execute(String resultDir) throws Exception;

}

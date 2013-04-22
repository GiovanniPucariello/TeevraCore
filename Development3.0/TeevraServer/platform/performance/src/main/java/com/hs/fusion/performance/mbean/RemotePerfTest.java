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
 * $Id: RemotePerfTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 16, 2009 
 */

package com.hs.fusion.performance.mbean;

import com.hs.fusion.performance.PerformanceTester;

/**
 * 
 */
public class RemotePerfTest implements RemotePerfTestMBean {
	private PerformanceTester performanceTester;

	public RemotePerfTest(PerformanceTester performanceTester) {
		this.performanceTester = performanceTester;
	}

	@Override
	public void execute(String resultDir) throws Exception {
		this.performanceTester.execute(resultDir);
	}

}

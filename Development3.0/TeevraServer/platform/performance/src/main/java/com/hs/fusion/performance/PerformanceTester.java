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
 * $Id: PerformanceTester.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 14, 2009 
 */

package com.hs.fusion.performance;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Map.Entry;

import org.osgi.framework.BundleContext;

/**
 * performance testing.
 */
public class PerformanceTester {

	private BundleContext bundleContext;
	private PerformanceDataLogger logger;

	public PerformanceTester(BundleContext bundleContext,
			PerformanceDataLogger logger) {
		this.bundleContext = bundleContext;
		this.logger = logger;
	}

	public void execute(String resultDir) throws Exception {
		System.out.println("PerformanceTester.execute(): started");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
		// read the test files.
		Properties props = new Properties();
		props.load(this.bundleContext.getBundle().getEntry(
				"TestCases.properties").openStream());
		for (Entry<Object, Object> entry : props.entrySet()) {
			if (entry.toString().startsWith("TestClass")) {
				System.out.println("Executing Test Case:" + entry.getValue());
				// load the test class.
				PerformanceTest performanceTest = (PerformanceTest) Class
						.forName(entry.getValue().toString()).newInstance();
				// run the test cases as mentioned
				performanceTest.execute(bundleContext, logger);
			}
		}
		File file = new File(resultDir + "/" + sdf.format(new Date()) + ".csv");
		if (!file.exists()) {
			file.createNewFile();
		}
		this.logger.writeToFile(file);
		System.out.println("PerformanceTester.execute(): finished");
	}
}

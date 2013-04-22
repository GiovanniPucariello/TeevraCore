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
 * $Id: PerformanceDataLogger.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 14, 2009 
 */

package com.hs.fusion.performance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class PerformanceDataLogger {
	private List<PerformanceData> performanceDataList;

	public PerformanceDataLogger() {
		this.performanceDataList = new ArrayList<PerformanceData>();
	}

	public void logPerformanceData(PerformanceData performanceData)
			throws Exception {
		this.performanceDataList.add(performanceData);
	}

	public void writeToFile(File file) throws Exception {
		FileWriter writer = new FileWriter(file);
		// create header.
		StringBuffer header = new StringBuffer();
		header.append("Test Scenario");
		header.append(",");
		header.append("Test Case");
		header.append(",");
		header.append("Input");
		header.append(",");
		header.append("Output");
		header.append(",");
		header.append("Total Time");
		header.append(",");
		header.append("Mean Time");
		header.append(",");
		header.append("Min Time");
		header.append(",");
		header.append("Max Time");
		header.append(",");
		header.append("Additional Data");
		header.append(",");
		writer.write(header.toString());
		writer.write("\n");
		for (PerformanceData performanceData : performanceDataList) {
			writeData(writer, performanceData.getTestScenario());
			writeData(writer, performanceData.getTestCase());
			writeData(writer, performanceData.getInput());
			writeData(writer, performanceData.getOutput());
			writeData(writer, performanceData.getTotalTime());
			writeData(writer, performanceData.getMeanTime());
			writeData(writer, performanceData.getMinTime());
			writeData(writer, performanceData.getMaxTime());
			writeData(writer, performanceData.getAdditionalData());
			writer.write("\n");
		}
		writer.flush();
		writer.close();
	}

	private void writeData(Writer writer, String data) throws IOException {
		writer.write((data == null ? "" : data) + ",");
	}
}

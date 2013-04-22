/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright � 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: xmlConfigGeneratorLauncher.java
 * $Revision: 
 * $Author: VijayBR
 * $DateTime: Sep 14, 2009 
 */

package com.headstrong.fusion.eurexStructConfigXMLGenerator.launcher;

import java.util.List;
import com.headstrong.fusion.eurexStructConfigXMLGenerator.core.ConvertStringToXML;
import com.headstrong.fusion.eurexStructConfigXMLGenerator.core.ExtractArrayValueFromFiles;
import com.headstrong.fusion.eurexStructConfigXMLGenerator.dataFactory.StaticConfigDataFactoryForEurex;

public class XMLConfigGeneratorLauncher {

	StaticConfigDataFactoryForEurex datafactory = new StaticConfigDataFactoryForEurex();
	ConvertStringToXML toXML = new ConvertStringToXML();

	private void loopSheets(List<String> arrayValues) {

		List<String> fileNames = datafactory.fileList();

		for (String fileName : fileNames) {
			toXML.generateXML(fileName, arrayValues);
		}

	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param args
	 */
	public static void main(String[] args) {
		XMLConfigGeneratorLauncher xmlGeneratorFromHXX = new XMLConfigGeneratorLauncher();

		ExtractArrayValueFromFiles ex = new ExtractArrayValueFromFiles();
		List<String> arrayValues = ex.getArrayValuesList();
		xmlGeneratorFromHXX.loopSheets(arrayValues);
		// System.out.println(ex.getArrayValuesList());

	}

}

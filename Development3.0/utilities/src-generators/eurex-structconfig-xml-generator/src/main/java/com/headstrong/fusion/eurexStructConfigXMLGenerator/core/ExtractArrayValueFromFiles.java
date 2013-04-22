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
 * $Id: ExtractArrayValueFromFiles.java
 * $Revision: 
 * $Author: VijayBR
 * $DateTime: Sep 15, 2009 
 */

package com.headstrong.fusion.eurexStructConfigXMLGenerator.core;

import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import com.headstrong.fusion.eurexStructConfigXMLGenerator.dataFactory.StaticConfigDataFactoryForEurex;

/**
 * 
 */
public class ExtractArrayValueFromFiles {
	
	private static final String HXX_FOLDERNAME = "src/main/resources/hxx/";	
	StaticConfigDataFactoryForEurex datafactory = new StaticConfigDataFactoryForEurex();
	
	@SuppressWarnings("unchecked")
	public List<String> getArrayValuesList() {
		
		List<String> fileNames = datafactory.fileList();
		fileNames.add(StaticConfigDataFactoryForEurex.DRIV_DATATYPE);
	    fileNames.add(StaticConfigDataFactoryForEurex.DRIV_DATATYPE_DEPRECATED);
		List<String> listFromDataTypes= new LinkedList();
		FileInputStream sizeValuesFromDataTypes;
		ConvertStreamToString streamToString = new ConvertStreamToString();
		
		try {
			
		
	    
	    for(String fileName:fileNames) {
	    	sizeValuesFromDataTypes = new FileInputStream(HXX_FOLDERNAME
					+ fileName);
			String stringFromDataTypes = streamToString
					.convertStreamToString(sizeValuesFromDataTypes);

			String usefulString = new String();

			StringTokenizer stringTokenizerForDataTypes = new StringTokenizer(
					stringFromDataTypes, "\n");
			//We need only those Array Values which start with "#define"
			while (stringTokenizerForDataTypes.hasMoreTokens()) {
				String eachUsefulLine = stringTokenizerForDataTypes.nextToken();
				if (eachUsefulLine.startsWith("#define")) {
					usefulString += eachUsefulLine + " \n";
				}
			}

			stringTokenizerForDataTypes = new StringTokenizer(usefulString, " ");
           //Adding each word from DRIV_data_types.hxx to a List in which an 
		  //Array definition is follwed the Value
			while (stringTokenizerForDataTypes.hasMoreTokens()) {
				String temp = stringTokenizerForDataTypes.nextToken();
				if(temp.contains("\t")) {
				  String[] tempSplitForTab = temp.split("\\\t");
				  for(String afterTabSplit:tempSplitForTab) {
					  stringFromDataTypes = "["
							+ afterTabSplit + "];";
					listFromDataTypes.add(stringFromDataTypes);
				  }
					
				} else {
					stringFromDataTypes = "["
						+ temp + "];";
				listFromDataTypes.add(stringFromDataTypes);
				}
				

			}
	    	
		
		
	}
	  //  System.out.println(listFromDataTypes);
		}  catch (Exception e) {

			e.printStackTrace();
		}
		
		return listFromDataTypes;
		

}
}

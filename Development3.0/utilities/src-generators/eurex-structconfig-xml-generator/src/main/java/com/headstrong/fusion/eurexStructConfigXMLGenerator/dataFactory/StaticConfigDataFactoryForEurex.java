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
 * $Id: staticConfigDataFactoryForEurex.java
 * $Revision: 
 * $Author: VijayBR
 * $DateTime: Sep 14, 2009 
 */

package com.headstrong.fusion.eurexStructConfigXMLGenerator.dataFactory;

import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class StaticConfigDataFactoryForEurex {

	public static final String DRIV_DATATYPE = "DRIV_data_types.hxx";
	public static final String DRIV_DATATYPE_DEPRECATED = "DRIV_deprecated.hxx";

	public List<String> fileList() {
		List<String> hxxFileList = new ArrayList();

		File folder = new File("src/main/resources/hxx");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				hxxFileList.add(listOfFiles[i].getName());
			}			
		}
		
		hxxFileList.remove(DRIV_DATATYPE);
		hxxFileList.remove(DRIV_DATATYPE_DEPRECATED);

	return hxxFileList;

	}

	public static void main(String args[]) {
		StaticConfigDataFactoryForEurex files = new StaticConfigDataFactoryForEurex();
		files.fileList();
	}

}

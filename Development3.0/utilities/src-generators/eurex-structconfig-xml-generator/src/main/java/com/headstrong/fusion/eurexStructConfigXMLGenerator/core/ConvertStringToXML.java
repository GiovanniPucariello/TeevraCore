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
 * $Id: ConvertStringToXML.java
 * $Revision: 
 * $Author: vijayBR
 * $DateTime: Sep 15, 2009
 */

package com.headstrong.fusion.eurexStructConfigXMLGenerator.core;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("unchecked")
public class ConvertStringToXML {

	private static final String HXX_FOLDERNAME = "src/main/resources/hxx/";
	private static final String XML_FOLDERNAME = "src/main/resources/xml/";

	public void generateXML(String fileName, List<String> listFromDataTypes) {

		//Converting input fileName from .hxx to .xml for output fileName
		String DestinationFileName = null;
		if(fileName.endsWith(".hxx")) {
			DestinationFileName = (fileName.substring(0,
					fileName.length() - 3))
					+ "xml";
		} else if(fileName.endsWith(".h")) {
			DestinationFileName = (fileName.substring(0,
					fileName.length() - 1))
					+ "xml";
		}
		


		List listSeperatedbyTypeDef = new LinkedList();
	//	List listFromDataTypes = new LinkedList();
		ConvertStreamToString streamToString = new ConvertStreamToString();

		FileInputStream filestream;
		
		try {
			//OutputStream to write the xml
			OutputStream outStream = new FileOutputStream(XML_FOLDERNAME
					+ DestinationFileName);
			OutputStream bufferedOutStream = new BufferedOutputStream(outStream);
			OutputStreamWriter out = new OutputStreamWriter(bufferedOutStream,
					"8859_1");

			out.write("<?xml version=\"1.0\" ");
			out.write("encoding=\"UTF-8\"?>\r\n");
			out.write("<struct type=\"complexStruct\">\r\n");
			
            //InputStream to read the .hxx files
			filestream = new FileInputStream(HXX_FOLDERNAME + fileName);

			//Generating a String form the input fileStream  using ConvertStreamToString.java
			String dataFromHeaderFile = streamToString
					.convertStreamToString(filestream);
			String[] stringFromHeaderFile = null;
			stringFromHeaderFile = dataFromHeaderFile.split("typedef");
			for (int i = 0; i < stringFromHeaderFile.length; i++) {
				listSeperatedbyTypeDef.add(stringFromHeaderFile[i]);
			}
            
//			// Generating a String form DRIV_data_types.hxx to get the values for Array
//			sizeValuesFromDataTypes = new FileInputStream(HXX_FOLDERNAME
//					+ "DRIV_data_types.hxx");
//			String stringFromDataTypes = streamToString
//					.convertStreamToString(sizeValuesFromDataTypes);
//
//			String usefulString = new String();
//
//			StringTokenizer stringTokenizerForDataTypes = new StringTokenizer(
//					stringFromDataTypes, "\n");
//			//We need only those Array Values which start with "#define"
//			while (stringTokenizerForDataTypes.hasMoreTokens()) {
//				String eachUsefulLine = stringTokenizerForDataTypes.nextToken();
//				if (eachUsefulLine.startsWith("#")) {
//					usefulString += eachUsefulLine + " \n";
//				}
//			}
//
//			stringTokenizerForDataTypes = new StringTokenizer(usefulString, " ");
//           //Adding each word from DRIV_data_types.hxx to a List in which an 
//		  //Array definition is follwed the Value
//			while (stringTokenizerForDataTypes.hasMoreTokens()) {
//				stringFromDataTypes = "["
//						+ stringTokenizerForDataTypes.nextToken() + "];";
//				listFromDataTypes.add(stringFromDataTypes);
//
//			}

			ListIterator iterator = listSeperatedbyTypeDef.listIterator(1);

			while (iterator.hasNext()) {
				int count = 0;
				String strLine = (String) iterator.next();
				List listOfEachTypeDef = new LinkedList();
				StringTokenizer tokenizer = new StringTokenizer(strLine, " ");
				while (tokenizer.hasMoreTokens()) {

					count++;
					strLine = tokenizer.nextToken();
					Pattern patternForArray = Pattern.compile("\\w+\\[.*");

					Matcher matcherForArray = patternForArray.matcher(strLine);

					boolean foundforArray = false;
					while (matcherForArray.find()) {
						foundforArray = true;
					}

					if (foundforArray == true) {
						count = count-1;
						String[] temp = null;
						temp = strLine.split("\\[");
						temp[1] = "[" + temp[1];
						for (int i = 0; i < temp.length; i++) {
							count++;

							listOfEachTypeDef.add(temp[i]);
						}
					} else {
						listOfEachTypeDef.add(strLine);
					}

				}

				int c = listOfEachTypeDef.indexOf("struct");

				out.write("\t"
						+ "<complexType name="
						+ "\""
						+ ((String) listOfEachTypeDef.get(c + 1)).substring(0,
								((String) listOfEachTypeDef.get(c + 1))
										.length() - 5) + "\">\r\n");
				out.write("\t\t" + "<sequence>\r\n");

				int lastcount = 0;
				for (int k = 0; k < count; k++) {
					String inputs = (String) listOfEachTypeDef.get(k);
					Pattern patterns = Pattern.compile(".*\\;\\s+\\}");
					Matcher matchers = patterns.matcher(inputs);

					boolean founds = false;
					while (matchers.find()) {

						founds = true;
					}
					if (founds) {
						lastcount = listOfEachTypeDef.indexOf(inputs);
					}
				}
				int z = 2;

				do {

					Pattern pattern = Pattern.compile("\\[.*?\\]");
					String input = (String) listOfEachTypeDef.get(c + z + 2);
					Matcher matcher = pattern.matcher(input);

					boolean found = false;
					while (matcher.find()) {

						found = true;
					}

					if (found == true) {

						int i = listFromDataTypes.indexOf(input.trim());

						int j = ((String) listFromDataTypes.get(i + 1))
								.indexOf("\n");
						String s1 = null;
						if (j != -1) {
							s1 = ((((String) listFromDataTypes.get(i + 1))
									.trim()).substring(0, j))
									+ "];";

						} else {
							s1 = (String) listFromDataTypes.get(i + 1);
						}
						listOfEachTypeDef.set(c + z + 2, s1);

						out.write("\t\t\t" + "<element type=" + "\""
								+ listOfEachTypeDef.get(c + z) + "\""
								+ " name=" + "\"");
						z = z + 1;
						out.write((((String) listOfEachTypeDef.get(c + z))
								.trim())
								.substring(0, (((String) listOfEachTypeDef
										.get(c + z)).trim()).length())
								+ "\"" + " size=" + "\"");

						if (listOfEachTypeDef
								.indexOf((String) listOfEachTypeDef.get(c + z
										+ 1)) == lastcount) {

							String s2 = (input.trim()).substring(0, (input
									.trim()).length() - 2);

							int k = listFromDataTypes.indexOf(s2);
							if(k==-1) {
								System.out.println("---> "+fileName+" <--- "+ s2);
								
							}

							int p = ((String) listFromDataTypes.get(k + 1))
									.indexOf("\n");
							String s3 = null;
							if (p != -1) {
								s3 = ((((String) listFromDataTypes.get(k + 1))
										.trim()).substring(0, p))
										+ "];";

							} else {
								s3 = (String) listFromDataTypes.get(k + 1);
							}

							listOfEachTypeDef.set(c + z + 1, s3);

							out
									.write((((String) listOfEachTypeDef.get(c
											+ z + 1)).trim())
											.substring(
													1,
													(((String) listOfEachTypeDef
															.get(c + z + 1))
															.trim()).length() - 2)
											+ "\"" + "/>\r\n");
						} else {

							out
									.write((((String) listOfEachTypeDef.get(c
											+ z + 1)).trim())
											.substring(
													1,
													(((String) listOfEachTypeDef
															.get(c + z + 1))
															.trim()).length() - 2)
											+ "\"" + "/>\r\n");
						}

					} else {
						out.write("\t\t\t" + "<element type=" + "\""
								+ listOfEachTypeDef.get(c + z) + "\""
								+ " name=" + "\"");

						if (listOfEachTypeDef
								.indexOf((String) listOfEachTypeDef.get(c + z
										+ 1)) == lastcount) {
							out
									.write((((String) listOfEachTypeDef.get(c
											+ z + 1)).trim())
											.substring(
													0,
													(((String) listOfEachTypeDef
															.get(c + z + 1))
															.trim()).length() - 3)
											+ "\"" + "/>\r\n");
						} else {

							out
									.write((((String) listOfEachTypeDef.get(c
											+ z + 1)).trim())
											.substring(
													0,
													(((String) listOfEachTypeDef
															.get(c + z + 1))
															.trim()).length() - 1)
											+ "\"" + "/>\r\n");
						}

					}

					z = z + 2;
				} while (z <= lastcount);

				out.write("\t\t" + "</sequence>\r\n");
				out.write("\t" + "</complexType>\r\n");

				listOfEachTypeDef.clear();
				count = 0;

			}

			out.write("</struct>\r\n");

			out.flush(); // Don't forget to flush!
			out.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}

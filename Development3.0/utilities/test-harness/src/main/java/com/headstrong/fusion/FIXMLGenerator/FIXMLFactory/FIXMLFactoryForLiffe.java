/**
 * 
 */
package com.headstrong.fusion.configGenerator.FIXMLGenerator.FIXMLFactory;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;

/**
 * @author mtiwari
 * 
 */
public class FIXMLFactoryForLiffe extends FIXMLFactory {

	@Override
	public String fixmlString(List<Map> bindingList, String rootElement) {
		Document finalDoc = prepareDocument(rootElement, bindingList);
//		printXML(finalDoc);

		return null;

	}

	private String prepareString(String strElement) {
		String str = "message.value.";
		int len = str.length();
		strElement = strElement.substring(len);
		return strElement;

	}

	private Document prepareDocument(String rootElement, List<Map> bindingList) {
		Document testDataDoc = null;
		try {
			testDataDoc = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder().newDocument();

			Element fixml = testDataDoc.createElement("FIXML");
			Element rootEle = testDataDoc.createElement(rootElement);
			Element newEle = null;
			Element newEle1 = null;
			Map<String, Integer> mp = new HashMap<String, Integer>();
			for (Map outputList : bindingList) {
				String strElement = outputList.get("InsertLocation").toString();
				String str1 = outputList.get("Set1").toString();
				String strEle = null;
				String strAtt = null;
				String strNextEle = null;

				String newStr = prepareString(strElement);
				if (!newStr.contains(".") && !newStr.contains("[")) {
					rootEle.setAttribute(newStr, str1);
				} else if (newStr.contains(".") && !newStr.contains("[")) {
					String[] split = newStr.split("\\.");
					int len = split.length;
					if (len > 2) {
						strEle = split[0];
						strNextEle = split[1];
						strAtt = split[2];
						if (!mp.containsKey(strEle)) {
							newEle = testDataDoc.createElement(strEle);
							mp.put(strEle, 1);
						}
						if (!mp.containsKey(strNextEle)) {
							newEle1 = testDataDoc.createElement(strNextEle);
							mp.put(strNextEle, 1);
						}
						newEle1.setAttribute(strAtt, str1);
						newEle.appendChild(newEle1);
						rootEle.appendChild(newEle);
					} else {
						strEle = split[0];
						strAtt = split[1];
						if (!mp.containsKey(strEle)) {
							newEle = testDataDoc.createElement(strEle);
							mp.put(strEle, 1);
						} else {
							NodeList eleByTagName = rootEle
									.getElementsByTagName(strEle);
							Element itemEle = (Element) eleByTagName.item(0);
							newEle = itemEle;
						}
						newEle.setAttribute(strAtt, str1);
						rootEle.appendChild(newEle);
					}

				} else if (newStr.contains(".") && newStr.contains("[")) {
					String[] split = newStr.split("\\.");

					if (split.length > 2) {
						String aStr = split[0];
						if (!mp.containsKey(aStr)) {
							newEle1 = testDataDoc.createElement(aStr);
							mp.put(aStr, 1);
						} else {
							NodeList eleByTagName = rootEle
									.getElementsByTagName(aStr);
							Element itemEle = (Element) eleByTagName.item(0);
							newEle1 = itemEle;
						}
						String str = split[1];
						String att = split[2];
						String s = str.substring(str.indexOf("[") + 1, str
								.indexOf("="));
						String val = str.substring(str.indexOf("=") + 1, str
								.indexOf("]"));
						String strNewElement = str.substring(0, str
								.indexOf("["));
						newEle = testDataDoc.createElement(strNewElement);
						newEle.setAttribute(att, str1);
						newEle.setAttribute(s, val);
						newEle1.appendChild(newEle);
						rootEle.appendChild(newEle1);

					} else {
						String str = split[0];
						String att = split[1];
						String s = str.substring(str.indexOf("[") + 1, str
								.indexOf("="));
						String val = str.substring(str.indexOf("=") + 1, str
								.indexOf("]"));
						String strNewElement = str.substring(0, str
								.indexOf("["));
						newEle = testDataDoc.createElement(strNewElement);
						newEle.setAttribute(att, str1);
						newEle.setAttribute(s, val);
						rootEle.appendChild(newEle);
					}
				}

			}
			fixml.appendChild(rootEle);
			testDataDoc.appendChild(fixml);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return testDataDoc;

	}

//	private void printXML(Document testDataDoc) {
//		OutputFormat format = new OutputFormat(testDataDoc);
//		StringWriter stringOut = new StringWriter();
//		XMLSerializer serial = new XMLSerializer(stringOut, format);
//		try {
//			serial.asDOMSerializer();
//			serial.serialize(testDataDoc.getDocumentElement());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("FIXML ->" + stringOut.toString());
//	}
}

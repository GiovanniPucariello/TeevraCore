/**
 * 
 */
package com.headstrong.fusion.configGenerator.core.euronext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ssoni
 * 
 */
public class XmlConfigGeneratorFactory {
	private static Map<XmlConfigType, XmlConfigGenerator> xmlConfigGeneratorMap = new HashMap<XmlConfigType, XmlConfigGenerator>();

	static {
		addXmlConfigGenerator(XmlConfigType.Formatter, new ConfigGeneratorForFormatter());
	}
	/**
	 * Adds a new XML Config Generator.
	 * @param xmlConfigType
	 * @param xmlConfigGenerator
	 */
	public static void addXmlConfigGenerator(XmlConfigType xmlConfigType,
			XmlConfigGenerator xmlConfigGenerator) {
		xmlConfigGeneratorMap.put(xmlConfigType, xmlConfigGenerator);
	}

	/**
	 * 
	 * @param xmlConfigType
	 * @return
	 */
	public static XmlConfigGenerator getXmlConfigGenerator(
			XmlConfigType xmlConfigType) {
		return xmlConfigGeneratorMap.get(xmlConfigType);
	}

	public static enum XmlConfigType {
		Parser, Formatter
	}

}

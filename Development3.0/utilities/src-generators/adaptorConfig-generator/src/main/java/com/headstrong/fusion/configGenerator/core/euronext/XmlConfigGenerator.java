/**
 * 
 */
package com.headstrong.fusion.configGenerator.core.euronext;

import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory;

/**
 * @author Ssoni
 * 
 */
public interface XmlConfigGenerator {
	/**
	 * Generates a configuration xml file for individual sheet.
	 * 
	 * @param sheetName Sheet Name
	 * @param sheetDataFactory 
	 * @throws Exception
	 */
	public void generateXmlConfig(String sheetName,
			TableDataFactory sheetDataFactory) throws Exception;
}

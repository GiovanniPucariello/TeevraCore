package com.headstrong.fusion.configGenerator.core.euronext;

import java.util.List;

import com.headstrong.fusion.configGenerator.core.GeneratorProcessor;
import com.headstrong.fusion.configGenerator.core.PropertyManager;
import com.headstrong.fusion.configGenerator.core.GeneratorProcessorFactory.Module;
import com.headstrong.fusion.configGenerator.dataFactory.StaticDataFactory;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Constants;

/**
 * Processes the and generates configuration xml for {@link Module} Euronext.
 * 
 */
public class GeneratorProcessorForEuroNext implements GeneratorProcessor {

	/**
	 * sheet name starting with 1 contains formatter configuration.
	 */
	private static final String FORMATTER_SHEET_REGEX = "1";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.configGenerator.core.GeneratorProcessor#process()
	 */

	public void process() throws Exception {
		// Get the list of sheets from the factory.
		StaticDataFactory staticDataFactory = StaticDataFactory
				.getFactory(PropertyManager.getInstance().getProperties());
		List<String> sheetNames = staticDataFactory.getMessageName();
		ConfigGeneratorForFormatter confFormatter = new ConfigGeneratorForFormatter();
		ConfigGeneratorForParser confParser = new ConfigGeneratorForParser();
		// loop through the sheets.
		for (String sheetName : sheetNames) {
			String sName = sheetName.substring(0, sheetName.length() - 1);
			String property = PropertyManager.getInstance().getProperty(
					Constants.DATABASE_URL).toString();
			TableDataFactory sheetDataFactory = TableDataFactory.getFactory(
					sheetName, property);
			if (sName.startsWith(FORMATTER_SHEET_REGEX)) {
				confFormatter.generateXmlConfig(sheetName, sheetDataFactory);
			} else {
				confParser.generateXmlConfig(sheetName, sheetDataFactory);
			}
		}
	}

}

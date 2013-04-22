package com.headstrong.fusion.configGenerator.core;

import java.sql.Connection;
import java.util.List;
import java.util.Properties;

import javax.xml.bind.JAXBException;

import com.headstrong.fusion.configGenerator.dataFactory.DataException;
import com.headstrong.fusion.configGenerator.dataFactory.StaticDataFactory;
import com.headstrong.fusion.configGenerator.dataFactory.StaticDataFactoryForTestAutomation;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory;

public class GeneratorProcessorForTestAutomation implements GeneratorProcessor {

	StaticDataFactory staticDataFactory;
	Properties props;
	Connection con = StaticDataFactoryForTestAutomation.getCon();

	public GeneratorProcessorForTestAutomation(Properties p) {
		staticDataFactory = StaticDataFactory.getFactory(p);
		this.props = p;
		// We now have a factory.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.configGenerator.core.GeneratorProcessor#process()
	 */

	public void process() {
		try {
			loopSheets();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private void loopSheets() throws JAXBException {
		// Get the list of sheets from the factory.
		List<String> sheetNames = staticDataFactory.getMessageName();

		// loop through the sheets.
		for (String sheetName : sheetNames) {
			try {

				String sName = null;
				String property = props.getProperty(Constants.DATABASE_URL);
				TableDataFactory sheetDataFactory = TableDataFactory
						.getFactory(sheetName, property);

				sName = sheetName.substring(0, sheetName.length() - 1);


			} catch (DataException e) {
				e.printStackTrace();
			}
		}
	}

}

package com.headstrong.fusion.configGenerator.core.liffe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import com.headstrong.fusion.configGenerator.core.GeneratorProcessor;
import com.headstrong.fusion.configGenerator.core.PropertyManager;
import com.headstrong.fusion.configGenerator.dataFactory.DataException;
import com.headstrong.fusion.configGenerator.dataFactory.StaticDataFactory;
import com.headstrong.fusion.configGenerator.dataFactory.DefaultStaticDataFactory;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactoryForLiffe.QUERY_TYPES_LIFFE;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Binding;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Configuration;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Constants;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.FormatterConfig;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Mappings;

public class GeneratorProcessorForLiffe implements GeneratorProcessor {

	StaticDataFactory staticDataFactory;
	static Properties props;
	Connection con = DefaultStaticDataFactory.getCon();

	public GeneratorProcessorForLiffe() {
		GeneratorProcessorForLiffe.props = PropertyManager.getInstance()
				.getProperties();
		staticDataFactory = StaticDataFactory.getFactory(props);
		GeneratorProcessorForLiffe.props = props;
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

				if (sName.startsWith(Constants.P)) {
					ConfigFormatterForLiffe confFormatter = new ConfigFormatterForLiffe(
							props);
					confFormatter.generateConfigForFormatter(sheetName,
							sheetDataFactory);
				} else if (sName.startsWith(Constants.V)) {
					ConfigParserForLiffe confParser = new ConfigParserForLiffe(
							props);
					confParser.generateConfigForParser(sheetName,
							sheetDataFactory);
				}

			} catch (DataException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * This method is used to generate the configuration file with the help of
	 * JAXB.
	 * 
	 * @param sName
	 * @param q
	 * @param configuration
	 * @param binding
	 * @param mapping
	 * @param keyList
	 * @throws JAXBException
	 * @throws PropertyException
	 */
	public static void generateConfig(String sName, QUERY_TYPES_LIFFE q,
			Configuration configuration, Binding binding, Mappings mapping)
			throws JAXBException, PropertyException {
		String xmlName;
		JAXBContext context = null;
		try {
			context = JAXBContext.newInstance(Configuration.class);
		} catch (JAXBException e) {
			throw e;
		}
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		FormatterConfig formatterConfig = new FormatterConfig();
		formatterConfig.setSchema(sName);
		configuration.setBinding(binding);
		configuration.setMappings(mapping);
		xmlName = props.getProperty(Constants.OUTPUT_LOCATION) + sName + "//"
				+ q.getVal() + Constants.DOT_XML;
		File xmlFile = new File(xmlName);
		File dir = xmlFile.getParentFile();
		if (false == xmlFile.exists()) {
			dir.mkdir();
		}
		try {
			xmlFile.createNewFile();
			marshaller.marshal(configuration, new FileWriter(xmlFile));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

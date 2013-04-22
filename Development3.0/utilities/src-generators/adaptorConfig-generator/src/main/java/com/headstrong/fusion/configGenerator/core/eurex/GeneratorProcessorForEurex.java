package com.headstrong.fusion.configGenerator.core.eurex;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.headstrong.fusion.configGenerator.commObjs.FixMLConfigurationElement;
import com.headstrong.fusion.configGenerator.core.GeneratorProcessor;
import com.headstrong.fusion.configGenerator.core.PropertyManager;
import com.headstrong.fusion.configGenerator.dataFactory.DataException;
import com.headstrong.fusion.configGenerator.dataFactory.StaticDataFactory;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactoryForEurex.QUERY_TYPES;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.ConfigHeader;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.Configuration;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.ObjectFactory;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.Predicate;

/**
 * Works on Eurex specific data.
 * 
 * @see com.headstrong.fusion.configGenerator.core.GeneratorProcessor
 * @author satyaukv
 */

public class GeneratorProcessorForEurex implements GeneratorProcessor {

	StaticDataFactory staticDataFactory;
	Properties props;
	ObjectFactory objFactory = new ObjectFactory();
	public static final String FIXML_TAGS_COL_HEADER = "FIXML tags";
	public static final String RULES_COL_HEADER = "Rules";
	public static final String FIXML_DATA_TYPE = "FIXML Data Type";

	public static final String STR_REQUEST = "REQUEST";
	public static final String STR_RESPONSE = "RESPONSE";
	public static final String STR_COUNTER_RESPONSE = TransformtoView.STR_COUNTER_RESPONSE;

	public static final String XML_EXTENSION = ".xml";
	private static final String XML_FOLDERNAME_REQUEST = "src/main/resources/generated xml's/request/";
	private static final String XML_FOLDERNAME_RESPONSE = "src/main/resources/generated xml's/response/";
	private static final String XML_FOLDERNAME_REQFORRES = "src/main/resources/generated xml's/reqforres/";

	public GeneratorProcessorForEurex() {
		this.props = PropertyManager.getInstance().getProperties();
		staticDataFactory = StaticDataFactory.getFactory(this.props);
		// We now have a factory.
	}

	/*
	 * This method is used to loop over all the sheets and generate XMLs
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.configGenerator.core.GeneratorProcessor#process()
	 */

	public void process() {
		// Get the list of sheets from the factory.
		List<String> sheetNames = staticDataFactory.getMessageName();
		for (String sheetName : sheetNames) {
			if (sheetName.startsWith("Cover")) {
				continue;
			}
			processWorkSheet(sheetName);
		}
		// Closing staticDataFactory connection
		staticDataFactory.closeConection();
	}

	/**
	 * Process each worksheet, convert it into three XMLs - request, response
	 * and counter-response.
	 * 
	 * @param sheetName
	 */
	private void processWorkSheet(String sheetName) {
		try {

			Configuration requestConfiguration = objFactory
					.createConfiguration();
			Configuration responseConfiguration = objFactory
					.createConfiguration();
			Configuration counterResponseConfiguration = objFactory
					.createConfiguration();
			// Setting the ConfigHeader for the Configuration object

			Set<String> sheetNameList = new HashSet<String>();
			EurexTableDataDecorator eurexTableDataHelper = new EurexTableDataDecorator(
					sheetName, props);
			sheetName = sheetName.substring(0, sheetName.length() - 1);
			// Loop over QUERY TYPES for a particular sheet
			for (QUERY_TYPES queryType : QUERY_TYPES.values()) {
				String queryString = queryType.getStr();
				List<Map> fixToCMappingPair = eurexTableDataHelper
						.getMappingPair(queryString);
				if (fixToCMappingPair == null) {
					continue;
				}
				List<FixMLConfigurationElement> selectorFixTags = eurexTableDataHelper
						.getSelectorData(queryString);
				String parentStrutName = eurexTableDataHelper
						.getParentStrutName(queryString);
				// For each sheet Request , Counter Response and Response should
				// be
				// populated in different XMLs
				if (queryString.contains(STR_REQUEST)) {
					requestConfiguration.getPredicate().addAll(
							createPredicates(fixToCMappingPair, queryString,
									sheetName, selectorFixTags,
									parentStrutName, queryString));
					addSheetName(XML_FOLDERNAME_REQUEST + sheetName,
							sheetNameList, STR_REQUEST);
					counterResponseConfiguration.getPredicate().addAll(
							createPredicates(fixToCMappingPair,
									STR_COUNTER_RESPONSE, sheetName,
									selectorFixTags, parentStrutName,
									queryString));
					addSheetName(XML_FOLDERNAME_REQFORRES + sheetName,
							sheetNameList, STR_COUNTER_RESPONSE);
				} else {
					responseConfiguration.getPredicate().addAll(
							createPredicates(fixToCMappingPair, queryString,
									sheetName, selectorFixTags,
									parentStrutName, queryString));
					addSheetName(XML_FOLDERNAME_RESPONSE + sheetName,
							sheetNameList, STR_RESPONSE);
				}

			}
			writeToOutput(requestConfiguration, responseConfiguration,
					counterResponseConfiguration, eurexTableDataHelper
							.createConfigHeader(), sheetNameList);

		} catch (DataException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create Predicates with the help of TransformtoView class.
	 * 
	 * @param sheetName
	 * @param sheetNameList
	 * @param workSheetDataFactory
	 * @param configType
	 * @param fixToCMappingPair
	 * @param selectorFixTags
	 * @param parentStrutName
	 * @return
	 */
	private List<Predicate> createPredicates(List<Map> fixToCMappingPair,
			String configType, String sheetName,
			List<FixMLConfigurationElement> selectorFixTags,
			String parentStrutName, String qyeryType) {
		TransformtoView viewCreator = new TransformtoView(fixToCMappingPair,
				configType, sheetName, selectorFixTags, parentStrutName,
				qyeryType);
		return viewCreator.getPredicates();
	}

	/**
	 * @param sheetName
	 * @param sheetNameList
	 */
	private void addSheetName(String sheetName, Set<String> sheetNameList,
			String type) {
		String xmlName = sheetName + "-" + type + XML_EXTENSION;
		sheetNameList.add(xmlName);
	}

	/**
	 * Write Files to Output.
	 * 
	 * @param config -
	 *            Request Config.
	 * @param configResponse -
	 *            Response Config.
	 * @param configReqforRes -
	 *            Counter Response Config.
	 * @param configheader
	 * @param sheetNameList -
	 *            list of sheetNames to be output.
	 */
	private void writeToOutput(Configuration config,
			Configuration configResponse, Configuration configReqforRes,
			ConfigHeader configheader, Set<String> sheetNameList) {
		String contents;
		try {
			OutputStreamWriter outWriter = null;
			for (String sheetName : sheetNameList) {
				// Getting the Configuration object as a String
				OutputStream bout = new BufferedOutputStream(
						new FileOutputStream(sheetName));
				outWriter = new OutputStreamWriter(bout, "8859_1");
				if (sheetName.contains(STR_REQUEST)) {
					contents = getXMLStream(config, configheader,
							"FIXMLToCStruct");
				} else if (sheetName.contains(STR_COUNTER_RESPONSE)) {
					contents = getXMLStream(configReqforRes, configheader,
							"FIXMLToCStruct");
				} else if (sheetName.contains(STR_RESPONSE)) {
					contents = getXMLStream(configResponse, configheader,
							"CStructToFIXML");
				} else {
					continue;
				}
				outWriter.write(contents);
				outWriter.flush(); // Don't forget to flush!
			}
			outWriter.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create an XML Stream by setting object properties first.
	 * 
	 * @param configReqforRes
	 * @param configheader
	 * @param counterRequestPredicates
	 * @return
	 */
	private String getXMLStream(Configuration configReqforRes,
			ConfigHeader configheader, String transformationType) {
		configheader.setTransformationType(transformationType);
		configReqforRes.setConfigHeader(configheader);
		String s = configReqforRes.toXML();
		return s;
	}

}

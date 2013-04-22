package com.headstrong.fusion.configGenerator.dataFactory;

import java.util.List;
import java.util.Map;

public abstract class TableDataFactory {

	public static TableDataFactory getFactory(String sheetName, String property) {
		if (property.contains("liffe")) {
			return new TableDataFactoryForLiffe(sheetName);
		} else if(property.contains("Euronext")) {
			return new TableDataFactoryForEuroNext(sheetName);
		} else {
			return new TableDataFactoryForEurex(sheetName);
		}
	}

	/**
	 * Returns Data based on query string.
	 * 
	 * @param sheetName -
	 *            Name of the sheet to be queried.
	 * @param selectionString -
	 *            Name of the message subtype requested.
	 * @return - List representation of the table with each map having column
	 *         name as the key.
	 */
	public abstract List<Map> getQueryData(String selectionString);

	/**
	 * Return a Map with Key as message type and value as Column Name of FIXML
	 * Tags
	 * 
	 * @return
	 */
	public abstract Map getColumnName(String messageType);

	/**
	 * Returns a Map with message type as key and Parent Structure as Value
	 * 
	 * @return
	 */
	public abstract Map getParentStrutName();

	/**
	 * Returns a Map with excel sheet name as key and Request ID as value.
	 * 
	 * @return
	 */
	public abstract Map getRequestID();

}

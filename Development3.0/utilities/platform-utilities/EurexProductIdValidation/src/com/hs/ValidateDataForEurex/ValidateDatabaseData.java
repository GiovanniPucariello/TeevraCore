package com.hs.ValidateDataForEurex;

import java.util.Map;
import java.util.Map.Entry;

/**
 * Class to validate length of a data inserted into database
 * 
 * 
 * @author NBagchi
 */
public class ValidateDatabaseData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Load the JDBC properties from fusion.properties
		ConfigurationProperties properties = new ConfigurationProperties(
				new ConfigReader().getConfiguration());

		// Invoke the connection manager
		DatabaseManager dbManager = new DatabaseManager(properties);

		// Execute update stmt - for preparint the underlying data
		if (!("".equals(properties.getUpdateStmt().trim()))) {
			dbManager.executeUpdate(properties.getUpdateStmt());
		}

		// Query data
		Map<String, Integer> columnValues = dbManager.fetchData(properties
				.getSelectQuery());

		// Display column values and len
		displayResult(columnValues);

		// Close the connection
		dbManager.close();
	}

	/**
	 * Displays the result of the program: <Column Value> - <Length of Column
	 * Value>
	 * 
	 * @param columnValues
	 */
	private static void displayResult(Map<String, Integer> columnValues) {
		System.out.println("Column values and their lengths");
		for (Entry<String, Integer> val : columnValues.entrySet()) {
			System.out.println(val.getKey() + " - " + val.getValue());
		}
	}

}

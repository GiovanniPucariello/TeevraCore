package com.headstrong.fusion.configGenerator.dataFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.headstrong.fusion.configGenerator.viewObjects.liffe.Constants;

/**
 * Reads the excel and seperates into modules in different subtable.
 * 
 * @author mtiwari
 * 
 */
public class TableDataFactoryForEuroNext extends TableDataFactory {

	Connection con = DefaultStaticDataFactory.getCon();
	List<Map> totalData;
	List readRange;
	private final static int ELEMENT_SEPERATORS = 2;
	String sheetName;

	/**
	 * Indicates if the class has been initialised for this sheet.
	 */
	public TableDataFactoryForEuroNext(String sheetName) {
		this.sheetName = sheetName;
		totalData = getData();
	}

	/**
	 * Populates metadata, i.e. start and end positions for all tables in this
	 * sheet.
	 * 
	 * @return - List with subtype, its start and end positions in consecutive
	 *         elements.
	 */
	private List populatePlaceHolders() {
		// fill the map with metadata for this sheet.
		List<String> lis = new LinkedList<String>();
		List startAndEndPositions = new LinkedList();

		// Runs sheet by sheet and generates the range of sub-tables in the
		// excel.
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from [" + sheetName
					+ "]");

			int count = 0;
			boolean endOfSubtableFound = false;
			while (rs.next()) {
				String lname = rs.getString(1);

				if (null != lname) {
					lname = lname.trim();
				}
				String fname = rs.getString(2);
				String data = rs.getString(3);
				String FixML = rs.getString(7);
				count++;
				lis.add(lname);
				if (lname != null) {
					lname = lname.trim();
					if ((lname.startsWith(Constants.FROM))) {
						// startAndEndPositions.add(lis.get(count - 2));
						startAndEndPositions.add(count);
						endOfSubtableFound = true;
					}
				}
				if (fname == null && lname == null && data == null
						&& FixML == null && endOfSubtableFound) {
					startAndEndPositions.add(count);
					endOfSubtableFound = false;
				}

			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new DataException(
					"Exception executing queries on sheet Named " + sheetName
							+ ". Terminating.", e);
		}
		if ((startAndEndPositions.size() % ELEMENT_SEPERATORS) != 0) {
			startAndEndPositions.add(100);
		}
		return startAndEndPositions;
	}

	/**
	 * This method is used to get the data of subtable.
	 * 
	 * @return Map - key as subtable name and list of Map as value.
	 */
	private List<Map> getData() {
		Map<String, List<Map>> messageTableMap = new LinkedHashMap();
		Statement stmt = null;
		ResultSet rs = null;
		readRange = populatePlaceHolders();
		List<Map> subTableData = null;
		int numberOfSubtables = (readRange.size() / ELEMENT_SEPERATORS);
		for (int numofMsgTypes = 0; numofMsgTypes < numberOfSubtables; numofMsgTypes++) {
			subTableData = new ArrayList<Map>();
			int queryStartEnd = numofMsgTypes * ELEMENT_SEPERATORS;
			Integer start = (Integer) readRange.get(queryStartEnd) + 1;
			Integer end = (Integer) readRange.get(queryStartEnd + 1);
			String newFixmlTag = null;
			try {
				stmt = con.createStatement();
				rs = stmt.executeQuery("select * from [" + sheetName + "A"
						+ start + ":H" + end + "]");

				while (rs.next()) {
					Map<String, String> rowData = new LinkedHashMap<String, String>();
					String strFrom = rs.getString(1);
					String newStrFrom = null;
					if (null != strFrom) {
						int intFrom = (int) Double.parseDouble(strFrom);
						newStrFrom = Integer.toString(intFrom);
					}
					String strTo = rs.getString(2);
					String newStrTo = null;
					if (null != strTo) {
						int intTo = (int) Double.parseDouble(strTo);
						newStrTo = Integer.toString(intTo);
					}
					String fixmlTags = rs.getString(8);
					if (fixmlTags != null
							&& fixmlTags.contains(Constants.AT_RATE)) {
						fixmlTags = fixmlTags.trim();
						if (fixmlTags.contains(Constants.NEXT_LINE)) {
							fixmlTags = fixmlTags.replace(Constants.NEXT_LINE,
									Constants.HASH);
						}
					}
					String strType = rs.getString(6);
					String strField = rs.getString(3);
					String mandatory = rs.getString(4);
					rowData.put(Constants.FROM, newStrFrom);
					rowData.put(Constants.TO, newStrTo);
					rowData.put(Constants.FIELD, strField);
					if (fixmlTags != null
							&& fixmlTags.contains(Constants.AT_RATE)) {
						rowData.put(Constants.FIXML, fixmlTags);
					}
					if (strType != null) {
						if (strType.contains(Constants.NEXT_LINE)) {
							strType = strType.replace(Constants.NEXT_LINE,
									Constants.HASH);
						}
						rowData.put(Constants.FORMAT, strType);
					}
					if (sheetName.startsWith("1")) {
						rowData.put("Mandatory", mandatory);
					}
					subTableData.add(rowData);
				}
				rs.close();
				stmt.close();

			} catch (SQLException e) {
				throw new DataException("Could not read sheet named "
						+ sheetName + ".", e);
			}

		}
		return subTableData;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory#getColumnName()
	 */
	public Map<String, String> getColumnName(String columnName) {
		Map<String, String> formatterMap = new LinkedHashMap<String, String>();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from [" + sheetName
					+ "]");

			while (rs.next()) {
				String fName = rs.getString(1);
				if (null != fName && fName.contains("Condition")) {
					String valName = rs.getString(2);
					valName = valName.replace("\n", "#");
					int indexOfField = valName.indexOf("@");
					int nextindex = valName.indexOf("(=");
					int newIndex = valName.indexOf(")");
					String strKey = valName.substring(indexOfField + 1,
							nextindex);
					String strValue = valName
							.substring(nextindex + 2, newIndex);
					formatterMap.put(sheetName, strKey);
					formatterMap.put(sheetName, strValue);
				}
			}
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			throw new DataException(
					"Exception executing queries on sheet Named " + sheetName
							+ ". Terminating.", e);
		}
		return formatterMap;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory#getParentStrutName()
	 */
	public Map getParentStrutName() {
		return null;

	}

	/*
	 * This method is used to get the root tag of the sheet (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory#getRequestID()
	 */
	public Map<String, String> getRequestID() {
		Map<String, String> fixTag = new LinkedHashMap<String, String>();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from [" + sheetName
					+ "]");

			int count = 0;
			while (rs.next()) {
				String lname = rs.getString(1);
				String fName = rs.getString(2);

				if (lname != null) {
					if (lname.contains("FIXML Message")) {
						fixTag.put(sheetName, fName);
					}
					count++;
				}
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new DataException("Could not read sheet named " + sheetName
					+ ".", e);
		}
		return fixTag;

	}

	@Override
	public List<Map> getQueryData(String selectionString) {
		return totalData;
	}

}

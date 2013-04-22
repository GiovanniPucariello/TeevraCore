package com.headstrong.fusion.configGenerator.dataFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.headstrong.fusion.FIXMLGenerator.FIXMLFactory.FIXMLFactory;
import com.headstrong.fusion.FIXMLGenerator.FIXMLFactory.FIXMLFactoryForLiffe;
import com.headstrong.fusion.FLGenerator.FLFactory.FixedLengthFactory;

/**
 * Reads the excel and seperates into modules in different subtable.
 * 
 * @author mtiwari
 * 
 */
public class TableDataFactoryForTestAutomation extends TableDataFactory {

	Connection con = StaticDataFactoryForTestAutomation.getCon();
	Map<String, List<Map>> totalData;
	List readRange;
	private final static int ELEMENT_SEPERATORS = 3;
	String sheetName;

	/**
	 * Indicates if the class has been initialised for this sheet.
	 */
	public TableDataFactoryForTestAutomation(String sheetName) {
		this.sheetName = sheetName;

		totalData = getData();
		Map<String, String> rootTag = getRequestID();
		String str = rootTag.entrySet().toString();
		String strRootElement = str.substring(str.indexOf("=")+1, str.indexOf("]"));
		Set<String> keySet = totalData.keySet();
		int size = keySet.size();
		Iterator it = keySet.iterator();
		List<Map> list = totalData.get("Input Data");
		FixedLengthFactory fixedLengthFactorForLiffe = FixedLengthFactory
				.getFactor("Liffe");
		String Fl = fixedLengthFactorForLiffe.fixedLenghtString(list);
		System.out.println("Fixed length string is=>" + Fl);
		List<Map> outputList = totalData.get("Output Data");
		FIXMLFactory fixmlFactoryForLiffe = FIXMLFactoryForLiffe.getFactory("Liffe");
		fixmlFactoryForLiffe.fixmlString(outputList,strRootElement);
		

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
				count++;
				lis.add(lname);
				if (lname != null) {
					lname = lname.trim();
					if ((lname.startsWith("Insertion Location"))) {
						startAndEndPositions.add(lis.get(count - 2));
						startAndEndPositions.add(count);
						endOfSubtableFound = true;
					}
				}
				if (lname == null && endOfSubtableFound) {
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
	private Map<String, List<Map>> getData() {
		Map<String, List<Map>> messageTableMap = new LinkedHashMap();
		Statement stmt = null;
		ResultSet rs = null;
		readRange = populatePlaceHolders();
		int numberOfSubtables = (readRange.size() / ELEMENT_SEPERATORS);
		for (int numofMsgTypes = 0; numofMsgTypes < numberOfSubtables; numofMsgTypes++) {
			List<Map> subTableData = new ArrayList<Map>();
			int queryStartEnd = numofMsgTypes * ELEMENT_SEPERATORS;
			String messageType = (String) readRange.get(queryStartEnd);
			Integer start = (Integer) readRange.get(queryStartEnd + 1) + 1;
			Integer end = (Integer) readRange.get(queryStartEnd + 2);
			String newFixmlTag = null;
			try {
				stmt = con.createStatement();
				rs = stmt.executeQuery("select * from [" + sheetName + "A"
						+ start + ":G" + end + "]");

				while (rs.next()) {
					Map<String, String> rowData = new LinkedHashMap<String, String>();
					String strInsertLoc = rs.getString(1);
					String strLength = rs.getString(2);
					String strIndexLoc = rs.getString(3);
					String strDataType = rs.getString(4);
					String strSet1 = rs.getString(5);
					String strSet2 = rs.getString(6);
					String strSet3 = rs.getString(7);

					rowData.put("InsertLocation", strInsertLoc);
					rowData.put("Length", strLength);
					rowData.put("IndexLocation", strIndexLoc);
					rowData.put("DataType", strDataType);
					rowData.put("Set1", strSet1);
					rowData.put("Set2", strSet2);
					rowData.put("Set3", strSet3);

					subTableData.add(rowData);
				}
				rs.close();
				stmt.close();

			} catch (SQLException e) {
				throw new DataException("Could not read sheet named "
						+ sheetName + ".", e);
			}

			String[] msgTypeParentStrut = messageType.split("\\:");
			messageTableMap.put(msgTypeParentStrut[0].trim(), subTableData);
		}
		return messageTableMap;
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

				count++;
				if (lname != null) {
					if (lname.contains("FIXML Message")) {
						String reqID = fName.substring(
								(fName.indexOf("<") + 1), fName.indexOf(">"));
						fixTag.put(sheetName, reqID);
					}
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
		return null;
	}

	@Override
	public Map getColumnName() {
		return null;
	}

}

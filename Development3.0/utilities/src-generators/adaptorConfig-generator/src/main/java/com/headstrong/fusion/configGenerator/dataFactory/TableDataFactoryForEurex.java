package com.headstrong.fusion.configGenerator.dataFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.headstrong.fusion.configGenerator.commObjs.DTOParserForEurex;

/**
 * Reads the excel and seperates into modules for request response and converts
 * in the form of List of Maps(One Map for each of request/response)
 * 
 * @author sgottemukkala
 * 
 */
public class TableDataFactoryForEurex extends TableDataFactory {

	Connection con = DefaultStaticDataFactory.getCon();
	Map<String, List<Map>> totalData;
	List readRange;
	private final static int ELEMENT_SEPERATORS = 3;
	String sheetName;



	public TableDataFactoryForEurex(String sheetName) {
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
				if (lname != null) {
					lname = lname.trim();
				}
				String fname = rs.getString(2);
				String data = rs.getString(3);
				String FixML = rs.getString(7);
				count++;
				lis.add(lname);
				if (lname != null) {
					lname = lname.trim();
					if ((lname.startsWith("Structure"))) {
						startAndEndPositions.add(lis.get(count - 2));
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
			startAndEndPositions.add(400);
		}
		return startAndEndPositions;
	}

	/**
	 * Gives the Excel Sheet Data in the form of Maps
	 * 
	 * @return
	 */
	private Map<String, List<Map>> getData() {
		Map<String, List<Map>> messageTableMap = new HashMap();
		// Generates place holders(range) for sub-tables(OPTIONS-REQUEST,
		// FUTURES-RESPONSE etc)
		readRange = populatePlaceHolders();
		int numberOfSubtables = (readRange.size() / ELEMENT_SEPERATORS);
		for (int numofMsgTypes = 0; numofMsgTypes < numberOfSubtables; numofMsgTypes++) {
			List<Map> subTableData = new LinkedList<Map>();
			int queryStartEnd = numofMsgTypes * ELEMENT_SEPERATORS;
			String messageType = (String) readRange.get(queryStartEnd);
			Integer start = (Integer) readRange.get(queryStartEnd + 1) + 1;
			Integer end = (Integer) readRange.get(queryStartEnd + 2);
			boolean found = false;
			String key = null;
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from [" + sheetName
						+ "A" + start + ":H" + end + "]");
				while (rs.next()) {
					Map<String, String> rowData = new LinkedHashMap<String, String>();
					String struTure = rs.getString(1);
					if (struTure != null) {
						struTure = struTure.trim();
					}
					String fieldName = rs.getString(2);
					String FIXMLtags = rs.getString(7);
					String format = rs.getString(5);
					String validationType = rs.getString(4);
//					if (messageType.contains("RESPONSE")) {
						try {
							String fixmlDataType = rs.getString(8);
							rowData.put("FIXML Data Type", fixmlDataType);
						} catch (SQLException e) {
							// This table does not have a FIXML DataType column.
						}
//					}
					if (FIXMLtags != null) {
						FIXMLtags = FIXMLtags.trim();
					}
					String dataType = rs.getString(ELEMENT_SEPERATORS);
					rowData.put("Structure", struTure);
					rowData.put("Field", fieldName);
					rowData.put("Data", dataType);
					rowData.put("Format", format);
					rowData.put(DTOParserForEurex.FIXML_STR, FIXMLtags);
					rowData.put("Usage", validationType);
					subTableData.add(rowData);
				}

			} catch (SQLException e) {
				throw new DataException("Could not read sheet named "
						+ sheetName + ".", e);
			}
			String[] msgTypeParentStrut = messageType.split("\\:");
			messageTableMap.put(msgTypeParentStrut[0], subTableData);
		}
		return messageTableMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.fusion.configGenerator.dataFactory.TableDataFactory#
	 * getQueryData(java.lang.String)
	 */
	public List<Map> getQueryData(String selectionString) {
		QUERY_TYPES type = QUERY_TYPES.fromString(selectionString);
		List<Map> returnValue;
		switch (type) {
		case OPTIONS_REQUEST:
			returnValue = totalData.get("OPTIONS-REQUEST");
			break;
		case OPTIONS_RESPONSE:
			returnValue = totalData.get("OPTIONS-RESPONSE");
			break;
		case FUTURES_REQUEST:
			returnValue = totalData.get("FUTURES-REQUEST");
			break;
		case FUTURES_RESPONSE:
			returnValue = totalData.get("FUTURES-RESPONSE");
			break;
		case ERROR_RESPONSE:
			returnValue = totalData.get("ERROR-RESPONSE");
			break;
		default:
			returnValue = null;
			break;
		}
		return returnValue;
	}

	/**
	 * BOILERPLATE
	 * 
	 */

	public enum QUERY_TYPES {
		OPTIONS_REQUEST("OPTIONS-REQUEST"), OPTIONS_RESPONSE("OPTIONS-RESPONSE"), FUTURES_REQUEST(
				"FUTURES-REQUEST"), FUTURES_RESPONSE("FUTURES-RESPONSE"),  ERROR_RESPONSE("ERROR-RESPONSE");

		String str;

		QUERY_TYPES(String str) {
			this.str = str;
		}

		public String getStr() {
			return str;
		}

		public static QUERY_TYPES fromString(String str) {
			for (QUERY_TYPES q : values()) {
				if (str.equals(q.str)) {
					return q;
				}
			}
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.fusion.configGenerator.dataFactory.TableDataFactory#
	 * getColumnName()
	 */
	public Map getColumnName(String columnName) {
		int columnNum = 7;
		if("FIXMLTAGTYPE".equals(columnName)){
			columnNum=8;
		}
		Map columnNameMap = new LinkedHashMap();
		List lis = new LinkedList();
		try {
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("select * from [" + sheetName
					+ "]");

			int count = 0;
			while (rs.next()) {
				String lname = rs.getString(1);
				String fixMlColumnName = rs.getString(columnNum);
				count++;
				if (lname != null) {
					lname = lname.trim();
					if (lname.contains(":")) {
						lname = lname.substring(0, lname.indexOf(":"));
					}
					if ((lname.contains("Structure"))) {
						columnNameMap.put(lis.get(count - 2), fixMlColumnName);
					}
				}
				lis.add(lname);

			}

			rs.close();
			statement.close();
		} catch (SQLException e) {
			throw new DataException("Could not read sheet named " + sheetName
					+ ".", e);
		}
		return columnNameMap;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.fusion.configGenerator.dataFactory.TableDataFactory#
	 * getParentStrutName()
	 */
	public Map getParentStrutName() {
		Map columnNameMap = new LinkedHashMap();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from [" + sheetName
					+ "]");

			int count = 0;
			while (rs.next()) {
				String lname = rs.getString(1);
				if (lname != null) {
					lname = lname.trim();
				}

				count++;
				if (lname != null) {
					if (lname.contains(":")) {
						String[] temp = lname.split("\\:");
						columnNameMap.put(temp[0], temp[1]);
					}
				}
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new DataException("Could not read sheet named " + sheetName
					+ ".", e);
		}
		return columnNameMap;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.fusion.configGenerator.dataFactory.TableDataFactory#
	 * getRequestID()
	 */
	public Map getRequestID() {
		Map requestID = new LinkedHashMap();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from [" + sheetName
					+ "]");

			int count = 0;
			while (rs.next()) {
				String lname = rs.getString(1);
				if (lname != null) {
					lname = lname.trim();
				}
				String reqID = rs.getString(2);

				count++;
				if (lname != null) {
					if (lname.equals("Request ID")) {
						requestID.put(sheetName, reqID);
					}
				}
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new DataException("Could not read sheet named " + sheetName
					+ ".", e);
		}
		return requestID;

	}

}

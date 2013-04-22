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
public class TableDataFactoryForLiffe extends TableDataFactory {

	Connection con = DefaultStaticDataFactory.getCon();
	Map<String, List<Map>> totalData;
	List readRange;
	private final static int ELEMENT_SEPERATORS = 3;
	String sheetName;

	/**
	 * Indicates if the class has been initialised for this sheet.
	 */
	public TableDataFactoryForLiffe(String sheetName) {
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
			startAndEndPositions.add(160);
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
					String fixmlTags = rs.getString(7);
					if (fixmlTags != null
							&& fixmlTags.contains(Constants.AT_RATE)) {
						fixmlTags = fixmlTags.trim();
						int indexOf = fixmlTags.indexOf(Constants.COLON);
						newFixmlTag = fixmlTags.substring(indexOf + 1).trim();
						if (newFixmlTag.contains(Constants.NEXT_LINE)) {
							newFixmlTag = newFixmlTag.replace(
									Constants.NEXT_LINE, Constants.HASH);
						}
					}
					String strType = rs.getString(6);
					String strField = rs.getString(ELEMENT_SEPERATORS);
					String format = rs.getString(4);
					rowData.put(Constants.FROM, newStrFrom);
					rowData.put(Constants.TO, newStrTo);
					rowData.put(Constants.FIELD, strField);
					rowData.put(Constants.FORMAT, format);
					if (fixmlTags != null
							&& fixmlTags.contains(Constants.AT_RATE)) {
						rowData.put(Constants.FIXML, newFixmlTag);
					}
					if (sheetName.startsWith("P")) {
						rowData.put(Constants.DATA_TYPE, strType);
					}
					if (sheetName.startsWith("V")) {
						if (strType != null) {
							if (strType.contains(Constants.NEXT_LINE)) {
								strType = strType.replace(Constants.NEXT_LINE,
										Constants.HASH);
							}
							rowData.put(Constants.DATA_TYPE, strType);
						} 
					}
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
	 * @see com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory#getQueryData(java.lang.String)
	 */
	public List<Map> getQueryData(String selectionString) {
		selectionString = selectionString.trim();
		QUERY_TYPES_LIFFE type = QUERY_TYPES_LIFFE.fromString(selectionString);
		List<Map> returnValue;
		switch (type) {
		case MESSAGE_HEADER:
			returnValue = totalData.get("Message Header");
			break;

		case TRANSACTION_DETAILS:
			returnValue = totalData.get("Transaction Details");
			break;

		case HALF_TRADE_INFORMATION:
			returnValue = totalData.get("Half Trade Information");
			break;

		case HALF_TRADE_ALLOCATION:
			returnValue = totalData.get("Half Trade Allocation");
			break;

		case HALF_TRADE_ASSIGNMENT:
			returnValue = totalData.get("Half Trade Assignment");
			break;

		case RETRIEVAL_QUANTITY:
			returnValue = totalData.get("Retrieval Quantity");
			break;

		case TRADE_STREAM_DETAILS:
			returnValue = totalData.get("Trade Stream Details");
			break;

		case MATCHING_DETAILS:
			returnValue = totalData.get("Matching Details");
			break;

		case POSITION_NOTE_INFORMATION:
			returnValue = totalData.get("Position Note Information");
			break;

		case EXCHANGE_EVENT_TYPE:
			returnValue = totalData.get("Exchange Event Type");
			break;

		case EVENT_SYSTEM_MODE_DETAILS:
			returnValue = totalData.get("Event System Mode Details");
			break;

		case EVENT_LINK_TRANSFER_DETAILS:
			returnValue = totalData.get("Event Link Transfer Details");
			break;

		case EVENT_CONTRACT_DETAILS:
			returnValue = totalData.get("Event Contract Details");
			break;

		case EVENT_MONTH_DETAILS:
			returnValue = totalData.get("Event Month Details");
			break;

		case EVENT_SERIES_DETAILS:
			returnValue = totalData.get("Event Series Details");
			break;

		case STATUS_RECORDS:
			returnValue = totalData.get("Status Record");
			break;

		case POSITION_RECONCILIATION:
			returnValue = totalData.get("Position Reconciliation");
			break;

		case TEXT_RECORD:
			returnValue = totalData.get("Text Record");
			break;

		case HALF_TRADE_STATUS:
			returnValue = totalData.get("Half Trade Status");
			break;

		default:
			returnValue = null;
			break;
		}
		return returnValue;
	}

	public enum QUERY_TYPES_LIFFE {
		MESSAGE_HEADER("Message Header","0000"), TRANSACTION_DETAILS(
				"Transaction Details","0004"), HALF_TRADE_INFORMATION(
				"Half Trade Information","0003"), HALF_TRADE_ALLOCATION(
				"Half Trade Allocation","0007"), HALF_TRADE_ASSIGNMENT(
				"Half Trade Assignment","0008"), RETRIEVAL_QUANTITY(
				"Retrieval Quantity","0001"), TEXT_RECORD(
				"Text Record","0009"), TRADE_STREAM_DETAILS(
				"Trade Stream Details","0016"), POSITION_RECONCILIATION(
				"Position Reconciliation","0101"), STATUS_RECORDS(
				"Status Record","0005"), EVENT_SERIES_DETAILS(
				"Event Series Details","0069"), EVENT_MONTH_DETAILS(
				"Event Month Details","0068"), EVENT_CONTRACT_DETAILS(
				"Event Contract Details","0067"), EVENT_LINK_TRANSFER_DETAILS(
				"Event Link Transfer Details","0062"), EVENT_SYSTEM_MODE_DETAILS(
				"Event System Mode Details","0061"), EXCHANGE_EVENT_TYPE(
				"Exchange Event Type","0060"), POSITION_NOTE_INFORMATION(
				"Position Note Information","0102"), MATCHING_DETAILS(
				"Matching Details","0014"), HALF_TRADE_STATUS("Half Trade Status","0011");

		String str;
		String val;

		QUERY_TYPES_LIFFE(String str,String val) {
			this.str = str;
			this.val = val;
		}

		public String getStr() {
			return str;
		}
		public String getVal() {
			return val;
		}

		public static QUERY_TYPES_LIFFE fromString(String str) {
			for (QUERY_TYPES_LIFFE q : values()) {
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

}

package com.hs.stridehub.config.reader.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.hs.stridehub.config.reader.DataReader;
import com.hs.stridehub.config.reader.DataSet;
import com.hs.stridehub.config.vo.Column;
import com.hs.stridehub.config.vo.DataType;
import com.hs.stridehub.config.vo.Table;

/**
 * Reads the Excel file and generates VO.
 * 
 */
public class ExcelDataReader implements DataReader {

	private static final String CONFIG = "_CONFIG";
	private static final int ACTIVE_TABLES_ROW = 6;
	private static final String TO_UPLOAD = "YES";

	public DataSet<DbSinkConfiguration> readDataSet(File file) throws Exception {
		DataSet<DbSinkConfiguration> dataSet = new DataSet<DbSinkConfiguration>();
		FileInputStream fi = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fi);
		List<Table> tables = new ArrayList<Table>();
		// Read the SINK configuration.
		Sheet configSheet = wb.getSheet(CONFIG);
		dataSet.setSinkConfiguration(this.readSinkConfiguration(configSheet));

		// get list of active tables that need to be uploaded
		List<String> tableNames = getTablesToUpload(configSheet);
		for (String tableName : tableNames) {
			Sheet sheet = wb.getSheet(tableName);
			if (sheet == null)
				continue;
			tables.add(this.readSheet(tableName, sheet, file));
		}

		dataSet.setTables(tables);
		fi.close();
		return dataSet;
	}

	private Table readSheet(String sheetName, Sheet sheet, File excelFile)
			throws Exception {
		Table table = new Table();
		table.setName(sheetName);
		// ASSUMPTION
		// ROW 1 : has column names.
		//
		List<Column> columns = this.readColumns(sheet.getRow(0), sheet
				.getRow(1));
		table.setColumns(columns);

		// read the data for each row starting from row - 3
		List<Map<Column, Object>> data = new ArrayList<Map<Column, Object>>();

		for (int i = 2; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			// Read the cells.

			Iterator<Cell> cells = row.cellIterator();
			Map<Column, Object> rowData = new HashMap<Column, Object>();

			while (cells.hasNext()) {
				Object value = null;
				Cell cell = cells.next();
				DataType dataType = columns.get(cell.getCellNum()).getType();
				int type = cell.getCellType();

				if (type == Cell.CELL_TYPE_BLANK) {
					value = null;
				} else {
					switch (dataType) {
					case NUMBER:
						value = cell.getNumericCellValue();
						break;
					case TEXT:
						value = cell.getRichStringCellValue().getString();
						break;
					case BOOLEAN:
						value = cell.getBooleanCellValue();
						break;
					case DATE:
						value = cell.getDateCellValue();
						break;
					case CLOB:
						String textFromFile = readTextFromFile(cell
								.getRichStringCellValue().getString(),
								excelFile);
						value = textFromFile;
						break;
					default:
						System.out.println("unsupported cell type");
						break;
					}
				}
				// add the data.
				rowData.put(table.getColumns().get(cell.getCellNum()), value);
			}

			data.add(rowData);
		}
		table.setData(data);
		return table;
	}

	/**
	 * Reads the row and creates a column list.
	 * 
	 * @param columnNameRow
	 * @return
	 * @throws Exception
	 */
	private List<Column> readColumns(Row columnNameRow, Row columnTypeRow)
			throws Exception {
		List<Column> columns = new ArrayList<Column>();
		Iterator<Cell> cells = columnNameRow.cellIterator();
		while (cells.hasNext()) {
			Column column = new Column();
			Cell cell = cells.next();
			if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
				column.setName(cell.getRichStringCellValue().getString());
				String dataType = columnTypeRow.getCell(cell.getCellNum())
						.getRichStringCellValue().getString();
				column.setType(DataType.valueOf(dataType));
			} else {
				throw new Exception("Incorrect Column Name/Column Cell Type"
						+ "[" + cell.getRowIndex() + "," + cell.getCellNum()
						+ "]");
			}
			columns.add(column);
		}
		return columns;
	}

	private DbSinkConfiguration readSinkConfiguration(Sheet configSheet) {
		DbSinkConfiguration dbSinkConfiguration = new DbSinkConfiguration();
		dbSinkConfiguration.setDriver(configSheet.getRow(0).getCell(1)
				.getRichStringCellValue().getString());
		dbSinkConfiguration.setUrl(configSheet.getRow(1).getCell(1)
				.getRichStringCellValue().getString());
		dbSinkConfiguration.setUserName(configSheet.getRow(2).getCell(1)
				.getRichStringCellValue().getString());
		dbSinkConfiguration.setPassword(configSheet.getRow(3).getCell(1)
				.getRichStringCellValue().getString());

		return dbSinkConfiguration;
	}

	/**
	 * Reads names of the tables (sheet names) that need to be considered for
	 * this run
	 * 
	 * @param configSheet
	 *            Configuration sheet that contains the table names and if they
	 *            need to be uploaded or not
	 * @return names of the tables which is also same as work sheet names
	 */
	private List<String> getTablesToUpload(Sheet configSheet) {
		List<String> tableNames = new ArrayList<String>();
		int currentRow = ACTIVE_TABLES_ROW;
		while (true) {
			Row row = configSheet.getRow(currentRow);
			if (row == null)
				break;

			Cell cell = row.getCell(0);
			if (cell == null)
				break;

			String tableName = cell.getRichStringCellValue().getString().trim();
			if ("".equals(tableName))
				break;

			if (TO_UPLOAD.equals(configSheet.getRow(currentRow).getCell(1)
					.getRichStringCellValue().getString().trim())) {
				tableNames.add(tableName);
			}
			currentRow++;
		}
		return tableNames;
	}

	public static void main(String[] args) throws Exception {
		// File file = new File(
		// "E:\\Projects\\eclipse
		// workspaces\\testing\\dataLoader\\resources\\tables.xlsx");
		File file = new File("E:\\tables.xlsx");
		DataReader reader = new ExcelDataReader();
		reader.readDataSet(file);
	}

	public String readTextFromFile(String fileName, File excelFile)
			throws Exception {

		System.out.println("inside readTextFromFile--->");
		String line = "";
		StringBuffer sb = new StringBuffer();
		RandomAccessFile raf = null;
		try {

			raf = new RandomAccessFile(new File(excelFile.getParentFile(),
					fileName), "rw");

			while ((line = raf.readLine()) != null) {

				sb.append(line);
			}
		} catch (Exception e) {

			System.out.println("Error while reading the file -->" + fileName);
			throw e;
		} finally {
			if (raf != null) {
				try {
					raf.close();
				} catch (Exception e) {
					System.out
							.println("Error while closing Random Access File");
				}
			}

		}

		return sb.toString();

	}

}

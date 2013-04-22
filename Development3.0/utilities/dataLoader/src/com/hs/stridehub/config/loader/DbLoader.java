/**
 * 
 */
package com.hs.stridehub.config.loader;

import java.io.StringReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Map;

import com.hs.stridehub.config.reader.DataSet;
import com.hs.stridehub.config.reader.excel.DbSinkConfiguration;
import com.hs.stridehub.config.vo.Column;
import com.hs.stridehub.config.vo.DataType;
import com.hs.stridehub.config.vo.Table;

/**
 * @author Ssoni
 * 
 */
public class DbLoader {

	private Connection getConnection(DbSinkConfiguration sinkConfiguration)
			throws ClassNotFoundException, SQLException {
		Connection connection = null;

		// load the driver.
		Class c = Class.forName(sinkConfiguration.getDriver());
		connection = DriverManager.getConnection(sinkConfiguration.getUrl(),
				sinkConfiguration.getUserName(), sinkConfiguration
						.getPassword());

		return connection;
	}

	public void loadData(DataSet<DbSinkConfiguration> dataSet)
			throws ClassNotFoundException, SQLException {

		Connection connection = this.getConnection(dataSet
				.getSinkConfiguration());
		connection.setAutoCommit(false);

		for (Table table : dataSet.getTables()) {
			this.insertRecordsInTable(connection, table);
		}
		connection.commit();
		connection.close();
	}

	private void insertRecordsInTable(Connection connection, Table table)
			throws SQLException, ClassNotFoundException {

		// Create a prepared statement
		String sql = this.createInsertStatement(table);
		PreparedStatement pstmt = connection.prepareStatement(sql);

		for (Map<Column, Object> row : table.getData()) {
			boolean emptyRow = false;
			for (Column column : table.getColumns()) {
				Object value = row.get(column);
				if (value instanceof Date) {
					java.util.Date sourceDate = (Date) value;

					java.sql.Date date = new java.sql.Date(sourceDate.getTime());
					pstmt.setDate(table.getColumns().indexOf(column) + 1, date);
				} else if (column.getType() == DataType.CLOB) {
					StringReader reader1 = new StringReader(value.toString());
					pstmt.setCharacterStream(
							table.getColumns().indexOf(column) + 1, reader1,
							value.toString().length());
				} else {
					if (value == null) {
						if (column.getType() == DataType.TEXT) {
							pstmt.setNull(
									table.getColumns().indexOf(column) + 1,
									java.sql.Types.VARCHAR);
						} else {
							pstmt.setObject(
									table.getColumns().indexOf(column) + 1,
									value);
						}
					} else {
						pstmt.setObject(table.getColumns().indexOf(column) + 1,
								value);
					}

				}
			}
			pstmt.addBatch();
		}
		pstmt.executeBatch();
		pstmt.close();
	}

	private String createInsertStatement(Table table) {
		StringBuffer insert = new StringBuffer();

		insert.append("INSERT INTO ");
		insert.append(table.getName());
		insert.append(" ( ");

		for (Column col : table.getColumns()) {
			insert.append(col.getName());
			insert.append(",");
		}

		insert = new StringBuffer(insert.substring(0, insert.length() - 1));
		insert.append(") VALUES (");

		for (int i = 0; i < table.getColumns().size(); i++) {
			insert.append("?,");
		}
		insert = new StringBuffer(insert.substring(0, insert.length() - 1));
		insert.append(")");
		System.out.println(insert);
		return insert.toString();
	}
}

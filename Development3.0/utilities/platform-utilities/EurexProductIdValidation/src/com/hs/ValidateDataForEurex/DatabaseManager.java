package com.hs.ValidateDataForEurex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Database Manager
 * 
 * @author NBagchi
 * 
 */
public class DatabaseManager {

	private Connection connection;

	DatabaseManager(ConfigurationProperties properties) {
		connect(properties);
	}

	/**
	 * Establish connection.
	 * 
	 * @param jdbcProperties
	 * @return
	 */
	private void connect(ConfigurationProperties configurationProperties) {

		JDBCProperties jdbcProperties = configurationProperties
				.getJDBCProperties();
		String driverClassName = jdbcProperties.getDriverClassName();
		String userName = jdbcProperties.getUserName();
		String password = jdbcProperties.getPassword();
		String url = jdbcProperties.getUrl();

		try {
			Class.forName(driverClassName).newInstance();
			connection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Execute the given update stmt
	 * 
	 * @param connection
	 */
	public void executeUpdate(String updateStmt) {
		Statement statement = null;
		try {
			statement = connection.createStatement();
			statement.executeUpdate(updateStmt);
			System.out.println("Update successful");
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					System.err.println("Unable to close statement");
					e.printStackTrace();
				}
			}
		}

	}

	/**
	 * Execute the given query
	 * 
	 * @param selectQuery
	 * @return a map containing column value and its length as obtained
	 */
	public Map<String, Integer> fetchData(String selectQuery) {
		Statement stmt = null;
		ResultSet rs = null;
		Map<String, Integer> resultMap = new HashMap<String, Integer>();
		
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(selectQuery);
			while (rs.next()) {
				String colValue = rs.getString(1);
				resultMap.put(colValue, colValue.length());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				System.err.println("Error while closing statement / resultset ");
				e.printStackTrace();
			}
		}
		return resultMap;
	}

	/**
	 * Validate the data
	 * 
	 * @param resultSet
	 */
	public void validateData(ResultSet resultSet, String columnValue) {
		try {
			resultSet.next();
			String columnVal = resultSet.getString(1);

			System.out.println("Length of '" + columnValue
					+ "' before insertion - " + columnValue.length());
			System.out.println("Length of '" + columnVal
					+ "' after insertion - " + columnVal.length());

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Remove the data
	 * 
	 * @param connection
	 */
	public void removeData(String table, String columnName, String columnValue) {
		Statement statement;
		try {
			statement = connection.createStatement();
			String sql = "DELETE FROM " + table + " WHERE " + columnName
					+ " = '" + columnValue + "'";
			int delete = statement.executeUpdate(sql);
			if (delete == 1) {
				System.out.println("Row deleted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Close connection
	 */
	public void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

package com.headstrong.fusion.services.dbpool;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

public class DatabaseManagerTest extends TestCase {

	@Before
	public void setUp() throws Exception {
		super.setUp();
		DbPool poolCreated = DatabaseManager.setupDBPool(setFields());
		DatabaseManager.registerDBPool(FusionConstants.FUSIONDB, poolCreated);
		DbPool pool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);

		pool.getConnection().prepareStatement(
				"CREATE TABLE datasource_config "
						+ "( datasource_name varchar(64), "
						+ " db_url varchar(256) NOT NULL,"
						+ "  db_username varchar(64) NOT NULL,"
						+ "  db_password varchar(64) NOT NULL,"
						+ "  db_type varchar(64) NOT NULL)").execute();

	}

	@After
	public void tearDown() throws Exception {
		DatabaseManager.getInstance(FusionConstants.FUSIONDB).getConnection()
				.prepareStatement("drop table datasource_config").execute();
		DatabaseManager.shutdownDBPools();

	}

	private Map<String, String> setFields() {
		Map<String, String> props1 = new HashMap<String, String>();
		props1.put("database.driver.classname", "org.hsqldb.jdbcDriver");
		props1.put("database.username", "sa");
		props1.put("database.password", "");
		props1.put("database.url", "jdbc:hsqldb:mem:fusion_dbpool");
		props1.put("database.initialSize", "2");
		props1.put("database.maxActive", "5");
		props1.put("database.maxOpenActivePrep", "-1");
		props1.put("database.minEvictableIdleTimemillis", "60000");
		props1.put("database.timeBetweenEvictionRunsMillis", "300000");
		
		return props1;
	}

	public void testDBMandatoryClassName() {
		Map<String, String> props = setFields();
		props.remove("database.driver.classname");
		try {
			DatabaseManager.setupDBPool(props);
			fail("Class name is a mandatory field");
		} catch (FusionException e1) {

		}
	}

	public void testDBMandatoryUrl() {
		Map<String, String> props = setFields();
		props.remove("database.url");

		try {
			DatabaseManager.setupDBPool(props);
			fail("url is a mandatory field");
		} catch (FusionException e) {

		}
	}

	public void testDBMandatoryUserName() {
		Map<String, String> props = setFields();
		props.remove("database.username");

		try {
			DatabaseManager.setupDBPool(props);
			fail("username is a mandatory field");
		} catch (FusionException e) {

		}
	}

	public void testDBMandatoryPassword() {
		Map<String, String> props = setFields();
		props.remove("database.password");

		try {
			DatabaseManager.setupDBPool(props);
			fail("password is a mandatory field");
		} catch (FusionException e) {

		}
	}

	public void testSingletonDB() {
		DbPool db1 = DatabaseManager.getInstance("TempDBPoolSingleton");
		assertNull(db1);

		try {
			DbPool poolCreated = DatabaseManager.setupDBPool(setFields());
			DatabaseManager.registerDBPool("TempDBPoolSingleton", poolCreated);
		} catch (FusionException e) {
			fail("Failed creating the database manager");
		}
		DbPool db2 = DatabaseManager.getInstance("TempDBPoolSingleton");
		assertNotNull(db2);

		DbPool db3 = DatabaseManager.getInstance("TempDBPoolSingleton");
		assertSame(db2, db3);

	}

	public void testConnection() throws Exception {

		try {
			DbPool poolCreated = DatabaseManager.setupDBPool(setFields());
			DatabaseManager.registerDBPool("TempDBPool", poolCreated);
		} catch (FusionException e1) {
			fail("Failed creating the database manager");
		}
		DbPool db1 = DatabaseManager.getInstance("TempDBPool");
		Connection connection = null;
		try {
			connection = db1.getConnection();
			DatabaseMetaData dbmd;
			dbmd = connection.getMetaData();
			System.out
					.println("Connection to " + dbmd.getDatabaseProductName()
							+ " " + dbmd.getDatabaseProductVersion()
							+ " successful.\n");

		} catch (SQLException e) {
			fail("Exception while connecting to db server ");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				fail("Error while closing the connection");
			}
		}
	}

	public void testGetInstance() throws Exception {
		DbPool pool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);

		pool
				.getConnection()
				.prepareStatement(
						"insert into datasource_config values "
								+ "('testdb','jdbc:hsqldb:mem:fusion_dbpool' ,'sa', '' , 'org.hsqldb.jdbcDriver')")
				.execute();

		DbPool pool1 = DatabaseManager.getInstance("testdb");
		assertNotNull(pool1);
		assertNotNull(pool1.getConnection());
		assertNotSame(pool, pool1);

	}



	public void testRegisterPool() throws Exception {
		DbPool poolCreated = DatabaseManager.setupDBPool(setFields());
		DatabaseManager.registerDBPool("TestRegister", poolCreated);
		DbPool pool = DatabaseManager.getInstance("TestRegister");
		assertNotNull(pool);
		pool = DatabaseManager.getInstance("Nopool");
		assertNull(pool);
	}

}

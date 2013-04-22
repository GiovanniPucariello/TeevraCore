package com.headstrong.fusion.configGenerator.dataFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import com.headstrong.fusion.configGenerator.core.PropertyManager;
import com.headstrong.fusion.configGenerator.core.eurex.GeneratorProcessorForEurex;

public class TestTableDataFactoryforEurex extends TestCase {
	String DRIVER_NAME = "sun.jdbc.odbc.JdbcOdbcDriver";
	String DATABASE_URL = "jdbc:odbc:employee_xls";
	StaticDataFactory staticDataFactory;

	public void setUp() {

		Properties props = new Properties();
		props.put("DRIVER_NAME", DRIVER_NAME);
		props.put("DATABASE_URL", DATABASE_URL);
		// init connection
		PropertyManager propManger = PropertyManager.getInstance(props);
		new GeneratorProcessorForEurex();
		System.out.println("Inside Set up");

	}

	@Test
	public void testgetRequestID() throws SQLException {
		// doBeforeEachTestCase();
		TableDataFactoryForEurex tb = new TableDataFactoryForEurex(
				"Accept Give Up$");
		Map map = tb.getRequestID();
		Map expectedMap = new LinkedHashMap();
		expectedMap.put("Accept Give Up$",
				"DRIV_ACCEPT_GIVE_UP_TRANSACTION_RID");
		assertEquals(expectedMap, map);
	}

	@Test
	public void testgetParentStrutName() {
		TableDataFactoryForEurex tb = new TableDataFactoryForEurex(
				"Accept Give Up$");
		Map Actualmap = tb.getParentStrutName();
		Map expectedMap = new LinkedHashMap();		
		expectedMap.put("FUTURES-RESPONSE", "futAcptGivUpTrnResponseT");
		expectedMap.put("OPTIONS-REQUEST", "optAcptGivUpTrnRequestT");		
		assertEquals(expectedMap, Actualmap);

	}

	@Test
	public void testgetColumnName() {
		TableDataFactoryForEurex tb = new TableDataFactoryForEurex(
				"Accept Give Up$");
		Map Actualmap = tb.getColumnName("OPTIONS-REQUEST");
		Map expectedMap = new LinkedHashMap();
		expectedMap.put("FUTURES-RESPONSE", "Rules");
		expectedMap
				.put("OPTIONS-REQUEST", "FIXML tags" + "\n"
						+ "/AllocInstrctn/@TransTyp=3" + "\n"
						+ "/AllocInstrctn/@Typ=2");
		assertEquals(expectedMap, Actualmap);
	}

	@Test
	public void testgetData() {
		TableDataFactoryForEurex tb = new TableDataFactoryForEurex(
				"Accept Give Up$");
		List<Map> Actualmap1 = tb.getQueryData("FUTURES-RESPONSE");
		List<Map> Actualmap2 = tb.getQueryData("OPTIONS-REQUEST");
		
		
		
		
		List<Map> subTableData1 = new LinkedList<Map>();
		List<Map> subTableData2 = new LinkedList<Map>();
		Map map1 = new LinkedHashMap();
		Map map2 = new LinkedHashMap();
		Map map3 = new LinkedHashMap();
		
		map1.put("Structure", "header (dataHeaderT)");
		map1.put("Field", "exchApplId");
		map1.put("Data", "char[]");
		map1.put("FIXML", "/AllocRpt/Pty/@ID" + "\n" +
"/AllocRpt/Pty/@R=21");
		
		
		
		map2.put("Structure", "header (dataHeaderT)");
		map2.put("Field", "exchApplId");
		map2.put("Data", "char[]");
		map2.put("FIXML", "/AllocInstrctn/Pty/@ID" + "\n" +
				"/AllocInstrctn/Pty/@R=21");
		map3.put("Structure", null);
		map3.put("Field", "prodLine");
		map3.put("Data", "char[]");
		map3.put("FIXML", "/AllocInstrctn/Instmt/@SecTyp=OPT");
		
		subTableData1.add(map1);
		subTableData2.add(map2);
		subTableData2.add(map3);
		
		assertEquals(Actualmap1, subTableData1);
		assertEquals(Actualmap2, subTableData2);

	}
	
	public void teardown() {
		staticDataFactory.closeConection();
	}

}

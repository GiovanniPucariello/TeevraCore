package com.headstrong.fusion.configGenerator.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import junit.framework.TestCase;

import org.junit.Test;

import com.headstrong.fusion.configGenerator.core.liffe.ConfigParserForLiffe;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactoryForLiffe;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactoryForLiffe.QUERY_TYPES_LIFFE;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Case;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Mappings;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Maps;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Switch;

public class TestConfigParserForLiffe extends TestCase {

	String DRIVER_NAME = "sun.jdbc.odbc.JdbcOdbcDriver";
	String DATABASE_URL = "jdbc:odbc:liffe1";
	Properties props = new Properties();

	public void setUp() {

		props.put("DRIVER_NAME", DRIVER_NAME);
		props.put("DATABASE_URL", DATABASE_URL);

	}

	@Test
	public void testMappingForFixmlMultiParser() {
		ConfigParserForLiffe ge = new ConfigParserForLiffe(props);
		TableDataFactory.getFactory("Test Case Multilist$", DATABASE_URL);

		Mappings mapping = new Mappings();
		String strFieldName = "contractType";
		String strFixml = "Instrmt/@SecTyp#MultiList(P=OPT[Instrmt/@Prod=0/$Integer])";
		String strType = "String";
		ge.mappingForFixmlMultiParser(mapping, strFieldName, strFixml, strType);
		Switch switch1 = mapping.getSwitch().get(0);
		List<Case> cases = switch1.getCase();
		String value = cases.get(0).getValue();
		String target = null;
		String src = null;
		String type = null;
		String nextTarget = null;
		String parseType = null;
		String nextSrc = null;
		String nextType = null;

		for (Case cas : cases) {
			List<Maps> maps = cases.get(0).getMap();
			target = maps.get(0).getTarget();
			src = maps.get(0).getSrc();
			type = maps.get(0).getType();
			nextTarget = maps.get(1).getTarget();
			parseType = maps.get(1).getParseType();
			nextSrc = maps.get(1).getSrc();
			nextType = maps.get(1).getType();
		}
		assertEquals("P", value);
		assertEquals("OPT", src);
		assertEquals("message.value.Instrmt.SecTyp", target);
		assertEquals("constant", type);
		assertEquals("Integer", parseType);
		assertEquals("0", nextSrc);
		assertEquals("message.value.Instrmt.Prod", nextTarget);
		assertEquals("constant", nextType);

	}

	@Test
	public void testMappingForFixmlListParser() {
		ConfigParserForLiffe ge = new ConfigParserForLiffe(props);
		TableDataFactory.getFactory("Test Case List$", DATABASE_URL);

		Mappings mapping = new Mappings();
		Map<String, Integer> mp = new HashMap<String, Integer>();
		String strFieldName = "clearingSlipType";
		String strFixml = "TrdTyp#List(T=5,C=99)";
		String strType = "Integer";
		for (QUERY_TYPES_LIFFE q : QUERY_TYPES_LIFFE.values()) {
			ge.mappingForFixmlListParser(mp, mapping, strFieldName, strFixml,
					strType, q);
			Switch switch1 = mapping.getSwitch().get(0);
			String expr = switch1.getExpr();
			List<Case> cases = switch1.getCase();
			String target = null;
			String src = null;
			String type = null;
			String parseType = null;
			String nextTarget = null;
			String nextSrc = null;
			String nextType = null;
			String nextParseType = null;
			String value = cases.get(0).getValue();
			String nextVal = cases.get(1).getValue();
			List<Maps> maps = cases.get(0).getMap();
			List<Maps> nextMaps = cases.get(1).getMap();
			target = maps.get(0).getTarget();
			src = maps.get(0).getSrc();
			type = maps.get(0).getType();
			parseType = maps.get(0).getParseType();

			nextTarget = nextMaps.get(0).getTarget();
			nextSrc = nextMaps.get(0).getSrc();
			nextType = nextMaps.get(0).getType();
			nextParseType = nextMaps.get(0).getParseType();
			assertEquals("$clearingSlipType", expr);
			assertEquals("T", value);
			assertEquals("C", nextVal);
			assertEquals("5", src);
			assertEquals("message.value.TrdTyp", target);
			assertEquals("constant", type);
			assertEquals("Integer", parseType);
			assertEquals("message.value.TrdTyp", nextTarget);
			assertEquals("99", nextSrc);
			assertEquals("constant", nextType);
			assertEquals("Integer", nextParseType);

		}
	}

	@Test
	public void testMappingForOneVarParser() {

		ConfigParserForLiffe ge = new ConfigParserForLiffe(props);
		TableDataFactory.getFactory("Test Case One Simple$", DATABASE_URL);

		Mappings mapping = new Mappings();
		String strFieldName = "transactionID";
		String strFixml = "@ReqID";
		String strType = "simple";
		ge.mappingForOneVarParser(mapping, strFieldName, strFixml, strType);
		List<Maps> maps = mapping.getMap();
		String type = maps.get(0).getType();
		String src = maps.get(0).getSrc();
		String target = maps.get(0).getTarget();
		assertEquals(type, strType);
		assertEquals(strFieldName, src);
		assertEquals("message.value.ReqID", target);

	}

	@Test
	public void testMappingForPtyParser() {
		ConfigParserForLiffe ge = new ConfigParserForLiffe(props);
		TableDataFactory.getFactory("Test Case Pty$", DATABASE_URL);

		Mappings mapping = new Mappings();
		Map<String, Integer> mp = new HashMap<String, Integer>();
		QUERY_TYPES_LIFFE q = TableDataFactoryForLiffe.QUERY_TYPES_LIFFE.POSITION_NOTE_INFORMATION;
		String strFieldName = "counterpartyMemberName";
		String strFixml = "Pty/@ID#Pty/@R (=17)";
		String strType = "rList/String#rList/Integer";
		ge.mappingForPtyParser(mp, mapping, strFieldName, strFixml, strType, q);
		List<Maps> maps = mapping.getMap();
		String src = maps.get(0).getSrc();
		String target = maps.get(0).getTarget();
		String type = maps.get(0).getType();
		String nextSrc = maps.get(1).getSrc();
		String nextTarget = maps.get(1).getTarget();
		String nextType = maps.get(1).getType();
		String parseType = maps.get(1).getParseType();
		assertEquals(strFieldName, src);
		assertEquals("message.value.Pty.ID", target);
		assertEquals("simple", type);
		assertEquals("Integer", parseType);
		assertEquals("17", nextSrc);
		assertEquals("message.value.Pty[0].R", nextTarget);
		assertEquals("constant", nextType);

	}

	@Test
	public void testMappingForSimpleParser() {
		ConfigParserForLiffe ge = new ConfigParserForLiffe(props);
		TableDataFactory.getFactory("Test Case Repeated$", DATABASE_URL);
		Mappings mapping = new Mappings();
		Map<String, Integer> mp = new HashMap<String, Integer>();
		QUERY_TYPES_LIFFE q = TableDataFactoryForLiffe.QUERY_TYPES_LIFFE.POSITION_NOTE_INFORMATION;
		String strFieldName = "physicalCommodity";
		String strFixml = "Instrmt/@Prod";
		String strType = "Integer";
		ge.mappingForSimpleParser(mp, q, mapping, strFieldName, strFixml,
				strType);
		List<Maps> maps = mapping.getMap();
		String parseType = maps.get(0).getParseType();
		String src = maps.get(0).getSrc();
		String target = maps.get(0).getTarget();
		String type = maps.get(0).getType();
		assertEquals(strFieldName, src);
		assertEquals("message.value.Instrmt.Prod", target);
		assertEquals("simple", type);
		assertEquals("Integer", parseType);

	}

}

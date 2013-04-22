package com.headstrong.fusion.messaging.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DbUpdateProcessorTest {

	@Test
	public void testDbUpdateProcessor() {
		String updateSQL="update table set name='abc' where id=#id#,type=#type#,id2=#id#";
		String expectedSQL="update table set name='abc' where id=?,type=?,id2=?";
		DbUpdateProcessor dbProcessor=new DbUpdateProcessor(updateSQL);
		assertEquals(expectedSQL, dbProcessor.getUpdateSQL());
		List<String> actualList=dbProcessor.getParameterList();
		List<String> expectedList=new ArrayList<String>();
		expectedList.add("id");
		expectedList.add("type");
		expectedList.add("id");
		assertArrayEquals(expectedList.toArray(), actualList.toArray());
		
	}

}

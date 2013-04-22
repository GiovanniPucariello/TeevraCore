/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright � 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: StateMachineDAOTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Mar 10, 2009 
 */

package com.headstrong.teevra.services.statemachine.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import com.headstrong.teevra.common.dao.AbstractDAOTestCase;
import com.headstrong.teevra.common.dao.hibernate.HibernateUtil;
import com.headstrong.teevra.common.util.CreateQueries;
import com.headstrong.teevra.common.util.DropQueries;
import com.headstrong.teevra.common.util.InsertParamsGenerator;
import com.headstrong.teevra.common.util.InsertQueries;
import com.headstrong.teevra.common.util.SelectQueries;
import com.headstrong.teevra.services.component.ComponentsCache;
import com.headstrong.teevra.services.component.eo.ComponentConfigEO;
import com.headstrong.teevra.services.component.eo.ComponentEO;
import com.headstrong.teevra.services.process.eo.ProcessServiceConfigurationEO;
import com.headstrong.teevra.services.statemachine.StateMachineModelGenerator;
import com.headstrong.teevra.services.statemachine.dao.StateMachineDAO;
import com.headstrong.teevra.services.statemachine.eo.StateMachineEO;
import com.headstrong.teevra.services.statemachine.exception.StateMachineModelGenerationException;
import com.headstrong.teevra.services.statemachine.exception.StateMachineServiceException;
import com.headstrong.teevra.services.statemachine.vo.StateMachineActionVO;
import com.headstrong.teevra.services.statemachine.vo.StateMachineGraphLinkVO;
import com.headstrong.teevra.services.statemachine.vo.StateMachineGraphNodeVO;
import com.headstrong.teevra.services.statemachine.vo.StateMachineGraphVO;
import com.headstrong.teevra.services.statemachine.vo.StateMachineLinkVO;
import com.headstrong.teevra.services.statemachine.vo.StateVO;

/**
 * 
 */
public class StateMachineDAOTest extends AbstractDAOTestCase {

	private StateMachineDAO stateMachineDAO;

	public void onSetUp() {
		stateMachineDAO = (StateMachineDAO) getBean("stateMachineDAO");

		HibernateUtil.setUp();
		HibernateUtil.createTable(CreateQueries.create_state_machine);
	}

	public void testGetStateMachines() {
		System.out.println("TESTING getStateMachineList");

		List<Object> stateMachineParams1 = InsertParamsGenerator
				.setStateMachineParams(new Long(1), "statemachine1",
						"Test Statemachine 1", StateMachineEO.STATUS_PUBLISHED,
						"event1,event2", null, null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> stateMachineParams2 = InsertParamsGenerator
				.setStateMachineParams(new Long(2), "statemachine2",
						"Test Statemachine 2", StateMachineEO.STATUS_PUBLISHED,
						"event3,event4", null, null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_state_machine,
				stateMachineParams1);
		HibernateUtil.insertData(InsertQueries.insert_state_machine,
				stateMachineParams2);

		List<StateMachineEO> stateMachineList = new ArrayList<StateMachineEO>();
		try {
			stateMachineList = stateMachineDAO.getStateMachineList();
		} catch (StateMachineServiceException e) {
			fail("Failed while retrieving state machines");
			e.printStackTrace();
		}
		Assert.assertEquals(2, stateMachineList.size());
	}

	public void testSaveStateMachine() {
		System.out.println("TESTING stateMachineToSave ");

		// saving first record
		StateMachineEO stateMachine = new StateMachineEO();
		stateMachine.setStateMachineName("stateMachine1");
		stateMachine.setStateMachineDesc("Save and edit the stateMachine");
		stateMachine.setStateMachineStatus(StateMachineEO.STATUS_UNPUBLISHED);
		stateMachine.setCreatedBy(System.getProperty("user.name"));
		stateMachine.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			stateMachineDAO.saveStateMachine(stateMachine);
		} catch (StateMachineServiceException e) {
			fail("failed while saving stateMachine");
			e.printStackTrace();
		}

		ResultSet rs = HibernateUtil
				.executeQuery(SelectQueries.check_state_machine);

		List<Object> data = new ArrayList<Object>();
		int recordCount = 0;
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					data.add(rs.getObject(3));
					data.add(rs.getObject(4));
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// check size
		Assert.assertEquals(1, recordCount);
		// check stateMachine id, name and description
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals("stateMachine1", data.get(1));
		Assert.assertEquals("Save and edit the stateMachine", data.get(2));
		Assert.assertEquals(StateMachineEO.STATUS_UNPUBLISHED, data.get(3));

		// edit the first record
		stateMachine = new StateMachineEO();
		stateMachine.setStateMachineId(new Long(1));
		stateMachine.setStateMachineName("stateMachine1");
		stateMachine.setStateMachineDesc("Edited the stateMachine");
		stateMachine.setStateMachineStatus(StateMachineEO.STATUS_PUBLISHED);

		stateMachine.setCreatedBy(System.getProperty("user.name"));
		stateMachine.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			stateMachineDAO.saveStateMachine(stateMachine);
		} catch (StateMachineServiceException e) {
			fail("failed while editing stateMachine");
			e.printStackTrace();
		}

		rs = HibernateUtil.executeQuery(SelectQueries.check_state_machine);

		data = new ArrayList<Object>();
		recordCount = 0;
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					data.add(rs.getObject(3));
					data.add(rs.getObject(4));
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// check size
		Assert.assertEquals(1, recordCount);
		// check stateMachine id, name and description
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals("stateMachine1", data.get(1));
		Assert.assertEquals("Edited the stateMachine", data.get(2));
		Assert.assertEquals(StateMachineEO.STATUS_PUBLISHED, data.get(3));

		// save second record
		// saving first record
		stateMachine = new StateMachineEO();
		stateMachine.setStateMachineName("stateMachine2");
		stateMachine.setStateMachineDesc("Save the stateMachine");
		stateMachine.setStateMachineStatus(StateMachineEO.STATUS_UNPUBLISHED);
		stateMachine.setCreatedBy(System.getProperty("user.name"));
		stateMachine.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			stateMachineDAO.saveStateMachine(stateMachine);
		} catch (StateMachineServiceException e) {
			fail("failed while saving stateMachine");
			e.printStackTrace();
		}

		// check size
		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_state_machine));
	}

	public void testDeleteStateMachine() {
		System.out.println("TESTING deleteStateMachine");

		List<Object> stateMachineParams1 = InsertParamsGenerator
				.setStateMachineParams(new Long(1), "statemachine1",
						"Test Statemachine 1", StateMachineEO.STATUS_PUBLISHED,
						"event1,event2", null, null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> stateMachineParams2 = InsertParamsGenerator
				.setStateMachineParams(new Long(2), "statemachine2",
						"Test Statemachine 2", StateMachineEO.STATUS_PUBLISHED,
						"event3,event4", null, null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_state_machine,
				stateMachineParams1);
		HibernateUtil.insertData(InsertQueries.insert_state_machine,
				stateMachineParams2);

		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_state_machine));
		try {
			stateMachineDAO.deleteStateMachine("statemachine1");
		} catch (StateMachineServiceException e) {
			fail("Failed while retrieving state machines");
			e.printStackTrace();
		}
		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_state_machine));
	}

	public void atestPublishStateMachine() {
		/** Setup StartProcess and StopProcess Action component * */
		ComponentEO startProcess = new ComponentEO();
		startProcess.setCompId(new Long(1));
		startProcess.setCompName("StartProcess");
		ComponentConfigEO startProcessId = new ComponentConfigEO();
		startProcessId.setCofigLabel("ProcessId");
		startProcessId.setConfigKey("processId");
		List<ComponentConfigEO> startProcessConfig = new ArrayList<ComponentConfigEO>();
		startProcessConfig.add(startProcessId);
		startProcess.setCompConfigList(startProcessConfig);

		ComponentEO stopProcess = new ComponentEO();
		stopProcess.setCompId(new Long(2));
		stopProcess.setCompName("StopProcess");
		ComponentConfigEO stopProcessId = new ComponentConfigEO();
		stopProcessId.setCofigLabel("ProcessId");
		stopProcessId.setConfigKey("processId");
		List<ComponentConfigEO> stopProcessConfig = new ArrayList<ComponentConfigEO>();
		stopProcessConfig.add(stopProcessId);
		stopProcess.setCompConfigList(stopProcessConfig);

		ComponentsCache.getInstance().addToCache(startProcess);
		ComponentsCache.getInstance().addToCache(stopProcess);

		System.out.println("TESTING PUBLISH STATE MACHINE");
		StateMachineEO stateMachineToPublish = new StateMachineEO();
		stateMachineToPublish.setStateMachineName("testS/M");
		stateMachineToPublish.setStateMachineDesc("saved to test");

		StateMachineGraphVO graph = new StateMachineGraphVO();
		Map<String, StateMachineGraphNodeVO> nodesMap = new HashMap<String, StateMachineGraphNodeVO>();

		// Init State config
		StateMachineGraphNodeVO node1 = new StateMachineGraphNodeVO();
		node1.setNodeId("initstate");
		StateVO initState = new StateVO();
		initState.setStateName("initstate");
		initState.setStateDesc("initstate");
		initState.setStateType(StateVO.INIT);

		/**
		 * Exit Action 1 setup
		 */
		StateMachineActionVO exitAction1 = new StateMachineActionVO();
		exitAction1.setCompId(1);

		List<ProcessServiceConfigurationEO> configurations1 = new ArrayList<ProcessServiceConfigurationEO>();

		ProcessServiceConfigurationEO config1 = new ProcessServiceConfigurationEO();
		config1.setConfigKey("processId");
		config1.setSimpleValue("1");
		configurations1.add(config1);

		exitAction1.setConfigurations(configurations1);

		initState.setExitAction(exitAction1);
		node1.setStateDetails(initState);

		// normal state config
		StateMachineGraphNodeVO node2 = new StateMachineGraphNodeVO();
		node2.setNodeId("normalstate");
		StateVO normalState = new StateVO();
		normalState.setStateName("normalstate");
		normalState.setStateDesc("normalstate");
		normalState.setStateType(StateVO.NORMAL);

		StateMachineActionVO entryAction2 = new StateMachineActionVO();
		entryAction2.setCompId(1);

		List<ProcessServiceConfigurationEO> configurations2 = new ArrayList<ProcessServiceConfigurationEO>();

		ProcessServiceConfigurationEO config3 = new ProcessServiceConfigurationEO();
		config3.setConfigKey("processId");
		config3.setSimpleValue("1");
		configurations2.add(config3);

		entryAction2.setConfigurations(configurations2);

		normalState.setEntryAction(entryAction2);

		StateMachineActionVO exitAction2 = new StateMachineActionVO();
		exitAction2.setCompId(1);
		List<ProcessServiceConfigurationEO> configurations3 = new ArrayList<ProcessServiceConfigurationEO>();

		ProcessServiceConfigurationEO config5 = new ProcessServiceConfigurationEO();
		config5.setConfigKey("processId");
		config5.setSimpleValue("1");
		configurations3.add(config5);

		exitAction2.setConfigurations(configurations3);

		normalState.setExitAction(exitAction2);
		node2.setStateDetails(normalState);

		// end state config
		StateMachineGraphNodeVO node3 = new StateMachineGraphNodeVO();
		node3.setNodeId("endstate");
		StateVO endState = new StateVO();
		endState.setStateName("endstate");
		endState.setStateDesc("endstate");
		endState.setStateType(StateVO.END);

		StateMachineActionVO entryAction3 = new StateMachineActionVO();
		entryAction3.setCompId(2);

		List<ProcessServiceConfigurationEO> configurations4 = new ArrayList<ProcessServiceConfigurationEO>();

		ProcessServiceConfigurationEO config7 = new ProcessServiceConfigurationEO();
		config7.setConfigKey("processId");
		config7.setSimpleValue("1");
		configurations4.add(config7);

		entryAction3.setConfigurations(configurations4);
		endState.setEntryAction(entryAction3);
		node3.setStateDetails(endState);

		// add the states in the nodes map
		nodesMap.put("initstate", node1);
		nodesMap.put("normalstate", node2);
		nodesMap.put("endstate", node3);

		Map<String, Map<String, StateMachineGraphLinkVO>> linksMap = new HashMap<String, Map<String, StateMachineGraphLinkVO>>();
		Map<String, StateMachineGraphLinkVO> initStateLinks = new HashMap<String, StateMachineGraphLinkVO>();
		Map<String, StateMachineGraphLinkVO> normalStateLinks = new HashMap<String, StateMachineGraphLinkVO>();
		// link between node1 to node2
		StateMachineGraphLinkVO graphLink12 = new StateMachineGraphLinkVO();
		graphLink12.setStartNodeId(node1.getNodeId());
		graphLink12.setEndNodeId(node2.getNodeId());
		StateMachineLinkVO link12 = new StateMachineLinkVO();
		link12.setEventName("event 12");
		link12.setSourceStateName(node1.getNodeId());
		link12.setTargetStateName(node2.getNodeId());

		// transition action for link12
		StateMachineActionVO transitionAction12 = new StateMachineActionVO();
		transitionAction12.setCompId(2);

		List<ProcessServiceConfigurationEO> configurations5 = new ArrayList<ProcessServiceConfigurationEO>();

		ProcessServiceConfigurationEO config9 = new ProcessServiceConfigurationEO();
		config9.setConfigKey("processId");
		config9.setSimpleValue("1");
		configurations5.add(config9);

		transitionAction12.setConfigurations(configurations5);
		link12.setTransitionAction(transitionAction12);
		graphLink12.setLinkDetails(link12);

		initStateLinks.put(graphLink12.getEndNodeId(), graphLink12);

		// link between node1 to node3
		StateMachineGraphLinkVO graphLink13 = new StateMachineGraphLinkVO();
		graphLink13.setStartNodeId(node1.getNodeId());
		graphLink13.setEndNodeId(node3.getNodeId());
		StateMachineLinkVO link13 = new StateMachineLinkVO();
		link13.setEventName("event 13");
		link13.setSourceStateName(node1.getNodeId());
		link13.setTargetStateName(node3.getNodeId());

		// transition action for link13
		StateMachineActionVO transitionAction13 = new StateMachineActionVO();
		transitionAction13.setCompId(2);

		List<ProcessServiceConfigurationEO> configurations6 = new ArrayList<ProcessServiceConfigurationEO>();

		ProcessServiceConfigurationEO config11 = new ProcessServiceConfigurationEO();
		config11.setConfigKey("processId");
		config11.setSimpleValue("1");
		configurations6.add(config11);

		transitionAction13.setConfigurations(configurations6);

		link13.setTransitionAction(transitionAction13);
		graphLink13.setLinkDetails(link13);

		initStateLinks.put(graphLink13.getEndNodeId(), graphLink13);

		// link between node2 to node3
		StateMachineGraphLinkVO graphLink23 = new StateMachineGraphLinkVO();
		graphLink23.setStartNodeId(node2.getNodeId());
		graphLink23.setEndNodeId(node3.getNodeId());
		StateMachineLinkVO link23 = new StateMachineLinkVO();
		link23.setEventName("event 23");
		link23.setSourceStateName(node2.getNodeId());
		link23.setTargetStateName(node3.getNodeId());

		// transition action for link23
		StateMachineActionVO transitionAction23 = new StateMachineActionVO();
		transitionAction23.setCompId(1);

		List<ProcessServiceConfigurationEO> configurations7 = new ArrayList<ProcessServiceConfigurationEO>();

		ProcessServiceConfigurationEO config13 = new ProcessServiceConfigurationEO();
		config13.setConfigKey("processId");
		config13.setSimpleValue("1");
		configurations7.add(config13);

		transitionAction23.setConfigurations(configurations7);

		link23.setTransitionAction(transitionAction23);
		graphLink23.setLinkDetails(link23);

		normalStateLinks.put(graphLink23.getEndNodeId(), graphLink23);

		linksMap.put(node1.getNodeId(), initStateLinks);
		linksMap.put(node2.getNodeId(), normalStateLinks);

		graph.setNodes(nodesMap);
		graph.setLinks(linksMap);

		stateMachineToPublish.setGraph(graph);

		// generate state machine model
		String stateMachineModel = null;
		try {
			stateMachineModel = StateMachineModelGenerator
					.generateStateMachineModel(stateMachineToPublish);
		} catch (StateMachineModelGenerationException e) {
			e.printStackTrace();
		}
		System.out.println(stateMachineModel);
		// set the state machine model in the state machine to be published
		stateMachineToPublish.setStateMachineModel(stateMachineModel);
		// set the status of the state machine to published
		stateMachineToPublish
				.setStateMachineStatus(StateMachineEO.STATUS_PUBLISHED);
		try {
			stateMachineDAO.saveStateMachine(stateMachineToPublish);
			System.out.println("Published State Machine::-> "
					+ stateMachineToPublish.toString());
		} catch (StateMachineServiceException e) {
			e.printStackTrace();
		}
	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_state_machine);
		HibernateUtil.shutDown();
	}
}

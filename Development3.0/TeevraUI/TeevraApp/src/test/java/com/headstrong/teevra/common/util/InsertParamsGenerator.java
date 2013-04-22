/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: InsertParamsGenerator.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 25, 2009 
 */

package com.headstrong.teevra.common.util;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains methods to generate a list from the given parameters
 */
public class InsertParamsGenerator {

	// teevra_sequence
	/**
	 * Returns the values to be inserted into teevra_sequence table as a List
	 */
	public static List<Object> setTeevraSequenceParams(String tableName,
			Long seqValue) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(tableName);
		paramList.add(seqValue);
		return paramList;
	}

	// app properties service
	/**
	 * Returns the values to be inserted into t_property table as a List
	 */
	public static List<Object> setPropertyParams(Long propertyId,
			String propertyName, String propertyValue, String propertyDesc,
			String propertyStatus, String comments, String createdBy,
			Timestamp createdDate, String modifiedBy, Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(propertyId);
		paramList.add(propertyName);
		paramList.add(propertyValue);
		paramList.add(propertyDesc);
		paramList.add(propertyStatus);
		paramList.add(comments);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	// component service

	/**
	 * Returns the values to be inserted into component table as a List
	 */
	public static List<Object> setComponentParams(Long compId, String compName,
			String compVerId, String compStatus, String compType,
			String compDesc, Timestamp compDeployDate,
			Timestamp compUndeployDate, String compIconImageRef,
			String compConfigUI, String createdBy, Timestamp createdDate,
			String modifiedBy, Timestamp modifiedDate, String compImageRef,
			String compServiceName) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(compId);
		paramList.add(compName);
		paramList.add(compVerId);
		paramList.add(compStatus);
		paramList.add(compType);
		paramList.add(compDesc);
		paramList.add(compDeployDate);
		paramList.add(compUndeployDate);
		paramList.add(compIconImageRef);
		paramList.add(compConfigUI);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		paramList.add(compImageRef);
		paramList.add(compServiceName);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into component_configuration table as a
	 * List
	 */
	public static List<Object> setComponentConfigParams(Long compConfigId,
			Long compId, Long configSequenceNumber, String configKey,
			String configType, String configReferences, String configLabel,
			String createdBy, Timestamp createdDate, String modifiedBy,
			Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(compConfigId);
		paramList.add(compId);
		paramList.add(configSequenceNumber);
		paramList.add(configKey);
		paramList.add(configType);
		paramList.add(configReferences);
		paramList.add(configLabel);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into component_template table as a List
	 */
	public static List<Object> setComponentTemplateParams(Long compTemplateId,
			Long compId, String templateName, String compServiceConfigs,
			String createdBy, Timestamp createdDate, String modifiedBy,
			Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(compTemplateId);
		paramList.add(compId);
		paramList.add(templateName);
		paramList.add(compServiceConfigs);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	// process service

	/**
	 * Returns the values to be inserted into process table as a List
	 */
	public static List<Object> setProcessParams(Long prcsId, String prcsName,
			String prcsDesc, String prcsStatus, Long prcsGrpId,
			Long prcsLatestVersion, Boolean prcsIsTemplate,
			Boolean prcsRecoveryEnabled, String serialzedProcessGraph,
			String prcsModel, String createdBy, Timestamp createdDate,
			String modifiedBy, Timestamp modifiedDate, Integer throttleCount, Integer throttleTime) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(prcsId);
		paramList.add(prcsName);
		paramList.add(prcsDesc);
		paramList.add(prcsStatus);
		paramList.add(prcsGrpId);
		paramList.add(prcsLatestVersion);
		paramList.add(prcsIsTemplate);
		paramList.add(prcsRecoveryEnabled);
		paramList.add(serialzedProcessGraph);
		paramList.add(prcsModel);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		paramList.add(throttleCount);
		paramList.add(throttleTime);		
		return paramList;
	}

	/**
	 * Returns the values to be inserted into process_service_configuration
	 * table as a List
	 */
	public static List<Object> setProcessServiceConfigParams(Long prcsId,
			String propertyId, String propertyConfig, String serviceId,
			String serviceType, String propertySimpleConfig) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(prcsId);
		paramList.add(propertyId);
		paramList.add(propertyConfig);
		paramList.add(serviceId);
		paramList.add(serviceType);
		paramList.add(propertySimpleConfig);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into process_schedule table as a List
	 */
	public static List<Object> setProcessScheduleParams(Long prcsId,
			String recurrenceType, String recurrenceConfig, String createdBy,
			Timestamp createdDate, String modifiedBy, Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(prcsId);
		paramList.add(recurrenceType);
		paramList.add(recurrenceConfig);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	// process admin service

	/**
	 * Returns the values to be inserted into message_eventlog table as a List
	 */
	public static List<Object> setMessageEventlogParams(Long messageEventlogId,
			Long prcsRunId, Long messageId, Long sequenceId,
			Long totalSequence, String savepointName, Timestamp savepointTime,
			String logMessage, String createdBy, Timestamp createdDate,
			String modifiedBy, Timestamp modifiedDate, String messageData) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(messageEventlogId);
		paramList.add(prcsRunId);
		paramList.add(messageId);
		paramList.add(sequenceId);
		paramList.add(totalSequence);
		paramList.add(savepointName);
		paramList.add(savepointTime);
		paramList.add(logMessage);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		paramList.add(messageData);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into process_runtime table as a List
	 */
	public static List<Object> setProcessRuntimeParams(Long prcsRunId,
			Long prcsId, Long prcsVerId, Integer prcsRunSequence,
			String prcsRunStatus, Timestamp prcsRunStartTime,
			Timestamp prcsRunStopTime, Long prcsMsgsRecd, Long prcsMsgsError,
			Long prcsMsgsProcessed, String createdBy, Timestamp createdDate,
			String modifiedBy, Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(prcsRunId);
		paramList.add(prcsId);
		paramList.add(prcsVerId);
		paramList.add(prcsRunSequence);
		paramList.add(prcsRunStatus);
		paramList.add(prcsRunStartTime);
		paramList.add(prcsRunStopTime);
		paramList.add(prcsMsgsRecd);
		paramList.add(prcsMsgsError);
		paramList.add(prcsMsgsProcessed);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into process_runtime_eventlog table as
	 * a List
	 */
	public static List<Object> setProcessRuntimeEventlogParams(
			Long prcsRunEventlogId, Long prcsRunId, String prcsEventType,
			Timestamp prcsEventTime, String prcsEventSource,
			String prcsEventCategory, String prcsEventDesc, String prcsMsg,
			String createdBy, Timestamp createdDate, String modifiedBy,
			Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(prcsRunEventlogId);
		paramList.add(prcsRunId);
		paramList.add(prcsEventType);
		paramList.add(prcsEventTime);
		paramList.add(prcsEventSource);
		paramList.add(prcsEventCategory);
		paramList.add(prcsEventDesc);
		paramList.add(prcsMsg);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	// datasource service

	/**
	 * Returns the values to be inserted into datsource_config table as a List
	 */
	public static List<Object> setDataSourceParams(Long dataSourceId,
			String dataSourceName, String dbURL, String dbUsername,
			String dbPassword, String dbType, String createdBy,
			Timestamp createdDate, String modifiedBy, Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(dataSourceId);
		paramList.add(dataSourceName);
		paramList.add(dbURL);
		paramList.add(dbUsername);
		paramList.add(dbPassword);
		paramList.add(dbType);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into refdata_config table as a List
	 */
	public static List<Object> setRefDataParams(Long refDataId,
			String refDataName, String refDataQuery, Long dataSourceId,
			String createdBy, Timestamp createdDate, String modifiedBy,
			Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(refDataId);
		paramList.add(refDataName);
		paramList.add(refDataQuery);
		paramList.add(dataSourceId);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	// schema service

	/**
	 * Returns the values to be inserted into process table as a List
	 */
	public static List<Object> setMessageSchemaParams(Long schemaId,
			String schemaName, String schemaDesc, Boolean schemaIsPrimitive,
			Long parentSchemaId, String createdBy, Timestamp createdDate,
			String modifiedBy, Timestamp modifiedDate, Boolean schemaIsPublic) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(schemaId);
		paramList.add(schemaName);
		paramList.add(schemaDesc);
		paramList.add(schemaIsPrimitive);
		paramList.add(parentSchemaId);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		paramList.add(schemaIsPublic);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into messgae_schema_raw table as a List
	 */
	public static List<Object> setMessageSchemaRawParams(Long schemaId,
			String schemaFormattedText, String createdBy,
			Timestamp createdDate, String modifiedBy, Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(schemaId);
		paramList.add(schemaFormattedText);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into message_schema_attribute table as
	 * a List
	 */
	public static List<Object> setMessageSchemaAttributeParams(
			Long schemaAttrId, Long schemaId, String schemaAttrName,
			Long schemaAttrType, Boolean schemaAttrIsKey,
			String schemaAttrRelation, Long schemaM2mType, String createdBy,
			Timestamp createdDate, String modifiedBy, Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(schemaAttrId);
		paramList.add(schemaId);
		paramList.add(schemaAttrName);
		paramList.add(schemaAttrType);
		paramList.add(schemaAttrIsKey);
		paramList.add(schemaAttrRelation);
		paramList.add(schemaM2mType);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	// server admin service
	/**
	 * Returns the values to be inserted into server_config table as a List
	 */
	public static List<Object> setServerConfigParams(Long serverId,
			String serverName, String serverUrl, String createdBy,
			Timestamp createdDate, String modifiedBy, Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(serverId);
		paramList.add(serverName);
		paramList.add(serverUrl);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into process_server table as a List
	 */
	public static List<Object> setProcessServerParams(Long prcsServerId,
			Long prcsId, Long serverId, String createdBy,
			Timestamp createdDate, String modifiedBy, Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(prcsServerId);
		paramList.add(prcsId);
		paramList.add(serverId);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	// state machine service

	/**
	 * Returns the values to be inserted into state machine table as a List
	 */
	public static List<Object> setStateMachineParams(Long stateMachineId,
			String stateMachineName, String stateMachineDesc,
			String stateMachineStatus, String stateMachineEvents,
			String serialzedStateMachineGraph, String stateMachineModel,
			String createdBy, Timestamp createdDate, String modifiedBy,
			Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(stateMachineId);
		paramList.add(stateMachineName);
		paramList.add(stateMachineDesc);
		paramList.add(stateMachineStatus);
		paramList.add(stateMachineEvents);
		paramList.add(serialzedStateMachineGraph);
		paramList.add(stateMachineModel);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	// user admin service
	/**
	 * Returns the values to be inserted into activity table as a List
	 */
	public static List<Object> setActivityParams(Long activityId,
			String activityName, String activityDesc, String activityStatus,
			String createdBy, Timestamp createdDate, String modifiedBy,
			Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(activityId);
		paramList.add(activityName);
		paramList.add(activityDesc);
		paramList.add(activityStatus);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into user_role table as a List
	 */
	public static List<Object> setUserRoleParams(Long userId, Long roleId,
			String createdBy, Timestamp createdDate, String modifiedBy,
			Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(userId);
		paramList.add(roleId);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into role_activity table as a List
	 */
	public static List<Object> setRoleActivityParams(Long roleId,
			Long activityId, String createdBy, Timestamp createdDate,
			String modifiedBy, Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(roleId);
		paramList.add(activityId);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into users table as a List
	 */
	public static List<Object> setRoleParams(Long roleId, String roleName,
			String roleDesc, String roleStatus, String createdBy,
			Timestamp createdDate, String modifiedBy, Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(roleId);
		paramList.add(roleName);
		paramList.add(roleDesc);
		paramList.add(roleStatus);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into users table as a List
	 */
	public static List<Object> setUserParams(Long userId, String userName,
			String userFirstName, String userLastName, String emailId,
			String password, String userStatus, String createdBy,
			Timestamp createdDate, String modifiedBy, Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(userId);
		paramList.add(userName);
		paramList.add(userFirstName);
		paramList.add(userLastName);
		paramList.add(emailId);
		paramList.add(password);
		paramList.add(userStatus);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}

	// user authorization
	/**
	 * Returns the values to be inserted into method table as a List
	 */
	public static List<Object> setMethodParams(Long methodId,
			String methodName, String methodDesc, String createdBy,
			Timestamp createdDate, String modifiedBy, Timestamp modifiedDate,
			String serviceName) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(methodId);
		paramList.add(methodName);
		paramList.add(methodDesc);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		paramList.add(serviceName);
		return paramList;
	}

	/**
	 * Returns the values to be inserted into activity_method table as a List
	 */
	public static List<Object> setActivityMethodParams(Long activityId,
			Long methodId, String createdBy, Timestamp createdDate,
			String modifiedBy, Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(activityId);
		paramList.add(methodId);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}
	
	public static List<Object> setCacheReloadScheduleParams(String cacheName,
			String recurrenceType, String recurrenceConfig, String createdBy,
			Timestamp createdDate, String modifiedBy, Timestamp modifiedDate) {

		List<Object> paramList = new ArrayList<Object>();
		paramList.add(cacheName);
		paramList.add(recurrenceType);
		paramList.add(recurrenceConfig);
		paramList.add(createdBy);
		paramList.add(createdDate);
		paramList.add(modifiedBy);
		paramList.add(modifiedDate);
		return paramList;
	}
}

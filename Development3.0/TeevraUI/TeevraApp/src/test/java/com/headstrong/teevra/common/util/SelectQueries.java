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
 * $Id: SelectQueries.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 25, 2009 
 */

package com.headstrong.teevra.common.util;

/**
 * Contains all the Select queries
 */
public class SelectQueries {

	// app properties service

	// component service
	public static String check_components = "SELECT comp_id, comp_name, comp_ver_id, comp_status, comp_type, comp_desc, comp_deploy_date, "
			+ "comp_undeploy_date, comp_icon_image_ref, comp_config_ui, created_by, created_date, modified_by, "
			+ "modified_date, comp_image_ref, comp_service_name FROM component;";

	public static String check_component_configurations = "SELECT * FROM component_configuration";

	public static String check_component_table = "SELECT comp_template_id, comp_id, template_name, comp_service_configs, "
			+ "created_by, created_date, modified_by, modified_date FROM component_template;";

	// process service
	public static String check_process_data = "SELECT prcs_id, prcs_name, prcs_desc, prcs_status, prcs_grp_id, "
			+ "prcs_latest_version_id,prcs_recovery_enabled, prcs_is_template, prcs_graph, prcs_model, "
			+ "created_by, created_date, modified_by, modified_date FROM process; ";

	public static String check_process_service_configuration_data = "SELECT * FROM process_service_configuration";

	// process admin service
	public static String check_process_runtime_eventlog = "SELECT prcs_run_eventlog_id, prcs_run_id, prcs_event_type, "
			+ "prcs_event_time, prcs_event_source, prcs_event_category, prcs_event_desc, prcs_msg, created_by, "
			+ "created_date, modified_by, modified_date FROM process_runtime_eventlog;";

	public static String check_prcs_schedule = "SELECT prcs_id, recurrence_type, recurrence_config, "
			+ "created_by, created_date, modified_by, modified_date FROM process_schedule;";

	public static String check_process_runtime_data = "SELECT * FROM process_runtime";

	public static String check_message_eventlog_data = "SELECT * FROM message_eventlog";

	public static String check_process_server_data = "SELECT * FROM process_server";

	public static String check_process_schedule_data = "SELECT * FROM process_schedule";

	// refdata service
	public static String check_datasource_config = "SELECT datasource_id, datasource_name, db_url, db_username, db_password, db_type, "
			+ "created_by, created_date, modified_by, modified_date FROM datasource_config;";

	public static String check_refdata = "SELECT refdata_id, refdata_name, refdata_query, datasource_id, "
			+ "created_by, created_date, modified_by, modified_date FROM refdata_config;";
	
	public static String check_cache_reload_schedule = "SELECT cache_name, recurrence_type, recurrence_config, "
		+ "created_by, created_date, modified_by, modified_date FROM cache_reload_schedule;";

	// schema service
	public static String check_message_schema_attributes = "SELECT schema_attr_id, schema_id, schema_attr_name, "
			+ "schema_attr_type, schema_attr_is_key, schema_attr_relation, schema_m2m_type, created_by, "
			+ "created_date, modified_by, modified_date FROM message_schema_attribute;";

	public static String check_message_schema = "SELECT schema_id, schema_name, schema_desc, schema_is_primitive, "
			+ "parent_schema_id, created_by, created_date, modified_by, modified_date, schema_is_public "
			+ "FROM message_schema;";

	public static String check_message_schema_raw = "SELECT schema_id, schema_formatted_text, created_by, "
			+ "created_date, modified_by, modified_date FROM message_schema_raw;";

	// server admin service
	public static String check_process_server_configs = "SELECT prcs_server_id, prcs_id, server_id, "
			+ "created_by, created_date, modified_by, modified_date FROM process_server;";

	public static String check_server_configs = "SELECT server_id, server_name, server_url, created_by, "
			+ "created_date, modified_by, modified_date FROM server_configuration;";

	// state machine service
	public static String check_state_machine = "SELECT state_machine_id, state_machine_name, state_machine_desc, "
			+ "state_machine_status, state_machine_events, state_machine_graph, state_machine_model, created_by, "
			+ "created_date, modified_by, modified_date FROM state_machine;";

	// user admin service
	public static String check_role_activity = "SELECT role_id, activity_id, created_by, created_date, "
			+ "modified_by, modified_date FROM role_activity;";

	public static String check_roles = "SELECT role_id, role_name, role_desc, role_status, created_by, "
			+ "created_date, modified_by, modified_date FROM roles;";

	public static String check_user_role = "SELECT user_id, role_id, created_by, created_date, modified_by, "
			+ "modified_date FROM user_role;";

	public static String check_users = "SELECT user_id, user_name, user_first_name, user_last_name, email_id, "
			+ "pass_word, user_status, created_by, created_date, modified_by, modified_date FROM users;";

}

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
 * $Id: InsertQueries.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 25, 2009 
 */

package com.headstrong.teevra.common.util;

/**
 * Contains insert queries for all the tables
 */
public class InsertQueries {
	// teevra_sequence
	public static String insert_teevra_sequence = "INSERT INTO teevra_sequence( table_name, seq_value) "
			+ "VALUES (?, ?);";
	// app properties service
	public static String insert_property = "INSERT INTO t_property( property_id, property_name, property_value, "
			+ "property_desc, property_status, comments, created_by, created_date, modified_by, modified_date) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

	// component service
	public static String insert_component_configuration_Table = "INSERT INTO component_configuration( comp_config_id, comp_id, "
			+ "config_sequence_number, config_key, config_type, config_references, config_label, "
			+ "created_by, created_date, modified_by, modified_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	public static String insert_component_Table = "INSERT INTO component( comp_id, comp_name, comp_ver_id, "
			+ "comp_status, comp_type, comp_desc, comp_deploy_date, comp_undeploy_date, comp_icon_image_ref, "
			+ "comp_config_ui, created_by, created_date, modified_by, modified_date, comp_image_ref, "
			+ "comp_service_name) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	public static String insert_component_template = "INSERT INTO component_template( comp_template_id, comp_id, "
			+ "template_name, comp_service_configs, created_by, created_date, modified_by, modified_date) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

	// process service
	public static String insert_process = "INSERT INTO process(prcs_id, prcs_name, prcs_desc, prcs_status, prcs_grp_id,"
			+ "prcs_latest_version_id,prcs_is_template,prcs_recovery_enabled, prcs_graph, prcs_model, "
			+ "created_by, created_date,modified_by, modified_date, throttle_msg_count, throttle_time) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?);";
	public static String insert_process_service_configuration = "INSERT INTO process_service_configuration( "
			+ "prcs_id, property_id, property_config, service_id, service_type, property_simple_config) "
			+ "VALUES (?, ?, ?, ?, ?, ?);";

	// process admin service
	public static String insert_message_eventlog = "INSERT INTO message_eventlog(message_eventlog_id, prcs_run_id, "
			+ "message_id, sequence_id, total_sequence,savepoint_name, savepoint_time, log_message, "
			+ "created_by, created_date,modified_by, modified_date, message_data) "
			+ "VALUES (?, ?, ?, ?, ?,?, ?, ?, ?, ?,?, ?, ?);";
	public static String insert_process_runtime = "INSERT INTO process_runtime( prcs_run_id, prcs_id, prcs_ver_id, "
			+ "prcs_run_sequence, prcs_run_status, prcs_run_start_time, prcs_run_stop_time, prcs_msgs_recd, "
			+ "prcs_msgs_error, prcs_msgs_processed, created_by, created_date, modified_by, modified_date) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	public static String insert_process_schedule = "INSERT INTO process_schedule(prcs_id, recurrence_type, "
			+ "recurrence_config, created_by, created_date,modified_by, modified_date) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?);";
	public static String insert_process_runtime_eventlog = "INSERT INTO process_runtime_eventlog( prcs_run_eventlog_id, "
			+ "prcs_run_id, prcs_event_type, prcs_event_time, prcs_event_source, prcs_event_category, prcs_event_desc, "
			+ "prcs_msg, created_by, created_date, modified_by, modified_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

	// refdata service
	public static String insert_datasource_config = "INSERT INTO datasource_config(datasource_id, datasource_name, "
			+ "db_url, db_username, db_password,db_type, created_by, created_date, modified_by, modified_date) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	public static String insert_refdata_config = "INSERT INTO refdata_config( refdata_id, refdata_name, refdata_query, datasource_id,"
			+ " created_by, created_date, modified_by, modified_date) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	public static String insert_cache_reload_schedule = "INSERT INTO cache_reload_schedule(cache_name, recurrence_type, "
		+ "recurrence_config, created_by, created_date,modified_by, modified_date) "
		+ "VALUES (?, ?, ?, ?, ?, ?, ?);";

	// schema service
	public static String insert_message_schema = "INSERT INTO message_schema(schema_id, schema_name, schema_desc, "
			+ "schema_is_primitive, parent_schema_id, created_by, created_date, modified_by, modified_date, "
			+ "schema_is_public) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	public static String insert_message_schema_attribute = "INSERT INTO message_schema_attribute( schema_attr_id, "
			+ "schema_id, schema_attr_name, schema_attr_type, schema_attr_is_key, schema_attr_relation, schema_m2m_type, "
			+ "created_by, created_date, modified_by, modified_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
	public static String insert_message_schema_raw = "INSERT INTO message_schema_raw( schema_id, schema_formatted_text, "
			+ "created_by, created_date, modified_by, modified_date) VALUES (?, ?, ?, ?, ?, ?);";

	// server admin service
	public static String insert_process_server = "INSERT INTO process_server( prcs_server_id, prcs_id, server_id, "
			+ "created_by, created_date, modified_by, modified_date) VALUES (?, ?, ?, ?, ?, ?, ?);";
	public static String insert_server_config = "INSERT INTO server_configuration( server_id, server_name, "
			+ "server_url, created_by, created_date, modified_by, modified_date) VALUES (?, ?, ?, ?, ?, ?, ?);";

	// state machine service
	public static String insert_state_machine = "INSERT INTO state_machine( state_machine_id, state_machine_name, "
			+ "state_machine_desc, state_machine_status, state_machine_events, state_machine_graph, state_machine_model, "
			+ "created_by, created_date, modified_by, modified_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

	// user admin service
	public static String insert_activity = "INSERT INTO activity( activity_id, activity_name, activity_desc, "
			+ "activity_status, created_by, created_date, modified_by, modified_date) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
	public static String insert_user_role = "INSERT INTO user_role( user_id, role_id, created_by, created_date,"
			+ " modified_by, modified_date) VALUES (?, ?, ?, ?, ?, ?);";
	public static String insert_role_activity = "INSERT INTO role_activity(role_id, activity_id, created_by, "
			+ "created_date, modified_by,modified_date) VALUES (?, ?, ?, ?, ?, ?);";
	public static String insert_role = "INSERT INTO roles(role_id, role_name, role_desc, role_status, "
			+ "created_by, created_date,modified_by, modified_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
	public static String insert_user = "INSERT INTO users( user_id, user_name, user_first_name, user_last_name, "
			+ "email_id, pass_word, user_status, created_by, created_date, modified_by, modified_date) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

	// user authorization service
	public static String insert_method = "INSERT INTO method( method_id, method_name, method_desc, created_by, "
			+ "created_date, modified_by, modified_date, service_name) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
	public static String insert_activity_method = "INSERT INTO activity_method( activity_id, method_id, created_by, "
			+ "created_date, modified_by, modified_date) VALUES (?, ?, ?, ?, ?, ?);";

}

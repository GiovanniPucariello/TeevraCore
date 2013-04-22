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
 * $Id: DeleteQueries.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 25, 2009 
 */

package com.headstrong.teevra.common.util;

/**
 * Holds all the tables' delete queries
 */
public class DropQueries {

	// appproperties service
	public static final String drop_t_property_Table = "DROP TABLE t_property IF EXISTS;";

	// component service
	public static final String drop_component_Table = "DROP TABLE component_configuration IF EXISTS;"
			+ "DROP TABLE component IF EXISTS;";

	public static final String drop_component_configuration_Table = "DROP TABLE component_configuration IF EXISTS;";

	public static final String drop_component_template_Table = "DROP TABLE component_template IF EXISTS; ";

	// process service
	public static final String drop_process_Table = "DROP TABLE message_eventlog IF EXISTS;"
			+ "DROP TABLE process_runtime IF EXISTS;DROP TABLE process IF EXISTS;";

	public static final String drop_process_service_configuration = "DROP TABLE process_service_configuration IF EXISTS; ";

	// process admin service
	public static final String drop_message_eventlog_Table = "DROP TABLE message_eventlog IF EXISTS;";

	public static final String drop_process_runtime_Table = "DROP TABLE message_eventlog IF EXISTS;DROP TABLE process_runtime IF EXISTS;";

	public static final String drop_process_runtime_eventlog_Table = "DROP TABLE process_runtime_eventlog IF EXISTS; ";

	public static final String drop_process_schedule_Table = "DROP TABLE process_schedule IF EXISTS; ";

	// refdata service
	public static final String drop_datasource_config_Table = "DROP TABLE refdata_config IF EXISTS;DROP TABLE datasource_config IF EXISTS;";

	public static final String drop_refdata_config_Table = "DROP TABLE refdata_config IF EXISTS;";
	
	public static final String drop_cache_reload_schedule_Table = "DROP TABLE process_schedule IF EXISTS; ";

	// schema service
	public static final String drop_message_schema_attribute_Table = "DROP TABLE message_schema_attribute IF EXISTS; ";

	public static final String drop_message_schema_Table = "DROP TABLE message_schema_attribute IF EXISTS;DROP TABLE message_schema IF EXISTS;";

	public static final String drop_message_schema_raw_table = "DROP TABLE message_schema_raw IF EXISTS; ";

	// server admin service
	public static final String drop_process_server_Table = "DROP TABLE process_server IF EXISTS; ";

	public static final String drop_server_config_Table = "DROP TABLE process_server IF EXISTS;DROP TABLE server_configuration IF EXISTS; ";

	// state machine service
	public static final String drop_state_machine = "DROP TABLE state_machine IF EXISTS;";

	// user admin service
	public static final String drop_activity_Table = "DROP TABLE activity IF EXISTS;";

	public static final String drop_user_role_Table = "DROP TABLE user_role IF EXISTS;";

	public static final String drop_role_activity_Table = "DROP TABLE role_activity IF EXISTS;";

	public static final String drop_roles_Table = "DROP TABLE roles IF EXISTS;";

	public static final String drop_users_Table = "DROP TABLE users IF EXISTS;";

	// user authentication service
	public static final String drop_method_Table = "DROP TABLE method IF EXISTS; ";

	public static final String drop_activity_method_Table = "DROP TABLE activity_method IF EXISTS; ";

}

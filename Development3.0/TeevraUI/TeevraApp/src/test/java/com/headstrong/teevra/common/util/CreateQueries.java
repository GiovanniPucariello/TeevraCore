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
 * $Id: CreateQueries.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 25, 2009 
 */

package com.headstrong.teevra.common.util;

/**
 * Contains all the create queries
 */
public class CreateQueries {

	// appproperties service
	public static final String create_t_property_Table = "DROP TABLE t_property IF EXISTS;"
			+ "CREATE TABLE t_property ( property_id bigint NOT NULL,property_name varchar(50) NOT NULL, "
			+ "property_value varchar(50), property_desc varchar(200),property_status varchar(20) NOT NULL, "
			+ "comments varchar(200), created_by varchar(50) NOT NULL,created_date timestamp, "
			+ "modified_by varchar(50), modified_date timestamp, "
			+ "CONSTRAINT t_property_pkey PRIMARY KEY (property_id))";

	// component service
	public static final String create_component_Table = "DROP TABLE component_configuration IF EXISTS;"
			+ "DROP TABLE component IF EXISTS;"
			+ "CREATE TABLE component(comp_id bigint NOT NULL,comp_name varchar(100) NOT NULL,comp_ver_id varchar(20),"
			+ "comp_status varchar(10),comp_type varchar(20) ,comp_desc varchar(100),comp_deploy_date timestamp,comp_undeploy_date timestamp,"
			+ "comp_icon_image_ref varchar(50),comp_config_ui varchar(200),created_by varchar(50) NOT NULL,"
			+ "created_date timestamp NOT NULL,modified_by varchar(50),modified_date timestamp,comp_image_ref varchar(50),"
			+ "comp_service_name varchar(100) NOT NULL,CONSTRAINT component_pkey PRIMARY KEY (comp_id))";

	public static final String create_component_configuration_Table = "DROP TABLE component_configuration IF EXISTS;"
			+ "CREATE TABLE component_configuration(comp_config_id bigint NOT NULL,comp_id bigint,"
			+ "config_sequence_number bigint,config_key varchar(50),config_type varchar(50),config_references varchar(2056),"
			+ "config_label varchar(50),created_by varchar(50) NOT NULL,created_date timestamp NOT NULL,"
			+ "modified_by varchar(50),modified_date timestamp,"
			+ "CONSTRAINT component_configuration_pkey PRIMARY KEY (comp_config_id))";

	public static final String create_component_template_Table = "DROP TABLE component_template IF EXISTS; "
			+ "CREATE TABLE component_template ( comp_template_id bigint NOT NULL, comp_id bigint NOT NULL, "
			+ "template_name varchar(100) NOT NULL, comp_service_configs varchar(1024), "
			+ "created_by varchar(50), created_date timestamp, modified_by varchar(50), modified_date timestamp, "
			+ "CONSTRAINT component_template_pkey PRIMARY KEY (comp_template_id))";

	// process service
	public static final String create_process_Table = "DROP TABLE message_eventlog IF EXISTS;"
			+ "DROP TABLE process_runtime IF EXISTS;DROP TABLE process IF EXISTS;"
			+ "CREATE TABLE process(prcs_id bigint NOT NULL,prcs_name varchar(50) NOT NULL,"
			+ "prcs_desc varchar(200) NOT NULL,prcs_status varchar(50),prcs_grp_id bigint,prcs_latest_version_id bigint,"
			+ "prcs_is_template boolean ,prcs_recovery_enabled boolean default true, prcs_eventlog_reqd boolean default false,"
			+ "msg_eventlog_reqd boolean default false,comp_eventlog_enabled boolean default false,prcs_graph varchar(1024),prcs_model varchar(1024),"
			+ "created_by varchar(50) NOT NULL,created_date timestamp,modified_by varchar(50),"
			+ "modified_date timestamp, throttle_msg_count integer DEFAULT 0,"
			+ "throttle_time integer DEFAULT 0, CONSTRAINT process_pkey PRIMARY KEY (prcs_id))";

	public static final String create_process_service_configuration = "DROP TABLE process_service_configuration IF EXISTS; "
			+ "CREATE TABLE process_service_configuration ( prcs_id bigint NOT NULL, property_id varchar(50) NOT NULL, "
			+ "property_config varchar(1024) NOT NULL, service_id varchar(50) NOT NULL, service_type varchar(200), property_simple_config varchar(200), "
			+ "CONSTRAINT pk_prcs_service_conf PRIMARY KEY (prcs_id, service_id, property_id) )";

	// process admin service
	public static final String create_message_eventlog_Table = "DROP TABLE message_eventlog IF EXISTS;"
			+ "CREATE TABLE message_eventlog(message_eventlog_id bigint NOT NULL,prcs_run_id bigint,"
			+ "message_id bigint,sequence_id bigint,total_sequence bigint,savepoint_name varchar(50),"
			+ "savepoint_time timestamp,log_message varchar,"
			+ "created_by varchar(50) NOT NULL,created_date timestamp NOT NULL,modified_by varchar(50),"
			+ "modified_date timestamp,message_data varchar(1024),"
			+ "CONSTRAINT message_eventlog_pkey PRIMARY KEY (message_eventlog_id))";

	public static final String create_process_runtime_Table = "DROP TABLE message_eventlog IF EXISTS;DROP TABLE process_runtime IF EXISTS;"
			+ "CREATE TABLE process_runtime(prcs_run_id bigint NOT NULL,prcs_id bigint,prcs_ver_id bigint,"
			+ "prcs_run_sequence integer,prcs_run_status varchar(50) NOT NULL,prcs_run_start_time timestamp,"
			+ "prcs_run_stop_time timestamp,prcs_msgs_recd bigint,prcs_msgs_error bigint,prcs_msgs_processed bigint,"
			+ "created_by varchar(50),created_date timestamp,modified_by varchar(50),modified_date timestamp ,"
			+ "CONSTRAINT process_runtime_pkey PRIMARY KEY (prcs_run_id))";

	public static final String create_process_runtime_eventlog_Table = "DROP TABLE process_runtime_eventlog IF EXISTS; "
			+ "CREATE TABLE process_runtime_eventlog ( prcs_run_eventlog_id bigint NOT NULL, prcs_run_id bigint, "
			+ "prcs_event_type varchar(25), prcs_event_time timestamp, prcs_event_source varchar(50), "
			+ "prcs_event_category varchar(50), prcs_event_desc varchar(500), prcs_msg varchar(2000), "
			+ "created_by varchar(50) NOT NULL, created_date timestamp NOT NULL, modified_by varchar(50), modified_date timestamp, "
			+ "CONSTRAINT process_runtime_eventlog_pkey PRIMARY KEY (prcs_run_eventlog_id))";

	public static final String create_process_schedule_Table = "DROP TABLE process_schedule IF EXISTS; "
			+ "CREATE TABLE process_schedule(prcs_id bigint NOT NULL,recurrence_type varchar(20) DEFAULT 'DAILY',"
			+ "recurrence_config varchar(1024),created_by varchar(50) NOT NULL,"
			+ "created_date timestamp NOT NULL ,modified_by varchar(50),modified_date timestamp,"
			+ "CONSTRAINT process_schedule_pkey PRIMARY KEY (prcs_id))";

	// refdata service
	public static final String create_datasource_config_Table = "DROP TABLE refdata_config IF EXISTS;DROP TABLE datasource_config IF EXISTS;"
			+ "CREATE TABLE datasource_config(datasource_id bigint NOT NULL, datasource_name varchar(64) NOT NULL,"
			+ "db_url varchar(256) NOT NULL,db_username varchar(64) NOT NULL,db_password varchar(64) NOT NULL,"
			+ "db_type varchar(64) NOT NULL,"
			+ "created_by varchar(50) NOT NULL,created_date timestamp NOT NULL ,modified_by varchar(50),modified_date timestamp,"
			+ "CONSTRAINT datasource_config_pkey PRIMARY KEY (datasource_id))";

	public static final String create_refdata_config_Table = "DROP TABLE refdata_config IF EXISTS;"
			+ "CREATE TABLE refdata_config(refdata_id bigint NOT NULL, refdata_name varchar(64) NOT NULL,"
			+ "refdata_query varchar(1024) NOT NULL,datasource_id bigint,"
			+ "created_by varchar(50) NOT NULL,created_date timestamp NOT NULL ,modified_by varchar(50),modified_date timestamp,"
			+ " CONSTRAINT refdata_config_pkey PRIMARY KEY (refdata_id))";

	// schema service
	public static final String create_message_schema_attribute_Table = "DROP TABLE message_schema_attribute IF EXISTS; "
			+ "CREATE TABLE message_schema_attribute (schema_attr_id bigint NOT NULL, schema_id bigint NOT NULL, "
			+ "schema_attr_name varchar(100), schema_attr_type bigint, schema_attr_is_key boolean, schema_attr_relation varchar(3), "
			+ "schema_m2m_type bigint, created_by varchar(50) NOT NULL, created_date timestamp NOT NULL, "
			+ "modified_by varchar(50), modified_date timestamp, "
			+ "CONSTRAINT message_schema_attribute_pkey PRIMARY KEY (schema_attr_id))";

	public static final String create_message_schema_Table = "DROP TABLE message_schema_attribute IF EXISTS;DROP TABLE message_schema IF EXISTS;"
			+ "CREATE TABLE message_schema(schema_id bigint NOT NULL, schema_name varchar(50), schema_desc varchar(200), "
			+ "schema_is_primitive boolean, parent_schema_id bigint, created_by varchar(50) NOT NULL, "
			+ "created_date timestamp NOT NULL, modified_by varchar(50), modified_date timestamp, "
			+ "schema_is_public boolean NOT NULL, CONSTRAINT message_schema_pkey PRIMARY KEY (schema_id))";

	public static final String create_message_schema_raw_table = "DROP TABLE message_schema_raw IF EXISTS; "
			+ "CREATE TABLE message_schema_raw ( schema_id bigint NOT NULL, schema_formatted_text varchar(1024), c"
			+ "reated_by varchar(50) NOT NULL, created_date timestamp NOT NULL, modified_by varchar(50), modified_date timestamp, "
			+ "CONSTRAINT message_schema_raw_pkey PRIMARY KEY (schema_id) )";

	// server admin service
	public static final String create_process_server_Table = "DROP TABLE process_server IF EXISTS; "
			+ "CREATE TABLE process_server ( prcs_server_id bigint NOT NULL, prcs_id bigint NOT NULL, "
			+ "server_id bigint NOT NULL, created_by character varying(50) NOT NULL, "
			+ "created_date timestamp NOT NULL, modified_by character varying(50), modified_date timestamp, "
			+ "CONSTRAINT process_server_pkey PRIMARY KEY (prcs_server_id))";

	public static final String create_server_config_Table = "DROP TABLE process_server IF EXISTS;DROP TABLE server_configuration IF EXISTS; "
			+ "CREATE TABLE server_configuration ( server_id bigint NOT NULL, server_name character varying(50) NOT NULL, "
			+ "server_url character varying(100) NOT NULL, created_by character varying(50) NOT NULL, "
			+ "created_date timestamp NOT NULL, modified_by character varying(50), modified_date timestamp, "
			+ "CONSTRAINT server_configuration_pkey PRIMARY KEY (server_id) )";

	// state machine service
	public static final String create_state_machine = "DROP TABLE state_machine IF EXISTS;"
			+ "CREATE TABLE state_machine(state_machine_id bigint NOT NULL,state_machine_name varchar(50) NOT NULL,"
			+ "state_machine_desc varchar(50),state_machine_status varchar(20),state_machine_events varchar(4000),"
			+ "state_machine_graph varchar(4000),state_machine_model varchar(4000),created_by varchar(50) NOT NULL,"
			+ "created_date timestamp NOT NULL,modified_by varchar(50),modified_date timestamp,"
			+ "CONSTRAINT state_machine_pkey PRIMARY KEY (state_machine_id))";

	// user admin service
	public static final String create_activity_Table = "DROP TABLE activity IF EXISTS;"
			+ "CREATE TABLE activity(activity_id bigint NOT NULL,activity_name varchar(50) NOT NULL,activity_desc varchar(200),"
			+ "activity_status varchar(20) NOT NULL,created_by varchar(50) NOT NULL,created_date timestamp NOT NULL,"
			+ "modified_by varchar(50),modified_date timestamp,CONSTRAINT activity_pkey PRIMARY KEY (activity_id))";

	public static final String create_user_role_Table = "DROP TABLE user_role IF EXISTS;"
			+ "CREATE TABLE user_role(user_id bigint NOT NULL,role_id bigint NOT NULL,created_by varchar(50) NOT NULL,"
			+ "created_date timestamp NOT NULL,modified_by varchar(50),modified_date timestamp,"
			+ "CONSTRAINT pk_user_role PRIMARY KEY (user_id, role_id))";

	public static final String create_role_activity_Table = "DROP TABLE role_activity IF EXISTS;"
			+ "CREATE TABLE role_activity(role_id bigint NOT NULL,activity_id bigint NOT NULL,"
			+ "created_by character varying(50) NOT NULL,created_date timestamp NOT NULL,modified_by character varying(50),modified_date timestamp,"
			+ "CONSTRAINT pk_role_activity PRIMARY KEY (role_id, activity_id))";

	public static final String create_roles_Table = "DROP TABLE roles IF EXISTS;"
			+ "CREATE TABLE roles(role_id bigint NOT NULL,role_name varchar(50) NOT NULL,role_desc varchar(200),"
			+ "role_status varchar(20),created_by varchar(50) NOT NULL,created_date timestamp NOT NULL,"
			+ "modified_by varchar(50),modified_date timestamp,CONSTRAINT roles_pkey PRIMARY KEY (role_id))";

	public static final String create_users_Table = "DROP TABLE users IF EXISTS;"
			+ "CREATE TABLE users(user_id bigint NOT NULL,user_name varchar(20) NOT NULL,user_first_name varchar(50) NOT NULL,"
			+ "user_last_name varchar(50),email_id varchar(50),pass_word varchar(100),user_status varchar(20),"
			+ "created_by varchar(50) NOT NULL,created_date timestamp NOT NULL,modified_by varchar(50),modified_date timestamp,"
			+ "CONSTRAINT users_pkey PRIMARY KEY (user_id))";

	// user authentication service
	public static final String create_method_Table = "DROP TABLE method IF EXISTS; "
			+ "CREATE TABLE method ( method_id bigint NOT NULL, method_name varchar(50) NOT NULL, method_desc varchar(200), "
			+ "created_by varchar(50) NOT NULL, created_date timestamp NOT NULL, modified_by varchar(50), modified_date timestamp, "
			+ "service_name varchar(50), CONSTRAINT method_pkey PRIMARY KEY (method_id))";

	public static final String create_activity_method_Table = "DROP TABLE activity_method IF EXISTS; "
			+ "CREATE TABLE activity_method ( activity_id bigint NOT NULL, method_id bigint NOT NULL, "
			+ "created_by varchar(50) NOT NULL, created_date timestamp NOT NULL, modified_by varchar(50), modified_date timestamp, "
			+ "CONSTRAINT pk_activity_method PRIMARY KEY (activity_id, method_id))";
	
	public static final String create_cache_reload_schedule_Table = "DROP TABLE cache_reload_schedule IF EXISTS; "
		+ "CREATE TABLE cache_reload_schedule(cache_name varchar(50) NOT NULL,recurrence_type varchar(20) DEFAULT 'DAILY',"
		+ "recurrence_config varchar(1024),created_by varchar(50) NOT NULL,"
		+ "created_date timestamp NOT NULL ,modified_by varchar(50),modified_date timestamp,"
		+ "CONSTRAINT cache_reload_schedule_pkey PRIMARY KEY (cache_name))";

}

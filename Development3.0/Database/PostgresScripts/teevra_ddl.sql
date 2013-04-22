CREATE TABLE component
(
  comp_id bigint NOT NULL,
  comp_name character varying(100) NOT NULL,
  comp_ver_id character varying(20) DEFAULT '1.0'::character varying,
  comp_status character varying(10) DEFAULT 'ACTIVE'::character varying,
  comp_type character varying(20) DEFAULT 'FUNCTIONAL'::character varying,
  comp_desc character varying(100),
  comp_deploy_date timestamp with time zone,
  comp_undeploy_date timestamp with time zone,
  comp_icon_image_ref character varying(50),
  comp_config_ui character varying(200),
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  comp_image_ref character varying(50),
  comp_service_name character varying(100) NOT NULL DEFAULT 'test'::character varying,
  CONSTRAINT component_pkey PRIMARY KEY (comp_id),
  CONSTRAINT component_comp_name_comp_ver_id_key UNIQUE (comp_name, comp_ver_id),
  CONSTRAINT component_comp_status_check CHECK (comp_status::text = 'ACTIVE'::text OR comp_status::text = 'INACTIVE'::text),
  CONSTRAINT component_comp_type_check CHECK (comp_type::text = 'ENDPOINT'::text OR comp_type::text = 'PARSER'::text OR comp_type::text = 'FORMATTER'::text OR comp_type::text = 'SERVICE'::text OR comp_type::text = 'ROUTER'::text OR comp_type::text = 'ACTION'::text OR comp_type::text = 'ERRORREPORTER'::text OR comp_type::text = 'ERRHANDLER'::text)
)

/


CREATE TABLE component_configuration
(
  comp_config_id bigint NOT NULL,
  comp_id bigint,
  config_sequence_number bigint,
  config_key character varying(50),
  config_type character varying(50),
  config_references character varying(2056),
  config_label character varying(50),
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT component_configuration_pkey PRIMARY KEY (comp_config_id)
)

/



CREATE TABLE datasource_config
(
  datasource_id bigint NOT NULL,
  datasource_name character varying(64) NOT NULL,
  db_url character varying(256) NOT NULL,
  db_username character varying(64) NOT NULL,
  db_password character varying(64) NOT NULL,
  db_type character varying(64) NOT NULL,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50),
  modified_date timestamp with time zone,
  CONSTRAINT datasource_config_pkey PRIMARY KEY (datasource_id),
  CONSTRAINT datasource_config_datasource_name_key UNIQUE (datasource_name)
)

/



CREATE TABLE message_eventlog
(
  message_eventlog_id bigserial NOT NULL,
  prcs_run_id bigint,
  message_id bigint,
  sequence_id bigint,
  total_sequence bigint,
  savepoint_name character varying(50),
  savepoint_time timestamp with time zone DEFAULT now(),
  log_message character varying,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  message_data text,
  CONSTRAINT message_eventlog_pkey PRIMARY KEY (message_eventlog_id)
)

/


CREATE TABLE message_schema
(
  schema_id bigint NOT NULL,
  schema_name character varying(50),
  schema_desc character varying(200),
  schema_is_primitive boolean DEFAULT false,
  parent_schema_id bigint DEFAULT 0,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  schema_is_public boolean NOT NULL DEFAULT false,
  CONSTRAINT message_schema_pkey PRIMARY KEY (schema_id),
  CONSTRAINT message_schema_schema_name_key UNIQUE (schema_name)
)

/



CREATE TABLE message_schema_attr_persist_map
(
  schema_attr_id bigint NOT NULL,
  table_name character varying(50),
  column_name character varying(50),
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT message_schema_attr_persist_map_pkey PRIMARY KEY (schema_attr_id)
)

/



CREATE TABLE message_schema_attribute
(
  schema_attr_id bigint NOT NULL,
  schema_id bigint NOT NULL,
  schema_attr_name character varying(100),
  schema_attr_type bigint,
  schema_attr_is_key boolean DEFAULT false,
  schema_attr_relation character(3) DEFAULT '121'::bpchar,
  schema_m2m_type bigint DEFAULT 0,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT message_schema_attribute_pkey PRIMARY KEY (schema_attr_id), 
  CONSTRAINT message_schema_attribute_schema_attr_is_key_check CHECK (schema_attr_is_key = true OR schema_attr_is_key = false),
  CONSTRAINT message_schema_attribute_schema_attr_relation_check CHECK (schema_attr_relation = '121'::bpchar OR schema_attr_relation = '12M'::bpchar OR schema_attr_relation = 'M2M'::bpchar)
)

/



CREATE TABLE message_schema_persist_map
(
  schema_id bigint NOT NULL,
  table_name character varying(50),
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT message_schema_persist_map_pkey PRIMARY KEY (schema_id)
)

/



CREATE TABLE message_schema_raw
(
  schema_id bigint NOT NULL,
  schema_formatted_text text,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50),
  modified_date timestamp with time zone,
  CONSTRAINT message_schema_raw_pkey PRIMARY KEY (schema_id) 
)

/



CREATE TABLE process
(
  prcs_id bigint NOT NULL,
  prcs_name character varying(50) NOT NULL,
  prcs_desc character varying(200) NOT NULL,
  prcs_status character varying(50) DEFAULT 'UNPUBLISHED'::character varying,
  prcs_grp_id bigint DEFAULT 0,
  prcs_latest_version_id bigint DEFAULT 0,
  prcs_is_template boolean DEFAULT false,
  prcs_recovery_enabled boolean DEFAULT true,
  prcs_graph text,
  prcs_model text,
  prcs_eventlog_reqd boolean DEFAULT false,
  msg_eventlog_reqd boolean DEFAULT false,
  comp_eventlog_enabled boolean DEFAULT false,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  throttle_msg_count integer DEFAULT 0,
  throttle_time	     integer DEFAULT 0,
  CONSTRAINT process_pkey PRIMARY KEY (prcs_id),
  CONSTRAINT process_prcs_status_check CHECK (prcs_status::text = 'UNPUBLISHED'::text OR prcs_status::text = 'PUBLISHED'::text OR prcs_status::text = 'LOCKED'::text OR prcs_status::text = 'ARCHIVED'::text OR prcs_status::text = 'PUBLISHED-MODIFIED'::text)
)

/



CREATE TABLE process_component
(
  prcs_comp_id bigint NOT NULL,
  prcs_id bigint,
  comp_id bigint,
  comp_instance_id character varying(50),
  num_instances integer,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT process_component_pkey PRIMARY KEY (prcs_comp_id),
  CONSTRAINT process_component_prcs_comp_comp_instance_id_key UNIQUE (prcs_id, comp_id, comp_instance_id)
)

/



CREATE TABLE process_group
(
  prcs_grp_id bigint NOT NULL,
  prcs_grp_name character varying(50) NOT NULL,
  prcs_grp_desc character varying(200),
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT process_group_pkey PRIMARY KEY (prcs_grp_id)
)

/



CREATE TABLE process_runtime
(
  prcs_run_id bigint NOT NULL,
  prcs_id bigint,
  prcs_ver_id bigint,
  prcs_run_sequence integer,
  prcs_run_status character varying(50) NOT NULL DEFAULT 'STOPPED'::character varying,
  prcs_run_start_time timestamp with time zone,
  prcs_run_stop_time timestamp with time zone,
  prcs_msgs_recd bigint DEFAULT 0,
  prcs_msgs_error bigint DEFAULT 0,
  prcs_msgs_processed bigint DEFAULT 0,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT process_runtime_pkey PRIMARY KEY (prcs_run_id),
  CONSTRAINT process_runtime_prcs_id_key UNIQUE (prcs_id, prcs_run_sequence),
  CONSTRAINT process_runtime_prcs_run_status_check CHECK (prcs_run_status::text = 'STOPPED'::text OR prcs_run_status::text = 'RUNNING'::text OR prcs_run_status::text = 'SCHEDULED'::text OR prcs_run_status::text = 'ERROR'::text OR prcs_run_status::text = 'STARTING'::text OR prcs_run_status::text = 'STARTED'::text)
)

/



CREATE TABLE process_runtime_eventlog
(
  prcs_run_eventlog_id bigserial NOT NULL,
  prcs_run_id bigint,
  prcs_event_type character varying(25) DEFAULT 'INFO'::character varying,
  prcs_event_time timestamp with time zone DEFAULT now(),
  prcs_event_source character varying(50),
  prcs_event_category character varying(50),
  prcs_event_desc character varying(500),
  prcs_msg bytea,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT process_runtime_eventlog_pkey PRIMARY KEY (prcs_run_eventlog_id),
  CONSTRAINT process_runtime_eventlog_prcs_event_type_check CHECK (prcs_event_type::text = 'INFO'::text OR prcs_event_type::text = 'WARNING'::text OR prcs_event_type::text = 'ERROR'::text)
)

/



CREATE TABLE process_server
(
  prcs_server_id bigint NOT NULL,
  prcs_id bigint NOT NULL,
  server_id bigint NOT NULL,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50),
  modified_date timestamp with time zone,
  CONSTRAINT process_server_pkey PRIMARY KEY (prcs_server_id),
  CONSTRAINT process_server_prcs_id_key UNIQUE (prcs_id)
)

/



CREATE TABLE process_service_configuration
(
  prcs_id bigint NOT NULL,
  property_id character varying(50) NOT NULL,
  property_config text NOT NULL,
  service_id character varying(50) NOT NULL,
  service_type character varying(200),
  property_simple_config character varying(200),
  CONSTRAINT pk_prcs_service_conf PRIMARY KEY (prcs_id, service_id, property_id)
)

/



CREATE TABLE process_version
(
  prcs_ver_id bigint NOT NULL,
  prcs_id bigint NOT NULL,
  prcs_ver_name character varying(50),
  prcs_model bytea,
  prcs_graph bytea,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT process_version_pkey PRIMARY KEY (prcs_ver_id)
)

/



CREATE TABLE refdata_config
(
  refdata_id bigint NOT NULL,
  refdata_name character varying(64) NOT NULL,
  refdata_query character varying(1024) NOT NULL,
  datasource_id bigint,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50),
  modified_date timestamp with time zone,
  CONSTRAINT refdata_config_pkey PRIMARY KEY (refdata_id),
  CONSTRAINT refdata_config_refdata_name_key UNIQUE (refdata_name)
)

/




CREATE TABLE server_configuration
(
  server_id bigint NOT NULL,
  server_name character varying(50) NOT NULL,
  server_url character varying(100) NOT NULL,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50),
  modified_date timestamp with time zone,
  CONSTRAINT server_configuration_pkey PRIMARY KEY (server_id),
  CONSTRAINT server_configuration_server_name_key UNIQUE (server_name)
)

/



CREATE TABLE state_machine
(
  state_machine_id bigint NOT NULL,
  state_machine_name character varying(50) NOT NULL,
  state_machine_desc character varying(50),
  state_machine_status character varying(20),
  state_machine_events text,
  state_machine_graph text,
  state_machine_model text,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT state_machine_pkey PRIMARY KEY (state_machine_id),
  CONSTRAINT state_machine_state_machine_status_check CHECK (state_machine_status::text = 'UNPUBLISHED'::text OR state_machine_status::text = 'PUBLISHED'::text)
)

/



CREATE TABLE state_machine_exec
(
  state_machine_exec bytea,
  state_machine_exec_id character varying,
  payload character varying
)

/




CREATE TABLE component_template
(
  comp_template_id bigint NOT NULL,
  comp_id bigint NOT NULL,
  template_name character varying(100) NOT NULL,
  comp_service_configs text,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT component_template_pkey PRIMARY KEY (comp_template_id)
)

/



CREATE TABLE process_schedule
(
  prcs_id bigint NOT NULL,
  recurrence_type character varying(20) DEFAULT 'DAILY'::character varying,
  recurrence_config text,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT process_schedule_pkey PRIMARY KEY (prcs_id)
)

/



CREATE TABLE users
(
  user_id bigint NOT NULL,
  user_name character varying(20) NOT NULL,
  user_first_name character varying(50) NOT NULL,
  user_last_name character varying(50),
  email_id character varying(50),
  pass_word character varying(100),
  user_status character varying(20) DEFAULT 'ACTIVE'::character varying,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT users_pkey PRIMARY KEY (user_id),
  CONSTRAINT users_user_name_key UNIQUE (user_name),
  CONSTRAINT users_status_check CHECK (user_status::text = 'ACTIVE'::text OR user_status::text = 'INACTIVE'::text)
)

/



CREATE TABLE roles
(
  role_id bigint NOT NULL,
  role_name character varying(50) NOT NULL,
  role_desc character varying(200),
  role_status character varying(20) DEFAULT 'ACTIVE'::character varying,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT roles_pkey PRIMARY KEY (role_id),
  CONSTRAINT roles_role_name_key UNIQUE (role_name)
)

/



CREATE TABLE activity
(
  activity_id bigint NOT NULL,
  activity_name character varying(50) NOT NULL,
  activity_desc character varying(200),
  activity_status character varying(20) NOT NULL DEFAULT 'ACTIVE'::character varying,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT activity_pkey PRIMARY KEY (activity_id),
  CONSTRAINT activity_activity_name_key UNIQUE (activity_name)
)

/



CREATE TABLE method
(
  method_id bigint NOT NULL,
  method_name character varying(50) NOT NULL,
  method_desc character varying(200),
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  service_name character varying(50),
  CONSTRAINT method_pkey PRIMARY KEY (method_id),
  CONSTRAINT method_method_name_key UNIQUE (method_name)
)

/



CREATE TABLE user_role
(
  user_id bigint NOT NULL,
  role_id bigint NOT NULL,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT pk_user_role PRIMARY KEY (user_id, role_id)
)

/



CREATE TABLE role_activity
(
  role_id bigint NOT NULL,
  activity_id bigint NOT NULL,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT pk_role_activity PRIMARY KEY (role_id, activity_id)
)

/





CREATE TABLE activity_method
(
  activity_id bigint NOT NULL,
  method_id bigint NOT NULL,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT pk_activity_method PRIMARY KEY (activity_id, method_id)
)

/


CREATE TABLE teevra_sequence
(
  table_name character varying(50) NOT NULL,
  seq_value bigint,
  CONSTRAINT teevra_sequence_pkey PRIMARY KEY (table_name)
)

/



CREATE TABLE t_property
(
  property_id bigint NOT NULL,
  property_name character varying(50) NOT NULL,
  property_value character varying(50),
  property_desc character varying(200),
  property_status character varying(20) NOT NULL DEFAULT 'ACTIVE'::character varying,
  comments character varying(200),
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT t_property_pkey PRIMARY KEY (property_id),
  CONSTRAINT t_property_property_name_key UNIQUE (property_name),
  CONSTRAINT t_property_property_status_check CHECK (property_status::text = 'ACTIVE'::text OR property_status::text = 'INACTIVE'::text)
)

/

CREATE TABLE message_recovery_processed
(
  prcs_id character varying,
  prcs_run_id bigint,
  message_id bigint,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now()
)

/

CREATE TABLE message_recoverylog
(
  prcs_run_id integer,
  message_id integer,
  savepoint_name character varying,
  message_data bytea,
  prcs_id character varying,
  time_stamp timestamp with time zone,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now()
)

/

CREATE TABLE component_eventlog
(
  component_eventlog_id bigserial NOT NULL,
  prcs_run_id bigint,
  comp_service_name character varying(50),
  message_id bigint,
  savepoint_name character varying(50),
  savepoint_time time with time zone DEFAULT now(),
  log_message character varying,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT component_eventlog_pkey PRIMARY KEY (component_eventlog_id)
)

/

CREATE TABLE cache_reload_schedule
(
  cache_name character varying(255) NOT NULL,
  recurrence_type character varying(20) DEFAULT 'DAILY'::character varying,
  recurrence_config text,
  created_by character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date timestamp with time zone NOT NULL DEFAULT now(),
  modified_by character varying(50) DEFAULT 'system_user'::character varying,
  modified_date timestamp with time zone DEFAULT now(),
  CONSTRAINT cache_reload_schedule_pkey PRIMARY KEY (cache_name)
)

/

CREATE TABLE multicast_recProcessed
(
  prcs_id 	character varying(255) NOT NULL,
  prcs_run_id 	bigint NOT NULL,
  multicast_id 	character varying(255) NOT NULL,
  message_id 	bigint NOT NULL,
  endpoint_id 	character varying(255) NOT NULL,  
  created_by 	character varying(50) NOT NULL DEFAULT 'system_user'::character varying,
  created_date 	timestamp with time zone NOT NULL DEFAULT now(),
  modified_by 	character varying(50) DEFAULT 'system_user'::character varying,
  modified_date 	timestamp with time zone DEFAULT now(),
  CONSTRAINT 	multicast_recProcessed_pkey PRIMARY KEY (prcs_id, multicast_id, endpoint_id, prcs_run_id, message_id)
)

/


ALTER TABLE component_configuration
  ADD CONSTRAINT component_configuration_comp_id_fkey FOREIGN KEY (comp_id)
      REFERENCES component (comp_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
      
 /




ALTER TABLE message_schema_attribute
  ADD CONSTRAINT message_schema_attribute_schema_attr_type_fkey FOREIGN KEY (schema_attr_type)
      REFERENCES message_schema (schema_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
 /



ALTER TABLE message_schema_attribute
  ADD CONSTRAINT message_schema_attribute_schema_id_fkey FOREIGN KEY (schema_id)
      REFERENCES message_schema (schema_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
/



ALTER TABLE message_schema_raw
  ADD CONSTRAINT message_schema_raw_schema_id_fkey FOREIGN KEY (schema_id)
      REFERENCES message_schema (schema_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
/





ALTER TABLE process_server
  ADD CONSTRAINT process_server_prcs_id_fkey FOREIGN KEY (prcs_id)
      REFERENCES process (prcs_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
/

     
ALTER TABLE process_server
  ADD CONSTRAINT process_server_server_id_fkey FOREIGN KEY (server_id)
      REFERENCES server_configuration (server_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
 /



ALTER TABLE process_service_configuration
  ADD CONSTRAINT process_service_configuration_prcs_id_fkey FOREIGN KEY (prcs_id)
      REFERENCES process (prcs_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
      
/



ALTER TABLE refdata_config
  ADD CONSTRAINT refdata_config_datasource_id_fkey FOREIGN KEY (datasource_id)
      REFERENCES datasource_config (datasource_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
 /



ALTER TABLE component_template
  ADD CONSTRAINT component_template_comp_id_fkey FOREIGN KEY (comp_id)
      REFERENCES component (comp_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
 /



ALTER TABLE process_schedule
  ADD CONSTRAINT process_schedule_prcs_id_fkey FOREIGN KEY (prcs_id)
      REFERENCES process (prcs_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
 /



ALTER TABLE user_role
  ADD CONSTRAINT user_role_role_id_fkey FOREIGN KEY (role_id)
      REFERENCES roles (role_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
 /




ALTER TABLE user_role
  ADD CONSTRAINT user_role_user_id_fkey FOREIGN KEY (user_id)
      REFERENCES users (user_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
/




ALTER TABLE role_activity
  ADD CONSTRAINT role_activity_activity_id_fkey FOREIGN KEY (activity_id)
      REFERENCES activity (activity_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
/




ALTER TABLE role_activity
  ADD CONSTRAINT role_activity_role_id_fkey FOREIGN KEY (role_id)
      REFERENCES roles (role_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
 /





ALTER TABLE activity_method
  ADD CONSTRAINT activity_method_activity_id_fkey FOREIGN KEY (activity_id)
      REFERENCES activity (activity_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
/





ALTER TABLE activity_method
  ADD CONSTRAINT activity_method_method_id_fkey FOREIGN KEY (method_id)
      REFERENCES method (method_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
 /


ALTER TABLE process_runtime
	ADD CONSTRAINT process_runtime_prcs_id_fkey
	FOREIGN KEY(prcs_id)
	REFERENCES process(prcs_id)
 /



CREATE INDEX prcs_runid_message_eventlog ON message_eventlog(prcs_run_id)

/
create view process_runlog as (SELECT process.prcs_id,process.prcs_name,process.prcs_status,runtime.prcs_run_status,runtime.prcs_run_sequence,runtime.prcs_run_start_time,runtime.prcs_run_stop_time,(SELECT COUNT(DISTINCT mel.message_id)FROM message_eventlog mel WHERE mel.savepoint_name='RECEIVED' AND mel.prcs_run_id= runtime.prcs_run_id)AS prcs_msgs_recd,(SELECT COUNT(DISTINCT mel.message_id)FROM message_eventlog mel WHERE mel.savepoint_name='ERROR' AND mel.prcs_run_id= runtime.prcs_run_id)AS prcs_msgs_error,(SELECT COUNT(DISTINCT mel.message_id)FROM message_eventlog mel WHERE mel.savepoint_name='FINISHED' AND mel.prcs_run_id=runtime.prcs_run_id)AS prcs_msgs_processed,runtime.prcs_run_id FROM process_runtime runtime RIGHT OUTER JOIN process process ON runtime.prcs_id = process.prcs_id WHERE process.prcs_status IN ('PUBLISHED','LOCKED') AND( runtime.prcs_run_sequence IS NULL OR runtime.prcs_run_sequence = (SELECT MAX(B.prcs_run_sequence)FROM process_runtime B WHERE B.prcs_id = runtime.prcs_id )))

/
create view process_serverlog AS ( SELECT DISTINCT prcs_server.server_id ,server_config.server_name,prcs_server.prcs_id FROM process_server prcs_server,server_configuration server_config WHERE prcs_server.server_id = server_config.server_id )

/

CREATE TABLE activity ( 
	activity_id    	int NOT NULL,
	activity_name  	varchar2(50) NOT NULL,
	activity_desc  	varchar2(200) NULL,
	activity_status	varchar2(20) DEFAULT 'ACTIVE',
	created_by     	varchar2(50)  DEFAULT 'system_user',
	created_date   	timestamp  DEFAULT sysdate,
	modified_by    	varchar2(50)  DEFAULT 'system_user',
	modified_date  	timestamp  DEFAULT sysdate,
	PRIMARY KEY(activity_id)
)

/

 CREATE TABLE component ( 
	comp_id            	int NOT NULL,
	comp_name          	varchar2(100) NOT NULL,
	comp_ver_id        	varchar2(20)  DEFAULT '1.0',
	comp_status        	varchar2(10)  DEFAULT 'ACTIVE',
	comp_type          	varchar2(20)  DEFAULT 'FUNCTIONAL',
	comp_desc          	varchar2(100) NULL,
	comp_deploy_date   	timestamp NULL,
	comp_undeploy_date 	timestamp NULL,
	comp_icon_image_ref	varchar2(50) NULL,
	comp_config_ui     	varchar2(200) NULL,
	created_by         	varchar2(50) DEFAULT 'system_user',
	created_date       	timestamp DEFAULT sysdate,
	modified_by        	varchar2(50)  DEFAULT 'system_user',
	modified_date      	timestamp DEFAULT sysdate,
	comp_image_ref     	varchar2(50) NULL,
	comp_service_name  	varchar2(100)  DEFAULT 'test',
	PRIMARY KEY(comp_id)
)

/
	
CREATE TABLE component_configuration ( 
	comp_config_id        	Number NOT NULL,
	comp_id               	Number NULL,
	config_sequence_number	Number NULL,
	config_key            	varchar(50) NULL,
	config_type           	varchar(50) NULL,
	config_references     	varchar(2056) NULL,
	config_label          	varchar(50) NULL,
	created_by            	varchar(50) DEFAULT 'system_user',
	created_date          	timestamp  DEFAULT sysdate,
	modified_by           	varchar(50) DEFAULT 'system_user',
	modified_date         	timestamp  DEFAULT sysdate,
	PRIMARY KEY(comp_config_id)	
)

/

  CREATE TABLE component_template ( 
	comp_template_id    	Number NOT NULL,
	comp_id             	Number NOT NULL,
	template_name       	varchar2(100) NOT NULL,
	comp_service_configs	Long NULL,
	created_by          	varchar2(50) DEFAULT 'system_user',
	created_date        	timestamp  DEFAULT sysdate,
	modified_by         	varchar2(50)  DEFAULT 'system_user',
	modified_date       	timestamp  DEFAULT sysdate,
	PRIMARY KEY(comp_template_id)	
)
/

	
CREATE TABLE datasource_config ( 
	datasource_id  	Number NOT NULL,
	datasource_name	varchar2(64) NOT NULL,
	db_url         	varchar2(256) NOT NULL,
	db_username    	varchar2(64) NOT NULL,
	db_password    	varchar2(64) NOT NULL,
	db_type        	varchar2(64) NOT NULL,
	created_by     	varchar2(50) DEFAULT 'system_user',
	created_date   	timestamp DEFAULT sysdate,
	modified_by    	varchar2(50) NULL,
	modified_date  	timestamp NULL,
	PRIMARY KEY(datasource_id)	
)

/
	
CREATE TABLE message_eventlog ( 
	message_eventlog_id	Number NOT NULL,
	prcs_run_id        	Number NULL,
	message_id         	Number NULL,
	sequence_id        	Number NULL,
	total_sequence     	Number NULL,
	savepoint_name     	varchar2(50) NULL,
	savepoint_time     	timestamp DEFAULT sysdate,
	log_message        	varchar2(1024) NULL,
	created_by         	varchar2(50) DEFAULT 'system_user',
	created_date       	timestamp DEFAULT sysdate,
	modified_by        	varchar2(50) DEFAULT 'system_user',
	modified_date      	timestamp DEFAULT sysdate,
	message_data       	CLOB NULL,
	PRIMARY KEY(message_eventlog_id)
)

/

	
CREATE TABLE message_schema ( 
	schema_id          	Number NOT NULL,
	schema_name        	varchar2(50) NULL,
	schema_desc        	varchar2(200) NULL,
	schema_is_primitive	CHAR(1)  DEFAULT '0',
	parent_schema_id   	Number DEFAULT 0,
	created_by         	varchar2(50) DEFAULT 'system_user',
	created_date       	timestamp  DEFAULT sysdate,
	modified_by        	varchar2(50) DEFAULT 'system_user',
	modified_date      	timestamp DEFAULT sysdate,
	schema_is_public   	CHAR(1)   DEFAULT '0',
	PRIMARY KEY(schema_id)	
)

/

CREATE TABLE msg_schema_attr_persist_map ( 
	schema_attr_id	Number NOT NULL,
	table_name    	varchar2(50) NULL,
	column_name   	varchar2(50) NULL,
	created_by    	varchar2(50) DEFAULT 'system_user',
	created_date  	timestamp DEFAULT sysdate,
	modified_by   	varchar2(50) DEFAULT 'system_user',
	modified_date 	timestamp  DEFAULT SYSDATE,
	PRIMARY KEY(schema_attr_id)	
)

/

CREATE TABLE message_schema_attribute ( 
	schema_attr_id      	Number NOT NULL,
	schema_id           	Number NOT NULL,
	schema_attr_name    	varchar2(100) NULL,
	schema_attr_type    	Number NULL,
	schema_attr_is_key  	CHAR(1) DEFAULT '0',
	schema_attr_relation	char(3) DEFAULT '121',
	schema_m2m_type     	Number DEFAULT 0,
	created_by          	varchar2(50) DEFAULT 'system_user',
	created_date        	timestamp DEFAULT sysdate,
	modified_by         	varchar2(50) DEFAULT 'system_user',
	modified_date       	timestamp DEFAULT sysdate,
	PRIMARY KEY(schema_attr_id)	
)

/
	
CREATE TABLE message_schema_persist_map ( 
	schema_id    	Number NOT NULL,
	table_name   	varchar2(50) NULL,
	created_by   	varchar2(50) DEFAULT 'system_user',
	created_date 	timestamp DEFAULT sysdate,
	modified_by  	varchar2(50) DEFAULT 'system_user',
	modified_date	timestamp DEFAULT sysdate,
	PRIMARY KEY(schema_id)
 )

/
  
CREATE TABLE message_schema_raw ( 
  	schema_id            	Number NOT NULL,
  	schema_formatted_text	CLOB NULL,
  	created_by           	varchar2(50)  DEFAULT 'system_user',
  	created_date         	timestamp  DEFAULT sysdate,
  	modified_by          	varchar2(50) NULL,
  	modified_date        	timestamp NULL,
	PRIMARY KEY(schema_id)	
)

/
	
CREATE TABLE process ( 
	prcs_id               	Number NOT NULL,
	prcs_name             	varchar2(50) NOT NULL,
	prcs_desc             	varchar2(200) ,
	prcs_status           	varchar2(50) DEFAULT 'UNPUBLISHED',
	prcs_grp_id           	Number  DEFAULT 0,
	prcs_latest_version_id	Number  DEFAULT 0,
	created_by            	varchar2(50)  DEFAULT 'system_user',
	created_date          	timestamp  DEFAULT sysdate,
	modified_by           	varchar2(50)  DEFAULT 'system_user',
	modified_date         	timestamp DEFAULT sysdate,
	prcs_is_template      	CHAR(1) DEFAULT '0',
	prcs_recovery_enabled   CHAR(1) DEFAULT '1',
  	prcs_eventlog_reqd      CHAR(1) DEFAULT '0',
  	msg_eventlog_reqd       CHAR(1) DEFAULT '0',
        comp_eventlog_enabled   CHAR(1) DEFAULT '0',
	prcs_graph            	CLOB NULL,
	prcs_model            	CLOB NULL,
	throttle_msg_count	int 	DEFAULT 0,
	throttle_time		int 	DEFAULT 0,
	PRIMARY KEY(prcs_id)	
)

/
	
CREATE TABLE process_component ( 
	prcs_comp_id    	NUMBER NOT NULL,
	prcs_id         	NUMBER NULL,
	comp_id         	NUMBER NULL,
	comp_instance_id	varchar2(50) NULL,
	num_instances   	NUMBER NULL,
	created_by      	varchar2(50) DEFAULT 'system_user',
	created_date    	timestamp  DEFAULT sysdate,
	modified_by     	varchar2(50)  DEFAULT 'system_user',
	modified_date   	timestamp  DEFAULT sysdate,
	PRIMARY KEY(prcs_comp_id)
)

/

CREATE TABLE process_group ( 
	prcs_grp_id	Number NOT NULL,
	prcs_grp_name	varchar2(50) NOT NULL,
	prcs_grp_desc	varchar2(200) NULL,
	created_by	varchar2(50) DEFAULT 'system_user',
	created_date	timestamp  DEFAULT sysdate,
	modified_by	varchar2(50) DEFAULT 'system_user',
	modified_date	timestamp  DEFAULT sysdate,
	PRIMARY KEY(prcs_grp_id)
)

/

CREATE TABLE process_runtime ( 
      prcs_run_id        	Number NOT NULL,
      prcs_id            	Number NULL,
      prcs_ver_id        	Number NULL,
      prcs_run_sequence  	Number NULL,
      prcs_run_status    	varchar2(50) DEFAULT 'STOPPED',
      prcs_run_start_time	timestamp NULL,
      prcs_run_stop_time 	timestamp NULL,
      prcs_msgs_recd     	Number  DEFAULT 0,
      prcs_msgs_error    	Number  DEFAULT 0,
      prcs_msgs_processed	Number DEFAULT 0,
      created_by         	varchar2(50) DEFAULT 'system_user',
      created_date       	timestamp DEFAULT sysdate,
      modified_by        	varchar2(50) DEFAULT 'system_user',
      modified_date      	timestamp DEFAULT sysdate,
    PRIMARY KEY(prcs_run_id)	
)

/

CREATE TABLE process_runtime_eventlog ( 
	prcs_run_eventlog_id	Number ,
	prcs_run_id         	Number NULL,
	prcs_event_type     	varchar2(25) DEFAULT 'INFO',
	prcs_event_time     	timestamp  DEFAULT sysdate,
	prcs_event_source   	varchar2(50) NULL,
	prcs_event_category 	varchar2(50) NULL,
	prcs_event_desc     	varchar2(500) NULL,
	prcs_msg            	blob NULL,
	created_by          	varchar2(50) DEFAULT 'system_user',
	created_date        	timestamp DEFAULT sysdate,
	modified_by         	varchar2(50)  DEFAULT 'system_user',
	modified_date       	timestamp  DEFAULT sysdate,
	PRIMARY KEY(prcs_run_eventlog_id)
)

/

CREATE TABLE process_schedule ( 
	prcs_id          	Number NOT NULL,
	recurrence_type  	varchar2(20)  DEFAULT 'DAILY',
	recurrence_config	CLOB NULL,
	created_by       	varchar2(50)  DEFAULT 'system_user',
	created_date     	timestamp  DEFAULT sysdate,
	modified_by      	varchar2(50)  DEFAULT 'system_user',
	modified_date    	timestamp  DEFAULT sysdate,
	PRIMARY KEY(prcs_id)
)

/

CREATE TABLE process_server ( 
	prcs_server_id	Number NOT NULL,
	prcs_id       	Number NOT NULL,
	server_id     	Number NOT NULL,
	created_by    	varchar2(50)  DEFAULT 'system_user',
	created_date  	timestamp  DEFAULT sysdate,
	modified_by   	varchar2(50) NULL,
	modified_date 	timestamp NULL,
	PRIMARY KEY(prcs_server_id)
)

/

CREATE TABLE process_service_configuration ( 
	prcs_id               	Number NOT NULL,
	property_id           	varchar2(50) NOT NULL,
	property_config       	CLOB NOT NULL,
	service_id            	varchar2(50) NOT NULL,
	service_type          	varchar2(200) NULL,
	property_simple_config	varchar2(200) NULL,
	PRIMARY KEY(prcs_id,property_id,service_id)
)

/

CREATE TABLE process_version ( 
	prcs_ver_id  	Number NOT NULL,
	prcs_id      	Number NOT NULL,
	prcs_ver_name	varchar2(50) NULL,
	prcs_model   	CLOB NULL,
	prcs_graph   	CLOB NULL,
	created_by   	varchar2(50) DEFAULT 'system_user',
	created_date 	timestamp  DEFAULT sysdate,
	modified_by  	varchar2(50)  DEFAULT 'system_user',
	modified_date	timestamp  DEFAULT sysdate,
	PRIMARY KEY(prcs_ver_id)
)

/

CREATE TABLE refdata_config ( 
	refdata_id   	Number NOT NULL,
	refdata_name 	varchar2(64) NOT NULL,
	refdata_query	varchar2(1024) NOT NULL,
	datasource_id	Number NULL,
	created_by   	varchar2(50) DEFAULT 'system_user',
	created_date 	timestamp DEFAULT sysdate,
	modified_by  	varchar2(50) NULL,
	modified_date	timestamp NULL,
	PRIMARY KEY(refdata_id)
)

/

CREATE TABLE role_activity ( 
	role_id      	Number NOT NULL,
	activity_id  	Number NOT NULL,
	created_by   	varchar2(50)  DEFAULT 'system_user',
	created_date 	timestamp DEFAULT sysdate,
	modified_by  	varchar2(50) DEFAULT 'system_user',
	modified_date	timestamp DEFAULT sysdate,
	PRIMARY KEY(activity_id,role_id)
)

/

CREATE TABLE roles ( 
	role_id      	Number NOT NULL,
	role_name    	varchar2(50) NOT NULL,
	role_desc    	varchar2(200) NULL,
	role_status  	varchar2(20)  DEFAULT 'ACTIVE',
	created_by   	varchar2(50)  DEFAULT 'system_user',
	created_date 	timestamp DEFAULT sysdate,
	modified_by  	varchar2(50) DEFAULT 'system_user',
	modified_date	timestamp DEFAULT sysdate,
	PRIMARY KEY(role_id)
)

/

CREATE TABLE server_configuration ( 
	server_id    	Number NOT NULL,
	server_name  	varchar2(50) NOT NULL,
	server_url   	varchar2(100) NOT NULL,
	created_by   	varchar2(50)  DEFAULT 'system_user',
	created_date 	timestamp DEFAULT sysdate,
	modified_by  	varchar2(50) NULL,
	modified_date	timestamp NULL,
	PRIMARY KEY(server_id)
)

/

CREATE TABLE state_machine ( 
	state_machine_id    	Number NOT NULL,
	state_machine_name  	varchar2(50) NOT NULL,
	state_machine_desc  	varchar2(50) NULL,
	state_machine_status	varchar2(20) NULL,
	state_machine_events	CLOB NULL,
	state_machine_graph 	CLOB NULL,
	state_machine_model 	CLOB NULL,
	created_by          	varchar2(50) DEFAULT 'system_user',
	created_date        	timestamp DEFAULT sysdate,
	modified_by         	varchar2(50) DEFAULT 'system_user',
	modified_date       	timestamp DEFAULT sysdate,
	PRIMARY KEY(state_machine_id)
)

/

CREATE TABLE state_machine_exec ( 
	state_machine_exec   	BLOB NULL,
	state_machine_exec_id	CHAR(1) NULL,
	payload              	CHAR(1) NULL 
)

/

CREATE TABLE user_role ( 
	user_id      	Number NOT NULL,
	role_id      	Number NOT NULL,
	created_by   	varchar2(50) DEFAULT 'system_user',
	created_date 	timestamp DEFAULT sysdate,
	modified_by  	varchar2(50) DEFAULT 'system_user',
	modified_date	timestamp DEFAULT sysdate,
	PRIMARY KEY(role_id,user_id)
)

/

CREATE TABLE users ( 
	user_id        	Number NOT NULL,
	user_name      	varchar2(20) NOT NULL,
	user_first_name	varchar2(50) NOT NULL,
	user_last_name 	varchar2(50) NULL,
	email_id       	varchar2(50) NULL,
	pass_word      	varchar2(128) NULL,
	user_status    	varchar2(20) DEFAULT 'ACTIVE',
	created_by     	varchar2(50) DEFAULT 'system_user',
	created_date   	timestamp DEFAULT sysdate,
	modified_by    	varchar2(50) DEFAULT 'system_user',
	modified_date  	timestamp DEFAULT sysdate,
	PRIMARY KEY(user_id)
)

/

CREATE TABLE method ( 
	method_id    	Number  NOT NULL,
	method_name     varchar2(50)  NOT NULL,
	method_desc	varchar2(200)  NULL,
	service_name    varchar2(200) null,
	created_by     	varchar2(50)  DEFAULT  'system_user',
	created_date   	timestamp  DEFAULT  sysdate,
	modified_by    	varchar2(50)  DEFAULT  'system_user',
	modified_date  	timestamp  DEFAULT  sysdate,
	PRIMARY KEY(method_id)
)

/
CREATE TABLE activity_method ( 
	activity_id      	Number  NOT NULL,
	method_id  	Number  NOT NULL,
	created_by   	varchar2(50)  DEFAULT  'system_user',
	created_date 	timestamp DEFAULT  sysdate,
	modified_by  	varchar2(50) DEFAULT  'system_user',
	modified_date	timestamp DEFAULT  sysdate,
	PRIMARY KEY(activity_id,method_id)
)

/
CREATE TABLE teevra_sequence ( 
	table_name    	varchar2(50) NOT NULL,
	seq_value  	int,
	PRIMARY KEY(table_name)
)


/
CREATE TABLE t_property ( 
                property_id        Number  NOT NULL,
                property_name    varchar2(50)  NOT NULL,
                property_value   varchar2(50)  NULL,
                property_desc  varchar2(200)  NULL,
                property_status varchar2(20) null,
                comments        varchar2(200) null,
                created_by         varchar2(50)  DEFAULT  'system_user',
                created_date   timestamp  DEFAULT  sysdate,
                modified_by      varchar2(50)  DEFAULT  'system_user',
                modified_date                  timestamp  DEFAULT  sysdate,
                PRIMARY KEY(property_id)
)

/

CREATE TABLE message_recovery_processed
(
  prcs_id varchar2(64),
  prcs_run_id NUMBER,
  message_id NUMBER,
  created_by     varchar2(50)  DEFAULT  'system_user',
  created_date   timestamp  DEFAULT  sysdate,
  modified_by    varchar2(50)  DEFAULT  'system_user',
  modified_date  timestamp  DEFAULT  sysdate
)

/

CREATE TABLE message_recoverylog
(
  prcs_run_id NUMBER,
  message_id NUMBER,
  savepoint_name varchar2(128),
  message_data BLOB,
  prcs_id varchar2(64),
  time_stamp timestamp  DEFAULT  sysdate,
  created_by     varchar2(50)  DEFAULT  'system_user',
  created_date   timestamp  DEFAULT  sysdate,
  modified_by    varchar2(50)  DEFAULT  'system_user',
  modified_date  timestamp  DEFAULT  sysdate
  
)

/

CREATE TABLE component_eventlog ( 
	component_eventlog_id	Number ,
	prcs_run_id         	Number NULL,
	comp_service_name     	varchar2(25) DEFAULT 'INFO',
	message_id         	Number NULL,
	savepoint_name     	varchar2(50) NULL,
	savepoint_time     	timestamp DEFAULT sysdate,
	log_message        	varchar2(1024) NULL,
	created_by         	varchar2(50) DEFAULT 'system_user',
	created_date       	timestamp DEFAULT sysdate,
	modified_by        	varchar2(50) DEFAULT 'system_user',
	modified_date      	timestamp DEFAULT sysdate,
	PRIMARY KEY(component_eventlog_id)
)

/
CREATE TABLE cache_reload_schedule ( 
	cache_name          	varchar2(255) NOT NULL,
	recurrence_type  	varchar2(20)  DEFAULT 'DAILY',
	recurrence_config	CLOB NULL,
	created_by       	varchar2(50)  DEFAULT 'system_user',
	created_date     	timestamp  DEFAULT sysdate,
	modified_by      	varchar2(50)  DEFAULT 'system_user',
	modified_date    	timestamp  DEFAULT sysdate,
	PRIMARY KEY(cache_name)
)

/

CREATE TABLE multicast_recProcessed
(
  prcs_id 		varchar2(255) NOT NULL,
  prcs_run_id 	Number NOT NULL,
  multicast_id 	varchar2(255) NOT NULL,
  message_id 	Number NOT NULL,
  endpoint_id 	varchar2(255) NOT NULL, 
  created_by 	varchar2(50) DEFAULT 'system_user',
  created_date 	timestamp DEFAULT sysdate,
  modified_by 	varchar2(50) DEFAULT 'system_user',
  modified_date 	timestamp DEFAULT sysdate,
  PRIMARY KEY 	(prcs_id, multicast_id, endpoint_id, prcs_run_id, message_id)
)

/


ALTER TABLE activity
	ADD CONSTRAINT activity_activity_name_key 
	UNIQUE (activity_name)
	
/
ALTER TABLE component
	ADD CONSTRAINT component_comp_type_check
	CHECK (comp_type IN('ENDPOINT','PARSER','FORMATTER','SERVICE','ROUTER','ACTION','ERRHANDLER','ERRORREPORTER'))
/
ALTER TABLE component
	ADD CONSTRAINT component_comp_status_check
	CHECK (comp_status IN ('ACTIVE','INACTIVE'))
/
ALTER TABLE component
	ADD CONSTRAINT comp_name_comp_ver_id_key
	UNIQUE (comp_name, comp_ver_id)
	
/
ALTER TABLE datasource_config
	ADD CONSTRAINT ds_config_ds_name_key
	UNIQUE (datasource_name)
	
/
ALTER TABLE message_schema
	ADD CONSTRAINT msg_schema_schema_name_key
	UNIQUE (schema_name)
	
/
ALTER TABLE message_schema_attribute
	ADD CONSTRAINT msg_schm_atb_schm_attr_reln
	CHECK (schema_attr_relation IN('121','12M','M2M'))
/
ALTER TABLE message_schema_attribute
	ADD CONSTRAINT mesg_schm_atb_schm_attr_key
	CHECK (schema_attr_is_key IN('1','0'))
/
ALTER TABLE process
	ADD CONSTRAINT process_prcs_status_check
	CHECK (prcs_status IN ('UNPUBLISHED','PUBLISHED','LOCKED','ARCHIVED','PUBLISHED-MODIFIED'))
/
ALTER TABLE process_component
	ADD CONSTRAINT prcs_comp_prcs_comp_id_key
	UNIQUE (comp_id, comp_instance_id, prcs_id)
	
/
ALTER TABLE process_runtime
	ADD CONSTRAINT procs_rtime_prcs_run_sts_check
	CHECK (prcs_run_status IN ('STOPPED','RUNNING','SCHEDULED','ERROR','STARTING','STARTED'))
/
ALTER TABLE process_runtime
	ADD CONSTRAINT process_runtime_prcs_id_key
	UNIQUE (prcs_id, prcs_run_sequence)
	
/
ALTER TABLE process_runtime_eventlog
	ADD CONSTRAINT procs_rt_elog_prcs_evnt_check
	CHECK (prcs_event_type IN ('INFO','WARNING','ERROR'))
/
ALTER TABLE process_server
	ADD CONSTRAINT process_server_prcs_id_key
	UNIQUE (prcs_id)
	
/
ALTER TABLE refdata_config
	ADD CONSTRAINT refdat_config_refdat_name_key
	UNIQUE (refdata_name)
	
/
ALTER TABLE roles
	ADD CONSTRAINT roles_role_name_key
	UNIQUE (role_name)
	
/
ALTER TABLE server_configuration
	ADD CONSTRAINT serv_config_serv_name_key
	UNIQUE (server_name)
	
/
ALTER TABLE state_machine
	ADD CONSTRAINT st_machine_st_machine_status
	CHECK (state_machine_status IN('UNPUBLISHED','PUBLISHED'))
/
ALTER TABLE users
	ADD CONSTRAINT users_status_check
	CHECK (user_status IN ('ACTIVE','INACTIVE'))
/
ALTER TABLE users
	ADD CONSTRAINT users_user_name_key
	UNIQUE (user_name)
	
/
ALTER TABLE role_activity
	ADD CONSTRAINT role_activity_activity_id_fkey
	FOREIGN KEY(activity_id)
	REFERENCES activity(activity_id)
	
/
ALTER TABLE component_configuration
	ADD CONSTRAINT comp_config_comp_id_fkey
	FOREIGN KEY(comp_id)
	REFERENCES component(comp_id)

/






ALTER TABLE process_runtime
	ADD CONSTRAINT process_runtime_prcs_id_fkey
	FOREIGN KEY(prcs_id)
	REFERENCES process(prcs_id)

/







ALTER TABLE component_template
	ADD CONSTRAINT comp_temp_comp_id_fkey
	FOREIGN KEY(comp_id)
	REFERENCES component(comp_id)

/
ALTER TABLE refdata_config
	ADD CONSTRAINT refdata_config_ds_id_fkey
	FOREIGN KEY(datasource_id)
	REFERENCES datasource_config(datasource_id)

/
ALTER TABLE message_schema_attribute
	ADD CONSTRAINT msg_schm_attrib_schm_id_fkey
	FOREIGN KEY(schema_id)
	REFERENCES message_schema(schema_id)

/
ALTER TABLE message_schema_attribute
	ADD CONSTRAINT msg_schm_schm_atb_type_fkey
	FOREIGN KEY(schema_attr_type)
	REFERENCES message_schema(schema_id)

/
ALTER TABLE message_schema_raw
	ADD CONSTRAINT msg_schm_raw_schm_id_fkey
	FOREIGN KEY(schema_id)
	REFERENCES message_schema(schema_id)

/

ALTER TABLE process_schedule
	ADD CONSTRAINT process_schd_prcs_id_fkey
	FOREIGN KEY(prcs_id)
	REFERENCES process(prcs_id)

/
ALTER TABLE process_server
	ADD CONSTRAINT process_server_prcs_id_fkey
	FOREIGN KEY(prcs_id)
	REFERENCES process(prcs_id)

/
ALTER TABLE process_service_configuration
	ADD CONSTRAINT prcs_ser_config_prcs_id_fkey
	FOREIGN KEY(prcs_id)
	REFERENCES process(prcs_id)

/

ALTER TABLE role_activity
	ADD CONSTRAINT role_activity_role_id_fkey
	FOREIGN KEY(role_id)
	REFERENCES roles(role_id)

/
ALTER TABLE user_role
	ADD CONSTRAINT user_role_role_id_fkey
	FOREIGN KEY(role_id)
	REFERENCES roles(role_id)

/
ALTER TABLE process_server
	ADD CONSTRAINT process_server_server_id_fkey
	FOREIGN KEY(server_id)
	REFERENCES server_configuration(server_id)

/
ALTER TABLE user_role
	ADD CONSTRAINT user_role_user_id_fkey
	FOREIGN KEY(user_id)
	REFERENCES users(user_id)

/
ALTER TABLE method
  	ADD CONSTRAINT method_method_name_key 
 	  UNIQUE (method_name)

/

ALTER TABLE t_property
  ADD CONSTRAINT t_property_name_key UNIQUE(property_name)

/

ALTER TABLE t_property  
	ADD CONSTRAINT t_property_status_check 
	CHECK (property_status IN ('ACTIVE','INACTIVE'))
/

CREATE SEQUENCE message_eventlog_id_SEQ
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE

/

CREATE SEQUENCE procs_rtime_eventlog_id_SEQ
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE

/

CREATE SEQUENCE component_eventlog_id_SEQ
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE

/

CREATE OR REPLACE TRIGGER message_eventlog_id_trig 
 BEFORE INSERT  
 ON message_eventlog  
 FOR EACH ROW  
 BEGIN  
 SELECT message_eventlog_id_SEQ.NEXTVAL INTO :NEW.message_eventlog_id FROM DUAL; 
 END;

/

CREATE OR REPLACE TRIGGER procs_rt_eventlog_id_trig 
 BEFORE INSERT 
 ON process_runtime_eventlog  
 FOR EACH ROW 
 BEGIN  
 SELECT procs_rtime_eventlog_id_SEQ.NEXTVAL INTO :NEW.prcs_run_eventlog_id FROM DUAL; 
 END;

/

CREATE OR REPLACE TRIGGER component_eventlog_id_trig 
 BEFORE INSERT 
 ON component_eventlog  
 FOR EACH ROW 
 BEGIN  
 SELECT component_eventlog_id_SEQ.NEXTVAL INTO :NEW.component_eventlog_id FROM DUAL; 
 END;

/

CREATE INDEX prcs_runid_message_eventlog ON message_eventlog(prcs_run_id)
/
create view process_runlog as (SELECT process.prcs_id,process.prcs_name,process.prcs_status,runtime.prcs_run_status,runtime.prcs_run_sequence,runtime.prcs_run_start_time,runtime.prcs_run_stop_time,(SELECT COUNT(DISTINCT mel.message_id)FROM message_eventlog mel WHERE mel.savepoint_name='RECEIVED' AND mel.prcs_run_id= runtime.prcs_run_id)AS prcs_msgs_recd,(SELECT COUNT(DISTINCT mel.message_id)FROM message_eventlog mel WHERE mel.savepoint_name='ERROR' AND mel.prcs_run_id= runtime.prcs_run_id)AS prcs_msgs_error,(SELECT COUNT(DISTINCT mel.message_id)FROM message_eventlog mel WHERE mel.savepoint_name='FINISHED' AND mel.prcs_run_id=runtime.prcs_run_id)AS prcs_msgs_processed,runtime.prcs_run_id FROM process_runtime runtime RIGHT OUTER JOIN process process ON runtime.prcs_id = process.prcs_id WHERE process.prcs_status IN ('PUBLISHED','LOCKED') AND( runtime.prcs_run_sequence IS NULL OR runtime.prcs_run_sequence = (SELECT MAX(B.prcs_run_sequence)FROM process_runtime B WHERE B.prcs_id = runtime.prcs_id )))

/
create view process_serverlog AS ( SELECT DISTINCT prcs_server.server_id ,server_config.server_name,prcs_server.prcs_id FROM process_server prcs_server,server_configuration server_config WHERE prcs_server.server_id = server_config.server_id )

/

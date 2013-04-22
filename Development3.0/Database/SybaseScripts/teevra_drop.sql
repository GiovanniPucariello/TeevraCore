DROP INDEX prcs_runid_message_eventlog
/
ALTER TABLE activity
	DROP CONSTRAINT activity_activity_name_key   
/
ALTER TABLE component
	DROP CONSTRAINT component_comp_type_check   
/
ALTER TABLE component
	DROP CONSTRAINT component_comp_status_check   
/
ALTER TABLE component
	DROP CONSTRAINT comp_name_comp_ver_id_key   
/
ALTER TABLE datasource_config
	DROP CONSTRAINT ds_config_ds_name_key   
/
ALTER TABLE message_schema
	DROP CONSTRAINT msg_schema_schema_name_key   
/
ALTER TABLE message_schema_attribute
	DROP CONSTRAINT msg_schm_atb_schm_attr_reln   
/
ALTER TABLE message_schema_attribute
	DROP CONSTRAINT mesg_schm_atb_schm_attr_key   
/
ALTER TABLE process
	DROP CONSTRAINT process_prcs_status_check   
/
ALTER TABLE process_component
	DROP CONSTRAINT prcs_comp_prcs_comp_id_key   
/
ALTER TABLE process_runtime
	DROP CONSTRAINT procs_rtime_prcs_run_sts_check	
/
ALTER TABLE process_runtime
	DROP CONSTRAINT process_runtime_prcs_id_key   
/
ALTER TABLE process_runtime_eventlog
	DROP CONSTRAINT procs_rt_elog_prcs_evnt_check   
/
ALTER TABLE process_server
	DROP CONSTRAINT process_server_prcs_id_key   
/
ALTER TABLE refdata_config
	DROP CONSTRAINT refdat_config_refdat_name_key   
/
ALTER TABLE roles
	DROP CONSTRAINT roles_role_name_key   
/
ALTER TABLE server_configuration
	DROP CONSTRAINT serv_config_serv_name_key   
/
ALTER TABLE state_machine
	DROP CONSTRAINT st_machine_st_machine_status   
/
ALTER TABLE role_activity
	DROP CONSTRAINT role_activity_activity_id_fkey   
/
ALTER TABLE component_configuration
	DROP CONSTRAINT comp_config_comp_id_fkey   
/
ALTER TABLE component_template
	DROP CONSTRAINT comp_temp_comp_id_fkey   
/
ALTER TABLE refdata_config
	DROP CONSTRAINT refdata_config_ds_id_fkey   
/
ALTER TABLE message_schema_attribute
	DROP CONSTRAINT msg_schm_attrib_schm_id_fkey   
/
ALTER TABLE message_schema_attribute
	DROP CONSTRAINT msg_schm_schm_atb_type_fkey   
/
ALTER TABLE message_schema_raw
	DROP CONSTRAINT msg_schm_raw_schm_id_fkey   
/
ALTER TABLE process_schedule
	DROP CONSTRAINT process_schd_prcs_id_fkey   
/
ALTER TABLE process_server
	DROP CONSTRAINT process_server_prcs_id_fkey   
/
ALTER TABLE process_service_configuration
	DROP CONSTRAINT prcs_ser_config_prcs_id_fkey   
/
ALTER TABLE role_activity
	DROP CONSTRAINT role_activity_role_id_fkey   
/
ALTER TABLE user_role
	DROP CONSTRAINT user_role_role_id_fkey   
/
ALTER TABLE process_server
	DROP CONSTRAINT process_server_server_id_fkey   
/
ALTER TABLE user_role
	DROP CONSTRAINT user_role_user_id_fkey   
/
ALTER TABLE method 
	DROP CONSTRAINT method_method_name_key
/
ALTER TABLE t_property 
	DROP CONSTRAINT t_property_name_key
/
ALTER TABLE t_property 
	DROP CONSTRAINT t_property_status_check
/
ALTER TABLE users
	DROP CONSTRAINT users_user_name_key   
/
ALTER TABLE users
	DROP CONSTRAINT users_status_check   
/


DROP SEQUENCE HIBERNATE_SEQUENCE
/
DROP SEQUENCE message_eventlog_id_SEQ
/
DROP SEQUENCE procs_rtime_eventlog_id_SEQ
/


DROP VIEW process_runlog
/
DROP VIEW process_serverlog
/

DROP TABLE activity 
/
DROP TABLE component_eventlog 
/
DROP TABLE component
/
DROP TABLE component_configuration 
/
DROP TABLE component_template 
/
DROP TABLE datasource_config 
/
DROP TABLE message_eventlog 
/
DROP TABLE message_recoverylog 
/
DROP TABLE message_schema 
/
DROP TABLE msg_schema_attr_persist_map 
/
DROP TABLE message_schema_attribute 
/
DROP TABLE message_schema_persist_map 
/
DROP TABLE message_schema_raw 
/
DROP TABLE process 
/
DROP TABLE process_component 
/
DROP TABLE process_group 
/
DROP TABLE process_runtime 
/
DROP TABLE process_runtime_eventlog 
/
DROP TABLE process_schedule 
/
DROP TABLE process_server 
/
DROP TABLE process_service_configuration 
/
DROP TABLE process_version 
/
DROP TABLE refdata_config 
/
DROP TABLE role_activity 
/
DROP TABLE roles 
/
DROP TABLE server_configuration 
/
DROP TABLE state_machine 
/
DROP TABLE state_machine_exec 
/

DROP TABLE user_role 
/
DROP TABLE users 

/
DROP TABLE method
/
DROP TABLE activity_method
/
DROP TABLE teevra_sequence
/

DROP TABLE t_property
/
DROP TABLE message_recovery_processed
/
DROP TABLE cache_reload_schedule
/
DROP TABLE multicast_recProcessed
/
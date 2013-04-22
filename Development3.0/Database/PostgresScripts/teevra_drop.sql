
ALTER TABLE component_configuration DROP CONSTRAINT component_configuration_comp_id_fkey
/
ALTER TABLE message_schema_attribute DROP CONSTRAINT message_schema_attribute_schema_attr_type_fkey
/
ALTER TABLE message_schema_attribute DROP CONSTRAINT message_schema_attribute_schema_id_fkey
/
ALTER TABLE message_schema_raw DROP CONSTRAINT message_schema_raw_schema_id_fkey
/
ALTER TABLE process_server DROP CONSTRAINT process_server_prcs_id_fkey
/
ALTER TABLE process_server DROP CONSTRAINT process_server_server_id_fkey
/
ALTER TABLE process_service_configuration DROP CONSTRAINT process_service_configuration_prcs_id_fkey
/
ALTER TABLE refdata_config DROP CONSTRAINT refdata_config_datasource_id_fkey
/
ALTER TABLE component_template DROP CONSTRAINT component_template_comp_id_fkey
/
ALTER TABLE process_schedule DROP CONSTRAINT process_schedule_prcs_id_fkey
/
ALTER TABLE user_role DROP CONSTRAINT user_role_role_id_fkey
/
ALTER TABLE user_role DROP CONSTRAINT user_role_user_id_fkey
/
ALTER TABLE role_activity DROP CONSTRAINT role_activity_activity_id_fkey
/
ALTER TABLE role_activity DROP CONSTRAINT role_activity_role_id_fkey
/
ALTER TABLE activity_method DROP CONSTRAINT activity_method_activity_id_fkey
/
ALTER TABLE activity_method DROP CONSTRAINT activity_method_method_id_fkey
/


DROP INDEX prcs_runid_message_eventlog
/

DROP VIEW process_runlog
/
DROP VIEW process_serverlog
/


DROP TABLE IF EXISTS component_eventlog
/

DROP TABLE IF EXISTS component
/
DROP TABLE IF EXISTS component_configuration
/
DROP TABLE IF EXISTS datasource_config
/
DROP TABLE IF EXISTS message_eventlog
/
DROP TABLE IF EXISTS message_recoverylog
/
DROP TABLE IF EXISTS message_schema
/
DROP TABLE IF EXISTS message_schema_attr_persist_map
/
DROP TABLE IF EXISTS message_schema_attribute
/
DROP TABLE IF EXISTS message_schema_persist_map
/
DROP TABLE IF EXISTS message_schema_raw
/
DROP TABLE IF EXISTS process
/
DROP TABLE IF EXISTS process_component
/
DROP TABLE IF EXISTS process_group
/
DROP TABLE IF EXISTS process_runtime
/
DROP TABLE IF EXISTS process_runtime_eventlog
/
DROP TABLE IF EXISTS process_server
/
DROP TABLE IF EXISTS process_service_configuration
/
DROP TABLE IF EXISTS process_version
/
DROP TABLE IF EXISTS refdata_config
/
DROP TABLE IF EXISTS server_configuration
/
DROP TABLE IF EXISTS state_machine
/
DROP TABLE IF EXISTS state_machine_exec
/
DROP TABLE IF EXISTS component_template
/
DROP TABLE IF EXISTS process_schedule
/
DROP TABLE IF EXISTS users
/
DROP TABLE IF EXISTS user_role
/
DROP TABLE IF EXISTS roles
/
DROP TABLE IF EXISTS role_activity
/
DROP TABLE IF EXISTS activity
/
DROP TABLE IF EXISTS activity_method
/
DROP TABLE IF EXISTS method
/
DROP TABLE IF EXISTS teevra_sequence
/
DROP TABLE IF EXISTS t_property
/

DROP TABLE message_recovery_processed

/
DROP TABLE message_recoverylog
/
DROP  TRIGGER message_eventlog_id_trig 
/

DROP  TRIGGER procs_rt_eventlog_id_trig 
/
DROP TABLE IF EXISTS cache_reload_schedule
/
DROP TABLE multicast_recProcessed
/


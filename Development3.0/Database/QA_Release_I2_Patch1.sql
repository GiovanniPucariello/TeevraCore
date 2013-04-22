UPDATE component
   SET comp_service_name='SOCKET'
 WHERE comp_name='TCP Endpoint';

INSERT INTO component_configuration(
            comp_config_id, comp_id, config_sequence_number, config_key, 
            config_type,  config_label)
    VALUES (48,24, 6,'retryCount', 
            'TEXT', 'Retry Count');

INSERT INTO component_configuration(
            comp_config_id, comp_id, config_sequence_number, config_key, 
            config_type,  config_label)
    VALUES (49,24, 7,'retryTimeout', 
            'TEXT', 'Retry Timeout');

INSERT INTO component_configuration(
            comp_config_id, comp_id, config_sequence_number, config_key, 
            config_type,  config_label)
    VALUES (50,24, 8,'windowSize', 
            'TEXT', 'Window Size');

update component_configuration
set config_key='host' where comp_id=24 and config_sequence_number=1;

       

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
 * $Id: TeevraUIController.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Oct 21, 2008  
 */
package com.headstrong.teevra.client.control 
/**
 * 
 */
{
	import com.adobe.cairngorm.control.FrontController;
	import com.headstrong.teevra.client.commands.*;
	import com.headstrong.teevra.client.events.*;
	public class TeevraUIController extends FrontController 
	{
		public function TeevraUIController() 
		{
			this.initialize();
		}		
		public function initialize():void 
		{
			
			this.addCommand(ProcessStatusEvent.PROCESSSTATUSEVENT,ProcessStatusCommand);
			this.addCommand(ViewProcessEvent.VIEW_PROCESS_EVENT, ViewProcessCommand);			
			this.addCommand(ViewSchemaEvent.VIEWSCHEMAEVENT,ViewSchemaCommand);
			this.addCommand(GetSchemasEvent.GET_SCHEMAS_EVENT,GetSchemasCommand);
			this.addCommand(ViewComponentEvent.VIEWCOMPONENTEVENT,ViewComponentCommand);
			this.addCommand(ErrorReportingEvent.ERROR_REPORTING_EVENT,ErrorReportingCommand);
			this.addCommand(FileUploaderEvent.FILEUPLOADEREVENT,FileUploaderCommand);
			this.addCommand(GetPrcsRunMessageEvent.GET_PRCSRUN_MESSAGEE_EVENT,GetPrcsRunMessageCommand);
			this.addCommand(DataSourceConfigEvent.DATA_SOURCE_CONFIG_EVENT,DataSourceConfigCommand);
			this.addCommand(RefDataConfigEvent.REF_DATA_CONFIG_EVENT,RefDataConfigCommand);
			this.addCommand(ViewStateMachineEvent.VIEW_STATE_MACHINE_EVENT,ViewStateMachineCommand);
			this.addCommand(ComponentTemplateEvent.COMPONENT_TEMPLATE_EVENT, ComponentTemplateCommand);
			this.addCommand(ProcessServiceEvent.PROCESS_SERVICE_EVENT,ProcessServiceCommand);
			this.addCommand(ComponentServiceEvent.COMPONENT_SERVICE_EVENT,ComponentServiceCommand);
			this.addCommand(SchemaServiceEvent.SCHEMA_SERVICE_EVENT,SchemaServiceCommand);
			this.addCommand(StateMachineServiceEvent.STATE_MACHINE_EVENT,StateMachineServiceCommand);
			this.addCommand(ProcessAdminServiceEvent.PROCESS_ADMIN_SERVICE_EVENT,ProcessAdminServiceCommand);
			this.addCommand(ServerAdminServiceEvent.SERVER_ADMIN_SERVICE_EVENT,ServerAdminServiceCommand);
			this.addCommand(RefDataServiceEvent.REF_DATA_SERVICE_EVENT,RefDataServiceCommand);
			this.addCommand(ViewServerConfigurationEvent.SERVER_CONFIG_EVENT,ViewServerConfigurationCommand);
			this.addCommand(ViewUserEvent.VIEW_USER_EVENT, ViewUserCommand);	
			this.addCommand(ViewRoleEvent.VIEW_ROLE_EVENT, ViewRoleCommand);	
			this.addCommand(UserAuthenticationEvent.USER_AUTHENTICATION_EVENT,UserAuthenticationCommand);
			this.addCommand(LoginScreenEvent.VIEW_LOGIN_EVENT,LoginScreenCommand);
			this.addCommand(UserAdminServiceEvent.USER_ADMIN_SERVICE_EVENT, UserAdminServiceCommand);
			this.addCommand(AppPropertiesServiceEvent.APP_PROPERTIES_SERVICE_EVENT,AppPropertiesServiceCommand);
		}		
	}
}
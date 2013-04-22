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
 * $Id: SchemaServiceCommand.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Apr 08, 2009  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.SchemaServiceDelegate;
	import com.headstrong.teevra.client.events.SchemaServiceEvent;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.entity.SchemaVO;
	
	public class SchemaServiceCommand implements ICommand
	{
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		public function SchemaServiceCommand()
		{
		}
		public function execute( event : CairngormEvent ): void
		{
			var schemaServiceEvent:SchemaServiceEvent= SchemaServiceEvent(event);
			var delegate : SchemaServiceDelegate = new SchemaServiceDelegate( schemaServiceEvent.resultHandler );
			
			
			switch (SchemaServiceEvent.currentCommand)
			{
				case SchemaServiceEvent.NEW_SCHEMA_COMMAND:
					modelLocator.loadModule(ViewModelLocator.NEW_SCHEMA_SWF);
					modelLocator.screenName="Process Modeling > View Schemas > New Schema";
					break;
					
				case SchemaServiceEvent.DELETE_SCHEMA_COMMAND:
					delegate.deleteSchema(Number(schemaServiceEvent.getArgument(SchemaServiceEvent.DELETE_SCHEMA_ID)));
					break;
					
				
				case SchemaServiceEvent.GET_SCHEMA_COMMAND:
					var schemaVO:SchemaVO = new SchemaVO();
					schemaVO.schemaId = Number(schemaServiceEvent.getArgument(SchemaServiceEvent.GET_SCHEMA_ID));
					delegate.findSchemas(schemaVO);
					break;
				
				case SchemaServiceEvent.VIEW_SCHEMA_COMMAND:
					delegate.getPublicSchemas();
					break;
					
				case SchemaServiceEvent.SAVE_SCHEMA_COMMAND:
					delegate.saveXMLSchema(SchemaVO(schemaServiceEvent.getArgument(SchemaServiceEvent.SAVE_SCHEMA_ID)),String(schemaServiceEvent.getArgument(SchemaServiceEvent.SAVE_SCHEMA_XMLSTRING)));
					break;
			}
		}
	}
}
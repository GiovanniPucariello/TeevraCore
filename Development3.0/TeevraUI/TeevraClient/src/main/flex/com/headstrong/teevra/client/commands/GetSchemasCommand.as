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
 * $Id: ViewProcessCommand.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 1, 2008  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.SchemaServiceDelegate;
	import com.headstrong.teevra.client.model.SchemaCache;
	import com.headstrong.teevra.client.util.AlertHelper;
	
	import mx.collections.ArrayCollection;
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	
	/**
	 * GetSchemasCommand calls the SchemaServiceDelegate's getSchemas
	 * for getting the schemas details
	 * 
	 * @author PAakash
	 * 
	 */
	public class GetSchemasCommand implements ICommand, IResponder
	{
		public function GetSchemasCommand()
		{
		}
		
		/**
		 * execute calls the SchemaServiceDelegate's getSchemas
	 	 * for getting the schemas details 
		 * 
		 * @param event
		 * 
		 */
		public function execute( event : CairngormEvent ): void
		{
			var delegate : SchemaServiceDelegate = new SchemaServiceDelegate( this );
			delegate.getSchemas();
		}
		
		/**
		 * executed if delegator's getSchemas successful in getting the schemas details 
		 * 
		 * @param data
		 * 
		 */
		public function result( data : Object ) : void
		{			
			var schemas : ArrayCollection = ArrayCollection( data.result );
//			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
//			viewModel.getSchemas = schemas;
			
			SchemaCache.getInstance().loadSchema(schemas);
		}
		
		/**
		 * executed if delegator's getSchemas failed in getting the schemas details 
		 * 
		 * @param info
		 * 
		 */
		public function fault( info : Object ) : void
		{
			AlertHelper.displayFault(info,"Schemas could not be retrieved");
		}
	}
}
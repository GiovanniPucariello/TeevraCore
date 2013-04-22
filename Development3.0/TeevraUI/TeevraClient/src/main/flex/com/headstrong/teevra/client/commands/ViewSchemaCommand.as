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
 * $Author: PAakash
 * $DateTime: Oct 21, 2008  
 */
package com.headstrong.teevra.client.commands
/**
 * 
 */
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.SchemaServiceDelegate;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.AlertHelper;
	
	import mx.collections.ICollectionView;
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	
	/**
	 * ViewSchemaCommand calls the SchemaServiceDelegate's getPublicSchemas
	 * for getting the published schema
	 * 
	 * @author PAakash
	 * 
	 */
	public class ViewSchemaCommand implements ICommand, IResponder
	{
	  	/**
	  	 * ViewSchemaCommand constructor
	  	 * 
	  	 */
	  	public function ViewSchemaCommand()
		{	 
		}
		/**
		 * execute calls the delegator's getPublicSchemas
		 * for getting the information for the publised schema
		 * 
		 * @param event
		 * 
		 */
		public function execute( event : CairngormEvent ): void
		{	
			var delegate : SchemaServiceDelegate = new SchemaServiceDelegate( this );
			delegate.getPublicSchemas();
		}
		/**
		 * executed if delegator's getPublicSchemas successful in geting the 
		 * information for the published schema
		 * 
		 * @param data
		 * 
		 */
		public function result( data : Object ) : void
		{
			var viewSchema : ICollectionView = ICollectionView( data.result );
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			viewModel.viewSchema = viewSchema;
			
			viewModel.loadModule(ViewModelLocator.VIEW_SCHEMA_SWF);
			viewModel.screenName = "Process Modeling > View Schema";
		}
		/**
		 * executed if delegator's getPublicSchemas failed in geting the 
		 * information for the published schema 
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
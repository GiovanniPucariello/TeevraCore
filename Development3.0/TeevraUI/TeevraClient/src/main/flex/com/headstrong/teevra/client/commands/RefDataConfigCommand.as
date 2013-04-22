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
 * $Id: RefDataConfigCommand.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 24, 2008  
 */
package com.headstrong.teevra.client.commands
/**
 * 
 */
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.RefDataServiceDelegate;
	import com.headstrong.teevra.client.events.DataSourceConfigEvent;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.AlertHelper;
	
	import mx.collections.ICollectionView;
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	
	/**
	 * RefDataConfigCommand calls the RefDataServiceDelegate's getRefDataConfigs
	 * for getting the Red data config commands
	 * 
	 * @author PAakash
	 * 
	 */
	public class RefDataConfigCommand implements ICommand, IResponder
	{
	  	public function RefDataConfigCommand()
		{	 
		}
		/**
		 * execute calls the RefDataServiceDelegate's getRefDataConfigs
	 	 * for getting the Red data config commands 
		 * 
		 * @param event
		 * 
		 */
		public function execute( event : CairngormEvent ): void
		{	
			var delegate : RefDataServiceDelegate = new RefDataServiceDelegate( this );
			delegate.getRefDataConfigs();
		}
		/**
		 * executed if delegator's  getRefDataConfigs successful in getting the ref data config
		 * 
		 * @param data
		 * 
		 */
		public function result( data : Object ) : void
		{
			var refDataConfigs : ICollectionView = ICollectionView( data.result );
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			viewModel.refDataConfigs = refDataConfigs;
			
			viewModel.loadModule(ViewModelLocator.REF_DATA_CONFIG_EVENT);
			viewModel.screenName = "Administration > Reference Data Configurations";
			
			//to store the data source configs in cache
			var isDataSourceConfigEvent:Boolean = false;
			var dataSourceNamesEvent:DataSourceConfigEvent = new DataSourceConfigEvent(isDataSourceConfigEvent);
			dataSourceNamesEvent.dispatch();
		}
		/**
		 * executed if delegator's  getRefDataConfigs failed in getting the ref data config 
		 * 
		 * @param info
		 * 
		 */
		public function fault( info : Object ) : void
		{
			AlertHelper.displayFault(info,"Reference Data Configurations could not be retrieved");
		}
	}
}
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
 * $Id: DataSourceConfigCommand.as
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
	import com.headstrong.teevra.client.model.DataSourceCache;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.AlertHelper;
	
	import mx.collections.ICollectionView;
	import mx.rpc.IResponder;
	
	/**
	 * ComponentSaveCommand calls the RefDataServiceDelegate's getDataSourceConfigs
	 * for getting the Data source configuration
	 * 
	 * @author PAakash
	 * 
	 */
	public class DataSourceConfigCommand implements ICommand, IResponder
	{
	  	private var isDataSourceConfigEvent:Boolean;
	  	
	  	public function DataSourceConfigCommand()
		{	 
		}
		/**
		 * execute calls the getDataSourceConfigs for getting the Data source configuration
		 * 
		 * @param event
		 * 
		 */
		public function execute( event : CairngormEvent ): void
		{	
			isDataSourceConfigEvent = (event as DataSourceConfigEvent).isDataSourceConfigEvent;
			var delegate : RefDataServiceDelegate = new RefDataServiceDelegate( this );
			delegate.getDataSourceConfigs();
		}
		/**
		 *executed if delegator's  getDataSourceConfigs successful for getting the data source configuration
		 * @param data
		 * 
		 */
		public function result( data : Object ) : void
		{
			var dataSourceConfigs : ICollectionView = ICollectionView( data.result );
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
					
			if(isDataSourceConfigEvent)
			{
				viewModel.loadModule(ViewModelLocator.DATA_SOURCE_CONFIG_EVENT);
				viewModel.screenName = "Administration > Data Source Configurations";
				viewModel.dataSourceConfigs = dataSourceConfigs;
			}
			else
			{
				DataSourceCache.getInstance().loadDataSourceConfigs(dataSourceConfigs);
			}
		}
		/**
		 * executed if delegator's  getDataSourceConfigs failed for getting the data source configuration 
		 * @param info
		 * 
		 */
		public function fault( info : Object ) : void
		{
			AlertHelper.displayFault(info,"Data Source Configurations could not be retrieved");
		}
	}
}
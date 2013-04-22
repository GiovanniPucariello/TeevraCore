/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright �?© 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: ServerConfigurationCommand.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Feb 10, 2009  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.ServerAdminServiceDelegate;
	import com.headstrong.teevra.client.events.ViewServerConfigurationEvent;
	import com.headstrong.teevra.client.model.ServerCache;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.AlertHelper;
	
	import mx.collections.ICollectionView;
	import mx.collections.Sort;
	import mx.collections.SortField;
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	
	/**
	 * ViewServerConfigurationEvent calls the delegator ServerAdminService's getServerConfig
	 * for getting the server 
	 * 
	 * @author PAakash
	 * 
	 */
	public class ViewServerConfigurationCommand implements ICommand, IResponder
	{
		private var isServerAdminFlag:Boolean;
		
		public function ViewServerConfigurationCommand()
		{
		}
		/**
		 * calls the ServerAdminServiceDelegate's getServerConfigs
		 * for getting server configuration
		 * 
		 * @param event
		 * 
		 */
		public function execute(event:CairngormEvent):void 
		{
			isServerAdminFlag = (event as ViewServerConfigurationEvent).isServerAdminFlag;
			var delegate:ServerAdminServiceDelegate = new ServerAdminServiceDelegate( this );
			delegate.getServerConfigs();
		}
		/**
		 * executed if ServerAdminServiceDelegate's getServerConfigs executed successfully
		 * 
		 * @param data
		 * 
		 */
		public function result( data : Object ) : void
		{

			var serverConfigs : ICollectionView = ICollectionView( data.result );

			// load the server cache
			ServerCache.getInstance().loadServerConfigs(serverConfigs);
			//if server screen has to be opened
			if(isServerAdminFlag)
			{
				var sortByServerType:SortField;
				var sortServerType:Sort;
				
				var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
				viewModel.loadModule(ViewModelLocator.VIEW_SERVER_CONFIG_SWF);
				viewModel.screenName = "Administration > Server Configurations";
				viewModel.serverConfigs=serverConfigs;
	
				sortServerType = new Sort();
				sortByServerType = new SortField("serverName",true,false);
				sortServerType.fields = [sortByServerType];
				serverConfigs.sort = sortServerType;
				serverConfigs.refresh();
			}
		}
		/**
		 * executed if ServerAdminServiceDelegate's getServerConfigs is failed to execute
		 * 
		 * @param info
		 * 
		 */
		public function fault( info : Object ) : void
		{
			AlertHelper.displayFault(info,"Server Configurations could not be retrieved");
		}

	}
}
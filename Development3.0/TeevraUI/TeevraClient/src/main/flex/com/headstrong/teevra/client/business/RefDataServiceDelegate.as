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
 * $Id: RefDataServiceDelegate.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 24, 2008 
 */

package com.headstrong.teevra.client.business

/**
 * 
 */
{
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.headstrong.teevra.client.view.entity.DataSourceConfigVO;
	import com.headstrong.teevra.client.view.entity.RefDataConfigVO;
	
	import mx.rpc.IResponder;
	import com.headstrong.teevra.client.view.entity.ServerConfigVO;
	import com.headstrong.teevra.client.view.admin.CacheReloadSchedule;

	public class RefDataServiceDelegate {
	
		private var responder:IResponder;
		private var service:Object;
		
		public function RefDataServiceDelegate( responder:IResponder ) {
			this.responder = responder;
			this.service = ServiceLocator.getInstance().getRemoteObject("refDataService");
			
		}
		/**
		 * get Data source configurations 
		 * 
		 */
		public function getDataSourceConfigs():void
		{
			var call:Object = service.getDataSourceConfigs();
			call.addResponder( responder );
		}		
		/**
		 * get Reference configurations 
		 * 
		 */
		public function getRefDataConfigs():void
		{
			var call:Object = service.getRefDataConfigs();
			call.addResponder( responder );
		}		
		/**
		 * save Data source configurations 
		 * @param dataSourceConfig
		 * 
		 */
		public function saveDataSourceConfig(dataSourceConfig:DataSourceConfigVO):void
		{
			var call:Object = service.saveDataSourceConfig(dataSourceConfig);
			call.addResponder( responder );
		}	
		/**
		 * save Reference Data configurations	
		 * @param refDataConfig
		 * 
		 */
		public function saveRefDataConfig(refDataConfig:RefDataConfigVO):void
		{
			var call:Object = service.saveRefDataConfig(refDataConfig);
			call.addResponder( responder );
		}
		/**
		 * deletes the Data Source Configuration	 
		 * @param dataSourceName
		 * 
		 */
		public function deleteDataSourceConfig(dataSourceName:String):void
		{
			var call:Object = service.deleteDataSourceConfig(dataSourceName);
			call.addResponder( responder );
		}
			
		/**	
		 * deletes the Reference Source Configuration
		 * @param refDataName
		 * 
		 */
		public function deleteRefDataConfig(refDataName:String):void
		{
			var call:Object = service.deleteRefDataConfig(refDataName);
			call.addResponder( responder );
		}
		
		
		
		public function reloadCache(refDataName:String,server:ServerConfigVO ):void
		{
			var call:Object = service.reloadCache(refDataName,server);
			call.addResponder( responder );
		}
		
		/**	
		 * Fetch the Cache reload Schedule of the given cache
		 * @param cacheName
		 * 
		 */
		public function getCacheReloadSchedule(cacheName:String):void
		{
			var call:Object = service.getCacheReloadSchedule(cacheName);
			call.addResponder( responder );
		}
		
		/**	
		 * Schedule Cache Reload to the given schedule information
		 * @param schedule
		 * @param server
		 */
		public function scheduleCacheReload(schedule:CacheReloadSchedule, server:ServerConfigVO):void
		{
			var call:Object = service.scheduleCacheReload(schedule, server);
			call.addResponder( responder );
		}
		
		
		/**	
		 * Save Cache Reload schedule information
		 * @param schedule
		 * 
		 */
		public function saveCacheReloadSchedule(schedule:CacheReloadSchedule):void
		{
			var call:Object = service.saveCacheReloadSchedule(schedule);
			call.addResponder( responder );
		}
	}
}
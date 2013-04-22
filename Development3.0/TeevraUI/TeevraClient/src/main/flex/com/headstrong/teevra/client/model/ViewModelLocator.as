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
 * $Id: ViewModelLocator.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Oct 21, 2008  
 */
package com.headstrong.teevra.client.model 
/**
 * 
 */
{
	import com.adobe.cairngorm.model.ModelLocator;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.util.UserEntitlements;
	import com.headstrong.teevra.client.view.admin.CacheReloadSchedule;
	import com.headstrong.teevra.client.view.admin.ProcessSchedule;
	import com.headstrong.teevra.client.view.entity.ProcessVO;
	import com.headstrong.teevra.client.view.entity.SchemaVO;
	import com.headstrong.teevra.client.view.entity.StateMachineVO;
	import com.headstrong.teevra.client.view.entity.UserVO;
	
	import flash.display.DisplayObject;
	import flash.system.ApplicationDomain;
	
	import mx.collections.ArrayCollection;
	import mx.collections.ICollectionView;
	import mx.core.Application;
	import mx.events.ModuleEvent;
	import mx.modules.ModuleLoader;
	[Bindable]
	public class ViewModelLocator implements ModelLocator 
	{
		private static var instance:ViewModelLocator;
		public function ViewModelLocator(enforcer:SingletonEnforcer)
		 {
				if (enforcer == null) 
				{
					throw new Error( "You Can Only Have One ViewModelLocator" );
				}
		}
		public static function getInstance() : ViewModelLocator 
		{
			if (instance == null) 
			{
				instance = new ViewModelLocator( new SingletonEnforcer );
			}
			return instance;
		}
		
		// DEFINE YOUR VARIABLES HERE
		public var viewProcesses:ICollectionView;
		public var processStatus:ICollectionView;
		public var viewSchema:ICollectionView;
		public var serverConfigs:ICollectionView;
		public var getSchemas:ArrayCollection;
		public var components:ICollectionView;
		public var screenName:String;
		public var stateMachineEventString:String;
		public var status:String;
		public var workFlowStatForMoule:uint=0;
		public var loadedProcess:ProcessVO;
		public var loadedStateMachine:StateMachineVO;
		public var processServiceVO:ProcessServiceVO;
		public var saveFlag:int=0;
		public var loadedSchema:SchemaVO;
		public var loadedScreen:DisplayObject;
		public var errorReports:ICollectionView;
		public var prcsRunErrorReports:ICollectionView;
		public var prcsRunMessageData:ArrayCollection;
		public var dataSourceConfigs:ICollectionView;
		public var refDataConfigs:ICollectionView;
		public var isPrcsStatusReport:Boolean;
		public var saveComponentFlag:Boolean;
		public var fileUploaderFlag:Boolean;
		public var stateMachines:ICollectionView;
		public var users:ICollectionView;
		public var roles:ICollectionView;
		public var loggedInUser:UserVO;
		public var activities:ICollectionView;
		public var userEntitlements:UserEntitlements;
		public var authType:String;
		public var businessErrorHandlerFlag:Boolean;
		public var systemErrorHandlerFlag:Boolean;
		public var processSchedule:ProcessSchedule;
		public var cacheReloadSchedule:CacheReloadSchedule;
		//public var serviceIdCollection:ArrayCollection;
		
		// DEFINE VIEW CONSTANTS
		public static const COMPONENT_EXTN_SWF:String="ComponentExtension.swf";
		public static const listOfComponentSWF:String = "ListofComponent.swf";
		public static const PROCESS_STATUS_SWF:String="ProcessesStatus.swf";
		public static const NEW_PROCESS_SWF:String="NewProcss.swf";
		public static const systemPerformanceSWF:String="SystemPerformanceReports.swf";
		public static const VIEW_PROCESS_SWF:String="ViewProcess.swf";
		public static const VIEW_SCHEMA_SWF:String="ViewSchema.swf";
		public static const DRAWING_PROCESS_SWF:String="FlexDrawing.swf";
		public static const VIEW_COMPONENT_SWF:String="ViewComponent.swf";
		public static const MQENDPOINT_SWF:String="MQEndPoint.swf";
		public static const NEW_SCHEMA_SWF:String="NewSchema.swf";
		public static const ERROR_REPORTING_EVENT:String="ErrorReporting.swf";
		public static const DATA_SOURCE_CONFIG_EVENT:String="DataSourceConfig.swf";
		public static const REF_DATA_CONFIG_EVENT:String="RefDataConfig.swf";
		public static const VIEW_SERVER_CONFIG_SWF:String="ViewServerConfiguration.swf";
		public static const STATE_MACHINE_DRAWING_SWF:String="StateMachineDrawing.swf";
		public static const VIEW_STATE_MACHINE_SWF:String="ViewStateMachine.swf";
		public static const VIEW_USER_SWF:String="ViewUser.swf";
		public static const VIEW_ROLE_SWF:String="ViewRole.swf";
		public static const VIEW_LOGIN_SWF:String="LoginScreen.swf";
		
		public var moduleLoader:ModuleLoader;
		
		public function loadModule(moduleUrl:String) : void 
		{
			moduleLoader = new ModuleLoader();
			moduleLoader.applicationDomain = ApplicationDomain.currentDomain;
			moduleLoader.url = moduleUrl;
			moduleLoader.addEventListener(ModuleEvent.READY, onModuleLoad);
			moduleLoader.loadModule();
		}
		
		public function onModuleLoad(e:ModuleEvent):void
		{
			moduleLoader.percentHeight = 100;
			moduleLoader.percentWidth = 100;
			Application.application.loadScreen();
		}
	}
}
// Utility Class to Deny Access to Constructor
class SingletonEnforcer {}
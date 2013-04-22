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
 * $Id: RegisterServerUI.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Feb 11, 2009  
 */
package com.headstrong.teevra.client.view.admin
{
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.entity.ServerConfigVO;
	
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.containers.ControlBar;
	import mx.containers.Form;
	import mx.containers.FormItem;
	import mx.containers.TitleWindow;
	import mx.controls.Alert;
	import mx.controls.Button;
	import mx.controls.Label;
	import mx.controls.TextInput;
	import mx.events.CloseEvent;
	import mx.managers.PopUpManager;
	//import mx.rpc.IResponder;
	
	
	public class RegisterServerUI extends TitleWindow 
	{
		[Bindable]		
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		
		private var closeEventHandler:Function;
		private var saveEventHandler:Function;
		private var serverConfigVO:ServerConfigVO;
		
		private var serverIdLabel:Label;
		private var serverNameText:TextInput;
		private var serverURLText:TextInput;
		
		private const SERVER_ID:String = "column.RegisterServerUI.serverId";
		private const SERVER_NAME:String="column.RegisterServerUI.serverName";
		private const SERVER_URL:String="column.RegisterServerUI.serverURL";
		
		
		public function RegisterServerUI()
		{
			super();
			this.layout = "vertical";
			this.showCloseButton=true;
			this.addEventListener(CloseEvent.CLOSE,popupClose);
			this.title="Server Details";
		}
		 private function popupClose(event:Event):void{
	    	PopUpManager.removePopUp(this);
	    }
		
		
		public function create(isNewConfig:Boolean,closeHandler:Function,saveEventHandler:Function,serverConfigVO:ServerConfigVO):void
		{
			this.closeEventHandler = closeHandler;
			this.saveEventHandler = saveEventHandler;
			this.serverConfigVO = serverConfigVO;		
			
			if(isNewConfig)
			{
				this.title="New Server Configuration";
				addConfigFields(isNewConfig);
			}
			else
			{
				this.title="Edit Server Configuration";
				addConfigFields(isNewConfig);
				setConfigDetails();
			}						
			//create control bar
			createControlBar();
			
		}
		private function addConfigFields(isNewConfig:Boolean):void
		{
			var configForm:Form = new Form();
			
			if(!(isNewConfig))
			{
				var serverIdItem:FormItem = new FormItem();
				serverIdItem.label = setFieldName(SERVER_ID);
				serverIdLabel = new Label();
				serverIdItem.addChild(serverIdLabel);
				configForm.addChild(serverIdItem);
			}
			
			var serverNameItem:FormItem = new FormItem();
			serverNameItem.label = setFieldName(SERVER_NAME);
			serverNameText = new TextInput();
			serverNameItem.addChild(serverNameText);
			configForm.addChild(serverNameItem);
			
			var serverURLItem:FormItem = new FormItem();
			serverURLItem.label = setFieldName(SERVER_URL);
			serverURLText = new TextInput();
			serverURLItem.addChild(serverURLText);
			configForm.addChild(serverURLItem);
			
			this.addChild(configForm);
		}
		private function createControlBar():void
		{
			var controlBar:ControlBar = new ControlBar();
			controlBar.percentHeight = 10;
			controlBar.percentWidth = 90;
			
			var saveBtn:Button = new Button();
			saveBtn.label = "Save";
			saveBtn.addEventListener(MouseEvent.CLICK,saveConfiguration);
			controlBar.addChild(saveBtn);
			
			var closeBtn:Button = new Button();
			closeBtn.label = "Close";
			closeBtn.addEventListener(MouseEvent.CLICK, closeEventHandler);
			controlBar.addChild(closeBtn);
			
			this.addChild(controlBar);
		}
		private function setConfigDetails():void
		{	
    		serverIdLabel.text = serverConfigVO.serverId.toString();
    		serverNameText.text = serverConfigVO.serverName;
    		serverURLText.text = serverConfigVO.serverUrl;
		}
		public function saveConfiguration(event:MouseEvent):void
		{
			if(validateFields())
			{
				serverConfigVO.serverName = serverNameText.text;
				serverConfigVO.serverUrl = serverURLText.text;
				saveEventHandler.call();
			}
			else
			{
				Alert.show("Please enter all mandatory fields");
			}
		
		}
		private function setFieldName(field:String):String
		{
			var fieldName:String = resourceManager.getString('TeevraUI', field+'.name');
			if(resourceManager.getString('TeevraUI', field+'.mandatory')=='Y')
			{
				fieldName+="*";
			}
			return fieldName;
		}
		private function validateFields():Boolean
		{
			if(resourceManager.getString('TeevraUI', SERVER_NAME+'.mandatory')=='Y' && serverNameText.length==0)
			{
				return false;
			}
			if(resourceManager.getString('TeevraUI', SERVER_URL+'.mandatory')=='Y' && serverURLText.length==0)
			{
				return false;
			}
			return true;
		}
	}
}
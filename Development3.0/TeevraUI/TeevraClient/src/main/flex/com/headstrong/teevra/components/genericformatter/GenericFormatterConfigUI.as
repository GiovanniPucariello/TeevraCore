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
 * $Id: FixedLengthParser.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Nov 26, 2008  
 */
package com.headstrong.teevra.components.genericformatter
{
	import com.headstrong.teevra.client.graph.model.ProcessServiceConfigurationVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.util.RestrictedTextInput;
	import com.headstrong.teevra.components.common.BaseComponentConfigurationUI;
	import com.headstrong.teevra.components.common.GridConfigFormatterForm;
	import com.headstrong.teevra.components.common.TeevraUIComponentsID;
	
	import mx.collections.ArrayCollection;
	import mx.containers.HBox;
	import mx.controls.Alert;
	import mx.controls.ComboBox;
	import mx.controls.Label;
	import mx.controls.RichTextEditor;
	import mx.controls.TextInput;
	import mx.core.ClassFactory;
	
	
	public class GenericFormatterConfigUI extends BaseComponentConfigurationUI
	{
		private var schemaNameSelection:ComboBox;
		//private var configForm:GridConfigForm;
		private var configForm:GridConfigFormatterForm;
		private var delimitedCharacter:TextInput;
		
		private var serviceIdText:RestrictedTextInput;
		private const SCHEMA_ATTR_INDEX:int = 0;
		private const START_INDEX:int=1;
		private const END_INDEX:int=2;
		private const ATTRIBUTES_INDEX:int = 3;
		private const CONFIG_KEY_SCHEMA_DESCR:String = "objectSchemaDescriptor";
		private const CONFIG_KEY_SCHEMA_MAPPING:String = "schemaMapping";
		private const DELIMITERS:String = "Delimiter";
		
		private const SERVICE_ID_FIELD:String="label.GenericFormatterConfigUI.serviceID";
		private const SCHEMA_NAME_FIELD:String="label.GenericFormatterConfigUI.schemaName";
		
		public function GenericFormatterConfigUI()
		{
			super();
		}
		override public function initUI():void
		{
			addComponentSpecificUI();
			addConfigFields();
			if(this.processServiceConfig!=null)
			{
				//loadDetails in process service configuration
				loadProcessServiceConfig();								
			}
			//configForm.percentWidth = 100;
			this.addChild(configForm);
		
		}
		private function addComponentSpecificUI() : void 
		{
			var compSpecificDisplay:HBox = new HBox();
			compSpecificDisplay.percentWidth = 100;
			compSpecificDisplay.percentHeight = 10;
			
			var serviceId:Label = new Label();
			serviceId.text=setFieldName(SERVICE_ID_FIELD);
			serviceId.setStyle("fontWeight","bold");
			
			serviceIdText = new RestrictedTextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			serviceIdText.id=TeevraUIComponentsID.SERVICE_ID_ID;
		
			compSpecificDisplay.addChild(serviceId);
			compSpecificDisplay.addChild(serviceIdText);
			
			var schemaLabel:Label = new Label();
    		schemaLabel.text = setFieldName(SCHEMA_NAME_FIELD);
			schemaLabel.setStyle("fontWeight", "bold");
			
			schemaNameSelection = new ComboBox();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			schemaNameSelection.id=TeevraUIComponentsID.SCHEMA_NAME_ID;
			schemaNameSelection.editable = true;
			schemaNameSelection.itemRenderer = new ClassFactory(Label);
			schemaNameSelection.dataProvider = schemas;
			schemaNameSelection.labelField = "schemaName";
			schemaNameSelection.selectedIndex = -1;
			schemaNameSelection.width = 200;
			
			compSpecificDisplay.addChild(schemaLabel);
			compSpecificDisplay.addChild(schemaNameSelection);
			this.addChild(compSpecificDisplay);
		}
		private function addConfigFields():void 
		{
			configForm = new GridConfigFormatterForm(getConfigFields());
			configForm.percentWidth = 100;
		}	
		/**
		 * Populates the UI field with the values that were saved last time in the ProcessServiceConfigurationVO.
		 */
		private function loadProcessServiceConfig():void {
			//set label values
			serviceIdText.text = processServiceConfig.serviceId;
			loadConfigurations(processServiceConfig.configurations);
		}
		/**
		 * Constructs the UI with the given list of component configurations
		 */
		override public function loadConfigurations(configurations:ArrayCollection):void {
			for each (var config : ProcessServiceConfigurationVO in configurations) {
				if (CONFIG_KEY_SCHEMA_DESCR == config.configKey) {
					schemaNameSelection.text = config.simpleValue;
				} 
			}
			
			var compleValue:String=getTabularData(configurations);
			configForm.setTabularData(compleValue);

			
		}
		
		public function getTabularData(configuration:ArrayCollection):String
		{
			var compleValue:String;
			for(var i:int=0;i<configuration.length;i++)
			{
				var processServiceConfiguration:ProcessServiceConfigurationVO=ProcessServiceConfigurationVO(configuration.getItemAt(i));
				if(processServiceConfiguration.complexValue!=null)
				{
					compleValue=processServiceConfiguration.complexValue.toString();
				}
			}
			return compleValue;
		} 
		
		public function getConfigFields():ArrayCollection
		{
			var coll:ArrayCollection = new ArrayCollection();
			var richText:RichTextEditor = new RichTextEditor();
			coll.addItem(richText);
			
			return coll; 
		}	
		override public function getConfiguration():ProcessServiceVO
		{
			var processServiceVO:ProcessServiceVO = new ProcessServiceVO();
			//set the Service Id of ProcessServiceVO
			processServiceVO.serviceId=(serviceIdText.text).toString();
			//Set the first Configuration i.e. Schema Name
			var processServiceConfigVO:ProcessServiceConfigurationVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();			
			processServiceConfigVO.configKey = CONFIG_KEY_SCHEMA_DESCR;
			processServiceConfigVO.simpleValue = schemaNameSelection.text;
			processServiceVO.configurations = new ArrayCollection();
			processServiceVO.configurations.addItem(processServiceConfigVO);
			
			//set the second Configuration i.e. the Schema mapping
			processServiceConfigVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();			
			processServiceConfigVO.configKey = CONFIG_KEY_SCHEMA_MAPPING;
			processServiceConfigVO.complexValue = configForm.getUserSpecifiedValues();
			processServiceVO.configurations.addItem(processServiceConfigVO); 
			
			var mandatoryFlag:Boolean=validateFields(processServiceVO);
			if(!mandatoryFlag)
			{
				Alert.show("Please fill in all the mandatory fields");
								
			}
			else 
			{
				return processServiceVO;
			}
			return null;
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
		private function validateFields(processServiceVO:ProcessServiceVO):Boolean
		{	
			if(resourceManager.getString('TeevraUI', SERVICE_ID_FIELD+'.mandatory')=='Y')
			{
				if(processServiceVO.serviceId==null ||processServiceVO.serviceId=="")
				{
					return false;
				}
			}
			if(resourceManager.getString('TeevraUI', SCHEMA_NAME_FIELD+'.mandatory')=='Y')
			{
				for each (var config : ProcessServiceConfigurationVO in processServiceVO.configurations)
				{
					if (CONFIG_KEY_SCHEMA_DESCR == config.configKey) 
					{
						if(config.simpleValue==null || config.simpleValue=="")
							return false;
					}
				}
				
			}
			return true;
		}	
	}
}

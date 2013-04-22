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
 * $Id: MulticastRouterConfigUI.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Dec 04, 2008  
 */
package com.headstrong.teevra.components.multicastrouter
{
	import com.headstrong.teevra.client.graph.model.ProcessServiceConfigurationVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.util.RestrictedTextInput;
	import com.headstrong.teevra.components.common.BaseComponentConfigurationUI;
	import com.headstrong.teevra.components.common.GridConfigField;
	import com.headstrong.teevra.components.common.GridConfigForm;
	import com.headstrong.teevra.components.common.TeevraUIComponentsID;
	
	import mx.collections.ArrayCollection;
	import mx.containers.HBox;
	import mx.containers.VBox;
	import mx.controls.Alert;
	import mx.controls.ComboBox;
	import mx.controls.Label;
	import mx.controls.TextInput;
	import mx.core.ClassFactory;
	
	public class MulticastRouterConfigUI extends BaseComponentConfigurationUI
	{

		private var configForm:GridConfigForm;
		private var serviceIdText:RestrictedTextInput;
		private const DESTINATION:int = 1;
		private const CONFIG_KEY_DESTINATION : String ="Destination";
		private const FLD_SEQ_FIELD_LBL:String = "configField.MulticastRouterConfigUI.sequenceNumber";
		private const FLD_SEQ_FIELD_NAME:String = "sequenceNumber";
		private const FLD_SEQ_FIELD_TYPE:String = GridConfigField.SEQUENCE_NUMBER_FIELD;
		private const FLD_SEQ_FIELD_WIDTH:Number = 50;
		private const FLD_DEST_NODE_LBL:String = "configField.MulticastRouterConfigUI.destinationNode";
		private const FLD_DEST_NODE_NAME:String = "destinationNode";
		private const FLD_DEST_NODE_TYPE:String = GridConfigField.TEXT_FIELD;
		private const FLD_DEST_NODE_WIDTH:Number = 200;
		
		private const SERVICE_ID_FIELD:String="label.MulticastRouterConfigUI.serviceID";

		public function MulticastRouterConfigUI()
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
			this.height = 300;
			this.verticalScrollPolicy = "auto";
			configForm.percentWidth = 100;
			this.addChild(configForm);
		}
		private function addComponentSpecificUI() : void 
		{
			var compSpecificDisplay:VBox = new VBox();
			compSpecificDisplay.percentWidth = 100;
			compSpecificDisplay.percentHeight = 10;
			
			var compSpecificH1:HBox = new HBox();
			compSpecificH1.percentWidth = 100;
			compSpecificH1.percentHeight = 5;
			
			var compSpecificH2:HBox = new HBox();
			compSpecificH2.percentWidth = 100;
			compSpecificH2.percentHeight = 5;
		
			var serviceId:Label = new Label();
			serviceId.text=setFieldName(SERVICE_ID_FIELD);
			serviceId.setStyle("fontWeight","bold");
			serviceIdText = new RestrictedTextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			serviceIdText.id=TeevraUIComponentsID.SERVICE_ID_ID;
			
			compSpecificH1.addChild(serviceId);
			compSpecificH1.addChild(serviceIdText);			
			compSpecificDisplay.addChild(compSpecificH1);
					
			this.addChild(compSpecificDisplay);
		}
		
		private function addConfigFields():void 
		{
			configForm = new GridConfigForm(getConfigFields());
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
			var tabularData:ArrayCollection=getTabularData(configurations);
			configForm.setTabularData(tabularData);			
		}			
		public function getTabularData(configuration:ArrayCollection):ArrayCollection
		{
			var counter:int=0;
			for(var i:int=0;i<configuration.length;i++)
			{
				var processServiceConfiguration:ProcessServiceConfigurationVO=ProcessServiceConfigurationVO(configuration.getItemAt(i));
				if(processServiceConfiguration.complexValue != null)
				{
					var configXML:XML=XML(processServiceConfiguration.complexValue);
					var tabularData:ArrayCollection = new ArrayCollection();
					var rowVector:ArrayCollection;
					var root:XML;
				
					for each(root in configXML.to)
					{	
						counter++;
						rowVector = new ArrayCollection();
						rowVector.addItem(counter);
						rowVector.addItem(root.attribute("id").toString());					
						tabularData.addItem(rowVector);
					}
				}
			}
			return tabularData;
		} 
		public  function getConfigFields():ArrayCollection
		{
			var coll:ArrayCollection = new ArrayCollection();
			
			coll.addItem(getField(FLD_SEQ_FIELD_LBL, FLD_SEQ_FIELD_NAME, FLD_SEQ_FIELD_TYPE, 
				FLD_SEQ_FIELD_WIDTH, null, null));
				
			coll.addItem(getField(FLD_DEST_NODE_LBL, FLD_DEST_NODE_NAME, FLD_DEST_NODE_TYPE, 
				FLD_DEST_NODE_WIDTH, null, null));
			
			return coll;
		}
		private function getField(labelKey:String, fieldName:String, fieldType:String, 
			fieldWidth:Number, dataprovider:ArrayCollection, observer:Function):GridConfigField {
			var field:GridConfigField = new GridConfigField();
			field.label = resourceManager.getString('TeevraUI', labelKey);
			field.name = fieldName;
			field.type = fieldType;
			field.fieldPercentWidth = fieldWidth;
			field.lookups = dataprovider;
			field.observer = observer;
			return field;
		}
		
		override public function getConfiguration():ProcessServiceVO
		{
			var processServiceVO:ProcessServiceVO = new ProcessServiceVO();
			processServiceVO.configurations = new ArrayCollection();
			//set the Service Id of ProcessServiceVO
			processServiceVO.serviceId=(serviceIdText.text).toString();
			processServiceVO.compId=this.component.compId;
			//set the third Configuration i.e. the Schema mapping
			var processServiceConfigVO:ProcessServiceConfigurationVO = new ProcessServiceConfigurationVO();
			processServiceConfigVO.serviceId=(serviceIdText.text).toString();			
			processServiceConfigVO.configKey = CONFIG_KEY_DESTINATION;
			processServiceConfigVO.complexValue = createConfigXML(configForm.getUserSpecifiedValues());
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
		
		private function createConfigXML(tabularData:ArrayCollection):String
		{
			var configXML:XML = new XML("<multicast></multicast>");
			var rowVector:ArrayCollection=ArrayCollection(tabularData.getItemAt(i));
			for(var i:uint=0;i<tabularData.length;i++)
			{
				rowVector=ArrayCollection(tabularData.getItemAt(i));
				if(rowVector.getItemAt(DESTINATION)!="")
				{
					 var fieldElement:XML = new XML();
	                 fieldElement = <to id={rowVector.getItemAt(DESTINATION).toString()}/>;
					configXML.appendChild(fieldElement);
				}
   			}
   			return configXML.toXMLString();
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
			return true;
		}
	}
}

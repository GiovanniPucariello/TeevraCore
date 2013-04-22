package com.headstrong.teevra.components.splitter
{
	import com.headstrong.teevra.client.graph.model.ProcessServiceConfigurationVO;
	import com.headstrong.teevra.components.common.GridConfigField;
	import com.headstrong.teevra.components.common.GridConfigForm;
	import com.headstrong.teevra.components.common.TeevraUIComponentsID;
	
	import flash.events.Event;
	
	import mx.collections.ArrayCollection;
	import mx.containers.Form;
	import mx.containers.FormItem;
	import mx.controls.TextInput;
	import mx.core.Container;
	
	public class BatchSplitterStrategy extends Form implements ISplitterStrategy
	{
		private var parentConfig:SplitterConfigUI;
		private var configForm:GridConfigForm;
		private var attributes:ArrayCollection;
		private var batchSizeItem:FormItem;
		private var sizeInput:TextInput;		
		private const OUTPUT_BATCH_FIELD_INDEX:int=2;
		
		public function BatchSplitterStrategy(parentConfig:SplitterConfigUI)
		{
			this.parentConfig = parentConfig;
			batchSizeItem = new FormItem();
			batchSizeItem.label = resourceManager.getString('TeevraUI','label.SplitterConfigUI.configField.outputBatchSize.name');
			sizeInput = new TextInput();
			// (Redmine Feature # 589) ID of flex components is set so that it can be uniquely identified by Ranorex
			sizeInput.id=TeevraUIComponentsID.OUT_BATCH_SIZE;
			batchSizeItem.addChild(sizeInput);		
			this.addChild(batchSizeItem);
		}
		
		/**
		 * Returns the container containing UI components used for configuring the chosen splitter strategy
		 */
		public function getConfigForm():Container {
			return this;
		}		
		
		/**
		 * Returns the handler to be invoked when user changes the schema 
		 */
		public function getSchemaChangeHandler():Function {
			return schemaChangeHandler;
		}		 
		/**
		 * Constructs the UI with the given list of component configurations
		 */
		public function loadConfigurations(configurations:ArrayCollection):void {
			var schemaName:String = "";
			for each (var config:ProcessServiceConfigurationVO in configurations)
			{	
				if(SplitterConfigUI.CONFIG_KEY_CONFIGURATION == config.configKey)
				{
					sizeInput.text = getTabularData(configurations.getItemAt(OUTPUT_BATCH_FIELD_INDEX));					
				}
			}				
		}
		/**
		 * Constructs configuration from the values entered by the user in the UI.
		 */
		public function getConfiguration():ProcessServiceConfigurationVO {
			//set the values of config fields .. Schema Mapping
			return parentConfig.createConfiguration(parentConfig.getServiceId(), SplitterConfigUI.CONFIG_KEY_CONFIGURATION, 
				false, createConfigXML(sizeInput));
			//return new ProcessServiceConfigurationVO();
		}
		/**
		 * Creates the splitter config XML from the given tabularData. The tabularData contains
		 * the values specified by the user in the fields of GridConfigForm.
		 */
		private function createConfigXML(sizeInput:TextInput):String
		{
			var configXML:XML=new XML("<splitter></splitter>");
			configXML.@id = parentConfig.getServiceId();
			var groupBy:XML=new XML("<batchStrategy></batchStrategy>");	
			if ((sizeInput.text != null) && ("" != sizeInput.text))
			{
				var attributeElement:XML=new XML("<batchSize>" + sizeInput.text+ "</batchSize>");
				groupBy.appendChild(attributeElement)
			}			
			configXML.appendChild(groupBy);		
			return configXML.toXMLString();
		}
		/**
		 * Dummy schema change handler 
		 */
		public function schemaChangeHandler(event:Event):void {
			//do nothing
		}
		
		/**
		 * Refreshes after switchin strategies
		 */
		 public function refresh():void {
			//do nothing 	
		 }		
		 private function getTabularData(configurations:Object):String
		 {
			var tabularData:ArrayCollection=new ArrayCollection();
		
			var processServiceConfiguration:ProcessServiceConfigurationVO=ProcessServiceConfigurationVO(configurations);
			if (processServiceConfiguration.complexValue != null)
			{
				var configXML:XML=XML(processServiceConfiguration.complexValue);			
				return configXML.batchStrategy.batchSize;
			}			
			return null;
		}
	}
}

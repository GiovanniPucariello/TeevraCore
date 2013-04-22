package com.headstrong.teevra.components.splitter
{
	import com.headstrong.teevra.client.graph.model.ProcessServiceConfigurationVO;
	import com.headstrong.teevra.components.common.GridConfigField;
	import com.headstrong.teevra.components.common.GridConfigForm;
	
	import flash.events.Event;
	
	import mx.collections.ArrayCollection;
	import mx.controls.ComboBox;
	import mx.core.Container;
	
	public class PartitionKeyStrategy implements ISplitterStrategy
	{
		private var configForm:GridConfigForm;
		private var attributes:ArrayCollection;
		private var parentConfig:SplitterConfigUI;
		private const FLD_PARTITION_ATTR_LBL_KEY:String="label.SplitterConfigUI.configField.partitionKey";
		private const FLD_PARTITION_ATTR_NAME:String="attribute";
		private const FLD_PARTITION_ATTR_TYPE:String=GridConfigField.LIST_FIELD;
		private const FLD_PARTITION_ATTR_PERCENT_WIDTH:int=80;

		public function PartitionKeyStrategy(parentConfig:SplitterConfigUI)
		{
			this.parentConfig = parentConfig;
			configForm=new GridConfigForm(getConfigFields());
			configForm.percentWidth=90;
			configForm.percentWidth=90;
		}

		/**
		 * Returns the container containing UI components used for configuring the chosen splitter strategy
		 */
		public function getConfigForm():Container {
			return configForm;
		}
		
		/**
		 * Returns the handler to be invoked when user changes the schema 
		 */
		 public function getSchemaChangeHandler():Function {
		 	return setSchemaAttributesOnChange;
		 }
		 
		/**
		 * Constructs the UI with the given list of component configurations
		 */
		public function loadConfigurations(configurations:ArrayCollection):void
		{
			var schemaName:String = "";
			for each (var config:ProcessServiceConfigurationVO in configurations)
			{
				if (SplitterConfigUI.CONFIG_KEY_SCHEMA_DESCR == config.configKey)
				{
					schemaName = config.simpleValue;
					break;
				}
			}

			// set attributes for earlier selected Schema on save
			configForm.setSchemaAttributes(schemaName, attributes, true, 0);
			//get the user specified fields' data as array collection 		
			var tabularData:ArrayCollection = getTabularData(configurations);
			//set grid fields' data
			configForm.setTabularData(tabularData);
		}

		/**
		 * Constructs configuration from the values entered by the user in the UI.
		 */
		public function getConfiguration():ProcessServiceConfigurationVO
		{
			//set the values of config fields .. Schema Mapping
			return parentConfig.createConfiguration(parentConfig.getServiceId(), SplitterConfigUI.CONFIG_KEY_CONFIGURATION, 
				false, createConfigXML(configForm.getUserSpecifiedValues()));
		}

		/**
		 * Sets attribute list for the selected Schema when the user changes selection from the drop down
		 */
		public function setSchemaAttributesOnChange(event:Event):void
		{
			configForm.setSchemaAttributes(ComboBox(event.currentTarget).text, attributes, false, 0);
		}

		/**
		 * Refreshes after switchin strategies
		 */
		 public function refresh():void {
		 	if (parentConfig.processServiceConfig != null) {
		 		loadConfigurations(parentConfig.processServiceConfig.configurations);
		 	}
		 }

		/**
		 * Constructs the field models that need to be used to build the GridConfigForm containing
		 * fields for component configurations.
		 */
		private function getConfigFields():ArrayCollection
		{
			var coll:ArrayCollection=new ArrayCollection();
			attributes=new ArrayCollection();
			coll.addItem(getField(FLD_PARTITION_ATTR_LBL_KEY, FLD_PARTITION_ATTR_NAME, FLD_PARTITION_ATTR_TYPE, -1, 
				FLD_PARTITION_ATTR_PERCENT_WIDTH, attributes, null));
			return coll;
		}

		/**
		 * Creates a GridConfigField with the supplied params.
		 */
		private function getField(labelKey:String, fieldName:String, fieldType:String, fieldWidth:int, 
			fieldPercentWidth:int, dataprovider:ArrayCollection, observer:Function):GridConfigField
		{
			var field:GridConfigField=new GridConfigField();
			field.label = parentConfig.getLabelFromResource(labelKey);
			field.name=fieldName;
			field.type=fieldType;
			if (fieldWidth != -1)
			{
				field.fieldWidth=fieldWidth;
			}
			else
			{
				field.fieldPercentWidth=fieldPercentWidth;
			}
			field.lookups=dataprovider;
			field.observer=observer;
			return field;
		}

		/**
		 * When the UI needs to be loaded with ProcessServiceVO, the configurations in the VO are obtained as a list of rowvectors
		 * so that GridConfigForm can use that to populate the values in its field.
		 */
		private function getTabularData(configurations:ArrayCollection):ArrayCollection
		{
			var tabularData:ArrayCollection=new ArrayCollection();
			for (var i:int=0; i < configurations.length; i++)
			{
				var processServiceConfiguration:ProcessServiceConfigurationVO=ProcessServiceConfigurationVO(configurations.getItemAt(i));
				if (processServiceConfiguration.complexValue != null)
				{
					var configXML:XML=XML(processServiceConfiguration.complexValue);
					var root:XML;

					for each (root in configXML.descendants("partitionKey"))
					{
						var rowVector:ArrayCollection=new ArrayCollection();
						rowVector.addItem(root.toString());
						tabularData.addItem(rowVector);
					}
				}
			}
			return tabularData;
		}

		/**
		 * Creates the splitter config XML from the given tabularData. The tabularData contains
		 * the values specified by the user in the fields of GridConfigForm.
		 */
		private function createConfigXML(tabularData:ArrayCollection):String
		{
			var configXML:XML=new XML("<splitter></splitter>");
			configXML.@id = parentConfig.getServiceId();
			var groupBy:XML=new XML("<partitionKeyStrategy></partitionKeyStrategy>");
			var attributesNode:XML=new XML("<partitionKeys></partitionKeys>");
			groupBy.appendChild(attributesNode);
			configXML.appendChild(groupBy);

			for (var i:int=0; i < tabularData.length; i++)
			{
				var rowVector:ArrayCollection=ArrayCollection(tabularData.getItemAt(i));
				if ((rowVector.getItemAt(0) != null) && ("" != rowVector.getItemAt(0)))
				{
					var attributeElement:XML=new XML("<partitionKey>" + rowVector.getItemAt(0) + "</partitionKey>");
					attributesNode.appendChild(attributeElement)
				}
			}
			return configXML.toXMLString();
		}
	}
}
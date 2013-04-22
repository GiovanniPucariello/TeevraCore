package com.headstrong.teevra.components.common
{
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	
	import mx.collections.ArrayCollection;
	import mx.containers.VBox;
	import mx.controls.ComboBox;

	public class BaseComponentConfigurationUI extends VBox
	{
		private var _component:ComponentVO;
		private var _processServiceConfig:ProcessServiceVO;
		private var _schemas:ArrayCollection;
		private var _templateName:ComboBox;

		public function BaseComponentConfigurationUI()
		{
			super();
		}

		/**
		 * Abstract method. Needs to be overriden by the concrete sub-classes. 
		 * Called when all the properties are set in this instance and UI needs to be constructed.
		 */
		public function initUI():void
		{

		}

		/**
		 * Abstract method. Needs to be overriden by the concrete sub-classes. 
		 * Called when configurations needs to be reloaded on to the UI especially when template is to be loaded.
		 */
		public function loadConfigurations(configurations:ArrayCollection):void
		{
		}

		public function getConfiguration():ProcessServiceVO
		{
			return _processServiceConfig;
		}

		public function get component():ComponentVO
		{
			return _component;
		}

		public function set component(compVO:ComponentVO):void
		{
			_component=compVO;
		}

		public function get processServiceConfig():ProcessServiceVO
		{
			return _processServiceConfig;
		}

		public function set processServiceConfig(config:ProcessServiceVO):void
		{
			this._processServiceConfig=config;
		}

		public function get schemas():ArrayCollection
		{
			return _schemas;
		}

		public function set schemas(schemaCollection:ArrayCollection):void
		{
			_schemas=schemaCollection;
		}

		public function get templateName():ComboBox
		{
			return _templateName;
		}

		public function set templateName(value:ComboBox):void
		{
			this._templateName=value;
		}


	}
}
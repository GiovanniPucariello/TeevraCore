package com.headstrong.teevra.components.splitter
{
	import com.headstrong.teevra.client.graph.model.ProcessServiceConfigurationVO;
	
	import mx.collections.ArrayCollection;
	import mx.core.Container;
	
	public interface ISplitterStrategy
	{
		/**
		 * Returns the container containing UI components used for configuring the chosen splitter strategy
		 */
		function getConfigForm():Container;		
		
		/**
		 * Returns the handler to be invoked when user changes the schema 
		 */
		function getSchemaChangeHandler():Function;
		 
		/**
		 * Constructs the UI with the given list of component configurations
		 */
		function loadConfigurations(configurations:ArrayCollection):void;

		/**
		 * Constructs configuration from the values entered by the user in the UI.
		 */
		function getConfiguration():ProcessServiceConfigurationVO;
		
		/**
		 * Refreshes after switchin strategies
		 */
		 function refresh():void;
	}
}
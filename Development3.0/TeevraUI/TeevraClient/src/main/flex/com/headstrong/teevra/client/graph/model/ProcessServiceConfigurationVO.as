package com.headstrong.teevra.client.graph.model
{
	import com.headstrong.teevra.client.graph.model.common.ConfigurationVO;
	
	[RemoteClass(alias="com.headstrong.teevra.services.process.eo.ProcessServiceConfigurationEO")]
	public class ProcessServiceConfigurationVO extends ConfigurationVO
	{
		private var _configKey:String;
		/**
		 * Simple config value that needs to be inlined in PCM
		 */
		private var _simpleValue:String;
		/**
		 * Complex config value which is XML
		 */
		private var _complexValue:String;
		
		public function ProcessServiceConfigurationVO()
		{
		}

		/**
		 * 
		 * @return configKey
		 * 
		 */
		public function get configKey():String
		{
			return _configKey;
		}

		/**
		 * 
		 * @param v set configKey
		 * 
		 */
		public function set configKey(v:String):void
		{
			_configKey = v;
		}

		/**
		 * 
		 * @return simpleValue
		 * 
		 */
		public function get simpleValue():String
		{
			return _simpleValue;
		}

		/**
		 * 
		 * @param v set simpleValue
		 * 
		 */
		public function set simpleValue(v:String):void
		{
			_simpleValue = v;
		}
		
		/**
		 * 
		 * @return complexValue
		 * 
		 */
		public function get complexValue():String
		{
			return _complexValue;
		}
		
		/**
		 * 
		 * @param v set complexValue
		 * 
		 */
		public function set complexValue(v:String):void
		{
			_complexValue = v;
		}
		
		public function toString():String
		{
			return 	prcsId.toString + ":" + serviceId + ":" + configKey + ":" + simpleValue + ":" + complexValue;
		}
	}
}
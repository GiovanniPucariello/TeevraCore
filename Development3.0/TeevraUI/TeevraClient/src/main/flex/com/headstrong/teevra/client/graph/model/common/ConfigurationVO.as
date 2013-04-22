package com.headstrong.teevra.client.graph.model.common
{
	public class ConfigurationVO
	{
		public function ConfigurationVO()
		{
		}
		/**
		 * identifier for a process
		 */
		private var _prcsId:Number;
		/**
		 * Identifier for the component instance within the process
		 */
		private var _serviceId:String;
		
		/**
		 * 
		 * @return prcsId
		 * 
		 */
		public function get prcsId():Number
		{
			return _prcsId;
		}

		/**
		 * 
		 * @param v set prcsId
		 * 
		 */
		public function set prcsId(v:Number):void
		{
			_prcsId = v;
		}

		/**
		 * 
		 * @return serviceId
		 * 
		 */
		public function get serviceId():String
		{
			return _serviceId;
		}

		/**
		 * 
		 * @param v set serviceId
		 * 
		 */
		public function set serviceId(v:String):void
		{
			_serviceId = v;
		}


	}
}
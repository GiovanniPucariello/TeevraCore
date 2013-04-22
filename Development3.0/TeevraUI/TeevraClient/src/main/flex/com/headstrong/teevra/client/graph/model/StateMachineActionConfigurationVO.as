package com.headstrong.teevra.client.graph.model
{
	import com.headstrong.teevra.client.graph.model.common.ConfigurationVO;

	[RemoteClass(alias="com.headstrong.teevra.services.statemachine.vo.StateMachineActionConfigurationVO")]
	[Bindable]
	public class StateMachineActionConfigurationVO extends ConfigurationVO
	{
		public function StateMachineActionConfigurationVO()
		{
			super();
		}
		/**
		 *Indentifier for state name 
		 */
		private var _stateName:String;
		/**
		* Identifier for the configuration
	 	*/
		private var _configKey:String;
		/**
		 * Simple config value that needs to be inlined in SCXML
		 */
		private var _simpleValue:String;
		
		public function get stateName():String
		{
			return _stateName;
		}
		public function set stateName(value:String)
		{
			this._stateName = value;
		}
		public function get configKey():String
		{
			return _configKey;
		}
		public function set configKey(value:String)
		{
			this._configKey = value;
		}
		public function get simpleValue():String
		{
			return _simpleValue;
		}
		public function set simpleValue(value:String)
		{
			this._simpleValue = value;
		}
		
	}
}
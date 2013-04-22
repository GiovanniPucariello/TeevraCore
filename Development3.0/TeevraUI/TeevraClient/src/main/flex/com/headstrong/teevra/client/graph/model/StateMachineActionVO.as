package com.headstrong.teevra.client.graph.model
{
	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="com.headstrong.teevra.services.statemachine.vo.StateMachineActionVO")]
	[Bindable]
	public class StateMachineActionVO
	{
		/**
		 * component id of state  
		 */
		private var _compId:Number;
		/**
		 *key, value pair of configuration 
		 */
		private var _configurations:ArrayCollection;
		public function StateMachineActionVO()
		{
		}
		/**
		 * 
		 * @return Number
		 * 
		 */
		public function get compId():Number
		{
			return _compId;
			
		}
		/**
		 * 
		 * @param value compId
		 * @return 
		 * 
		 */
		public function set compId(value:Number):void
		{
			this._compId = value;
		}
		/**
		 * 
		 * @return ArrayCollection
		 * 
		 */
		public function get configurations():ArrayCollection
		{
			return _configurations;
		}
		/**
		 * 
		 * @param value configurations
		 * @return 
		 * 
		 */
		public function set configurations(value:ArrayCollection):void
		{
			this._configurations = value;
		}
	}
}
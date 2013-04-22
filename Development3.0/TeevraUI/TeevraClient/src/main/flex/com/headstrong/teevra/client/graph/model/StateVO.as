package com.headstrong.teevra.client.graph.model
{
	[RemoteClass(alias="com.headstrong.teevra.services.statemachine.vo.StateVO")]
	[Bindable]
	public class StateVO
	{
		/**
		 * Name of the state
		 */
		 private var _stateName:String;
		 /**
		 * Description of the state
		 */
		 private var _stateDesc:String;
		/**
		 * Type of the state-INIT/FINAL/NORMAL/CHOICE
		 */
		 private var _stateType:String;
		 
		/**
		 * Identifier entry action
		 */
		  private var _entryAction:StateMachineActionVO;
		 /**
		 * Identifier exit action
		 */
		 private var _exitAction:StateMachineActionVO;

		 
		public function StateVO()
		{
		}
		
		/**
		 * 
		 * @return stateName
		 * 
		 */
		public function get stateName():String
		{
			return _stateName;
		}
		/**
		 * 
		 * @param value stateName
		 * 
		 */
		public function set stateName(value:String):void
		{
			this._stateName = value;
		}
		/**
		 * 
		 * @return stateDesc
		 * 
		 */
		public function get stateDesc():String
		{
			return _stateDesc;
		}
		/**
		 * 
		 * @param value stateDesc
		 * 
		 */
		public function set stateDesc(value:String):void
		{
			this._stateDesc = value;
		}
		/**
		 * 
		 * @return stateType
		 * 
		 */
		public function get stateType():String
		{
			return _stateType;
		}
		/**
		 * 
		 * @param value stateType
		 *  
		 */
		public function set stateType(value:String):void
		{
			this._stateType = value;
		}
		
		/**
		 * 
		 * @return entryAction
		 * 
		 */
		public function get entryAction():StateMachineActionVO
		{
			return _entryAction;
		}
		/**
		 * 
		 * @param value entryAction
		 * 
		 */
		public function set entryAction(value:StateMachineActionVO):void
		{
			this._entryAction = value;
		}
		/**
		 * 
		 * @return exitAction
		 * 
		 */
		public function get exitAction():StateMachineActionVO
		{
			return _exitAction;
		}
		/**
		 *  
		 * @param value exitAction
		 * 
		 */
		public function set exitAction(value:StateMachineActionVO):void
		{
			this._exitAction = value;
		}
		
	}
}
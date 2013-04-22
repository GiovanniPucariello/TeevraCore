package com.headstrong.teevra.client.view.entity
{
	import com.headstrong.teevra.client.graph.model.StateMachineGraphVO;
	
	[RemoteClass(alias="com.headstrong.teevra.services.statemachine.eo.StateMachineEO")]
	[Bindable]
	public class StateMachineVO
	{
		
		/**
		 * Unique identifier for a state machine
		 */
		 private var _stateMachineId:Number;
		/**
		 * Unique name for the state machine
		 */
		 private var _stateMachineName:String;
		/**
		 * Description of the state machine
		 */
		 private var _stateMachineDesc:String;			
		/**
		 *status of the sate machine 
		 */
		 private var _stateMachineStatus:String="UNPUBLISHED"
		 /**
		  *Comma seperated Events
		  */
		 private var _stateMachineEvents:String
		 /**
		 * State machine model graph 
		 */
		 private var _graph:StateMachineGraphVO;
		 /**
		  * SCXML generated for the state machine 
		  */
		 private var _stateMachineModel:String;
		/**
		 *User name who created the state machine
		 */
		private var _createdBy:String;
		/**
		 *Time when created the state machine
		 */
		private var _createdDate:Date;
		/**
		 * User name who modified the state machine
		 */
		private var _modifiedBy:String;
		/**
		 *Time when modified the state machine 
		 */
		private var _modifiedDate:Date;
		
		public function get stateMachineId():Number
		{
			return _stateMachineId;
		}
		public function set stateMachineId(value:Number):void
		{
			this._stateMachineId = value;
		}
		public function get stateMachineName():String
		{
			return _stateMachineName;
		}
		public function set stateMachineName(value:String):void
		{
			this._stateMachineName = value;
		}
		public function get stateMachineDesc():String
		{
			return _stateMachineDesc;
		}
		public function set stateMachineDesc(value:String):void
		{
			this._stateMachineDesc = value;
		}
		public function get stateMachineStatus():String
		{
			return this._stateMachineStatus;
		}
		public function set stateMachineStatus(value:String):void
		{
			this._stateMachineStatus = value;
		}
		public function get stateMachineEvents():String
		{
			return _stateMachineEvents;
		}
		public function set stateMachineEvents(value:String):void
		{
			this._stateMachineEvents = value;
		}
		public function get graph():StateMachineGraphVO
		{
			return _graph;
		}
		public function set graph(value:StateMachineGraphVO):void
		{
			this._graph = value;
		}
		public function get stateMachineModel():String
		{
			return _stateMachineModel;
		}
		public function set stateMachineModel(value:String):void
		{
			this._stateMachineModel = value;
		}
		public function get createdDate():Date
		{
			return this._createdDate
		}
		public function set createdDate(value:Date):void
		{
			this._createdDate = value;
		} 
		public function get createdBy():String
		{
			return this._createdBy;
		}
		public function set createdBy(value:String):void
		{
			this._createdBy = value;
		} 
		public function get modifiedDate():Date
		{
			return this._modifiedDate
		}
		public function set modifiedDate(value:Date):void
		{
			this._modifiedDate = value;
		} 
		public function get modifiedBy():String
		{
			return this._modifiedBy
		}
		public function set modifiedBy(value:String):void
		{
			this._modifiedBy = value;
		} 
		
	}
}
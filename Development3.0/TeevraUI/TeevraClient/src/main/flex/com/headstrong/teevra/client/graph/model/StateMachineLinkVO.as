package com.headstrong.teevra.client.graph.model
{
	[RemoteClass(alias="com.headstrong.teevra.services.statemachine.vo.StateMachineLinkVO")]
	[Bindable]
	public class StateMachineLinkVO
	{
		/**
		 *Name of the event 
		 */
		private var _eventName:String;
		/**
		 *Name of the source state 
		 */
		private var _sourceStateName:String;
		/**
		 *Name of the target state 
		 */
		private var _targetStateName:String;
		/**
		 * Tramsition action
		 */
		private var _transitionAction:StateMachineActionVO;
		/**
		 *User name who created the Process 
		 */
		 private var _createdBy :String;
		/**
		 *Time when created the Process 
		 */
		 private var _createdDate:Date;
		/**
		 *User name who modified the Process 
		 */
		 private var _modifiedBy :String;
		/**
		 *Time when modified the Process 
		 */
	    private var _modifiedDate :Date;
	    
	    /**
	     * 
	     * @return eventName
	     * 
	     */
	    public function get eventName():String
	    {
	    	return _eventName;
	    }
	    /**
	     * 
	     * @param value eventName
	     * 
	     */
	    public function set eventName(value:String):void
	    {
	    	this._eventName = value;
	    }
	    /**
	     * 
	     * @return sourceStateName
	     * 
	     */
	    public function get sourceStateName():String
	    {
	    	return _sourceStateName;
	    }
	    /**
	     * 
	     * @param value sourceStateName
	     * 
	     */
	    public function set sourceStateName(value:String):void
	    {
	    	this._sourceStateName = value;
	    }
	    /**
	     * 
	     * @return targetStateName
	     * 
	     */
	    public function get targetStateName():String
	    {
	    	return _targetStateName;
	    }
	    /**
	     * 
	     * @param value targetStateName
	     * 
	     */
	    public function set targetStateName(value:String):void
	    {
	    	this._targetStateName = value;
	    }
	    /**
	     * 
	     * @return transitionAction
	     * 
	     */
	    public function get transitionAction():StateMachineActionVO
	    {
	    	return _transitionAction;
	    }
	    /**
	     * 
	     * @param value transitionAction
	     * 
	     */
	    public function set transitionAction(value:StateMachineActionVO):void
	    {
	    	this._transitionAction = value;
	    }
	    /**
		 * 
		 * @return createdBy
		 * 
		 */
		public function get createdBy():String
		{
			return this._createdBy;
		}
		/**
		 * 
		 * @param value set createdBy
		 * 
		 */
		public function set createdBy(value:String):void
		{
			this._createdBy = value;
		}
		/**
		 * 
		 * @return createdDate
		 * 
		 */
		public function get createdDate():Date
		{
			return this._createdDate;
		}
		/**
		 * 
		 * @param value set createdDate
		 * 
		 */
		public function set createdDate(value:Date):void
		{
			this._createdDate = value;
		}
		/**
		 * 
		 * @return modifiedBy
		 * 
		 */
		public function get modifiedBy():String
		{
			return this._modifiedBy;
		}
		/**
		 * 
		 * @param value set modifiedBy
		 * 
		 */
		public function set modifiedBy(value:String):void
		{
			this._modifiedBy = value;
		}
		/**
		 * 
		 * @return modifiedDate
		 * 
		 */
		public function get modifiedDate():Date
		{
			return this._modifiedDate;
		}
		/**
		 * 
		 * @param value set modifiedDate
		 * 
		 */
		public function set modifiedDate(value:Date):void
		{
			this._modifiedDate = value;
		}
		
		public function StateMachineLinkVO()
		{
		}

	}
}
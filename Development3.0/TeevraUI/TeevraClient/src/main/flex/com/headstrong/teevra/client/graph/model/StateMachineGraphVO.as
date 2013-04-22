package com.headstrong.teevra.client.graph.model
{
	[RemoteClass(alias="com.headstrong.teevra.services.statemachine.vo.StateMachineGraphVO")]
	[Bindable]
	public class StateMachineGraphVO
	{
		/**
		 *unique state machine graph id 
		 */
		private var _stateMachineGraphId:Number;
		/**
		 *node object 
		 */
		private var _nodes:Object;
		/**
		 *link object 
		 */
		private var _links:Object;
		public function StateMachineGraphVO()
		{
		}
		/**
		 * 
		 * @return stateId
		 * 
		 */
		public function get stateMachineGraphId():Number
		{
			return _stateMachineGraphId;
		}

		/**
		 * 
		 * @param pId set stateId
		 * 
		 */
		public function set stateMachineGraphId(Id:Number):void
		{
			this._stateMachineGraphId = Id;
		}

		/**
		 * 
		 * @return nodes
		 * 
		 */
		public function get nodes():Object
		{
			return _nodes;
		}

		/**
		 * 
		 * @param n set nodes
		 * 
		 */
		public function set nodes(n:Object):void
		{
			this._nodes = n;
		}

		/**
		 * 
		 * @return links
		 * 
		 */
		public function get links():Object
		{
			return _links;
		}

		/**
		 * 
		 * @param l set links
		 * 
		 */
		public function set links(l:Object):void
		{
			this._links = l;
		}
	}
}
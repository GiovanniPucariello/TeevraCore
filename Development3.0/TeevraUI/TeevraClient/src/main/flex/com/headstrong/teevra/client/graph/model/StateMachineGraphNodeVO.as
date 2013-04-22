package com.headstrong.teevra.client.graph.model
{
	import com.headstrong.teevra.client.graph.model.common.GraphNodeVO;

	[RemoteClass(alias="com.headstrong.teevra.services.statemachine.vo.StateMachineGraphNodeVO")]
	[Bindable]
	public class StateMachineGraphNodeVO extends GraphNodeVO
	{
		/**
		 * Details of the state 
		 */
		private var _stateDetails:StateVO;
		public function StateMachineGraphNodeVO()
		{
			super();
		}
		
		/**
		 * 
		 * @return StateVO
		 * 
		 */
		public function get stateDetails():StateVO
		{
			return _stateDetails;
		}
		/**
		 * 
		 * @param value StateVO
		 * @return 
		 * 
		 */
		public function set stateDetails(value:StateVO):void
		{
			this._stateDetails = value;
		}		
	}
}
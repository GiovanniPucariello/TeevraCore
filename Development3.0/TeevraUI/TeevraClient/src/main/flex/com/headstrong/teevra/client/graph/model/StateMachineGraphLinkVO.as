package com.headstrong.teevra.client.graph.model
{
	import com.headstrong.teevra.client.graph.model.common.GraphLinkVO;

	[RemoteClass(alias="com.headstrong.teevra.services.statemachine.vo.StateMachineGraphLinkVO")]
	[Bindable]
	public class StateMachineGraphLinkVO extends GraphLinkVO
	{
		/**
		 * Holds the configuration of the links 
		 */
		private var _linkDetails:StateMachineLinkVO;
		/**
		 * widht of from node 
		 */
		private var _fromNodeWidth:int;
		/**
		 * height of  From Node
	 	*/
		private var _fromNodeHeight:int;
		/**
		 * width of the To node
	 	*/
		private var _toNodeWidth:int;
		/**
	 	* height of  To Node
	 	*/
		private var _toNodeHeight:int;
		
		public function StateMachineGraphLinkVO()
		{
		}
		
		/**
		 * 
		 * @return linkDetails
		 * 
		 */
		public function get linkDetails():StateMachineLinkVO
		{
			return _linkDetails;
		}
		/**
		 * 
		 * @param value linkDetails
		 * @return 
		 * 
		 */
		public function set linkDetails(value:StateMachineLinkVO):void
		{
			this._linkDetails = value;
		}
		/**
		 * 
		 * @return fromNodeWidth
		 * 
		 */
		public function get fromNodeWidth():int
		{
			return _fromNodeWidth;
		}
		/**
		 * 
		 * @param value fromNodeWidth
		 * 
		 */
		public function set fromNodeWidth(value:int):void
		{
			this._fromNodeWidth = value;
		}
		/**
		 * 
		 * @return fromNodeHeight
		 * 
		 */
		public function get fromNodeHeight():int
		{
			return _fromNodeHeight;
		}
		/**
		 * 
		 * @param value fromNodeHeight
		 * 
		 */
		public function set fromNodeHeight(value:int):void
		{
			this._fromNodeHeight = value;
		}
		/**
		 * 
		 * @return toNodeWidth
		 * 
		 */
		public function get toNodeWidth():int
		{
			return _toNodeWidth;
		}
		/**
		 * 
		 * @param value toNodeWidth
		 * 
		 */
		public function set toNodeWidth(value:int):void
		{
			this._toNodeWidth = value;
		}
		/**
		 * 
		 * @return toNodeHeight
		 * 
		 */
		public function get toNodeHeight():int
		{
			return _toNodeHeight;
		}
		/**
		 * 
		 * @param value toNodeHeight
		 * 
		 */
		public function set toNodeHeight(value:int):void
		{
			this._toNodeHeight = value;
		}
	}
}
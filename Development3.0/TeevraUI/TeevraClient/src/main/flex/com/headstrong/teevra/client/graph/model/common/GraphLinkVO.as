package com.headstrong.teevra.client.graph.model.common
{
	public class GraphLinkVO
	{
		public function GraphLinkVO()
		{
			
		}
		
		/**
		 *start node id 
		 */
		private var _startNodeId:String;
		/**
		 *ebd node id 
		 */
		private var _endNodeId:String;
		/**
		 *start X co ordinate 
		 */
		private var _startX:int;
		/**
		 *start Y co ordinate 
		 */
		private var _startY:int;
		/**
		 *end X Co ordinate 
		 */
		private var _endX:int;
		/**
		 *end Y Co ordinate 
		 */
		private var _endY:int;
		
		/**
		 * 
		 * @return startNodeId
		 * 
		 */
		public function get startNodeId():String
		{
			return _startNodeId;
		}
			
		/**
		 * 
		 * @param nodeId set startNodeId
		 * 
		 */
		public function set startNodeId(nodeId:String):void
		{
			_startNodeId = nodeId;
		}
		
		/**
		 * 
		 * @return endNodeId
		 * 
		 */
		public function get endNodeId():String
		{
			return _endNodeId;
		}
			
		/**
		 * 
		 * @param nodeId endNodeId
		 * 
		 */
		public function set endNodeId(nodeId:String):void
		{
			_endNodeId = nodeId;
		}
		
		/**
		 * 
		 * @return startX
		 * 
		 */
		public function get startX():Number
		{
			return _startX;
		}
			
		/**
		 * 
		 * @param x set startX
		 * 
		 */
		public function set startX(x:Number):void
		{
			_startX = x;
		}

		/**
		 * 
		 * @return startY
		 * 
		 */
		public function get startY():Number
		{
			return _startY;
		}
			
		/**
		 * 
		 * @param y set startY
		 * 
		 */
		public function set startY(y:Number):void
		{
			_startY = y;
		}

		/**
		 * 
		 * @return endX
		 * 
		 */
		public function get endX():Number
		{
			return _endX;
		}
			
		/**
		 * 
		 * @param x set endX
		 * 
		 */
		public function set endX(x:Number):void
		{
			_endX = x;
		}

		/**
		 * 
		 * @return endY
		 * 
		 */
		public function get endY():Number
		{
			return _endY;
		}
			
		/**
		 * 
		 * @param y set endY
		 * 
		 */
		public function set endY(y:Number):void
		{
			_endY = y;
		}
		

	}
}
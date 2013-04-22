package com.headstrong.teevra.client.graph.model.common
{
	public class GraphNodeVO
	{
		
		/**
		 *unique noteId 
		 */
		private var _nodeId:String;
		/**
		 *x co ordinate 
		 */
		private var _x:Number;
		/**
		 *y co ordinate 
		 */
		private var _y:Number;
		/**
		 *service details 
		 */
		public function GraphNodeVO()
		{
			super();
		}
		
		/**
		 * 
		 * @return nodeId
		 * 
		 */
		public function get nodeId():String
		{
			return _nodeId;
		}
			
		/**
		 * 
		 * @param id set nodeId
		 * 
		 */
		public function set nodeId(id:String):void
		{
			_nodeId = id;
		}

		/**
		 * 
		 * @return x
		 * 
		 */
		public function get x():Number
		{
			return _x;
		}
			
		/**
		 * 
		 * @param x set x
		 * 
		 */
		public function set x(x:Number):void
		{
			_x = x;
		}

		/**
		 * 
		 * @return y
		 * 
		 */
		public function get y():Number
		{
			return _y;
		}
			
		/**
		 * 
		 * @param y set y
		 * 
		 */
		public function set y(y:Number):void
		{
			_y = y;
		}
		

	}
}
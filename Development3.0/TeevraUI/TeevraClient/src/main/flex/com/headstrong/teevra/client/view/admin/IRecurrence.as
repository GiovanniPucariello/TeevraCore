package com.headstrong.teevra.client.view.admin
{	
	[RemoteClass(alias="com.headstrong.teevra.common.scheduling.Recurrence")]
	[Bindable]
	/**
	 * 
	 * @author PAakash
	 * 
	 */
	public interface IRecurrence
	{
		//String SPACE = " ";
		/**
		 * 
		 * @return executionTime
		 * 
		 */
		function get executionTime():ExecutionTime;
		/**
		 * 
		 * @param executionTime set executionTime
		 * 
		 */
		function set executionTime(executionTime:ExecutionTime):void;
		/**
		 * 
		 * @return recurrenceRange
		 * 
		 */
		function get recurrenceRange():RecurrenceRange;
		/**
		 * 
		 * @param recurrenceRange set recurrenceRange
		 * 
		 */
		function set recurrenceRange(recurrenceRange:RecurrenceRange):void;
		/**
		 * 
		 * @return recurrenceGap
		 * 
		 */
		function get recurrenceGap():int;
		/**
		 * 
		 * @param recurrenceGap set recurrenceGap
		 * 
		 */
		function set recurrenceGap(recurrenceGap:int):void;
	}
}
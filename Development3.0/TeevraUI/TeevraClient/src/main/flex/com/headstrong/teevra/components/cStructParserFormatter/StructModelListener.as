package com.headstrong.teevra.components.cStructParserFormatter
{
	/**
	 * Interface containing call back methods to be invoked by StructHolder whenever the list of 
	 * structure gets changed.
	 */
	public interface StructModelListener
	{
		/**
		 * Call back function to notify that a structure list is being loaded
		 */
		function structureListLoaded():void;

		/**
		 * Call back function to notify that there a structure is being added
		 */
		function structureAdded(newStruct:StructObjectModel):void;
		
		/**
		 * Call back function to notify that a structure is being modified
		 */
		function structureModified(modifiedStruct:StructObjectModel):void;

		/**
		 * Call back function to notify that a structure is being removed
		 */
		function structureRemoved(removedStruct:StructObjectModel):void;
	}
}
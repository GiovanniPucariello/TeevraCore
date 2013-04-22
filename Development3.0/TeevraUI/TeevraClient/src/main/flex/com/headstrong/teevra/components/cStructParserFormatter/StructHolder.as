package com.headstrong.teevra.components.cStructParserFormatter
{
	import mx.collections.ArrayCollection;
	

	/**
	 * Manages the list of structure present in the instance of C-Struct parser formatter component
	 */
	public class StructHolder
	{
		/**
		 * Holds the list of available struct types in this instance of C-struct parser formatter component
		 */
		private var availableStructTypes:ArrayCollection=null;

		/**
		 * List of observers for any change to the list of available struct
		 */
		 private var observers:ArrayCollection = new ArrayCollection();
		
		public function StructHolder()
		{
			
		}
		
		/**
		 * Registers given observer to get notified for any change in struct list 
		 */
		public function addStructListObserver(observer:StructModelListener):void {
			observers.addItem(observer);
		}
		
		/**
		 * Removes the given observer from the list of observers, so no notification would be sent to it
		 */
		public function removeStructListObserver(observer:Function):void {
			var index:int = observers.getItemIndex(observer);
			if (index != -1) {
				observers.removeItemAt(index);
			}
		}
		
		/**
		 * Gets the list of available struct types loaded into the component
		 */
		public function getAvailableStructs():ArrayCollection
		{
			if (availableStructTypes == null)
			{
				availableStructTypes = new ArrayCollection();
				//load primitive types
				loadPrimitiveTypes();
			}
			return availableStructTypes;
		}

		/**
		 * Loads the given list of struct types into the availableStructTypes
		 */
		public function loadStructs(structList:ArrayCollection):void
		{
			//ensure primitive types are loaded before the first loading
			getAvailableStructs();
			
			for(var i:int=0;i<structList.length;i++) {
				availableStructTypes.addItem(structList.getItemAt(i));
			}
			fireStructureListLoaded();
		}

		/**
		 * Returns the list of root level structures present in the available set of structs
		 */
		public function getRootLevelStructs(rootLevelStructs:ArrayCollection):void {
			var typesCount:int=availableStructTypes.length;
			//rootLevelStructs.addItem(new Object());
			for (var i:int=0; i < typesCount; i++)
			{
				var struct:StructObjectModel=StructObjectModel(availableStructTypes.getItemAt(i));
				if (struct.root)
				{
					rootLevelStructs.addItem(struct);
				}
			}
		}
		
		/**
		 * Returns the list of structures which are not leaves. For datagrid listing all the 
		 * non-leaf (primitive) structs created in this component
		 */
		 public function getNonLeafStructs(nonLeafStructs:ArrayCollection):void {
			var typesCount:int=availableStructTypes.length;
			for (var i:int=0; i < typesCount; i++)
			{
				var struct:StructObjectModel=StructObjectModel(availableStructTypes.getItemAt(i));
				if (struct.leaf)
				{
					continue;
				}
				nonLeafStructs.addItem(struct);
			}
		 }
		 
		/**
		 * Recursively fetches all the fields under the given parent structure. 
		 * Returns the name of all the attributes in the tree. 	Dotted notations are used for attributes 
		 * present from level 2 onwards with the names of attributes present in the previous levels of its tree path.
		 */
		public function getDottedFieldNames(parentStructName:String, fieldNames:ArrayCollection):void{
			var struct:StructObjectModel = getStruct(parentStructName);
			if (struct == null) {
				return;
			}
			getAttributes(struct, fieldNames, "");
		}
		
		/**
		 * List of structure in decreasing levels based on the given root level struct
		 */
		public function getDependentStructList(rootStruct:StructObjectModel):ArrayCollection {
			var structList:ArrayCollection = new ArrayCollection;
			var traversedList:ArrayCollection = new ArrayCollection();
			traversedList.addItem(rootStruct);
			loadStructDependencies(rootStruct, structList, traversedList);
			
			return structList;
		}
		
		/** Adds the given list into the list of available struct types.
		 * Returns true if successfully added and false if duplicate was found */
		public function addStruct(struct:StructObjectModel):Boolean
		{
			if (checkForDuplicateStruct(struct))
			{
				//duplicate present => dont add, return false
				return false;
			}
			availableStructTypes.addItem(struct);
			fireStructureAdded(struct);
			return true;
		}


		/** Removes the given struct identified by the name from the list of available struct types.
		 * Returns true if successfully deleted and false if given struct was not found */
		public function removeStruct(structName:String):Boolean
		{
			var index:int = getIndexOf(structName); 
			if (index == -1)
			{
				//given struct not present => dont delete, return false
				return false;
			}
			fireStructureRemoved(StructObjectModel(availableStructTypes.getItemAt(index)));
			availableStructTypes.removeItemAt(index);
			return true;
		}
		
		/**
		 * Updates the given struct - remove and add - in the list of available struct types.
		 * Returns true if updated successfully. False if struct with given name not present.
		 */
		 public function updateStruct(struct:StructObjectModel):Boolean {
		 	if (removeStruct(struct.structName)) {
		 		return addStruct(struct);
		 	} else {
		 		return false;
		 	}
		 }

		/**
		 * Notifies all the observers about the change in the list of struct present in 
		 * StructHolder so that they can re-initialize their data model */
		private function fireStructureListLoaded():void {
			for(var i:int=0;i<observers.length;i++) {
				var handler:StructModelListener = StructModelListener(observers.getItemAt(i));
				handler.structureListLoaded();
			}
		}

		/**
		 * Notifies addition of structure
		 */
		private function fireStructureAdded(newStruct:StructObjectModel):void {
			for(var i:int=0;i<observers.length;i++) {
				var handler:StructModelListener = StructModelListener(observers.getItemAt(i));
				handler.structureAdded(newStruct);
			}
		}

		/**
		 * Notifies structure is being modified
		 */
		private function fireStructureModified(modifiedStruct:StructObjectModel):void {
			for(var i:int=0;i<observers.length;i++) {
				var handler:StructModelListener = StructModelListener(observers.getItemAt(i));
				handler.structureModified(modifiedStruct);
			}
		}

		/**
		 * Notifies structure is being removed
		 */
		private function fireStructureRemoved(removedStruct:StructObjectModel):void {
			for(var i:int=0;i<observers.length;i++) {
				var handler:StructModelListener = StructModelListener(observers.getItemAt(i));
				handler.structureRemoved(removedStruct);
			}
		}

		/**
		 * Load primitive types into the set of available struct types
		 */
		private function loadPrimitiveTypes():void
		{
			addPrimitive("BYTE");
			addPrimitive("SHORT");
			addPrimitive("USHORT");
			addPrimitive("INT");
			addPrimitive("UINT");
			addPrimitive("LONG");
			addPrimitive("FLOAT");
			addPrimitive("DOUBLE");
			addPrimitive("CHAR");
			addPrimitive("UCHAR");
			addPrimitive("UTFSTRING");
		}

		/**
		 * Creates a struct for given primitive type and adds it to the list
		 */
		private function addPrimitive(name:String):void
		{
			var primitiveStruct:StructObjectModel = new StructObjectModel();
			primitiveStruct.structName = name;
			primitiveStruct.union = false;
			primitiveStruct.root = false;
			primitiveStruct.leaf = true;
			availableStructTypes.addItem(primitiveStruct);
			return;
		}

		/**
		 * Checks for the duplicate struct in the list of available struct.
		 * Returns true if duplicate present, false otherwise */
		private function checkForDuplicateStruct(structToCheck:StructObjectModel):Boolean
		{
			var typesCount:int=availableStructTypes.length;
			for (var i:int=0; i < typesCount; i++)
			{
				var struct:StructObjectModel=StructObjectModel(availableStructTypes.getItemAt(i));
				if (struct.structName == structToCheck.structName)
				{
					return true;
				}
			}
			return false;
		}
		
		/**
		 * Returns the index of given struct in the available struct list
		 */
		 private function getIndexOf(structName:String):int {
		 	var typesCount:int=availableStructTypes.length;
			for (var i:int=0; i < typesCount; i++)
			{
				var struct:StructObjectModel=StructObjectModel(availableStructTypes.getItemAt(i));
				if (struct.structName == structName)
				{
					return i;
				}
			}
			return -1;
		 }

		/**
		 * Returns the struct with the given name from the available struct list
		 */
		 public function getStruct(structName:String):StructObjectModel {
		 	var typesCount:int=availableStructTypes.length;
			for (var i:int=0; i < typesCount; i++)
			{
				var struct:StructObjectModel=StructObjectModel(availableStructTypes.getItemAt(i));
				if (struct.structName == structName)
				{
					return struct;
				}
			}
			return null;
		 }
		 
		 /**
		 * Recursively populates the attributes into the list with the prefix given.
		 */
		 private function getAttributes(struct:StructObjectModel, fieldNames:ArrayCollection, 
		 	prefix:String):void {
		 	//TODO This method won't work for structure with cyclic dependency in it
		 	var fields:ArrayCollection = struct.fieldSet;
		 	var fieldsCount:int = fields.length;
			for (var i:int=0; i < fieldsCount; i++)
			{
				var field:StructFieldObjectModel = StructFieldObjectModel(fields.getItemAt(i));
				var fieldType:StructObjectModel = getStruct(field.datatype);
				 
				if (fieldType.leaf)
				{
					fieldNames.addItem(prefix + field.fieldName);
				} else {
					getAttributes(fieldType, fieldNames, prefix + field.fieldName + ".");
				}
			}
		 }

		/**
		 * Recursively loads the dependent struct of the given struct in the order of decreasing dependencies.
		 * Dependencies are calculated based on the struct types the fields are based on. */
		private function loadStructDependencies(rootStruct:StructObjectModel, 
			structList:ArrayCollection, traversedList:ArrayCollection):void {
			
			var fieldSet:ArrayCollection = rootStruct.fieldSet;
			for (var i:int=0; i < fieldSet.length; i++)
			{
				var field:StructFieldObjectModel = StructFieldObjectModel(fieldSet.getItemAt(i));
				var fieldStruct:StructObjectModel = getStruct(field.datatype);
				
				//if the current field's type is already traversed, then ignore this field
				if (traversedList.getItemIndex(fieldStruct) != -1) {
					continue;
				} else {
					traversedList.addItem(fieldStruct);
				}
				
				//dependency list only comprise of complex types, not primitive struct types (leaf)
				if ((fieldStruct != null) && (!fieldStruct.leaf))
				{
					//check if this complex type is already added into the structList
					if (structList.getItemIndex(fieldStruct) == -1) {
						//not present, so get its dependencies added before we add it
						loadStructDependencies(fieldStruct, structList, traversedList);
						structList.addItem(fieldStruct);
					}
				}
			}
		}
	}
}
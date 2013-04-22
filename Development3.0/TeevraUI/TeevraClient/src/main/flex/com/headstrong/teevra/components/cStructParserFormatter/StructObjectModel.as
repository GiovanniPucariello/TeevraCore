package com.headstrong.teevra.components.cStructParserFormatter
{
	import mx.collections.ArrayCollection;
	
	/** Object model for C-Structure */
	public class StructObjectModel
	{
		private var _structName:String;
		private var _union:Boolean;
		private  var _root:Boolean;
		private var _fieldSet:ArrayCollection;
		private var _leaf:Boolean = false;
		
		/**
		 * Default Constructor */
		public function StructObjectModel()
		{
		}
		
		/** 
		 * Returns name of the structure */
		public function get structName():String {
			return _structName;
		}

		/** 
		 * Sets the name of the structure */
		public function set structName(name:String):void {
			_structName = name;
		}


		/** 
		 * Returns label of the structure */
		public function get label():String {
			return _structName;
		}

		/** 
		 * Returns if structure is union or not */
		public function get union():Boolean {
			return _union;
		}

		/** 
		 * Sets the structure is union or not*/
		public function set union(u:Boolean):void {
			_union = u;
		}

		/**
		 * Returns if the structure is a root level one or not */
		public function get root():Boolean {
			return _root;	
		}
		
		/**
		 * Sets the structure is a root level one or not */
		public function set root(r:Boolean):void {
			_root = r;
		}
		
		/**
		 * Returns the collection of fieldSet present inside the structure */
		public function get fieldSet():ArrayCollection {
			return _fieldSet;
		}

		/**
		 * Sets the collection of fieldSet present inside the structure */
		public function set fieldSet(f:ArrayCollection):void {
			_fieldSet = f; 				
		}

		/**
		 * Returns if the structure is a leaf level (primitive) one or not */
		public function get leaf():Boolean {
			return _leaf;	
		}
		
		/**
		 * Sets the structure is a leaf (primitive) one or not */
		public function set leaf(l:Boolean):void {
			_leaf = l;
		}
	}
}
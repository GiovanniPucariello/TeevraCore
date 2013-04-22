package com.headstrong.teevra.client.model
{
	import com.headstrong.teevra.client.view.entity.SchemaAttributeVO;
	import com.headstrong.teevra.client.view.entity.SchemaVO;
	
	import mx.collections.ArrayCollection;
	
	public class SchemaCache
	{
		private static const ATTR_SEPARATOR:String = ".";
		
		private static var schemaCache : SchemaCache = new SchemaCache();;
		private var schemaMap:Object;
		
		public function SchemaCache(){
		}
		
		public static function getInstance():SchemaCache {
			return schemaCache;
		}

		public function loadSchema(schemaCollection : ArrayCollection) :void {
			if (schemaCollection == null) {
				return;
			}
			schemaMap = new Object();
			for(var i:int=0;i<schemaCollection.length;i++) {
				var schema:SchemaVO = SchemaVO(schemaCollection.getItemAt(i));
				schemaMap[schema.schemaId] = schema;
			}	
		} 
		
		public function retrieveSchema(schemaId : Number) : SchemaVO {
			var val:Object = schemaMap[schemaId];
			if (val != null) {
				return SchemaVO(val);
			} else {
				return null;
			}
		}
		
		public function getNonPrimitiveSchema() : ArrayCollection {
			var schemaList:ArrayCollection = new ArrayCollection();
			for each(var schema:SchemaVO in schemaMap) {
				if (!schema.schemaIsPrimitive) {
					schemaList.addItem(schema);
				}
			}
			return schemaList;
		}
		
		public function getPublicSchemas():ArrayCollection{
			var publicSchemaList:ArrayCollection = new ArrayCollection();
			for each(var schema:SchemaVO in schemaMap) {
				if (schema.schemaIsPublic) {
					publicSchemaList.addItem(schema);
				}
			}
			return publicSchemaList;	
		}
		
		public function getAllLeafAttributesNames(schemaId : Number) : ArrayCollection {
			var attrList:ArrayCollection = new ArrayCollection();
			populateAllLeafAttributesNames(schemaId, attrList, "");
			return attrList;
		}
		
		public function populateAllLeafAttributesNames(schemaId : Number, 
			attrList:ArrayCollection, namePrefix:String) : void {
			var schemaVO:SchemaVO = retrieveSchema(schemaId);
			if (schemaVO == null) {
				return;
			}
			for each(var attribute:SchemaAttributeVO in schemaVO.attributes) {
				var attrTypeSchema:SchemaVO = retrieveSchema(attribute.schemaAttrType);
				if (attrTypeSchema == null) {
					continue;
				}
				if (attrTypeSchema.schemaIsPrimitive) {
					attrList.addItem(namePrefix + attribute.schemaAttrName);
				} else{
					populateAllLeafAttributesNames(attrTypeSchema.schemaId, 
						attrList, namePrefix + attribute.schemaAttrName + ATTR_SEPARATOR); 
				}
			}
		}
	}
}
class SingletonEnforcer {}
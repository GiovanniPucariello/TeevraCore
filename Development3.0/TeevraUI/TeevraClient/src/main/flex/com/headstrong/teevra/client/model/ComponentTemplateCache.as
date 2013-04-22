package com.headstrong.teevra.client.model
{
	import com.headstrong.teevra.client.graph.model.ComponentTemplateVO;
	
	import mx.collections.ArrayCollection;

	public class ComponentTemplateCache
	{
		private static var componentTemplateCache:ComponentTemplateCache=new ComponentTemplateCache();
		private var componentTemplateMap:Object = new Object();

		public static function getInstance():ComponentTemplateCache
		{
			return componentTemplateCache;
		}

		public function loadTemplate(templateMap:Object):void
		{
			if (templateMap == null)
			{
				return;
			}
			componentTemplateMap=templateMap

		}

		public function retrieveTemplate(componentId:Number):ArrayCollection
		{
			var val:ArrayCollection = ArrayCollection(componentTemplateMap[componentId]);
			if (val != null)
			{
				return val;
			}
			else
			{
				return null;
			}
		}

		/**
		 * Adds the given component template to the cache 
		 */
		public function addTemplate(compTemplate:ComponentTemplateVO):void
		{
			if (componentTemplateMap[compTemplate.compId] == null) {
				//no template exists for the given component
				var templateList:ArrayCollection = new ArrayCollection();
				templateList.addItem(compTemplate.templateName);
				componentTemplateMap[compTemplate.compId] = templateList;
			} else {
				//add the template name if it is not there in the list
				var val:ArrayCollection = ArrayCollection(componentTemplateMap[compTemplate.compId]);
				if (!val.contains(compTemplate.templateName)) {
					val.addItem(compTemplate.templateName);
				}
			}
		}

		/**
		 * Adds the given list of template names to the cache for the given compId 
		 */
		public function addTemplateList(compId:Number, templateList:ArrayCollection):void
		{
			componentTemplateMap[compId] = templateList;
		}

		public function ComponentTemplateCache()
		{
		}

	}
}
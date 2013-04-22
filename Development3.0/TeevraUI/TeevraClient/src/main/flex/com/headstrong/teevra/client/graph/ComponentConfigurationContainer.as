package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.events.ComponentTemplateEvent;
	import com.headstrong.teevra.client.graph.model.ComponentTemplateVO;
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.model.ComponentTemplateCache;
	import com.headstrong.teevra.client.model.SchemaCache;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.InputDialog;
	import com.headstrong.teevra.client.view.entity.SchemaAttributeVO;
	import com.headstrong.teevra.client.view.entity.SchemaVO;
	import com.headstrong.teevra.components.common.BaseComponentConfigurationUI;
	import com.headstrong.teevra.components.common.IComponentConfigurationUI;
	
	import flash.display.DisplayObject;
	import flash.events.Event;
	import flash.events.MouseEvent;
	import flash.system.ApplicationDomain;
	
	import mx.collections.ArrayCollection;
	import mx.containers.ControlBar;
	import mx.containers.Form;
	import mx.containers.FormItem;
	import mx.containers.TabNavigator;
	import mx.containers.TitleWindow;
	import mx.controls.Alert;
	import mx.controls.Button;
	import mx.controls.ComboBox;
	import mx.controls.Label;
	import mx.controls.TextInput;
	import mx.core.ClassFactory;
	import mx.core.IFlexDisplayObject;
	import mx.events.CloseEvent;
	import mx.events.FlexEvent;
	import mx.events.ModuleEvent;
	import mx.managers.PopUpManager;
	import mx.modules.ModuleLoader;
	import mx.rpc.IResponder;

	public class ComponentConfigurationContainer extends TitleWindow implements IResponder
	{
		private var closeEventHandler:Function;
		private var saveEventHandler:Function;
		private var componentVO:ComponentVO;
		private var moduleLoader:ModuleLoader;
		private var standardConfig:ComponentConfigurationForm;
		private var dynamicConfig:BaseComponentConfigurationUI;
		private var serviceDetails:ProcessServiceVO;
		private var schema:SchemaVO;
		private var schemaAttribute:SchemaAttributeVO;
		private var templateList:ComboBox=null;
		private var templateName:TextInput = null;
		private var currentTemplate:ComponentTemplateVO = null;
		
		private var chooseTemplatePopup:IFlexDisplayObject;
		private var saveTemplatePopup:IFlexDisplayObject;
		private var errorHandlerPopup:IFlexDisplayObject;
		
		private const CONFIG_KEY_SCHEMA_DESCR:String="objectSchemaDescriptor";
		
		private var errorHandler:ErrorHandler;
		private var processServiceVOErrorHandler:ProcessServiceVO;
		
		private const BUSINESS_ERROR_HANDLER_KEY:String = "businessErrorHandler";
		private const SYSTEM_ERROR_HANDLER_KEY:String = "systemErrorHandler";
		
		private var businessErrorHandlerValue:String;
		private var SystemErrorHandlerValue:String;
		

		public function ComponentConfigurationContainer()
		{
			super();
			this.layout="vertical";
			this.percentHeight=100;
			this.percentWidth=100;
			this.addEventListener(FlexEvent.CREATION_COMPLETE, centerPopup);
			this.addEventListener(FlexEvent.UPDATE_COMPLETE, centerPopup);
			this.showCloseButton=true;
			this.addEventListener(CloseEvent.CLOSE, popupClose);
		}

		private function popupClose(event:Event):void
		{
			PopUpManager.removePopUp(this);
		}

		public function centerPopup(event:Event):void
		{
			PopUpManager.centerPopUp(this);
		}

		public function create(componentVO:ComponentVO, svcDetails:ProcessServiceVO, closeHandler:Function, saveHandler:Function):void
		{
			this.componentVO=componentVO;
			this.serviceDetails=svcDetails;
			this.closeEventHandler=closeHandler;
			this.saveEventHandler=saveHandler;

			this.title=componentVO.compName + " Configuration";
			

			if ((componentVO.compConfigUI == null) || ("" == componentVO.compConfigUI))
			{
				standardConfig=new ComponentConfigurationForm(componentVO, null, serviceDetails, true);
				this.addChild(standardConfig);
				createControlBar();
			}
			else
			{
				moduleLoader=new ModuleLoader();
				moduleLoader.applicationDomain=ApplicationDomain.currentDomain;
				moduleLoader.url=componentVO.compConfigUI;
				moduleLoader.addEventListener(ModuleEvent.READY, onConfigurationUILoad);
				moduleLoader.addEventListener(ModuleEvent.ERROR, onModuleError);
				moduleLoader.loadModule();
			}
		}

		public function getServiceDetails():ProcessServiceVO
		{
			return serviceDetails;
		}

		private function createControlBar():void
		{
			var controlBar:ControlBar=new ControlBar();
			controlBar.percentHeight=10;
			controlBar.percentWidth=90;

			var saveBtn:Button=new Button();
			saveBtn.label="Save";
			saveBtn.addEventListener(MouseEvent.CLICK, saveConfiguration);
			controlBar.addChild(saveBtn);
			
			if(((componentVO.compConfigUI == null ||"" == componentVO.compConfigUI)&& componentVO.compConfigList.length!=0) || componentVO.compConfigUI!=null)
			{
				var loadTemplateBtn:Button=new Button();
				loadTemplateBtn.label="Load template...";
				loadTemplateBtn.addEventListener(MouseEvent.CLICK, fireGetTemplateEvent);
				controlBar.addChild(loadTemplateBtn);
	
				
				var saveTemplateBtn:Button=new Button();
				saveTemplateBtn.label="Save as Template...";
				saveTemplateBtn.addEventListener(MouseEvent.CLICK, getTemplateNameToSave);
				controlBar.addChild(saveTemplateBtn);
			}
			
			if(componentVO.compType!="ERRORREPORTER" && componentVO.compType!="ENDPOINT")
			{				          
				var errorHandlerBtn:Button = new Button();
				errorHandlerBtn.label="Configure Error Handler...";
				errorHandlerBtn.addEventListener(MouseEvent.CLICK , configureErrorHandler);
				controlBar.addChild(errorHandlerBtn);
			}

			var closeBtn:Button=new Button();
			closeBtn.label="Cancel";
			closeBtn.addEventListener(MouseEvent.CLICK, closeEventHandler);
			controlBar.addChild(closeBtn);

			this.addChild(controlBar);
		}

		public function saveConfiguration(event:MouseEvent):void
		{
			var serviceIDValidFlag:Boolean;
			
			var serviceID:String;
			var schemaSelectionText:String;
			var isErrHandlingReqd:Boolean;
			
			if(componentVO.compType!="ERRORREPORTER" && componentVO.compType!="ENDPOINT"){
				isErrHandlingReqd = true;
			}
			
			if (standardConfig != null)
			{
				serviceDetails=standardConfig.getProcessServiceConfig();
				//serviceIDValidFlag = validateServiceID(serviceDetails.serviceId);
				serviceIDValidFlag = true;				
			}
			else if (dynamicConfig != null && dynamicConfig.getConfiguration()!= null)
			{
				serviceDetails=dynamicConfig.getConfiguration();
				if(serviceDetails!=null)
				{
					//serviceIDValidFlag = validateServiceID(serviceDetails.serviceId);
					serviceIDValidFlag = true;
				}
			}
			//configure error handling configurations
			if(isErrHandlingReqd && serviceDetails!=null){
				configErrorHandling();	
			}
			
			if (serviceDetails != null && serviceIDValidFlag==true)
			{
				saveEventHandler.call();
			}
			
			else if(serviceDetails == null )
			{//do nothing mandatory message will be display from individual config UI			
			}
			
			else
			{
				Alert.show("Duplicate Service Id","Service Id");	
			}
			
		}
		/**
		 * Configure Error Handling for all the components other than ENDPOINT/ERRORREPORTER
		 *
		 */
		private function configErrorHandling():void
		{
			if(businessErrorHandlerValue!=null && businessErrorHandlerValue!="")
			{
				serviceDetails.businessErrorStrategy = businessErrorHandlerValue;
			}
			else
			{
				serviceDetails.businessErrorStrategy = resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndAbortJob.value');
			}					
			if(SystemErrorHandlerValue!=null && SystemErrorHandlerValue!="")
			{
				serviceDetails.systemErrorStrategy = SystemErrorHandlerValue;
			}
			else
			{
				serviceDetails.systemErrorStrategy = resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndAbortJob.value');
			}
		}
		
		public function onConfigurationUILoad(e:ModuleEvent):void
		{
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			var module:IComponentConfigurationUI=moduleLoader.child as IComponentConfigurationUI;
			var schemas:ArrayCollection=SchemaCache.getInstance().getPublicSchemas();
			dynamicConfig=module.getConfigurationUI();
			dynamicConfig.schemas=schemas;
			dynamicConfig.component=componentVO;
			dynamicConfig.processServiceConfig=serviceDetails;
			dynamicConfig.percentWidth=100;
			dynamicConfig.percentHeight=90;
			dynamicConfig.initUI();
			
			this.addChild(dynamicConfig);
			createControlBar();
		}

		public function onModuleError(e:ModuleEvent):void
		{
			Alert.show(e.errorText);
		}


		/**
		 * All component configuration screens fetches the template field from the parent container.
		 *
		 */
		public function getTemplateField():ComboBox
		{
			if (templateList != null)
			{
				return templateList;
			}
			templateList=new ComboBox();
			templateList.editable = false;
			templateList.itemRenderer=new ClassFactory(Label);
			var templates:ArrayCollection = ComponentTemplateCache.getInstance().retrieveTemplate(componentVO.compId);
			if (templates != null)
			{
				templateList.dataProvider=templates;
			}
			templateList.selectedIndex=-1;

			//add change listener to the template field
//			templateList.addEventListener(ListEvent.ITEM_FOCUS_OUT, onComponentTemplateChange);
			return templateList;
		}

		/**
		 * Fetches list of template names and then opens the popup for the user to select a template
		 */
		private function fireGetTemplateEvent(e:MouseEvent):void {
			if (ComponentTemplateCache.getInstance().retrieveTemplate(componentVO.compId) != null) {
				//templates are in cache. use it
				chooseTemplateToLoad();
			} else {
				//if templates are not loaded into the cache
				var args:Object = new Object();
				args[ComponentTemplateEvent.ARG_COMP_ID] = componentVO.compId;
				var compTemplateEvent:ComponentTemplateEvent = new ComponentTemplateEvent(ComponentTemplateEvent.GET_NAMES_COMMAND, args, this);
				compTemplateEvent.dispatch();
			}
		}
		
		/**
		 * Opens an input dialog to choose from the list of templates available for this component.
		 */
		private function chooseTemplateToLoad():void {
			var chooseTemplateForm:Form = new Form();
			var formItem:FormItem = new FormItem();
			formItem.label = "Template";
			formItem.addChild(getTemplateField());
			chooseTemplateForm.addChild(formItem);
			
	    	chooseTemplatePopup = PopUpManager.createPopUp(DisplayObject(this), InputDialog, true, null);
	    	(InputDialog(chooseTemplatePopup)).create("Choose Template", chooseTemplateForm, loadTemplate, chooseTemplateCancel, "Load", "Cancel");
		}
		
		/**
		 * Opens an input dialog to specify a template name to store the configurations of the component.
		 */
		private function getTemplateNameToSave(e:MouseEvent):void {
			//get the configurations specified for the component
			if (standardConfig != null)
			{
				serviceDetails = standardConfig.getProcessServiceConfig();
			}
			else if (dynamicConfig != null)
			{
				serviceDetails = dynamicConfig.getConfiguration();

			}
			if (serviceDetails == null) {
				//return if no configuration is specified
				return;
			}
			
			var saveTemplateForm:Form = new Form();
			
			var formItem:FormItem = new FormItem();
			formItem.label = "Template Name";
			templateName = new TextInput();
			formItem.addChild(templateName);
			
			saveTemplateForm.addChild(formItem);
			
	    	saveTemplatePopup = PopUpManager.createPopUp(DisplayObject(this), InputDialog, true, null);
	    	(InputDialog(saveTemplatePopup)).create("Save Template", saveTemplateForm, saveConfigurationAsTemplate, saveTemplateCancel, "Save", "Cancel");
		}
		
		/**
		 * When the user cancels the choose template action
		 */
	    public function chooseTemplateCancel(event:MouseEvent):void{
	    	PopUpManager.removePopUp(chooseTemplatePopup);
	    }

		/**
		 * When the user cancels the save template action 
		 */ 
	    public function saveTemplateCancel(event:MouseEvent):void{
	    	PopUpManager.removePopUp(saveTemplatePopup);
	    }
	    
	    /**
	    * Invoked when the selects a template from the dropdown to load
	    */
	    public function loadTemplate(e:Event):void{
	    	var templateName:String = templateList.text;
			if (templateName != "")
			{
				var args:Object = new Object();
				args[ComponentTemplateEvent.ARG_COMP_ID] = componentVO.compId;
				args[ComponentTemplateEvent.ARG_TEMPLATE_NAME] = templateName;
				var compTemplateEvent:ComponentTemplateEvent = new ComponentTemplateEvent(ComponentTemplateEvent.GET_CONFIG_COMMAND, args, this);
				compTemplateEvent.dispatch();
			}
	    }

		/**
		 * Saves configurations specified for the component as template.
		 */
		public function saveConfigurationAsTemplate(e:Event):void
		{
			if (templateName.text == null || templateName.text=="")
			{
				Alert.show("Please specify template name", "Missing template name");
				return;
			}
			if (serviceDetails != null)
			{
				currentTemplate = new ComponentTemplateVO();
				currentTemplate.compId = componentVO.compId;
				currentTemplate.templateName = templateName.text;
				currentTemplate.configurations = serviceDetails.configurations;
				var args:Object = new Object();
				args[ComponentTemplateEvent.ARG_COMP_TEMPLATE] = currentTemplate;
				var compTemplateEvent:ComponentTemplateEvent = new ComponentTemplateEvent(ComponentTemplateEvent.SAVE_CONFIG_COMMAND, args, this);
				compTemplateEvent.dispatch();
			}
			PopUpManager.removePopUp(saveTemplatePopup);			
		}

		/**
		 * executed if delegator's ComponentServiceDelegate successful in getting ComponentTemplateEO
		 * @param event
		 *
		 */
		public function result(event:Object):void
		{
			switch (ComponentTemplateEvent.currentCommand) {
				case ComponentTemplateEvent.GET_NAMES_COMMAND:
					//result for getting the list of template names for the user to pick up
					var names:ArrayCollection = ArrayCollection(event.result);
					ComponentTemplateCache.getInstance().addTemplateList(componentVO.compId, names);
					
					//open the popup for the user to select from the list of available templates
					chooseTemplateToLoad();
					break;
				case ComponentTemplateEvent.GET_CONFIG_COMMAND:
					//result for loading the configuration
					var componentTemplate:ComponentTemplateVO = ComponentTemplateVO(event.result);
					if (componentTemplate == null)
						return;
						
					if (standardConfig != null)
					{
						standardConfig.loadTemplateConfigurations(componentTemplate.configurations);
					}
					else if (dynamicConfig != null)
					{
						dynamicConfig.loadConfigurations(componentTemplate.configurations);
		
					}
					PopUpManager.removePopUp(chooseTemplatePopup);
					break;
				case ComponentTemplateEvent.SAVE_CONFIG_COMMAND:
					//result after saving the template configuration
					//add it to the cache
					ComponentTemplateCache.getInstance().addTemplate(currentTemplate);
					Alert.show("Template saved successfully.", "Save successful");
					break;
			}
		}

		/**
		 * executed if delegator's ComponentServiceDelegate failed in getting ComponentTemplateEO
		 * @param event
		 *
		 */
		public function fault(event:Object):void
		{
			Alert.show(event.fault.faultString);
		}
		public function configureErrorHandler(e:MouseEvent):void
		{	
			
			if(serviceDetails!=null)
			{
				businessErrorHandlerValue = serviceDetails.businessErrorStrategy;
				SystemErrorHandlerValue = serviceDetails.systemErrorStrategy;
			}
			errorHandler = new ErrorHandler();
			var tabNavigator:TabNavigator = new TabNavigator();
			tabNavigator.addChild(errorHandler.buildBusinessHandler(businessErrorHandlerValue));
			tabNavigator.addChild(errorHandler.buildSystemHandler(SystemErrorHandlerValue));
			errorHandlerPopup = PopUpManager.createPopUp(DisplayObject(this), InputDialog, true, null);
	        (InputDialog(errorHandlerPopup)).create("Error Handler", tabNavigator, okHandlerFunction, cancelHandlerFunction, "Ok", "Cancel");
		}
		public function okHandlerFunction(e:Event):void
		{
			if(errorHandler.businessErrorValue!="")
			{
				businessErrorHandlerValue = errorHandler.businessErrorValue;
				if(businessErrorHandlerValue==resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndAbortJobThreshold.value'))
				{
					businessErrorHandlerValue = errorHandler.getBusinessTextValue();
				}
				
			}
			if(errorHandler.systemErrorValue!="")
			{
				SystemErrorHandlerValue = errorHandler.systemErrorValue;
				if(SystemErrorHandlerValue==resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndAbortJobThreshold.value'))
				{
					SystemErrorHandlerValue = errorHandler.getSystemTextValue();
				}
			}	
			PopUpManager.removePopUp(errorHandlerPopup);
		}
		public function cancelHandlerFunction(event:MouseEvent):void{
	    	PopUpManager.removePopUp(errorHandlerPopup);
	    }
		

	}
}
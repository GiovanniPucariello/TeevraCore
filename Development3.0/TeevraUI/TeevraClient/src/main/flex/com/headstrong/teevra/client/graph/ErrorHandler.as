package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	
	import flash.events.FocusEvent;
	
	import mx.containers.HBox;
	import mx.containers.Panel;
	import mx.containers.VBox;
	import mx.controls.RadioButton;
	import mx.controls.RadioButtonGroup;
	import mx.controls.TextInput;
	import mx.events.ItemClickEvent;
	
	public class ErrorHandler extends Panel
	{
		private var _businessErrorValue:String;
		private var _systemErrorValue:String;
		private var businessErrorVBox:VBox;
		private var systemErrorVBox:VBox;
		private var thresholdHBox:HBox;
		private var reportAndContinueJob:RadioButton;
		private var reportAndAbortJob:RadioButton;
		private var reportAndAbortJobIfThresholdCrossed:RadioButton;
		private var reportAndStopProcess:RadioButton;
		private var businessErrorRadioGroup:RadioButtonGroup;
		private var systemErrorRadioGroup:RadioButtonGroup;
		public var businessThresholdTextInput:TextInput;
		public var systemThresholdTextInput:TextInput;
		private var serviceDetails:ProcessServiceVO;
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		
		private const BUSINESS_ERROR:String="Business Error";
		
		public function set businessErrorValue(val:String):void
		{
			this._businessErrorValue = val;
		}
		public function get businessErrorValue():String
		{
			return this._businessErrorValue;
		}
		public function set systemErrorValue(val:String):void
		{
			this._systemErrorValue = val;
		}
		public function get systemErrorValue():String
		{
			return this._systemErrorValue;
		}
		public function getBusinessTextValue():String
		{
			return businessThresholdTextInput.text;
		}
		public function getSystemTextValue():String
		{
			return systemThresholdTextInput.text;
		}
		private function buildUI(mainVBox:VBox,radioGroup:RadioButtonGroup,simpleValue:String,textInput:TextInput):void
		{
			
			thresholdHBox = new HBox();
				
			reportAndContinueJob = new RadioButton();
			
			reportAndContinueJob.label=resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndContinueJob.label');
			reportAndContinueJob.value=resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndContinueJob.value');;
			//reportAndContinueJob.selected = true;
			reportAndContinueJob.group = radioGroup;
			reportAndAbortJob = new RadioButton();
			reportAndAbortJob.label=resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndAbortJob.label');
			reportAndAbortJob.value=resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndAbortJob.value');
			
			reportAndAbortJob.group = radioGroup;
			reportAndAbortJobIfThresholdCrossed = new RadioButton();
			reportAndAbortJobIfThresholdCrossed.label=resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndAbortJobThreshold.label');
			reportAndAbortJobIfThresholdCrossed.value=resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndAbortJobThreshold.value');
			
			
			reportAndAbortJobIfThresholdCrossed.group = radioGroup;
			thresholdHBox.addChild(reportAndAbortJobIfThresholdCrossed);
			textInput.percentWidth = 40;
			thresholdHBox.addChild(textInput);
			thresholdHBox.percentWidth=100;
			reportAndStopProcess = new RadioButton();
			reportAndStopProcess.label=resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndStopProcess.label');
			reportAndStopProcess.value=resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndStopProcess.value');
			reportAndStopProcess.group = radioGroup;
			
			mainVBox.addChild(reportAndContinueJob);
			mainVBox.addChild(reportAndAbortJob);
			mainVBox.addChild(thresholdHBox);
			mainVBox.addChild(reportAndStopProcess);
			
			 
			if(simpleValue!=null && simpleValue!="")
			{
				//Added to the fix Bug  Redmine#648 BugChase#99 - Start
				//Pass the error type also so that the threshold value can be updated accordingly 
				loadValue(simpleValue,textInput,mainVBox.label);
				//Added to the fix Bug  Redmine#648 BugChase#99 - End
			}
			else
			{
				reportAndAbortJob.selected = true;
				//default system and business value if user doen't select any
				businessErrorValue = systemErrorValue = resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndAbortJob.value');
			}
			
			
			if(mainVBox.label==BUSINESS_ERROR)
			{
				radioGroup.addEventListener(ItemClickEvent.ITEM_CLICK,getBusinessValue);
				//Added to the fix Bug  Redmine#648 BugChase#99 - Start
				//Update the threshold value when the input is entered [even when radio button is not selected]
				textInput.addEventListener(FocusEvent.FOCUS_OUT,getBusinessThresholdValue);
				//Added to the fix Bug  Redmine#648 BugChase#99 - End
			}
			else
			{
				radioGroup.addEventListener(ItemClickEvent.ITEM_CLICK,getSystemValue);
				//Added to the fix Bug  Redmine#648 BugChase#99 - Start
				//Update the threshold value when the input is entered [even when radio button is not selected]
				textInput.addEventListener(FocusEvent.FOCUS_OUT,getSystemThresholdValue);
				//Added to the fix Bug  Redmine#648 BugChase#99 - End
			}
		}	
		private function loadValue(simpleValue:String,textInput:TextInput, errorType:String):void
		{
			switch(simpleValue)
			{
				case "":
				case null:
					break;
				case "ReportAndContinueJob":
					reportAndContinueJob.selected=true;
					break;
				case "ReportAndAbortJob":
					reportAndAbortJob.selected=true;
					break;
				case "ReportAndStopProcess":
					reportAndStopProcess.selected=true;
					break;
				default:
					reportAndAbortJobIfThresholdCrossed.selected=true;
					textInput.text=simpleValue;
					textInput.editable=true;
					//Added to the fix Bug  Redmine#648 BugChase#99 - Start
					if (errorType==BUSINESS_ERROR){
						businessErrorValue=simpleValue;
					} else {
						systemErrorValue=simpleValue;
					}
					//Added to the fix Bug  Redmine#648 BugChase#99 - End
					break;
			}
		}	
		public function ErrorHandler()
		{	
		}
		public function buildBusinessHandler(businessErrorHandlerValue:String):VBox
		{
			businessErrorVBox = new VBox();
			businessThresholdTextInput = new TextInput();
			businessThresholdTextInput.editable = false;
			businessErrorVBox.label=resourceManager.getString('TeevraUI', 'label.ErrorHandler.businessError');
			businessErrorVBox.percentWidth=40;
			businessErrorRadioGroup = new RadioButtonGroup();
			businessErrorValue = businessErrorHandlerValue;
			buildUI(businessErrorVBox,businessErrorRadioGroup,businessErrorValue,businessThresholdTextInput);
			return businessErrorVBox;			
		}
		public function buildSystemHandler(systemErrorHandlerValue:String):VBox
		{
			systemErrorVBox = new VBox();
			systemThresholdTextInput = new TextInput();
			systemThresholdTextInput.editable = false;
			systemErrorVBox.label=resourceManager.getString('TeevraUI', 'label.ErrorHandler.systemError');
			systemErrorVBox.percentWidth=40;
			systemErrorRadioGroup = new RadioButtonGroup();
			systemErrorValue = systemErrorHandlerValue;
			buildUI(systemErrorVBox,systemErrorRadioGroup,systemErrorValue,systemThresholdTextInput);
			return systemErrorVBox;			
		}
		private function getSystemValue(event:ItemClickEvent):void
		{
			if(event.currentTarget.selectedValue==resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndAbortJobThreshold.value'))
			{
				systemThresholdTextInput.editable = true;
				systemThresholdTextInput.text = "1";
			}
			else
			{
				systemThresholdTextInput.editable = false;
				systemThresholdTextInput.text="";
			}
			systemErrorValue = event.currentTarget.selectedValue;
		}
		private function getBusinessValue(event:ItemClickEvent):void
		{	
			if(event.currentTarget.selectedValue==resourceManager.getString('TeevraUI', 'label.ErrorHandler.reportAndAbortJobThreshold.value'))
			{
				businessThresholdTextInput.editable = true;
				businessThresholdTextInput.text = "1";
			}	
			else
			{
				businessThresholdTextInput.editable = false;
				businessThresholdTextInput.text="";
			}
			businessErrorValue = event.currentTarget.selectedValue;
		}
		//Added to the fix Bug  Redmine#648 BugChase#99 - Start
		private function getSystemThresholdValue(event:FocusEvent):void
		{
			systemErrorValue = (event.currentTarget as TextInput).text;
		}
		private function getBusinessThresholdValue(event:FocusEvent):void
		{	
			businessErrorValue = (event.currentTarget as TextInput).text;
		}
		//Added to the fix Bug  Redmine#648 BugChase#99 - End
	}
}
/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: Recurrence.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Dec 19, 2008  
 */
package com.headstrong.teevra.client.view.admin
{
	import com.headstrong.teevra.client.model.ViewModelLocator;
	
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.containers.ControlBar;
	import mx.containers.HBox;
	import mx.containers.TitleWindow;
	import mx.containers.VBox;
	import mx.containers.ViewStack;
	import mx.controls.Alert;
	import mx.controls.Button;
	import mx.controls.ComboBox;
	import mx.controls.DateField;
	import mx.controls.HRule;
	import mx.controls.Label;
	import mx.controls.RadioButton;
	import mx.controls.RadioButtonGroup;
	import mx.controls.VRule;
	import mx.events.CloseEvent;
	import mx.events.DropdownEvent;
	import mx.events.ItemClickEvent;
	import mx.managers.PopUpManager;
	
	public class Recurrence extends TitleWindow 
	{	
		private var recurrencePatternHBox:HBox;
		private var viewStack:ViewStack;
		private var initialTime:String;
		private var endTime:ComboBox;
		private var startTime:ComboBox;
		private var startDateChoser:DateField;
		private var endDateChoser:DateField;
		private var initalEndTime:String;

		private var dailyRadio:RadioButton;
		private var weeklyRadio:RadioButton;
			
		private var dailySchedule:DailySchedule;
		private var weeklySchedule:WeeklySchedule; 
		private var closeEventHandler:Function;
		private var saveEventHandler:Function;		
		private const DAILY_RECURRENCE:String = "DAILY";
		private const WEEKLY_RECURRENCE:String = "WEEKLY";
		private const START_DATE_CHOSSER:String = "STARTDATECHOSSER";
		
		
		private var dailyRecurrence:DailyRecurrence;
		private var weeklyRecurrence:WeeklyRecurrence;
		
		private var starttime:String;
		private var endtime:String;
		private var startdate:Date;
		private var enddate:Date;
	
		// Right now recurrence is used by Process and Ref Data. 
		private var processSchedule:ProcessSchedule = null;
	    private var cacheSchedule:CacheReloadSchedule = null;
		
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		
		public function Recurrence()
		{
			super();
			this.layout = "vertical";
			this.showCloseButton=true;
			this.addEventListener(CloseEvent.CLOSE,popupClose);
			init();
		}
		 private function popupClose(event:Event):void{
	    	PopUpManager.removePopUp(this);
	    }
		
		public function init():void
		{
			var currentDate:Date = new Date();
			var currentTime:Number = currentDate.getHours()*60 + currentDate.getMinutes();
			
			initialTime = timeGeneratorString(currentTime);
			initalEndTime = (currentDate.getMinutes() > 0) ? timeGeneratorString((currentDate.getHours() + 1) * 60) 
								: timeGeneratorString(currentDate.getHours() * 60 + 30); 
		}
		
		public function createProcessUI(closeHandler:Function, saveEventHandler:Function, processSchedule:ProcessSchedule):void
		{
			this.processSchedule = processSchedule;
			create(closeHandler, saveEventHandler);
		}
		
		public function createCacheReloadUI(closeHandler:Function, saveEventHandler:Function, cacheSchedule:CacheReloadSchedule):void
		{	
			this.cacheSchedule = cacheSchedule;
			create(closeHandler, saveEventHandler);
		}	
		
		private function create(closeHandler:Function, saveEventHandler:Function):void
		{	
			var schedule: Object = (processSchedule != null ) ? processSchedule:cacheSchedule;
			
			this.title = schedule.titleLabel;
			this.closeEventHandler = closeHandler;
			this.saveEventHandler = saveEventHandler;
			
			var mainVBox:VBox = new VBox();
			mainVBox.percentWidth=100;
						
			//First VBox
			var scheduleTimeVbox:VBox = new VBox(); 
			var scheduleTimeLabel:Label = new Label();
			scheduleTimeLabel.text = schedule.timeLabel;
			scheduleTimeLabel.setStyle("fontWeight","bold");
			var scheduleHRule1:HRule = new HRule();
			scheduleHRule1.percentWidth = 100;
			var scheduleHRule2:HRule = new HRule();
			scheduleHRule2.percentWidth = 100;
			scheduleTimeVbox.addChild(scheduleHRule1);
			scheduleTimeVbox.addChild(scheduleTimeLabel);
			scheduleTimeVbox.addChild(scheduleHRule2);
			scheduleTimeVbox.percentWidth = 100;
			
			//Second VBox i.e. Recurrence Pattern
			var recurrencePatternVBox:VBox = new VBox();
			recurrencePatternVBox.width = 500;
			var recurrenceLabel:Label = new Label();
			recurrenceLabel.text=resourceManager.getString('TeevraUI', 'label.Recurrence.recurrencepattern');
			recurrenceLabel.setStyle("fontWeight","bold");
			var recurrenceHRule1:HRule = new HRule();
			recurrenceHRule1.percentWidth = 100;
			var recurrenceHRule2:HRule = new HRule();
			recurrenceHRule2.percentWidth = 100;		
			recurrencePatternVBox.addChild(recurrenceHRule1);
			recurrencePatternVBox.addChild(recurrenceLabel);
			recurrencePatternVBox.addChild(recurrenceHRule2);
			recurrencePatternVBox.percentWidth = 100;	
			
			//Third VBox i.e. Range Of Recurrence	
			var rangeRecurrenceVBox:VBox = new VBox();
			var rangeRecurrenceLabel:Label = new Label();
			rangeRecurrenceLabel.text = resourceManager.getString('TeevraUI', 'label.Recurrence.rangeOfRecurrence');
			rangeRecurrenceLabel.setStyle("fontWeight","bold");
			var rangeRecurrenceHRule1:HRule = new HRule();
			rangeRecurrenceHRule1.percentWidth = 100;
			var rangeRecurrenceHRule2:HRule = new HRule();
			rangeRecurrenceHRule2.percentWidth = 100;		
			rangeRecurrenceVBox.addChild(rangeRecurrenceHRule1);
			rangeRecurrenceVBox.addChild(rangeRecurrenceLabel);
			rangeRecurrenceVBox.addChild(rangeRecurrenceHRule2);
			rangeRecurrenceVBox.percentWidth = 100;
			
			var AppoinmentTime:VBox = new VBox();//main VBox which contains the start and end time drop down
			var datePicker:Date = new Date();
			
			//first VBox code Start
			var startLabel:Label = new Label();
			var endLabel:Label = new Label();
			startLabel.text = resourceManager.getString('TeevraUI', 'label.Recurrence.startTime');
			endLabel.text = resourceManager.getString('TeevraUI', 'label.Recurrence.endTime');
			
			startTime = new ComboBox();
			endTime = new ComboBox();
			
			var startTimeHBox:HBox = new HBox();
			var endTimeHBox:HBox = new HBox();
			
			startTime.dataProvider = DateProvider();
			endTime.dataProvider = DateProvider();
			startTime.addEventListener(DropdownEvent.CLOSE,changeEndTime);
			startTime.selectedItem = initialTime;
			endTime.selectedItem = initalEndTime;
			startTimeHBox.addChild(startLabel);
			startTimeHBox.addChild(startTime);

			endTimeHBox.addChild(endLabel);
			endTimeHBox.addChild(endTime);
			
			AppoinmentTime.addChild(startTimeHBox);
			
			if (schedule is ProcessSchedule)
				AppoinmentTime.addChild(endTimeHBox);
				
			scheduleTimeVbox.addChild(AppoinmentTime);//first panel
			
			mainVBox.addChild(scheduleTimeVbox);
			//first VBox code End
			 
			//second VBox code start
			recurrencePatternHBox = new HBox();
			var occurencePatternVBox:VBox = new VBox();
			
			var occurencePatternRadioGroup:RadioButtonGroup = new RadioButtonGroup();
			dailyRadio = new RadioButton();
			weeklyRadio = new RadioButton();
			
			dailyRadio.label = resourceManager.getString('TeevraUI', 'label.Recurrence.daily');
			dailyRadio.selected = true;
			dailyRadio.value = resourceManager.getString('TeevraUI', 'label.Recurrence.Daily');
			dailyRadio.group = occurencePatternRadioGroup;
			
			weeklyRadio.label = resourceManager.getString('TeevraUI', 'label.Recurrence.weekly');
			weeklyRadio.value = resourceManager.getString('TeevraUI', 'label.Recurrence.weekly');
			weeklyRadio.group = occurencePatternRadioGroup;
			
			occurencePatternVBox.addChild(dailyRadio);
			occurencePatternVBox.addChild(weeklyRadio);
			occurencePatternVBox.percentWidth = 20;
			
			recurrencePatternHBox.addChild(occurencePatternVBox);//first element
			recurrencePatternHBox.addChild(new VRule());//second element
			
			viewStack = new ViewStack();
			//viewStack.percentWidth=80;
			viewStack.width = 400;
			viewStack.percentHeight = 100;
			dailySchedule = new DailySchedule();
			weeklySchedule = new WeeklySchedule();
			viewStack.addChild(dailySchedule);
			viewStack.addChild(weeklySchedule);
			recurrencePatternHBox.addChild(viewStack);//third element
			
			recurrencePatternVBox.addChild(recurrencePatternHBox); 
			
			
			mainVBox.addChild(recurrencePatternVBox);
			
			occurencePatternRadioGroup.addEventListener(ItemClickEvent.ITEM_CLICK,loadUI);
			
			//second VBox code end
			
			//Third VBox code start
			
			var datePickerHBox:HBox = new HBox();
			var startDateLabel:Label = new Label();
			var endDateLabel:Label = new Label();
			
			//logic to block the datechoser from selecting the previous date other than today's date
			var today:Date = new Date();
			var yesterday:Date = new Date(today.fullYear, today.month, today.date-1);
			
			startDateChoser = new DateField();
			startDateChoser.disabledRanges=[{rangeEnd:yesterday}];
			endDateChoser = new DateField();
			endDateChoser.disabledRanges=[{rangeEnd:yesterday}]
			
			if(schedule.recurrence!=null)
			{
				loadDetails();
				startTime.selectedItem = starttime;
				endTime.selectedItem = endtime;
				startDateChoser.selectedDate = startdate;
				endDateChoser.selectedDate = enddate;
				
				if (schedule.recurrenceType == DAILY_RECURRENCE) {
					dailyRadio.selected = true;
					dailySchedule.setRecurrence(DailyRecurrence(schedule.recurrence));
					viewStack.selectedIndex = 0;
				} else {
					weeklyRadio.selected = true;
					weeklySchedule.setRecurrence(WeeklyRecurrence(schedule.recurrence));
					viewStack.selectedIndex = 1;
				}
			}
			
			startDateChoser.yearNavigationEnabled=true;
			endDateChoser.yearNavigationEnabled=true;
			 
			//startDateChoser.addEventListener(DropdownEvent.CLOSE,validateStartDate);
			//endDateChoser.addEventListener(DropdownEvent.CLOSE,validateEndDate);
			
			startDateLabel.text=resourceManager.getString('TeevraUI', 'label.Recurrence.start');
			endDateLabel.text=resourceManager.getString('TeevraUI', 'label.Recurrence.end');
						
			datePickerHBox.addChild(startDateLabel);
			datePickerHBox.addChild(startDateChoser);
			datePickerHBox.addChild(endDateLabel);
			datePickerHBox.addChild(endDateChoser);
			rangeRecurrenceVBox.addChild(datePickerHBox);
			
			mainVBox.addChild(rangeRecurrenceVBox);
			//Third VBox code end
			
			this.addChild(mainVBox);
			createControlBar();
			
		}
		
		private function createControlBar():void
		{
			var controlBar:ControlBar = new ControlBar();
			controlBar.percentHeight = 10;
			controlBar.percentWidth = 90;
			
			var saveBtn:Button = new Button();
			saveBtn.label = "Save";
			saveBtn.addEventListener(MouseEvent.CLICK,saveConfiguration);
			controlBar.addChild(saveBtn);
			
			var closeBtn:Button = new Button();
			closeBtn.label = "Close";
			closeBtn.addEventListener(MouseEvent.CLICK, closeEventHandler);
			controlBar.addChild(closeBtn);
			
			this.addChild(controlBar);
		}
		public function saveConfiguration(event:MouseEvent):void
		{
			if (!validateRecurrenceDetails())
				return;
				
			var executionTime:ExecutionTime = new ExecutionTime();
			var recurrenceRange:RecurrenceRange = new RecurrenceRange();
						
			var startingTime:Number = getTime("START");
			var endingTime:Number;
			
			if (processSchedule != null)
			 	endingTime = getTime("END");
			else if (cacheSchedule != null)
				endingTime = getTime("START");
			
			executionTime.startTime=startingTime;
			executionTime.endTime=endingTime;
			
			recurrenceRange.startDate = startDateChoser.selectedDate;
			var selectedEndDate:Date = endDateChoser.selectedDate;
			//Send End Date by adding a day to it, As the backend considers 12 am of the end date
			recurrenceRange.endDate = new Date(selectedEndDate.fullYear,
					selectedEndDate.month, selectedEndDate.date + 1,
					selectedEndDate.hours, selectedEndDate.minutes,
					selectedEndDate.seconds, selectedEndDate.milliseconds);
			var recurrenceForm:IRecurrenceForm = getRecurrenceForm();
			var recurrence:IRecurrence = recurrenceForm.getRecurrence();
			recurrence.executionTime = executionTime;
			recurrence.recurrenceRange = recurrenceRange
			recurrence.recurrenceGap = int (recurrenceForm.getTextValue());
			
			if(dailyRadio.selected)
			{
				(DailyRecurrence(recurrence)).runOnWeekDay=dailySchedule.getWeekDayBoolean();
			}
			else 
			{
				(WeeklyRecurrence(recurrence)).daysOfWeek=weeklySchedule.getListValue();
			}
			
			if (cacheSchedule != null)
			{
				cacheSchedule.recurrence = recurrence;
				cacheSchedule.recurrenceType = (dailyRadio.selected) ? DAILY_RECURRENCE : WEEKLY_RECURRENCE;
				modelLocator.cacheReloadSchedule = cacheSchedule;
			}
			else if (processSchedule != null) 
			{
				processSchedule.recurrence = recurrence;
				processSchedule.recurrenceType = (dailyRadio.selected) ? DAILY_RECURRENCE : WEEKLY_RECURRENCE;
				modelLocator.processSchedule = processSchedule;
			}
			saveEventHandler.call();
		}
		
		private function getRecurrenceForm():IRecurrenceForm {
			return (dailyRadio.selected) ? dailySchedule : weeklySchedule;
		}
		
		private function validateRecurrenceDetails():Boolean {
			if(startDateChoser.selectedDate == null 
				|| endDateChoser.selectedDate == null) {
				Alert.show("Specify recurrence start and end date.", "Missing recurrence range");
				return false;		
			}
			
			if(dailyRadio.selected)
			{
				if ((!dailySchedule.getWeekDayBoolean()) && (dailySchedule.getTextValue() == "")) {
					Alert.show("Specify valid recurrence pattern.", "Invalid recurrence pattern");
					return false;
				}
			}
			else 
			{
				if ((weeklySchedule.getTextValue() == "") || (weeklySchedule.getListValue().length == 0)) {
					Alert.show("Specify valid recurrence pattern.", "Invalid recurrence pattern");
					return false;
				}
			}
			if(!validateTime())
			{
				Alert.show("Specify Valid start time","Invalid Time");
				return false;
			}
		
			return true;
		}
		private function validateTime():Boolean
		{
			var currentDate:Date = new Date();
			var currentTime:Number = currentDate.getHours()*60 + currentDate.getMinutes();
			var startTime:Number = getTime("START");
			//initialTime = timeGeneratorString(currentTime);
			if((startDateChoser.selectedDate.date == currentDate.date
				&& startDateChoser.selectedDate.month == currentDate.month
				&& startDateChoser.selectedDate.fullYear == currentDate.fullYear
			    && startTime<currentTime))
				{
					return false;
				}
			return true;			
		}
		
		private function getTime(typeOfTime:String):Number
		{
			var time:String;
			if(typeOfTime=="START")
			{
				time = String(startTime.selectedItem);
			}
			else
			{
				time = String(endTime.selectedItem);
			}
			var stringLen:Number = time.length;
			var ampm:String = time.substring(stringLen-2,stringLen);
			var actualTime:String = time.substring(0,stringLen-2);
			var hours:String = actualTime.substring(0,(actualTime.length-4));
			if(ampm=="PM" && hours!="12")
			{
				hours=String(Number(hours)+12);
			} else if(ampm=="AM" && hours == "12") {
				hours = "0";
			}
			
			var minPosition:Number = actualTime.search(":");
			var min:String = actualTime.substring(minPosition+1,actualTime.length);
			var totalTime : Number = (Number(hours)*60 + Number(min));
			return totalTime;
		}
		
		private function changeEndTime(event:DropdownEvent):void
		{
			endTime.selectedIndex=((event.target.selectedIndex)+1);
		}
		
		private function loadUI(event:ItemClickEvent):void
		{
			var selectIndex:int=0;
			if(event.currentTarget.selectedValue=="Daily")
			{
				selectIndex=0;
				dailyRadio.selected = true;
			}
			else
			{
				selectIndex=1;
				dailyRadio.selected=false;
			}
			viewStack.selectedIndex=selectIndex;
		}
		private function loadDetails():void
		{
			var schedule: Object = (processSchedule != null) ? processSchedule:cacheSchedule;
			starttime = timeGeneratorString(schedule.recurrence.executionTime.startTime);
			endtime = timeGeneratorString(schedule.recurrence.executionTime.endTime);
			startdate = schedule.recurrence.recurrenceRange.startDate;
			var savedEndDate:Date = schedule.recurrence.recurrenceRange.endDate;
			//The End Date saved is incremented by a day. 
			//so we need to decrement by a day before displaying it on UI
			enddate = new Date(savedEndDate.fullYear, savedEndDate.month,
				savedEndDate.date - 1, savedEndDate.hours,
				savedEndDate.minutes, savedEndDate.seconds,
				savedEndDate.milliseconds);
		}
		
		private function timeGeneratorString(timeInNumer:Number):String
		{
			var hour:int = timeInNumer/60;
			var min:int = timeInNumer % 60;
			
			if (hour == 24)
				hour = 0;
			var minStr:String = (min > 0) ? ":30" : ":00";
			var ampm:String = (hour >= 12) ? " PM" : " AM";
			var adjustedHour:int = (hour < 1) ? 12 : hour;
			adjustedHour = (hour > 12) ? (hour - 12) : adjustedHour;
			
			return (String(adjustedHour) + minStr + ampm);
		}
		

		private function DateProvider():ArrayCollection
		{
			var timeValue:ArrayCollection = new ArrayCollection();
			timeValue.addItem("12:00 AM");
			timeValue.addItem("12:30 AM");
			timeValue.addItem("1:00 AM");
			timeValue.addItem("1:30 AM");
			timeValue.addItem("2:00 AM");
			timeValue.addItem("2:30 AM");
			timeValue.addItem("3:00 AM");
			timeValue.addItem("3:30 AM");
			timeValue.addItem("4:00 AM");
			timeValue.addItem("4:30 AM");
			timeValue.addItem("5:00 AM");
			timeValue.addItem("5:30 AM");
			timeValue.addItem("6:00 AM");
			timeValue.addItem("6:30 AM");
			timeValue.addItem("7:00 AM");
			timeValue.addItem("7:30 AM");
			timeValue.addItem("8:00 AM");
			timeValue.addItem("8:30 AM");
			timeValue.addItem("9:00 AM");
			timeValue.addItem("9:30 AM");
			timeValue.addItem("10:00 AM");
			timeValue.addItem("10:30 AM");
			timeValue.addItem("11:00 AM");
			timeValue.addItem("11:30 AM");
			timeValue.addItem("12:00 PM");
			timeValue.addItem("12:30 PM");
			timeValue.addItem("1:00 PM");
			timeValue.addItem("1:30 PM");
			timeValue.addItem("2:00 PM");
			timeValue.addItem("2:30 PM");
			timeValue.addItem("3:00 PM");
			timeValue.addItem("3:30 PM");
			timeValue.addItem("4:00 PM");
			timeValue.addItem("4:30 PM");
			timeValue.addItem("5:00 PM");
			timeValue.addItem("5:30 PM");
			timeValue.addItem("6:00 PM");
			timeValue.addItem("6:30 PM");
			timeValue.addItem("7:00 PM");
			timeValue.addItem("7:30 PM");
			timeValue.addItem("8:00 PM");
			timeValue.addItem("8:30 PM");
			timeValue.addItem("9:00 PM");
			timeValue.addItem("9:30 PM");
			timeValue.addItem("10:00 PM");
			timeValue.addItem("10:30 PM");
			timeValue.addItem("11:00 PM");
			timeValue.addItem("11:30 PM");
			return timeValue;
			
		}
	}
}
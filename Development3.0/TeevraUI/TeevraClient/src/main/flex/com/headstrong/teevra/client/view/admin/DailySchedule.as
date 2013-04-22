package com.headstrong.teevra.client.view.admin
{
	import mx.containers.HBox;
	import mx.containers.Tile;
	import mx.containers.VBox;
	import mx.controls.Label;
	import mx.controls.RadioButton;
	import mx.controls.RadioButtonGroup;
	import mx.controls.TextInput;
	import mx.events.ItemClickEvent;
	
	public class DailySchedule extends Tile implements IRecurrenceForm
	{
		public var dayText:TextInput; 
		private var weekRadio:RadioButton;
		private var dayRadio:RadioButton;
		
		public function DailySchedule()
		{
			var dailyVBox:VBox = new VBox();
			var everyDay:HBox = new HBox();
			var everyWeekDay:HBox = new HBox();
			
			var dayRadioGroup:RadioButtonGroup = new RadioButtonGroup();
			dayRadio = new RadioButton();
			dayRadio.label=resourceManager.getString('TeevraUI', 'label.DailySchedule.every');
			dayRadio.value=resourceManager.getString('TeevraUI', 'label.DailySchedule.every');
			dayRadio.selected = true;
			dayRadio.group=dayRadioGroup;
			
			var dayLabel:Label = new Label();
			dayLabel.text=resourceManager.getString('TeevraUI', 'label.DailySchedule.day');
			dayText = new TextInput();
			dayText.percentWidth=20;
			dayText.text = "1";
			
			everyDay.addChild(dayRadio);
			everyDay.addChild(dayText);
			everyDay.addChild(dayLabel);
			
			dailyVBox.addChild(everyDay);//first element of Vbox i.e daily
			
			weekRadio = new RadioButton();
			weekRadio.label=resourceManager.getString('TeevraUI', 'label.DailySchedule.everyWeekday');
			weekRadio.value=resourceManager.getString('TeevraUI', 'label.DailySchedule.everyWeekday');
			weekRadio.group=dayRadioGroup;
			
			everyWeekDay.addChild(weekRadio);
			
			dailyVBox.addChild(everyWeekDay);//second element of Vbox i.e. weekly
			
			dayRadioGroup.addEventListener(ItemClickEvent.ITEM_CLICK,recurrencePattern);
			this.addChild(dailyVBox);
		}
		
		private function recurrencePattern(event:ItemClickEvent):void
		{
			dayText.editable = dayRadio.selected;
			if (dayRadio.selected) {
				dayText.text = "1";
			}
		}
		
		public function getTextValue():String
		{
			return dayText.text;
		}
		
		public function getWeekDayBoolean():Boolean
		{
			return weekRadio.selected;
		}
		
		public function getRecurrence():IRecurrence {
			var recurrence:IRecurrence = new DailyRecurrence();
			return recurrence;
		}
		
		public function setRecurrence(recurrence:DailyRecurrence):void {
			if (recurrence.runOnWeekDay) {
				weekRadio.selected = true;
			} else {
				dayRadio.selected = true;
				dayText.text = String(recurrence.recurrenceGap);
			}
		}

	}
}
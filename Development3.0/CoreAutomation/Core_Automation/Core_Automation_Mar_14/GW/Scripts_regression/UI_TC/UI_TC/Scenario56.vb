﻿'//////////////////////////////////////////////////////////////////////////////
'
' This file was automatically generated by RANOREX.
' DO NOT MODIFY THIS FILE! It is regenerated by the designer.
' All your modifications will be lost!
' http://www.ranorex.com
'
'//////////////////////////////////////////////////////////////////////////////

Imports System
Imports System.Collections.Generic
Imports System.Text
Imports System.Text.RegularExpressions
Imports System.Drawing
Imports System.Threading
Imports System.Windows.Forms

Imports Ranorex
Imports Ranorex.Core

Namespace UI_TC
	''' <summary>
	''' The Scenario56 recording.
	''' </summary>
	Partial Public Class Scenario56

		Public Shared repo as UI_TCRepository = UI_TCRepository.Instance

		<System.CodeDom.Compiler.GeneratedCode("Ranorex", "2.3.6")> _
		Public Shared Sub Start()
			Mouse.DefaultMoveTime = 300
			Keyboard.DefaultKeyPressTime = 100
			Delay.SpeedFactor = 1.0

			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerPanel1.TextProcess_Management_' at 61;9.")
			repo.WebDocumentIceFish1.ContainerPanel1.TextProcess_Management_.Click("61;9", 10)
			Delay.Milliseconds(1220)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.MenuItemProcesses_Status' at 66;7.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.MenuItemProcesses_Status.Click("66;7", 10)
			Delay.Milliseconds(190)
			Report.Info("Validating AttributeEqual (Text='--select server--') on item 'WebDocumentIceFish1.ContainerHBox.TextTextInput'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.TextTextInputInfo, "Text", "--select server--")
			Delay.Milliseconds(3000)
			Report.Info("Validating AttributeEqual (Enabled='False') on item 'WebDocumentIceFish1.ContainerPanel1.ButtonAssign'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerPanel1.ButtonAssignInfo, "Enabled", "False")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Assign') on item 'WebDocumentIceFish1.ContainerPanel1.ButtonAssign'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerPanel1.ButtonAssignInfo, "Text", "Assign")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='False') on item 'WebDocumentIceFish1.ContainerPanel1.ButtonUnassign'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerPanel1.ButtonUnassignInfo, "Enabled", "False")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Unassign') on item 'WebDocumentIceFish1.ContainerPanel1.ButtonUnassign'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerPanel1.ButtonUnassignInfo, "Text", "Unassign")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='True') on item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonFilterInfo, "Enabled", "True")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Filter') on item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonFilterInfo, "Text", "Filter")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='True') on item 'WebDocumentIceFish.ContainerHBox.ButtonRefresh'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerHBox.ButtonRefreshInfo, "Enabled", "True")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Refresh') on item 'WebDocumentIceFish.ContainerHBox.ButtonRefresh'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerHBox.ButtonRefreshInfo, "Text", "Refresh")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='False') on item 'WebDocumentIceFish1.ContainerHBox.ButtonStart'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonStartInfo, "Enabled", "False")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Start') on item 'WebDocumentIceFish1.ContainerHBox.ButtonStart'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonStartInfo, "Text", "Start")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='False') on item 'WebDocumentIceFish1.ContainerHBox.ButtonStop'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonStopInfo, "Enabled", "False")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Stop') on item 'WebDocumentIceFish1.ContainerHBox.ButtonStop'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonStopInfo, "Text", "Stop")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='False') on item 'WebDocumentIceFish1.ContainerHBox.ButtonSchedule'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonScheduleInfo, "Enabled", "False")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Schedule') on item 'WebDocumentIceFish1.ContainerHBox.ButtonSchedule'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonScheduleInfo, "Text", "Schedule")
			Delay.Milliseconds(100)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonButton' at 141;11.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonButton.Click("141;11", 10)
			Delay.Milliseconds(1470)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIceFish_server' at 114;11.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIceFish_server.Click("114;11", 10)
			Delay.Milliseconds(2030)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter' at 44;11.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonFilter.Click("44;11", 10)
			Delay.Milliseconds(1080)
			Scenario56.checkProcessforserver1()
			Delay.Milliseconds(0)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.TextTextInput' at 62;13.")
			repo.WebDocumentIceFish1.ContainerHBox.TextTextInput.Click("62;13", 10)
			Delay.Milliseconds(1190)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2' at 74;6.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2.Click("74;6", 10)
			Delay.Milliseconds(1810)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter' at 36;9.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonFilter.Click("36;9", 10)
			Delay.Milliseconds(150)
			Report.Info("Validating AttributeEqual (Text='Assign') on item 'WebDocumentIceFish1.ContainerPanel1.ButtonAssign'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerPanel1.ButtonAssignInfo, "Text", "Assign")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Unassign') on item 'WebDocumentIceFish1.ContainerPanel1.ButtonUnassign'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerPanel1.ButtonUnassignInfo, "Text", "Unassign")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Filter') on item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonFilterInfo, "Text", "Filter")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='True') on item 'WebDocumentIceFish.ContainerHBox.ButtonRefresh'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerHBox.ButtonRefreshInfo, "Enabled", "True")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Refresh') on item 'WebDocumentIceFish.ContainerHBox.ButtonRefresh'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerHBox.ButtonRefreshInfo, "Text", "Refresh")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='False') on item 'WebDocumentIceFish1.ContainerHBox.ButtonStart'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonStartInfo, "Enabled", "False")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Start') on item 'WebDocumentIceFish1.ContainerHBox.ButtonStart'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonStartInfo, "Text", "Start")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='False') on item 'WebDocumentIceFish1.ContainerHBox.ButtonStop'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonStopInfo, "Enabled", "False")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Stop') on item 'WebDocumentIceFish1.ContainerHBox.ButtonStop'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonStopInfo, "Text", "Stop")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='False') on item 'WebDocumentIceFish1.ContainerHBox.ButtonSchedule'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonScheduleInfo, "Enabled", "False")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Schedule') on item 'WebDocumentIceFish1.ContainerHBox.ButtonSchedule'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonScheduleInfo, "Text", "Schedule")
			Delay.Milliseconds(100)
			Scenario56.CHEKPROCESSFORSERVER2()
			Delay.Milliseconds(0)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.TextTextInput' at 110;10.")
			repo.WebDocumentIceFish1.ContainerHBox.TextTextInput.Click("110;10", 10)
			Delay.Milliseconds(1080)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIceFish_server' at 103;2.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIceFish_server.Click("103;2", 10)
			Delay.Milliseconds(1410)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter' at 35;5.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonFilter.Click("35;5", 10)
			Delay.Milliseconds(2840)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.TableUserGrid.CellString13' at 28;8.")
			repo.WebDocumentIceFish1.TableUserGrid.CellString13.Click("28;8", 10)
			Delay.Milliseconds(150)
			Report.Info("Validating AttributeEqual (Enabled='True') on item 'WebDocumentIceFish1.ContainerPanel1.ButtonAssign'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerPanel1.ButtonAssignInfo, "Enabled", "True")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Assign') on item 'WebDocumentIceFish1.ContainerPanel1.ButtonAssign'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerPanel1.ButtonAssignInfo, "Text", "Assign")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='True') on item 'WebDocumentIceFish1.ContainerPanel1.ButtonUnassign'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerPanel1.ButtonUnassignInfo, "Enabled", "True")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Unassign') on item 'WebDocumentIceFish1.ContainerPanel1.ButtonUnassign'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerPanel1.ButtonUnassignInfo, "Text", "Unassign")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='True') on item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonFilterInfo, "Enabled", "True")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Filter') on item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter'.")
			Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonFilterInfo, "Text", "Filter")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Enabled='True') on item 'WebDocumentIceFish.ContainerHBox.ButtonRefresh'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerHBox.ButtonRefreshInfo, "Enabled", "True")
			Delay.Milliseconds(100)
			Report.Info("Validating AttributeEqual (Text='Refresh') on item 'WebDocumentIceFish.ContainerHBox.ButtonRefresh'.")
			Validate.Attribute(repo.WebDocumentIceFish.ContainerHBox.ButtonRefreshInfo, "Text", "Refresh")
			Delay.Milliseconds(1200)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.TableUserGrid.CellString13' at 32;7.")
			repo.WebDocumentIceFish1.TableUserGrid.CellString13.Click("32;7", 10)
			Delay.Milliseconds(2550)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.TextTextInput' at 46;16.")
			repo.WebDocumentIceFish1.ContainerHBox.TextTextInput.Click("46;16", 10)
			Delay.Milliseconds(1050)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2' at 52;4.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2.Click("52;4", 10)
			Delay.Milliseconds(1670)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerPanel1.ButtonAssign' at 47;11.")
			repo.WebDocumentIceFish1.ContainerPanel1.ButtonAssign.Click("47;11", 10)
			Delay.Milliseconds(5170)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonOK1' at 38;9.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonOK1.Click("38;9", 10)
			Delay.Milliseconds(1190)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.TextTextInput' at 68;14.")
			repo.WebDocumentIceFish1.ContainerHBox.TextTextInput.Click("68;14", 10)
			Delay.Milliseconds(1170)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2' at 74;2.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2.Click("74;2", 10)
			Delay.Milliseconds(1700)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter' at 24;10.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonFilter.Click("24;10", 10)
			Delay.Milliseconds(1050)
			Scenario56.PROCESSFORSERVER2_1()
			Delay.Milliseconds(0)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.TextTextInput' at 46;9.")
			repo.WebDocumentIceFish1.ContainerHBox.TextTextInput.Click("46;9", 10)
			Delay.Milliseconds(1020)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIceFish_server' at 50;6.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIceFish_server.Click("50;6", 10)
			Delay.Milliseconds(1610)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter' at 46;10.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonFilter.Click("46;10", 10)
			Delay.Milliseconds(1060)
			Scenario56.CHECKPROCESS_SERVER1_1()
			Delay.Milliseconds(900)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerPanel1.TextProcess_Management_' at 107;5.")
			repo.WebDocumentIceFish1.ContainerPanel1.TextProcess_Management_.Click("107;5")
			Delay.Milliseconds(1130)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.MenuItemProcesses_Status' at 106;4.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.MenuItemProcesses_Status.Click("106;4")
			Delay.Milliseconds(770)
			Scenario56.unassignprocess_server2()
			Delay.Milliseconds(0)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.TextTextInput' at 51;8.")
			repo.WebDocumentIceFish1.ContainerHBox.TextTextInput.Click("51;8", 10)
			Delay.Milliseconds(1060)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2' at 57;3.")
			repo.WebDocumentIceFish1.FlexObjectIceFish.TextIcefish_server2.Click("57;3", 10)
			Delay.Milliseconds(1980)
			Report.Info("Mouse Left Click item 'WebDocumentIceFish1.ContainerHBox.ButtonFilter' at 30;15.")
			repo.WebDocumentIceFish1.ContainerHBox.ButtonFilter.Click("30;15", 10)
			Delay.Milliseconds(1080)
			Scenario56.Assign_server2()
			Delay.Milliseconds(1060)
			Scenario56.results()
			Delay.Milliseconds(0)
		End Sub

#Region "Image Feature Data"
#End Region

	End Class

End Namespace
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
Imports Ranorex.Core.Testing

Namespace Validation_Creation_templates
    ''' <summary>
    ''' The error_templates recording.
    ''' </summary>
    <TestModule("bd194d66-e88b-4768-98ee-75d071f3474b", ModuleType.Recording, 1)> _
    Partial Public Class error_templates
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the Validation_Creation_templatesRepository repository.
        ''' </summary>
        Public Shared repo as Validation_Creation_templatesRepository = Validation_Creation_templatesRepository.Instance

        Shared _instance as error_templates = new error_templates()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As error_templates
            Get
                Return _instance
            End Get
        End Property

#Region "Variables"

#End Region

        ''' <summary>
        ''' Starts the replay of the static recording <see cref="Instance"/>.
        ''' </summary>
        <System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.2")> _
        Public Shared Sub Start()
            TestModuleRunner.Run(Instance)
        End Sub

        ''' <summary>
        ''' Performs the playback of actions in this recording.
        ''' </summary>
        ''' <remarks>You should not call this method directly, instead pass the module
        ''' instance to the <see cref="TestModuleRunner.Run(Of ITestModule)"/> method
        ''' that will in turn invoke this method.</remarks>
        <System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.2")> _
        Sub Run() Implements ITestModule.Run
            Mouse.DefaultMoveTime = 300
            Keyboard.DefaultKeyPressTime = 100
            Delay.SpeedFactor = 1.0

            Init()

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextProcess_Modeling_' at 54;3.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextProcess_Modeling_Info, new RecordItemIndex(0))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextProcess_Modeling_.Click("54;3")
            Delay.Milliseconds(930)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.MenuItemView_Process' at 62;6.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.MenuItemView_ProcessInfo, new RecordItemIndex(1))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.MenuItemView_Process.Click("62;6")
            Delay.Milliseconds(1380)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerVBox1.ButtonNew' at 20;11.", repo.WebDocument10_200_123_11_8080.ContainerVBox1.ButtonNewInfo, new RecordItemIndex(2))
            repo.WebDocument10_200_123_11_8080.ContainerVBox1.ButtonNew.Click("20;11")
            Delay.Milliseconds(1600)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerTabNavigator.TabPageError_Reporting' at 70;7.", repo.WebDocument10_200_123_11_8080.ContainerTabNavigator.TabPageError_ReportingInfo, new RecordItemIndex(3))
            repo.WebDocument10_200_123_11_8080.ContainerTabNavigator.TabPageError_Reporting.Click("70;7")
            Delay.Milliseconds(1100)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerTabNavigator.ButtonButton' at 137;14.", repo.WebDocument10_200_123_11_8080.ContainerTabNavigator.ButtonButtonInfo, new RecordItemIndex(4))
            repo.WebDocument10_200_123_11_8080.ContainerTabNavigator.ButtonButton.Click("137;14")
            Delay.Milliseconds(2730)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ListList.TextJMS_ErrReporter' at 110;8.", repo.WebDocument10_200_123_11_8080.ListList.TextJMS_ErrReporterInfo, new RecordItemIndex(5))
            repo.WebDocument10_200_123_11_8080.ListList.TextJMS_ErrReporter.Click("110;8")
            Delay.Milliseconds(1190)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerTabNavigator.ButtonConfigure' at 35;12.", repo.WebDocument10_200_123_11_8080.ContainerTabNavigator.ButtonConfigureInfo, new RecordItemIndex(6))
            repo.WebDocument10_200_123_11_8080.ContainerTabNavigator.ButtonConfigure.Click("35;12", 193)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextServiceId4'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextServiceId4Info, new RecordItemIndex(7))
            Validate.Attribute(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextServiceId4Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating Exists on item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURL'.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURLInfo, new RecordItemIndex(8))
            Validate.Exists(repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURLInfo)
            Delay.Milliseconds(4020)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURL' at 52;14.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURLInfo, new RecordItemIndex(9))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURL.Click("52;14")
            Delay.Milliseconds(1130)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'jmsurl'.", new RecordItemIndex(10))
            Keyboard.Press("jmsurl")
            Delay.Milliseconds(750)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopic' at 58;7.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopicInfo, new RecordItemIndex(11))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopic.Click("58;7")
            Delay.Milliseconds(1100)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'errorqueue'.", new RecordItemIndex(12))
            Keyboard.Press("errorqueue")
            Delay.Milliseconds(760)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___' at 31;13.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(13))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___.Click("31;13")
            Delay.Milliseconds(1910)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel' at 33;16.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancelInfo, new RecordItemIndex(14))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel.Click("33;16")
            Delay.Milliseconds(400)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___' at 50;9.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(15))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___.Click("50;9")
            Delay.Milliseconds(1350)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput4' at 15;14.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput4Info, new RecordItemIndex(16))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput4.Click("15;14")
            Delay.Milliseconds(510)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+LShiftKey' Down.", new RecordItemIndex(17))
            Keyboard.Down(Keys.LShiftKey, 42, False)
            Delay.Milliseconds(590)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'J{LShiftKey up}mserror'.", new RecordItemIndex(18))
            Keyboard.Press("J{LShiftKey up}mserror")
            Delay.Milliseconds(2050)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave' at 28;1.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(19))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave.Click("28;1")
            Delay.Milliseconds(1680)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonOK2' at 10;11.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonOK2Info, new RecordItemIndex(20))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonOK2.Click("10;11")
            Delay.Milliseconds(2260)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1' at 34;12.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1Info, new RecordItemIndex(21))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1.Click("34;12")
            Delay.Milliseconds(790)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerTabNavigator.ButtonConfigure' at 32;13.", repo.WebDocument10_200_123_11_8080.ContainerTabNavigator.ButtonConfigureInfo, new RecordItemIndex(22))
            repo.WebDocument10_200_123_11_8080.ContainerTabNavigator.ButtonConfigure.Click("32;13")
            Delay.Milliseconds(1630)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURL' at 15;14.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURLInfo, new RecordItemIndex(23))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSBrokerURL.Click("15;14")
            Delay.Milliseconds(1050)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'ibm'.", new RecordItemIndex(24))
            Keyboard.Press("ibm")
            Delay.Milliseconds(1680)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'url'.", new RecordItemIndex(25))
            Keyboard.Press("url")
            Delay.Milliseconds(1660)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopic' at 63;13.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopicInfo, new RecordItemIndex(26))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextJMSDestinationQueueTopic.Click("63;13")
            Delay.Milliseconds(910)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'error'.", new RecordItemIndex(27))
            Keyboard.Press("error")
            Delay.Milliseconds(1290)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'queue'.", new RecordItemIndex(28))
            Keyboard.Press("queue")
            Delay.Milliseconds(1980)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FormForm1.TextUserName' at 25;7.", repo.WebDocument10_200_123_11_8080.FormForm1.TextUserNameInfo, new RecordItemIndex(29))
            repo.WebDocument10_200_123_11_8080.FormForm1.TextUserName.Click("25;7")
            Delay.Milliseconds(910)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'username'.", new RecordItemIndex(30))
            Keyboard.Press("username")
            Delay.Milliseconds(1630)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FormForm1.TextPassword' at 26;8.", repo.WebDocument10_200_123_11_8080.FormForm1.TextPasswordInfo, new RecordItemIndex(31))
            repo.WebDocument10_200_123_11_8080.FormForm1.TextPassword.Click("26;8")
            Delay.Milliseconds(790)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'password'.", new RecordItemIndex(32))
            Keyboard.Press("password")
            Delay.Milliseconds(2180)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FormForm1.TextIBMMQport' at 11;12.", repo.WebDocument10_200_123_11_8080.FormForm1.TextIBMMQportInfo, new RecordItemIndex(33))
            repo.WebDocument10_200_123_11_8080.FormForm1.TextIBMMQport.Click("11;12")
            Delay.Milliseconds(760)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'P' Press.", new RecordItemIndex(34))
            Keyboard.Press(Keys.P, 25, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(470)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'ort'.", new RecordItemIndex(35))
            Keyboard.Press("ort")
            Delay.Milliseconds(1150)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FormForm1.TextIBMMQQueueManager' at 16;14.", repo.WebDocument10_200_123_11_8080.FormForm1.TextIBMMQQueueManagerInfo, new RecordItemIndex(36))
            repo.WebDocument10_200_123_11_8080.FormForm1.TextIBMMQQueueManager.Click("16;14")
            Delay.Milliseconds(850)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'manager'.", new RecordItemIndex(37))
            Keyboard.Press("manager")
            Delay.Milliseconds(1650)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FormForm1.TextIBMMQChannel' at 76;8.", repo.WebDocument10_200_123_11_8080.FormForm1.TextIBMMQChannelInfo, new RecordItemIndex(38))
            repo.WebDocument10_200_123_11_8080.FormForm1.TextIBMMQChannel.Click("76;8")
            Delay.Milliseconds(940)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'chann'.", new RecordItemIndex(39))
            Keyboard.Press("chann")
            Delay.Milliseconds(980)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'el'.", new RecordItemIndex(40))
            Keyboard.Press("el")
            Delay.Milliseconds(1300)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FormForm1.TextIBMMQDeliveryMode' at 63;11.", repo.WebDocument10_200_123_11_8080.FormForm1.TextIBMMQDeliveryModeInfo, new RecordItemIndex(41))
            repo.WebDocument10_200_123_11_8080.FormForm1.TextIBMMQDeliveryMode.Click("63;11")
            Delay.Milliseconds(760)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'delmo'.", new RecordItemIndex(42))
            Keyboard.Press("delmo")
            Delay.Milliseconds(1280)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'de'.", new RecordItemIndex(43))
            Keyboard.Press("de")
            Delay.Milliseconds(1220)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___' at 41;7.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(44))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___.Click("41;7")
            Delay.Milliseconds(1900)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput4' at 27;8.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput4Info, new RecordItemIndex(45))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput4.Click("27;8")
            Delay.Milliseconds(430)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+LShiftKey' Down.", new RecordItemIndex(46))
            Keyboard.Down(Keys.LShiftKey, 42, False)
            Delay.Milliseconds(620)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+I' Press.", new RecordItemIndex(47))
            Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(490)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'LShiftKey' Up.", new RecordItemIndex(48))
            Keyboard.Up(Keys.LShiftKey, 42, False)
            Delay.Milliseconds(250)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'B' Press.", new RecordItemIndex(49))
            Keyboard.Press(Keys.B, 48, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(580)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'merror'.", new RecordItemIndex(50))
            Keyboard.Press("merror")
            Delay.Milliseconds(1830)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave' at 27;12.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(51))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave.Click("27;12")
            Delay.Milliseconds(1650)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonOK2' at 33;11.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonOK2Info, new RecordItemIndex(52))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonOK2.Click("33;11")
            Delay.Milliseconds(1350)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1' at 23;9.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1Info, new RecordItemIndex(53))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1.Click("23;9")
            Delay.Milliseconds(1550)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerTabNavigator.TextTextInput' at 106;14.", repo.WebDocument10_200_123_11_8080.ContainerTabNavigator.TextTextInputInfo, new RecordItemIndex(54))
            repo.WebDocument10_200_123_11_8080.ContainerTabNavigator.TextTextInput.Click("106;14")
            Delay.Milliseconds(1230)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ListList.TextFILE_ErrReporter' at 87;8.", repo.WebDocument10_200_123_11_8080.ListList.TextFILE_ErrReporterInfo, new RecordItemIndex(55))
            repo.WebDocument10_200_123_11_8080.ListList.TextFILE_ErrReporter.Click("87;8")
            Delay.Milliseconds(1120)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.ContainerTabNavigator.ButtonConfigure' at 42;9.", repo.WebDocument10_200_123_11_8080.ContainerTabNavigator.ButtonConfigureInfo, new RecordItemIndex(56))
            repo.WebDocument10_200_123_11_8080.ContainerTabNavigator.ButtonConfigure.Click("42;9")
            Delay.Milliseconds(2870)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextServiceId1' at 36;10.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextServiceId1Info, new RecordItemIndex(57))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextServiceId1.Click("36;10")
            Delay.Milliseconds(960)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDirectory' at 36;10.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDirectoryInfo, new RecordItemIndex(58))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextDirectory.Click("36;10")
            Delay.Milliseconds(1620)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{LShiftKey down}D{LShiftKey up}{RShiftKey down}:{RShiftKey up}'.", new RecordItemIndex(59))
            Keyboard.Press("{LShiftKey down}D{LShiftKey up}{RShiftKey down}:{RShiftKey up}")
            Delay.Milliseconds(1360)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '/error'.", new RecordItemIndex(60))
            Keyboard.Press("/error")
            Delay.Milliseconds(2710)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'eport'.", new RecordItemIndex(61))
            Keyboard.Press("eport")
            Delay.Milliseconds(960)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'R' Press.", new RecordItemIndex(62))
            Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(880)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___' at 79;8.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(63))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave_as_Template___.Click("79;8")
            Delay.Milliseconds(1150)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput4' at 48;16.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput4Info, new RecordItemIndex(64))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.TextTextInput4.Click("48;16")
            Delay.Milliseconds(410)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{LShiftKey down}F{LShiftKey up}ileerror'.", new RecordItemIndex(65))
            Keyboard.Press("{LShiftKey down}F{LShiftKey up}ileerror")
            Delay.Milliseconds(2660)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave' at 18;12.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(66))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonSave.Click("18;12")
            Delay.Milliseconds(1320)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonOK2' at 39;10.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonOK2Info, new RecordItemIndex(67))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonOK2.Click("39;10")
            Delay.Milliseconds(1490)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1' at 53;13.", repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1Info, new RecordItemIndex(68))
            repo.WebDocument10_200_123_11_8080.FlexObjectIceFish.ButtonCancel1.Click("53;13")
            Delay.Milliseconds(790)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace

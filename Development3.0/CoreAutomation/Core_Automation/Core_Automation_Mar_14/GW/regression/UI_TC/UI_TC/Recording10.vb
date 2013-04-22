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

Namespace UI_TC
    ''' <summary>
    ''' The Recording10 recording.
    ''' </summary>
    <TestModule("7b7099f1-ddf7-4003-8afb-36f4f30a07e7", ModuleType.Recording, 1)> _
    Partial Public Class Recording10
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the Project10Repository repository.
        ''' </summary>
        Public Shared repo as Project10Repository = Project10Repository.Instance

        Shared _instance as Recording10 = new Recording10()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As Recording10
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

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerMainArea.TextUserIdTextInput' at 36;11.", repo.WebDocumentIceFishHash.ContainerMainArea.TextUserIdTextInputInfo, new RecordItemIndex(0))
            repo.WebDocumentIceFishHash.ContainerMainArea.TextUserIdTextInput.Click("36;11")
            Delay.Milliseconds(1130)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'icefish'.", new RecordItemIndex(1))
            Keyboard.Press("icefish")
            Delay.Milliseconds(1480)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerMainArea.TextPasswordTextInput' at 36;11.", repo.WebDocumentIceFishHash.ContainerMainArea.TextPasswordTextInputInfo, new RecordItemIndex(2))
            repo.WebDocumentIceFishHash.ContainerMainArea.TextPasswordTextInput.Click("36;11")
            Delay.Milliseconds(690)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'icefish{Tab}'.", new RecordItemIndex(3))
            Keyboard.Press("icefish{Tab}")
            Delay.Milliseconds(1300)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerMainArea.ButtonSubmit' at 33;14.", repo.WebDocumentIceFishHash.ContainerMainArea.ButtonSubmitInfo, new RecordItemIndex(4))
            repo.WebDocumentIceFishHash.ContainerMainArea.ButtonSubmit.Click("33;14")
            Delay.Milliseconds(2190)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonNew' at 23;12.", repo.WebDocumentIceFishHash.ContainerHBox.ButtonNewInfo, new RecordItemIndex(5))
            repo.WebDocumentIceFishHash.ContainerHBox.ButtonNew.Click("23;12")
            Delay.Milliseconds(3050)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentIceFishHash.ContainerHBox.PictureIcon_1' at 4;13.", repo.WebDocumentIceFishHash.ContainerHBox.PictureIcon_1Info, new RecordItemIndex(6))
            repo.WebDocumentIceFishHash.ContainerHBox.PictureIcon_1.MoveTo("4;13")
            Mouse.ButtonDown(MouseButtons.Left)
            Delay.Milliseconds(740)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentIceFishHash.ContainerHBox.ContainerGraphCanvas' at 130;120.", repo.WebDocumentIceFishHash.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(7))
            repo.WebDocumentIceFishHash.ContainerHBox.ContainerGraphCanvas.MoveTo("130;120")
            Mouse.ButtonUp(MouseButtons.Left)
            Delay.Milliseconds(600)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentIceFishHash.ContainerHBox.PictureIcon_1_8181' at 27;23.", repo.WebDocumentIceFishHash.ContainerHBox.PictureIcon_1_8181Info, new RecordItemIndex(8))
            repo.WebDocumentIceFishHash.ContainerHBox.PictureIcon_1_8181.Click(MouseButtons.Right, "27;23")
            Delay.Milliseconds(790)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 29;11.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(9))
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("29;11")
            Delay.Milliseconds(1790)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextServiceId' at 44;11.", repo.WebDocumentIceFishHash.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(10))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.TextServiceId.Click("44;11")
            Delay.Milliseconds(960)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'dummy'.", new RecordItemIndex(11))
            Keyboard.Press("dummy")
            Delay.Milliseconds(3400)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'sample'.", new RecordItemIndex(12))
            Keyboard.Press("sample")
            Delay.Milliseconds(2180)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonSave' at 27;14.", repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(13))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonSave.Click("27;14")
            Delay.Milliseconds(790)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.TextNameText' at 99;10.", repo.WebDocumentIceFishHash.ContainerHBox.TextNameTextInfo, new RecordItemIndex(14))
            repo.WebDocumentIceFishHash.ContainerHBox.TextNameText.Click("99;10")
            Delay.Milliseconds(620)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'dummysample'.", new RecordItemIndex(15))
            Keyboard.Press("dummysample")
            Delay.Milliseconds(2210)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.TextUITextField' at 86;17.", repo.WebDocumentIceFishHash.ContainerHBox.TextUITextFieldInfo, new RecordItemIndex(16))
            repo.WebDocumentIceFishHash.ContainerHBox.TextUITextField.Click("86;17")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'test'.", new RecordItemIndex(17))
            Keyboard.Press("test")
            Delay.Milliseconds(970)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.CheckBoxRecovery' at 8;13.", repo.WebDocumentIceFishHash.ContainerHBox.CheckBoxRecoveryInfo, new RecordItemIndex(18))
            repo.WebDocumentIceFishHash.ContainerHBox.CheckBoxRecovery.Click("8;13")
            Delay.Milliseconds(460)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.CheckBoxPrcsEvntLog' at 8;12.", repo.WebDocumentIceFishHash.ContainerHBox.CheckBoxPrcsEvntLogInfo, new RecordItemIndex(19))
            repo.WebDocumentIceFishHash.ContainerHBox.CheckBoxPrcsEvntLog.Click("8;12")
            Delay.Milliseconds(540)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.CheckBoxMsgEvntLog' at 6;8.", repo.WebDocumentIceFishHash.ContainerHBox.CheckBoxMsgEvntLogInfo, new RecordItemIndex(20))
            repo.WebDocumentIceFishHash.ContainerHBox.CheckBoxMsgEvntLog.Click("6;8")
            Delay.Milliseconds(2190)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonSave1' at Center.", repo.WebDocumentIceFishHash.ContainerHBox.ButtonSave1Info, new RecordItemIndex(21))
            repo.WebDocumentIceFishHash.ContainerHBox.ButtonSave1.Click()
            Delay.Milliseconds(2440)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK' at Center.", repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(22))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK.Click()
            Delay.Milliseconds(3130)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'F11' Press.", new RecordItemIndex(23))
            Keyboard.Press(Keys.F11, 87, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(3220)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 17;6.", repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_Info, new RecordItemIndex(24))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("17;6")
            Delay.Milliseconds(1320)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process' at 66;7.", repo.WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_ProcessInfo, new RecordItemIndex(25))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process.Click("66;7")
            Delay.Milliseconds(790)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerMainArea.CellString' at 93;7.", repo.WebDocumentIceFishHash.ContainerMainArea.CellStringInfo, new RecordItemIndex(26))
            repo.WebDocumentIceFishHash.ContainerMainArea.CellString.Click("93;7")
            Delay.Milliseconds(5850)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonDelete' at 43;11.", repo.WebDocumentIceFishHash.ContainerHBox.ButtonDeleteInfo, new RecordItemIndex(27))
            repo.WebDocumentIceFishHash.ContainerHBox.ButtonDelete.Click("43;11")
            Delay.Milliseconds(2290)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonNo' at 43;9.", repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonNoInfo, new RecordItemIndex(28))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonNo.Click("43;9")
            Delay.Milliseconds(820)
                        
            Mouse_Click_ContainerHBox1()
            Delay.Milliseconds(1090)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 33;6.", repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_Info, new RecordItemIndex(30))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("33;6")
            Delay.Milliseconds(9260)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.TextNameText' at 6;11.", repo.WebDocumentIceFishHash.ContainerHBox.TextNameTextInfo, new RecordItemIndex(31))
            repo.WebDocumentIceFishHash.ContainerHBox.TextNameText.Click("6;11")
            Delay.Milliseconds(1380)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Tab' Press.", new RecordItemIndex(32))
            Keyboard.Press(Keys.Tab, 15, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(5360)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'modified'.", new RecordItemIndex(33))
            Keyboard.Press("modified")
            Delay.Milliseconds(2200)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonSave1' at 35;12.", repo.WebDocumentIceFishHash.ContainerHBox.ButtonSave1Info, new RecordItemIndex(34))
            repo.WebDocumentIceFishHash.ContainerHBox.ButtonSave1.Click("35;12")
            Delay.Milliseconds(1570)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK' at 49;16.", repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(35))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK.Click("49;16")
            Delay.Milliseconds(2120)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 28;3.", repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_Info, new RecordItemIndex(36))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("28;3")
            Delay.Milliseconds(1980)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process' at 77;9.", repo.WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_ProcessInfo, new RecordItemIndex(37))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process.Click("77;9")
            Delay.Milliseconds(790)
                        
            Mouse_Click_CellString1()
            Delay.Milliseconds(1100)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 24;5.", repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_Info, new RecordItemIndex(39))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("24;5")
            Delay.Milliseconds(2730)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.TextNameText' at 7;13.", repo.WebDocumentIceFishHash.ContainerHBox.TextNameTextInfo, new RecordItemIndex(40))
            repo.WebDocumentIceFishHash.ContainerHBox.TextNameText.Click("7;13")
            Delay.Milliseconds(1790)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Tab' Press.", new RecordItemIndex(41))
            Keyboard.Press(Keys.Tab, 15, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(1660)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'test'.", new RecordItemIndex(42))
            Keyboard.Press("test")
            Delay.Milliseconds(1380)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key '1' Press.", new RecordItemIndex(43))
            Keyboard.Press(Keys.D1, 2, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(11140)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonSave1' at 30;10.", repo.WebDocumentIceFishHash.ContainerHBox.ButtonSave1Info, new RecordItemIndex(44))
            repo.WebDocumentIceFishHash.ContainerHBox.ButtonSave1.Click("30;10")
            Delay.Milliseconds(2940)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK' at 46;8.", repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(45))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK.Click("46;8")
            Delay.Milliseconds(3540)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonPublish' at 40;8.", repo.WebDocumentIceFishHash.ContainerHBox.ButtonPublishInfo, new RecordItemIndex(46))
            repo.WebDocumentIceFishHash.ContainerHBox.ButtonPublish.Click("40;8")
            Delay.Milliseconds(2120)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK1' at 47;8.", repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK1Info, new RecordItemIndex(47))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK1.Click("47;8")
            Delay.Milliseconds(2770)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 34;4.", repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_Info, new RecordItemIndex(48))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("34;4")
            Delay.Milliseconds(2660)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process' at 77;9.", repo.WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_ProcessInfo, new RecordItemIndex(49))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process.Click("77;9")
            Delay.Milliseconds(790)
                        
            Mouse_Click_ContainerHBox3()
            Delay.Milliseconds(1070)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 28;3.", repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_Info, new RecordItemIndex(51))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("28;3")
            Delay.Milliseconds(2050)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.TextNameText' at 4;13.", repo.WebDocumentIceFishHash.ContainerHBox.TextNameTextInfo, new RecordItemIndex(52))
            repo.WebDocumentIceFishHash.ContainerHBox.TextNameText.Click("4;13")
            Delay.Milliseconds(1400)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Tab' Press.", new RecordItemIndex(53))
            Keyboard.Press(Keys.Tab, 15, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(2330)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'test'.", new RecordItemIndex(54))
            Keyboard.Press("test")
            Delay.Milliseconds(1200)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key '2' Press.", new RecordItemIndex(55))
            Keyboard.Press(Keys.D2, 3, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(1680)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.ContainerHBox.ButtonSave1' at 21;12.", repo.WebDocumentIceFishHash.ContainerHBox.ButtonSave1Info, new RecordItemIndex(56))
            repo.WebDocumentIceFishHash.ContainerHBox.ButtonSave1.Click("21;12")
            Delay.Milliseconds(4180)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK' at 46;9.", repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(57))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.ButtonOK.Click("46;9")
            Delay.Milliseconds(3590)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_' at 21;3.", repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_Info, new RecordItemIndex(58))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.TextProcess_Modeling_.Click("21;3")
            Delay.Milliseconds(1120)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process' at 80;7.", repo.WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_ProcessInfo, new RecordItemIndex(59))
            repo.WebDocumentIceFishHash.FlexObjectIceFish.MenuItemView_Process.Click("80;7")
            Delay.Milliseconds(790)
                        
            Mouse_Click_ContainerHBox4()
            Delay.Milliseconds(1120)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace
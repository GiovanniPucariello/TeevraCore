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
    ''' The createtestprocess recording.
    ''' </summary>
    <TestModule("ed8e548b-c582-4bdb-b11c-4ee72d94f2d0", ModuleType.Recording, 1)> _
    Partial Public Class createtestprocess
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the UI_TCRepository repository.
        ''' </summary>
        Public Shared repo as UI_TCRepository = UI_TCRepository.Instance

        Shared _instance as createtestprocess = new createtestprocess()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As createtestprocess
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

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.TextProcess_Modeling_' at 39;10.", repo.WebDocumentIceFish1.FlexObjectIceFish.TextProcess_Modeling_Info, new RecordItemIndex(0))
            repo.WebDocumentIceFish1.FlexObjectIceFish.TextProcess_Modeling_.Click("39;10", 1000)
            Delay.Milliseconds(240)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.MenuItemView_Process' at 44;12.", repo.WebDocumentIceFish1.FlexObjectIceFish.MenuItemView_ProcessInfo, new RecordItemIndex(1))
            repo.WebDocumentIceFish1.FlexObjectIceFish.MenuItemView_Process.Click("44;12", 1000)
            Delay.Milliseconds(630)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.ButtonNew' at 27;13.", repo.WebDocumentIceFish.ContainerHBox.ButtonNewInfo, new RecordItemIndex(2))
            repo.WebDocumentIceFish.ContainerHBox.ButtonNew.Click("27;13", 1000)
            Delay.Milliseconds(1480)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentIceFish.ContainerComponent_Palette.PictureIcon_3' at 16;6.", repo.WebDocumentIceFish.ContainerComponent_Palette.PictureIcon_3Info, new RecordItemIndex(3))
            repo.WebDocumentIceFish.ContainerComponent_Palette.PictureIcon_3.MoveTo("16;6", 1000)
            Mouse.ButtonDown(MouseButtons.Left)
            Delay.Milliseconds(90)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentIceFish1.ContainerHBox1.ContainerGraphCanvas' at 114;77.", repo.WebDocumentIceFish1.ContainerHBox1.ContainerGraphCanvasInfo, new RecordItemIndex(4))
            repo.WebDocumentIceFish1.ContainerHBox1.ContainerGraphCanvas.MoveTo("114;77", 1000)
            Mouse.ButtonUp(MouseButtons.Left)
            Delay.Milliseconds(500)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentIceFish.ContainerComponent_Palette.PictureIcon_3' at 12;20.", repo.WebDocumentIceFish.ContainerComponent_Palette.PictureIcon_3Info, new RecordItemIndex(5))
            repo.WebDocumentIceFish.ContainerComponent_Palette.PictureIcon_3.MoveTo("12;20", 1000)
            Mouse.ButtonDown(MouseButtons.Left)
            Delay.Milliseconds(90)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentIceFish1.ContainerHBox1.ContainerGraphCanvas' at 293;83.", repo.WebDocumentIceFish1.ContainerHBox1.ContainerGraphCanvasInfo, new RecordItemIndex(6))
            repo.WebDocumentIceFish1.ContainerHBox1.ContainerGraphCanvas.MoveTo("293;83", 1000)
            Mouse.ButtonUp(MouseButtons.Left)
            Delay.Milliseconds(350)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerComponent_Palette.ButtonRouters' at 86;14.", repo.WebDocumentIceFish.ContainerComponent_Palette.ButtonRoutersInfo, new RecordItemIndex(7))
            repo.WebDocumentIceFish.ContainerComponent_Palette.ButtonRouters.Click("86;14", 1000)
            Delay.Milliseconds(680)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerComponent_Palette.PictureLine' at 20;10.", repo.WebDocumentIceFish.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(8))
            repo.WebDocumentIceFish.ContainerComponent_Palette.PictureLine.Click("20;10", 1000)
            Delay.Milliseconds(210)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentIceFish.FlexObjectIceFish.PictureIcon_3_6538' at 20;32.", repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_3_6538Info, new RecordItemIndex(9))
            repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_3_6538.MoveTo("20;32", 1000)
            Mouse.ButtonDown(MouseButtons.Left)
            Delay.Milliseconds(450)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentIceFish.FlexObjectIceFish.PictureIcon_3_24444' at 10;24.", repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_3_24444Info, new RecordItemIndex(10))
            repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_3_24444.MoveTo("10;24", 734)
            Mouse.ButtonUp(MouseButtons.Left)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentIceFish.FlexObjectIceFish.PictureIcon_3_24444' at 10;24.", repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_3_24444Info, new RecordItemIndex(11))
            repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_3_24444.Click(MouseButtons.Right, "10;24", 100)
            Delay.Milliseconds(1000)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 13;13.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(12))
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("13;13", 100)
            Delay.Milliseconds(1210)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FormFIXML_Parser_Configurati.ButtonLoad_template___' at 65;13.", repo.WebDocumentIceFish.FormFIXML_Parser_Configurati.ButtonLoad_template___Info, new RecordItemIndex(13))
            repo.WebDocumentIceFish.FormFIXML_Parser_Configurati.ButtonLoad_template___.Click("65;13", 100)
            Delay.Milliseconds(960)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.FlexObjectIceFish.ButtonButton' at 93;21.", repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(14))
            repo.WebDocumentIceFish1.FlexObjectIceFish.ButtonButton.Click("93;21", 100)
            Delay.Milliseconds(1100)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextDestinationfile' at 65;5.", repo.WebDocumentIceFish.FlexObjectIceFish.TextDestinationfileInfo, new RecordItemIndex(15))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextDestinationfile.Click("65;5", 100)
            Delay.Milliseconds(790)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonLoad' at 25;18.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(16))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonLoad.Click("25;18", 100)
            Delay.Milliseconds(1160)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FormFIXML_Parser_Configurati.TextServiceId' at 45;15.", repo.WebDocumentIceFish.FormFIXML_Parser_Configurati.TextServiceIdInfo, new RecordItemIndex(17))
            repo.WebDocumentIceFish.FormFIXML_Parser_Configurati.TextServiceId.Click("45;15", 100)
            Delay.Milliseconds(960)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'D' Press.", new RecordItemIndex(18))
            Keyboard.Press(Keys.D, 32, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(19))
            Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(80)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(20))
            Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(180)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'T' Press.", new RecordItemIndex(21))
            Keyboard.Press(Keys.T, 20, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(910)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 17;15.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(22))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("17;15", 100)
            Delay.Milliseconds(1160)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentIceFish.FlexObjectIceFish.PictureIcon_3_6538' at 26;21.", repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_3_6538Info, new RecordItemIndex(23))
            repo.WebDocumentIceFish.FlexObjectIceFish.PictureIcon_3_6538.Click(MouseButtons.Right, "26;21", 100)
            Delay.Milliseconds(970)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 14;4.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(24))
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("14;4", 100)
            Delay.Milliseconds(1430)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextDirectory' at 15;14.", repo.WebDocumentIceFish.FlexObjectIceFish.TextDirectoryInfo, new RecordItemIndex(25))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextDirectory.Click("15;14", 100)
            Delay.Milliseconds(2320)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FormFIXML_Parser_Configurati.ButtonLoad_template___' at 73;15.", repo.WebDocumentIceFish.FormFIXML_Parser_Configurati.ButtonLoad_template___Info, new RecordItemIndex(26))
            repo.WebDocumentIceFish.FormFIXML_Parser_Configurati.ButtonLoad_template___.Click("73;15", 100)
            Delay.Milliseconds(910)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextTextInput7' at 76;2.", repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput7Info, new RecordItemIndex(27))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextTextInput7.Click("76;2", 100)
            Delay.Milliseconds(1070)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextSourcefile' at 58;12.", repo.WebDocumentIceFish.FlexObjectIceFish.TextSourcefileInfo, new RecordItemIndex(28))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextSourcefile.Click("58;12", 100)
            Delay.Milliseconds(850)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.FormChoose_Template' at 15;120.", repo.WebDocumentIceFish.FlexObjectIceFish.FormChoose_TemplateInfo, new RecordItemIndex(29))
            repo.WebDocumentIceFish.FlexObjectIceFish.FormChoose_Template.Click("15;120", 100)
            Delay.Milliseconds(600)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonLoad' at 14;13.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(30))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonLoad.Click("14;13", 100)
            Delay.Milliseconds(1070)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FormFIXML_Parser_Configurati.TextServiceId' at 27;20.", repo.WebDocumentIceFish.FormFIXML_Parser_Configurati.TextServiceIdInfo, new RecordItemIndex(31))
            repo.WebDocumentIceFish.FormFIXML_Parser_Configurati.TextServiceId.Click("27;20", 100)
            Delay.Milliseconds(430)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FormFIXML_Parser_Configurati.TextServiceId' at 27;18.", repo.WebDocumentIceFish.FormFIXML_Parser_Configurati.TextServiceIdInfo, new RecordItemIndex(32))
            repo.WebDocumentIceFish.FormFIXML_Parser_Configurati.TextServiceId.Click("27;18", 100)
            Delay.Milliseconds(470)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(33))
            Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(190)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'R' Press.", new RecordItemIndex(34))
            Keyboard.Press(Keys.R, 19, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(190)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'C' Press.", new RecordItemIndex(35))
            Keyboard.Press(Keys.C, 46, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(970)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonSave' at 35;7.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(36))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonSave.Click("35;7", 100)
            Delay.Milliseconds(1640)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.TextNameText' at 171;9.", repo.WebDocumentIceFish.ContainerHBox.TextNameTextInfo, new RecordItemIndex(37))
            repo.WebDocumentIceFish.ContainerHBox.TextNameText.Click("171;9", 100)
            Delay.Milliseconds(1190)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'te'.", new RecordItemIndex(38))
            Keyboard.Press("te")
            Delay.Milliseconds(80)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'st'.", new RecordItemIndex(39))
            Keyboard.Press("st")
            Delay.Milliseconds(670)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+LShiftKey' Down.", new RecordItemIndex(40))
            Keyboard.Down(Keys.LShiftKey, 42, False)
            Delay.Milliseconds(420)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+OemMinus' Press.", new RecordItemIndex(41))
            Keyboard.Press(Keys.OemMinus, 12, 77, 1, False)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'LShiftKey' Up.", new RecordItemIndex(42))
            Keyboard.Up(Keys.LShiftKey, 42, False)
            Delay.Milliseconds(1060)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '51'.", new RecordItemIndex(43))
            Keyboard.Press("51")
            Delay.Milliseconds(1920)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.ButtonSave' at 23;14.", repo.WebDocumentIceFish.ContainerHBox.ButtonSaveInfo, new RecordItemIndex(44))
            repo.WebDocumentIceFish.ContainerHBox.ButtonSave.Click("23;14", 100)
            Delay.Milliseconds(1710)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK' at 47;12.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(45))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK.Click("47;12", 100)
            Delay.Milliseconds(960)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.ButtonPublish' at 52;16.", repo.WebDocumentIceFish.ContainerHBox.ButtonPublishInfo, new RecordItemIndex(46))
            repo.WebDocumentIceFish.ContainerHBox.ButtonPublish.Click("52;16", 100)
            Delay.Milliseconds(1850)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ButtonOK1' at 44;11.", repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK1Info, new RecordItemIndex(47))
            repo.WebDocumentIceFish.FlexObjectIceFish.ButtonOK1.Click("44;11", 100)
            Delay.Milliseconds(3470)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerHBox.ButtonCancel' at 31;16.", repo.WebDocumentIceFish.ContainerHBox.ButtonCancelInfo, new RecordItemIndex(48))
            repo.WebDocumentIceFish.ContainerHBox.ButtonCancel.Click("31;16", 100)
            Delay.Milliseconds(1000)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace

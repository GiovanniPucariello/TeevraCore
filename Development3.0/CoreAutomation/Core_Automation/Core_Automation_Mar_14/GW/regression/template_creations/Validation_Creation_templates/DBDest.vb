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
    ''' The DBDest recording.
    ''' </summary>
    <TestModule("10c5c4b1-cb53-4853-b78a-00c99f53a383", ModuleType.Recording, 1)> _
    Partial Public Class DBDest
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the EndpointsRepository repository.
        ''' </summary>
        Public Shared repo as EndpointsRepository = EndpointsRepository.Instance

        Shared _instance as DBDest = new DBDest()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As DBDest
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

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8888.ContainerHBox.PictureIcon_11' at 3;13.", repo.WebDocument10_200_41_76_8888.ContainerHBox.PictureIcon_11Info, new RecordItemIndex(0))
            repo.WebDocument10_200_41_76_8888.ContainerHBox.PictureIcon_11.MoveTo("3;13")
            Mouse.ButtonDown(MouseButtons.Left)
            Delay.Milliseconds(980)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_41_76_8888.ContainerHBox.ContainerGraphCanvas' at 378;102.", repo.WebDocument10_200_41_76_8888.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(1))
            repo.WebDocument10_200_41_76_8888.ContainerHBox.ContainerGraphCanvas.MoveTo("378;102")
            Mouse.ButtonUp(MouseButtons.Left)
            Delay.Milliseconds(520)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocument10_200_41_76_8888.ContainerHBox.PictureIcon_1_32963' at 35;30.", repo.WebDocument10_200_41_76_8888.ContainerHBox.PictureIcon_1_32963Info, new RecordItemIndex(2))
            repo.WebDocument10_200_41_76_8888.ContainerHBox.PictureIcon_1_32963.Click(MouseButtons.Right, "35;30")
            Delay.Milliseconds(520)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 18;7.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(3))
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("18;7")
            Delay.Milliseconds(1100)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.TextServiceId' at 36;12.", repo.WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.TextServiceIdInfo, new RecordItemIndex(4))
            repo.WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.TextServiceId.Click("36;12")
            Delay.Milliseconds(2710)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'service'.", new RecordItemIndex(5))
            Keyboard.Press("service")
            Delay.Milliseconds(1920)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.TextServerURL' at 39;15.", repo.WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.TextServerURLInfo, new RecordItemIndex(6))
            repo.WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.TextServerURL.Click("39;15")
            Delay.Milliseconds(1570)
                        
            getURL_DB()
            Delay.Milliseconds(760)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.TextUserName' at 3;12.", repo.WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.TextUserNameInfo, new RecordItemIndex(8))
            repo.WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.TextUserName.Click("3;12")
            Delay.Milliseconds(840)
                        
            getUSeridDB()
            Delay.Milliseconds(1600)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormForm.TextQuery2' at 22;8.", repo.WebDocument10_200_41_76_8888.FormForm.TextQuery2Info, new RecordItemIndex(10))
            repo.WebDocument10_200_41_76_8888.FormForm.TextQuery2.Click("22;8")
            Delay.Milliseconds(850)
                        
            getQuery_DB()
            Delay.Milliseconds(2140)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormForm.TextWaitInterval1' at 30;12.", repo.WebDocument10_200_41_76_8888.FormForm.TextWaitInterval1Info, new RecordItemIndex(12))
            repo.WebDocument10_200_41_76_8888.FormForm.TextWaitInterval1.Click("30;12")
            Delay.Milliseconds(870)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '1000'.", new RecordItemIndex(13))
            Keyboard.Press("1000")
            Delay.Milliseconds(1350)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormForm.TextUpdateQuery1' at 16;14.", repo.WebDocument10_200_41_76_8888.FormForm.TextUpdateQuery1Info, new RecordItemIndex(14))
            repo.WebDocument10_200_41_76_8888.FormForm.TextUpdateQuery1.Click("16;14")
            Delay.Milliseconds(840)
                        
            getUpdatequery_DB()
            Delay.Milliseconds(2120)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormForm.ButtonButton' at Center.", repo.WebDocument10_200_41_76_8888.FormForm.ButtonButtonInfo, new RecordItemIndex(16))
            repo.WebDocument10_200_41_76_8888.FormForm.ButtonButton.Click()
            Delay.Milliseconds(1180)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.TextPostGre_SQL' at Center.", repo.WebDocument10_200_41_76_8888.TextPostGre_SQLInfo, new RecordItemIndex(17))
            repo.WebDocument10_200_41_76_8888.TextPostGre_SQL.Click()
            Delay.Milliseconds(790)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormForm.TextReadSize' at 31;14.", repo.WebDocument10_200_41_76_8888.FormForm.TextReadSizeInfo, new RecordItemIndex(18))
            repo.WebDocument10_200_41_76_8888.FormForm.TextReadSize.Click("31;14")
            Delay.Milliseconds(800)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '10000'.", new RecordItemIndex(19))
            Keyboard.Press("10000")
            Delay.Milliseconds(620)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormForm.TextPassword' at 20;4.", repo.WebDocument10_200_41_76_8888.FormForm.TextPasswordInfo, new RecordItemIndex(20))
            repo.WebDocument10_200_41_76_8888.FormForm.TextPassword.Click("20;4")
            Delay.Milliseconds(870)
                        
            getPwd_DB()
            Delay.Milliseconds(2000)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.ButtonSave_as_Template___' at 30;9.", repo.WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.ButtonSave_as_Template___Info, new RecordItemIndex(22))
            repo.WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.ButtonSave_as_Template___.Click("30;9")
            Delay.Milliseconds(630)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.TextTextInput' at 58;12.", repo.WebDocument10_200_41_76_8888.TextTextInputInfo, new RecordItemIndex(23))
            repo.WebDocument10_200_41_76_8888.TextTextInput.Click("58;12")
            Delay.Milliseconds(620)
                        
            getTempName_DB()
            Delay.Milliseconds(2710)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ButtonSave' at 26;8.", repo.WebDocument10_200_41_76_8888.ButtonSaveInfo, new RecordItemIndex(25))
            repo.WebDocument10_200_41_76_8888.ButtonSave.Click("26;8")
            Delay.Milliseconds(1230)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerSave_successful.ButtonOK' at 45;18.", repo.WebDocument10_200_41_76_8888.ContainerSave_successful.ButtonOKInfo, new RecordItemIndex(26))
            repo.WebDocument10_200_41_76_8888.ContainerSave_successful.ButtonOK.Click("45;18")
            Delay.Milliseconds(740)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.ButtonSave1' at 36;5.", repo.WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.ButtonSave1Info, new RecordItemIndex(27))
            repo.WebDocument10_200_41_76_8888.FormDB_Endpoint_Configuratio.ButtonSave1.Click("36;5")
            Delay.Milliseconds(850)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace

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
    ''' The Recording3 recording.
    ''' </summary>
    <TestModule("14580e91-2c73-4ba8-9dbd-665ed26075d0", ModuleType.Recording, 1)> _
    Partial Public Class Recording3
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the Project3Repository repository.
        ''' </summary>
        Public Shared repo as Project3Repository = Project3Repository.Instance

        Shared _instance as Recording3 = new Recording3()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As Recording3
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

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerMainArea.TextUserIdTextInput' at 59;7.", repo.WebDocumentIceFish.ContainerMainArea.TextUserIdTextInputInfo, new RecordItemIndex(0))
            repo.WebDocumentIceFish.ContainerMainArea.TextUserIdTextInput.Click("59;7")
            Delay.Milliseconds(1050)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'icefish'.", new RecordItemIndex(1))
            Keyboard.Press("icefish")
            Delay.Milliseconds(2640)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerMainArea.TextPasswordTextInput' at 56;8.", repo.WebDocumentIceFish.ContainerMainArea.TextPasswordTextInputInfo, new RecordItemIndex(2))
            repo.WebDocumentIceFish.ContainerMainArea.TextPasswordTextInput.Click("56;8")
            Delay.Milliseconds(570)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'icefish'.", new RecordItemIndex(3))
            Keyboard.Press("icefish")
            Delay.Milliseconds(2230)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerMainArea.ButtonSubmit' at 47;10.", repo.WebDocumentIceFish.ContainerMainArea.ButtonSubmitInfo, new RecordItemIndex(4))
            repo.WebDocumentIceFish.ContainerMainArea.ButtonSubmit.Click("47;10", 162)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Process Modeling > View Process') on item 'WebDocumentIceFish.ContainerMainArea.TextProcess_Modeling__View_P'.", repo.WebDocumentIceFish.ContainerMainArea.TextProcess_Modeling__View_PInfo, new RecordItemIndex(5))
            Validate.Attribute(repo.WebDocumentIceFish.ContainerMainArea.TextProcess_Modeling__View_PInfo, "Text", "Process Modeling > View Process")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='_ViewProcess_Label1') on item 'WebDocumentIceFish.ContainerMainArea.TextProcess_Modeling__View_P'.", repo.WebDocumentIceFish.ContainerMainArea.TextProcess_Modeling__View_PInfo, new RecordItemIndex(6))
            Validate.Attribute(repo.WebDocumentIceFish.ContainerMainArea.TextProcess_Modeling__View_PInfo, "Id", "_ViewProcess_Label1")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='Label') on item 'WebDocumentIceFish.ContainerMainArea.TextProcess_Modeling__View_P'.", repo.WebDocumentIceFish.ContainerMainArea.TextProcess_Modeling__View_PInfo, new RecordItemIndex(7))
            Validate.Attribute(repo.WebDocumentIceFish.ContainerMainArea.TextProcess_Modeling__View_PInfo, "Type", "Label")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.TextProcess_Modeling_' at Center.", repo.WebDocumentIceFish.TextProcess_Modeling_Info, new RecordItemIndex(8))
            repo.WebDocumentIceFish.TextProcess_Modeling_.Click()
            Delay.Milliseconds(850)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='View Process') on item 'WebDocumentIceFish.ContextMenuMenu.MenuItemView_Process'.", repo.WebDocumentIceFish.ContextMenuMenu.MenuItemView_ProcessInfo, new RecordItemIndex(9))
            Validate.Attribute(repo.WebDocumentIceFish.ContextMenuMenu.MenuItemView_ProcessInfo, "Text", "View Process")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='View Schema') on item 'WebDocumentIceFish.ContextMenuMenu.MenuItemView_Schema'.", repo.WebDocumentIceFish.ContextMenuMenu.MenuItemView_SchemaInfo, new RecordItemIndex(10))
            Validate.Attribute(repo.WebDocumentIceFish.ContextMenuMenu.MenuItemView_SchemaInfo, "Text", "View Schema")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='View StateMachine') on item 'WebDocumentIceFish.ContextMenuMenu.MenuItemView_StateMachine'.", repo.WebDocumentIceFish.ContextMenuMenu.MenuItemView_StateMachineInfo, new RecordItemIndex(11))
            Validate.Attribute(repo.WebDocumentIceFish.ContextMenuMenu.MenuItemView_StateMachineInfo, "Text", "View StateMachine")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='DataSource') on item 'WebDocumentIceFish.ContextMenuMenu.MenuItemDataSource'.", repo.WebDocumentIceFish.ContextMenuMenu.MenuItemDataSourceInfo, new RecordItemIndex(12))
            Validate.Attribute(repo.WebDocumentIceFish.ContextMenuMenu.MenuItemDataSourceInfo, "Text", "DataSource")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Reference Data') on item 'WebDocumentIceFish.ContextMenuMenu.MenuItemReference_Data'.", repo.WebDocumentIceFish.ContextMenuMenu.MenuItemReference_DataInfo, new RecordItemIndex(13))
            Validate.Attribute(repo.WebDocumentIceFish.ContextMenuMenu.MenuItemReference_DataInfo, "Text", "Reference Data")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.TextProcess_Management_' at Center.", repo.WebDocumentIceFish.TextProcess_Management_Info, new RecordItemIndex(14))
            repo.WebDocumentIceFish.TextProcess_Management_.Click(209)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Visible='True') on item 'WebDocumentIceFish.ContextMenuMenu.MenuItemProcesses_Status'.", repo.WebDocumentIceFish.ContextMenuMenu.MenuItemProcesses_StatusInfo, new RecordItemIndex(15))
            Validate.Attribute(repo.WebDocumentIceFish.ContextMenuMenu.MenuItemProcesses_StatusInfo, "Visible", "True")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Processes Status') on item 'WebDocumentIceFish.ContextMenuMenu.MenuItemProcesses_Status'.", repo.WebDocumentIceFish.ContextMenuMenu.MenuItemProcesses_StatusInfo, new RecordItemIndex(16))
            Validate.Attribute(repo.WebDocumentIceFish.ContextMenuMenu.MenuItemProcesses_StatusInfo, "Text", "Processes Status")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextMonitoring_Console_' at Center.", repo.WebDocumentIceFish.FlexObjectIceFish.TextMonitoring_Console_Info, new RecordItemIndex(17))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextMonitoring_Console_.Click(193)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Error Reporting') on item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemError_Reporting'.", repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemError_ReportingInfo, new RecordItemIndex(18))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemError_ReportingInfo, "Text", "Error Reporting")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.TextAdministration_' at Center.", repo.WebDocumentIceFish.FlexObjectIceFish.TextAdministration_Info, new RecordItemIndex(19))
            repo.WebDocumentIceFish.FlexObjectIceFish.TextAdministration_.Click(209)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Components') on item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemComponents'.", repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemComponentsInfo, new RecordItemIndex(20))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemComponentsInfo, "Text", "Components")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='User Admin') on item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemUser_Admin'.", repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemUser_AdminInfo, new RecordItemIndex(21))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemUser_AdminInfo, "Text", "User Admin")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Roles') on item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemRoles'.", repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemRolesInfo, new RecordItemIndex(22))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemRolesInfo, "Text", "Roles")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Server Admin') on item 'WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_Admin'.", repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_AdminInfo, new RecordItemIndex(23))
            Validate.Attribute(repo.WebDocumentIceFish.FlexObjectIceFish.MenuItemServer_AdminInfo, "Text", "Server Admin")
            Delay.Milliseconds(100)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace

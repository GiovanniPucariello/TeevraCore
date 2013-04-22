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
    ''' The Scenario22 recording.
    ''' </summary>
    <TestModule("a5731aa1-8045-451f-afbb-e4542a108900", ModuleType.Recording, 1)> _
    Partial Public Class Scenario22
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the UI_TCRepository repository.
        ''' </summary>
        Public Shared repo as UI_TCRepository = UI_TCRepository.Instance

        Shared _instance as Scenario22 = new Scenario22()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As Scenario22
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
            Mouse.DefaultMoveTime = 100
            Keyboard.DefaultKeyPressTime = 100
            Delay.SpeedFactor = 3.0

            Init()

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.ContainerPanel' at 564;22.", repo.WebDocumentIceFish1.ContainerPanelInfo, new RecordItemIndex(0))
            repo.WebDocumentIceFish1.ContainerPanel.Click("564;22", 10)
            Delay.Milliseconds(2550)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.ContainerPanel' at 593;35.", repo.WebDocumentIceFish1.ContainerPanelInfo, new RecordItemIndex(1))
            repo.WebDocumentIceFish1.ContainerPanel.Click("593;35", 10)
            Delay.Milliseconds(980)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.TextAdministration_' at 11;5.", repo.WebDocumentIceFish1.TextAdministration_Info, new RecordItemIndex(2))
            repo.WebDocumentIceFish1.TextAdministration_.Click("11;5", 10)
            Delay.Milliseconds(2410)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish1.MenuItemUser_Admin' at 27;10.", repo.WebDocumentIceFish1.MenuItemUser_AdminInfo, new RecordItemIndex(3))
            repo.WebDocumentIceFish1.MenuItemUser_Admin.Click("27;10", 10)
            Delay.Milliseconds(1080)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='New') on item 'WebDocumentIceFish1.ContainerHBox.ButtonNew'.", repo.WebDocumentIceFish1.ContainerHBox.ButtonNewInfo, new RecordItemIndex(4))
            Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonNewInfo, "Text", "New")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Enabled='False') on item 'WebDocumentIceFish1.ContainerHBox.ButtonDelete'.", repo.WebDocumentIceFish1.ContainerHBox.ButtonDeleteInfo, new RecordItemIndex(5))
            Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonDeleteInfo, "Enabled", "False")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Delete') on item 'WebDocumentIceFish1.ContainerHBox.ButtonDelete'.", repo.WebDocumentIceFish1.ContainerHBox.ButtonDeleteInfo, new RecordItemIndex(6))
            Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonDeleteInfo, "Text", "Delete")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Enabled='True') on item 'WebDocumentIceFish1.ContainerHBox.ButtonRefresh'.", repo.WebDocumentIceFish1.ContainerHBox.ButtonRefreshInfo, new RecordItemIndex(7))
            Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonRefreshInfo, "Enabled", "True")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Refresh') on item 'WebDocumentIceFish1.ContainerHBox.ButtonRefresh'.", repo.WebDocumentIceFish1.ContainerHBox.ButtonRefreshInfo, new RecordItemIndex(8))
            Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonRefreshInfo, "Text", "Refresh")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='Button') on item 'WebDocumentIceFish1.ContainerHBox.ButtonRefresh'.", repo.WebDocumentIceFish1.ContainerHBox.ButtonRefreshInfo, new RecordItemIndex(9))
            Validate.Attribute(repo.WebDocumentIceFish1.ContainerHBox.ButtonRefreshInfo, "Type", "Button")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Id') on item 'WebDocumentIceFish1.TableUserGrid.CellString'.", repo.WebDocumentIceFish1.TableUserGrid.CellStringInfo, new RecordItemIndex(10))
            Validate.Attribute(repo.WebDocumentIceFish1.TableUserGrid.CellStringInfo, "Text", "Id")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Name') on item 'WebDocumentIceFish1.TableUserGrid.CellString1'.", repo.WebDocumentIceFish1.TableUserGrid.CellString1Info, new RecordItemIndex(11))
            Validate.Attribute(repo.WebDocumentIceFish1.TableUserGrid.CellString1Info, "Text", "Name")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='First Name') on item 'WebDocumentIceFish1.TableUserGrid.CellString2'.", repo.WebDocumentIceFish1.TableUserGrid.CellString2Info, new RecordItemIndex(12))
            Validate.Attribute(repo.WebDocumentIceFish1.TableUserGrid.CellString2Info, "Text", "First Name")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Last Name') on item 'WebDocumentIceFish1.TableUserGrid.CellString3'.", repo.WebDocumentIceFish1.TableUserGrid.CellString3Info, new RecordItemIndex(13))
            Validate.Attribute(repo.WebDocumentIceFish1.TableUserGrid.CellString3Info, "Text", "Last Name")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Status') on item 'WebDocumentIceFish1.TableUserGrid.CellString4'.", repo.WebDocumentIceFish1.TableUserGrid.CellString4Info, new RecordItemIndex(14))
            Validate.Attribute(repo.WebDocumentIceFish1.TableUserGrid.CellString4Info, "Text", "Status")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Roles') on item 'WebDocumentIceFish1.TableUserGrid.CellString5'.", repo.WebDocumentIceFish1.TableUserGrid.CellString5Info, new RecordItemIndex(15))
            Validate.Attribute(repo.WebDocumentIceFish1.TableUserGrid.CellString5Info, "Text", "Roles")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Date Created') on item 'WebDocumentIceFish1.TableUserGrid.CellString6'.", repo.WebDocumentIceFish1.TableUserGrid.CellString6Info, new RecordItemIndex(16))
            Validate.Attribute(repo.WebDocumentIceFish1.TableUserGrid.CellString6Info, "Text", "Date Created")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Last Modified') on item 'WebDocumentIceFish1.TableUserGrid.CellString7'.", repo.WebDocumentIceFish1.TableUserGrid.CellString7Info, new RecordItemIndex(17))
            Validate.Attribute(repo.WebDocumentIceFish1.TableUserGrid.CellString7Info, "Text", "Last Modified")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='1') on item 'WebDocumentIceFish1.Row0.CellString8'.", repo.WebDocumentIceFish1.Row0.CellString8Info, new RecordItemIndex(18))
            Validate.Attribute(repo.WebDocumentIceFish1.Row0.CellString8Info, "Text", "1")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='icefish') on item 'WebDocumentIceFish1.Row0.CellString9'.", repo.WebDocumentIceFish1.Row0.CellString9Info, new RecordItemIndex(19))
            Validate.Attribute(repo.WebDocumentIceFish1.Row0.CellString9Info, "Text", "icefish")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='ICEFISH') on item 'WebDocumentIceFish1.Row0.CellString10'.", repo.WebDocumentIceFish1.Row0.CellString10Info, new RecordItemIndex(20))
            Validate.Attribute(repo.WebDocumentIceFish1.Row0.CellString10Info, "Text", "ICEFISH")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='ICEFISH') on item 'WebDocumentIceFish1.Row0.CellString11'.", repo.WebDocumentIceFish1.Row0.CellString11Info, new RecordItemIndex(21))
            Validate.Attribute(repo.WebDocumentIceFish1.Row0.CellString11Info, "Text", "ICEFISH")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='ACTIVE') on item 'WebDocumentIceFish1.Row0.CellString12'.", repo.WebDocumentIceFish1.Row0.CellString12Info, new RecordItemIndex(22))
            Validate.Attribute(repo.WebDocumentIceFish1.Row0.CellString12Info, "Text", "ACTIVE")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='admin') on item 'WebDocumentIceFish1.Row0.CellString13'.", repo.WebDocumentIceFish1.Row0.CellString13Info, new RecordItemIndex(23))
            Validate.Attribute(repo.WebDocumentIceFish1.Row0.CellString13Info, "Text", "admin")
            Delay.Milliseconds(100)
                        
            RESULTS()
            Delay.Milliseconds(0)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace
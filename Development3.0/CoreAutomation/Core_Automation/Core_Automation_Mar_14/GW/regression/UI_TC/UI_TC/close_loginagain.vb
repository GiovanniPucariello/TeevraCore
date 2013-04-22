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
    ''' The close_loginagain recording.
    ''' </summary>
    <TestModule("99739022-7bb5-4a0e-8ae9-aa3c55374221", ModuleType.Recording, 1)> _
    Partial Public Class close_loginagain
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the UI_TCRepository repository.
        ''' </summary>
        Public Shared repo as UI_TCRepository = UI_TCRepository.Instance

        Shared _instance as close_loginagain = new close_loginagain()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As close_loginagain
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

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ContainerMainArea' at 540;209.", repo.WebDocumentIceFish.FlexObjectIceFish.ContainerMainAreaInfo, new RecordItemIndex(0))
            repo.WebDocumentIceFish.FlexObjectIceFish.ContainerMainArea.Click("540;209", 100)
            Delay.Milliseconds(1820)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'F11' Press.", new RecordItemIndex(1))
            Keyboard.Press(Keys.F11, 87, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(3270)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'FormIceFish___Microsoft_Inte.ButtonClose' at 10;12.", repo.FormIceFish___Microsoft_Inte.ButtonCloseInfo, new RecordItemIndex(2))
            repo.FormIceFish___Microsoft_Inte.ButtonClose.Click("10;12", 100)
            Delay.Milliseconds(2910)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left DoubleClick item 'DesktopExplorer.ListItemShortcut_to_iexplore' at 37;17.", repo.DesktopExplorer.ListItemShortcut_to_iexploreInfo, new RecordItemIndex(3))
            repo.DesktopExplorer.ListItemShortcut_to_iexplore.DoubleClick("37;17", 100)
            Delay.Milliseconds(3830)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'FormHttps___hm_headstrong_co.Button203' at 4;10.", repo.FormHttps___hm_headstrong_co.Button203Info, new RecordItemIndex(4))
            repo.FormHttps___hm_headstrong_co.Button203.Click("4;10", 100)
            Delay.Milliseconds(2130)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'H' Press.", new RecordItemIndex(5))
            Keyboard.Press(Keys.H, 35, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(300)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'tt'.", new RecordItemIndex(6))
            Keyboard.Press("tt")
            Delay.Milliseconds(170)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'P' Press.", new RecordItemIndex(7))
            Keyboard.Press(Keys.P, 25, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(180)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+RShiftKey' Down.", new RecordItemIndex(8))
            Keyboard.Down(Keys.RShiftKey, 54, False)
            Delay.Milliseconds(150)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+Oem1' Down.", new RecordItemIndex(9))
            Keyboard.Down(Keys.Oem1, 39, False)
            Delay.Milliseconds(30)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'RShiftKey' Up.", new RecordItemIndex(10))
            Keyboard.Up(Keys.RShiftKey, 54, False)
            Delay.Milliseconds(60)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Oem1' Up.", new RecordItemIndex(11))
            Keyboard.Up(Keys.Oem1, 39, False)
            Delay.Milliseconds(260)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '//'.", new RecordItemIndex(12))
            Keyboard.Press("//")
            Delay.Milliseconds(1170)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'NumPad1' Press.", new RecordItemIndex(13))
            Keyboard.Press(Keys.NumPad1, 79, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'NumPad0' Press.", new RecordItemIndex(14))
            Keyboard.Press(Keys.NumPad0, 82, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(110)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Decimal' Press.", new RecordItemIndex(15))
            Keyboard.Press(Keys.Decimal, 83, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(140)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'NumPad2' Press.", new RecordItemIndex(16))
            Keyboard.Press(Keys.NumPad2, 80, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(210)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{NumPad0}{NumPad0}'.", new RecordItemIndex(17))
            Keyboard.Press("{NumPad0}{NumPad0}")
            Delay.Milliseconds(150)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Decimal' Press.", new RecordItemIndex(18))
            Keyboard.Press(Keys.Decimal, 83, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(1940)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'NumPad2' Press.", new RecordItemIndex(19))
            Keyboard.Press(Keys.NumPad2, 80, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'NumPad0' Press.", new RecordItemIndex(20))
            Keyboard.Press(Keys.NumPad0, 82, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(140)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Decimal' Press.", new RecordItemIndex(21))
            Keyboard.Press(Keys.Decimal, 83, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(270)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{NumPad4}{NumPad1}'.", new RecordItemIndex(22))
            Keyboard.Press("{NumPad4}{NumPad1}")
            Delay.Milliseconds(230)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Decimal' Press.", new RecordItemIndex(23))
            Keyboard.Press(Keys.Decimal, 83, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(300)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'NumPad7' Press.", new RecordItemIndex(24))
            Keyboard.Press(Keys.NumPad7, 71, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(220)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'NumPad6' Press.", new RecordItemIndex(25))
            Keyboard.Press(Keys.NumPad6, 77, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(550)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+RShiftKey' Down.", new RecordItemIndex(26))
            Keyboard.Down(Keys.RShiftKey, 54, False)
            Delay.Milliseconds(700)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+Oem1' Down.", new RecordItemIndex(27))
            Keyboard.Down(Keys.Oem1, 39, False)
            Delay.Milliseconds(60)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'RShiftKey' Up.", new RecordItemIndex(28))
            Keyboard.Up(Keys.RShiftKey, 54, False)
            Delay.Milliseconds(70)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Oem1' Up.", new RecordItemIndex(29))
            Keyboard.Up(Keys.Oem1, 39, False)
            Delay.Milliseconds(730)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'NumPad8' Press.", new RecordItemIndex(30))
            Keyboard.Press(Keys.NumPad8, 72, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(360)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'NumPad8' Press.", new RecordItemIndex(31))
            Keyboard.Press(Keys.NumPad8, 72, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(160)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'NumPad8' Press.", new RecordItemIndex(32))
            Keyboard.Press(Keys.NumPad8, 72, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(300)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'NumPad0' Press.", new RecordItemIndex(33))
            Keyboard.Press(Keys.NumPad0, 82, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(740)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'OemQuestion' Press.", new RecordItemIndex(34))
            Keyboard.Press(Keys.OemQuestion, 53, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(250)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'I' Press.", new RecordItemIndex(35))
            Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(70)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'C' Press.", new RecordItemIndex(36))
            Keyboard.Press(Keys.C, 46, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(110)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'E' Press.", new RecordItemIndex(37))
            Keyboard.Press(Keys.E, 18, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(240)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+LShiftKey' Down.", new RecordItemIndex(38))
            Keyboard.Down(Keys.LShiftKey, 42, False)
            Delay.Milliseconds(170)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Shift+F' Down.", new RecordItemIndex(39))
            Keyboard.Down(Keys.F, 33, False)
            Delay.Milliseconds(70)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'LShiftKey' Up.", new RecordItemIndex(40))
            Keyboard.Up(Keys.LShiftKey, 42, False)
            Delay.Milliseconds(40)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'F' Up.", new RecordItemIndex(41))
            Keyboard.Up(Keys.F, 33, False)
            Delay.Milliseconds(370)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'I' Press.", new RecordItemIndex(42))
            Keyboard.Press(Keys.I, 23, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(80)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'S' Press.", new RecordItemIndex(43))
            Keyboard.Press(Keys.S, 31, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(140)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'H' Press.", new RecordItemIndex(44))
            Keyboard.Press(Keys.H, 35, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(580)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'Enter' Press.", new RecordItemIndex(45))
            Keyboard.Press(Keys.Return, 28, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(970)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.FlexObjectIceFish.ContainerMainArea' at 505;5.", repo.WebDocumentIceFish.FlexObjectIceFish.ContainerMainAreaInfo, new RecordItemIndex(46))
            repo.WebDocumentIceFish.FlexObjectIceFish.ContainerMainArea.Click("505;5", 100)
            Delay.Milliseconds(1820)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'F11' Press.", new RecordItemIndex(47))
            Keyboard.Press(Keys.F11, 87, Keyboard.DefaultKeyPressTime, 1, False)
            Delay.Milliseconds(1180)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace
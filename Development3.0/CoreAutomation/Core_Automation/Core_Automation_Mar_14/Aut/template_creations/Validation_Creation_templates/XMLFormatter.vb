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
    ''' The XMLFormatter recording.
    ''' </summary>
    <TestModule("e19714e9-8f68-4c37-9978-a87f1485a5c3", ModuleType.Recording, 1)> _
    Partial Public Class XMLFormatter
        Implements ITestModule

        ''' <summary>
        ''' Holds an instance of the FormattersRepository repository.
        ''' </summary>
        Public Shared repo as FormattersRepository = FormattersRepository.Instance

        Shared _instance as XMLFormatter = new XMLFormatter()

        ''' <summary>
        ''' Constructs a new instance.
        ''' </summary>
        Sub New()
        End Sub

        ''' <summary>
        ''' Gets a static instance of this recording.
        ''' </summary>
        Public Shared ReadOnly Property Instance As XMLFormatter
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

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.PictureIcon_49' at 4;19.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.PictureIcon_49Info, new RecordItemIndex(0))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.PictureIcon_49.MoveTo("4;19", 1000)
            Mouse.ButtonDown(MouseButtons.Left)
            Delay.Milliseconds(170)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_41_76_8888.ContainerHBox.ContainerGraphCanvas' at 204;166.", repo.WebDocument10_200_41_76_8888.ContainerHBox.ContainerGraphCanvasInfo, new RecordItemIndex(1))
            repo.WebDocument10_200_41_76_8888.ContainerHBox.ContainerGraphCanvas.MoveTo("204;166", 891)
            Mouse.ButtonUp(MouseButtons.Left)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.PictureIcon_49_155127' at 34;23.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.PictureIcon_49_155127Info, new RecordItemIndex(2))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.PictureIcon_49_155127.Click(MouseButtons.Right, "34;23", 1000)
            Delay.Milliseconds(120)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 18;5.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(3))
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("18;5", 209)
            Delay.Milliseconds(0)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId4'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId4Info, new RecordItemIndex(4))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId4Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Id='serviceId') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId4'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId4Info, new RecordItemIndex(5))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId4Info, "Id", "serviceId")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Type='TextInput') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId4'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId4Info, new RecordItemIndex(6))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId4Info, "Type", "TextInput")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput10'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput10Info, new RecordItemIndex(7))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput10Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Attributes') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextAttributes1'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextAttributes1Info, new RecordItemIndex(8))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextAttributes1Info, "Text", "Attributes")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='XPath') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextXPath'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextXPathInfo, new RecordItemIndex(9))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextXPathInfo, "Text", "XPath")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput11'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput11Info, new RecordItemIndex(10))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput11Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_021'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_021Info, new RecordItemIndex(11))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_021Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput12'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput12Info, new RecordItemIndex(12))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput12Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_121'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_121Info, new RecordItemIndex(13))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_121Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput13'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput13Info, new RecordItemIndex(14))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput13Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_221'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_221Info, new RecordItemIndex(15))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_221Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput14'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput14Info, new RecordItemIndex(16))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput14Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_321'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_321Info, new RecordItemIndex(17))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_321Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput15'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput15Info, new RecordItemIndex(18))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput15Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_421'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_421Info, new RecordItemIndex(19))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_421Info, "Text", "")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Save') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave1'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave1Info, new RecordItemIndex(20))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave1Info, "Text", "Save")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Cancel') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonCancel'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonCancelInfo, new RecordItemIndex(21))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonCancelInfo, "Text", "Cancel")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Load template...') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(22))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___Info, "Text", "Load template...")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Save as Template...') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave_as_Template___'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(23))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave_as_Template___Info, "Text", "Save as Template...")
            Delay.Milliseconds(100)
                        
            Report.Log(ReportLevel.Info, "Validation", "Validating AttributeEqual (Text='Configure Error Handler...') on item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonConfigure_Error_Handler_'.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonConfigure_Error_Handler_Info, new RecordItemIndex(24))
            Validate.Attribute(repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonConfigure_Error_Handler_Info, "Text", "Configure Error Handler...")
            Delay.Milliseconds(710)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId4' at 54;13.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId4Info, new RecordItemIndex(25))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId4.Click("54;13")
            Delay.Milliseconds(1740)
                        
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'ser'.", new RecordItemIndex(26))
            Keyboard.Press("ser")
            Delay.Milliseconds(2700)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput10' at 46;8.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput10Info, new RecordItemIndex(27))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput10.Click("46;8")
            Delay.Milliseconds(900)
                        
            getSchemaname()
            Delay.Milliseconds(3420)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput11' at 27;0.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput11Info, new RecordItemIndex(29))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput11.Click("27;0")
            Delay.Milliseconds(1010)
                        
            getAttr1()
            Delay.Milliseconds(1180)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput12' at 54;14.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput12Info, new RecordItemIndex(31))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput12.Click("54;14")
            Delay.Milliseconds(850)
                        
            getAttr2()
            Delay.Milliseconds(920)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput13' at 50;9.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput13Info, new RecordItemIndex(33))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput13.Click("50;9")
            Delay.Milliseconds(680)
                        
            getAttr3()
            Delay.Milliseconds(980)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput14' at 38;15.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput14Info, new RecordItemIndex(35))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput14.Click("38;15")
            Delay.Milliseconds(650)
                        
            getAttr4()
            Delay.Milliseconds(490)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput15' at 36;9.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput15Info, new RecordItemIndex(37))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput15.Click("36;9")
            Delay.Milliseconds(660)
                        
            getAttr5()
            Delay.Milliseconds(950)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_022' at 27;5.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_022Info, new RecordItemIndex(39))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_022.Click("27;5")
            Delay.Milliseconds(980)
                        
            getXpath1()
            Delay.Milliseconds(1030)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_122' at 32;11.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_122Info, new RecordItemIndex(41))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_122.Click("32;11")
            Delay.Milliseconds(1010)
                        
            getXpath2()
            Delay.Milliseconds(1060)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_222' at 43;4.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_222Info, new RecordItemIndex(43))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_222.Click("43;4")
            Delay.Milliseconds(820)
                        
            getXpath3()
            Delay.Milliseconds(1030)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_322' at 45;15.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_322Info, new RecordItemIndex(45))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_322.Click("45;15")
            Delay.Milliseconds(800)
                        
            getXpath4()
            Delay.Milliseconds(1230)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_422' at 32;4.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_422Info, new RecordItemIndex(47))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.Text_422.Click("32;4")
            Delay.Milliseconds(730)
                        
            getXpath5()
            Delay.Milliseconds(2820)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave_as_Template___' at 119;14.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave_as_Template___Info, new RecordItemIndex(49))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave_as_Template___.Click("119;14")
            Delay.Milliseconds(1040)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput6' at 51;17.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput6Info, new RecordItemIndex(50))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTextInput6.Click("51;17")
            Delay.Milliseconds(550)
                        
            getTempName_XMLFormater()
            Delay.Milliseconds(2310)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave' at 15;11.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(52))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave.Click("15;11")
            Delay.Milliseconds(1230)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonOK' at 20;12.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(53))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonOK.Click("20;12")
            Delay.Milliseconds(580)
                        
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave1' at 40;1.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave1Info, new RecordItemIndex(54))
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave1.Click("40;1")
            Delay.Milliseconds(820)
                        
        End Sub

#Region "Image Feature Data"
#End Region

    End Class

End Namespace

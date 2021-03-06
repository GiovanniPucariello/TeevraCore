///////////////////////////////////////////////////////////////////////////////
//
// This file was automatically generated by RANOREX.
// DO NOT MODIFY THIS FILE! It is regenerated by the designer.
// All your modifications will be lost!
// http://www.ranorex.com
//
///////////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Text;
using System.Text.RegularExpressions;
using System.Drawing;
using System.Threading;
using System.Windows.Forms;

using Ranorex;
using Ranorex.Core;
using Ranorex.Core.Testing;

namespace Finetuned
{
    /// <summary>
    /// The Process_TFP_TEDI_file_23 recording.
    /// </summary>
    [TestModule("f02ebb3b-8645-4112-995c-bc4ed5eb7b69", ModuleType.Recording, 1)]
    public partial class Process_TFP_TEDI_file_23 : ITestModule
    {
        /// <summary>
        /// Holds an instance of the PS_TFP_TEDI_23 repository.
        /// </summary>
        public static PS_TFP_TEDI_23 repo = PS_TFP_TEDI_23.Instance;

        static Process_TFP_TEDI_file_23 instance = new Process_TFP_TEDI_file_23();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public Process_TFP_TEDI_file_23()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static Process_TFP_TEDI_file_23 Instance
        {
            get { return instance; }
        }

#region Variables

#endregion

        /// <summary>
        /// Starts the replay of the static recording <see cref="Instance"/>.
        /// </summary>
        [System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.2")]
        public static void Start()
        {
            TestModuleRunner.Run(Instance);
        }

        /// <summary>
        /// Performs the playback of actions in this recording.
        /// </summary>
        /// <remarks>You should not call this method directly, instead pass the module
        /// instance to the <see cref="TestModuleRunner.Run(ITestModule)"/> method
        /// that will in turn invoke this method.</remarks>
        [System.CodeDom.Compiler.GeneratedCode("Ranorex", "3.0.2")]
        void ITestModule.Run()
        {
            Mouse.DefaultMoveTime = 300;
            Keyboard.DefaultKeyPressTime = 100;
            Delay.SpeedFactor = 1.0;

            Init();

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints' at 56;8.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpointsInfo, new RecordItemIndex(0));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints.Click("56;8", 2300);
            Delay.Milliseconds(2760);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_45' at 11;11.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_45Info, new RecordItemIndex(1));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_45.MoveTo("11;11", 2300);
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(980);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 195;162.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(2));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("195;162", 2300);
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(4370);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonServices' at 94;6.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonServicesInfo, new RecordItemIndex(3));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonServices.Click("94;6", 2300);
            Delay.Milliseconds(980);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_44' at 10;12.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_44Info, new RecordItemIndex(4));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_44.MoveTo("10;12", 2300);
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1160);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 503;167.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(5));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("503;167", 2300);
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(4350);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints' at 63;8.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpointsInfo, new RecordItemIndex(6));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonEndpoints.Click("63;8", 2300);
            Delay.Milliseconds(830);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_3' at 11;10.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_3Info, new RecordItemIndex(7));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureIcon_3.MoveTo("11;10", 2300);
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(2690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas' at 811;146.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvasInfo, new RecordItemIndex(8));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas.MoveTo("811;146", 2300);
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(2070);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRouters' at 111;7.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRoutersInfo, new RecordItemIndex(9));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.ButtonRouters.Click("111;7");
            Delay.Milliseconds(4180);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 10;6.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(10));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("10;6");
            Delay.Milliseconds(3040);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_45_146123' at 27;24.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_45_146123Info, new RecordItemIndex(11));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_45_146123.MoveTo("27;24");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(2190);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_44_454128' at 20;19.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_44_454128Info, new RecordItemIndex(12));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_44_454128.MoveTo("20;19");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(3090);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine' at 8;7.", repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(13));
            repo.WebDocumentLocalhost_8082.ContainerComponent_Palette.PictureLine.Click("8;7");
            Delay.Milliseconds(1490);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_44_454128' at 23;24.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_44_454128Info, new RecordItemIndex(14));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_44_454128.MoveTo("23;24");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1760);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_762107' at 16;28.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_762107Info, new RecordItemIndex(15));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_762107.MoveTo("16;28");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(4540);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_Reporting' at 79;12.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_ReportingInfo, new RecordItemIndex(16));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageError_Reporting.Click("79;12");
            Delay.Milliseconds(1710);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButton' at 138;6.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButtonInfo, new RecordItemIndex(17));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonButton.Click("138;6");
            Delay.Milliseconds(1270);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporter' at 92;5.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporterInfo, new RecordItemIndex(18));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMS_ErrReporter.Click("92;5");
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigure' at 20;8.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigureInfo, new RecordItemIndex(19));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.ButtonConfigure.Click("20;8");
            Delay.Milliseconds(3320);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 68;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(20));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("68;9");
            Delay.Milliseconds(2620);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInput' at 60;8.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInputInfo, new RecordItemIndex(21));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInput.Click("60;8");
            Delay.Milliseconds(1690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporter' at 52;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporterInfo, new RecordItemIndex(22));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextJMSErrReporter.Click("52;9");
            Delay.Milliseconds(1480);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 23;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(23));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("23;10");
            Delay.Milliseconds(2510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId' at 19;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceIdInfo, new RecordItemIndex(24));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId.Click("19;10");
            Delay.Milliseconds(1040);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'jmserr' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceIdInfo, new RecordItemIndex(25));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId.PressKeys("jmserr");
            Delay.Milliseconds(3570);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 41;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(26));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("41;11");
            Delay.Milliseconds(3120);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_Properties' at 103;12.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_PropertiesInfo, new RecordItemIndex(27));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TabPageProcess_Properties.Click("103;12");
            Delay.Milliseconds(3040);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_45_146123' at 23;29.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_45_146123Info, new RecordItemIndex(28));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_45_146123.Click(MouseButtons.Right, "23;29");
            Delay.Milliseconds(1410);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 18;3.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(29));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("18;3");
            Delay.Milliseconds(3410);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 102;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(30));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("102;9");
            Delay.Milliseconds(1300);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInput' at 43;3.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInputInfo, new RecordItemIndex(31));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInput.Click("43;3");
            Delay.Milliseconds(930);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextTFP_Source' at 25;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTFP_SourceInfo, new RecordItemIndex(32));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTFP_Source.Click("25;6");
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 32;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(33));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("32;10");
            Delay.Milliseconds(1350);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1' at 14;10.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(34));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.Click("14;10");
            Delay.Milliseconds(940);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{LShiftKey down}TFP{LShiftKey up}' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1Info, new RecordItemIndex(35));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId1.PressKeys("{LShiftKey down}TFP{LShiftKey up}");
            Delay.Milliseconds(2350);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 22;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(36));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("22;9");
            Delay.Milliseconds(1710);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_44_454128' at 32;25.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_44_454128Info, new RecordItemIndex(37));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_44_454128.Click(MouseButtons.Right, "32;25");
            Delay.Milliseconds(1120);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 8;4.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(38));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("8;4");
            Delay.Milliseconds(1350);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2' at 120;7.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(39));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.Click("120;7");
            Delay.Milliseconds(870);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'tedi' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2Info, new RecordItemIndex(40));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId2.PressKeys("tedi");
            Delay.Milliseconds(2590);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 36;12.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(41));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("36;12");
            Delay.Milliseconds(2080);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_762107' at 26;34.", repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_762107Info, new RecordItemIndex(42));
            repo.WebDocumentLocalhost_8082.ContainerGraphCanvas1.PictureIcon_3_762107.Click(MouseButtons.Right, "26;34");
            Delay.Milliseconds(1350);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 4;3.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(43));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("4;3");
            Delay.Milliseconds(1440);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___' at 91;12.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___Info, new RecordItemIndex(44));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad_template___.Click("91;12");
            Delay.Milliseconds(1120);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInput' at 68;3.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInputInfo, new RecordItemIndex(45));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextTextInput.Click("68;3");
            Delay.Milliseconds(1100);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextDestinationfile' at 31;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextDestinationfileInfo, new RecordItemIndex(46));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextDestinationfile.Click("31;9");
            Delay.Milliseconds(690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad' at 39;6.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoadInfo, new RecordItemIndex(47));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonLoad.Click("39;6");
            Delay.Milliseconds(1160);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3' at 10;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3Info, new RecordItemIndex(48));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3.Click("10;9");
            Delay.Milliseconds(740);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'dest' with focus on 'WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3'.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3Info, new RecordItemIndex(49));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.TextServiceId3.PressKeys("dest");
            Delay.Milliseconds(2530);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave' at 14;5.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSaveInfo, new RecordItemIndex(50));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave.Click("14;5");
            Delay.Milliseconds(1970);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText' at 234;16.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(51));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.Click("234;16");
            Delay.Milliseconds(1710);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'file{LShiftKey down}{_ down}{LShiftKey up}' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(52));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("file{LShiftKey down}{_ down}{LShiftKey up}");
            Delay.Milliseconds(2280);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{- up}' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(53));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("{- up}");
            Delay.Milliseconds(440);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '23' with focus on 'WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText'.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameTextInfo, new RecordItemIndex(54));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.TextNameText.PressKeys("23");
            Delay.Milliseconds(2510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecovery' at 5;9.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecoveryInfo, new RecordItemIndex(55));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxRecovery.Click("5;9");
            Delay.Milliseconds(520);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLog' at 6;9.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLogInfo, new RecordItemIndex(56));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxPrcsEvntLog.Click("6;9");
            Delay.Milliseconds(330);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLog' at 7;8.", repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLogInfo, new RecordItemIndex(57));
            repo.WebDocumentLocalhost_8082.ContainerTabNavigator.CheckBoxMsgEvntLog.Click("7;8");
            Delay.Milliseconds(5820);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1' at 31;5.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1Info, new RecordItemIndex(58));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonSave1.Click("31;5");
            Delay.Milliseconds(1850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK' at 24;9.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOKInfo, new RecordItemIndex(59));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK.Click("24;9");
            Delay.Milliseconds(1510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublish' at 25;11.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublishInfo, new RecordItemIndex(60));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonPublish.Click("25;11");
            Delay.Milliseconds(2050);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1' at 41;13.", repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1Info, new RecordItemIndex(61));
            repo.WebDocumentLocalhost_8082.FlexObjectTeevra.ButtonOK1.Click("41;13");
            Delay.Milliseconds(820);
            
        }

#region Image Feature Data
#endregion
    }
}

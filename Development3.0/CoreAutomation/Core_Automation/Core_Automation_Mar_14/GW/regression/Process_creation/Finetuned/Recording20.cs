﻿///////////////////////////////////////////////////////////////////////////////
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
    /// The Recording20 recording.
    /// </summary>
    [TestModule("42602206-dc1f-42e3-96ff-ae74ce4fd97e", ModuleType.Recording, 1)]
    public partial class Recording20 : ITestModule
    {
        /// <summary>
        /// Holds an instance of the project20Repository repository.
        /// </summary>
        public static project20Repository repo = project20Repository.Instance;

        static Recording20 instance = new Recording20();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public Recording20()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static Recording20 Instance
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

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonEndpoints' at 62;9.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonEndpointsInfo, new RecordItemIndex(0));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonEndpoints.Click("62;9");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_3' at 6;12.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_3Info, new RecordItemIndex(1));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_3.MoveTo("6;12");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(840);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas' at 103;59.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvasInfo, new RecordItemIndex(2));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas.MoveTo("103;59");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1260);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key 'F11' Press.", new RecordItemIndex(3));
            Keyboard.Press(Keys.F11, 87, Keyboard.DefaultKeyPressTime, 1, false);
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonParsers' at 90;10.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonParsersInfo, new RecordItemIndex(4));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonParsers.Click("90;10");
            Delay.Milliseconds(1870);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_6' at 7;13.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_6Info, new RecordItemIndex(5));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_6.MoveTo("7;13");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1040);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas' at 109;170.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvasInfo, new RecordItemIndex(6));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas.MoveTo("109;170");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonFormatters' at 92;5.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonFormattersInfo, new RecordItemIndex(7));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonFormatters.Click("92;5");
            Delay.Milliseconds(1900);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_9' at 10;12.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_9Info, new RecordItemIndex(8));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_9.MoveTo("10;12");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas' at 402;151.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvasInfo, new RecordItemIndex(9));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas.MoveTo("402;151");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(2040);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonServices' at 66;12.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonServicesInfo, new RecordItemIndex(10));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonServices.Click("66;12");
            Delay.Milliseconds(1490);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_12' at 6;12.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_12Info, new RecordItemIndex(11));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_12.MoveTo("6;12");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1120);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas' at 234;137.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvasInfo, new RecordItemIndex(12));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas.MoveTo("234;137");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(2020);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonEndpoints' at 68;4.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonEndpointsInfo, new RecordItemIndex(13));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonEndpoints.Click("68;4");
            Delay.Milliseconds(1940);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_3' at 7;8.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_3Info, new RecordItemIndex(14));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureIcon_3.MoveTo("7;8");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1520);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas' at 545;114.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvasInfo, new RecordItemIndex(15));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas.MoveTo("545;114");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(2700);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonRouters' at 76;6.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonRoutersInfo, new RecordItemIndex(16));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.ButtonRouters.Click("76;6");
            Delay.Milliseconds(2120);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureLine' at 14;9.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(17));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureLine.Click("14;9");
            Delay.Milliseconds(1050);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_3_5420' at 26;32.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_3_5420Info, new RecordItemIndex(18));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_3_5420.MoveTo("26;32");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1050);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_6_60131' at 20;14.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_6_60131Info, new RecordItemIndex(19));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_6_60131.MoveTo("20;14");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureLine' at 18;8.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(20));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureLine.Click("18;8");
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_6_60131' at 25;16.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_6_60131Info, new RecordItemIndex(21));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_6_60131.MoveTo("25;16");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1300);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_12_18598' at 17;36.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_12_18598Info, new RecordItemIndex(22));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_12_18598.MoveTo("17;36");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1370);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureLine' at 11;8.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(23));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureLine.Click("11;8");
            Delay.Milliseconds(1160);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_12_18598' at 25;34.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_12_18598Info, new RecordItemIndex(24));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_12_18598.MoveTo("25;34");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(900);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_9_353112' at 15;28.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_9_353112Info, new RecordItemIndex(25));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_9_353112.MoveTo("15;28");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1350);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureLine' at 14;7.", repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureLineInfo, new RecordItemIndex(26));
            repo.WebDocument10_200_41_76_8888.ContainerComponent_Palette.PictureLine.Click("14;7");
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Down item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_9_353112' at 25;20.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_9_353112Info, new RecordItemIndex(27));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_9_353112.MoveTo("25;20");
            Mouse.ButtonDown(MouseButtons.Left);
            Delay.Milliseconds(1240);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Up item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_3_49675' at 20;30.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_3_49675Info, new RecordItemIndex(28));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_3_49675.MoveTo("20;30");
            Mouse.ButtonUp(MouseButtons.Left);
            Delay.Milliseconds(1480);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_3_5420' at 14;17.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_3_5420Info, new RecordItemIndex(29));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_3_5420.Click(MouseButtons.Right, "14;17");
            Delay.Milliseconds(910);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 10;8.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(30));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("10;8");
            Delay.Milliseconds(1180);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___' at 35;11.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(31));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___.Click("35;11");
            Delay.Milliseconds(1120);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton' at UpperLeft.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(32));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton.Click(Location.UpperLeft);
            Delay.Milliseconds(1070);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextSourcefile' at UpperLeft.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextSourcefileInfo, new RecordItemIndex(33));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextSourcefile.Click(Location.UpperLeft);
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(34));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad.Click();
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId' at 54;11.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(35));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId.Click("54;11");
            Delay.Milliseconds(520);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'source'.", new RecordItemIndex(36));
            Keyboard.Press("source");
            Delay.Milliseconds(1940);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave' at 38;17.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(37));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave.Click("38;17");
            Delay.Milliseconds(790);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_6_60131' at 15;23.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_6_60131Info, new RecordItemIndex(38));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_6_60131.Click(MouseButtons.Right, "15;23");
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 16;6.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(39));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("16;6");
            Delay.Milliseconds(800);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(40));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___.Click();
            Delay.Milliseconds(760);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton' at UpperLeft.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(41));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton.Click(Location.UpperLeft);
            Delay.Milliseconds(1300);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextParserfile' at UpperLeft.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextParserfileInfo, new RecordItemIndex(42));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextParserfile.Click(Location.UpperLeft);
            Delay.Milliseconds(650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad' at 32;9.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(43));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad.Click("32;9");
            Delay.Milliseconds(840);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId1' at 100;10.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId1Info, new RecordItemIndex(44));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId1.Click("100;10");
            Delay.Milliseconds(900);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'tagfor'.", new RecordItemIndex(45));
            Keyboard.Press("tagfor");
            Delay.Milliseconds(2580);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave' at 22;10.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(46));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave.Click("22;10");
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_12_18598' at 20;19.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_12_18598Info, new RecordItemIndex(47));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_12_18598.Click(MouseButtons.Right, "20;19");
            Delay.Milliseconds(880);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 16;11.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(48));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("16;11");
            Delay.Milliseconds(1020);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(49));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___.Click();
            Delay.Milliseconds(1270);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton' at UpperLeft.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(50));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton.Click(Location.UpperLeft);
            Delay.Milliseconds(2010);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTempisnull' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTempisnullInfo, new RecordItemIndex(51));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTempisnull.Click();
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(52));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad.Click();
            Delay.Milliseconds(910);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId2' at 100;17.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId2Info, new RecordItemIndex(53));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId2.Click("100;17");
            Delay.Milliseconds(2010);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'validation'.", new RecordItemIndex(54));
            Keyboard.Press("validation");
            Delay.Milliseconds(2420);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(55));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave.Click();
            Delay.Milliseconds(990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_9_353112' at 20;22.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_9_353112Info, new RecordItemIndex(56));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_9_353112.Click(MouseButtons.Right, "20;22");
            Delay.Milliseconds(840);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 12;10.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(57));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("12;10");
            Delay.Milliseconds(1020);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(58));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___.Click();
            Delay.Milliseconds(1130);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton' at UpperLeft.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(59));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton.Click(Location.UpperLeft);
            Delay.Milliseconds(2340);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTagFormater' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTagFormaterInfo, new RecordItemIndex(60));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextTagFormater.Click();
            Delay.Milliseconds(650);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(61));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad.Click();
            Delay.Milliseconds(760);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId1' at 87;10.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId1Info, new RecordItemIndex(62));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId1.Click("87;10");
            Delay.Milliseconds(620);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'tagformatter'.", new RecordItemIndex(63));
            Keyboard.Press("tagformatter");
            Delay.Milliseconds(3090);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(64));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave.Click();
            Delay.Milliseconds(1510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Right Click item 'WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_3_49675' at 11;22.", repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_3_49675Info, new RecordItemIndex(65));
            repo.WebDocument10_200_41_76_8888.ContainerGraphCanvas1.PictureIcon_3_49675.Click(MouseButtons.Right, "11;22");
            Delay.Milliseconds(710);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'ContextMenuIexplore.MenuItemConfigure_Component' at 11;9.", repo.ContextMenuIexplore.MenuItemConfigure_ComponentInfo, new RecordItemIndex(66));
            repo.ContextMenuIexplore.MenuItemConfigure_Component.Click("11;9");
            Delay.Milliseconds(1270);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___' at UpperLeft.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___Info, new RecordItemIndex(67));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad_template___.Click(Location.UpperLeft);
            Delay.Milliseconds(1090);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton' at UpperLeft.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButtonInfo, new RecordItemIndex(68));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonButton.Click(Location.UpperLeft);
            Delay.Milliseconds(1990);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDestinationfile' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDestinationfileInfo, new RecordItemIndex(69));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextDestinationfile.Click();
            Delay.Milliseconds(820);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoadInfo, new RecordItemIndex(70));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonLoad.Click();
            Delay.Milliseconds(800);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceIdInfo, new RecordItemIndex(71));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextServiceId.Click();
            Delay.Milliseconds(10);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'destination'.", new RecordItemIndex(72));
            Keyboard.Press("destination");
            Delay.Milliseconds(4210);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSaveInfo, new RecordItemIndex(73));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonSave.Click();
            Delay.Milliseconds(1230);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerVBox.TextNameText' at Center.", repo.WebDocument10_200_41_76_8888.ContainerVBox.TextNameTextInfo, new RecordItemIndex(74));
            repo.WebDocument10_200_41_76_8888.ContainerVBox.TextNameText.Click();
            Delay.Milliseconds(850);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'file{RShiftKey down}'.", new RecordItemIndex(75));
            Keyboard.Press("file{RShiftKey down}");
            Delay.Milliseconds(1090);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '_{RShiftKey up}to{RShiftKey down}_{RShiftKey up}file'.", new RecordItemIndex(76));
            Keyboard.Press("_{RShiftKey up}to{RShiftKey down}_{RShiftKey up}file");
            Delay.Milliseconds(2300);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence '{RShiftKey down}_{RShiftKey up}'.", new RecordItemIndex(77));
            Keyboard.Press("{RShiftKey down}_{RShiftKey up}");
            Delay.Milliseconds(660);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'stri'.", new RecordItemIndex(78));
            Keyboard.Press("stri");
            Delay.Milliseconds(950);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'ng'.", new RecordItemIndex(79));
            Keyboard.Press("ng");
            Delay.Milliseconds(2250);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'va'.", new RecordItemIndex(80));
            Keyboard.Press("va");
            Delay.Milliseconds(1620);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'lidation'.", new RecordItemIndex(81));
            Keyboard.Press("lidation");
            Delay.Milliseconds(1120);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerVBox.TextUITextField' at Center.", repo.WebDocument10_200_41_76_8888.ContainerVBox.TextUITextFieldInfo, new RecordItemIndex(82));
            repo.WebDocument10_200_41_76_8888.ContainerVBox.TextUITextField.Click();
            Delay.Milliseconds(180);
            
            Report.Log(ReportLevel.Info, "Keyboard", "Key sequence 'test'.", new RecordItemIndex(83));
            Keyboard.Press("test");
            Delay.Milliseconds(950);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormForm.CheckBoxRecovery' at Center.", repo.WebDocument10_200_41_76_8888.FormForm.CheckBoxRecoveryInfo, new RecordItemIndex(84));
            repo.WebDocument10_200_41_76_8888.FormForm.CheckBoxRecovery.Click();
            Delay.Milliseconds(520);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormForm.CheckBoxPrcsEvntLog' at Center.", repo.WebDocument10_200_41_76_8888.FormForm.CheckBoxPrcsEvntLogInfo, new RecordItemIndex(85));
            repo.WebDocument10_200_41_76_8888.FormForm.CheckBoxPrcsEvntLog.Click();
            Delay.Milliseconds(510);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FormForm.CheckBoxMsgEvntLog' at Center.", repo.WebDocument10_200_41_76_8888.FormForm.CheckBoxMsgEvntLogInfo, new RecordItemIndex(86));
            repo.WebDocument10_200_41_76_8888.FormForm.CheckBoxMsgEvntLog.Click();
            Delay.Milliseconds(940);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerVBox.ButtonSave1' at Center.", repo.WebDocument10_200_41_76_8888.ContainerVBox.ButtonSave1Info, new RecordItemIndex(87));
            repo.WebDocument10_200_41_76_8888.ContainerVBox.ButtonSave1.Click();
            Delay.Milliseconds(1680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonOK' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonOKInfo, new RecordItemIndex(88));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonOK.Click();
            Delay.Milliseconds(980);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerVBox.ButtonPublish' at Center.", repo.WebDocument10_200_41_76_8888.ContainerVBox.ButtonPublishInfo, new RecordItemIndex(89));
            repo.WebDocument10_200_41_76_8888.ContainerVBox.ButtonPublish.Click();
            Delay.Milliseconds(1690);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonOK1' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonOK1Info, new RecordItemIndex(90));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.ButtonOK1.Click();
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.TextProcess_Modeling_' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextProcess_Modeling_Info, new RecordItemIndex(91));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.TextProcess_Modeling_.Click();
            Delay.Milliseconds(680);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.FlexObjectIceFish.MenuItemView_Process' at Center.", repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.MenuItemView_ProcessInfo, new RecordItemIndex(92));
            repo.WebDocument10_200_41_76_8888.FlexObjectIceFish.MenuItemView_Process.Click();
            Delay.Milliseconds(770);
            
            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocument10_200_41_76_8888.ContainerVBox.ButtonNew' at Center.", repo.WebDocument10_200_41_76_8888.ContainerVBox.ButtonNewInfo, new RecordItemIndex(93));
            repo.WebDocument10_200_41_76_8888.ContainerVBox.ButtonNew.Click();
            Delay.Milliseconds(790);
            
        }

#region Image Feature Data
#endregion
    }
}

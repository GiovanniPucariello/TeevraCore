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
    /// The Recording_one recording.
    /// </summary>
    [TestModule("f0fbb0e8-2516-49f4-9dbc-717a1bb46a67", ModuleType.Recording, 1)]
    public partial class Recording_one : ITestModule
    {
        /// <summary>
        /// Holds an instance of the project1Repository repository.
        /// </summary>
        public static project1Repository repo = project1Repository.Instance;

        static Recording_one instance = new Recording_one();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public Recording_one()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static Recording_one Instance
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
            Mouse.DefaultMoveTime = 100;
            Keyboard.DefaultKeyPressTime = 100;
            Delay.SpeedFactor = 3.0;

            Init();

            Report.Log(ReportLevel.Info, "Mouse", "Mouse Left Click item 'WebDocumentIceFish.ContainerVBox.ButtonEndpoints' at Center.", repo.WebDocumentIceFish.ContainerVBox.ButtonEndpointsInfo, new RecordItemIndex(0));
            repo.WebDocumentIceFish.ContainerVBox.ButtonEndpoints.Click();
            Delay.Milliseconds(790);
            
            Recording_1();
            Delay.Milliseconds(0);
            
        }

#region Image Feature Data
#endregion
    }
}
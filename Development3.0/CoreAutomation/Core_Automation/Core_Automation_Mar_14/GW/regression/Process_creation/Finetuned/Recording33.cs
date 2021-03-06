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
    /// The Recording33 recording.
    /// </summary>
    [TestModule("c5f956c4-6d97-414f-95f7-f6ab94640d42", ModuleType.Recording, 1)]
    public partial class Recording33 : ITestModule
    {
        /// <summary>
        /// Holds an instance of the project33Repository repository.
        /// </summary>
        public static project33Repository repo = project33Repository.Instance;

        static Recording33 instance = new Recording33();

        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public Recording33()
        {
        }

        /// <summary>
        /// Gets a static instance of this recording.
        /// </summary>
        public static Recording33 Instance
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
            Mouse.DefaultMoveTime = 75;
            Keyboard.DefaultKeyPressTime = 100;
            Delay.SpeedFactor = 4.0;

            Init();

            RECORD33();
            Delay.Milliseconds(0);
            
        }

#region Image Feature Data
#endregion
    }
}

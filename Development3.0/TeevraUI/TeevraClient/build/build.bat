@REM ------------------------------------------------------------------------------------------------
@REM Teevra Flex Client build script
@REM 
@REM ------------------------------------------------------------------------------------------------

@ echo on

set ANT_OPTS=-Xms256m -Xmx512m
rem  -XX:+UseParallelGC
rem set ANT_OPTS=-Xmx1024m -Xms1024m -XX:+UseConcMarkSweepGC

@REM ------------------------------------------------------------------------------------------------
@REM Don't specify a task here so the caller can control what to execute - the build.xml specifies the default
@REM command line parameter that needs to pass is various 'target' of default build, else the 'package_ear'
@REM target will cosider as a command line parameter.
@REM ------------------------------------------------------------------------------------------------

set CLASSPATH=%CLASSPATH%;C:/Program Files/Adobe/Flex Builder 3 Plug-in/sdks/3.2.0/lib/mxmlc.jar
set task="%1"
if "%1"=="" set task="compileAll"
ant %task%

rem -logger org.apache.tools.ant.XmlLogger -v -l log.xml

echo Build completed......

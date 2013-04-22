echo on
cd ..\target\teevra.server.assembler-2.0.0-bin.dir\fusion
set CLASSPATH=%CLASSPATH%:.

java -Xdebug -Xrunjdwp:transport=dt_socket,address=8998,server=y,suspend=n -Xms128m -Xmx512m -Dorg.apache.camel.jmx.disabled=false -jar fusion-launcher-3.0.jar
cd..
cd..
cd..
cd scripts
pause
 
echo on
cd ..\target\teevra.server.assembler-2.0.0-bin.dir\fusion

java -Xms128m -Xmx512m -Dorg.apache.camel.jmx.disabled=false -Dorg.apache.camel.jmx.rmiConnector.registryPort=2001 -jar fusion-launcher-3.0.jar 
cd..
cd..
cd..
cd scripts
pause
 
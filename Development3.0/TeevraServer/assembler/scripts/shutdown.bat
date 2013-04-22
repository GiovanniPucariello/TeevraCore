echo on

cd cd ..\target\teevra.server.assembler-2.0.0-bin.dir\fusion

java -Xms128m -Xmx512m -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=8004 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -jar fusion-launcher-3.0.jar
cd..
cd..
cd..
pause
 
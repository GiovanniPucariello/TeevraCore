echo on

java -Xms128m  -Xmx1024m  -XX:PermSize=512m -Djava.library.path=${INSTALL_PATH}\lib -Dlib.dir=${INSTALL_PATH}\lib -Dconf.dir=${INSTALL_PATH}\conf -Dorg.apache.camel.jmx.disabled=false -Dorg.apache.camel.jmx.rmiConnector.registryPort=2001 -jar ${INSTALL_PATH}\lib\fusion-launcher-3.0.jar

pause
 
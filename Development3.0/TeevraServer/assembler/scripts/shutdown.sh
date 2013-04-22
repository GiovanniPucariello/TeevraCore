#!/bin/sh

cd ./target
cd fusion-builder-2.0.0-bin.dir
cd fusion

java -Dorg.apache.camel.jmx.createRmiConnector=True -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=8004 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -jar ./target/fusion-builder-0.0.1-A-bin.dir/fusion/fusion-launcher-3.0.jar


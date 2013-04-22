#!/bin/sh

cd ../lib

java -Dorg.apache.camel.jmx.createRmiConnector=True -jar fusion-launcher-3.0.jar

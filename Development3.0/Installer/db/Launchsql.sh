#!/bin/sh
echo "Execution of SQL Queries"
export INSTALL_PATH=$1
export database_type=$2
export jdbc_url=$3
export jdbc_username=$4
export jdbc_passwordLocation=$5
export euronext_selected=$6
export auth_type=$7
export fusion_passKeyLocation=$8
java -classpath "${INSTALL_PATH}/scripts/db:${INSTALL_PATH}/scripts/db/lib/ojdbc6.jar:${INSTALL_PATH}/scripts/db/lib/com.springsource.org.apache.commons.io-1.4.0.jar:${INSTALL_PATH}/scripts/db/lib/jconn3.jar:${INSTALL_PATH}/scripts/db/lib/jasypt-1.5.jar:${INSTALL_PATH}\scripts\db\lib\com.springsource.org.apache.commons.io-1.4.0.jar:${INSTALL_PATH}/scripts/db/lib/commons-codec-1.2.jar:${INSTALL_PATH}/scripts/db/lib/commons-lang-2.1.jar:${INSTALL_PATH}/scripts/db/lib/org.postgresql.jdbc3-8.3.603.jar:" DBSetup "${database_type}" "${jdbc_url}" "${jdbc_username}" "${jdbc_passwordLocation}" "${INSTALL_PATH}" "${euronext_selected}" "${auth_type}" "${fusion_passKeyLocation}"
echo "Executing DML statements"
java -classpath "${INSTALL_PATH}/scripts/db:${INSTALL_PATH}/scripts/db/lib/ojdbc6.jar:${INSTALL_PATH}/scripts/db/lib/com.springsource.org.apache.commons.io-1.4.0.jar:${INSTALL_PATH}/scripts/db/lib/jconn3.jar:${INSTALL_PATH}/scripts/db/lib/dataLoader.jar:${INSTALL_PATH}/scripts/db/lib/dom4j-1.6.1.jar:${INSTALL_PATH}/scripts/db/lib/jasypt-1.5.jar:${INSTALL_PATH}/scripts/db/lib/commons-codec-1.2.jar:${INSTALL_PATH}/scripts/db/lib/commons-lang-2.1.jar:${INSTALL_PATH}/scripts/db/lib/jaxen-1.1.jar:${INSTALL_PATH}/scripts/db/lib/jsr173_1.0_api.jar:${INSTALL_PATH}/scripts/db/lib/log4j-1.2.15.jar:${INSTALL_PATH}/scripts/db/lib/ooxml-schemas-1.0.jar:${INSTALL_PATH}/scripts/db/lib/openxml4j-bin-beta.jar:${INSTALL_PATH}/scripts/db/lib/org.postgresql.jdbc3-8.3.603.jar:${INSTALL_PATH}/scripts/db/lib/poi-3.5-beta3-20080926.jar:${INSTALL_PATH}/scripts/db/lib/poi-contrib-3.5-beta3-20080926.jar:${INSTALL_PATH}\scripts\db\lib\com.springsource.org.apache.commons.io-1.4.0.jar:${INSTALL_PATH}/scripts/db/lib/poi-jdk14-3.5-beta3-20080926.jar:${INSTALL_PATH}/scripts/db/lib/poi-ooxml-3.5-beta3-20080926.jar:${INSTALL_PATH}/scripts/db/lib/poi-scratchpad-3.5-beta3-20080926.jar:${INSTALL_PATH}/scripts/db/lib/resolver.jar:${INSTALL_PATH}/scripts/db/lib/xbean.jar:${INSTALL_PATH}/scripts/db/lib/xbean_xpath.jar:${INSTALL_PATH}/scripts/db/lib/xmlbeans-qname.jar:${INSTALL_PATH}/scripts/db/lib/xmlpublic.jar:${INSTALL_PATH}/scripts/db/lib/xmlunit1.0.jar" com.hs.stridehub.config.loader.DataLoader "${INSTALL_PATH}/scripts/db/lib/tables.xlsx" "${database_type}" "${jdbc_url}" "${jdbc_username}" "${jdbc_passwordLocation}"  "${fusion.passKeyLocation}"

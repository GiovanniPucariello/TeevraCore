//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.03 at 03:05:55 PM EST 
//


package com.tfp.properties;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JMSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JMSType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="queue"/>
 *     &lt;enumeration value="topic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JMSType")
@XmlEnum
public enum JMSType {

    @XmlEnumValue("queue")
    QUEUE("queue"),
    @XmlEnumValue("topic")
    TOPIC("topic");
    private final String value;

    JMSType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JMSType fromValue(String v) {
        for (JMSType c: JMSType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

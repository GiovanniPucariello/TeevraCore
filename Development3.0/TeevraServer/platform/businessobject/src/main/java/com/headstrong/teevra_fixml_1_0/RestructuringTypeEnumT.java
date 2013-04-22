
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestructuringType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RestructuringType_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="XR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RestructuringType_enum_t")
@XmlEnum
public enum RestructuringTypeEnumT {

    FR,
    MR,
    MM,
    XR;

    public String value() {
        return name();
    }

    public static RestructuringTypeEnumT fromValue(String v) {
        return valueOf(v);
    }

}

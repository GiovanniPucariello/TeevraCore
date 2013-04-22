
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Seniority_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Seniority_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Seniority_enum_t")
@XmlEnum
public enum SeniorityEnumT {

    SD,
    SR,
    SB;

    public String value() {
        return name();
    }

    public static SeniorityEnumT fromValue(String v) {
        return valueOf(v);
    }

}

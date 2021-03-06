
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeskType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeskType_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="PF"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeskType_enum_t")
@XmlEnum
public enum DeskTypeEnumT {

    A,
    AR,
    D,
    IN,
    IS,
    O,
    PF,
    PR,
    PT,
    S,
    T;

    public String value() {
        return name();
    }

    public static DeskTypeEnumT fromValue(String v) {
        return valueOf(v);
    }

}


package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InViewOfCommon_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InViewOfCommon_enum_t">
 *   &lt;restriction base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Boolean">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InViewOfCommon_enum_t")
@XmlEnum
public enum InViewOfCommonEnumT {

    N,
    Y;

    public String value() {
        return name();
    }

    public static InViewOfCommonEnumT fromValue(String v) {
        return valueOf(v);
    }

}

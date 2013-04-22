
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingCashType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingCashType_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIXED"/>
 *     &lt;enumeration value="DIFF"/>
 *     &lt;enumeration value="UNDPRC"/>
 *     &lt;enumeration value="XETRA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingCashType_enum_t")
@XmlEnum
public enum UnderlyingCashTypeEnumT {

    FIXED,
    DIFF,
    UNDPRC,
    XETRA;

    public String value() {
        return name();
    }

    public static UnderlyingCashTypeEnumT fromValue(String v) {
        return valueOf(v);
    }

}

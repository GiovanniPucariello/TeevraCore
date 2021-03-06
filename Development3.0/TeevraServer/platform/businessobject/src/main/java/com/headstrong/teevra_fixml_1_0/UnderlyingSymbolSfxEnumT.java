
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingSymbolSfx_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingSymbolSfx_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="WI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingSymbolSfx_enum_t")
@XmlEnum
public enum UnderlyingSymbolSfxEnumT {

    CD,
    WI;

    public String value() {
        return name();
    }

    public static UnderlyingSymbolSfxEnumT fromValue(String v) {
        return valueOf(v);
    }

}

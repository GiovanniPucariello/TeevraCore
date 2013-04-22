
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SymbolSfx_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SymbolSfx_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="WI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SymbolSfx_enum_t")
@XmlEnum
public enum SymbolSfxEnumT {

    CD,
    WI;

    public String value() {
        return name();
    }

    public static SymbolSfxEnumT fromValue(String v) {
        return valueOf(v);
    }

}

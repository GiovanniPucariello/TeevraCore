
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceQuoteMethod_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceQuoteMethod_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="INX"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="PCTPAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceQuoteMethod_enum_t")
@XmlEnum
public enum PriceQuoteMethodEnumT {

    STD,
    INX,
    INT,
    PCTPAR;

    public String value() {
        return name();
    }

    public static PriceQuoteMethodEnumT fromValue(String v) {
        return valueOf(v);
    }

}

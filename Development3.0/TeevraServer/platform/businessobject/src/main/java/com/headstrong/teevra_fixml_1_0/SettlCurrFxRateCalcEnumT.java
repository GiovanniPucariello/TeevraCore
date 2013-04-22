
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlCurrFxRateCalc_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlCurrFxRateCalc_enum_t">
 *   &lt;restriction base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}char">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SettlCurrFxRateCalc_enum_t")
@XmlEnum
public enum SettlCurrFxRateCalcEnumT {

    M,
    D;

    public String value() {
        return name();
    }

    public static SettlCurrFxRateCalcEnumT fromValue(String v) {
        return valueOf(v);
    }

}

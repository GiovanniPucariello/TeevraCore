
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingFXRateCalc_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingFXRateCalc_enum_t">
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0-SP2}char">
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingFXRateCalc_enum_t")
@XmlEnum
public enum UnderlyingFXRateCalcEnumT {

    M,
    D;

    public String value() {
        return name();
    }

    public static UnderlyingFXRateCalcEnumT fromValue(String v) {
        return valueOf(v);
    }

}

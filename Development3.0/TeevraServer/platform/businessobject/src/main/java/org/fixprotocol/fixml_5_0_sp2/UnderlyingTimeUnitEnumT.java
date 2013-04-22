
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingTimeUnit_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingTimeUnit_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="Min"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="Wk"/>
 *     &lt;enumeration value="Mo"/>
 *     &lt;enumeration value="Yr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingTimeUnit_enum_t")
@XmlEnum
public enum UnderlyingTimeUnitEnumT {

    S("S"),
    @XmlEnumValue("Min")
    MIN("Min"),
    H("H"),
    D("D"),
    @XmlEnumValue("Wk")
    WK("Wk"),
    @XmlEnumValue("Mo")
    MO("Mo"),
    @XmlEnumValue("Yr")
    YR("Yr");
    private final String value;

    UnderlyingTimeUnitEnumT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnderlyingTimeUnitEnumT fromValue(String v) {
        for (UnderlyingTimeUnitEnumT c: UnderlyingTimeUnitEnumT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

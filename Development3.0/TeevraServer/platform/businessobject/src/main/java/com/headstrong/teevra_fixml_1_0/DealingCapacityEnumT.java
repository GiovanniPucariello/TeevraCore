
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealingCapacity_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DealingCapacity_enum_t">
 *   &lt;restriction base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}char">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DealingCapacity_enum_t")
@XmlEnum
public enum DealingCapacityEnumT {

    A,
    P,
    R;

    public String value() {
        return name();
    }

    public static DealingCapacityEnumT fromValue(String v) {
        return valueOf(v);
    }

}

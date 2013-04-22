
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllocPositionEffect_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllocPositionEffect_enum_t">
 *   &lt;restriction base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}char">
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="F"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AllocPositionEffect_enum_t")
@XmlEnum
public enum AllocPositionEffectEnumT {

    O,
    C,
    R,
    F;

    public String value() {
        return name();
    }

    public static AllocPositionEffectEnumT fromValue(String v) {
        return valueOf(v);
    }

}


package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IOIQltyInd_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IOIQltyInd_enum_t">
 *   &lt;restriction base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}char">
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IOIQltyInd_enum_t")
@XmlEnum
public enum IOIQltyIndEnumT {

    H,
    L,
    M;

    public String value() {
        return name();
    }

    public static IOIQltyIndEnumT fromValue(String v) {
        return valueOf(v);
    }

}

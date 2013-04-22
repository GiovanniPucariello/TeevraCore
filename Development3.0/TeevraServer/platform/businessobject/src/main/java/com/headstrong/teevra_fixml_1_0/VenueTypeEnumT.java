
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VenueType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VenueType_enum_t">
 *   &lt;restriction base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}char">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="T"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VenueType_enum_t")
@XmlEnum
public enum VenueTypeEnumT {

    E,
    P,
    X,
    O,
    T;

    public String value() {
        return name();
    }

    public static VenueTypeEnumT fromValue(String v) {
        return valueOf(v);
    }

}

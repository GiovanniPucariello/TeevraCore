
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VenueType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VenueType_enum_t">
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0-SP2}char">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="X"/>
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
    X;

    public String value() {
        return name();
    }

    public static VenueTypeEnumT fromValue(String v) {
        return valueOf(v);
    }

}

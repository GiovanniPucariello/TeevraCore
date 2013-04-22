
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvSide_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdvSide_enum_t">
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0-SP2}char">
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdvSide_enum_t")
@XmlEnum
public enum AdvSideEnumT {

    B,
    S,
    T,
    X;

    public String value() {
        return name();
    }

    public static AdvSideEnumT fromValue(String v) {
        return valueOf(v);
    }

}

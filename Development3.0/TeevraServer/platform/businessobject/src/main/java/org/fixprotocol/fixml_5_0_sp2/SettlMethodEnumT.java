
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlMethod_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlMethod_enum_t">
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0-SP2}char">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SettlMethod_enum_t")
@XmlEnum
public enum SettlMethodEnumT {

    C,
    P,
    A,
    E;

    public String value() {
        return name();
    }

    public static SettlMethodEnumT fromValue(String v) {
        return valueOf(v);
    }

}

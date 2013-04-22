
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlSessID_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlSessID_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ITD"/>
 *     &lt;enumeration value="RTH"/>
 *     &lt;enumeration value="ETH"/>
 *     &lt;enumeration value="EOD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SettlSessID_enum_t")
@XmlEnum
public enum SettlSessIDEnumT {

    ITD,
    RTH,
    ETH,
    EOD;

    public String value() {
        return name();
    }

    public static SettlSessIDEnumT fromValue(String v) {
        return valueOf(v);
    }

}

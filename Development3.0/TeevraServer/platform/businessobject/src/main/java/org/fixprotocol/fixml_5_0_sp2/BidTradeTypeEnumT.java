
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidTradeType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidTradeType_enum_t">
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0-SP2}char">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="J"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BidTradeType_enum_t")
@XmlEnum
public enum BidTradeTypeEnumT {

    A,
    G,
    J,
    R;

    public String value() {
        return name();
    }

    public static BidTradeTypeEnumT fromValue(String v) {
        return valueOf(v);
    }

}

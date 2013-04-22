
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotifyBrokerOfCredit_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotifyBrokerOfCredit_enum_t">
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Boolean">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotifyBrokerOfCredit_enum_t")
@XmlEnum
public enum NotifyBrokerOfCreditEnumT {

    N,
    Y;

    public String value() {
        return name();
    }

    public static NotifyBrokerOfCreditEnumT fromValue(String v) {
        return valueOf(v);
    }

}

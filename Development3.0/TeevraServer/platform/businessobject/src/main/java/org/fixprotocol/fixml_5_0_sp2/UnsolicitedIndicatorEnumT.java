
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnsolicitedIndicator_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnsolicitedIndicator_enum_t">
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Boolean">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnsolicitedIndicator_enum_t")
@XmlEnum
public enum UnsolicitedIndicatorEnumT {

    N,
    Y;

    public String value() {
        return name();
    }

    public static UnsolicitedIndicatorEnumT fromValue(String v) {
        return valueOf(v);
    }

}

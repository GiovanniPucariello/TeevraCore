
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviouslyReported_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreviouslyReported_enum_t">
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Boolean">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreviouslyReported_enum_t")
@XmlEnum
public enum PreviouslyReportedEnumT {

    N,
    Y;

    public String value() {
        return name();
    }

    public static PreviouslyReportedEnumT fromValue(String v) {
        return valueOf(v);
    }

}

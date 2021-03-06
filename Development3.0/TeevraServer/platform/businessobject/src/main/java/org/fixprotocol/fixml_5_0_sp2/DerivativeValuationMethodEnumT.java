
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativeValuationMethod_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DerivativeValuationMethod_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQTY"/>
 *     &lt;enumeration value="FUT"/>
 *     &lt;enumeration value="FUTDA"/>
 *     &lt;enumeration value="CDS"/>
 *     &lt;enumeration value="CDSD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DerivativeValuationMethod_enum_t")
@XmlEnum
public enum DerivativeValuationMethodEnumT {

    EQTY,
    FUT,
    FUTDA,
    CDS,
    CDSD;

    public String value() {
        return name();
    }

    public static DerivativeValuationMethodEnumT fromValue(String v) {
        return valueOf(v);
    }

}


package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteQualifier_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuoteQualifier_enum_t">
 *   &lt;restriction base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}char">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="Q"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="Z"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuoteQualifier_enum_t")
@XmlEnum
public enum QuoteQualifierEnumT {

    A,
    B,
    C,
    D,
    I,
    L,
    M,
    O,
    P,
    Q,
    R,
    S,
    T,
    V,
    W,
    X,
    Y,
    Z;

    public String value() {
        return name();
    }

    public static QuoteQualifierEnumT fromValue(String v) {
        return valueOf(v);
    }

}

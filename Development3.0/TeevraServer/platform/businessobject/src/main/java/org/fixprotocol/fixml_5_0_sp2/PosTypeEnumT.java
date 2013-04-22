
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PosType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PosType_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALC"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="ASF"/>
 *     &lt;enumeration value="DLV"/>
 *     &lt;enumeration value="ETR"/>
 *     &lt;enumeration value="EX"/>
 *     &lt;enumeration value="FIN"/>
 *     &lt;enumeration value="IAS"/>
 *     &lt;enumeration value="IES"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PIT"/>
 *     &lt;enumeration value="SOD"/>
 *     &lt;enumeration value="SPL"/>
 *     &lt;enumeration value="TA"/>
 *     &lt;enumeration value="TOT"/>
 *     &lt;enumeration value="TQ"/>
 *     &lt;enumeration value="TRF"/>
 *     &lt;enumeration value="TX"/>
 *     &lt;enumeration value="XM"/>
 *     &lt;enumeration value="RCV"/>
 *     &lt;enumeration value="CAA"/>
 *     &lt;enumeration value="DN"/>
 *     &lt;enumeration value="EP"/>
 *     &lt;enumeration value="PNTN"/>
 *     &lt;enumeration value="DLT"/>
 *     &lt;enumeration value="CEA"/>
 *     &lt;enumeration value="SEA"/>
 *     &lt;enumeration value="MDL"/>
 *     &lt;enumeration value="ADL"/>
 *     &lt;enumeration value="MSL"/>
 *     &lt;enumeration value="ASL"/>
 *     &lt;enumeration value="LXL"/>
 *     &lt;enumeration value="TRFI"/>
 *     &lt;enumeration value="TRFO"/>
 *     &lt;enumeration value="CMAR"/>
 *     &lt;enumeration value="ABDN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PosType_enum_t")
@XmlEnum
public enum PosTypeEnumT {

    ALC,
    AS,
    ASF,
    DLV,
    ETR,
    EX,
    FIN,
    IAS,
    IES,
    PA,
    PIT,
    SOD,
    SPL,
    TA,
    TOT,
    TQ,
    TRF,
    TX,
    XM,
    RCV,
    CAA,
    DN,
    EP,
    PNTN,
    DLT,
    CEA,
    SEA,
    MDL,
    ADL,
    MSL,
    ASL,
    LXL,
    TRFI,
    TRFO,
    CMAR,
    ABDN;

    public String value() {
        return name();
    }

    public static PosTypeEnumT fromValue(String v) {
        return valueOf(v);
    }

}

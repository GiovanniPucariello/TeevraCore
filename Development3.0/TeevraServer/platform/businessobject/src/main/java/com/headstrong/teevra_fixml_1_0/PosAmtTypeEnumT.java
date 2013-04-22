
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PosAmtType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PosAmtType_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="CRES"/>
 *     &lt;enumeration value="FMTM"/>
 *     &lt;enumeration value="IMTM"/>
 *     &lt;enumeration value="PREM"/>
 *     &lt;enumeration value="SMTM"/>
 *     &lt;enumeration value="TVAR"/>
 *     &lt;enumeration value="VADJ"/>
 *     &lt;enumeration value="SETL"/>
 *     &lt;enumeration value="ICPN"/>
 *     &lt;enumeration value="ACPN"/>
 *     &lt;enumeration value="CPN"/>
 *     &lt;enumeration value="IACPN"/>
 *     &lt;enumeration value="CMTM"/>
 *     &lt;enumeration value="ICMTM"/>
 *     &lt;enumeration value="DLV"/>
 *     &lt;enumeration value="BANK"/>
 *     &lt;enumeration value="COLAT"/>
 *     &lt;enumeration value="TRNFEE"/>
 *     &lt;enumeration value="TRNVARMGN"/>
 *     &lt;enumeration value="CMAR"/>
 *     &lt;enumeration value="ITM"/>
 *     &lt;enumeration value="INVC"/>
 *     &lt;enumeration value="PTRF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PosAmtType_enum_t")
@XmlEnum
public enum PosAmtTypeEnumT {

    CASH,
    CRES,
    FMTM,
    IMTM,
    PREM,
    SMTM,
    TVAR,
    VADJ,
    SETL,
    ICPN,
    ACPN,
    CPN,
    IACPN,
    CMTM,
    ICMTM,
    DLV,
    BANK,
    COLAT,
    TRNFEE,
    TRNVARMGN,
    CMAR,
    ITM,
    INVC,
    PTRF;

    public String value() {
        return name();
    }

    public static PosAmtTypeEnumT fromValue(String v) {
        return valueOf(v);
    }

}

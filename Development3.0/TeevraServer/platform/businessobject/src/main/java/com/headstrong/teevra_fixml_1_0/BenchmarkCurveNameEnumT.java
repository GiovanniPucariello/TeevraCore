
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BenchmarkCurveName_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BenchmarkCurveName_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EONIA"/>
 *     &lt;enumeration value="EUREPO"/>
 *     &lt;enumeration value="Euribor"/>
 *     &lt;enumeration value="FutureSWAP"/>
 *     &lt;enumeration value="LIBID"/>
 *     &lt;enumeration value="LIBOR"/>
 *     &lt;enumeration value="MuniAAA"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="Pfandbriefe"/>
 *     &lt;enumeration value="SONIA"/>
 *     &lt;enumeration value="SWAP"/>
 *     &lt;enumeration value="Treasury"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BenchmarkCurveName_enum_t")
@XmlEnum
public enum BenchmarkCurveNameEnumT {

    EONIA("EONIA"),
    EUREPO("EUREPO"),
    @XmlEnumValue("Euribor")
    EURIBOR("Euribor"),
    @XmlEnumValue("FutureSWAP")
    FUTURE_SWAP("FutureSWAP"),
    LIBID("LIBID"),
    LIBOR("LIBOR"),
    @XmlEnumValue("MuniAAA")
    MUNI_AAA("MuniAAA"),
    OTHER("OTHER"),
    @XmlEnumValue("Pfandbriefe")
    PFANDBRIEFE("Pfandbriefe"),
    SONIA("SONIA"),
    SWAP("SWAP"),
    @XmlEnumValue("Treasury")
    TREASURY("Treasury");
    private final String value;

    BenchmarkCurveNameEnumT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BenchmarkCurveNameEnumT fromValue(String v) {
        for (BenchmarkCurveNameEnumT c: BenchmarkCurveNameEnumT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
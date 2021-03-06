
package com.headstrong.teevra_fixml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivativePriceUnitOfMeasure_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DerivativePriceUnitOfMeasure_enum_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MWh"/>
 *     &lt;enumeration value="MMBtu"/>
 *     &lt;enumeration value="Bbl"/>
 *     &lt;enumeration value="Gal"/>
 *     &lt;enumeration value="t"/>
 *     &lt;enumeration value="tn"/>
 *     &lt;enumeration value="MMbbl"/>
 *     &lt;enumeration value="lbs"/>
 *     &lt;enumeration value="oz_tr"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="Bcf"/>
 *     &lt;enumeration value="Bu"/>
 *     &lt;enumeration value="Alw"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DerivativePriceUnitOfMeasure_enum_t")
@XmlEnum
public enum DerivativePriceUnitOfMeasureEnumT {

    @XmlEnumValue("MWh")
    M_WH("MWh"),
    @XmlEnumValue("MMBtu")
    MM_BTU("MMBtu"),
    @XmlEnumValue("Bbl")
    BBL("Bbl"),
    @XmlEnumValue("Gal")
    GAL("Gal"),
    @XmlEnumValue("t")
    T("t"),
    @XmlEnumValue("tn")
    TN("tn"),
    @XmlEnumValue("MMbbl")
    M_MBBL("MMbbl"),
    @XmlEnumValue("lbs")
    LBS("lbs"),
    @XmlEnumValue("oz_tr")
    OZ_TR("oz_tr"),
    USD("USD"),
    @XmlEnumValue("Bcf")
    BCF("Bcf"),
    @XmlEnumValue("Bu")
    BU("Bu"),
    @XmlEnumValue("Alw")
    ALW("Alw");
    private final String value;

    DerivativePriceUnitOfMeasureEnumT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DerivativePriceUnitOfMeasureEnumT fromValue(String v) {
        for (DerivativePriceUnitOfMeasureEnumT c: DerivativePriceUnitOfMeasureEnumT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

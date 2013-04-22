
package com.headstrong.teevra_fixml_1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketDataFeedTypes_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketDataFeedTypes_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}MarketDataFeedTypesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}MarketDataFeedTypesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketDataFeedTypes_Block_t")
public class MarketDataFeedTypesBlockT {

    @XmlAttribute(name = "MDFeedTyp")
    protected String mdFeedTyp;
    @XmlAttribute(name = "MktDepth")
    protected BigInteger mktDepth;
    @XmlAttribute(name = "MDBkTyp")
    protected BigInteger mdBkTyp;

    /**
     * Gets the value of the mdFeedTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDFeedTyp() {
        return mdFeedTyp;
    }

    /**
     * Sets the value of the mdFeedTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDFeedTyp(String value) {
        this.mdFeedTyp = value;
    }

    /**
     * Gets the value of the mktDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMktDepth() {
        return mktDepth;
    }

    /**
     * Sets the value of the mktDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMktDepth(BigInteger value) {
        this.mktDepth = value;
    }

    /**
     * Gets the value of the mdBkTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMDBkTyp() {
        return mdBkTyp;
    }

    /**
     * Sets the value of the mdBkTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMDBkTyp(BigInteger value) {
        this.mdBkTyp = value;
    }

}

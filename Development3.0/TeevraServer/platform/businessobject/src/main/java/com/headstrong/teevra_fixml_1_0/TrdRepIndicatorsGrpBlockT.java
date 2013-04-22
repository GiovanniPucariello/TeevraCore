
package com.headstrong.teevra_fixml_1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrdRepIndicatorsGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrdRepIndicatorsGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}TrdRepIndicatorsGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}TrdRepIndicatorsGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrdRepIndicatorsGrp_Block_t")
public class TrdRepIndicatorsGrpBlockT {

    @XmlAttribute(name = "PtyRole")
    protected BigInteger ptyRole;
    @XmlAttribute(name = "TrdRepInd")
    protected String trdRepInd;

    /**
     * Gets the value of the ptyRole property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPtyRole() {
        return ptyRole;
    }

    /**
     * Sets the value of the ptyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPtyRole(BigInteger value) {
        this.ptyRole = value;
    }

    /**
     * Gets the value of the trdRepInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdRepInd() {
        return trdRepInd;
    }

    /**
     * Sets the value of the trdRepInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdRepInd(String value) {
        this.trdRepInd = value;
    }

}

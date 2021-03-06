
package com.headstrong.teevra_fixml_1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompIDStatGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompIDStatGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}CompIDStatGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}CompIDStatGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompIDStatGrp_Block_t")
public class CompIDStatGrpBlockT {

    @XmlAttribute(name = "RefCompID")
    protected String refCompID;
    @XmlAttribute(name = "RefSubID")
    protected String refSubID;
    @XmlAttribute(name = "LctnID")
    protected String lctnID;
    @XmlAttribute(name = "DeskID")
    protected String deskID;
    @XmlAttribute(name = "StatValu")
    protected BigInteger statValu;
    @XmlAttribute(name = "StatText")
    protected String statText;

    /**
     * Gets the value of the refCompID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefCompID() {
        return refCompID;
    }

    /**
     * Sets the value of the refCompID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefCompID(String value) {
        this.refCompID = value;
    }

    /**
     * Gets the value of the refSubID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefSubID() {
        return refSubID;
    }

    /**
     * Sets the value of the refSubID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefSubID(String value) {
        this.refSubID = value;
    }

    /**
     * Gets the value of the lctnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnID() {
        return lctnID;
    }

    /**
     * Sets the value of the lctnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLctnID(String value) {
        this.lctnID = value;
    }

    /**
     * Gets the value of the deskID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeskID() {
        return deskID;
    }

    /**
     * Sets the value of the deskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeskID(String value) {
        this.deskID = value;
    }

    /**
     * Gets the value of the statValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatValu() {
        return statValu;
    }

    /**
     * Sets the value of the statValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatValu(BigInteger value) {
        this.statValu = value;
    }

    /**
     * Gets the value of the statText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatText() {
        return statText;
    }

    /**
     * Sets the value of the statText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatText(String value) {
        this.statText = value;
    }

}

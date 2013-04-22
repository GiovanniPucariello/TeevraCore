
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplIDReportGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplIDReportGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ApplIDReportGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ApplIDReportGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplIDReportGrp_Block_t")
public class ApplIDReportGrpBlockT {

    @XmlAttribute(name = "RefApplID")
    protected String refApplID;
    @XmlAttribute(name = "ApplNewSeqNum")
    protected BigInteger applNewSeqNum;
    @XmlAttribute(name = "RefApplLastSeqNum")
    protected BigInteger refApplLastSeqNum;

    /**
     * Gets the value of the refApplID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefApplID() {
        return refApplID;
    }

    /**
     * Sets the value of the refApplID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefApplID(String value) {
        this.refApplID = value;
    }

    /**
     * Gets the value of the applNewSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplNewSeqNum() {
        return applNewSeqNum;
    }

    /**
     * Sets the value of the applNewSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplNewSeqNum(BigInteger value) {
        this.applNewSeqNum = value;
    }

    /**
     * Gets the value of the refApplLastSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefApplLastSeqNum() {
        return refApplLastSeqNum;
    }

    /**
     * Sets the value of the refApplLastSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefApplLastSeqNum(BigInteger value) {
        this.refApplLastSeqNum = value;
    }

}

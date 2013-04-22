
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplIDRequestGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplIDRequestGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ApplIDRequestGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ApplIDRequestGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplIDRequestGrp_Block_t", propOrder = {
    "pty"
})
public class ApplIDRequestGrpBlockT {

    @XmlElement(name = "Pty")
    protected List<NestedPartiesBlockT> pty;
    @XmlAttribute(name = "RefApplID")
    protected String refApplID;
    @XmlAttribute(name = "RefID")
    protected String refID;
    @XmlAttribute(name = "ApplBegSeqNum")
    protected BigInteger applBegSeqNum;
    @XmlAttribute(name = "ApplEndSeq")
    protected BigInteger applEndSeq;

    /**
     * Gets the value of the pty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NestedPartiesBlockT }
     * 
     * 
     */
    public List<NestedPartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<NestedPartiesBlockT>();
        }
        return this.pty;
    }

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
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefID(String value) {
        this.refID = value;
    }

    /**
     * Gets the value of the applBegSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplBegSeqNum() {
        return applBegSeqNum;
    }

    /**
     * Sets the value of the applBegSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplBegSeqNum(BigInteger value) {
        this.applBegSeqNum = value;
    }

    /**
     * Gets the value of the applEndSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplEndSeq() {
        return applEndSeq;
    }

    /**
     * Sets the value of the applEndSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplEndSeq(BigInteger value) {
        this.applEndSeq = value;
    }

}

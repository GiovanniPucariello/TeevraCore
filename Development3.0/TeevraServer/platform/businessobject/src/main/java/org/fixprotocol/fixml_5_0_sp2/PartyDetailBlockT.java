
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
 * <p>Java class for PartyDetail_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyDetail_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PartyDetailElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PartyDetailAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyDetail_Block_t", propOrder = {
    "sub",
    "altPty",
    "cntxtPty",
    "riskLmt"
})
public class PartyDetailBlockT {

    @XmlElement(name = "Sub")
    protected List<PtysSubGrpBlockT> sub;
    @XmlElement(name = "AltPty")
    protected List<PartyAltIDsBlockT> altPty;
    @XmlElement(name = "CntxtPty")
    protected List<ContextPartiesBlockT> cntxtPty;
    @XmlElement(name = "RiskLmt")
    protected List<RiskLimitsBlockT> riskLmt;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Src")
    protected String src;
    @XmlAttribute(name = "R")
    protected BigInteger r;

    /**
     * Gets the value of the sub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PtysSubGrpBlockT }
     * 
     * 
     */
    public List<PtysSubGrpBlockT> getSub() {
        if (sub == null) {
            sub = new ArrayList<PtysSubGrpBlockT>();
        }
        return this.sub;
    }

    /**
     * Gets the value of the altPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAltIDsBlockT }
     * 
     * 
     */
    public List<PartyAltIDsBlockT> getAltPty() {
        if (altPty == null) {
            altPty = new ArrayList<PartyAltIDsBlockT>();
        }
        return this.altPty;
    }

    /**
     * Gets the value of the cntxtPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cntxtPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCntxtPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextPartiesBlockT }
     * 
     * 
     */
    public List<ContextPartiesBlockT> getCntxtPty() {
        if (cntxtPty == null) {
            cntxtPty = new ArrayList<ContextPartiesBlockT>();
        }
        return this.cntxtPty;
    }

    /**
     * Gets the value of the riskLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riskLmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiskLmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskLimitsBlockT }
     * 
     * 
     */
    public List<RiskLimitsBlockT> getRiskLmt() {
        if (riskLmt == null) {
            riskLmt = new ArrayList<RiskLimitsBlockT>();
        }
        return this.riskLmt;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrc(String value) {
        this.src = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setR(BigInteger value) {
        this.r = value;
    }

}


package com.headstrong.teevra_fixml_1_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrdAllocGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrdAllocGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}TrdAllocGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}TrdAllocGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrdAllocGrp_Block_t", propOrder = {
    "pty"
})
public class TrdAllocGrpBlockT {

    @XmlElement(name = "Pty")
    protected List<NestedParties2BlockT> pty;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "ActIDSrc")
    protected BigInteger actIDSrc;
    @XmlAttribute(name = "AllocSettlCcy")
    protected String allocSettlCcy;
    @XmlAttribute(name = "IndAllocID")
    protected String indAllocID;
    @XmlAttribute(name = "Qty")
    protected BigDecimal qty;
    @XmlAttribute(name = "CustCpcty")
    protected String custCpcty;
    @XmlAttribute(name = "Meth")
    protected BigInteger meth;
    @XmlAttribute(name = "IndAllocID2")
    protected String indAllocID2;
    @XmlAttribute(name = "ClrFeeInd")
    protected String clrFeeInd;
    @XmlAttribute(name = "ReqQty")
    protected BigInteger reqQty;

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
     * {@link NestedParties2BlockT }
     * 
     * 
     */
    public List<NestedParties2BlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<NestedParties2BlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcct(String value) {
        this.acct = value;
    }

    /**
     * Gets the value of the actIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActIDSrc() {
        return actIDSrc;
    }

    /**
     * Sets the value of the actIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActIDSrc(BigInteger value) {
        this.actIDSrc = value;
    }

    /**
     * Gets the value of the allocSettlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocSettlCcy() {
        return allocSettlCcy;
    }

    /**
     * Sets the value of the allocSettlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocSettlCcy(String value) {
        this.allocSettlCcy = value;
    }

    /**
     * Gets the value of the indAllocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAllocID() {
        return indAllocID;
    }

    /**
     * Sets the value of the indAllocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAllocID(String value) {
        this.indAllocID = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the custCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCpcty() {
        return custCpcty;
    }

    /**
     * Sets the value of the custCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCpcty(String value) {
        this.custCpcty = value;
    }

    /**
     * Gets the value of the meth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeth() {
        return meth;
    }

    /**
     * Sets the value of the meth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeth(BigInteger value) {
        this.meth = value;
    }

    /**
     * Gets the value of the indAllocID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAllocID2() {
        return indAllocID2;
    }

    /**
     * Sets the value of the indAllocID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAllocID2(String value) {
        this.indAllocID2 = value;
    }

    /**
     * Gets the value of the clrFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrFeeInd() {
        return clrFeeInd;
    }

    /**
     * Sets the value of the clrFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClrFeeInd(String value) {
        this.clrFeeInd = value;
    }

    /**
     * Gets the value of the reqQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReqQty() {
        return reqQty;
    }

    /**
     * Sets the value of the reqQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReqQty(BigInteger value) {
        this.reqQty = value;
    }

}

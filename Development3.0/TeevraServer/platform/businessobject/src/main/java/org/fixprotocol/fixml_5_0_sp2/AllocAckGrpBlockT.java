
package org.fixprotocol.fixml_5_0_sp2;

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
 * <p>Java class for AllocAckGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllocAckGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AllocAckGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AllocAckGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocAckGrp_Block_t", propOrder = {
    "pty"
})
public class AllocAckGrpBlockT {

    @XmlElement(name = "Pty")
    protected List<NestedPartiesBlockT> pty;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "ActIDSrc")
    protected BigInteger actIDSrc;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "AllocPosEfct")
    protected AllocPositionEffectEnumT allocPosEfct;
    @XmlAttribute(name = "IndAllocID")
    protected String indAllocID;
    @XmlAttribute(name = "IndAllocRejCode")
    protected BigInteger indAllocRejCode;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncAllocTextLen")
    protected BigInteger encAllocTextLen;
    @XmlAttribute(name = "EncAllocText")
    protected String encAllocText;
    @XmlAttribute(name = "IndAllocID2")
    protected String indAllocID2;
    @XmlAttribute(name = "CustCpcty")
    protected String custCpcty;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "Qty")
    protected BigDecimal qty;

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
     * Gets the value of the px property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPx() {
        return px;
    }

    /**
     * Sets the value of the px property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPx(BigDecimal value) {
        this.px = value;
    }

    /**
     * Gets the value of the allocPosEfct property.
     * 
     * @return
     *     possible object is
     *     {@link AllocPositionEffectEnumT }
     *     
     */
    public AllocPositionEffectEnumT getAllocPosEfct() {
        return allocPosEfct;
    }

    /**
     * Sets the value of the allocPosEfct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocPositionEffectEnumT }
     *     
     */
    public void setAllocPosEfct(AllocPositionEffectEnumT value) {
        this.allocPosEfct = value;
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
     * Gets the value of the indAllocRejCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndAllocRejCode() {
        return indAllocRejCode;
    }

    /**
     * Sets the value of the indAllocRejCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndAllocRejCode(BigInteger value) {
        this.indAllocRejCode = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
    }

    /**
     * Gets the value of the encAllocTextLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncAllocTextLen() {
        return encAllocTextLen;
    }

    /**
     * Sets the value of the encAllocTextLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncAllocTextLen(BigInteger value) {
        this.encAllocTextLen = value;
    }

    /**
     * Gets the value of the encAllocText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncAllocText() {
        return encAllocText;
    }

    /**
     * Sets the value of the encAllocText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncAllocText(String value) {
        this.encAllocText = value;
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
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTyp(BigInteger value) {
        this.typ = value;
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

}

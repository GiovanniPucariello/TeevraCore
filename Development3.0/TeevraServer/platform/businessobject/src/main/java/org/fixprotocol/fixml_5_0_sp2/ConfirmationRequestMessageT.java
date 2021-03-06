
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ConfirmationRequest can be found in Volume5 of the specification 
 * 
 * <p>Java class for ConfirmationRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmationRequest_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ConfirmationRequestElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ConfirmationRequestAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationRequest_message_t", propOrder = {
    "ordAlloc"
})
public class ConfirmationRequestMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "OrdAlloc")
    protected List<OrdAllocGrpBlockT> ordAlloc;
    @XmlAttribute(name = "CnfmReqID")
    protected String cnfmReqID;
    @XmlAttribute(name = "CnfmTyp")
    protected BigInteger cnfmTyp;
    @XmlAttribute(name = "AllocID")
    protected String allocID;
    @XmlAttribute(name = "AllocID2")
    protected String allocID2;
    @XmlAttribute(name = "IndAllocID")
    protected String indAllocID;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "ActIDSrc")
    protected BigInteger actIDSrc;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

    /**
     * Gets the value of the ordAlloc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordAlloc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdAlloc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdAllocGrpBlockT }
     * 
     * 
     */
    public List<OrdAllocGrpBlockT> getOrdAlloc() {
        if (ordAlloc == null) {
            ordAlloc = new ArrayList<OrdAllocGrpBlockT>();
        }
        return this.ordAlloc;
    }

    /**
     * Gets the value of the cnfmReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfmReqID() {
        return cnfmReqID;
    }

    /**
     * Sets the value of the cnfmReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfmReqID(String value) {
        this.cnfmReqID = value;
    }

    /**
     * Gets the value of the cnfmTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCnfmTyp() {
        return cnfmTyp;
    }

    /**
     * Sets the value of the cnfmTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCnfmTyp(BigInteger value) {
        this.cnfmTyp = value;
    }

    /**
     * Gets the value of the allocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocID() {
        return allocID;
    }

    /**
     * Sets the value of the allocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocID(String value) {
        this.allocID = value;
    }

    /**
     * Gets the value of the allocID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocID2() {
        return allocID2;
    }

    /**
     * Sets the value of the allocID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocID2(String value) {
        this.allocID2 = value;
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
     * Gets the value of the txnTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxnTm() {
        return txnTm;
    }

    /**
     * Sets the value of the txnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxnTm(XMLGregorianCalendar value) {
        this.txnTm = value;
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
     * Gets the value of the acctTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcctTyp() {
        return acctTyp;
    }

    /**
     * Sets the value of the acctTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcctTyp(BigInteger value) {
        this.acctTyp = value;
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
     * Gets the value of the encTxtLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncTxtLen() {
        return encTxtLen;
    }

    /**
     * Sets the value of the encTxtLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncTxtLen(BigInteger value) {
        this.encTxtLen = value;
    }

    /**
     * Gets the value of the encTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncTxt() {
        return encTxt;
    }

    /**
     * Sets the value of the encTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncTxt(String value) {
        this.encTxt = value;
    }

}

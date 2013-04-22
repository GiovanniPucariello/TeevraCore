
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
 * SettlementInstructionRequest can be found in Volume5 of the specification 
 * 
 * <p>Java class for SettlementInstructionRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementInstructionRequest_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlementInstructionRequestElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlementInstructionRequestAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInstructionRequest_message_t", propOrder = {
    "pty"
})
public class SettlementInstructionRequestMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlAttribute(name = "SettlInstReqID")
    protected String settlInstReqID;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "ActIDSrc")
    protected BigInteger actIDSrc;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "Prod")
    protected String prod;
    @XmlAttribute(name = "SecTyp")
    protected String secTyp;
    @XmlAttribute(name = "CFI")
    protected String cfi;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "EfctvTm")
    protected XMLGregorianCalendar efctvTm;
    @XmlAttribute(name = "ExpireTm")
    protected XMLGregorianCalendar expireTm;
    @XmlAttribute(name = "LastUpdateTm")
    protected String lastUpdateTm;
    @XmlAttribute(name = "StandInstDbTyp")
    protected BigInteger standInstDbTyp;
    @XmlAttribute(name = "StandInstDbName")
    protected String standInstDbName;
    @XmlAttribute(name = "StandInstDbID")
    protected String standInstDbID;

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
     * {@link PartiesBlockT }
     * 
     * 
     */
    public List<PartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<PartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the settlInstReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlInstReqID() {
        return settlInstReqID;
    }

    /**
     * Sets the value of the settlInstReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlInstReqID(String value) {
        this.settlInstReqID = value;
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
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the prod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProd() {
        return prod;
    }

    /**
     * Sets the value of the prod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProd(String value) {
        this.prod = value;
    }

    /**
     * Gets the value of the secTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecTyp() {
        return secTyp;
    }

    /**
     * Sets the value of the secTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecTyp(String value) {
        this.secTyp = value;
    }

    /**
     * Gets the value of the cfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFI() {
        return cfi;
    }

    /**
     * Sets the value of the cfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFI(String value) {
        this.cfi = value;
    }

    /**
     * Gets the value of the settlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlCcy() {
        return settlCcy;
    }

    /**
     * Sets the value of the settlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlCcy(String value) {
        this.settlCcy = value;
    }

    /**
     * Gets the value of the efctvTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEfctvTm() {
        return efctvTm;
    }

    /**
     * Sets the value of the efctvTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEfctvTm(XMLGregorianCalendar value) {
        this.efctvTm = value;
    }

    /**
     * Gets the value of the expireTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireTm() {
        return expireTm;
    }

    /**
     * Sets the value of the expireTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireTm(XMLGregorianCalendar value) {
        this.expireTm = value;
    }

    /**
     * Gets the value of the lastUpdateTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateTm() {
        return lastUpdateTm;
    }

    /**
     * Sets the value of the lastUpdateTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateTm(String value) {
        this.lastUpdateTm = value;
    }

    /**
     * Gets the value of the standInstDbTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStandInstDbTyp() {
        return standInstDbTyp;
    }

    /**
     * Sets the value of the standInstDbTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStandInstDbTyp(BigInteger value) {
        this.standInstDbTyp = value;
    }

    /**
     * Gets the value of the standInstDbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandInstDbName() {
        return standInstDbName;
    }

    /**
     * Sets the value of the standInstDbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandInstDbName(String value) {
        this.standInstDbName = value;
    }

    /**
     * Gets the value of the standInstDbID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandInstDbID() {
        return standInstDbID;
    }

    /**
     * Sets the value of the standInstDbID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandInstDbID(String value) {
        this.standInstDbID = value;
    }

}

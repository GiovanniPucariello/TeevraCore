
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
 * DerivativeSecurityListUpdateReport can be found in Volume3 of the specification 
 * 
 * <p>Java class for DerivativeSecurityListUpdateReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivativeSecurityListUpdateReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DerivativeSecurityListUpdateReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DerivativeSecurityListUpdateReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeSecurityListUpdateReport_message_t", propOrder = {
    "applSeqCtrl",
    "undly",
    "derivSecDef",
    "relSym"
})
public class DerivativeSecurityListUpdateReportMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "Undly")
    protected UnderlyingInstrumentBlockT undly;
    @XmlElement(name = "DerivSecDef")
    protected DerivativeSecurityDefinitionBlockT derivSecDef;
    @XmlElement(name = "RelSym")
    protected List<RelSymDerivSecUpdGrpBlockT> relSym;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "RspID")
    protected String rspID;
    @XmlAttribute(name = "ReqRslt")
    protected BigInteger reqRslt;
    @XmlAttribute(name = "UpdActn")
    protected SecurityUpdateActionEnumT updActn;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "TotNoReltdSym")
    protected BigInteger totNoReltdSym;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;

    /**
     * Gets the value of the applSeqCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationSequenceControlBlockT }
     *     
     */
    public ApplicationSequenceControlBlockT getApplSeqCtrl() {
        return applSeqCtrl;
    }

    /**
     * Sets the value of the applSeqCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationSequenceControlBlockT }
     *     
     */
    public void setApplSeqCtrl(ApplicationSequenceControlBlockT value) {
        this.applSeqCtrl = value;
    }

    /**
     * Gets the value of the undly property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingInstrumentBlockT }
     *     
     */
    public UnderlyingInstrumentBlockT getUndly() {
        return undly;
    }

    /**
     * Sets the value of the undly property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingInstrumentBlockT }
     *     
     */
    public void setUndly(UnderlyingInstrumentBlockT value) {
        this.undly = value;
    }

    /**
     * Gets the value of the derivSecDef property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeSecurityDefinitionBlockT }
     *     
     */
    public DerivativeSecurityDefinitionBlockT getDerivSecDef() {
        return derivSecDef;
    }

    /**
     * Sets the value of the derivSecDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeSecurityDefinitionBlockT }
     *     
     */
    public void setDerivSecDef(DerivativeSecurityDefinitionBlockT value) {
        this.derivSecDef = value;
    }

    /**
     * Gets the value of the relSym property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relSym property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelSym().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelSymDerivSecUpdGrpBlockT }
     * 
     * 
     */
    public List<RelSymDerivSecUpdGrpBlockT> getRelSym() {
        if (relSym == null) {
            relSym = new ArrayList<RelSymDerivSecUpdGrpBlockT>();
        }
        return this.relSym;
    }

    /**
     * Gets the value of the reqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqID() {
        return reqID;
    }

    /**
     * Sets the value of the reqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqID(String value) {
        this.reqID = value;
    }

    /**
     * Gets the value of the rspID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspID() {
        return rspID;
    }

    /**
     * Sets the value of the rspID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspID(String value) {
        this.rspID = value;
    }

    /**
     * Gets the value of the reqRslt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReqRslt() {
        return reqRslt;
    }

    /**
     * Sets the value of the reqRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReqRslt(BigInteger value) {
        this.reqRslt = value;
    }

    /**
     * Gets the value of the updActn property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityUpdateActionEnumT }
     *     
     */
    public SecurityUpdateActionEnumT getUpdActn() {
        return updActn;
    }

    /**
     * Sets the value of the updActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityUpdateActionEnumT }
     *     
     */
    public void setUpdActn(SecurityUpdateActionEnumT value) {
        this.updActn = value;
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
     * Gets the value of the totNoReltdSym property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoReltdSym() {
        return totNoReltdSym;
    }

    /**
     * Sets the value of the totNoReltdSym property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoReltdSym(BigInteger value) {
        this.totNoReltdSym = value;
    }

    /**
     * Gets the value of the lastFragment property.
     * 
     * @return
     *     possible object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public LastFragmentEnumT getLastFragment() {
        return lastFragment;
    }

    /**
     * Sets the value of the lastFragment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public void setLastFragment(LastFragmentEnumT value) {
        this.lastFragment = value;
    }

}

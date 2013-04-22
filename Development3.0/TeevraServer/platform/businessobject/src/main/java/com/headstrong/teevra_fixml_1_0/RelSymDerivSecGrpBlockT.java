
package com.headstrong.teevra_fixml_1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RelSymDerivSecGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelSymDerivSecGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}RelSymDerivSecGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}RelSymDerivSecGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelSymDerivSecGrp_Block_t", propOrder = {
    "instrmt",
    "pxLmts2",
    "instrmtExt",
    "leg"
})
public class RelSymDerivSecGrpBlockT {

    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "PxLmts2")
    protected SecondaryPriceLimitsBlockT pxLmts2;
    @XmlElement(name = "InstrmtExt")
    protected InstrumentExtensionBlockT instrmtExt;
    @XmlElement(name = "Leg")
    protected InstrmtLegGrpBlockT leg;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "CorpActn")
    protected CorporateActionEnumT corpActn;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

    /**
     * Gets the value of the instrmt property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentBlockT }
     *     
     */
    public InstrumentBlockT getInstrmt() {
        return instrmt;
    }

    /**
     * Sets the value of the instrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentBlockT }
     *     
     */
    public void setInstrmt(InstrumentBlockT value) {
        this.instrmt = value;
    }

    /**
     * Gets the value of the pxLmts2 property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryPriceLimitsBlockT }
     *     
     */
    public SecondaryPriceLimitsBlockT getPxLmts2() {
        return pxLmts2;
    }

    /**
     * Sets the value of the pxLmts2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryPriceLimitsBlockT }
     *     
     */
    public void setPxLmts2(SecondaryPriceLimitsBlockT value) {
        this.pxLmts2 = value;
    }

    /**
     * Gets the value of the instrmtExt property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentExtensionBlockT }
     *     
     */
    public InstrumentExtensionBlockT getInstrmtExt() {
        return instrmtExt;
    }

    /**
     * Sets the value of the instrmtExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentExtensionBlockT }
     *     
     */
    public void setInstrmtExt(InstrumentExtensionBlockT value) {
        this.instrmtExt = value;
    }

    /**
     * Gets the value of the leg property.
     * 
     * @return
     *     possible object is
     *     {@link InstrmtLegGrpBlockT }
     *     
     */
    public InstrmtLegGrpBlockT getLeg() {
        return leg;
    }

    /**
     * Sets the value of the leg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrmtLegGrpBlockT }
     *     
     */
    public void setLeg(InstrmtLegGrpBlockT value) {
        this.leg = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the corpActn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEnumT }
     *     
     */
    public CorporateActionEnumT getCorpActn() {
        return corpActn;
    }

    /**
     * Sets the value of the corpActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEnumT }
     *     
     */
    public void setCorpActn(CorporateActionEnumT value) {
        this.corpActn = value;
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

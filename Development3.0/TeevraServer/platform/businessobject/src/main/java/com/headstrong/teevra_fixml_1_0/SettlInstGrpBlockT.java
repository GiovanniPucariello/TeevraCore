
package com.headstrong.teevra_fixml_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SettlInstGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlInstGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}SettlInstGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}SettlInstGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlInstGrp_Block_t", propOrder = {
    "pty",
    "setInstr"
})
public class SettlInstGrpBlockT {

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "SetInstr")
    protected SettlInstructionsDataBlockT setInstr;
    @XmlAttribute(name = "SettlInstID")
    protected String settlInstID;
    @XmlAttribute(name = "SettlInstTransTyp")
    protected SettlInstTransTypeEnumT settlInstTransTyp;
    @XmlAttribute(name = "SettlInstRefID")
    protected String settlInstRefID;
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
    @XmlAttribute(name = "PmtMethod")
    protected String pmtMethod;
    @XmlAttribute(name = "PmtRef")
    protected String pmtRef;
    @XmlAttribute(name = "CardHolderName")
    protected String cardHolderName;
    @XmlAttribute(name = "CardNum")
    protected String cardNum;
    @XmlAttribute(name = "CardStartDt")
    protected XMLGregorianCalendar cardStartDt;
    @XmlAttribute(name = "CardExpDt")
    protected XMLGregorianCalendar cardExpDt;
    @XmlAttribute(name = "CardIssNum")
    protected String cardIssNum;
    @XmlAttribute(name = "PmtDt")
    protected XMLGregorianCalendar pmtDt;
    @XmlAttribute(name = "PmtRemtrID")
    protected String pmtRemtrID;

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
     * Gets the value of the setInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlInstructionsDataBlockT }
     *     
     */
    public SettlInstructionsDataBlockT getSetInstr() {
        return setInstr;
    }

    /**
     * Sets the value of the setInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlInstructionsDataBlockT }
     *     
     */
    public void setSetInstr(SettlInstructionsDataBlockT value) {
        this.setInstr = value;
    }

    /**
     * Gets the value of the settlInstID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlInstID() {
        return settlInstID;
    }

    /**
     * Sets the value of the settlInstID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlInstID(String value) {
        this.settlInstID = value;
    }

    /**
     * Gets the value of the settlInstTransTyp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlInstTransTypeEnumT }
     *     
     */
    public SettlInstTransTypeEnumT getSettlInstTransTyp() {
        return settlInstTransTyp;
    }

    /**
     * Sets the value of the settlInstTransTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlInstTransTypeEnumT }
     *     
     */
    public void setSettlInstTransTyp(SettlInstTransTypeEnumT value) {
        this.settlInstTransTyp = value;
    }

    /**
     * Gets the value of the settlInstRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlInstRefID() {
        return settlInstRefID;
    }

    /**
     * Sets the value of the settlInstRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlInstRefID(String value) {
        this.settlInstRefID = value;
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
     * Gets the value of the pmtMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtMethod() {
        return pmtMethod;
    }

    /**
     * Sets the value of the pmtMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtMethod(String value) {
        this.pmtMethod = value;
    }

    /**
     * Gets the value of the pmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtRef() {
        return pmtRef;
    }

    /**
     * Sets the value of the pmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtRef(String value) {
        this.pmtRef = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the cardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * Sets the value of the cardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNum(String value) {
        this.cardNum = value;
    }

    /**
     * Gets the value of the cardStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardStartDt() {
        return cardStartDt;
    }

    /**
     * Sets the value of the cardStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardStartDt(XMLGregorianCalendar value) {
        this.cardStartDt = value;
    }

    /**
     * Gets the value of the cardExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardExpDt() {
        return cardExpDt;
    }

    /**
     * Sets the value of the cardExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardExpDt(XMLGregorianCalendar value) {
        this.cardExpDt = value;
    }

    /**
     * Gets the value of the cardIssNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssNum() {
        return cardIssNum;
    }

    /**
     * Sets the value of the cardIssNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssNum(String value) {
        this.cardIssNum = value;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPmtDt(XMLGregorianCalendar value) {
        this.pmtDt = value;
    }

    /**
     * Gets the value of the pmtRemtrID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtRemtrID() {
        return pmtRemtrID;
    }

    /**
     * Sets the value of the pmtRemtrID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtRemtrID(String value) {
        this.pmtRemtrID = value;
    }

}

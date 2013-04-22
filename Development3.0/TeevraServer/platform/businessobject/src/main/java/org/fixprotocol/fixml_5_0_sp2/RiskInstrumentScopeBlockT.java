
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RiskInstrumentScope_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskInstrumentScope_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RiskInstrumentScopeElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RiskInstrumentScopeAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskInstrumentScope_Block_t", propOrder = {
    "aid"
})
public class RiskInstrumentScopeBlockT {

    @XmlElement(name = "AID")
    protected List<RiskSecAltIDGrpBlockT> aid;
    @XmlAttribute(name = "Oper")
    protected BigInteger oper;
    @XmlAttribute(name = "Sym")
    protected String sym;
    @XmlAttribute(name = "Sfx")
    protected String sfx;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Src")
    protected String src;
    @XmlAttribute(name = "Prod")
    protected BigInteger prod;
    @XmlAttribute(name = "ProdCmplx")
    protected String prodCmplx;
    @XmlAttribute(name = "SecGrp")
    protected String secGrp;
    @XmlAttribute(name = "CFI")
    protected String cfi;
    @XmlAttribute(name = "SecTyp")
    protected String secTyp;
    @XmlAttribute(name = "SecSubTyp")
    protected String secSubTyp;
    @XmlAttribute(name = "MMY")
    protected String mmy;
    @XmlAttribute(name = "MatTm")
    protected XMLGregorianCalendar matTm;
    @XmlAttribute(name = "RstrctTyp")
    protected String rstrctTyp;
    @XmlAttribute(name = "Snrty")
    protected String snrty;
    @XmlAttribute(name = "PutCall")
    protected BigInteger putCall;
    @XmlAttribute(name = "FlexInd")
    protected String flexInd;
    @XmlAttribute(name = "CpnRt")
    protected BigDecimal cpnRt;
    @XmlAttribute(name = "Exch")
    protected String exch;
    @XmlAttribute(name = "Desc")
    protected String desc;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "Mult")
    protected BigDecimal mult;

    /**
     * Gets the value of the aid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiskSecAltIDGrpBlockT }
     * 
     * 
     */
    public List<RiskSecAltIDGrpBlockT> getAID() {
        if (aid == null) {
            aid = new ArrayList<RiskSecAltIDGrpBlockT>();
        }
        return this.aid;
    }

    /**
     * Gets the value of the oper property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOper() {
        return oper;
    }

    /**
     * Sets the value of the oper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOper(BigInteger value) {
        this.oper = value;
    }

    /**
     * Gets the value of the sym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSym() {
        return sym;
    }

    /**
     * Sets the value of the sym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSym(String value) {
        this.sym = value;
    }

    /**
     * Gets the value of the sfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfx() {
        return sfx;
    }

    /**
     * Sets the value of the sfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfx(String value) {
        this.sfx = value;
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
     * Gets the value of the prod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProd() {
        return prod;
    }

    /**
     * Sets the value of the prod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProd(BigInteger value) {
        this.prod = value;
    }

    /**
     * Gets the value of the prodCmplx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdCmplx() {
        return prodCmplx;
    }

    /**
     * Sets the value of the prodCmplx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdCmplx(String value) {
        this.prodCmplx = value;
    }

    /**
     * Gets the value of the secGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecGrp() {
        return secGrp;
    }

    /**
     * Sets the value of the secGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecGrp(String value) {
        this.secGrp = value;
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
     * Gets the value of the secSubTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecSubTyp() {
        return secSubTyp;
    }

    /**
     * Sets the value of the secSubTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecSubTyp(String value) {
        this.secSubTyp = value;
    }

    /**
     * Gets the value of the mmy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMY() {
        return mmy;
    }

    /**
     * Sets the value of the mmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMY(String value) {
        this.mmy = value;
    }

    /**
     * Gets the value of the matTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMatTm() {
        return matTm;
    }

    /**
     * Sets the value of the matTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMatTm(XMLGregorianCalendar value) {
        this.matTm = value;
    }

    /**
     * Gets the value of the rstrctTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstrctTyp() {
        return rstrctTyp;
    }

    /**
     * Sets the value of the rstrctTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstrctTyp(String value) {
        this.rstrctTyp = value;
    }

    /**
     * Gets the value of the snrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnrty() {
        return snrty;
    }

    /**
     * Sets the value of the snrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnrty(String value) {
        this.snrty = value;
    }

    /**
     * Gets the value of the putCall property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPutCall() {
        return putCall;
    }

    /**
     * Sets the value of the putCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPutCall(BigInteger value) {
        this.putCall = value;
    }

    /**
     * Gets the value of the flexInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexInd() {
        return flexInd;
    }

    /**
     * Sets the value of the flexInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexInd(String value) {
        this.flexInd = value;
    }

    /**
     * Gets the value of the cpnRt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCpnRt() {
        return cpnRt;
    }

    /**
     * Sets the value of the cpnRt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCpnRt(BigDecimal value) {
        this.cpnRt = value;
    }

    /**
     * Gets the value of the exch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExch() {
        return exch;
    }

    /**
     * Sets the value of the exch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExch(String value) {
        this.exch = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the settlTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlTyp() {
        return settlTyp;
    }

    /**
     * Sets the value of the settlTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlTyp(String value) {
        this.settlTyp = value;
    }

    /**
     * Gets the value of the mult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMult() {
        return mult;
    }

    /**
     * Sets the value of the mult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMult(BigDecimal value) {
        this.mult = value;
    }

}


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
 * <p>Java class for BaseTradingRules_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseTradingRules_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}BaseTradingRulesElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}BaseTradingRulesAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseTradingRules_Block_t", propOrder = {
    "tickRules",
    "lotTypeRules",
    "pxLmts"
})
public class BaseTradingRulesBlockT {

    @XmlElement(name = "TickRules")
    protected List<TickRulesBlockT> tickRules;
    @XmlElement(name = "LotTypeRules")
    protected List<LotTypeRulesBlockT> lotTypeRules;
    @XmlElement(name = "PxLmts")
    protected PriceLimitsBlockT pxLmts;
    @XmlAttribute(name = "ExpirationCycle")
    protected BigInteger expirationCycle;
    @XmlAttribute(name = "MinTrdVol")
    protected BigDecimal minTrdVol;
    @XmlAttribute(name = "MaxTrdVol")
    protected BigDecimal maxTrdVol;
    @XmlAttribute(name = "MxPxVar")
    protected BigDecimal mxPxVar;
    @XmlAttribute(name = "ImpldMktInd")
    protected BigInteger impldMktInd;
    @XmlAttribute(name = "TrdCcy")
    protected String trdCcy;
    @XmlAttribute(name = "RndLot")
    protected BigDecimal rndLot;
    @XmlAttribute(name = "MlegModel")
    protected BigInteger mlegModel;
    @XmlAttribute(name = "MlegPxMeth")
    protected BigInteger mlegPxMeth;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;

    /**
     * Gets the value of the tickRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tickRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTickRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TickRulesBlockT }
     * 
     * 
     */
    public List<TickRulesBlockT> getTickRules() {
        if (tickRules == null) {
            tickRules = new ArrayList<TickRulesBlockT>();
        }
        return this.tickRules;
    }

    /**
     * Gets the value of the lotTypeRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotTypeRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotTypeRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotTypeRulesBlockT }
     * 
     * 
     */
    public List<LotTypeRulesBlockT> getLotTypeRules() {
        if (lotTypeRules == null) {
            lotTypeRules = new ArrayList<LotTypeRulesBlockT>();
        }
        return this.lotTypeRules;
    }

    /**
     * Gets the value of the pxLmts property.
     * 
     * @return
     *     possible object is
     *     {@link PriceLimitsBlockT }
     *     
     */
    public PriceLimitsBlockT getPxLmts() {
        return pxLmts;
    }

    /**
     * Sets the value of the pxLmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceLimitsBlockT }
     *     
     */
    public void setPxLmts(PriceLimitsBlockT value) {
        this.pxLmts = value;
    }

    /**
     * Gets the value of the expirationCycle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpirationCycle() {
        return expirationCycle;
    }

    /**
     * Sets the value of the expirationCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpirationCycle(BigInteger value) {
        this.expirationCycle = value;
    }

    /**
     * Gets the value of the minTrdVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinTrdVol() {
        return minTrdVol;
    }

    /**
     * Sets the value of the minTrdVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinTrdVol(BigDecimal value) {
        this.minTrdVol = value;
    }

    /**
     * Gets the value of the maxTrdVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxTrdVol() {
        return maxTrdVol;
    }

    /**
     * Sets the value of the maxTrdVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxTrdVol(BigDecimal value) {
        this.maxTrdVol = value;
    }

    /**
     * Gets the value of the mxPxVar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMxPxVar() {
        return mxPxVar;
    }

    /**
     * Sets the value of the mxPxVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMxPxVar(BigDecimal value) {
        this.mxPxVar = value;
    }

    /**
     * Gets the value of the impldMktInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImpldMktInd() {
        return impldMktInd;
    }

    /**
     * Sets the value of the impldMktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setImpldMktInd(BigInteger value) {
        this.impldMktInd = value;
    }

    /**
     * Gets the value of the trdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdCcy() {
        return trdCcy;
    }

    /**
     * Sets the value of the trdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdCcy(String value) {
        this.trdCcy = value;
    }

    /**
     * Gets the value of the rndLot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRndLot() {
        return rndLot;
    }

    /**
     * Sets the value of the rndLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRndLot(BigDecimal value) {
        this.rndLot = value;
    }

    /**
     * Gets the value of the mlegModel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMlegModel() {
        return mlegModel;
    }

    /**
     * Sets the value of the mlegModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMlegModel(BigInteger value) {
        this.mlegModel = value;
    }

    /**
     * Gets the value of the mlegPxMeth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMlegPxMeth() {
        return mlegPxMeth;
    }

    /**
     * Sets the value of the mlegPxMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMlegPxMeth(BigInteger value) {
        this.mlegPxMeth = value;
    }

    /**
     * Gets the value of the pxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPxTyp() {
        return pxTyp;
    }

    /**
     * Sets the value of the pxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPxTyp(BigInteger value) {
        this.pxTyp = value;
    }

}
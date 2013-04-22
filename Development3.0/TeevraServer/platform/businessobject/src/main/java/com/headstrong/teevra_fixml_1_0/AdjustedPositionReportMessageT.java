
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * AdjustedPositionReport can be found in Volume5 of the specification 
 * 
 * <p>Java class for AdjustedPositionReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustedPositionReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}AdjustedPositionReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}AdjustedPositionReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustedPositionReport_message_t", propOrder = {
    "pty",
    "qty",
    "inst"
})
public class AdjustedPositionReportMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty", required = true)
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "Qty", required = true)
    protected List<PositionQtyBlockT> qty;
    @XmlElement(name = "Inst")
    protected List<InstrmtGrpBlockT> inst;
    @XmlAttribute(name = "RptID")
    protected String rptID;
    @XmlAttribute(name = "ReqTyp")
    protected BigInteger reqTyp;
    @XmlAttribute(name = "BizDt")
    protected XMLGregorianCalendar bizDt;
    @XmlAttribute(name = "SetSesID")
    protected SettlSessIDEnumT setSesID;
    @XmlAttribute(name = "RptRefID")
    protected String rptRefID;
    @XmlAttribute(name = "SetPx")
    protected BigDecimal setPx;
    @XmlAttribute(name = "PriSetPx")
    protected BigDecimal priSetPx;

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
     * Gets the value of the qty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionQtyBlockT }
     * 
     * 
     */
    public List<PositionQtyBlockT> getQty() {
        if (qty == null) {
            qty = new ArrayList<PositionQtyBlockT>();
        }
        return this.qty;
    }

    /**
     * Gets the value of the inst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrmtGrpBlockT }
     * 
     * 
     */
    public List<InstrmtGrpBlockT> getInst() {
        if (inst == null) {
            inst = new ArrayList<InstrmtGrpBlockT>();
        }
        return this.inst;
    }

    /**
     * Gets the value of the rptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptID() {
        return rptID;
    }

    /**
     * Sets the value of the rptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptID(String value) {
        this.rptID = value;
    }

    /**
     * Gets the value of the reqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReqTyp() {
        return reqTyp;
    }

    /**
     * Sets the value of the reqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReqTyp(BigInteger value) {
        this.reqTyp = value;
    }

    /**
     * Gets the value of the bizDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBizDt() {
        return bizDt;
    }

    /**
     * Sets the value of the bizDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBizDt(XMLGregorianCalendar value) {
        this.bizDt = value;
    }

    /**
     * Gets the value of the setSesID property.
     * 
     * @return
     *     possible object is
     *     {@link SettlSessIDEnumT }
     *     
     */
    public SettlSessIDEnumT getSetSesID() {
        return setSesID;
    }

    /**
     * Sets the value of the setSesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlSessIDEnumT }
     *     
     */
    public void setSetSesID(SettlSessIDEnumT value) {
        this.setSesID = value;
    }

    /**
     * Gets the value of the rptRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptRefID() {
        return rptRefID;
    }

    /**
     * Sets the value of the rptRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptRefID(String value) {
        this.rptRefID = value;
    }

    /**
     * Gets the value of the setPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSetPx() {
        return setPx;
    }

    /**
     * Sets the value of the setPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSetPx(BigDecimal value) {
        this.setPx = value;
    }

    /**
     * Gets the value of the priSetPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriSetPx() {
        return priSetPx;
    }

    /**
     * Sets the value of the priSetPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriSetPx(BigDecimal value) {
        this.priSetPx = value;
    }

}

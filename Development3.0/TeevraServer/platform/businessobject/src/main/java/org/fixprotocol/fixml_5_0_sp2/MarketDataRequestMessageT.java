
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * MarketDataRequest can be found in Volume3 of the specification 
 * 
 * <p>Java class for MarketDataRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketDataRequest_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDataRequestElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDataRequestAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketDataRequest_message_t", propOrder = {
    "pty",
    "req",
    "instReq",
    "trdSes"
})
public class MarketDataRequestMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "Req", required = true)
    protected List<MDReqGrpBlockT> req;
    @XmlElement(name = "InstReq", required = true)
    protected List<InstrmtMDReqGrpBlockT> instReq;
    @XmlElement(name = "TrdSes")
    protected List<TrdgSesGrpBlockT> trdSes;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "SubReqTyp")
    protected String subReqTyp;
    @XmlAttribute(name = "MktDepth")
    protected BigInteger mktDepth;
    @XmlAttribute(name = "UpdtTyp")
    protected BigInteger updtTyp;
    @XmlAttribute(name = "AggBook")
    protected AggregatedBookEnumT aggBook;
    @XmlAttribute(name = "OpenClsSettlFlag")
    protected String openClsSettlFlag;
    @XmlAttribute(name = "Scope")
    protected String scope;
    @XmlAttribute(name = "ImplctDel")
    protected MDImplicitDeleteEnumT implctDel;
    @XmlAttribute(name = "ApplQuActn")
    protected BigInteger applQuActn;
    @XmlAttribute(name = "ApplQuMax")
    protected BigInteger applQuMax;
    @XmlAttribute(name = "MDQteTyp")
    protected BigInteger mdQteTyp;

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
     * Gets the value of the req property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the req property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDReqGrpBlockT }
     * 
     * 
     */
    public List<MDReqGrpBlockT> getReq() {
        if (req == null) {
            req = new ArrayList<MDReqGrpBlockT>();
        }
        return this.req;
    }

    /**
     * Gets the value of the instReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrmtMDReqGrpBlockT }
     * 
     * 
     */
    public List<InstrmtMDReqGrpBlockT> getInstReq() {
        if (instReq == null) {
            instReq = new ArrayList<InstrmtMDReqGrpBlockT>();
        }
        return this.instReq;
    }

    /**
     * Gets the value of the trdSes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trdSes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrdSes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrdgSesGrpBlockT }
     * 
     * 
     */
    public List<TrdgSesGrpBlockT> getTrdSes() {
        if (trdSes == null) {
            trdSes = new ArrayList<TrdgSesGrpBlockT>();
        }
        return this.trdSes;
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
     * Gets the value of the subReqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubReqTyp() {
        return subReqTyp;
    }

    /**
     * Sets the value of the subReqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubReqTyp(String value) {
        this.subReqTyp = value;
    }

    /**
     * Gets the value of the mktDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMktDepth() {
        return mktDepth;
    }

    /**
     * Sets the value of the mktDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMktDepth(BigInteger value) {
        this.mktDepth = value;
    }

    /**
     * Gets the value of the updtTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpdtTyp() {
        return updtTyp;
    }

    /**
     * Sets the value of the updtTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpdtTyp(BigInteger value) {
        this.updtTyp = value;
    }

    /**
     * Gets the value of the aggBook property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatedBookEnumT }
     *     
     */
    public AggregatedBookEnumT getAggBook() {
        return aggBook;
    }

    /**
     * Sets the value of the aggBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatedBookEnumT }
     *     
     */
    public void setAggBook(AggregatedBookEnumT value) {
        this.aggBook = value;
    }

    /**
     * Gets the value of the openClsSettlFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenClsSettlFlag() {
        return openClsSettlFlag;
    }

    /**
     * Sets the value of the openClsSettlFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenClsSettlFlag(String value) {
        this.openClsSettlFlag = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the implctDel property.
     * 
     * @return
     *     possible object is
     *     {@link MDImplicitDeleteEnumT }
     *     
     */
    public MDImplicitDeleteEnumT getImplctDel() {
        return implctDel;
    }

    /**
     * Sets the value of the implctDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDImplicitDeleteEnumT }
     *     
     */
    public void setImplctDel(MDImplicitDeleteEnumT value) {
        this.implctDel = value;
    }

    /**
     * Gets the value of the applQuActn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplQuActn() {
        return applQuActn;
    }

    /**
     * Sets the value of the applQuActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplQuActn(BigInteger value) {
        this.applQuActn = value;
    }

    /**
     * Gets the value of the applQuMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplQuMax() {
        return applQuMax;
    }

    /**
     * Sets the value of the applQuMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplQuMax(BigInteger value) {
        this.applQuMax = value;
    }

    /**
     * Gets the value of the mdQteTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMDQteTyp() {
        return mdQteTyp;
    }

    /**
     * Sets the value of the mdQteTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMDQteTyp(BigInteger value) {
        this.mdQteTyp = value;
    }

}

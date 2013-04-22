
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
 * MarketDataSnapshotFullRefresh can be found in Volume3 of the specification 
 * 
 * <p>Java class for MarketDataSnapshotFullRefresh_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketDataSnapshotFullRefresh_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDataSnapshotFullRefreshElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDataSnapshotFullRefreshAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketDataSnapshotFullRefresh_message_t", propOrder = {
    "applSeqCtrl",
    "instrmt",
    "undly",
    "leg",
    "full",
    "rtg"
})
public class MarketDataSnapshotFullRefreshMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "Instrmt", required = true)
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;
    @XmlElement(name = "Full", required = true)
    protected List<MDFullGrpBlockT> full;
    @XmlElement(name = "Rtg")
    protected List<RoutingGrpBlockT> rtg;
    @XmlAttribute(name = "TotNumRpts")
    protected BigInteger totNumRpts;
    @XmlAttribute(name = "RptID")
    protected BigInteger rptID;
    @XmlAttribute(name = "BizDt")
    protected XMLGregorianCalendar bizDt;
    @XmlAttribute(name = "MDBkTyp")
    protected BigInteger mdBkTyp;
    @XmlAttribute(name = "MDSubBkTyp")
    protected BigInteger mdSubBkTyp;
    @XmlAttribute(name = "MktDepth")
    protected BigInteger mktDepth;
    @XmlAttribute(name = "MDFeedTyp")
    protected String mdFeedTyp;
    @XmlAttribute(name = "RefInd")
    protected String refInd;
    @XmlAttribute(name = "TrdDt")
    protected XMLGregorianCalendar trdDt;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "MDStrmID")
    protected String mdStrmID;
    @XmlAttribute(name = "FinclStat")
    protected String finclStat;
    @XmlAttribute(name = "CorpActn")
    protected CorporateActionEnumT corpActn;
    @XmlAttribute(name = "NetChgPrevDay")
    protected BigDecimal netChgPrevDay;
    @XmlAttribute(name = "ApplQuDepth")
    protected BigInteger applQuDepth;
    @XmlAttribute(name = "ApplQuResolution")
    protected BigInteger applQuResolution;

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
     * Gets the value of the undly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UndInstrmtGrpBlockT }
     * 
     * 
     */
    public List<UndInstrmtGrpBlockT> getUndly() {
        if (undly == null) {
            undly = new ArrayList<UndInstrmtGrpBlockT>();
        }
        return this.undly;
    }

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrmtLegGrpBlockT }
     * 
     * 
     */
    public List<InstrmtLegGrpBlockT> getLeg() {
        if (leg == null) {
            leg = new ArrayList<InstrmtLegGrpBlockT>();
        }
        return this.leg;
    }

    /**
     * Gets the value of the full property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the full property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDFullGrpBlockT }
     * 
     * 
     */
    public List<MDFullGrpBlockT> getFull() {
        if (full == null) {
            full = new ArrayList<MDFullGrpBlockT>();
        }
        return this.full;
    }

    /**
     * Gets the value of the rtg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rtg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingGrpBlockT }
     * 
     * 
     */
    public List<RoutingGrpBlockT> getRtg() {
        if (rtg == null) {
            rtg = new ArrayList<RoutingGrpBlockT>();
        }
        return this.rtg;
    }

    /**
     * Gets the value of the totNumRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNumRpts() {
        return totNumRpts;
    }

    /**
     * Sets the value of the totNumRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNumRpts(BigInteger value) {
        this.totNumRpts = value;
    }

    /**
     * Gets the value of the rptID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRptID() {
        return rptID;
    }

    /**
     * Sets the value of the rptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRptID(BigInteger value) {
        this.rptID = value;
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
     * Gets the value of the mdBkTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMDBkTyp() {
        return mdBkTyp;
    }

    /**
     * Sets the value of the mdBkTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMDBkTyp(BigInteger value) {
        this.mdBkTyp = value;
    }

    /**
     * Gets the value of the mdSubBkTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMDSubBkTyp() {
        return mdSubBkTyp;
    }

    /**
     * Sets the value of the mdSubBkTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMDSubBkTyp(BigInteger value) {
        this.mdSubBkTyp = value;
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
     * Gets the value of the mdFeedTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDFeedTyp() {
        return mdFeedTyp;
    }

    /**
     * Sets the value of the mdFeedTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDFeedTyp(String value) {
        this.mdFeedTyp = value;
    }

    /**
     * Gets the value of the refInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefInd() {
        return refInd;
    }

    /**
     * Sets the value of the refInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefInd(String value) {
        this.refInd = value;
    }

    /**
     * Gets the value of the trdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrdDt() {
        return trdDt;
    }

    /**
     * Sets the value of the trdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrdDt(XMLGregorianCalendar value) {
        this.trdDt = value;
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
     * Gets the value of the mdStrmID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDStrmID() {
        return mdStrmID;
    }

    /**
     * Sets the value of the mdStrmID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDStrmID(String value) {
        this.mdStrmID = value;
    }

    /**
     * Gets the value of the finclStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinclStat() {
        return finclStat;
    }

    /**
     * Sets the value of the finclStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinclStat(String value) {
        this.finclStat = value;
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
     * Gets the value of the netChgPrevDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetChgPrevDay() {
        return netChgPrevDay;
    }

    /**
     * Sets the value of the netChgPrevDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetChgPrevDay(BigDecimal value) {
        this.netChgPrevDay = value;
    }

    /**
     * Gets the value of the applQuDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplQuDepth() {
        return applQuDepth;
    }

    /**
     * Sets the value of the applQuDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplQuDepth(BigInteger value) {
        this.applQuDepth = value;
    }

    /**
     * Gets the value of the applQuResolution property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplQuResolution() {
        return applQuResolution;
    }

    /**
     * Sets the value of the applQuResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplQuResolution(BigInteger value) {
        this.applQuResolution = value;
    }

}

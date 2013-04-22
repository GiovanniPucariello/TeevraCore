
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * News can be found in Volume3 of the specification 
 * 
 * <p>Java class for News_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="News_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NewsElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NewsAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "News_message_t", propOrder = {
    "applSeqCtrl",
    "refs",
    "rtg",
    "inst",
    "leg",
    "undly",
    "txtLn"
})
public class NewsMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "Refs")
    protected List<NewsRefGrpBlockT> refs;
    @XmlElement(name = "Rtg")
    protected List<RoutingGrpBlockT> rtg;
    @XmlElement(name = "Inst")
    protected List<InstrmtGrpBlockT> inst;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "TxtLn", required = true)
    protected List<LinesOfTextGrpBlockT> txtLn;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "NewsCatgy")
    protected String newsCatgy;
    @XmlAttribute(name = "LangCd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String langCd;
    @XmlAttribute(name = "OrigTm")
    protected XMLGregorianCalendar origTm;
    @XmlAttribute(name = "Urgency")
    protected String urgency;
    @XmlAttribute(name = "Headline")
    protected String headline;
    @XmlAttribute(name = "EncHeadlineLen")
    protected BigInteger encHeadlineLen;
    @XmlAttribute(name = "EncHeadline")
    protected String encHeadline;
    @XmlAttribute(name = "MktID")
    protected String mktID;
    @XmlAttribute(name = "MktSegID")
    protected String mktSegID;
    @XmlAttribute(name = "URL")
    protected String url;
    @XmlAttribute(name = "RawDataLength")
    protected BigInteger rawDataLength;
    @XmlAttribute(name = "RawData")
    protected String rawData;

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
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewsRefGrpBlockT }
     * 
     * 
     */
    public List<NewsRefGrpBlockT> getRefs() {
        if (refs == null) {
            refs = new ArrayList<NewsRefGrpBlockT>();
        }
        return this.refs;
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
     * Gets the value of the txtLn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txtLn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxtLn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinesOfTextGrpBlockT }
     * 
     * 
     */
    public List<LinesOfTextGrpBlockT> getTxtLn() {
        if (txtLn == null) {
            txtLn = new ArrayList<LinesOfTextGrpBlockT>();
        }
        return this.txtLn;
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
     * Gets the value of the newsCatgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewsCatgy() {
        return newsCatgy;
    }

    /**
     * Sets the value of the newsCatgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewsCatgy(String value) {
        this.newsCatgy = value;
    }

    /**
     * Gets the value of the langCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCd() {
        return langCd;
    }

    /**
     * Sets the value of the langCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCd(String value) {
        this.langCd = value;
    }

    /**
     * Gets the value of the origTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigTm() {
        return origTm;
    }

    /**
     * Sets the value of the origTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigTm(XMLGregorianCalendar value) {
        this.origTm = value;
    }

    /**
     * Gets the value of the urgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrgency() {
        return urgency;
    }

    /**
     * Sets the value of the urgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrgency(String value) {
        this.urgency = value;
    }

    /**
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * Sets the value of the headline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadline(String value) {
        this.headline = value;
    }

    /**
     * Gets the value of the encHeadlineLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncHeadlineLen() {
        return encHeadlineLen;
    }

    /**
     * Sets the value of the encHeadlineLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncHeadlineLen(BigInteger value) {
        this.encHeadlineLen = value;
    }

    /**
     * Gets the value of the encHeadline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncHeadline() {
        return encHeadline;
    }

    /**
     * Sets the value of the encHeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncHeadline(String value) {
        this.encHeadline = value;
    }

    /**
     * Gets the value of the mktID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktID() {
        return mktID;
    }

    /**
     * Sets the value of the mktID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktID(String value) {
        this.mktID = value;
    }

    /**
     * Gets the value of the mktSegID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktSegID() {
        return mktSegID;
    }

    /**
     * Sets the value of the mktSegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktSegID(String value) {
        this.mktSegID = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the rawDataLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRawDataLength() {
        return rawDataLength;
    }

    /**
     * Sets the value of the rawDataLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRawDataLength(BigInteger value) {
        this.rawDataLength = value;
    }

    /**
     * Gets the value of the rawData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawData() {
        return rawData;
    }

    /**
     * Sets the value of the rawData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawData(String value) {
        this.rawData = value;
    }

}


package com.headstrong.teevra_fixml_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * RFQRequest can be found in Volume3 of the specification 
 * 
 * <p>Java class for RFQRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFQRequest_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}RFQRequestElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}RFQRequestAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFQRequest_message_t", propOrder = {
    "pty",
    "rfqReq"
})
public class RFQRequestMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "RFQReq", required = true)
    protected List<RFQReqGrpBlockT> rfqReq;
    @XmlAttribute(name = "RFQReqID")
    protected String rfqReqID;
    @XmlAttribute(name = "SubReqTyp")
    protected String subReqTyp;
    @XmlAttribute(name = "PrvtQt")
    protected String prvtQt;

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
     * Gets the value of the rfqReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfqReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRFQReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RFQReqGrpBlockT }
     * 
     * 
     */
    public List<RFQReqGrpBlockT> getRFQReq() {
        if (rfqReq == null) {
            rfqReq = new ArrayList<RFQReqGrpBlockT>();
        }
        return this.rfqReq;
    }

    /**
     * Gets the value of the rfqReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFQReqID() {
        return rfqReqID;
    }

    /**
     * Sets the value of the rfqReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFQReqID(String value) {
        this.rfqReqID = value;
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
     * Gets the value of the prvtQt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvtQt() {
        return prvtQt;
    }

    /**
     * Sets the value of the prvtQt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvtQt(String value) {
        this.prvtQt = value;
    }

}

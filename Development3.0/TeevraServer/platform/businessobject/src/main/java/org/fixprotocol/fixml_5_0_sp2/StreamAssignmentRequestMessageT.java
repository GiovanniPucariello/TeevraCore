
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
 * StreamAssignmentRequest can be found in Volume3 of the specification 
 * 
 * <p>Java class for StreamAssignmentRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamAssignmentRequest_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}StreamAssignmentRequestElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}StreamAssignmentRequestAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamAssignmentRequest_message_t", propOrder = {
    "reqs"
})
public class StreamAssignmentRequestMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Reqs", required = true)
    protected List<StrmAsgnReqGrpBlockT> reqs;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "AsgnReqTyp")
    protected BigInteger asgnReqTyp;

    /**
     * Gets the value of the reqs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrmAsgnReqGrpBlockT }
     * 
     * 
     */
    public List<StrmAsgnReqGrpBlockT> getReqs() {
        if (reqs == null) {
            reqs = new ArrayList<StrmAsgnReqGrpBlockT>();
        }
        return this.reqs;
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
     * Gets the value of the asgnReqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAsgnReqTyp() {
        return asgnReqTyp;
    }

    /**
     * Sets the value of the asgnReqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAsgnReqTyp(BigInteger value) {
        this.asgnReqTyp = value;
    }

}

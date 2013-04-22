
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
 * StreamAssignmentReport can be found in Volume3 of the specification 
 * 
 * <p>Java class for StreamAssignmentReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamAssignmentReport_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}StreamAssignmentReportElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}StreamAssignmentReportAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamAssignmentReport_message_t", propOrder = {
    "rpts"
})
public class StreamAssignmentReportMessageT
    extends AbstractMessageT
{

    @XmlElement(name = "Rpts")
    protected List<StrmAsgnRptGrpBlockT> rpts;
    @XmlAttribute(name = "RptID")
    protected String rptID;
    @XmlAttribute(name = "AsgnReqTyp")
    protected BigInteger asgnReqTyp;
    @XmlAttribute(name = "ReqID")
    protected String reqID;

    /**
     * Gets the value of the rpts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrmAsgnRptGrpBlockT }
     * 
     * 
     */
    public List<StrmAsgnRptGrpBlockT> getRpts() {
        if (rpts == null) {
            rpts = new ArrayList<StrmAsgnRptGrpBlockT>();
        }
        return this.rpts;
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

}

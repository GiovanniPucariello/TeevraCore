
package com.headstrong.teevra_fixml_1_0;

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
 * <p>Java class for RgstDtlsGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RgstDtlsGrp_Block_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}RgstDtlsGrpElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}RgstDtlsGrpAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RgstDtlsGrp_Block_t", propOrder = {
    "pty"
})
public class RgstDtlsGrpBlockT {

    @XmlElement(name = "Pty")
    protected List<NestedPartiesBlockT> pty;
    @XmlAttribute(name = "RejRsnTxt")
    protected String rejRsnTxt;
    @XmlAttribute(name = "Email")
    protected String email;
    @XmlAttribute(name = "MailingDtls")
    protected String mailingDtls;
    @XmlAttribute(name = "MailingInst")
    protected String mailingInst;
    @XmlAttribute(name = "OwnerTyp")
    protected BigInteger ownerTyp;
    @XmlAttribute(name = "DtOfBirth")
    protected XMLGregorianCalendar dtOfBirth;
    @XmlAttribute(name = "InvestorCtryOfResidence")
    protected String investorCtryOfResidence;

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
     * {@link NestedPartiesBlockT }
     * 
     * 
     */
    public List<NestedPartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<NestedPartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the rejRsnTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejRsnTxt() {
        return rejRsnTxt;
    }

    /**
     * Sets the value of the rejRsnTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejRsnTxt(String value) {
        this.rejRsnTxt = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the mailingDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingDtls() {
        return mailingDtls;
    }

    /**
     * Sets the value of the mailingDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingDtls(String value) {
        this.mailingDtls = value;
    }

    /**
     * Gets the value of the mailingInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingInst() {
        return mailingInst;
    }

    /**
     * Sets the value of the mailingInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingInst(String value) {
        this.mailingInst = value;
    }

    /**
     * Gets the value of the ownerTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwnerTyp() {
        return ownerTyp;
    }

    /**
     * Sets the value of the ownerTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwnerTyp(BigInteger value) {
        this.ownerTyp = value;
    }

    /**
     * Gets the value of the dtOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfBirth() {
        return dtOfBirth;
    }

    /**
     * Sets the value of the dtOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtOfBirth(XMLGregorianCalendar value) {
        this.dtOfBirth = value;
    }

    /**
     * Gets the value of the investorCtryOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestorCtryOfResidence() {
        return investorCtryOfResidence;
    }

    /**
     * Sets the value of the investorCtryOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestorCtryOfResidence(String value) {
        this.investorCtryOfResidence = value;
    }

}

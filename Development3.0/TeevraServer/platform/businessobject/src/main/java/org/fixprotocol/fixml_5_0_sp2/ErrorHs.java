
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * BusinessMessageReject can be found in Volume1 of the specification 
 * 
 * <p>Java class for Error_hs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Error_hs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ErrorElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ErrorAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Error_hs")
public class ErrorHs
    extends AbstractMessageT
{

    @XmlAttribute(name = "ErrorCode")
    protected String errorCode;
    @XmlAttribute(name = "ErrorMessage", required = true)
    protected String errorMessage;
    @XmlAttribute(name = "ErrorDesc")
    protected String errorDesc;
    @XmlAttribute(name = "TechErrorCode")
    protected String techErrorCode;
    @XmlAttribute(name = "TechErrorMessage")
    protected String techErrorMessage;
    @XmlAttribute(name = "TechErrorDesc")
    protected String techErrorDesc;
    @XmlAttribute(name = "TrnID")
    protected String trnID;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * Sets the value of the errorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDesc(String value) {
        this.errorDesc = value;
    }

    /**
     * Gets the value of the techErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechErrorCode() {
        return techErrorCode;
    }

    /**
     * Sets the value of the techErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechErrorCode(String value) {
        this.techErrorCode = value;
    }

    /**
     * Gets the value of the techErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechErrorMessage() {
        return techErrorMessage;
    }

    /**
     * Sets the value of the techErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechErrorMessage(String value) {
        this.techErrorMessage = value;
    }

    /**
     * Gets the value of the techErrorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechErrorDesc() {
        return techErrorDesc;
    }

    /**
     * Sets the value of the techErrorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechErrorDesc(String value) {
        this.techErrorDesc = value;
    }

    /**
     * Gets the value of the trnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnID() {
        return trnID;
    }

    /**
     * Sets the value of the trnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnID(String value) {
        this.trnID = value;
    }

}

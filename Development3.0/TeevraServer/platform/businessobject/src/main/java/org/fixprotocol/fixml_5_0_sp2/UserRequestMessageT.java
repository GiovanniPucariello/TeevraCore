
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * UserRequest can be found in Volume1 of the specification 
 * 
 * <p>Java class for UserRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserRequest_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UserRequestElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UserRequestAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRequest_message_t")
public class UserRequestMessageT
    extends AbstractMessageT
{

    @XmlAttribute(name = "UserReqID")
    protected String userReqID;
    @XmlAttribute(name = "UserReqTyp")
    protected BigInteger userReqTyp;
    @XmlAttribute(name = "Username")
    protected String username;
    @XmlAttribute(name = "Password")
    protected String password;
    @XmlAttribute(name = "NewPassword")
    protected String newPassword;
    @XmlAttribute(name = "EncPwdMethod")
    protected BigInteger encPwdMethod;
    @XmlAttribute(name = "EncPwd")
    protected String encPwd;
    @XmlAttribute(name = "EncNewPwd")
    protected String encNewPwd;
    @XmlAttribute(name = "RawDataLength")
    protected BigInteger rawDataLength;
    @XmlAttribute(name = "RawData")
    protected String rawData;

    /**
     * Gets the value of the userReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserReqID() {
        return userReqID;
    }

    /**
     * Sets the value of the userReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserReqID(String value) {
        this.userReqID = value;
    }

    /**
     * Gets the value of the userReqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserReqTyp() {
        return userReqTyp;
    }

    /**
     * Sets the value of the userReqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserReqTyp(BigInteger value) {
        this.userReqTyp = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

    /**
     * Gets the value of the encPwdMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncPwdMethod() {
        return encPwdMethod;
    }

    /**
     * Sets the value of the encPwdMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncPwdMethod(BigInteger value) {
        this.encPwdMethod = value;
    }

    /**
     * Gets the value of the encPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncPwd() {
        return encPwd;
    }

    /**
     * Sets the value of the encPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncPwd(String value) {
        this.encPwd = value;
    }

    /**
     * Gets the value of the encNewPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncNewPwd() {
        return encNewPwd;
    }

    /**
     * Sets the value of the encNewPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncNewPwd(String value) {
        this.encNewPwd = value;
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

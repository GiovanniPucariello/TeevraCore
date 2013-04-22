
package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * UserResponse can be found in Volume1 of the specification 
 * 
 * <p>Java class for UserResponse_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserResponse_message_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UserResponseElements"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UserResponseAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserResponse_message_t")
public class UserResponseMessageT
    extends AbstractMessageT
{

    @XmlAttribute(name = "UserReqID")
    protected String userReqID;
    @XmlAttribute(name = "Username")
    protected String username;
    @XmlAttribute(name = "UserStat")
    protected BigInteger userStat;
    @XmlAttribute(name = "UserStatText")
    protected String userStatText;

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
     * Gets the value of the userStat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserStat() {
        return userStat;
    }

    /**
     * Sets the value of the userStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserStat(BigInteger value) {
        this.userStat = value;
    }

    /**
     * Gets the value of the userStatText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserStatText() {
        return userStatText;
    }

    /**
     * Sets the value of the userStatText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserStatText(String value) {
        this.userStatText = value;
    }

}


package com.headstrong.teevra_fixml_1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Protocol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Tag" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="MsgID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ComponentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AbbrName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Section" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CategoryAbbrName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UsesEnumsFromTag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Xref")
public class Xref {

    @XmlAttribute(name = "Protocol")
    protected String protocol;
    @XmlAttribute
    protected String name;
    @XmlAttribute(name = "Tag")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tag;
    @XmlAttribute(name = "MsgID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger msgID;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ComponentType")
    protected String componentType;
    @XmlAttribute(name = "AbbrName")
    protected String abbrName;
    @XmlAttribute(name = "Section")
    protected String section;
    @XmlAttribute(name = "Category")
    protected String category;
    @XmlAttribute(name = "CategoryAbbrName")
    protected String categoryAbbrName;
    @XmlAttribute(name = "UsesEnumsFromTag")
    protected String usesEnumsFromTag;

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTag(BigInteger value) {
        this.tag = value;
    }

    /**
     * Gets the value of the msgID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMsgID() {
        return msgID;
    }

    /**
     * Sets the value of the msgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMsgID(BigInteger value) {
        this.msgID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the componentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentType() {
        return componentType;
    }

    /**
     * Sets the value of the componentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentType(String value) {
        this.componentType = value;
    }

    /**
     * Gets the value of the abbrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbrName() {
        return abbrName;
    }

    /**
     * Sets the value of the abbrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbrName(String value) {
        this.abbrName = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the categoryAbbrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryAbbrName() {
        return categoryAbbrName;
    }

    /**
     * Sets the value of the categoryAbbrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryAbbrName(String value) {
        this.categoryAbbrName = value;
    }

    /**
     * Gets the value of the usesEnumsFromTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsesEnumsFromTag() {
        return usesEnumsFromTag;
    }

    /**
     * Sets the value of the usesEnumsFromTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsesEnumsFromTag(String value) {
        this.usesEnumsFromTag = value;
    }

}

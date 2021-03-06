//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.12 at 12:10:04 PM BST 
//


package org.openehr.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for C_BOOLEAN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C_BOOLEAN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.openehr.org/v1}C_PRIMITIVE">
 *       &lt;sequence>
 *         &lt;element name="true_valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="false_valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="assumed_value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C_BOOLEAN", propOrder = {
    "trueValid",
    "falseValid",
    "assumedValue"
})
public class CBOOLEAN
    extends CPRIMITIVE
{

    @XmlElement(name = "true_valid")
    protected boolean trueValid;
    @XmlElement(name = "false_valid")
    protected boolean falseValid;
    @XmlElement(name = "assumed_value")
    protected Boolean assumedValue;

    /**
     * Gets the value of the trueValid property.
     * 
     */
    public boolean isTrueValid() {
        return trueValid;
    }

    /**
     * Sets the value of the trueValid property.
     * 
     */
    public void setTrueValid(boolean value) {
        this.trueValid = value;
    }

    /**
     * Gets the value of the falseValid property.
     * 
     */
    public boolean isFalseValid() {
        return falseValid;
    }

    /**
     * Sets the value of the falseValid property.
     * 
     */
    public void setFalseValid(boolean value) {
        this.falseValid = value;
    }

    /**
     * Gets the value of the assumedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssumedValue() {
        return assumedValue;
    }

    /**
     * Sets the value of the assumedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssumedValue(Boolean value) {
        this.assumedValue = value;
    }

}

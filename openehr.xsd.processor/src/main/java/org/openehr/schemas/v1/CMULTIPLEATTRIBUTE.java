//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.20 at 11:04:04 AM BST 
//


package org.openehr.schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for C_MULTIPLE_ATTRIBUTE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C_MULTIPLE_ATTRIBUTE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.openehr.org/v1}C_ATTRIBUTE">
 *       &lt;sequence>
 *         &lt;element name="cardinality" type="{http://schemas.openehr.org/v1}CARDINALITY"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C_MULTIPLE_ATTRIBUTE", propOrder = {
    "cardinality"
})
public class CMULTIPLEATTRIBUTE
    extends CATTRIBUTE
{

    @XmlElement(required = true)
    protected CARDINALITY cardinality;

    /**
     * Gets the value of the cardinality property.
     * 
     * @return
     *     possible object is
     *     {@link CARDINALITY }
     *     
     */
    public CARDINALITY getCardinality() {
        return cardinality;
    }

    /**
     * Sets the value of the cardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link CARDINALITY }
     *     
     */
    public void setCardinality(CARDINALITY value) {
        this.cardinality = value;
    }

}

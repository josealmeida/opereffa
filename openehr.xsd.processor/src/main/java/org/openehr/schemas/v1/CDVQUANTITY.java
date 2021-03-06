//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.20 at 11:04:04 AM BST 
//


package org.openehr.schemas.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for C_DV_QUANTITY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C_DV_QUANTITY">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.openehr.org/v1}C_DOMAIN_TYPE">
 *       &lt;sequence>
 *         &lt;element name="assumed_value" type="{http://schemas.openehr.org/v1}DV_QUANTITY" minOccurs="0"/>
 *         &lt;element name="property" type="{http://schemas.openehr.org/v1}CODE_PHRASE" minOccurs="0"/>
 *         &lt;element name="list" type="{http://schemas.openehr.org/v1}C_QUANTITY_ITEM" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C_DV_QUANTITY", propOrder = {
    "assumedValue",
    "property",
    "list"
})
public class CDVQUANTITY
    extends CDOMAINTYPE
{

    @XmlElement(name = "assumed_value")
    protected DVQUANTITY assumedValue;
    protected CODEPHRASE property;
    protected List<CQUANTITYITEM> list;

    /**
     * Gets the value of the assumedValue property.
     * 
     * @return
     *     possible object is
     *     {@link DVQUANTITY }
     *     
     */
    public DVQUANTITY getAssumedValue() {
        return assumedValue;
    }

    /**
     * Sets the value of the assumedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVQUANTITY }
     *     
     */
    public void setAssumedValue(DVQUANTITY value) {
        this.assumedValue = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link CODEPHRASE }
     *     
     */
    public CODEPHRASE getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODEPHRASE }
     *     
     */
    public void setProperty(CODEPHRASE value) {
        this.property = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CQUANTITYITEM }
     * 
     * 
     */
    public List<CQUANTITYITEM> getList() {
        if (list == null) {
            list = new ArrayList<CQUANTITYITEM>();
        }
        return this.list;
    }

}

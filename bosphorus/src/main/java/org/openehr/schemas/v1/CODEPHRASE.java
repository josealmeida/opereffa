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
 * <p>Java class for CODE_PHRASE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CODE_PHRASE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminology_id" type="{http://schemas.openehr.org/v1}TERMINOLOGY_ID"/>
 *         &lt;element name="code_string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODE_PHRASE", propOrder = {
    "terminologyId",
    "codeString"
})
public class CODEPHRASE {

    @XmlElement(name = "terminology_id", required = true)
    protected TERMINOLOGYID terminologyId;
    @XmlElement(name = "code_string", required = true)
    protected String codeString;

    /**
     * Gets the value of the terminologyId property.
     * 
     * @return
     *     possible object is
     *     {@link TERMINOLOGYID }
     *     
     */
    public TERMINOLOGYID getTerminologyId() {
        return terminologyId;
    }

    /**
     * Sets the value of the terminologyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TERMINOLOGYID }
     *     
     */
    public void setTerminologyId(TERMINOLOGYID value) {
        this.terminologyId = value;
    }

    /**
     * Gets the value of the codeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeString() {
        return codeString;
    }

    /**
     * Sets the value of the codeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeString(String value) {
        this.codeString = value;
    }

}
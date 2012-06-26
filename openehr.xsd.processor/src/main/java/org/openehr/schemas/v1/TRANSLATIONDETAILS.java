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
 * <p>Java class for TRANSLATION_DETAILS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRANSLATION_DETAILS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="language" type="{http://schemas.openehr.org/v1}CODE_PHRASE"/>
 *         &lt;element name="author" type="{http://schemas.openehr.org/v1}StringDictionaryItem" maxOccurs="unbounded"/>
 *         &lt;element name="accreditation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="other_details" type="{http://schemas.openehr.org/v1}StringDictionaryItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRANSLATION_DETAILS", propOrder = {
    "language",
    "author",
    "accreditation",
    "otherDetails"
})
public class TRANSLATIONDETAILS {

    @XmlElement(required = true)
    protected CODEPHRASE language;
    @XmlElement(required = true)
    protected List<StringDictionaryItem> author;
    protected String accreditation;
    @XmlElement(name = "other_details")
    protected List<StringDictionaryItem> otherDetails;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link CODEPHRASE }
     *     
     */
    public CODEPHRASE getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODEPHRASE }
     *     
     */
    public void setLanguage(CODEPHRASE value) {
        this.language = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the author property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDictionaryItem }
     * 
     * 
     */
    public List<StringDictionaryItem> getAuthor() {
        if (author == null) {
            author = new ArrayList<StringDictionaryItem>();
        }
        return this.author;
    }

    /**
     * Gets the value of the accreditation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccreditation() {
        return accreditation;
    }

    /**
     * Sets the value of the accreditation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccreditation(String value) {
        this.accreditation = value;
    }

    /**
     * Gets the value of the otherDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringDictionaryItem }
     * 
     * 
     */
    public List<StringDictionaryItem> getOtherDetails() {
        if (otherDetails == null) {
            otherDetails = new ArrayList<StringDictionaryItem>();
        }
        return this.otherDetails;
    }

}

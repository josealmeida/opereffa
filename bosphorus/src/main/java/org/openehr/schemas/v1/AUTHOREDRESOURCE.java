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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AUTHORED_RESOURCE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AUTHORED_RESOURCE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="original_language" type="{http://schemas.openehr.org/v1}CODE_PHRASE"/>
 *         &lt;element name="is_controlled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://schemas.openehr.org/v1}RESOURCE_DESCRIPTION" minOccurs="0"/>
 *         &lt;element name="translations" type="{http://schemas.openehr.org/v1}TRANSLATION_DETAILS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="revision_history" type="{http://schemas.openehr.org/v1}REVISION_HISTORY" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AUTHORED_RESOURCE", propOrder = {
    "originalLanguage",
    "isControlled",
    "description",
    "translations",
    "revisionHistory"
})
@XmlSeeAlso({
    ARCHETYPE.class
})
public class AUTHOREDRESOURCE {

    @XmlElement(name = "original_language", required = true)
    protected CODEPHRASE originalLanguage;
    @XmlElement(name = "is_controlled")
    protected Boolean isControlled;
    protected RESOURCEDESCRIPTION description;
    protected List<TRANSLATIONDETAILS> translations;
    @XmlElement(name = "revision_history")
    protected REVISIONHISTORY revisionHistory;

    /**
     * Gets the value of the originalLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link CODEPHRASE }
     *     
     */
    public CODEPHRASE getOriginalLanguage() {
        return originalLanguage;
    }

    /**
     * Sets the value of the originalLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CODEPHRASE }
     *     
     */
    public void setOriginalLanguage(CODEPHRASE value) {
        this.originalLanguage = value;
    }

    /**
     * Gets the value of the isControlled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsControlled() {
        return isControlled;
    }

    /**
     * Sets the value of the isControlled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsControlled(Boolean value) {
        this.isControlled = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link RESOURCEDESCRIPTION }
     *     
     */
    public RESOURCEDESCRIPTION getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESOURCEDESCRIPTION }
     *     
     */
    public void setDescription(RESOURCEDESCRIPTION value) {
        this.description = value;
    }

    /**
     * Gets the value of the translations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRANSLATIONDETAILS }
     * 
     * 
     */
    public List<TRANSLATIONDETAILS> getTranslations() {
        if (translations == null) {
            translations = new ArrayList<TRANSLATIONDETAILS>();
        }
        return this.translations;
    }

    /**
     * Gets the value of the revisionHistory property.
     * 
     * @return
     *     possible object is
     *     {@link REVISIONHISTORY }
     *     
     */
    public REVISIONHISTORY getRevisionHistory() {
        return revisionHistory;
    }

    /**
     * Sets the value of the revisionHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link REVISIONHISTORY }
     *     
     */
    public void setRevisionHistory(REVISIONHISTORY value) {
        this.revisionHistory = value;
    }

}
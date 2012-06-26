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
 * <p>Java class for ARCHETYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARCHETYPE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.openehr.org/v1}AUTHORED_RESOURCE">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://schemas.openehr.org/v1}HIER_OBJECT_ID" minOccurs="0"/>
 *         &lt;element name="archetype_id" type="{http://schemas.openehr.org/v1}ARCHETYPE_ID"/>
 *         &lt;element name="adl_version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="concept" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parent_archetype_id" type="{http://schemas.openehr.org/v1}ARCHETYPE_ID" minOccurs="0"/>
 *         &lt;element name="definition" type="{http://schemas.openehr.org/v1}C_COMPLEX_OBJECT"/>
 *         &lt;element name="invariants" type="{http://schemas.openehr.org/v1}ASSERTION" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ontology" type="{http://schemas.openehr.org/v1}ARCHETYPE_ONTOLOGY"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARCHETYPE", propOrder = {
    "uid",
    "archetypeId",
    "adlVersion",
    "concept",
    "parentArchetypeId",
    "definition",
    "invariants",
    "ontology"
})
public class ARCHETYPE
    extends AUTHOREDRESOURCE
{

    protected HIEROBJECTID uid;
    @XmlElement(name = "archetype_id", required = true)
    protected ARCHETYPEID archetypeId;
    @XmlElement(name = "adl_version")
    protected String adlVersion;
    @XmlElement(required = true)
    protected String concept;
    @XmlElement(name = "parent_archetype_id")
    protected ARCHETYPEID parentArchetypeId;
    @XmlElement(required = true)
    protected CCOMPLEXOBJECT definition;
    protected List<ASSERTION> invariants;
    @XmlElement(required = true)
    protected ARCHETYPEONTOLOGY ontology;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link HIEROBJECTID }
     *     
     */
    public HIEROBJECTID getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link HIEROBJECTID }
     *     
     */
    public void setUid(HIEROBJECTID value) {
        this.uid = value;
    }

    /**
     * Gets the value of the archetypeId property.
     * 
     * @return
     *     possible object is
     *     {@link ARCHETYPEID }
     *     
     */
    public ARCHETYPEID getArchetypeId() {
        return archetypeId;
    }

    /**
     * Sets the value of the archetypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARCHETYPEID }
     *     
     */
    public void setArchetypeId(ARCHETYPEID value) {
        this.archetypeId = value;
    }

    /**
     * Gets the value of the adlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdlVersion() {
        return adlVersion;
    }

    /**
     * Sets the value of the adlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdlVersion(String value) {
        this.adlVersion = value;
    }

    /**
     * Gets the value of the concept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcept() {
        return concept;
    }

    /**
     * Sets the value of the concept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcept(String value) {
        this.concept = value;
    }

    /**
     * Gets the value of the parentArchetypeId property.
     * 
     * @return
     *     possible object is
     *     {@link ARCHETYPEID }
     *     
     */
    public ARCHETYPEID getParentArchetypeId() {
        return parentArchetypeId;
    }

    /**
     * Sets the value of the parentArchetypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARCHETYPEID }
     *     
     */
    public void setParentArchetypeId(ARCHETYPEID value) {
        this.parentArchetypeId = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link CCOMPLEXOBJECT }
     *     
     */
    public CCOMPLEXOBJECT getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCOMPLEXOBJECT }
     *     
     */
    public void setDefinition(CCOMPLEXOBJECT value) {
        this.definition = value;
    }

    /**
     * Gets the value of the invariants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invariants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvariants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ASSERTION }
     * 
     * 
     */
    public List<ASSERTION> getInvariants() {
        if (invariants == null) {
            invariants = new ArrayList<ASSERTION>();
        }
        return this.invariants;
    }

    /**
     * Gets the value of the ontology property.
     * 
     * @return
     *     possible object is
     *     {@link ARCHETYPEONTOLOGY }
     *     
     */
    public ARCHETYPEONTOLOGY getOntology() {
        return ontology;
    }

    /**
     * Sets the value of the ontology property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARCHETYPEONTOLOGY }
     *     
     */
    public void setOntology(ARCHETYPEONTOLOGY value) {
        this.ontology = value;
    }

}

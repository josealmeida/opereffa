/**
 * DV_ORDINAL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openehr.schemas.v1;

public class DV_ORDINAL  extends org.openehr.schemas.v1.DV_ORDERED  implements java.io.Serializable {
    private int value;

    private org.openehr.schemas.v1.DV_CODED_TEXT symbol;

    public DV_ORDINAL() {
    }

    public DV_ORDINAL(
           org.openehr.schemas.v1.DV_INTERVAL normal_range,
           org.openehr.schemas.v1.REFERENCE_RANGE[] other_reference_ranges,
           org.openehr.schemas.v1.CODE_PHRASE normal_status,
           int value,
           org.openehr.schemas.v1.DV_CODED_TEXT symbol) {
        super(
            normal_range,
            other_reference_ranges,
            normal_status);
        this.value = value;
        this.symbol = symbol;
    }


    /**
     * Gets the value value for this DV_ORDINAL.
     * 
     * @return value
     */
    public int getValue() {
        return value;
    }


    /**
     * Sets the value value for this DV_ORDINAL.
     * 
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }


    /**
     * Gets the symbol value for this DV_ORDINAL.
     * 
     * @return symbol
     */
    public org.openehr.schemas.v1.DV_CODED_TEXT getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this DV_ORDINAL.
     * 
     * @param symbol
     */
    public void setSymbol(org.openehr.schemas.v1.DV_CODED_TEXT symbol) {
        this.symbol = symbol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DV_ORDINAL)) return false;
        DV_ORDINAL other = (DV_ORDINAL) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.value == other.getValue() &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += getValue();
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DV_ORDINAL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.openehr.org/v1", "DV_ORDINAL"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.openehr.org/v1", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.openehr.org/v1", "symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.openehr.org/v1", "DV_CODED_TEXT"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

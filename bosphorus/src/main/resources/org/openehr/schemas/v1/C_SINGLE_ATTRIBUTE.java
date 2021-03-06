/**
 * C_SINGLE_ATTRIBUTE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openehr.schemas.v1;

public class C_SINGLE_ATTRIBUTE  extends org.openehr.schemas.v1.C_ATTRIBUTE  implements java.io.Serializable {
    public C_SINGLE_ATTRIBUTE() {
    }

    public C_SINGLE_ATTRIBUTE(
           java.lang.String rm_attribute_name,
           org.openehr.schemas.v1.IntervalOfInteger existence,
           org.openehr.schemas.v1.C_OBJECT[] children) {
        super(
            rm_attribute_name,
            existence,
            children);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof C_SINGLE_ATTRIBUTE)) return false;
        C_SINGLE_ATTRIBUTE other = (C_SINGLE_ATTRIBUTE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(C_SINGLE_ATTRIBUTE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.openehr.org/v1", "C_SINGLE_ATTRIBUTE"));
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

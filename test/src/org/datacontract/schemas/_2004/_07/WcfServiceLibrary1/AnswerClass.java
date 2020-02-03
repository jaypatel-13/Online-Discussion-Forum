/**
 * AnswerClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.WcfServiceLibrary1;

public class AnswerClass  implements java.io.Serializable {
    private java.lang.Integer aId;

    private java.util.Calendar aPostTime;

    private java.lang.String statement;

    private java.lang.String username;

    public AnswerClass() {
    }

    public AnswerClass(
           java.lang.Integer aId,
           java.util.Calendar aPostTime,
           java.lang.String statement,
           java.lang.String username) {
           this.aId = aId;
           this.aPostTime = aPostTime;
           this.statement = statement;
           this.username = username;
    }


    /**
     * Gets the aId value for this AnswerClass.
     * 
     * @return aId
     */
    public java.lang.Integer getAId() {
        return aId;
    }


    /**
     * Sets the aId value for this AnswerClass.
     * 
     * @param aId
     */
    public void setAId(java.lang.Integer aId) {
        this.aId = aId;
    }


    /**
     * Gets the aPostTime value for this AnswerClass.
     * 
     * @return aPostTime
     */
    public java.util.Calendar getAPostTime() {
        return aPostTime;
    }


    /**
     * Sets the aPostTime value for this AnswerClass.
     * 
     * @param aPostTime
     */
    public void setAPostTime(java.util.Calendar aPostTime) {
        this.aPostTime = aPostTime;
    }


    /**
     * Gets the statement value for this AnswerClass.
     * 
     * @return statement
     */
    public java.lang.String getStatement() {
        return statement;
    }


    /**
     * Sets the statement value for this AnswerClass.
     * 
     * @param statement
     */
    public void setStatement(java.lang.String statement) {
        this.statement = statement;
    }


    /**
     * Gets the username value for this AnswerClass.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this AnswerClass.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnswerClass)) return false;
        AnswerClass other = (AnswerClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aId==null && other.getAId()==null) || 
             (this.aId!=null &&
              this.aId.equals(other.getAId()))) &&
            ((this.aPostTime==null && other.getAPostTime()==null) || 
             (this.aPostTime!=null &&
              this.aPostTime.equals(other.getAPostTime()))) &&
            ((this.statement==null && other.getStatement()==null) || 
             (this.statement!=null &&
              this.statement.equals(other.getStatement()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAId() != null) {
            _hashCode += getAId().hashCode();
        }
        if (getAPostTime() != null) {
            _hashCode += getAPostTime().hashCode();
        }
        if (getStatement() != null) {
            _hashCode += getStatement().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnswerClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "AnswerClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "aId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APostTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "aPostTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "statement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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

/**
 * QuestionClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.WcfServiceLibrary1;

public class QuestionClass  implements java.io.Serializable {
    private java.lang.Integer catId;

    private java.lang.Integer qId;

    private java.util.Calendar qPostTime;

    private java.lang.String statement;

    private java.lang.String username;

    public QuestionClass() {
    }

    public QuestionClass(
           java.lang.Integer catId,
           java.lang.Integer qId,
           java.util.Calendar qPostTime,
           java.lang.String statement,
           java.lang.String username) {
           this.catId = catId;
           this.qId = qId;
           this.qPostTime = qPostTime;
           this.statement = statement;
           this.username = username;
    }


    /**
     * Gets the catId value for this QuestionClass.
     * 
     * @return catId
     */
    public java.lang.Integer getCatId() {
        return catId;
    }


    /**
     * Sets the catId value for this QuestionClass.
     * 
     * @param catId
     */
    public void setCatId(java.lang.Integer catId) {
        this.catId = catId;
    }


    /**
     * Gets the qId value for this QuestionClass.
     * 
     * @return qId
     */
    public java.lang.Integer getQId() {
        return qId;
    }


    /**
     * Sets the qId value for this QuestionClass.
     * 
     * @param qId
     */
    public void setQId(java.lang.Integer qId) {
        this.qId = qId;
    }


    /**
     * Gets the qPostTime value for this QuestionClass.
     * 
     * @return qPostTime
     */
    public java.util.Calendar getQPostTime() {
        return qPostTime;
    }


    /**
     * Sets the qPostTime value for this QuestionClass.
     * 
     * @param qPostTime
     */
    public void setQPostTime(java.util.Calendar qPostTime) {
        this.qPostTime = qPostTime;
    }


    /**
     * Gets the statement value for this QuestionClass.
     * 
     * @return statement
     */
    public java.lang.String getStatement() {
        return statement;
    }


    /**
     * Sets the statement value for this QuestionClass.
     * 
     * @param statement
     */
    public void setStatement(java.lang.String statement) {
        this.statement = statement;
    }


    /**
     * Gets the username value for this QuestionClass.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this QuestionClass.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuestionClass)) return false;
        QuestionClass other = (QuestionClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.catId==null && other.getCatId()==null) || 
             (this.catId!=null &&
              this.catId.equals(other.getCatId()))) &&
            ((this.qId==null && other.getQId()==null) || 
             (this.qId!=null &&
              this.qId.equals(other.getQId()))) &&
            ((this.qPostTime==null && other.getQPostTime()==null) || 
             (this.qPostTime!=null &&
              this.qPostTime.equals(other.getQPostTime()))) &&
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
        if (getCatId() != null) {
            _hashCode += getCatId().hashCode();
        }
        if (getQId() != null) {
            _hashCode += getQId().hashCode();
        }
        if (getQPostTime() != null) {
            _hashCode += getQPostTime().hashCode();
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
        new org.apache.axis.description.TypeDesc(QuestionClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "QuestionClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "catId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "qId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QPostTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/WcfServiceLibrary1", "qPostTime"));
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

/**
 * QuestionCrudLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QuestionCrudLocator extends org.apache.axis.client.Service implements org.tempuri.QuestionCrud {

    public QuestionCrudLocator() {
    }


    public QuestionCrudLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QuestionCrudLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IQuestionCrud
    private java.lang.String BasicHttpBinding_IQuestionCrud_address = "http://localhost:8001/WcfServiceLibrary1/QuestionCrud";

    public java.lang.String getBasicHttpBinding_IQuestionCrudAddress() {
        return BasicHttpBinding_IQuestionCrud_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IQuestionCrudWSDDServiceName = "BasicHttpBinding_IQuestionCrud";

    public java.lang.String getBasicHttpBinding_IQuestionCrudWSDDServiceName() {
        return BasicHttpBinding_IQuestionCrudWSDDServiceName;
    }

    public void setBasicHttpBinding_IQuestionCrudWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IQuestionCrudWSDDServiceName = name;
    }

    public org.tempuri.IQuestionCrud getBasicHttpBinding_IQuestionCrud() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IQuestionCrud_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IQuestionCrud(endpoint);
    }

    public org.tempuri.IQuestionCrud getBasicHttpBinding_IQuestionCrud(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_IQuestionCrudStub _stub = new org.tempuri.BasicHttpBinding_IQuestionCrudStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IQuestionCrudWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IQuestionCrudEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IQuestionCrud_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.IQuestionCrud.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_IQuestionCrudStub _stub = new org.tempuri.BasicHttpBinding_IQuestionCrudStub(new java.net.URL(BasicHttpBinding_IQuestionCrud_address), this);
                _stub.setPortName(getBasicHttpBinding_IQuestionCrudWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IQuestionCrud".equals(inputPortName)) {
            return getBasicHttpBinding_IQuestionCrud();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "QuestionCrud");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IQuestionCrud"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IQuestionCrud".equals(portName)) {
            setBasicHttpBinding_IQuestionCrudEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

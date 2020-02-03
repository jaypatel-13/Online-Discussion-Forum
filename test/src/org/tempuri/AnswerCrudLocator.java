/**
 * AnswerCrudLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AnswerCrudLocator extends org.apache.axis.client.Service implements org.tempuri.AnswerCrud {

    public AnswerCrudLocator() {
    }


    public AnswerCrudLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AnswerCrudLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IAnswerCrud
    private java.lang.String BasicHttpBinding_IAnswerCrud_address = "http://localhost:8002/WcfServiceLibrary1/AnswerCrud";

    public java.lang.String getBasicHttpBinding_IAnswerCrudAddress() {
        return BasicHttpBinding_IAnswerCrud_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IAnswerCrudWSDDServiceName = "BasicHttpBinding_IAnswerCrud";

    public java.lang.String getBasicHttpBinding_IAnswerCrudWSDDServiceName() {
        return BasicHttpBinding_IAnswerCrudWSDDServiceName;
    }

    public void setBasicHttpBinding_IAnswerCrudWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IAnswerCrudWSDDServiceName = name;
    }

    public org.tempuri.IAnswerCrud getBasicHttpBinding_IAnswerCrud() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IAnswerCrud_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IAnswerCrud(endpoint);
    }

    public org.tempuri.IAnswerCrud getBasicHttpBinding_IAnswerCrud(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_IAnswerCrudStub _stub = new org.tempuri.BasicHttpBinding_IAnswerCrudStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IAnswerCrudWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IAnswerCrudEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IAnswerCrud_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.IAnswerCrud.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_IAnswerCrudStub _stub = new org.tempuri.BasicHttpBinding_IAnswerCrudStub(new java.net.URL(BasicHttpBinding_IAnswerCrud_address), this);
                _stub.setPortName(getBasicHttpBinding_IAnswerCrudWSDDServiceName());
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
        if ("BasicHttpBinding_IAnswerCrud".equals(inputPortName)) {
            return getBasicHttpBinding_IAnswerCrud();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "AnswerCrud");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IAnswerCrud"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IAnswerCrud".equals(portName)) {
            setBasicHttpBinding_IAnswerCrudEndpointAddress(address);
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

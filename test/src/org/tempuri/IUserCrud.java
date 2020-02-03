/**
 * IUserCrud.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IUserCrud extends java.rmi.Remote {
    public java.lang.Boolean login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.Boolean register(java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.String country, java.lang.String profession, java.lang.String phone) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.WcfServiceLibrary1.ProfileClass getUserDetails(java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.Boolean updateUser(java.lang.String username, org.datacontract.schemas._2004._07.WcfServiceLibrary1.ProfileClass newProfile) throws java.rmi.RemoteException;
    public java.lang.Boolean deleteUser(java.lang.String username) throws java.rmi.RemoteException;
}

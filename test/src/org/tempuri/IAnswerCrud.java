/**
 * IAnswerCrud.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IAnswerCrud extends java.rmi.Remote {
    public java.lang.Boolean postAnswer(java.lang.Integer aId, java.lang.String statement, java.lang.Integer qId, java.lang.String username) throws java.rmi.RemoteException;
    public java.lang.Boolean deleteAnswer(java.lang.Integer aId) throws java.rmi.RemoteException;
    public java.lang.Boolean updateAnswer(java.lang.Integer aId, java.lang.String statement) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.WcfServiceLibrary1.AnswerClass[] getAnswerOfQuestion(java.lang.Integer qId) throws java.rmi.RemoteException;
    public java.lang.String getAnswer(java.lang.Integer aId) throws java.rmi.RemoteException;
}

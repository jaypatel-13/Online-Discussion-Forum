/**
 * IQuestionCrud.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IQuestionCrud extends java.rmi.Remote {
    public java.lang.Boolean postQuestion(java.lang.Integer qId, java.lang.String statement, java.lang.String username, java.lang.Integer catId) throws java.rmi.RemoteException;
    public java.lang.Boolean deleteQuestion(java.lang.Integer qId) throws java.rmi.RemoteException;
    public java.lang.Boolean updateQuestion(java.lang.Integer qId, java.lang.String statement) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.WcfServiceLibrary1.QuestionClass[] getQuestions() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.WcfServiceLibrary1.QuestionClass[] getQuestionsAsPerCategory(java.lang.Integer catId) throws java.rmi.RemoteException;
    public java.lang.String[] getCategories() throws java.rmi.RemoteException;
    public java.lang.String getQuestionWithId(java.lang.Integer qId) throws java.rmi.RemoteException;
}

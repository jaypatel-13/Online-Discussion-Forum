package org.tempuri;

public class IQuestionCrudProxy implements org.tempuri.IQuestionCrud {
  private String _endpoint = null;
  private org.tempuri.IQuestionCrud iQuestionCrud = null;
  
  public IQuestionCrudProxy() {
    _initIQuestionCrudProxy();
  }
  
  public IQuestionCrudProxy(String endpoint) {
    _endpoint = endpoint;
    _initIQuestionCrudProxy();
  }
  
  private void _initIQuestionCrudProxy() {
    try {
      iQuestionCrud = (new org.tempuri.QuestionCrudLocator()).getBasicHttpBinding_IQuestionCrud();
      if (iQuestionCrud != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iQuestionCrud)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iQuestionCrud)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iQuestionCrud != null)
      ((javax.xml.rpc.Stub)iQuestionCrud)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IQuestionCrud getIQuestionCrud() {
    if (iQuestionCrud == null)
      _initIQuestionCrudProxy();
    return iQuestionCrud;
  }
  
  public java.lang.Boolean postQuestion(java.lang.Integer qId, java.lang.String statement, java.lang.String username, java.lang.Integer catId) throws java.rmi.RemoteException{
    if (iQuestionCrud == null)
      _initIQuestionCrudProxy();
    return iQuestionCrud.postQuestion(qId, statement, username, catId);
  }
  
  public java.lang.Boolean deleteQuestion(java.lang.Integer qId) throws java.rmi.RemoteException{
    if (iQuestionCrud == null)
      _initIQuestionCrudProxy();
    return iQuestionCrud.deleteQuestion(qId);
  }
  
  public java.lang.Boolean updateQuestion(java.lang.Integer qId, java.lang.String statement) throws java.rmi.RemoteException{
    if (iQuestionCrud == null)
      _initIQuestionCrudProxy();
    return iQuestionCrud.updateQuestion(qId, statement);
  }
  
  public org.datacontract.schemas._2004._07.WcfServiceLibrary1.QuestionClass[] getQuestions() throws java.rmi.RemoteException{
    if (iQuestionCrud == null)
      _initIQuestionCrudProxy();
    return iQuestionCrud.getQuestions();
  }
  
  public org.datacontract.schemas._2004._07.WcfServiceLibrary1.QuestionClass[] getQuestionsAsPerCategory(java.lang.Integer catId) throws java.rmi.RemoteException{
    if (iQuestionCrud == null)
      _initIQuestionCrudProxy();
    return iQuestionCrud.getQuestionsAsPerCategory(catId);
  }
  
  public java.lang.String[] getCategories() throws java.rmi.RemoteException{
    if (iQuestionCrud == null)
      _initIQuestionCrudProxy();
    return iQuestionCrud.getCategories();
  }
  
  public java.lang.String getQuestionWithId(java.lang.Integer qId) throws java.rmi.RemoteException{
    if (iQuestionCrud == null)
      _initIQuestionCrudProxy();
    return iQuestionCrud.getQuestionWithId(qId);
  }
  
  
}
package org.tempuri;

public class IAnswerCrudProxy implements org.tempuri.IAnswerCrud {
  private String _endpoint = null;
  private org.tempuri.IAnswerCrud iAnswerCrud = null;
  
  public IAnswerCrudProxy() {
    _initIAnswerCrudProxy();
  }
  
  public IAnswerCrudProxy(String endpoint) {
    _endpoint = endpoint;
    _initIAnswerCrudProxy();
  }
  
  private void _initIAnswerCrudProxy() {
    try {
      iAnswerCrud = (new org.tempuri.AnswerCrudLocator()).getBasicHttpBinding_IAnswerCrud();
      if (iAnswerCrud != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iAnswerCrud)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iAnswerCrud)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iAnswerCrud != null)
      ((javax.xml.rpc.Stub)iAnswerCrud)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IAnswerCrud getIAnswerCrud() {
    if (iAnswerCrud == null)
      _initIAnswerCrudProxy();
    return iAnswerCrud;
  }
  
  public java.lang.Boolean postAnswer(java.lang.Integer aId, java.lang.String statement, java.lang.Integer qId, java.lang.String username) throws java.rmi.RemoteException{
    if (iAnswerCrud == null)
      _initIAnswerCrudProxy();
    return iAnswerCrud.postAnswer(aId, statement, qId, username);
  }
  
  public java.lang.Boolean deleteAnswer(java.lang.Integer aId) throws java.rmi.RemoteException{
    if (iAnswerCrud == null)
      _initIAnswerCrudProxy();
    return iAnswerCrud.deleteAnswer(aId);
  }
  
  public java.lang.Boolean updateAnswer(java.lang.Integer aId, java.lang.String statement) throws java.rmi.RemoteException{
    if (iAnswerCrud == null)
      _initIAnswerCrudProxy();
    return iAnswerCrud.updateAnswer(aId, statement);
  }
  
  public org.datacontract.schemas._2004._07.WcfServiceLibrary1.AnswerClass[] getAnswerOfQuestion(java.lang.Integer qId) throws java.rmi.RemoteException{
    if (iAnswerCrud == null)
      _initIAnswerCrudProxy();
    return iAnswerCrud.getAnswerOfQuestion(qId);
  }
  
  public java.lang.String getAnswer(java.lang.Integer aId) throws java.rmi.RemoteException{
    if (iAnswerCrud == null)
      _initIAnswerCrudProxy();
    return iAnswerCrud.getAnswer(aId);
  }
  
  
}
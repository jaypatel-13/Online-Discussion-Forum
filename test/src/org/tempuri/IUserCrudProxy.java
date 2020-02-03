package org.tempuri;

public class IUserCrudProxy implements org.tempuri.IUserCrud {
  private String _endpoint = null;
  private org.tempuri.IUserCrud iUserCrud = null;
  
  public IUserCrudProxy() {
    _initIUserCrudProxy();
  }
  
  public IUserCrudProxy(String endpoint) {
    _endpoint = endpoint;
    _initIUserCrudProxy();
  }
  
  private void _initIUserCrudProxy() {
    try {
      iUserCrud = (new org.tempuri.UserCrudLocator()).getBasicHttpBinding_IUserCrud();
      if (iUserCrud != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iUserCrud)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iUserCrud)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iUserCrud != null)
      ((javax.xml.rpc.Stub)iUserCrud)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IUserCrud getIUserCrud() {
    if (iUserCrud == null)
      _initIUserCrudProxy();
    return iUserCrud;
  }
  
  public java.lang.Boolean login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (iUserCrud == null)
      _initIUserCrudProxy();
    return iUserCrud.login(username, password);
  }
  
  public java.lang.Boolean register(java.lang.String username, java.lang.String password, java.lang.String name, java.lang.String email, java.lang.String country, java.lang.String profession, java.lang.String phone) throws java.rmi.RemoteException{
    if (iUserCrud == null)
      _initIUserCrudProxy();
    return iUserCrud.register(username, password, name, email, country, profession, phone);
  }
  
  public org.datacontract.schemas._2004._07.WcfServiceLibrary1.ProfileClass getUserDetails(java.lang.String username) throws java.rmi.RemoteException{
    if (iUserCrud == null)
      _initIUserCrudProxy();
    return iUserCrud.getUserDetails(username);
  }
  
  public java.lang.Boolean updateUser(java.lang.String username, org.datacontract.schemas._2004._07.WcfServiceLibrary1.ProfileClass newProfile) throws java.rmi.RemoteException{
    if (iUserCrud == null)
      _initIUserCrudProxy();
    return iUserCrud.updateUser(username, newProfile);
  }
  
  public java.lang.Boolean deleteUser(java.lang.String username) throws java.rmi.RemoteException{
    if (iUserCrud == null)
      _initIUserCrudProxy();
    return iUserCrud.deleteUser(username);
  }
  
  
}
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WcfServiceLibrary1
{
    [ServiceContract]
    public interface IUserCrud
    {
        [OperationContract]
        bool login(string username, string password);
        [OperationContract]
        bool register(string username, string password, string name, string email, string country, string profession, string phone);
        [OperationContract]
        ProfileClass getUserDetails(string username);
        [OperationContract]
        bool updateUser(string username, ProfileClass newProfile);
        [OperationContract]
        bool deleteUser(string username);
    }

    [DataContract]
    public class ProfileClass
    {
        [DataMember]
        public string username;
        [DataMember]
        public string password;
        [DataMember]
        public string name;
        [DataMember]
        public string email;
        [DataMember]
        public string country;
        [DataMember]
        public string profession;
        [DataMember]
        public string phone;
    }
    
}

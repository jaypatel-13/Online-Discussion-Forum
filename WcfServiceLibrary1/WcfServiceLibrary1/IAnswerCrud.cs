using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace WcfServiceLibrary1
{
    [ServiceContract]
    interface IAnswerCrud
    {
        [OperationContract]
        bool postAnswer(int aId, string statement, int qId, string username);
        [OperationContract]
        bool deleteAnswer(int aId);
        [OperationContract]
        bool updateAnswer(int aId, string statement);
        [OperationContract]
        List<AnswerClass> getAnswerOfQuestion(int qId);
        [OperationContract]
        string getAnswer(int aId);
        
    }
    [DataContract]
    public class AnswerClass
    {
        [DataMember]
        public string statement;
        [DataMember]
        public string username;
        [DataMember]
        public DateTime aPostTime;
        [DataMember]
        public int aId;
    }
}

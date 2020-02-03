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
    interface IQuestionCrud
    {
        [OperationContract]
        bool postQuestion(int qId, string statement, string username, int catId);
        [OperationContract]
        bool deleteQuestion(int qId);
        [OperationContract]
        bool updateQuestion(int qId, string statement);
        [OperationContract]
        List<QuestionClass> getQuestions();
        [OperationContract]
        List<QuestionClass> getQuestionsAsPerCategory(int catId);
        [OperationContract]
        List<String> getCategories();
        [OperationContract]
        string getQuestionWithId(int qId);
    }
    [DataContract]
    public class QuestionClass
    {
        [DataMember]
        public int qId;
        [DataMember]
        public string statement;
        [DataMember]
        public string username;
        [DataMember]
        public int catId;
        [DataMember]
        public DateTime qPostTime;
    }

}

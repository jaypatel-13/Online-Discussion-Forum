using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            
            ServiceHost sh1 = new ServiceHost(typeof(WcfServiceLibrary1.UserCrud), new Uri("http://localhost:8000/WcfServiceLibrary1"));
            ServiceHost sh2 = new ServiceHost(typeof(WcfServiceLibrary1.QuestionCrud), new Uri("http://localhost:8001/WcfServiceLibrary1"));
            ServiceHost sh3 = new ServiceHost(typeof(WcfServiceLibrary1.AnswerCrud), new Uri("http://localhost:8002/WcfServiceLibrary1"));

            sh1.Open();
            sh2.Open();
            sh3.Open();
            Console.Write("Service running ...");
            Console.Read();
            sh1.Close();
            sh2.Close();
            sh3.Close();
        }
    }
}

using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WcfServiceLibrary1
{
    public class QuestionCrud : IQuestionCrud
    {
        private SqlCommand cmd;
        private SqlConnection conn = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\JP\Documents\sampledb.mdf;Integrated Security=True;Connect Timeout=30");

        public bool deleteQuestion(int qId)
        {
            conn.Open();
            
            try
            {
                SqlCommand cmd1 = new SqlCommand("DELETE Answer WHERE QId=@qId", conn);
                cmd1.Parameters.AddWithValue("qId", qId);
                cmd1.ExecuteNonQuery();
                cmd = new SqlCommand("DELETE Question WHERE QId=@qId", conn);
                cmd.Parameters.AddWithValue("qId", qId);
                cmd.ExecuteNonQuery();
                conn.Close();
                return true;
            }
            catch (Exception e)
            {
                conn.Close();
                return false;
            }
        }
        public List<QuestionClass> getQuestions()
        {
            List<QuestionClass> questions=new List<QuestionClass>();
            conn.Open();
            cmd = new SqlCommand("SELECT * FROM Question",conn);
            SqlDataReader reader = cmd.ExecuteReader();
            
            while(reader.Read())
            {
                QuestionClass question = new QuestionClass();
                question.qId = reader.GetInt32(0);
                question.statement = reader.GetString(1);
                question.username = reader.GetString(2);
                question.catId = reader.GetInt32(3);
                question.qPostTime = reader.GetDateTime(4);
                questions.Add(question);
            }
            conn.Close();
            return questions;

        }

        public List<QuestionClass> getQuestionsAsPerCategory(int catId)
        {
            List<QuestionClass> questions = new List<QuestionClass>();
            conn.Open();
            cmd = new SqlCommand("SELECT * FROM Question WHERE CategoryId=@catId",conn);
            cmd.Parameters.AddWithValue("catId", catId);
            SqlDataReader reader = cmd.ExecuteReader();

            while (reader.Read())
            {
                QuestionClass question = new QuestionClass();
                question.qId = reader.GetInt32(0);
                question.statement = reader.GetString(1);
                question.username = reader.GetString(2);
                question.catId = reader.GetInt32(3);
                question.qPostTime = reader.GetDateTime(4);
                questions.Add(question);
            }
            conn.Close();
            return questions;
        }
        public bool postQuestion(int qId, string statement, string username, int catId)
        {
            conn.Open();
            cmd = new SqlCommand("INSERT INTO Question (QId,Statement,Username,CategoryId,QPostTime) VALUES (@qId, @statement, @username, @catId, @qPostTime)",conn);
            cmd.Parameters.AddWithValue("qId", qId);
            cmd.Parameters.AddWithValue("statement",statement);
            cmd.Parameters.AddWithValue("username",username);
            cmd.Parameters.AddWithValue("catId",catId);
            cmd.Parameters.AddWithValue("qPostTime",DateTime.Now);
            try {
                cmd.ExecuteNonQuery();
                conn.Close();
                return true;
            }
            catch (Exception e)
            {
                conn.Close();
                return false;
            }
            
        }

        public bool updateQuestion(int qId, string statement)
        {
            conn.Open();
            cmd = new SqlCommand("UPDATE Question set Statement=@statement WHERE QId=@qId", conn);
            cmd.Parameters.AddWithValue("statement", statement);
            cmd.Parameters.AddWithValue("qId", qId);
            //try
            //{
                cmd.ExecuteNonQuery();
                conn.Close();
                return true;
            /*}
            catch (Exception e)
            {
                conn.Close();
                return false;
            }*/
        }
        public List<string> getCategories()
        {
            List<String> categories = new List<string>();
            conn.Open();
            cmd = new SqlCommand("SELECT CategoryName FROM Category",conn);
            SqlDataReader reader = cmd.ExecuteReader();
            while(reader.Read())
            {
                categories.Add(reader.GetString(0));    
            }
            conn.Close();
            return categories;
        }

        public string getQuestionWithId(int qId)
        {
            conn.Open();
            cmd = new SqlCommand("SELECT Statement FROM Question WHERE QId=@qId", conn);
            cmd.Parameters.AddWithValue("qId", qId);
            SqlDataReader reader = cmd.ExecuteReader();
            if (reader.Read())
            {
                return reader.GetString(0);
            }
            return null;
        }
    }
}

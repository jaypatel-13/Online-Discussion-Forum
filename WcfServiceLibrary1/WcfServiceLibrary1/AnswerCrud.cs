using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WcfServiceLibrary1
{

    public class AnswerCrud : IAnswerCrud
    {
        private SqlCommand cmd;
        private SqlConnection conn = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\JP\Documents\sampledb.mdf;Integrated Security=True;Connect Timeout=30");

        public bool deleteAnswer(int aId)
        {
            conn.Open();
            cmd = new SqlCommand("DELETE Answer WHERE AId=@aId", conn);
            cmd.Parameters.AddWithValue("aId", aId);
            try
            {
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

        public string getAnswer(int aId)
        {
            conn.Open();
            cmd = new SqlCommand("SELECT Statement FROM Answer WHERE AId=@aId", conn);
            cmd.Parameters.AddWithValue("aId", aId);
            SqlDataReader reader = cmd.ExecuteReader();
            if (reader.Read())
            {
                return reader.GetString(0);
            }
            return null;
        }

        public List<AnswerClass> getAnswerOfQuestion(int qId)
        {
            List<AnswerClass> answers = new List<AnswerClass>();
            conn.Open();
            cmd = new SqlCommand("SELECT * FROM Answer WHERE QId=@qId", conn);
            cmd.Parameters.AddWithValue("qId", qId);
            SqlDataReader reader = cmd.ExecuteReader();

            while (reader.Read())
            {
                AnswerClass answer = new AnswerClass();
                answer.aId = reader.GetInt32(0);
                answer.statement = reader.GetString(1);
                answer.username = reader.GetString(3);
                answer.aPostTime = reader.GetDateTime(4);
                answers.Add(answer);
            }
            conn.Close();
            return answers;
        }

        public bool postAnswer(int aId, string statement,int qId, string username)
        {
            conn.Open();
            cmd = new SqlCommand("INSERT INTO Answer (AId, Statement, QId, Username, APostTime) VALUES (@aId, @statement, @qid, @username, @aPostTime)", conn);
            cmd.Parameters.AddWithValue("qId", qId);
            cmd.Parameters.AddWithValue("statement", statement);
            cmd.Parameters.AddWithValue("aId", aId);
            cmd.Parameters.AddWithValue("username", username);
            cmd.Parameters.AddWithValue("aPostTime", DateTime.Now);
            try
            {
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

        public bool updateAnswer(int aId, string statement)
        {
            conn.Open();
            cmd = new SqlCommand("UPDATE Answer set Statement=@statement WHERE AId=@aId", conn);
            cmd.Parameters.AddWithValue("statement", statement);
            cmd.Parameters.AddWithValue("aId", aId);
            try
            {
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
    }
}

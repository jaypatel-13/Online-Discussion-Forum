using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace WcfServiceLibrary1
{

    public class UserCrud : IUserCrud
    {
        private SqlCommand cmd;
        private SqlConnection conn = new SqlConnection(@"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\JP\Documents\sampledb.mdf;Integrated Security=True;Connect Timeout=30");

        public ProfileClass getUserDetails(string username)
        {
            conn.Open();
            ProfileClass profile=null;
            cmd = new SqlCommand("SELECT * FROM Profile WHERE Username=@username",conn);
            cmd.Parameters.AddWithValue("username", username);
            SqlDataReader reader = cmd.ExecuteReader();
            try
            {
                while(reader.Read())
                {
                    profile = new ProfileClass
                    {
                        username = reader.GetString(0).ToString(),
                        password = reader.GetString(1).ToString(),
                        name = reader.GetString(2).ToString(),
                        phone = reader.GetString(3).ToString(),
                        email = reader.GetString(4).ToString(),
                        country = reader.GetString(5).ToString(),
                        profession = reader.GetString(6).ToString()
                    };
                        
                }
            }
            catch (Exception e)
            {
               
            }
            return profile;

        }

        public bool login(string username, string password)
        {
            conn.Open();
            cmd = new SqlCommand("SELECT Username FROM Profile WHERE Username=@username and Password=@password", conn);
            cmd.Parameters.AddWithValue("username", username);
            cmd.Parameters.AddWithValue("password", password);
            SqlDataReader reader = cmd.ExecuteReader();

            if (reader.Read())
            {
                conn.Close();
                return true;
            }
            else
            {
                conn.Close();
                return false;
            }
        }

        public bool register(string username, string password, string name, string email, string country, string profession, string phone)
        {
            conn.Open();
            cmd = new SqlCommand("INSERT INTO Profile (Username,Password,Name,Phone,Email,Country,Profession) VALUES (@username,@password,@name,@phone,@email,@country,@profession)", conn);

            cmd.Parameters.AddWithValue("username", username);
            cmd.Parameters.AddWithValue("password", password);
            cmd.Parameters.AddWithValue("name",name);
            cmd.Parameters.AddWithValue("email",email);
            cmd.Parameters.AddWithValue("phone",phone);
            cmd.Parameters.AddWithValue("country",country);
            cmd.Parameters.AddWithValue("profession",profession);
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

        public bool updateUser(string username, ProfileClass newProfile)
        {
            conn.Open();
            try
            {
                cmd = new SqlCommand("UPDATE Profile set Password=@password,Name=@name,Phone=@phone,Email=@email,Country=@country,Profession=@profession WHERE Username=@username", conn);
                cmd.Parameters.AddWithValue("username", newProfile.username);
                cmd.Parameters.AddWithValue("password", newProfile.password);
                cmd.Parameters.AddWithValue("name", newProfile.name);
                cmd.Parameters.AddWithValue("email", newProfile.email);
                cmd.Parameters.AddWithValue("phone", newProfile.phone);
                cmd.Parameters.AddWithValue("country", newProfile.country);
                cmd.Parameters.AddWithValue("profession", newProfile.profession);
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
        

        public bool deleteUser(string username)
        {
            conn.Open();
            
           try
            {
                SqlCommand cmd1 = new SqlCommand("SELECT QId FROM Question WHERE Username=@username", conn);
                cmd1.Parameters.AddWithValue("username", username);
                SqlDataReader reader = cmd1.ExecuteReader();
                List<int> questions = new List<int>();
                while (reader.Read())
                {
                    questions.Add(reader.GetInt32(0));                       
                }
                reader.Close();
            
                foreach(int x in questions)
                {
                cmd1 = new SqlCommand("DELETE Answer WHERE QId=@qId",conn);
                cmd1.Parameters.AddWithValue("qId", x);
                cmd1.ExecuteNonQuery();
                }
                cmd1 = new SqlCommand("DELETE Question WHERE Username = @username",conn);
                cmd1.Parameters.AddWithValue("username", username);
                cmd1.ExecuteNonQuery();
                cmd = new SqlCommand("DELETE Profile WHERE Username=@username", conn);
                cmd.Parameters.AddWithValue("username", username);
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

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="org.datacontract.schemas._2004._07.WcfServiceLibrary1.QuestionClass" %>
    <%@ page import="org.tempuri.IQuestionCrudProxy" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

body{
	background-color:#8E9299;

}
.button {
	background-color:black;
  color: white;
  padding: 14px 20px;
  width: 100%;
}

.button:hover {
  opacity: 0.8;
}

.question{
	width:100%;
}
</style><meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		if(session.getAttribute("username") == null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
<%!  
    IQuestionCrudProxy client = new IQuestionCrudProxy();
	String[] category;
%>
<jsp:include page="navigation.jsp" />
<br>
<br><br>
<%
category = client.getCategories();
int queCount=22;
try
{
	queCount = (int)application.getAttribute("queCount");
	queCount++;
}
	catch(Exception e)
	{
		queCount=22;
	}
finally
{
	application.setAttribute("queCount", queCount);	
}

%>
<br>
<br><br>
	<form action="PostQuestionServlet?qId=<%= queCount %>" method="post">
		<table border="4" align="center" width="60%">
	<tr><td>Question:</td> <td><input class="question"  type="text" name="statement" ></td></tr>
<tr><td colspan="2">		Category: <select name="category">

		<%
			for(String c : category)
			{
		%>
		<option value="<%=c %>"><%= c%></option>
		<%
		}
		%>
		</select></td></tr>
<tr><td colspan="2">		<input class="button" type="submit" value="Post"></td></tr></table>
	</form>
</body>
</html>
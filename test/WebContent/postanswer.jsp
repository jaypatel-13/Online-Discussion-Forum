<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="org.datacontract.schemas._2004._07.WcfServiceLibrary1.*" %>
    <%@ page import="org.tempuri.*"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.question{
	color:white;
	font-size:3vw;
	text-align:center;
}

body{
	background-color:#8E9299;

}

.ans{
	color:white;
	padding-left:10%;
}

textarea{
	width:100%;
	height:200px;
}

input {

  background-color: black;
  color: white;
  padding: 14px 20px;
  width: 100%;
}

input:hover {
  opacity: 0.8;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		if(session.getAttribute("username") == null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
<%
int ansCount=50;
try
{
	ansCount = (int)application.getAttribute("ansCount");
	ansCount++;
}
	catch(Exception e)
	{
		ansCount = 50;
	}
finally
{
	application.setAttribute("ansCount", ansCount);	
}
%>
	<jsp:include page="navigation.jsp" />
<br>
<br><br>
	<form method="post" action="PostAnswerServlet?aId=<%= ansCount %>&qId=<%=request.getParameter("qId") %>">
	<table border="5" align="center" color="white" background="black"> 
	<tr>
	<td>
	<p class="question">	Question: <%=new IQuestionCrudProxy().getQuestionWithId(Integer.parseInt(request.getParameter("qId"))) %></p>
	</td></tr>
	<tr><td>
		<textarea name="answer" placeholder="Type your answer." font-size="3vw"></textarea><br>
		</td></tr><tr><td><input type="submit" value="Post">
</td></tr>	
	</form>

</body>
</html>
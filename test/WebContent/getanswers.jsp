<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="org.tempuri.*" %>
    <%@ page import="org.datacontract.schemas._2004._07.WcfServiceLibrary1.*" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
	background-color:#8E9299;

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
	<jsp:include page="navigation.jsp" />
<br>
<br><br>
<h1 align="center">	Question : <%=new IQuestionCrudProxy().getQuestionWithId(Integer.parseInt(request.getParameter("qId"))) %>
	</h1>
	<h2 align="center">Answers:</h2>
	<%
		for(AnswerClass a : new IAnswerCrudProxy().getAnswerOfQuestion(Integer.parseInt(request.getParameter("qId"))))
		{
			
		%>
	<table border="4" align="center" width="60%">
	<tr><td colspan="2"><p align="center">	Answer: <%= a.getStatement() %></p></td></tr>
	<tr><td>	<p align="center">Posted by: <%= a.getUsername() %></p></td>
<td>	<p align="center">	Time: <%= a.getAPostTime().getTime() %></p></td></tr>
		<%
		if(a.getUsername().equals(session.getAttribute("username")))
		{
			%>
<tr><td>		<p align="center"><a href="DeleteAnswerServlet?aId=<%= a.getAId() %>">Delete Answer</a></p></td>
<td>		<p align="center"><a href="updateanswer.jsp?aId=<%= a.getAId() %>">Update Answer</a> </p></td></tr>
		<%} %>
	</table><br><br>	<%
		}
	%>
	<jsp:include page="footer.jsp" />
</body>
</html>
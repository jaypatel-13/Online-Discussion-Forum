<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="org.datacontract.schemas._2004._07.WcfServiceLibrary1.*" %>
    <%@ page import="org.tempuri.*" %>
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
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="navigation.jsp" />
<br>
<br><br>
<%
		if(session.getAttribute("username") == null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
	<form action="UpdateAnswerServlet?aId=<%= request.getParameter("aId") %>" method="post">
		<table border="5" align="center" color="white" > 
	<tr>
	<td>Answer:<br> <textarea rows="10" cols="150" name="statement"><%=new IAnswerCrudProxy().getAnswer(Integer.parseInt(request.getParameter("aId"))) %></textarea></td></tr>
	<tr><td>
		<input class= "button" type="submit" value="Update" align="center">
</td></tr></table>	</form>
</body>
</html>
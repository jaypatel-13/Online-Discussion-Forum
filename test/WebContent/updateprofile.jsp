<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="org.datacontract.schemas._2004._07.WcfServiceLibrary1.*" %>
    <%@ page import="org.tempuri.*" %>
<!DOCTYPE html>
<html>
<head>
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
	<%
		ProfileClass user;
		IUserCrudProxy client = new IUserCrudProxy();
		user = client.getUserDetails(session.getAttribute("username").toString());
	%>
	<h1 align="center">Details:</h1> <br>
	<form action="UpdateProfileServlet?country=<%= user.getCountry() %>&profession=<%=user.getProfession() %>>" method="post">	
			<table border="5" align="center" color="white" > 
	<tr>
	<td>Username:</td> <td><%= user.getUsername() %></td></tr>
<tr><td>	Password:</td><td> <input type="password" value="<%=user.getPassword()%>" name="password"></td></tr>
<tr><td>	Name: </td><td><input type="text" value="<%= user.getName() %>" name="name"></td></tr>
<tr><td>	Country: </td><td><%= user.getCountry() %></td></tr>
	
<tr><td>	Profession:</td><td> <%= user.getProfession() %></td></tr>
<tr><td>	Phone No.:</td><td><input type="text" value="<%= user.getPhone() %>" name="phone"></td></tr>
<tr><td>	E-mail id: </td><td><input type="email" value="<%= user.getEmail() %>" name="email"></td></tr>
<tr><td colspan="2">	<input type="submit" value="Update Details">

	</td></tr></table></form>
	
<br><br><br><br><br><br><br>	
	
	
	
<jsp:include page="footer.jsp"/>
</body>
</html>
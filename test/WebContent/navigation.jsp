<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="nav.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
<div class="topnav" id="myTopnav" style="position:sticky;">
  <a href="userhome.jsp">Home</a>
  <a href="#news">News</a>
  <a href="#contact">Contact</a>
  <a href="#about">About</a>
  <a href="postquestion.jsp">Ask Question</a>
  <div class="dropdown">
    <button class="dropbtn">User 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      
      <%
      	if(session.getAttribute("username")!=null)
      	{
      %>
      <a href="updateprofile.jsp">Update Profile</a>
      <a href="DeleteProfileServlet">Delete account</a>
      <a href="LogoutServlet">Logout</a>
      <%}else{%>
      <a href="login.jsp">Login</a>
      <a href="registration.jsp">Sign up</a>
      <%} %>
      
    </div>
  </div> 
</div>

<script>
function myFunction() {
  var x = document.getElementById("myTopnav");
  if (x.className === "topnav") {
    x.className += " responsive";
  } else {
    x.className = "topnav";
  }
}
</script>

</body>
</html>
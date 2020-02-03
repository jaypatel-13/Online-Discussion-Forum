<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="org.datacontract.schemas._2004._07.WcfServiceLibrary1.QuestionClass" %>
    <%@ page import="org.tempuri.IQuestionCrudProxy" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="home.css" rel="stylesheet" type="text/css" />
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body style="background-color:#DEE1E5;">
<jsp:include page="navigation.jsp" />
<br>
<br><br>
<% QuestionClass[] questions; 
    IQuestionCrudProxy client = new IQuestionCrudProxy();
	String[] category;
	category = client.getCategories();	
	
	try
	{
	Integer requiredCatId = new Integer(Integer.parseInt(request.getParameter("catId")));
	questions = client.getQuestionsAsPerCategory(requiredCatId);
	}
	catch(Exception e)
	{
		questions = client.getQuestions();
	}
%>

<br><br>
	<div class="dropdown" style="padding-left:5%;width:20%;">
 	 <button class="dropbtn">Categories</button>
 	 <div class="dropdown-content" style="left:0;">
		<%
		 int i=0;
		for(String c : category)
		{
		%>
		<li><a href="userhome.jsp?catId=<%= i++ %>"><%= c%></a></li>
		<%
		}
		%>
  	</div>
	</div>
<br><br>


<%	
String uname;
boolean flag = true;
try
{
	uname = session.getAttribute("username").toString();	
}
catch(Exception e)
{
	uname = null;
	flag=false;
}
for(QuestionClass q : questions)
	{
%>

<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
<p class="uname"><%=q.getUsername() %></p><br>
<p class="que"><%=q.getStatement() %></p><br>
 <p class="cat">Category: <%=category[q.getCatId()] %></p>
   <p class="time"><%=q.getQPostTime().getTime() %></p>
      	
    </div>
    <div class="flip-card-back" >
     	<a class="mylink" href="postanswer.jsp?qId=<%= q.getQId() %>">Post an answer</a><br>
     	<a class="mylink" href="getanswers.jsp?qId=<%= q.getQId() %>">See Answers</a><br>
     	<%
     		if(flag && q.getUsername().equals(uname))
     		{
     	%>
     	<a class="mylink" href="DeleteQuestionServlet?qId=<%= q.getQId() %>">Delete question</a><br>
     	<a class="mylink" href="updatequestion.jsp?qId=<%= q.getQId()%>">Update question</a><br>
     	<%} %>
    </div>
  </div>
</div>

<br><br>

<%
	}
%>

<jsp:include page="footer.jsp" />
</body>

</html>
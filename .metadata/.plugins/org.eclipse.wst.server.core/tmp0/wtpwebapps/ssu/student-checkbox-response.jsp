<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>STUDENT CHECKBOX RESPONSE</title>
</head>
<body>
Student name is confirmed as ${param.naam}<br/><br/>
Student Roll Number is confirmed as ${param.rollNum}<br/><br/>


Favorite Languages are <br/>
<ul>
<%
String[] langs = request.getParameterValues("language");
for(String x : langs){
	out.println("<li>"+x + "</li>");
}
%>
</ul>
<br/><br/>
Sports that student is playing are
<ul>
<%
String[] sports = request.getParameterValues("sports");
for(String s: sports){
	out.println("<li>" + s + "</li>");
}
%>
</ul>
<br/><br/>
Hobbies of the student are
<ul>
<%
 String[] hobbies = request.getParameterValues("hobbies");
 for(String x: hobbies){
	 out.println("<li>" + x + "</li>");
 }

%>
</ul>
<br/><br/>
Favorite OTT of student are
<ul>
<%
 String[] ott = request.getParameterValues("ott");
 for(String x : ott){
	 out.println("<li>" + x + "</li>");
 }
%>
</ul>
<br/><br/>
Preferred Movies of Student are
<ul>
<%
String[] preferredMovies = request.getParameterValues("preferredMovies");
for(String x: preferredMovies){
	out.println("<li>" + x + "</li>");
}
%>
</ul>


  
 
  
</body>
</html>
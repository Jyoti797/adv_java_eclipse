<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CALCULATOR RESPONSE</title>
</head>
<body>
<%!
int result = 0;
%>


<%
int a = Integer.parseInt(request.getParameter("a"));
int b = Integer.parseInt(request.getParameter("b"));
int ops = Integer.parseInt(request.getParameter("operation"));
 if(ops==1){
	 result = a + b;
 }else if(ops==2){
	 result = a-b;
 }else if(ops==3){
	 result = a*b;
 }else if(ops==4){
	 result = a /b;
 }

%>

Value after calculation is: <%= result %>
 


</body>
</html>
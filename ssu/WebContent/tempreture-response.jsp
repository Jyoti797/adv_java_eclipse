<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tempreture conversion</title>
</head>
<body>
<%
// tempreture in celcius
float c = Float.parseFloat(request.getParameter("celcius"));
// tempreture in farenhite
float f = (float) (c * 1.8) + 32;

%>

Tempreture is <%= f %> degree Farenhite


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scriplet test </title>
</head>
<body>
<h3>JSP Declarations</h3>
<br/>
<br/>
<%!
 String makeItLower(String name){
	return name.toLowerCase();
}

%>

LOWER CASE: <%= makeItLower("JYOTI RANJAN MOHANTA")%>


</body>
</html>
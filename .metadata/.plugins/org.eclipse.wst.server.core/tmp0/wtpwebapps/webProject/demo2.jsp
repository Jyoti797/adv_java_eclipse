<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com.jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="name" value="Tech soft INDIA"></c:set>
<c:out value="$name."></c:out>
<c:if test="$(3>2)">

<h1>this is true block  3>2</h1>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>built in test</title>
</head>
<body>
<h3>Built in test</h3>
<br/>
<br/>
REQUEST USER AGENT: <%= request.getHeader("User-Agent") %>
<br/>
<br/>
REQUEST USER LANGUAGE: <%= request.getLocale() %>



</body>
</html>
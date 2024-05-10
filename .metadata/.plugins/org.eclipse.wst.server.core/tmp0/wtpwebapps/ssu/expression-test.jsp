<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>expression test</title>
</head>
<body>
Converting a string to upper case
<%= new String("Hello World").toUpperCase() %>
<br/>
<br/>
25 multiplied by 4 equals to <%= 25*4 %>
<br/>
<br/>
Is 75 less than 69 <%= 75<69 %>
<br/>
<br/>
<%
 for(int i=1; i<=5; i++){
	 out.println("<br/> I really love 2 code:  " + i);
 }

%>


</body>
</html>
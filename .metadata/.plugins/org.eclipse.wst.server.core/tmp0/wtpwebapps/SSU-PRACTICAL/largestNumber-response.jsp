<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>largest number response</title>
</head>
<body>

<%
int a = Integer.parseInt(request.getParameter("a"));
int b = Integer.parseInt(request.getParameter("b"));
int c = Integer.parseInt(request.getParameter("c"));
int largest = 0;
if(a>b && a>c){
	largest = a;
}
else if(b>a && b>c){
	largest= b;
}
else{
	largest=c;
}
%>

The largest number is <%=largest %>

</body>
</html>
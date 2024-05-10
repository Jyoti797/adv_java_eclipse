<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP page</title>
</head>
<body>
<%!


public int sum(int a, int b){
	int c = a + b;
	return c;
}

public String ulta(String name){
	StringBuffer br = new StringBuffer(name);
	return br.reverse().toString();
}

%>

<%
int ans = sum(100,200);
String result = ulta("Jyoti Ranjan Mohanta");
out.println(ans);
out.println("<br/>");
out.println(result);

%>




</body>
</html>
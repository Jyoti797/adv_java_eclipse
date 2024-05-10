<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>reverse response</title>
</head>
<body>
<%
int num = Integer.parseInt(request.getParameter("n"));

int rem=0;
int rev=0;
while(num!=0){
	rem= num%10;
	rev = rev *10 + rem;
	num = num/10;
	
}


%>
The reversed number is <%= rev %>

</body>
</html>
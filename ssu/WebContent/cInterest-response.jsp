<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>compound interest response</title>
</head>
<body>
<%
int p = Integer.parseInt(request.getParameter("p"));
int r = Integer.parseInt(request.getParameter("r"));
int t = Integer.parseInt(request.getParameter("t"));

double y = (100 + r);
double z = y / 100;

double a = p * Math.pow(z, t);
int amount = (int) a;
int ci = amount - p;
System.out.println("Amount after " + t + " years is " + amount);
System.out.println("Compound interest after " + t + " years is " + ci);


%>

Amount after <%= t %> years is <%= a %> <br/><br/>
Compound Interest after <%=t %> years is <%= ci %>

</body>
</html>
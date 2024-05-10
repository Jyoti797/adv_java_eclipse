<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmation</title>
</head>
<%
String favLang = request.getParameter("favouriteLanguage");
Cookie theCookie = new Cookie("myApp.favouriteLanguage", favLang);
theCookie.setMaxAge(600);
response.addCookie(theCookie);
%>
<body>
Thanks ! we set your favorite language to ${param.favouriteLanguage}
<br/><br/>
<a href="cookies-homepage.jsp">Return to Homepage</a>

</body>
</html>
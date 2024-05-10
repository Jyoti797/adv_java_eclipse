<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>COOKIES HOMEPAGE</title>
</head>
<body>
	<h3>Training Portal</h3>
	<!-- read the favorite programming language cookie -->
	<%
	String favLang = "Java";
	Cookie[] theCookies = request.getCookies();
	if (theCookies != null) {
		for (Cookie c : theCookies) {
			if ("myApp.favouriteLanguage".equals(c.getName())) {
		favLang = c.getValue();
		break;
			}
		}
	}
	%>
	<!-- Now show a personalize page use the "favLang" variable -->
	<h4>
		New Books for ${param.favLang}</h4>

	<ul>
	<li>Blah blah blah</li>
	<li>Blah blah blah</li>
	
	
	</ul>
	<h4>Latest news reports<%=favLang%></h4>
	<ul>
		<li>Blah Blah Blah</li>
		<li>Blah Blah Blah</li>
	</ul>
	<h4>
		Hot jobs for
		<%=favLang%></h4>
	<ul>
		<li>Blah Blah Blah</li>
		<li>Blah Blah Blah</li>
	</ul>

	<hr>
	<a href="cookies-personalize-form.html">Personalize this page</a>


</body>
</html>
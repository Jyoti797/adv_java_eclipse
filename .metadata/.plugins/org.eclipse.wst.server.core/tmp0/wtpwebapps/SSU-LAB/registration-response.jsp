<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="jakarta.servlet.http.*" %>
<%@ page import="jakarta.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registration- response</title>
</head>
<body>
<%
try {
	String naam = request.getParameter("naam");
	String phone = request.getParameter("phone");
	String email = request.getParameter("email");
	String pass = request.getParameter("pass");
	
	Class.forName("com.mysql.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/college";
	String user = "root";
	String password = "123456";
	Connection conn = DriverManager.getConnection(url,user, password);
	PreparedStatement pst = conn.prepareStatement("insert into login values(?,?,?,?)");
	
	pst.setString(1, naam);
	pst.setString(2, phone);
	pst.setString(3, email);
	pst.setString(4, pass);

	int i = pst.executeUpdate();
	if (i > 0) {
		out.println("CONGRATULATIONS <br> You have  Registered sucessfully");
	} else {
		out.println("OOPS!!! <br> Try again");
	}
	out.close();
} catch (Exception e) {
	out.print(e.getMessage());
}

%>

</body>
</html>
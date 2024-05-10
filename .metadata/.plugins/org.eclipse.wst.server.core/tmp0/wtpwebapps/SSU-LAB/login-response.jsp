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
<title>LOG IN RESPONSE</title>
</head>
<body>
<%
try{
	String e1 = request.getParameter("e1");
	String p1 = request.getParameter("p1");
	String url = "jdbc:mysql://localhost:3306/college";
	String user = "root";
	String password = "123456";
	String query="SELECT email_id, pass FROM login WHERE email_id=? AND pass=?";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,user,password);
	
	PreparedStatement pst = con.prepareStatement(query);
	pst.setString(1, e1);
	pst.setString(2, p1);
	ResultSet rs = pst.executeQuery();
	
	if(rs.next()){
		out.println("CONGRATS \nLOG IN SUCESSFULL ");
	}else{
		out.print("Something went wrong !!!\n plz try again");
	}
	
}catch(Exception e){
	out.print(e.getMessage());
}

%>

</body>
</html>
package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class create {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/college";
		String user = "root";
		String pswd = "123456";
		String query = "INSERT INTO student VALUES (21, \"Satyabrata Jena\", 26)";
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection(url, user, pswd);
	Statement st = con.createStatement();
	int count =  st.executeUpdate(query);
	
	System.out.println(count + " rows affecetd");
	
   
	
	st.close();
	con.close();
	

	}

}

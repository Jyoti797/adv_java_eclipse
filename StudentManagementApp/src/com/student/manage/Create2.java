package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Create2 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/college";
		String user = "root";
		String pswd = "123456";
		
		int roll_num = 22 ;
		String name = "Riteek Kumar Pareek";
		int age = 23;
		
		String query = "INSERT INTO student VALUES (?,?,?)";
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection(url, user, pswd);
    PreparedStatement st = con.prepareStatement(query);
    st.setInt(1, roll_num);
    st.setString(2, name);
    st.setInt(3, age);
	int count =  st.executeUpdate();
	
	System.out.println(count + " rows affecetd");
	
	st.close();
	con.close();
	
	}
}

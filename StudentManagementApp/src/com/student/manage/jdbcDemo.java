package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo {

	public static void main(String[] args) throws Exception{
		StudentDAO dao = new StudentDAO();
		Student s1 = dao.getStudent(5);
		System.out.println(s1.name);

	}
}
class StudentDAO {
	public Student getStudent(int rollNum) throws Exception {
		Student s = new Student();
		s.rollNum = rollNum;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		String url ="jdbc:mysql://localhost:3306/invoicing";
		String user = "root";
		String pswd = "123456";
		String query = "SELECT name FROM student WHERE  roll_num = " + rollNum;
		Connection con = DriverManager.getConnection(url, user, pswd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("1");
		s.name = name;
		System.out.println();
		return s;
	}
	return null;
}
class Student{
	int rollNum;
	String name;
	
}

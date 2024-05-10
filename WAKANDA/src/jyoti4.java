import java.sql.*;
import java.io.*;


public class jyoti4 {

//store a image to database
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			String url = "jdbc:mysql://localhost:3306/college";
			String user = "root";
			String pass = "123456";
			Connection con=DriverManager.getConnection(url,user,pass); 
			
			String query = "insert into images(pic) values(?)";
			PreparedStatement ps = con.prepareStatement(query);
			
			FileInputStream fis = new FileInputStream("D:/adv_java_eclipse/WAKANDA/src/jyoti7.jpg");
			
			ps.setBinaryStream(1,fis,fis.available());
			ps.executeUpdate();
			
			System.out.println("Done...........");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}

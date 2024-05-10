import java.sql.*;
import java.io.*;

public class jyoti3 {
	
//insert data from terminal and store into database

	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			String url = "jdbc:mysql://localhost:3306/college";
			String user = "root";
			String pass = "123456";
			Connection con=DriverManager.getConnection(url,user,pass);  
		  
			Statement st=con.createStatement();
			String query = "insert into childhood_friends(name, school, college) values(?,?,?)";
		
			PreparedStatement ps = con.prepareStatement(query);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name of your friend");
			String name = br.readLine();
			System.out.println("Enter school of your friend");
			String school = br.readLine();
			System.out.println("Enter college of your friend");
			String college = br.readLine();
			
			ps.setString(1, name);
			ps.setString(2, school);
			ps.setString(3, college);
			ps.executeUpdate();
			
			System.err.println("1 row inserted");
			
			
			con.close();
		 
			}catch(Exception e)
		{ 
				System.out.println(e);
		}  

	}

}

import java.sql.*;

public class Jyoti1 {
//create table in a database
	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			String url = "jdbc:mysql://localhost:3306/college";
			String user = "root";
			String pass = "123456";
			Connection con=DriverManager.getConnection(url,user,pass);  
		  
			Statement st=con.createStatement();
			String query = "create table childhood_friends(name varchar(50), school varchar(50), college varchar(50))";
			st.executeUpdate(query);  
			System.out.println("Table created in database....");
			con.close();
		 
			}catch(Exception e)
		{ 
				System.out.println(e);
		}  


	}

}

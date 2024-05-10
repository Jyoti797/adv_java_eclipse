import java.sql.*;
	
	
public class jyoti2 {
//insert values into database
	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			String url = "jdbc:mysql://localhost:3306/college";
			String user = "root";
			String pass = "123456";
			Connection con=DriverManager.getConnection(url,user,pass);  
		  
			Statement st=con.createStatement();
			String query = "insert into childhood_friends(name, school, college) values(?,?,?)";
			String name = "Debabrata Swain";
			String school = "Matrubhawan School";
			String college = "J.K.B.K GOVT College";
			PreparedStatement ps = con.prepareStatement(query);
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

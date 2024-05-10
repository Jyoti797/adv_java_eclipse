import java.sql.*;


public class adarsha {

	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			String url = "jdbc:mysql://localhost:3306/college";
			String user = "root";
			String pass = "123456";
			Connection con=DriverManager.getConnection(url,user,pass);  
		  
			Statement st=con.createStatement();
			String query = "select * from student";
			ResultSet rs=st.executeQuery(query);  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}catch(Exception e)
		{ 
				System.out.println(e);
		}  

	}

}

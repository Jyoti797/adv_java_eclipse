import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider {
	public static Connection con ;
	public static Connection getConnection() {
	try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/college";
			String user = "root";
			String pass = "123456";
			con = DriverManager.getConnection(url,user,pass);
		
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
		return con;
	}
	

}

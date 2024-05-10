import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class login{
	public static void main(String[] args) {
	try {
		String url = "jdbc:mysql://localhost:3306/college";
		String user = "root";
		String pswd = "123456";
		
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection(url, user, pswd);
	
	String query="SELECT email_id, pass FROM login WHERE email_id=? AND pass=?";
	
	PreparedStatement pst = con.prepareStatement(query);
	pst.setString(1, );

	
	st.close();
	con.close();
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
}
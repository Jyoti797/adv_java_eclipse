
import java.sql.*;


public class Read {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/invoicing";
		String user = "root";
		String pswd = "123456";
		String query = "SELECT * FROM clients";
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection(url, user, pswd);
	Statement st = con.createStatement();
	ResultSet rs =  st.executeQuery(query);
	
	String userData = "";
	
    while(rs.next()) {
    	
        userData = rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getString(4) + " : " + rs.getString(5) + " : " + rs.getString(6);
    	System.out.println(userData);
	
     }
	
	st.close();
	con.close();
	

	}

}

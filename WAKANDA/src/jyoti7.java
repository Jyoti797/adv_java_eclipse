import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class jyoti7 {

	public static void main(String[] args) {
	try {
		Connection con = ConnectionProvider.getConnection();
		
		String query = "select * from student";
		Statement st = con.createStatement();
		ResultSet rs =  st.executeQuery(query);
		while(rs.next()) {
			int rollNum = rs.getInt(1);
			String name = rs.getString(2);
			int age = rs.getInt(3);
			System.out.println(rollNum+" : "+name+" : "+age);
			
		}
		
		con.close();
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
		
	}

}

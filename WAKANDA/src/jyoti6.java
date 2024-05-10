import java.sql.*;
import java.io.*;
public class jyoti6 {
//update a table
	public static void main(String[] args) {
		try {
			Connection con = ConnectionProvider.getConnection();
			String query = "update student set  name=?, age=? where roll_num=? ";
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter new roll number");
			int roll_num = br.read();
			System.out.println("Enter new name");
			String name = br.readLine();
			System.out.println("Enter new age");
			int age = br.read();
		
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, roll_num);
			ps.setString(2, name);
			ps.setInt(3, age);
			
			
			ps.executeUpdate();
			System.out.println("Done............");
			
			con.close();
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
		
		
}

}

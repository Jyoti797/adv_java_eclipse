import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;



public class jyoti5 {

	public static void main(String[] args) {
		try {
			Connection c = ConnectionProvider.getConnection();
			
			String query = "insert into images(pic) values(?)";
			PreparedStatement ps =c.prepareStatement(query);
			
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(null);
			File f= jfc.getSelectedFile();
			FileInputStream fis =new FileInputSream(f);
			ps.setBinaryStream(1, fis, fis.available());
			ps.executeUpdate();
			
			System.out.println("Sucessfullllll............");
			
			
			
			
			ps.setBinaryStream(0, null);
			
			
			
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}

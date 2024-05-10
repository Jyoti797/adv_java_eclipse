import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Register3 extends HttpServlet {
	

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		
		String e1 = request.getParameter("e1");
	
		String p1 = request.getParameter("p1");
	

		try {
			Class.forName("com.mysql.jdbc.cj.Driver");
			String url = "jdbc:mysql://localhost:3306/college";
			String user = "root";
			String password = "123456";
			Connection conn = DriverManager.getConnection(url,user, password);
			PreparedStatement pst = conn.prepareStatement("insert into login values(?,?)");
			
			pst.setString(1, e1);
			pst.setString(2, p1);
		
			int i = pst.executeUpdate();
			if (i > 0) {
				out.println("<html><body><h1>CONGRATULATIONS <br> You have successfully Registered</h1></body></html>");
			} else {
				out.println("<html><body><h1>OOPS!!! <br> Try again</h1></body></html>");
			}
			out.close();
		} catch (Exception e) {
			out.print("<html><body>e.getMessage()</body></html>");
		}
	}
}

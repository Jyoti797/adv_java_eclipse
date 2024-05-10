
import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter pw = response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jyoti","root", "123456");
			//name of the database in MySql = jyoti
			//user in  MySQL = root
			//password in MySQL = 123456
			String name = request.getParameter("txtName");
			String pswd = request.getParameter("txtPassword");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM log_in WHERE user_id=? and pswd=?");
			ps.setString(1, name);
			ps.setString(2, pswd);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			}
			else {
				pw.println("<font color= red size=18>LogIn Failed !!!<br>");
				pw.println("<a href=login.jsp>TRY AGAIN</a>");
				
				
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Something went wrong");
			System.out.println(e);
		} catch (SQLException e) {
			
			System.out.println("Databse connectivity error");
			System.out.println(e);
		}
	}

}

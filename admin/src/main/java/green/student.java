package green;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String reg=request.getParameter("regno");
		String name=request.getParameter("name");
	 try {
		 PrintWriter pw=response.getWriter();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mass1","root","asara");		
		PreparedStatement ps=con.prepareStatement("select * from mass1.student;");
		 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
					if(rs.getString("regno").equals(reg)&&rs.getString("name").equals(name)){
						RequestDispatcher rd=request.getRequestDispatcher("student.jsp");
						rd.include(request, response)		;
	pw.write("regsno="+'\n'+rs.getString("regno"));
	pw.write("name:"+'\n'+rs.getString("name"));
	pw.write("tamil= "+'\n'+rs.getString("tamil"));
	pw.write("english= "+'\n'+rs.getString("english"));
	pw.write("maths= "+'\n'+rs.getString("maths"));
	pw.write(" science="+'\n'+rs.getString("science"));
	pw.write("social="+'\n'+rs.getString("social"));
	  break;
					}
			 
				
				}}
					catch (Exception e) {
		            e.printStackTrace();
		}
	
	}

}

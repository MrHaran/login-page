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

public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String regno=request.getParameter("regno");
		try {
			 PrintWriter pw=response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mass1","root","asara");		
			PreparedStatement ps=con.prepareStatement("select * from mass1.student;");
			 ResultSet rs=ps.executeQuery();
			 while(rs.next()) {
				 pw.write("regsno="+rs.getString("regno"));
					pw.write("name:"+rs.getString("name"));
					pw.write("tamil= "+rs.getString("tamil"));
					pw.write("english= "+rs.getString("english"));
					pw.write("maths= "+rs.getString("maths"));
					pw.write("science="+rs.getString("science"));
					pw.write("social="+rs.getString("social")+'\n');
					pw.write('\n');
									}
										
			 
				
				PreparedStatement pr=con.prepareStatement("delete  from mass1.student where regno=?;");
			
				 
				  pr.setString(1,regno);
				     if(true) {
				 		    pr.executeUpdate();
				 		    response.setContentType("text/html");
				 		  pw.write("Successful Deleted");
				 		  RequestDispatcher rq=request.getRequestDispatcher("delete.jsp");
						    rq.include(request, response);
						      
				 		     }
						}
									catch (Exception e) {
						            e.printStackTrace();
						}
		
	 try {
		
							
					}
								catch (Exception e) {
					            e.printStackTrace();
					}
		 }
	}

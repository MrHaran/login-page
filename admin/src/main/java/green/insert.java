package green;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String no=request.getParameter("regno");
	  		 String name=request.getParameter("name");
	  		 String mark1=request.getParameter("tamil");
	  		 String mark2=request.getParameter("english");
	  		 String mark3 =request.getParameter("maths");
	  		 String mark4=request.getParameter("science");
	  		String mark5=request.getParameter("social");
	  		System.out.println("hhh");
	  		  try {
	  			 PrintWriter pw=response.getWriter();
	  			Class.forName("com.mysql.cj.jdbc.Driver");
	  			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mass1","root","asara");		
				PreparedStatement ps=con.prepareStatement("insert into mass1.student values(?,?,?,?,?,?,?) ");
	  		    ps.setString(1,no);
	  		    ps.setString(2,name);
	  		    ps.setString(3,mark1);
	  		    ps.setString(4,mark2);
	  		    ps.setString(5,mark3);
	  		    ps.setString(6,mark4);
	  		    ps.setString(7, mark5);
	  		    System.out.println("hhh");
	  		     if(true) {
	  		    ps.executeUpdate();
	  		    response.setContentType("text/html");
	  		  pw.write("Successful inserted");
	  		  RequestDispatcher rq=request.getRequestDispatcher("insert.jsp");
	 		    rq.include(request, response);
	 		      
	  		     }
	 		    
	  		       
	  		     
	  		    
	  		    
	  		  } catch (Exception e) {
	  			
	  			e.printStackTrace();
	  		}
	  		
	}

}

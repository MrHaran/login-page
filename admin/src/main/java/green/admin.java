package green;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class admin
 */
public class admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String s="hariharan";
	String s1="124@";
	String name= request.getParameter("name");
	String pass= request.getParameter("pass");
	if(request.getParameter("name").equals(s)&&request.getParameter("pass").equals(s1)) {
		RequestDispatcher rd=request.getRequestDispatcher("admin1.jsp");
		rd.include(request, response)	;
	}
	else {
		 PrintWriter pw=response.getWriter();
		 pw.write("invalid password or name");
	}
	}

}

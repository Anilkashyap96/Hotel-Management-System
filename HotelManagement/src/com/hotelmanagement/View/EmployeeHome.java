package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EmployeeHome
 */
@WebServlet("/EmployeeHome")
public class EmployeeHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	PrintWriter out=response.getWriter();
	
	   out.println("<html>") ;
	  // HttpSession s=request.getSession(false);
	   try{
	//	  out.println("<h4><font color=green>EmployeeId:"+s.getValue("SEID").toString()+"["+s.getValue("SEN").toString()+"]</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+s.getValue("LDATE").toString()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=EmployeeLogout>Logout</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=pic/"+s.getValue("SPIC").toString()+"width=50 height=50></h4><hr color=red>");
		   
		   out.println("<tr><td><a href=EmployeeHome>Home</a><br><a href=CheckAvailability>Check Availability</a><br><a href=# >Check Out</a><br><a href=EmployeeLogout target=mw> Logout</a></td>");
      //  out.println("<td valigin=top><iframe frameborder=0 width=500 height=800 name=mw></iframe></td></tr>");
        out.println("</html>");
	   out.flush();
	   }catch(Exception e){
		  response.sendRedirect("EmployeeLogin");
	   }
	
	}

}

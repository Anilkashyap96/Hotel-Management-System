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
 * Servlet implementation class AdminHome
 */
@WebServlet("/AdminHome")
public class AdminHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminHome() {
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
	  HttpSession ses=request.getSession(false);
	  
	  out.println("<html>");  
	  try{
		  
		  String nvb="<h3><font color=green>Admin Id:"+ses.getValue("SAID").toString()+"</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("LDATE").toString()+"&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=AdminLogout>Logout</a><br><hr color=red></h3>";
		  out.println(nvb);	
		  out.println("<head>");
			out.println("		<link href='design/assets/css/bootstrap.min.css' rel='stylesheet'>");
			out.println("		<link href='design/assets/font/css/font-awesome.min.css' rel='stylesheet'>");
			out.println("		<link href='design/assets/css/style.css' rel='stylesheet'>");
			out.println("		<link href='design/assets/css/style-responsive.css' rel='stylesheet'>");
			out.println(" 	</head>");
			
	  out.println("<script src=asset/jquery-2.2.1.min.js></script>");
      
	  out.println("<body class='bcgimg'>");
		out.println("		<div class='bcgimg'>");
		//out.println("<img src='WebContent/Pic/hotel.jpg' class='img-respons' alt='Responsive image'");
		out.println("		</div>");
    out.println("<table>");
    out.println("<tr valign=top><td><a href=AdminHome target=mw>Home</a><br>&nbsp;&nbsp;&nbsp;&nbsp;<a href=EmployeeInterface  target=mw>Employee Registration</a><br>&nbsp;&nbsp;&nbsp;&nbsp;<a href=CreateRoom target=mw>Create Rooms</a><br>&nbsp;&nbsp;&nbsp;&nbsp;<a href=Reports target=mw>Reports</a><br>&nbsp;&nbsp;&nbsp;&nbsp;<a href=# target=mw>Rules and Regulations</a><br>&nbsp;&nbsp;&nbsp;&nbsp;<a href=AdminLogout target=mw>Logout</a></td>");
		
	out.println("<td valign=top><iframe frameborder=0 width=1400 height=800 name=mw></iframe></td></tr>");
	out.println("</table>");
	  }catch(Exception e){
		  response.sendRedirect("Adminlogin");

	  }
	  out.print("</body>");
	  out.println("</html>");
	  out.flush();
	}

}

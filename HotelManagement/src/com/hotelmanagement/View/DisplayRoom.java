package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotelmanagement.DAO.RoomDAO;

/**
 * Servlet implementation class DisplayRoom
 */
@WebServlet("/DisplayRoom")
public class DisplayRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayRoom() {
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
		 out.println("<script src=assest/jquery-2.2.1.min.js></script>");
			out.println("<head><link href='design/assets/css/bootstrap.min.css' rel='stylesheet'></head>");
			out.println("<head>");
			out.println("		<link href='design/assets/css/bootstrap.min.css' rel='stylesheet'>");
			out.println("		<link href='design/assets/css/style.css' rel='stylesheet'>");
			out.println("		<link href='design/assets/css/style-responsive.css' rel='stylesheet'>");
			out.println("	</head>");
		 out.println("<script src=DisplayRoom.js></script>");
		
		 out.println("<html><form>");
		 out.println("<table><caption><b>List</b></caption>");
		 out.println("<tr><td>Room Type</td><td><select name=roomtype id=roomtype><option value='singlebedroom'>Single Bed Room</option><option value='doublebedroom'>Double Bed Room</option><option value='familysuite'>family Suite</option></select></td><tr>");
		 out.println("<tr><td><input type=button value=Submit id=btn1></td></tr>");
	     out.println("</table>");
		 out.println("<br><span id=result1></span></br>");

		 out.println("</form></html>");
		 out.flush();
	
	}

}

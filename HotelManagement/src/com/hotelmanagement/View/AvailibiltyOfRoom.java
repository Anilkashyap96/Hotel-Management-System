package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotelmanagement.DAO.Custmor;

/**
 * Servlet implementation class AvailibiltyOfRoom
 */
@WebServlet("/AvailibiltyOfRoom")
public class AvailibiltyOfRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AvailibiltyOfRoom() {
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
		 out.println("<script src=DisplayRoom.js></script>");
		//out.println("<html><form action=AvailibilityOfRoomSubmit><table>");
		out.println("<tr><td>Room Type:</td><td><select name=roomtype id=roomtype><option value=\"singlebedroom\">Single Bed Room</option><option value=\"doublebedroom\">Double Bed Room</option><option value=\"familysuiteroom\">Family Suite Room</option><option value=\"grandsuiteroom\">Grand Suite Room</option></td></tr>");
		 out.println("<tr><td><br><input type=button value=Submit id=btn></td></tr>");
		 out.println("</table>");
		 out.println("<br><span id=result></span></br>");

		 out.println("</form></html>");
		 out.flush();
	
	
	
	}

	

}

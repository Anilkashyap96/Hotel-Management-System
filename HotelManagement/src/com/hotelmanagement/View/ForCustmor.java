package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForCustmor
 */
@WebServlet("/ForCustmor")
public class ForCustmor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForCustmor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());

	
	PrintWriter out=response.getWriter();
		out.println("<head><link href='design/assets/css/bootstrap.min.css' rel='stylesheet'></head>");
		  out.println("<script src=asset/jquery-2.2.1.min.js></script>");
	      
		  
	    out.println("<html><table>");
	    out.println("<tr><td><a href=RoomBooking>Book For Room.....</a><br>&nbsp;&nbsp;&nbsp;&nbsp;<a href=BookingInformation  >Show Room Booking</a></td></tr>");
	    out.println("</table></html>");
	    out.flush();
	
	}

}

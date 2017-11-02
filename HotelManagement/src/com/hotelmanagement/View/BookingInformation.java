package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookingInformation
 */
@WebServlet("/BookingInformation")
public class BookingInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingInformation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
		PrintWriter out=response.getWriter();
		out.println("<html><form action=MatchCustmornameAndPhoneNo method=Post>");
		out.println("<table><captioin><h3><i>Booking Information</i></h3></caption>");
	    out.println("<tr><td><b><i>Custmor Name:</i></b><input type=text name=custmorname size=40></td></tr>");
		out.println("<tr><td><b><i>Phone Number :</i></b><input type=text name=phoneno size=40></td></tr>");
		out.println("<tr><td><center><input type=submit value=LogIn></td></center></td>&nbsp;</td><tr>");
		out.println("</table></form></html>");
		
		out.flush();
	
	
	}

}

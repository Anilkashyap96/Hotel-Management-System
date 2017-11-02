package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RoomBooking
 */
@WebServlet("/RoomBooking")
public class RoomBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomBooking() {
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
	       out.println("<script src=Payment.js></script>");
		 
		out.println("<html><form action=RoomBookingSubmit><table>");
		out.println("<tr><td>Room No</td><td><select name=rno id=rno ><option value=\"1\">1</option><option value=\"2\">2</option><option value=\"3\">3</option><option value=\"4\">4</option><option value=\"5\">5</option><option value=\"6\">6</option><option value=\"7\">7</option><option value=\"8\">8</option></select></td><tr>");

	//	out.println("<tr><td>Room No:</td><td><input type=text name=rno id=rno required size=40></td></tr>");
		out.println("<tr><td>Room Type:</td><td><select name=rtype id=rtype><option value=\"singlebedroom\">Single Bed Room</option><option value=\"doublebedroom\">Double Bed Room</option><option value=\"familysuiteroom\">Family Suite Room</option><option value=\"grandsuiteroom\">Grand Suite Room</option></td></tr>");
		
		out.println("<tr><td>Price</td><td><select name=price id=price ><option value=\"1500\">1500</option><option value=\"2000\">2000</option><option value=\"3000\">3000</option></select></td><tr>");

		//out.println("<tr><td>Price:</td><td><input type=text name=price required size=40></td></tr>");
		out.println("<tr><td>Custmor Name:</td><td><input type=text name=custmorname required size=40></td></tr>");
		out.println("<tr><td>Age:</td><td><input type=text name=age required size=40></td></tr>");
		out.println("<tr><td>Gender:</td><td><input type=radio name=cg required value=Male>Male&nbsp;&nbsp;&nbsp;&nbsp;<input type=radio name=eg value=Female>Female</td></tr>");
		out.println("<tr><td>Address:</td><td><input type=textarea name=ca required rows=3 column=11 ></td></tr>");
		out.println("<tr><td>State:</td><td><input type=text name=cs required size=40></td></tr>");
		out.println("<tr><td>City:</td><td><input type=text name=cc required size=40></td></tr>");
		out.println("<tr><td>Contact:</td><td><input type=text name=ccon required size=40></td></tr>");
        out.println("<tr><td>Number Of Days:</td><td><input type=text required  name=bookingday size=40></td></tr>");
		
		out.println("<tr><td>Total Amount:</td><td><input type=text name=ta required size=40></td></tr>");

		
		out.println("<tr><td><input type=submit  id=btn1></td><td><input type=reset></td></tr>");
		out.println("<br><span id=result1></span>");
		out.println("</table></form></html>");
		
		out.flush();
	
	}

}

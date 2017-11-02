package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotelmanagement.DAO.Custmor;
import com.hotelmanagement.DAO.RoomDAO;

/**
 * Servlet implementation class Payment
 */
@WebServlet("/Payment")
public class Payment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Payment() {
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
	 out.println("<head><link href='design/assets/css/bootstrap.min.css' rel='stylesheet'></head>");	
	
	try{

		    	
		out.println("<html><form action=PaymentSubmit><table>");
		 out.println("<caption><b>Payment</b></caption>");
		
		out.println("<tr><td>Card Type:</td><td><select required name=ct><option value=\"visa\">Visa</option><option value=\"debitcard\">Debit Card</option><option value=\"mastercard\">Master Card</option><option value=\"creditcard\">Credit Card</option></td></tr>");
		
		out.println("<tr><td>Credit Card Number :</td><td><input type=text name=cardnumber required size=40></td></tr>");
		
		
		out.println("<tr><td>CVV:</td><td><input type=password required name=cvv size=3></td></tr>");
		
		
		
		out.println("<tr><td><input type=submit></td><td><input type=reset></td></tr>");
		out.println("</table></form></html>");
		
		out.flush();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	}

}

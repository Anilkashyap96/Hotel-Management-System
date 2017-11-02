package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FamilySuiteroom
 */
@WebServlet("/FamilySuiteroom")
public class FamilySuiteroom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FamilySuiteroom() {
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
		out.println("<html><form action=RoomSubmit><table>");
		out.println("<tr><td>Room No</td><td><select name=roomno ><option value=\"1\">1</option><option value=\"2\">2</option><option value=\"3\">3</option><option value=\"4\">4</option><option value=\"5\">5</option><option value=\"6\">6</option><option value=\"7\">7</option><option value=\"8\">8</option></select></td><tr>");
		out.println("<tr><td>Room Type<input type=text name=roomtype value=\"familysuite\"></tr>");
		out.println("<tr><td>Price<input type=text name=price></td></tr>");
		out.println("<tr><td><input type=submit></td></tr>");
		
		out.flush();
		
	}

}

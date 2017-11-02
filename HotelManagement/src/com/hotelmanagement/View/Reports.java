package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Reports
 */
@WebServlet("/Reports")
public class Reports extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reports() {
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
	 out.println("<html><table>");
	    out.println("<tr><td><br><a href=DisplayRoom>Display Room Details</a></br><a href=DisplayAllEmployee>Employee Details</a><br></td>");
			
		out.println("<td valign=top><iframe frameborder=0 width=800 height=800 name=mw></iframe></td></tr>");
		out.println("</table></html>");
			
		  out.flush();
	
	}

}

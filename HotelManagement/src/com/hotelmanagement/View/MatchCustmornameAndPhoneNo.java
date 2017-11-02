package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hotelmanagement.DAO.RoomDAO;

/**
 * Servlet implementation class MatchCustmornameAndPhoneNo
 */
@WebServlet("/MatchCustmornameAndPhoneNo")
public class MatchCustmornameAndPhoneNo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MatchCustmornameAndPhoneNo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		System.out.println("ji");
	try{
		ResultSet rs=RoomDAO.MatchCustmornameAndPhoneNo(request.getParameter("custmorname"),request.getParameter("phoneno"));
		System.out.println(rs.getString(1));	
		boolean st=RoomDAO.ConfirmPayment(request.getParameter("custmorname"),request.getParameter("phoneno"));
		System.out.println(st);
		out.println("<html><table>");
		if(st)
		{
			out.println("<tr><th>Room No</th>&nbsp;&nbsp;&nbsp;&nbsp;<th>Room Type</th>&nbsp;&nbsp;&nbsp;&nbsp;<th>Custmor Name</th>&nbsp;&nbsp;&nbsp;&nbsp;<th>Phone No</th>&nbsp;&nbsp;&nbsp;&nbsp;<th>City</th>&nbsp;&nbsp;&nbsp;&nbsp;<th>State</th>");
			out.println("<tr><td>"+rs.getString(1)+"</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>"+rs.getString(2)+"</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>"+rs.getString(4)+"</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>"+rs.getString(10)+"</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>"+rs.getString(9)+"</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>"+rs.getString(8)+"</td><tr>");
	        
		}
		else{
			out.println("<font color=red size=5>Invalid UserId/Password</font>");
			
		}
	}catch(Exception e)
	{}
		out.flush();
	
	
	
	}

}

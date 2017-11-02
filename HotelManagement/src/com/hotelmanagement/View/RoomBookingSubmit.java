package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotelmanagement.DAO.Custmor;
import com.hotelmanagement.Model.RoomBook;

/**
 * Servlet implementation class RoomBookingSubmit
 */
@WebServlet("/RoomBookingSubmit")
public class RoomBookingSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomBookingSubmit() {
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
	RoomBook RB=new RoomBook();
	
	RB.setRno(request.getParameter("rno"));
	RB.setRtype(request.getParameter("rtype"));
	RB.setPrice(request.getParameter("price"));
	RB.setCustmorname(request.getParameter("custmorname"));
	RB.setAge(request.getParameter("age"));
	RB.setGender(request.getParameter("cg"));
	RB.setAddress(request.getParameter("ca"));
	RB.setState(request.getParameter("cs"));
	RB.setCity(request.getParameter("cc"));
	RB.setContactno(request.getParameter("ccon"));
	RB.setNoofdaysbooking(request.getParameter("bookingday"));
	RB.setTotalamount(request.getParameter("ta"));
	boolean st=Custmor.RoomBookByCustmor(RB);
	out.println("<html>");
	if(st)
	{
		response.sendRedirect("Payment");
		
		
	}
	else
	{
		out.println("<font color=red>Fail to Record Submitted</font>");
		
	}

	
	}

}

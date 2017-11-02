package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotelmanagement.DAO.RoomDAO;
import com.hotelmanagement.Model.RoomBook;

/**
 * Servlet implementation class PaymentSubmit
 */
@WebServlet("/PaymentSubmit")
public class PaymentSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentSubmit() {
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
		RoomBook Pm=new RoomBook();
	Pm.setCardtype(request.getParameter("ct"));
	Pm.setCardno(request.getParameter("cardnumber"));
	Pm.setCvv(request.getParameter("cvv"));
	boolean st=RoomDAO.Payment(Pm);
	if(st)
	{
		out.println("<font color=green> Thank You For Enjoy Our Service</font>");
		
		
	}
	else
	{
		out.println("<font color=red>Fail to Record Submitted</font>");
		
	}
	
	}
	
	
	
	}



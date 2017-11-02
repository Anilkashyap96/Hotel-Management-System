package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hotelmanagement.DAO.AdminDAO;



/**
 * Servlet implementation class AdminCheckPassword
 */
@WebServlet("/AdminCheckPassword")
public class AdminCheckPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminCheckPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter out=response.getWriter();
		
		try{
			
			

		boolean st=AdminDAO.CheckPassword(request.getParameter("aid"), request.getParameter("pwd"));
		
		if(st)
		{
			HttpSession s=request.getSession(true);
				        s.putValue("SAID",request.getParameter("aid"));
	        s.putValue("LDATE",new java.util.Date());
	        response.sendRedirect("AdminHome");
		}
		else{
			out.println("<html><table><tr><font color=red size=5>Invalid Id/Password</font></tr><br> ");
			
			out.println("<tr><a href=AdminLogin><font color=Black size=5>Back</font></a></tr></table></html>");
		
			
		}
		}catch(Exception e)
		{}
		out.flush();
	}

}

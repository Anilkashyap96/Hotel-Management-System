package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hotelmanagement.DAO.EmployeeDAO;
import com.hotelmanagement.Model.Employee;

/**
 * Servlet implementation class EmployeeCheckPassword
 */
@WebServlet("/EmployeeCheckPassword")
public class EmployeeCheckPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeCheckPassword() {
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
	
	boolean st=EmployeeDAO.CheckPassword(request.getParameter("eid"),request.getParameter("pwd"));
	System.out.println(st);
	out.println("<html>");
	if(st)
	{
	//	out.println("<tr><a href=EmployeeHome><font color=Black size=5>EmployeeHome</font></a></tr></table>");
		response.sendRedirect("EmployeeHome");
	       	}
	else{
		out.println("<html><table><tr><font color=red size=5>Invalid UserId/Password</font></tr><br> ");
	
		out.println("<tr><a href=EmployeeLogin><font color=Black size=5>Back</font></a></tr></table></html>");
	
	}
	}catch(Exception e)
	{
	
	}
	
	out.flush();

	
	
	}

}

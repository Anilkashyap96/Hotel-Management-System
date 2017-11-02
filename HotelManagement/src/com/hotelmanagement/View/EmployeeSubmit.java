package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotelmanagement.DAO.EmployeeDAO;
import com.hotelmanagement.Model.Employee;

/**
 * Servlet implementation class EmployeeSubmit
 */
@WebServlet("/EmployeeSubmit")
public class EmployeeSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	PrintWriter out=response.getWriter();
	Employee E=new Employee();
	E.setEmployeeid(request.getParameter("eid"));
	E.setEmployeename(request.getParameter("en"));
	E.setFathersname(request.getParameter("efn"));
	E.setBirthdate(request.getParameter("dob"));
	E.setGender(request.getParameter("eg"));
	E.setAddress(request.getParameter("ea"));
	E.setState(request.getParameter("es"));
	E.setCity(request.getParameter("ec"));
	E.setContactno(request.getParameter("econ"));
	E.setMobileno(request.getParameter("emob"));
	E.setEmailid(request.getParameter("email"));
	E.setDateofjoining(request.getParameter("doj"));
	E.setQualification(request.getParameter("eq"));
	E.setDesignation(request.getParameter("ed"));
	E.setPhotograph(request.getParameter("epic"));
	E.setPassword(request.getParameter("epassword"));
	boolean st=EmployeeDAO.AddNewRecord(E);
	out.println("<html>");
	
	if(st)
	{
		out.println("<font color=Green>Record Submitted</font>");
		//response.sendRedirect("EmployeeHome");
		
	}
	else
	{
		out.println("<font color=red>Fail to Record Submitted</font>");
		
	}
	out.println("</html>");
 out.flush();
	}

}

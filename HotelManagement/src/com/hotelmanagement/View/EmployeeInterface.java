package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeInterface
 */
@WebServlet("/EmployeeInterface")
public class EmployeeInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeInterface() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	PrintWriter out=response.getWriter();
	 out.println("<head><link href='design/assets/css/bootstrap.min.css' rel='stylesheet'></head>");
	 out.println("<script src=assest/jquery-2.2.1.min.js></script>");
     out.println("<script src=asset/jquery.validate.min.js></script>");
     out.println("<script src=validate.js></script>");
     out.println("<script src=employee.js></script>");
     out.println("<script src=statecity.js></script>");
	
	out.println("<html><form action=EmployeeSubmit class='form-inline' role='form' enctype=multipart/form-data><table width=50px height=100px class='table'>");

	out.println("<a href=DisplayAllEmployee class='btn btn-primary'><b><i>Display All Employee</i></b></a>");
	out.println("<center><table class='table table-bordered'><caption><h3>Employee Register</h3></caption>");
	
	out.println("<tr><td>Employee Id:</td><td><input type=text name=eid required class='form-control' placeholder='Employee id' size=40></td></tr>");
	out.println("<tr><td>Employee Name:</td><td><input type=text name=en id=en required class='form-control' placeholder='Empployee Name' size=40></td></tr>");
	out.println("<tr><td>Father's Name:</td><td><input type=text name=efn required class='form-control' placeholder='Father Name' size=40></td></tr>");
	out.println("<tr><td>Birth Date:</td><td><input type=date name=dob required class='form-control' placeholder='Date Of Birth' size=40></td></tr>");
	out.println("<tr><td>Gender:</td><td><input type=radio name=eg required value=Male>Male&nbsp;&nbsp;&nbsp;&nbsp;<input type=radio name=eg value=Female>Female</td></tr>");
	out.println("<tr><td>Address:</td><td><input type=textarea name=ea required rows=6 column=40 class='form-control' placeholder='Address' ></td></tr>");
	 out.println("<tr><td>State:</td><td><input type=text name=es id=state class='form-control'></select></td></tr>");
     out.println("<tr><td>City:</td><td><input type=text name=ec id=city class='form-control'></select></td></tr>");
    out.println("<tr><td>Contact:</td><td><input type=text name=econ required class='form-control' placeholder='Contact Number' size=40></td></tr>");
	out.println("<tr><td>Mobile No:</td><td><input type=text name=emob id=emob required class='form-control' placeholder='Mobile Number' size=40></td></tr>");
	out.println("<tr><td>Email Id:</td><td><input type=email name=email class='form-control' required placeholder='Email' size=40></td></tr>");
	out.println("<tr><td>Date Of Joining:</td><td><input type=date name=doj class='form-control' required placeholder='Date Of Joining' size=40></td></tr>");
	out.println("<tr><td><b><i>Qualification:</i></b></td><td><textarea  name=eq rows=3 class='form-control' cols=40></textarea></td></tr>");
    
	out.println("<tr><td>Designation:</td><td><input type=text name=ed class='form-control' required placeholder='Designation' size=40></td></tr>");
	out.println("<tr><td>PhotoGraph:</td><td><input type=file name=epic size=40 required placeholder='Photograph'></td></tr>");
	out.println("<tr><td>Password:</td><td><input type=password name=epassword required class='form-control' placeholder='Passsword' size=40></td></tr>");
	
	out.println("<tr><td>&nbsp;&nbsp;<input type=submit class='btn btn-info'></td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=reset class='btn btn-danger'></td></tr>");
	out.println("</form></html>");
	
	out.flush();
	}

}

package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeLogin
 */
@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeLogin() {
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
	 out.println("<html lang='en'>");
		out.println("<head>");
		out.println("		<link href='design/assets/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("		<link href='design/assets/css/style.css' rel='stylesheet'>");
		out.println("		<link href='design/assets/css/style-responsive.css' rel='stylesheet'>");
		out.println("	</head>");
		out.println("	<body class='logout tooltips'>");
		out.println("		<div class='login-header text-center'>");
		out.println("			<img src='design/assets/img/h2.jpg' class='img-rounded'alt='Cinque Terre' width='450' height='300'>");
		out.println("		</div>");
		out.println("		<div class='login-wrapper'>");
	
		out.println("			<form role='form' action=EmployeeCheckPassword method=post>");
		
	
		
		out.println("				<div class='form-group has-feedback lg left-feedback no-label'>");
	
		out.println("<input type='text' class='form-control no-border input-lg rounded' name=eid placeholder='Enter Employee ID' autofocus>");
		out.println("  <span class='fa fa-user form-control-feedback'></span>");
		out.println("	</div>");

		out.println("				<div class='form-group has-feedback lg left-feedback no-label'>");
		out.println("				  <input type='password' class='form-control no-border input-lg rounded' name=pwd placeholder='Enter password'>");
		out.println("				  <span class='fa fa-unlock-alt form-control-feedback'></span>");
		out.println("				</div>");
		out.println("				<div class='form-group'>");
		out.println("				  <div class='checkbox'>");
		out.println("");
		out.println("				  </div>");
		out.println("				</div>");
		out.println("				<div class='form-group'>");
		out.println("					<button type='submit' class='btn btn-info btn-block'>LOGIN</button>");
		out.println("				</div>");
		out.println("			</form>");
		
		out.println("		</div><!-- /.login-wrapper -->");
		out.println("		<script src='design/assets/js/jquery.min.js'></script>");
		out.println("		<script src='design/assets/js/bootstrap.min.js'></script>");
		out.println("		<script src='design/assets/js/full-calendar.js'></script>");
		out.println("		<script src='design/assets/js/demo-panel-login.js'></script>");
		out.println("	</body>");
		out.println("</html>");
	
	out.flush();
	
	}

}

package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotelmanagement.DAO.EmployeeDAO;

/**
 * Servlet implementation class DisplayAllEmployee
 */
@WebServlet("/DisplayAllEmployee")
public class DisplayAllEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllEmployee() {
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
	try{
	ResultSet rs=EmployeeDAO.DisplayAllEmpoyee();
	out.println("<html>");
	if(rs.next())
	{
		out.println("<table>");
		out.println("<tr><th>EmployeeId<br>Name</th><th>DOB<br>Gender</th><th>Address</th><th>Contact</th><th>Joining<br>Qualification</th><th>Photograph</th></tr>");
		do{
			String g="";
			if(rs.getString(5).equals("Female"))
			{
				
				g=" d/o ";
				
			}
			else{
		
				g="s/o";
			}
			out.println("<tr><td>"+rs.getString(1)+"<br>"+rs.getString(2)+g+rs.getString(3)+"</td><td>"+rs.getString(4)+"<br>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"<br>"+rs.getString(7)+","+rs.getString(8)+"</td><td>Landline:"+rs.getString(9)+"<br>Mobile:"+rs.getString(10)+"<br>"+rs.getString(11)+"</td><td>"+rs.getString(12)+"<br>"+rs.getString(13)+"</td><td><img src=pic/"+rs.getString(15)+" width=60 height=60><br>["+rs.getString(14)+"]</td></tr>");
		}while(rs.next());
		rs.close();
	}
	else
	{
		out.println("Record not found......");
	}
	out.println("</html>");
	}catch(Exception e){
		System.out.println(e);
		
	}
	
	
	
	
	
	}

}

package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotelmanagement.DAO.RoomDAO;
import com.hotelmanagement.Model.Room;

/**
 * Servlet implementation class SingleBedRoomSubmit
 */
@WebServlet("/SingleBedRoomSubmit")
public class SingleBedRoomSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SingleBedRoomSubmit() {
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
		Room R=new Room();
		R.setRoomno(request.getParameter("roomno"));
		R.setRoomtype(request.getParameter("roomtype"));
		R.setPrice(request.getParameter("price"));
	
		boolean st=RoomDAO.AddRoomRecord(R);
		out.println("<html>");
		
		if(st)
		{
			out.println("<font color=Green>Room has been Created</font>");
			out.println("<table><tr><a href=AdminHome>Back</a>");
			
		}
		else
		{
			out.println("<font color=red>Fail to Record Submitted</font>");
			
		}
		out.println("</html>");
	 out.flush();
	}

}

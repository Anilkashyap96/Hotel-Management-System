package com.hotelmanagement.View;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.hotelmanagement.DAO.DBHelper;
import com.hotelmanagement.DAO.StateCityDAO;


/**
 * Servlet implementation class FetchAllCitiesByStateIdJSON
 */
@WebServlet("/FetchAllCitiesByStateIdJSON")
public class FetchAllCitiesByStateIdJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchAllCitiesByStateIdJSON() {
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
		try{
			ResultSet rs=StateCityDAO.DisplayAllCities(request.getParameter("sid"));
			ArrayList <JSONObject>list=DBHelper.getFormateResult(rs);
			out.println(list);
		}catch(Exception e){}
	
	}

}

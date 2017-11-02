package com.hotelmanagement.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class AdminDAO {

	
	static String p="jdbc:mysql://localhost:3306/hotelmanagement";
	public static boolean CheckPassword(String aid,String pwd)
	{
		try{
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn=DriverManager.getConnection(p,"root","123");
			String q="select * from admin where adminid='"+aid+"'and password='"+pwd+"'";
			ResultSet Rs=DBHelper.executeQuery(cn, q);
			
			if(Rs.next())
			{
				return true;
			}
			return false;
		}catch(Exception e){
			System.out.println(e);
			return false;
		}
		
	}
	
}

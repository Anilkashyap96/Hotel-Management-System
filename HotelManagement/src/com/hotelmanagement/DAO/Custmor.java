package com.hotelmanagement.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.hotelmanagement.Model.RoomBook;

public class Custmor {
	
	static String provider="jdbc:mysql://localhost:3306/hotelmanagement";
	public static boolean RoomBookByCustmor( RoomBook RB)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn=DriverManager.getConnection(provider,"root","123");
			String query="insert into custmor values('"+RB.getRno()+"','"+RB.getRtype()+"','"+RB.getPrice()+"','"+RB.getCustmorname()+"','"+RB.getAge()+"','"+RB.getGender()+"','"+RB.getAddress()+"','"+RB.getState()+"','"+RB.getCity()+"','"+RB.getContactno()+"','"+RB.getNoofdaysbooking()+"','"+RB.getTotalamount()+"')"; 
		 boolean st=DBHelper.executeUpdate(cn, query);
		 return st;
			
			
		}catch(Exception e)
		{
			System.out.println(e);
			return false;
			
			
		}
	}
	
	 public static ResultSet DisplayBookRoom(String roomtype){
		   try{
			   Class.forName("com.mysql.jdbc.Driver").newInstance();
			   Connection cn=DriverManager.getConnection(provider,"root","123");
			   String query="select * from custmor where rtype='"+roomtype+"'";
			   System.out.println(query);
			   ResultSet rs=DBHelper.executeQuery(cn, query);
			    System.out.println(rs);
			   return rs;
		
			   
		   }catch(Exception e)
		   {
			   System.out.println(e);
			   return null;
		   }
		   
		   
	   }

//
	 
	   public static ResultSet DisplayRoomByType(String roomtype){
		   try{
			   Class.forName("com.mysql.jdbc.Driver").newInstance();
			   Connection cn=DriverManager.getConnection(provider,"root","123");
			   String query="select * from custmor where roomtype='"+roomtype+"'";
			   System.out.println(query);
			   ResultSet rs=DBHelper.executeQuery(cn, query);
			    System.out.println(rs);
			   return rs;
		
			   
		   }catch(Exception e)
		   {
			   System.out.println(e);
			   return null;
		   }
		   
		   
	   }


	 
	 //
	
}

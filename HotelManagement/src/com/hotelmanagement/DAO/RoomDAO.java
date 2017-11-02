package com.hotelmanagement.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.hotelmanagement.Model.Room;
import com.hotelmanagement.Model.RoomBook;

public class RoomDAO {
		static String provider="jdbc:mysql://localhost:3306/hotelmanagement";
		public static boolean AddRoomRecord(Room R)
		{
			try{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				Connection cn=DriverManager.getConnection(provider,"root","123");
				String query="insert into room values('"+R.getRoomno()+"','"+R.getRoomtype()+"','"+R.getPrice()+"')"; 
			 boolean st=DBHelper.executeUpdate(cn, query);
			 return st;
				
				
			}catch(Exception e)
			{
				System.out.println(e);
				return false;
				
				
			}
		}
		
		//
		  public static ResultSet DisplayRoom(String roomno){
			   try{
				   Class.forName("com.mysql.jdbc.Driver").newInstance();
				   Connection cn=DriverManager.getConnection(provider,"root","123");
				   String query="select * from room where roomno='"+roomno+"'";
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
				   String query="select * from room where roomtype='"+roomtype+"'";
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
public static boolean Payment(RoomBook Pm)
{
	try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection cn=DriverManager.getConnection(provider,"root","123");
		String query="insert into payment values('"+Pm.getCardtype()+"','"+Pm.getCardno()+"','"+Pm.getCvv()+"')"; 
	 boolean st=DBHelper.executeUpdate(cn, query);
	 return st;
		
		
	}catch(Exception e)
	{
		System.out.println(e);
		return false;
		
		
	}
}

//

public static boolean ConfirmPayment(String custmorname,String phoneno)
{
	try{
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection cn=DriverManager.getConnection(provider,"root","123");
		String q="select * from custmor where custmorname='"+custmorname+"'and ccon='"+phoneno+"'";
		ResultSet Rs=DBHelper.executeQuery(cn, q);
	 
		if(Rs.next()){
		   return true;
			
		}
			
		return false;
	 
		
	}catch(Exception e){
		System.out.println(e);
		return false;
	}
	
}


//
public static ResultSet MatchCustmornameAndPhoneNo(String custmorname,String phoneno)
{
	try{
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection cn=DriverManager.getConnection(provider,"root","123");
		String q="select * from custmor where custmorname='"+custmorname+"'and ccon='"+phoneno+"'";
		ResultSet Rs=DBHelper.executeQuery(cn, q);
	 
		 return Rs;
	 
	}catch(Exception e){
		System.out.println(e);
		return null;
	}
	
}


}
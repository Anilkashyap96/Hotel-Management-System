package com.hotelmanagement.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.hotelmanagement.DAO.DBHelper;
import com.hotelmanagement.Model.Employee;

public class EmployeeDAO {
	
	static String provider="jdbc:mysql://localhost:3306/hotelmanagement";
	public static boolean AddNewRecord( Employee E)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection cn=DriverManager.getConnection(provider,"root","123");
			String query="insert into employees values('"+E.getEmployeeid()+"','"+E.getEmployeename()+"','"+E.getFathersname()+"','"+E.getBirthdate()+"','"+E.getGender()+"','"+E.getAddress()+"','"+E.getState()+"','"+E.getCity()+"','"+E.getContactno()+"','"+E.getMobileno()+"','"+E.getEmailid()+"','"+E.getDateofjoining()+"','"+E.getQualification()+"','"+E.getDesignation()+"','"+E.getPhotograph()+"','"+E.getPassword()+"')"; 
		 boolean st=DBHelper.executeUpdate(cn, query);
		 return st;
			
			
		}catch(Exception e)
		{
			System.out.println(e);
			return false;
			
			
		}
	}
	
   public static ResultSet DisplayAllEmpoyee(){
	   try{
		   Class.forName("com.mysql.jdbc.Driver").newInstance();
		   Connection cn=DriverManager.getConnection(provider,"root","123");
		   String query="select * from employees ";
		   ResultSet rs=DBHelper.executeQuery(cn, query);
		   return rs;
		   
	   }catch(Exception e)
	   {
		   System.out.println(e);
		   return null;
	   }
	   
	   
   }
	
   public static boolean CheckPassword(String eid,String pwd)
	{
	  try{
		  Class.forName("com.mysql.jdbc.Driver").newInstance();
		  
		  Connection cn=DriverManager.getConnection(provider,"root","123");
		  String query="select * from employees where employeeid='"+eid+"' and password='"+pwd+"'";
		  System.out.println(query);
		  ResultSet rs=DBHelper.executeQuery(cn, query);
		  if(rs.next()){
			 
			  return true;
		  }  
		  
		return false;
	  }catch(Exception e){
		  System.out.println(e); 
		  return false;
	  }	
	
}
}
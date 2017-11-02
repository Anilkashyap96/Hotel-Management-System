package com.hotelmanagement.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import org.json.JSONObject;

public class DBHelper {
	
	
	public static boolean executeUpdate(Connection cn,String query)
	{
		try{
			Statement smt=cn.createStatement();
			smt.executeUpdate(query);
			return true;
			
		}catch(Exception e)
		{
			System.out.println(e);
			return false;
		}	
	}
	
	public static ResultSet executeQuery(Connection cn,String query)
	{
		try{
			Statement smt=cn.createStatement();
			ResultSet rs=smt.executeQuery(query);
			return rs;
		   }
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}	
	}
	
	
	 public static ArrayList<JSONObject> getFormateResult(ResultSet rs)
	 {
		 ArrayList<JSONObject> resList=new ArrayList<JSONObject>();
		 try{
			 ResultSetMetaData rsmeta=rs.getMetaData();
			 int columncount=rsmeta.getColumnCount();
			 ArrayList<String>  columnNames=new ArrayList<String>();
			 for(int i=1;i<=columncount;i++)
			 {
				 columnNames.add(rsmeta.getColumnName(i).toString());
			 }
			 while(rs.next())
			 {
				 JSONObject obj=new JSONObject();
				 for(int i=1;i<=columncount;i++)
				 {
					 String key=columnNames.get(i-1);
					 String value=rs.getString(i);
					 obj.put(key, value);
				}
				 resList.add(obj);
			 }
		 }catch(Exception e){
			 e.printStackTrace();
			 
		 }
		 finally{
			 try{rs.close();}
			 catch(Exception e)
			 {
				e.printStackTrace();
			 }
		 }
		 return resList;
		 
	 }
}

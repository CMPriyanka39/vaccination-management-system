package com.ceras.dao;
import com.ceras.dao.*;
//import java.EclipseGui.DashBoard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
/*
public class DataDash
{
	private static final long serialVersionUID = 1L;
	private static String driver="com.mysql.jdbc.Driver"; 
	  private static String url="jdbc:mysql:///vaccination";
	  private static String user="root";
	  private static String pwd = null;
	  

		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Statement st=null;
		
	
	public void insertIntoDashBoard(ArrayList<String> al)
	{

		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pwd);
			st=con.createStatement();
			
			String query  = "INSERT INTO `vaccine`(`Adhaar`, `Date`, `VaccineType`, `vaccineCenter`) VALUES (?,?,?,?)";
			ps=con.prepareStatement(query);
			
			ps.setString(1,al.get(0));
			ps.setString(2,al.get(1));
			ps.setString(3,al.get(2));
			ps.setString(4,al.get(3));
			
			int updateCount = ps.executeUpdate();
			System.out.println(updateCount);
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
*/		


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BookingDB
{
	
	private static String driver="com.mysql.jdbc.Driver"; 
	  private static String url="jdbc:mysql:///dashboard";
	  private static String user="root";
	  private static String pwd=null;
	  
	  
	  public void insertDashboardDB(ArrayList<String> al)
	  {
		  
			Connection con=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			Statement st=null;
			
			
			try{
				Class.forName(driver);
				con=DriverManager.getConnection(url,user,pwd);
				st=con.createStatement();
				
				String query  = "INSERT INTO `bookingdetails`(`AdharNo`, `dateofbirth`, `Vaccinetype`, `centre`) VALUES (?,?,?,?)";

				 ps=con.prepareStatement(query);
				
				
			 

				ps.setString(1,al.get(0));      
				ps.setString(2,al.get(1));
				ps.setString(3,al.get(2));
				ps.setString(4,al.get(3));

				int updateCount = ps.executeUpdate();
				System.out.println(updateCount);
			

			}
				catch(Exception ex) 
			{
					JOptionPane.showMessageDialog(null,"Error");
					}
			
		  								   
		}
					
		
	}
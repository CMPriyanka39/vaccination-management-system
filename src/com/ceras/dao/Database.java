package com.ceras.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import RegisterationForm;

public class Database {
	private static final long serialVersionUID = 1L;
	private static String driver="com.mysql.jdbc.Driver"; 
	  private static String url="jdbc:mysql:///registeration form";
	  private static String user="root";
	  private static String pwd=null;
	
		
	public void insertIntoReg(ArrayList<String> al)
	{

		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Statement st=null;
		
		
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pwd);
			st=con.createStatement();
			
			String query = "INSERT INTO `registeration_info`(`First Name`, `Last Name`, `Phone Number`, `Email`, `DOB`, `Gender`, `Address`, `Password`) VALUES (?,?,?,?,?,?,?,?)";
			
			 ps=con.prepareStatement(query);
			
			
		 

			ps.setString(1,al.get(0));      
			ps.setString(2,al.get(1));
			ps.setString(3,al.get(2));
			ps.setString(4,al.get(3));
			
			ps.setString(5,al.get(4));
			 
			ps.setString(6,al.get(5));
			ps.setString(7,al.get(6));
			ps.setString(8,al.get(7));
			
			
			
			int updateCount = ps.executeUpdate();
			System.out.println(updateCount);
		

		}
			catch(Exception ex) {
				JOptionPane.showMessageDialog(null,ex);
				}
		
			
		 

		
		
	      
		
		  								   
	}
				
	
}

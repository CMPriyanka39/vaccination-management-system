package com.ceras.dao;
import java.sql.*;
import javax.swing.*;
public class SqlConnection {
	
	Connection con=null;
	public static Connection viewConnector()
	{
		 try
		 {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql:///dashboard");
			 JOptionPane.showMessageDialog(null, "Connection created");
			 return con;
		 }
		 catch(Exception ex) 
			{
			 JOptionPane.showMessageDialog(null, ex);
				return null;
         }
	}

}

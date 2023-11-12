package com.ceras.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseLogin {
	static Connection con;
	 private static String url="jdbc:mysql:///registeration form";
     private static String user="root";
     private static String pwd=null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection(url,user,pwd);
			 return con;
		}catch(Exception ex){
			System.out.println(" "+ex);
			
			}
		return con;
	}

}
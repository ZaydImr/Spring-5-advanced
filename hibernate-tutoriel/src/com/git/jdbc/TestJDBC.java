package com.git.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost/db_user_tracker";
		String user = "root";
		String pass = "";
		
		try {
		
			Connection connection = DriverManager.getConnection(url,user,pass);
			System.out.println("Connection successfully :)");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

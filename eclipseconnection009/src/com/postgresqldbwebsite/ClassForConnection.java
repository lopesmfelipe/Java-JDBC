package com.postgresqldbwebsite;

import java.sql.Connection;

import java.sql.DriverManager;

public class ClassForConnection {
	
	static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	static final String USER = "postgres";
	static final String PASSWORD = "1234567";
	
	public Connection methodForConnection () {
		Connection objConn = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			objConn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			if (objConn != null) {
				System.out.println("CONNECTINO ESTABLISHED");
			} else {
				System.out.println("CONNECTION NOT ESTABLISHED");
			}
			
		} catch (Exception n) {
			System.out.println(n);
		}
		
		return objConn;
		
	}
	
}

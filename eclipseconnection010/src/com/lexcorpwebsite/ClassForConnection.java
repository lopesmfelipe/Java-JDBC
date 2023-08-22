package com.lexcorpwebsite;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClassForConnection {
	
	static final String URL = "jdbc:postgresql://localhost:5432/lexcorp";
	static final String USER = "postgres";
	static final String PASS = "1234567";
	
	public Connection methodForCon () {
		
		Connection objConn = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			objConn = DriverManager.getConnection(URL, USER, PASS);
			
			if (objConn != null) {
				System.out.println("Connection ESTABLISHED");
			} else {
				System.out.println("Connection NOT established");
			}
			
		} catch (Exception m) {
			System.out.println(m);
		}
		
		return objConn;
				
	}
	
}

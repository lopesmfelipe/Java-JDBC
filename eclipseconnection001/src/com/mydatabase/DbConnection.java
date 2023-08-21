package com.mydatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	static final String URL = "jdbc:postgresql://localhost:5432/thedeliver";
	static final String USER = "postgres";
	static final String PASSWORD = "1234567";
	
	
	public Connection toConne() {  // this method can only return something from 'Connection' class
		
			Connection myConn = null;
		try {
			Class.forName("org.postgresql.Driver");
			myConn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			if (myConn != null) {
				System.out.println("CONNECTION ON");
			} else {
				System.out.println("CONNECTION OFF");
			}
			
		} catch (Exception i) {
			System.out.println(i);
		}
		
		return myConn;
	}
	
}

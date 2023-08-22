package com.postgresdatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionWithDb {
	
	static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	static final String USER = "postgres";
	static final String PASSWORD = "1234567";
	
	public Connection connectionMethod () {
		
		Connection objectConn = null;
		
		try {
			
			Class.forName("org.postgresql.Driver");
			objectConn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			if (objectConn != null) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
			
		} catch (Exception z) {
			System.out.println(z);
		}
		
		return objectConn;
		
	}
	
	
	
}

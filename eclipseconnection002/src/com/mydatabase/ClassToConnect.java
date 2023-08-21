package com.mydatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClassToConnect {
	
	static final String URL = "jdbc:postgresql://localhost:5432/lexcorp";
	static final String USER = "postgres";
	static final String PASSWORD = "1234567";
		
	public Connection connectMyDb() {
		
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			if (con != null) {
				System.out.println("CONNECTED");
			} else {
				System.out.println("ERROR");
			}
			
		} catch (Exception r) {
			System.out.println(r);
		}
		return con;
		
	}
	
}

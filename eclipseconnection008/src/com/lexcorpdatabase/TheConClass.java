package com.lexcorpdatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class TheConClass {
	
	static final String URL = "jdbc:postgresql://localhost:5432/lexcorp";
	static final String USER = "postgres";
	static final String PASS = "1234567";
	
	public Connection methodCon () {
		
		Connection objConnection = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			objConnection = DriverManager.getConnection(URL, USER, PASS);
			
			if (objConnection != null) {
				System.out.println("OK");
			} else {
				System.out.println("NOT OK");
			}
			
		} catch (Exception v) {
			System.out.println(v);
		}
		
		return objConnection;
		
	}
	
}

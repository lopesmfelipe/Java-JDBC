package com.myDb;

import java.sql.Connection;
import java.sql.DriverManager;

public class TheConnectionClass {
	
	static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	static final String USER = "postgres";
	static final String PASS = "1234567";
	
	public Connection connetaMyDb() {
		Connection conne = null;
		try {
			Class.forName("org.postgresql.Driver");
			conne = DriverManager.getConnection(URL, USER, PASS);
			if (conne != null) {
				System.out.println("CONNECTEEEEEEED BABYYY!!!");
			} else {
				System.out.println("NOT CONNECTED..");
			}
			
		} catch (Exception w) {
			System.out.println(w);
		}
		return conne;
		
	}
}

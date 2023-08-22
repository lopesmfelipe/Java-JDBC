package com.thedeliverdb;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyClassToConnect {
	
	static final String URL = "jdbc:postgresql://localhost:5432/thedeliver";
	static final String USER = "postgres";
	static final String PASSW = "1234567";
	
	 public Connection conneMethod () {
		 
		 Connection conObject = null;
		 
		 try {
			 Class.forName("org.postgresql.Driver");
			 conObject = DriverManager.getConnection(URL, USER, PASSW);
			 
			 if (conObject != null) {
				 System.out.println("YES");
			 } else {
				 System.out.println("NO");
			 }
			 
		 } catch (Exception s) {
			 System.out.println(s);
		 }
		 
		 return conObject;
		 
	 }
	
	
}

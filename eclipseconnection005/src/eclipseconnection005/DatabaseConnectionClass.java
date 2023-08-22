package eclipseconnection005;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectionClass {
	
	static final String URL = "jdbc:postgresql://localhost:5432/thedeliver";
	static final String USER = "postgres";
	static final String PASS = "1234567";
	
	public Connection toConnect () {
		
		Connection theConne = null;
		
		try {
			
			Class.forName("org.postgresql.Driver");
			theConne = DriverManager.getConnection(URL, USER, PASS);
			if (theConne != null) {
				System.out.println("GREAT");
			} else {
				System.out.println("BAD");
			}
			
		} catch (Exception q) {
			System.out.println(q);
		}
		
		return theConne;
		
	}
	
}

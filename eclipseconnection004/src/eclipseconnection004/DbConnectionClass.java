package eclipseconnection004;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionClass {
	
	static final String URL = "jdbc:postgresql://localhost:5432/lexcorp";
	static final String USER = "postgres";
	static final String PASSWORD = "1234567";
	
	public Connection connectToMyDb () {
		Connection objectConnec = null;
		try {
			Class.forName("org.postgresql.Driver");
			objectConnec = DriverManager.getConnection(URL, USER, PASSWORD);
			if (objectConnec != null) {
				System.out.println("SUCCESS");
			} else {
				System.out.println("FAILURE");
			}
			
		} catch (Exception h) {
			System.out.println(h);
		}
		return objectConnec;
		
	}
	
}

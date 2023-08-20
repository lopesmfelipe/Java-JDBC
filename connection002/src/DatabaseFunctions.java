import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseFunctions {

    public Connection coneta(String dbName, String user, String pass) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName,user,pass);
            if (conn != null) {
                System.out.println("Connection Established");
            } else {
                System.out.println("Failed connection");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;

    }

}

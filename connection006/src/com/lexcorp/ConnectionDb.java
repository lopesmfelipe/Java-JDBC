package com.lexcorp;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDb {

    public static String URL = "jdbc:postgresql://localhost:5432/postgres";
    public static String USER = "postgres";
    public static String PASSWORD = "1234567";

    public Connection dbConnection() {
        Connection cone = null;

        try {
            Class.forName("org.postgresql.Driver");
            cone = DriverManager.getConnection(URL, USER, PASSWORD);
            if (cone != null) {
                System.out.println("Connection Created.");
            } else {
                System.out.println("Failed to load connection.");
            }
        } catch (Exception a) {
            System.out.println(a);
        }
        return cone;



    }


}

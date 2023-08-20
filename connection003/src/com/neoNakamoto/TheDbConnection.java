package com.neoNakamoto;

import java.sql.Connection;
import java.sql.DriverManager;

public class TheDbConnection {

    public Connection coneta() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lexcorp", "postgres", "1234567");
            if (conn != null) {
                System.out.println("I did it");
            } else {
                System.out.println("I didn't it..");
            }

        } catch (Exception x) {
            System.out.println(x);
        }
        return conn;

    }

}

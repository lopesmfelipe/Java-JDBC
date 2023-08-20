package com.lexcorp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public Connection conneDB(String nomeBanco,String user, String password) {
        Connection cn = null;
        try {
            Class.forName("org.postgresql.Driver"); // name of database driver
            cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+nomeBanco,user,password);
            if (cn != null) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILURE");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return cn;

    }


}


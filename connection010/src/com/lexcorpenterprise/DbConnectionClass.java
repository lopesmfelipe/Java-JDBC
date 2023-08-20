package com.lexcorpenterprise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLOutput;

public class DbConnectionClass {

    public Connection connectToDb(String dbName, String user, String password) {
        Connection conneObject = null;
        try {
            Class.forName("org.postgresql.Driver");
            conneObject = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName,user,password);
            if (conneObject != null) {
                System.out.println("CONNECTION ESTABLISHED!");
            } else {
                System.out.println("CONNECTION FAILED");
            }

        } catch (Exception b) {
            System.out.println(b);
        }
        return conneObject;

    }


}

package com.postgresqlDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClassConnection {

    public Connection conToDb(String dbName, String user, String thePassword) {
        Connection connet = null;

        try {
            Class.forName("org.postgresql.Driver");
            connet = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName,user,thePassword);
            if (connet != null){
                System.out.println("The connection was established");
            } else {
                System.out.println("The connection wasn't established");
            }

        } catch (Exception y) {
            System.out.println(y);
        }
        return connet;

    }

}

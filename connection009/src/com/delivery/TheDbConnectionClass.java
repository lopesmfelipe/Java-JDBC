package com.delivery;

import java.sql.Connection;
import java.sql.DriverManager;

public class TheDbConnectionClass {

    public Connection connectDb(String dbName, String user, String password) {
        Connection objectConnection = null;
        try {
            Class.forName("org.postgresql.Driver");
            objectConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName,user,password);
            if (objectConnection != null) {
                System.out.println("OOH YEAH!");
            } else {
                System.out.println("OOH NOO!");
            }

        } catch (Exception j) {
            System.out.println(j);
        }
        return objectConnection;



    }

}

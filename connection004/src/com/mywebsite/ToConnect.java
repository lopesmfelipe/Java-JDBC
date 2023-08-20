package com.mywebsite;

import java.sql.Connection;
import java.sql.DriverManager;

public class ToConnect {

    public Connection conetarkk(String theDatabaseName, String userio, String password) {
        Connection conne = null;
        try {
            Class.forName("org.postgresql.Driver");
            conne = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+theDatabaseName,userio,password);
            if (conne != null) {
                System.out.println("The connection was created");
            } else {
                System.out.println("The connection wasn't created");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return conne;
    }

}

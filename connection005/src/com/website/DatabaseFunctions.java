package com.website;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseFunctions {

        static final String URL = "jdbc:postgresql://localhost:5432/postgres";
        static final String USER = "postgres";
        static final String PASS = "1234567";

        public Connection connectionMethod() {
            Connection co = null;
            try {
                Class.forName("org.postgresql.Driver");
                co = DriverManager.getConnection(URL,USER,PASS);
                if (co != null) {
                    System.out.println("Connection Es   tablished");
                } else {
                    System.out.println("ERROR");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            return co;

        }


    }

package org.example;


import java.sql.*;

public class Main {
    public static void main(String[] args) {

            try {
                Connection connectation = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lexcorp",
                        "postgres","1234567");
                if (connectation != null) {
                    System.out.println("Connectation created");
                } else {
                    System.out.println("ERROR");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }

    }

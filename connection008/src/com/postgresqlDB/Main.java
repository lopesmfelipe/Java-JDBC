package com.postgresqlDB;

public class Main {
    public static void main(String[] args) {
        ClassConnection myConnObject = new ClassConnection();
        myConnObject.conToDb("postgres","postgres","1234567");
    }

}
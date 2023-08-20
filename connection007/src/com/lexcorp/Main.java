package com.lexcorp;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection dbConnectionObject = new DatabaseConnection();
        dbConnectionObject.conneDB("lexcorp","postgres","1234567");
    }
}
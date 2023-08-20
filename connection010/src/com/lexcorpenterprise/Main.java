package com.lexcorpenterprise;

public class Main {
    public static void main(String[] args) {
        DbConnectionClass connectionClassObject = new DbConnectionClass();
        connectionClassObject.connectToDb("lexcorp","postgres","1234567");
    }

}
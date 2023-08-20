package com.delivery;

public class Main {
    public static void main(String[] args) {
        TheDbConnectionClass myConnectation = new TheDbConnectionClass();
        myConnectation.connectDb("thedeliver","postgres","1234567");
    }
}
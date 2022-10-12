package com.base.DesignPatterns.ProxyDesignPattern.InternetAccess;

public class Main {
    public static void main(String[] args) {
        OfficeInternetAccess o = new ProxyInternetAccess("Saman");
        o.grantInternetAccess();
    }
}

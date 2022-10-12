package com.base.DesignPatterns.ProxyDesignPattern.GrantLight;


public class MainClass {
    public static void main(String[] args) {
//        Ihome o1 = new CustomerOnProxy(11);
//        o1.garntOnlight();


        Ihome o2=new Customer1();
        o2.garntOnlight();
    }
}

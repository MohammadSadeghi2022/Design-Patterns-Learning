package com.base.DesignPatterns.ProxyDesignPattern.GrantLight;

public class Customer1 implements Ihome{
    @Override
    public void garntOnlight() {
       System.out.println("you have access to on/off this light");
    }
}

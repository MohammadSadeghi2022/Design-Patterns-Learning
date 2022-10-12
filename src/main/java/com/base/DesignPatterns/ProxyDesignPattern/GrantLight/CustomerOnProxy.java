package com.base.DesignPatterns.ProxyDesignPattern.GrantLight;

public class CustomerOnProxy implements Ihome{
    private Integer code;

    public CustomerOnProxy(Integer code) {
        this.code = code;
    }

    @Override
    public void garntOnlight() {
        if(code==10){
            System.out.println("you can On/Off");
        }
        else {
            System.out.println("you can't On/Off light");
        }
    }
}

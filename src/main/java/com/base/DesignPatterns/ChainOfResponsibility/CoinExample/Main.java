package com.base.DesignPatterns.ChainOfResponsibility.CoinExample;

public class Main {
    public static void main(String[] args) {


        Handler s1=new Step1();
        Handler s2=new Step2();
        s1.setSuccessor(s2);


        s1.answerRequest(30);

    }
}

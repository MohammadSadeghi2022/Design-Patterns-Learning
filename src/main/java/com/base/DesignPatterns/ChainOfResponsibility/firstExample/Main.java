package com.base.DesignPatterns.ChainOfResponsibility.firstExample;

public class Main {
    public static void main(String[] args) {
        Chain add=new ClassAddNumbers();
        Chain sub=new ClassSubNumers();
        Chain div=new ClassDivNumbers();
        Chain mult=new ClassMulNumber();

        add.setNextChain(sub);
        sub.setNextChain(div);
        div.setNextChain(mult);

        add.calculate(new Numbers(10,5,"l"));
    }
}

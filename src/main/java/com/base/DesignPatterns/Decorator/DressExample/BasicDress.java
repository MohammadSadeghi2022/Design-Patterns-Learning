package com.base.DesignPatterns.Decorator.DressExample;

public class BasicDress implements Dress {
    @Override
    public void assemble() {
        System.out.println("Basic Dress");
    }
}

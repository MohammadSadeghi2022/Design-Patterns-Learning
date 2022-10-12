package com.base.DesignPatterns.Facade;

public class Main {
    public static void main(String[] args) {
        Facade Issue = new Facade();
        int i = Issue.finalCalculation();
        System.out.println(i);
    }
}

package com.base.DesignPatterns.Facade;

public class BasePremiumCalculation implements Calculation {

    @Override
    public int calculate() {
        return 100;
    }
}
